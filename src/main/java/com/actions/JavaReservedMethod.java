package com.actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a java identifier, that extends {@link JavaAction} to invoke a certain method.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaReservedMethod extends JavaAction {
	
	/**
	 * The list of reserved method names.
	 */
	public static final List<String> theMethods = new ArrayList<String>();
	
	/**
	 * Enum for reserved method names.
	 *
	 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
	 */
	public enum ReservedMethods {
		
		/**
		 * The save operation.
		 */
		SAVE("save", ""),
		
		/**
		 * The load operation.
		 */
		LOAD("load", "The load operation failed."),
		
		/**
		 * The uncatch method.
		 */
		UNCATCH("uncatch", "This exception could not be uncaught -- it may have already been uncaught. This is not a failure, but an informational message."),
		
		/**
		 * The clear saves method.
		 */
		CLEAR_SAVES("clearSaves", "Saves could not be removed."),
		
		/**
		 * The unimport method.
		 */
		UNIMPORT("unimport", "The import could not be unimported -- it may have already been unimported. This is not a failure, but an informational message."),
		
		/**
		 * The exit method.
		 */
		EXIT("exit", "");
		
		/**
		 * The method name.
		 */
		private String methodName;
		
		/**
		 * The failure message.
		 */
		private String failureMessage;
		
		/**
		 * The constructor to set the method name.
		 * 
		 * @param methodName -- the method name.
		 */
		private ReservedMethods(String methodName, String failureMessage) {
			this.methodName = methodName;
			this.failureMessage = failureMessage;
			theMethods.add(this.methodName);
		}
		
		/**
		 * Method to return the actual methods we care about.
		 * 
		 * @return List -- the list of reserved methods.
		 */
		public static List<String> getMethods() {
			return theMethods;
		}
		
		/**
		 * Method to get the method name.
		 * 
		 * @return String -- the reserved method name.
		 */
		public String getMethodName() {
			return this.methodName;
		}
		
		/**
		 * Method to get the failure message.
		 * 
		 * @return String -- the failure message.
		 */
		public String getFailureMessage() {
			return this.failureMessage;
		}
	}
	
	/**
	 * The action we need to spit to the console.
	 */
	private ReservedMethods method;
	
	/**
	 * Was it sucessful?
	 */
	private boolean success = true;

	/**
	 * Constructor to do nothing but specify that it's a reserved method.
	 */
	public JavaReservedMethod(ReservedMethods method, boolean success) {
		super("", ActionType.RESERVED_METHOD);
		this.method = method;
		this.success = success;
	}
	
	/**
	 * Method to get the reserved method.
	 * 
	 * @return ReservedMethods -- the reserved method.
	 */
	public ReservedMethods getMethod() {
		return this.method;
	}

	@Override
	public String getEvaluation() {
		String returnValue = "\"\t\tResult returned: --> " + this.method.getMethodName().toUpperCase() + " complete!\"";
		
		if(!success) {
			returnValue = "\"\t\tResult returned: --> " + this.method.getFailureMessage() + "\"";
		}
		
		return returnValue;
	}
}
