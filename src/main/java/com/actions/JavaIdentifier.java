package com.actions;

/**
 * Class that represents a java identifier, that extends {@link JavaAction} to just display the expression.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaIdentifier extends JavaAction {
	
	/**
	 * The expression variable.
	 */
	private String identifierName;

	/**
	 * Constructor to accept the raw input and become a java action.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaIdentifier(String rawInput, String identifierName) {
		super(rawInput, ActionType.IDENTIFIER);
		
		// Set the identifier name.
		this.identifierName = identifierName;
	}
	
	/**
	 * Method to get the identifier name.
	 * 
	 * @return String -- the identifier name.
	 */
	public String getIdentifierName() {
		return this.identifierName;
	}
	
	@Override
	public String getEvaluation(boolean returnSomething) {
		return "\"" + getIdentifierName() + " = \" + " + getIdentifierName();
	}
}