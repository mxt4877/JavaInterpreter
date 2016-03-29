package com.compiler;

/**
 * Enum that represents known compile errors and how to handle them.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public enum KnownCompilerError {
	
	/**
	 * Void cannot be converted to object! This happens when we try to return a void method call.
	 */
	VOID_NOT_ALLOWED_HERE("'void' type not allowed here");
	
	/**
	 * The compiler message.
	 */
	private String compilerMessage;
	
	/** 
	 * The constructor to pass in the known compiler message.
	 * 
	 * @param compilerMessage -- the known compiler message.
	 */
	private KnownCompilerError(String compilerMessage) {
		this.compilerMessage = compilerMessage;
	}

	/**
	 * Method to get the compiler message.
	 * 
	 * @return String -- the compiler message.
	 */
	public String getCompilerMessage() {
		return compilerMessage;
	}
}
