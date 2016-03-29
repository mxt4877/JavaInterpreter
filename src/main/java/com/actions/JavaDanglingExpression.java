package com.actions;

/**
 * Class that represents a java dangling expression, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaDanglingExpression extends JavaAction {

	/**
	 * Constructor for a dangling expression.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaDanglingExpression(String rawInput) {
		super(rawInput, ActionType.DANGLING_EXPRESSION);
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> \" + (" + getActualEvaluation() + ")";
	}
	
	@Override
	public String getAlternateEvaluation() {
		return getActualEvaluation();
	}
	
	/**
	 * Method to get the evaluation of this dangling expression.
	 * 
	 * @return String -- the dangling expression.
	 */
	private String getActualEvaluation() {
		int lastSemiColon = getRawInput().lastIndexOf(";");
		return getRawInput().substring(0, lastSemiColon);
	}
}
