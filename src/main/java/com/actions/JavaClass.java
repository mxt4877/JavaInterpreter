package com.actions;

import com.actions.ActionType;
import com.actions.JavaAction;

/**
 * Class that represents a java class, that extends {@link JavaAction}.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaClass extends JavaAction {
	
	/**
	 * The class name.
	 */
	private String className;

	/**
	 * Constructor to make a class.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaClass(String rawInput, String className) {
		super(rawInput, ActionType.CLASS);
		
		// Set the class name.
		this.className = className;
	}
	
	/**
	 * Getter for the method name.
	 * 
	 * @return String -- the method name.
	 */
	public String getClassName() {
		return this.className;
	}
	
	@Override
	public String getName() {
		return getClassName();
	}

	@Override
	public String getEvaluation() {
		return "\"\t\tResult returned: --> Successfully created class " + getClassName() + ".\"";
	}
}
