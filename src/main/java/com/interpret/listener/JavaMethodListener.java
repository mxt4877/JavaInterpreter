package com.interpret.listener;

import com.actions.JavaAction;
import com.actions.JavaMethod;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Parser.MethodDeclaratorContext;

/**
 * Class that extends {@link Java8BaseListener} and parses and understands input as defined by the Java8 grammar.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaMethodListener extends Java8BaseListener {
	
	/**
	 * The actual input.
	 */
	private String rawInput;

	/**
	 * The method name.
	 */
	private String methodName;
	
	/**
	 * Constructor to pass in the actual raw input.
	 * 
	 * @param rawInput -- directly what the user entered.
	 */
	public JavaMethodListener(String rawInput) {
		this.rawInput = rawInput;
	}
	
	/**
	 * Method to get the list of java actions created as a result of this parsing.
	 * 
	 * @return List of {@link JavaAction}.
	 */
	public JavaAction getJavaAction() {
		return new JavaMethod(rawInput, methodName);
	}
	
	@Override
	public void enterMethodDeclarator(MethodDeclaratorContext methodDeclaratorContext) { 
		this.methodName = methodDeclaratorContext.Identifier().getText();
	}
}
