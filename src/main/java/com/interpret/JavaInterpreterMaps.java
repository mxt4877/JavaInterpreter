package com.interpret;

import java.util.HashMap;
import java.util.Map;

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
	 * Method to add a field.
	 * 
	 * @param newField -- the field.
	 */
	public void addField(JavaAction newField) {
		
		// Cast the field.
		JavaField castField = (JavaField) newField;
		
		// Now put it back.
		fields.put(castField.getFieldName(), castField);
	}
	
	/**
	 * Method to retrieve a field based on its name.
	 * 
	 * @param fieldName -- the name.
	 * @return JavaField -- the field that corresponds to this name. NULL if it does not exist.
	 */
	public JavaField getFieldFromName(String fieldName) {
		return fields.containsKey(fieldName) ? fields.get(fieldName) : null;
	}
}
