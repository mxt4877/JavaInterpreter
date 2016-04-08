package com.interpret;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.actions.JavaAction;
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
	 * Constant for start brace.
	 */
	private static final String START_BRACE = "{";
	
	/**
	 * Constant for end brace.
	 */
	private static final String END_BRACE = "}";
	
	/**
	 * Constant for start paren.
	 */
	private static final String START_PAREN = "(";
	
	/**
	 * Constant for end paren.
	 */
	private static final String END_PAREN = ")";
	
	/**
	 * The list of matchable symbols.
	 */
	private static final List<String> SYMBOLS = new ArrayList<String>() {{ add(START_BRACE); add(END_BRACE); add(START_PAREN); add(END_PAREN); }};
	
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
        
        // Track the input.
        StringBuilder inputBuilder = new StringBuilder();
        
        // Use a stack to track parens and braces.
        Stack<String> parensAndBraces = new Stack<String>();
        
        // Valid input?
        boolean validInput = true;
        
        // Keep accepting input.
        while(keepGoing) {
        	
        	// Grab the next input here.
        	String nextInput = theScanner.nextLine();
        	
        	// Don't do anything if it's not null.
        	if(nextInput != null && ! nextInput.trim().isEmpty()) {
        		
        		// Parse through the string, one character at a time searching for open/close parens and braces.
        		for(int charIndex = 0; charIndex < nextInput.length(); charIndex++) {
        			
        			// Grab this character.
        			String thisChar = String.valueOf(nextInput.charAt(charIndex));
        			
        			// Does it have a symbol we care about?
        			if(SYMBOLS.contains(thisChar)) {
        				
        				// Switch on it.
        				switch(thisChar) {
        				
	        				case START_BRACE: {
	        					parensAndBraces.push(START_BRACE);
	        					break;
	        				}
        				
	        				case END_BRACE: {
	        					
	        					// If we have something other than an end brace, something is wrong.
	        					if(parensAndBraces.isEmpty() || !START_BRACE.equals(parensAndBraces.peek())) {
	        						validInput = false;
	        					}
	        					
	        					// Otherwise we are good, pop the brace off.
	        					else {
		        					parensAndBraces.pop();
	        					}
	        					
	        					break;
	        				}
	        				
	        				case START_PAREN: {
	        					parensAndBraces.push(START_PAREN);
	        					break;
	        				}
	        				
	        				case END_PAREN: {
	        					
	        					// If we have something other than an end brace, something is wrong.
	        					if(parensAndBraces.isEmpty() || !START_PAREN.equals(parensAndBraces.peek())) {
	        						validInput = false;
	        					}
	        					
	        					// Otherwise we are good, pop the brace off.
	        					else {
		        					parensAndBraces.pop();
	        					}
	        					
	        					break;
	        				}
        				}
        			}
        		}

        		// Always add on the input here.
    			inputBuilder.append(nextInput);
        		
        		JavaAction newlyCreatedAction = null;
        		
        		// We might be in the middle of a statement. If we are, go do it again.
        		if(!parensAndBraces.isEmpty()) {
        			
        			// Keep going if we've got valid input. Otherwise, we need to let it die out.
        			if(validInput) {
        				continue;
        			}
        		}
        		
        		// Otherwise, evaluate this statement.
        		else {
	        		if(validInput) {
	        			newlyCreatedAction = parseInput(inputBuilder.toString());
	        		}
        		}
        	
        		// If we've made it this far, parse the input.
        		try {
        			
        			// Tell the user we don't understand the input.
    	        	if(newlyCreatedAction == null) {
    	        		System.err.println("This is an unrecognized statement, continuing on.");
    	        	}

    	        	// Get what the result was.
    	        	else {
    	        		compileAndEvaluateJavaAction(newlyCreatedAction);
    	        	}
        		}
        		
        		// Eat any exception here (for now -- need to determine what to do).
        		catch(Exception e) {
        			System.err.println("Statement encountered failure : " + e);
        			
        			// Print out the underlying error too.
        			if(e.getCause() != null) {
        				System.err.println("   " + e.getCause().getMessage());
        			}
        		}

	        	// Reset the variables, each time we try to evaluate.
        		finally {
    	        	validInput = true;
    	        	inputBuilder = new StringBuilder();
        		}
        	}
        }
	}
	
	/**
	 * Method to parse the input.
	 * 
	 * @param nextInput -- raw string value.
	 * @return {@link JavaAction} -- the resulting java action.
	 */
	private JavaAction parseInput(String nextInput) {
		
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
    	return listener.getNewAction();
	}
	
	/**
	 * Method to compile the action and evaluate what happened with it.
	 * 
	 * @param createdAction
	 * @throws Exception
	 */
	private void compileAndEvaluateJavaAction(JavaAction createdAction) throws Exception {
		
		// Compile it, we'll get the new version of the InterpreterSuperClass by doing this, with updated methods and values.
    	InterpreterSuperClass superClass = JavaInterpreterCompiler.getInstance().compile(createdAction, true);
    	
    	// The class will be null if the compile failed.
    	if(superClass != null) {
    		System.out.println(superClass.evaluate());
    	}
	}
}
