package com.interpret;

import java.util.Collections;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.ToolProvider;

import com.actions.JavaAction;
import com.source.JavaStringSource;

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
	 * @param newActions -- the newly created action(s).
	 */
	public void compile(List<JavaAction> newActions) {
		
		// We'll only have one or more actions in the event we are declaring 2 fields at once. In this instance, we only need to generate the pre-requsite code once too.
		String classTextToCompile = generateStringFromActions(newActions.get(0));
		
		// Generate the source from this class text.
		JavaStringSource source = new JavaStringSource(classTextToCompile);
		
		// Get the task from the compiler.
		CompilationTask task = COMPILER.getTask(null, null, null, null, null, Collections.singletonList(source));
		
		// Call the compiler, and if it works, put it into the maps!
		if(task.call()) {
			JavaInterpreterMaps.getInstance().addFields(newActions);
		}
	}

	/**
	 * Recursive method to get the dependent action raw input to use when compiling. 
	 * 
	 * @param dependentAction -- the dependent action to generate code from.
	 * @return String -- the action code.
	 */
	private String generateStringFromActions(JavaAction dependentAction) {
		StringBuilder rawDependentCode = new StringBuilder();
		
		// Recurse for any nested dependencies that may exist.
		for(JavaAction nestedDependency : dependentAction.getDependentActions()) {
			rawDependentCode.append(generateStringFromActions(nestedDependency));
		}
		
		// Add this one in.
		rawDependentCode.append("\n").append(dependentAction.getRawInput());
		
		// Return the value of what we've built up.
		return rawDependentCode.toString();
	}
}
