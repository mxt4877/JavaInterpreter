package com.interpret;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.actions.ActionType;
import com.actions.JavaAction;
import com.actions.JavaField;
import com.actions.JavaMethod;

/**
 * Class to house all of the varying maps that will contain fields, classes, methods, etc.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterMaps {
	
	/**
	 * Map of variables.
	 */
	private Map<String, JavaAction> fields = new LinkedHashMap<String, JavaAction>();
	
	/**
	 * Map of methods.
	 */
	private Map<String, JavaAction> methods = new LinkedHashMap<String, JavaAction>();
	
	/**
	 * Map of expressions.
	 */
	private Map<String, List<JavaAction>> expressions = new LinkedHashMap<String, List<JavaAction>>();
	
	/**
	 * Map of classes.
	 */
	private Map<String, JavaAction> classes = new LinkedHashMap<String, JavaAction>();
	
	/**
	 * Map of enums.
	 */
	private Map<String, JavaAction> enums = new LinkedHashMap<String, JavaAction>();
	
	/**
	 * Singleton instance.
	 */
	private static final JavaInterpreterMaps INSTANCE = new JavaInterpreterMaps();
	
	/**
	 * Private no-op constructor for singleton.
	 */
	private JavaInterpreterMaps() {
		;
	}

	/**
	 * Method to get the instance.
	 * 
	 * @return JavaInterpreterMaps -- the instance.
	 */
	public static JavaInterpreterMaps getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Method to put a {@link JavaAction} into a proper map based on the action type.
	 * 
	 * @param javaAction -- the action type.
	 */
	public void putEntry(JavaAction javaAction) {
		
		// Switch on the entry type to know what to do with it.
		switch(javaAction.getActionType()) {
			
			// Get the field.
			case FIELD: {
				
				// Now put it back.
				fields.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			// Get the method.
			case METHOD: {
				
				// Now put it back.
				methods.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			// Get the expression.
			case EXPRESSION: {
				
				// Either GET the existing expressions, or CREATE a new list to hold them.
				List<JavaAction> currentExpressions = expressions.containsKey(javaAction.getName()) 
																? expressions.get(javaAction.getName()) 
																	: new LinkedList<JavaAction>();

				// Add this one in.
				currentExpressions.add(javaAction);
			
				// Now put it back.
				expressions.put(javaAction.getName(), currentExpressions);
				
				// Make sure we update any possible references in a method.
				updateMethodWithNewAction(javaAction);
				
				// Now break.
				break;
			}
			
			// Get the class.
			case CLASS: {
				
				// Add this in.
				classes.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			// Get the class.
			case ENUM: {
				
				// Add this in.
				enums.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			default: {
				break;
			}
		}
	}
	
	/**
	 * Method to retrieve an entry based on it's name and type.
	 * 
	 * @param entryName -- the name of the identifier.
	 * @param entryType -- the type of the identifer.
	 * @return {@link JavaField} -- the field.
	 */
	public List<JavaAction> getEntry(String entryName, ActionType entryType) {
		
		// Switch on the entry type to know what to return.
		switch(entryType) {
			
			// Get the field.
			case FIELD: {
				return fields.containsKey(entryName) ? Collections.singletonList(fields.get(entryName)) : Collections.EMPTY_LIST;
			}
			
			// Return the method.
			case METHOD: {
				return methods.containsKey(entryName) ? Collections.singletonList(methods.get(entryName)) : Collections.EMPTY_LIST;
			}
			
			// Return the expression.
			case EXPRESSION: {
				return expressions.containsKey(entryName) ? expressions.get(entryName) : Collections.EMPTY_LIST;
			}
			
			// Return the class.
			case CLASS: {
				return classes.containsKey(entryName) ? Collections.singletonList(classes.get(entryName)) : Collections.EMPTY_LIST;
			}
			
			// Return the enum.
			case ENUM: {
				return enums.containsKey(entryName) ? Collections.singletonList(enums.get(entryName)) : Collections.EMPTY_LIST;
			}
			
			default: {
				return null;
			}
		}
	}
	
	/**
	 * Method to check the given map for the entry type and the name.
	 * 
	 * @param entryName -- the name of the entry (field, method, etc.)
	 * @param entryType -- the java action type.
	 * @return TRUE if the map contains the name, FALSE if not.
	 */
	public boolean containsEntry(String entryName, ActionType entryType) {
		
		// Switch on the entry type to know what to return.
		switch(entryType) {
			
			// Get the field.
			case FIELD: {
				return fields.containsKey(entryName);
			}
			
			// Return the method.
			case METHOD: {
				return methods.containsKey(entryName);
			}
			
			// Return the expression.
			case EXPRESSION: {
				return expressions.containsKey(entryName);
			}
			
			// Return the class.
			case CLASS: {
				return classes.containsKey(entryName);
			}
			
			// Return the class.
			case ENUM: {
				return enums.containsKey(entryName);
			}
			
			default: {
				return false;
			}
		}
	}
	
	/**
	 * Method that will update the dependencies that might exist for any and all methods. For example, consider this:
	 * 
	 * <pre>
	 * int x = 2;
	 * 
	 * int m() { 
	 * 
	 *    if(x > 2) { 
	 *      return 1; 
	 *    } 
	 * 		
	 *    else {
	 *       return 5; 
	 *    } 
	 * }
	 * 
	 * </pre>
	 * 
	 * The first call of <code>m()</code> will result in 1 being returned. If we then say, <code> x = 5; </code> and then call <code>m()</code> again, the problem is that we <i>never</i>
	 * knew that the expression was there and modified the value of <code>x</code>. So this method will be sure the methods become aware of these types of changes.
	 * <br>
	 * 
	 * By doing this, we ensure that we only ever track <i>declarations</i> and <i>assignments</i>. Variable changes within a method will <b>not</b> be tracked.
	 * @param newlyCreatedAction
	 */
	private void updateMethodWithNewAction(JavaAction newlyCreatedAction) {
		
		// Loop through each of the methods.
		for(JavaAction javaAction : methods.values()) {
			
			// Cast it.
			JavaMethod javaMethod = (JavaMethod) javaAction;
			
			// For each of it's dependent actions....
			for(JavaAction dependentAction : javaMethod.getDependentActions()) {
				
				// If we match names... then add it in.
				if(newlyCreatedAction.getName().equals(dependentAction.getName())) {
					javaMethod.addDependentAction(newlyCreatedAction);
					
					// Put it back, and then break.
					methods.put(javaMethod.getMethodName(), javaMethod);
					break;
				}
			}
		}
	}
}
