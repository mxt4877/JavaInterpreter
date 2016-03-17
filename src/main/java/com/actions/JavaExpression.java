package com.actions;

/**
 * Class that represents a java expression, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaExpression extends JavaAction {
	
	/**
	 * The expression variable.
	 */
	private String expressionVariable;

	/**
	 * Constructor for an expression.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaExpression(String rawInput, String expressionVariable) {
		super(rawInput, ActionType.EXPRESSION);
		
		// Set the expression here.
		this.expressionVariable = expressionVariable;
	}

	/**
	 * Method to get the expression variable.
	 * 
	 * @return String -- the expression variable.
	 */
	public String getExpressionVariable() {
		return expressionVariable;
	}

	@Override
	public String getEvaluation() {
		return "\"" + getExpressionVariable() + " = \" + " + getExpressionVariable();
	}
}
