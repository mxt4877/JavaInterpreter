package com.actions;

/**
 * Class that represents a java exception, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaException extends JavaAction {

	/**
	 * The exception name.
	 */
	private String exceptionName;

	/**
	 * Constructor to setup the exception.
	 * 
	 * @param rawInput -- the raw input.
	 * @param exceptionName -- the exception.
	 */
	public JavaException(String rawInput, String exceptionName) {
		super(rawInput, ActionType.EXCEPTION);
		
		// Set the exception name here.
		this.exceptionName = exceptionName;
	}
	
	@Override
	public String getName() {
		return this.exceptionName;
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> Exception " + this.exceptionName + " will be handled for each statement going forward.\"";
	}
}
