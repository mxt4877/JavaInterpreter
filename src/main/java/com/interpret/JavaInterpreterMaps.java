package com.interpret;

import java.util.HashMap;
import java.util.Map;

import com.actions.ActionType;
import com.actions.JavaAction;
import com.actions.JavaField;

/**
 * Class to house all of the varying maps that will contain fields, classes, methods, etc.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterMaps {
	
	/**
	 * Map of variables.
	 */
	private Map<String, JavaField> fields = new HashMap<String, JavaField>();
	
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
				
				// Cast the field.
				JavaField castField = (JavaField) javaAction;
				
				// Now put it back.
				fields.put(castField.getFieldName(), castField);
			}
			
			// Get the method.
			case METHOD: {
				;
			}
			
			default: {
				;
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
	public JavaField getEntry(String entryName, ActionType entryType) {
		
		// Switch on the entry type to know what to return.
		switch(entryType) {
			
			// Get the field.
			case FIELD: {
				return fields.containsKey(entryName) ? fields.get(entryName) : null;
			}
			
			// Return the method.
			case METHOD: {
				return null;
			}
			
			default: {
				return null;
			}
		}
	}
	
	public boolean containsEntry(String entryName, ActionType entryType) {
		
		// Switch on the entry type to know what to return.
		switch(entryType) {
			
			// Get the field.
			case FIELD: {
				return fields.containsKey(entryName);
			}
			
			// Return the method.
			case METHOD: {
				return false;
			}
			
			default: {
				return false;
			}
		}
	}
}
