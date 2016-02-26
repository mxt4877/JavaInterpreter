package com.interpret;

import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.actions.JavaAction;
import com.antlr.Java8Lexer;
import com.antlr.Java8Parser;
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
        	
        	// Put it into a lexer.
        	Java8Lexer java8Lexer = new Java8Lexer(new ANTLRInputStream(nextInput));
        	
        	// Generate the token stream from that lexer.
        	CommonTokenStream tokenStream = new CommonTokenStream(java8Lexer);
        	
        	// Now use the parser
        	Java8Parser parser = new Java8Parser(tokenStream);
        	
        	// Walk the tree.
        	ParseTreeWalker walker = new ParseTreeWalker();
        	
        	// Create the listener, but be sure we pass along the raw input to it.
        	JavaInterpreterListener listener = new JavaInterpreterListener(nextInput);
        	
        	// PARSE!
        	walker.walk(listener, parser.compilationUnit());
        	
        	// Get what the result was.
        	List<JavaAction> createdActions = listener.getJavaAction();
        	
        	// Compile it!
        	JavaInterpreterCompiler.getInstance().compile(createdActions);
        }
	}
}
