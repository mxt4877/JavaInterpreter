package com.interpret;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
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
	 * Map of imports.
	 */
	private Map<String, List<JavaAction>> imports = new LinkedHashMap<String, List<JavaAction>>();
	
	/**
	 * Map of exceptions.
	 */
	private Map<String, JavaAction> exceptions = new LinkedHashMap<String, JavaAction>();
	
	/**
	 * Singleton instance.
	 */
	private static final JavaInterpreterMaps INSTANCE = new JavaInterpreterMaps();
	
	/**
	 * Private no-op constructor for singleton.
	 */
	private JavaInterpreterMaps() {
		imports.put("IMPORTS", new LinkedList<JavaAction>());
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
			
			// Get the enum.
			case ENUM: {
				
				// Add this in.
				enums.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			// Get the import.
			case IMPORT: {
				
				// Either GET the existing expressions, or CREATE a new list to hold them.
				List<JavaAction> currentImports = imports.get("IMPORTS");
								
				// Add this one.
				currentImports.add(javaAction);
				
				// Put it under the key of IMPORTS.
				imports.put("IMPORTS", currentImports);
				
				break;
			}
			
			// Get the exception.
			case EXCEPTION: {
				
				// Put it under the key of IMPORTS.
				exceptions.put(javaAction.getName(), javaAction);
				
				break;
			}
			
			default: {
				break;
			}
		}
	}
	
	/**
	 * Method to get the imports.
	 */
	public List<JavaAction> getImports() {
		return this.imports.get("IMPORTS");
	}
	
	/**
	 * Method to get the exceptions.
	 */
	public Collection<JavaAction> getExceptions() {
		return this.exceptions.values();
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
	 * Method to remove an exception.
	 * 
	 * @param exceptionName -- the exception.
	 */
	public boolean removeException(String exceptionName) {
		
		// Remove it if we have it.
		if(exceptions.containsKey(exceptionName)) {
			return exceptions.remove(exceptionName) != null;
		}
		
		// Couldn't remove? Return false.
		else {
			return false;
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
	
	/**
	 * Method to serialize maps with date time as the value.
	 */
	public void saveBySerialize() {
		
		// The root file name.
		String filePrefix;
		
		// Make the directory.
		try {
			filePrefix = new File(".").getCanonicalPath() + File.separator + "serialize" + File.separator + new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss").format(new Date());
			new File(filePrefix).mkdirs();
		}
		
		catch(Exception e) {
			throw new RuntimeException("Failed trying to create file!", e);
		}
		
		// The files.
		String fieldFile = filePrefix + File.separator + "fields.ser";
		String methodFile = filePrefix + File.separator + "methods.ser";	
		String expressionFile = filePrefix + File.separator + "exprs.ser";
		String classFile = filePrefix + File.separator + "classes.ser";
		String enumFile = filePrefix + File.separator + "enums.ser";
		String importFile = filePrefix + File.separator + "imports.ser";
		String exceptionFile = filePrefix + File.separator + "exceptions.ser";
		
		// Serialize all the maps.
		serialize(fields, fieldFile);
		serialize(methods, methodFile);
		serialize(expressions, expressionFile);
		serialize(classes, classFile);
		serialize(enums, enumFile);
		serialize(imports, importFile);
		serialize(exceptions, exceptionFile);
	}
	
	/**
	 * Method to serialize a given map with a given file name.
	 * 
	 * @param mapToSerialize -- the map.
	 * @param serializeFileName -- the serialize name.
	 */
	private void serialize(Map mapToSerialize, String serializeFileName) {
		
		// Write it to a file.
		try {
			ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(serializeFileName));
			objectOutput.writeObject(mapToSerialize);
			objectOutput.close();
		}

		// Re-throw if we fail.
		catch(Exception e) {
			throw new RuntimeException("Failed writing serialization! Filename : " + serializeFileName, e);
		}
	}
	
	/**
	 * Method to load by deserialization.
	 * 
	 * @param directoryName -- the directory name.
	 */
	public void loadByDeserialize(String directoryName) {
		
		// The root directory.
		String fullDirectory;
		
		// Get the full directory.
		try {
			fullDirectory = new File(".").getCanonicalPath() + File.separator + "serialize" + File.separator + directoryName;
		}
		
		// Re-throw if we fail.
		catch(Exception e) {
			throw new RuntimeException("Failed deserializing!", e);
		}
		
		// The Files.
		String fieldFile = fullDirectory + File.separator + "fields.ser";
		String methodFile = fullDirectory + File.separator + "methods.ser";	
		String expressionFile = fullDirectory + File.separator + "exprs.ser";
		String classFile = fullDirectory + File.separator + "classes.ser";
		String enumFile = fullDirectory + File.separator + "enums.ser";
		String importFile = fullDirectory + File.separator + "imports.ser";
		String exceptionFile = fullDirectory + File.separator + "exceptions.ser";
		
		// Now set the maps to what we deserialized.
		this.fields = deserialize(fieldFile);
		this.methods = deserialize(methodFile);
		this.expressions = deserialize(expressionFile);
		this.classes = deserialize(classFile);
		this.enums = deserialize(enumFile);
		this.imports = deserialize(importFile);
		this.exceptions = deserialize(exceptionFile);
	}
	
	/**
	 * Method to serialize a given map with a given file name.
	 *
	 * @param serializeFileName -- the serialize name.
	 */
	private Map deserialize(String serializeFileName) {
		
		// Read it from a file.
		try {
			FileInputStream mapFile = new FileInputStream(serializeFileName);
			ObjectInputStream theInputStream = new ObjectInputStream(mapFile);
			
			// Read the input stream and map it to a map.
			return (Map) theInputStream.readObject();
		}

		// Re-throw if we fail.
		catch(Exception e) {
			throw new RuntimeException("Failed writing serialization! Filename : " + serializeFileName, e);
		}
	}
}
