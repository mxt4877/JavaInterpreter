package com.interpret;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.actions.JavaAction;
import com.actions.JavaField;
import com.actions.JavaMethod;
import com.antlr.Java8Lexer;
import com.antlr.Java8Parser;
import com.interpret.listener.JavaInterpreterBaseListener;
import com.javasource.InterpreterSuperClass;

/**
 * Class that is the main class to invoke when running the java interpreter.
 * 
 * @author <a href="mailto:mxt4877@g.rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreter {
	
	/**
	 * Main hookpoint for the interpreter.
	 * 
	 * @param args -- system arguments if there are any.
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
        new JavaInterpreter().go();
	}
	
	/**
	 * Main method called from {@link #main(String[])} to start processing.
	 * 
	 * <br><br>
	 * 
	 * <b>Note:</b> Generation of antlr code: http://stackoverflow.com/questions/21534316/is-there-a-simple-example-of-using-antlr4-to-create-an-ast-from-java-source-code
	 * 
	 * @throws Exception
	 */
	public void go() throws Exception {
		
		// Initialize the scanner.
        Scanner theScanner = new Scanner(System.in);
        
        // Keep going forever...
        boolean keepGoing = true;
        
        // Keep accepting input.
        while(keepGoing) {
        	
        	// Grab the next input here.
        	String nextInput = theScanner.nextLine();
        	
        	// Don't do anything if it's not null.
        	if(nextInput != null && ! nextInput.trim().isEmpty()) {
        	
	        	// Put it into a lexer.
	        	Java8Lexer java8Lexer = new Java8Lexer(new ANTLRInputStream(nextInput));
	        	
	        	// Generate the token stream from that lexer.
	        	CommonTokenStream tokenStream = new CommonTokenStream(java8Lexer);
	        	
	        	// Now use the parser
	        	Java8Parser parser = new Java8Parser(tokenStream);
	        	
	        	// Make the parser and lexer be quiet.
	        	parser.removeErrorListeners();
	        	java8Lexer.removeErrorListeners();
	        	
	        	// Walk the tree.
	        	ParseTreeWalker walker = new ParseTreeWalker();
	        	
	        	// The listener.
	        	JavaInterpreterBaseListener listener = new JavaInterpreterBaseListener(nextInput);
	        	
	        	// Walk it!
	        	walker.walk(listener, parser.compilationUnit());
	        	
	        	// Get the newly created action from the listener.
	        	JavaAction newlyCreatedAction = listener.getJavaAction();
	        	
	        	// Tell the user we don't understand the input.
	        	if(newlyCreatedAction == null) {
	        		System.err.println("This is an unrecognized statement, continuing on.");
	        	}

	        	// Get what the result was.
	        	else {
	        		compileAndEvaluateJavaAction(newlyCreatedAction);
	        	}
        	}
        }
	}
	
	/**
	 * Method to compile the action and evaluate what happened with it.
	 * 
	 * @param createdAction
	 * @throws Exception
	 */
	private void compileAndEvaluateJavaAction(JavaAction createdAction) throws Exception {
		
		// Compile it, we'll get the new version of the InterpreterSuperClass by doing this, with updated methods and values.
    	InterpreterSuperClass superClass = JavaInterpreterCompiler.getInstance().compile(createdAction);
    	
    	// If it's a java field, call it!
    	switch(createdAction.getActionType()) {
    	
    		// Evaluate a field.
	    	case FIELD: {
	    		
	    		// Try to call the field.
	    		try {
	    			System.out.println(superClass.callField(((JavaField)createdAction).getFieldName()));
	    		}
	    		
	    		// Ignore this one, since it'll die in the compilation.
	    		catch(NoSuchFieldException e) { ; }
	    		
	    		break;
	    	}
	    
	    	// Evaluate a method.
	    	case METHOD: {
	    		System.out.println(((JavaMethod)createdAction).getMethodName() + " successfully created. ");
	    		
	    		break;
	    	}
    	}
	}
}
