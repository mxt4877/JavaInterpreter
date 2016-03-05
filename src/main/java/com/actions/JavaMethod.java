package com.actions;

/**
 * Class that represents a java method, that extends {@link JavaAction} to keep track of and house methods that the user
 * may have entered.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaMethod extends JavaAction {
	
	/**
	 * The method name.
	 */
	private String methodName;

	/**
	 * Constructor to create this object, passing in the raw input that calls to the superclass to register
	 * this as a method.
	 * 
	 * @param rawInput -- the raw code.
	 */
	public JavaMethod(String rawInput, String methodName) {
		super(rawInput, ActionType.METHOD);
		
		// Set the method name!
		this.methodName = methodName;
	}
	
	/**
	 * Getter for the method name.
	 * 
	 * @return String -- the method name.
	 */
	public String getMethodName() {
		return methodName;
	}
}
