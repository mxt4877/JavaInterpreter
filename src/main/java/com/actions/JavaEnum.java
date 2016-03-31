package com.actions;

/**
 * Class that represents a java class, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaEnum extends JavaAction {
	
	/**
	 * The class name.
	 */
	private String enumName;

	/**
	 * Constructor to make a class.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaEnum(String rawInput, String enumName) {
		super(rawInput, ActionType.ENUM);
		
		// Set the class name.
		this.enumName = enumName;
	}
	
	/**
	 * Getter for the method name.
	 * 
	 * @return String -- the method name.
	 */
	public String getEnumName() {
		return this.enumName;
	}
	
	@Override
	public String getName() {
		return getEnumName();
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> Successfully created enum " + getEnumName() + ".\"";
	}
}
