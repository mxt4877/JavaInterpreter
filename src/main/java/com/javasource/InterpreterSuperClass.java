package com.javasource;

/**
 * Abstract class that every 'new' class will extend. We'll assign a random class name to each of the subclasses, but they'll
 * all by default implement the abstract methods.
 * 
 * @author <a href="mailto:mxt4877@g.rit.edu">Mike Thomsen</a>
 */
public abstract class InterpreterSuperClass {
	
	/**
	 * Method that will call a method that exists on the given subclass.
	 * 
	 * @param methodName -- the method name.
	 * @param parameters -- the parameters to pass to it.
	 * @return Object, the result of the method call.
	 * @throws Exception
	 */
	public abstract Object callMethod(String methodName, Object ... parameters) throws Exception;
	
	/**
	 * Method that will call a field that exists on the given subclass -- returning its value.
	 * 
	 * @param fieldName -- the field name.
	 * @return Object -- the resulting value of the given field.
	 * @throws Exception
	 */
	public abstract Object callField(String fieldName) throws Exception;
	
	/**
	 * String that represents the import declaration.
	 */
	private static final String IMPORT_DECLARATION = "import com.javasource.InterpreterSuperClass;\n\n\n";
	
	/**
	 * String that represents the declaration prefix of a class that extends this one.
	 */
	private static final String CLASS_DECLARATION_PREFIX = "public class CompileClass extends InterpreterSuperClass {\n\n %s \n\n";
	
	/**
	 * String that represents the declaration suffix of a class that extends this one.
	 */
	private static final String CLASS_DECLARATION_SUFFIX = "}";
	
	/**
	 * String that represents the method string that subclasses will use to invoke methods.
	 */
	private static final String CALL_METHOD_STRING = "\t@Override\n" +
		"\tpublic Object callMethod(String methodName, Object ... parameters) throws Exception {\n" +
			"\t\tClass[] parameterTypes = null;\n\n" +
			
			"\t\tif(parameters != null && parameters.length > 0) {\n" +
				"\t\t\tparameterTypes = new Class[parameters.length];\n\n" +
				
				"\t\t\tfor(int i = 0; i < parameters.length; i++) {\n" +
					"\t\t\t\tparameterTypes[i] = parameters[i].getClass();\n" + 
				"\t\t\t}\n" +
			"\t\t}\n\n" +
			
			"\t\treturn this.getClass().getMethod(methodName, parameterTypes).invoke(this, parameters);\n" +
		"\t}\n\n";

	/**
	 * String that represents the method string that subclasses will use to get values of fields.
	 */
	private static final String CALL_FIELD_STRING = "\t@Override\n" +
		"\tpublic Object callField(String fieldName) throws Exception {\n" +
			"\t\treturn this.getClass().getField(fieldName).get(this);\n" +
		"\t}\n";
	
	/**
	 * Method that will return a shell of a new class.
	 * 
	 * @return String -- the text version of a new class.
	 */
	public static JavaStringSource generateClass(String code) {
		
		// Return the string source.
		return new JavaStringSource(String.format(IMPORT_DECLARATION + CLASS_DECLARATION_PREFIX + CALL_METHOD_STRING + CALL_FIELD_STRING + CLASS_DECLARATION_SUFFIX, code));
	}
}
