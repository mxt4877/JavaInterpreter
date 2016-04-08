package com.actions;

/**
 * Class that represents a java class, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaImport extends JavaAction {

	/**
	 * Constructor for imports.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaImport(String rawInput) {
		super(rawInput, ActionType.IMPORT);
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> Import statement: " + getRawInput() + " successfully generated and will be included henceforth.\"";
	}
}
