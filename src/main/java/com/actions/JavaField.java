package com.actions;

/**
 * Class that extends {@link JavaAction}, representing a Java field.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaField extends JavaAction {
	
	/**
	 * The field name.
	 */
	private String fieldName;
	
	/**
	 * Constructor that will call the superclass constructor to intialize the raw input and the dependent actions.
	 * 
	 * @param rawInput -- the input.
	 * @param fieldName -- the field name.
	 */
	public JavaField(String rawInput, String fieldName) {
		super(rawInput, ActionType.FIELD);
		
		// Set the field name!
		this.fieldName = fieldName;
	}

	/**
	 * Getter for the field name.
	 * 
	 * @return String -- the field name.
	 */
	public String getFieldName() {
		return fieldName;
	}
	
	@Override
	public String getName() {
		return getFieldName();
	}
	
	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> " + getFieldName() + " = \" + " + getFieldName();
	}
}
