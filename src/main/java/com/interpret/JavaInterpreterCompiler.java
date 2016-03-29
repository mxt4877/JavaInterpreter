package com.interpret;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.ToolProvider;

import com.actions.JavaAction;
import com.compiler.JavaInterpreterDiagnosticListener;
import com.javasource.InterpreterSuperClass;
import com.javasource.JavaStringSource;

/**
 * Class to handle the compilation and the putting of newly (syntactically correct) variables into the proper maps.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterCompiler {
	
	/**
	 * The system compiler we will re-use for each of the statements provided.
	 */
	private static final JavaCompiler COMPILER = ToolProvider.getSystemJavaCompiler();
	
	/**
	 * The instance.
	 */
	private static final JavaInterpreterCompiler INSTANCE = new JavaInterpreterCompiler();
	
	/**
	 * No-op private constructor.
	 */
	private JavaInterpreterCompiler() {
		;
	}
	
	/**
	 * Get the singleton instance.
	 * 
	 * @return JavaInterpreterCompiler -- the instance.
	 */
	public static JavaInterpreterCompiler getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Method to compile the new action(s)!
	 * 
	 * @param InterpreterSuperClass -- the newly created class with the actions baked in.
	 * @throws MalformedURLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public InterpreterSuperClass compile(JavaAction newAction, boolean expectReturn) throws MalformedURLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		// These are the statements that will need to be declared globally.
		String globalClassStatements = generateGlobalCodeFromDependencies(newAction, new LinkedList<JavaAction>());
		
		// These are the statements that will need to be declared and 
		String localClassStatements = generateLocalCodeFromDependencies(newAction, newAction, new LinkedList<JavaAction>(), expectReturn);
		
		// Make sure we return something if we need to.
		if(localClassStatements == null || localClassStatements.isEmpty()) {
			localClassStatements = "return \"UNEXPECTED RESULT!\";";
		}
		
		// Here, we need to figure out local context as well.
		JavaStringSource source = InterpreterSuperClass.generateClass(globalClassStatements, localClassStatements);
		
		// The diagnostic.
		JavaInterpreterDiagnosticListener diagListener = new JavaInterpreterDiagnosticListener();
		
		// Get the task from the compiler.
		CompilationTask task = COMPILER.getTask(null, null, diagListener, null, null, Collections.singletonList(source));
		
		// Call the compiler, and if it works, put it into the maps!
		if(task.call()) {
			
			// If we are successful, put it into the map.
			JavaInterpreterMaps.getInstance().putEntry(newAction);
			
			// Load up the class again with this class loader.
			URLClassLoader classLoader = new URLClassLoader(new URL[]{new File(".").toURI().toURL()}, this.getClass().getClassLoader());
			
			// Return an instance of this class.
			return (InterpreterSuperClass) classLoader.loadClass("CompileClass").newInstance();
		}
		
		// Otherwise return nothing.
		else {

			// We need to try and recompile in the event we have a void cannot be converted error.
			if(diagListener.shouldTryRecompile() && expectReturn) {
				return compile(newAction, false);
			}
			
			// This time, just print the compile errors.
			else {
				diagListener.printErrors();
			}
			
			return null;
		}
	}

	/**
	 * Recursive method to get the dependent action raw input to use when compiling for GLOBAL code.
	 * 
	 * @param dependentAction -- the dependent action to generate code from.
	 * @param alreadyProcessedDependents -- the already processed dependencies.
	 * @return String -- the action code.
	 */
	private String generateGlobalCodeFromDependencies(JavaAction dependentAction, List<JavaAction> alreadyProcessedDependents) {
		
		// Build up the dependent code.
		StringBuilder rawDependentCode = new StringBuilder();
		
		// Recurse for any nested dependencies that may exist.
		for(JavaAction nestedDependency : dependentAction.getDependentActions()) {
			
			// Make sure we only do this once. Bypass any we might've already processed. This is the case where we may have a list like...
			//		add(t1), add(t2), add(t3);
			// In the case where t3 has a dependency on t1, we would have t1 declared and gathered twice, causing a compile error.
			if(!alreadyProcessedDependents.contains(nestedDependency)) {
				rawDependentCode.append(generateGlobalCodeFromDependencies(nestedDependency, alreadyProcessedDependents));
				alreadyProcessedDependents.add(nestedDependency);
			}
		}
		
		// Add this one in if it's global -- should be declared at the class level.
		if(InterpreterUtils.isGlobal(dependentAction)) {
			rawDependentCode.append("\n").append(dependentAction.getRawInput());
		}
		
		// Return the value of what we've built up.
		return rawDependentCode.toString();
	}
	
	/**
	 * Recursive method to get the dependent action raw input to use when compiling for LOCAL code -- at the method level!
	 * 
	 * @param initialAction -- the initial action to generate code from.
	 * @param dependentAction -- the dependent action to generate code from.
	 * @param alreadyProcessedDependents -- the already processed dependencies.
	 * @param expectReturn -- are we expecting to put a return in?
	 * @return String -- the action code.
	 */
	private String generateLocalCodeFromDependencies(JavaAction initialAction, JavaAction dependentAction, List<JavaAction> alreadyProcessedDependents, boolean expectReturn) {
		
		// Build up the dependent code.
		StringBuilder rawDependentCode = new StringBuilder();
		
		// Recurse for any nested dependencies that may exist.
		for(JavaAction nestedDependency : dependentAction.getDependentActions()) {
			
			// Make sure we only do this once. Bypass any we might've already processed. This is the case where we may have a list like...
			//		add(t1), add(t2), add(t3);
			// In the case where t3 has a dependency on t1, we would have t1 declared and gathered twice, causing a compile error.
			if(!alreadyProcessedDependents.contains(nestedDependency)) {
				rawDependentCode.append(generateLocalCodeFromDependencies(initialAction, nestedDependency, alreadyProcessedDependents, expectReturn));
				alreadyProcessedDependents.add(nestedDependency);
			}
		}
		
		// If it's both local and NOT an identifier, then do append on the raw input.
		if(InterpreterUtils.isLocal(dependentAction) && !InterpreterUtils.isIdentifier(dependentAction)) {
			rawDependentCode.append("\n").append(dependentAction.getRawInput());
		}
		
		// If we made it back around to the beginning of the recursion, add on what we need to return.
		if(initialAction == dependentAction) {
			
			// The ultimate return value.
			String returnValue = "return " + dependentAction.getEvaluation();
			
			// No return? It was a void statement, so print out that there's no real result.
			if(!expectReturn) {
				rawDependentCode.append("\n").append(dependentAction.getAlternateEvaluation()).append(";");
				returnValue = "return \"\t\tResult returned: --> Return type of statement was void. Values or expressions may have been printed to the console.\"";
			}

			// If it's a loop, 
			else if(InterpreterUtils.isLoopOrIf(initialAction)) {
				rawDependentCode.append(dependentAction.getRawInput());
			}
			
			// Append on what we built up.
			rawDependentCode.append("\n").append(returnValue + ";");
		}
		
		// Return the value of what we've built up.
		return rawDependentCode.toString();
	}
}
