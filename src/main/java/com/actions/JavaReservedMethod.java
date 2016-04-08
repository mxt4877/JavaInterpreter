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
		SAVE("save"),
		
		/**
		 * The load operation.
		 */
		LOAD("load");
		
		/**
		 * The method name.
		 */
		private String methodName;
		
		/**
		 * The constructor to set the method name.
		 * 
		 * @param methodName -- the method name.
		 */
		private ReservedMethods(String methodName) {
			this.methodName = methodName;
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
	}
	
	/**
	 * The action we need to spit to the console.
	 */
	private ReservedMethods method;

	/**
	 * Constructor to do nothing but specify that it's a reserved method.
	 */
	public JavaReservedMethod(ReservedMethods method) {
		super("", ActionType.RESERVED_METHOD);
		this.method = method;
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
		return "\"\t\tResult returned: --> " + this.method.getMethodName().toUpperCase() + " complete!\"";
	}
}
