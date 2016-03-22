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
		int lastSemiColon = getRawInput().lastIndexOf(";");
		return getRawInput().substring(0, lastSemiColon);
	}
}
