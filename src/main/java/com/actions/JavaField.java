package com.actions;

import java.util.Set;

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
	 * @param dependentActions -- the actions that are needed to be resolved to make this field work.
	 */
	public JavaField(String rawInput, String fieldName, Set<JavaAction> dependentActions) {
		super(dependentActions, rawInput);
		
		// Set the field name!
		this.fieldName = fieldName;
	}

	/**
	 * Getter.
	 * 
	 * @return String -- the field name.
	 */
	public String getFieldName() {
		return fieldName;
	}
}
