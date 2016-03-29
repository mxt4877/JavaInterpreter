package com.actions;

/**
 * Class that represents a java loop, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaLoopOrIfStatement extends JavaAction {
	
	/**
	 * The constructor.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaLoopOrIfStatement(String rawInput) {
		super(rawInput, ActionType.LOOP_OR_IF);
	}

	@Override
	public String getEvaluation() {
		return "\"\"";
	}
}
