package com.actions;

/**
 * Class that represents a java identifier, that extends {@link JavaAction} to just display the expression.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaIdentifier extends JavaAction {

	/**
	 * Constructor to accept the raw input and become a java action.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaIdentifier(String rawInput) {
		super(rawInput, ActionType.IDENTIFIER);
	}
}