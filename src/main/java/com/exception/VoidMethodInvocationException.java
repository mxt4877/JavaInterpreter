package com.exception;

/**
 * Exception that extends {@link Exception} that represents
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class VoidMethodInvocationException extends Exception {

	/**
	 * Constructor that will throw an underlying exception with a specific message.
	 */
	public VoidMethodInvocationException() {
		super("This method should not be invoked.");
	}
}
