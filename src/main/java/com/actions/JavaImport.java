package com.actions;

/**
 * Class that represents a java import, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaImport extends JavaAction {
	
	/**
	 * The import name.
	 */
	private String importName;

	/**
	 * Constructor for imports.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaImport(String rawInput) {
		super(rawInput, ActionType.IMPORT);
		
		// Get the import name.
		this.importName = rawInput.substring(rawInput.indexOf("import") + 7).replace(";", "");
	}
	
	@Override
	public String getName() {
		return this.importName;
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> Import statement: " + getRawInput() + " successfully generated and will be included henceforth.\"";
	}
}
