package com.javasource;

import java.io.File;
import java.io.PrintWriter;

/**
 * Abstract class that every 'new' class will extend. We'll assign a random class name to each of the subclasses, but they'll
 * all by default implement the abstract methods.
 * 
 * @author <a href="mailto:mxt4877@g.rit.edu">Mike Thomsen</a>
 */
public abstract class InterpreterSuperClass {
	
	/**
	 * Method that will evaluate a single identifier expression.
	 * 
	 * @return Object -- the resulting evaluation of the expression.
	 * @throws Exception
	 */
	public abstract Object evaluate() throws Exception;
	
	/**
	 * String that represents the import declaration.
	 */
	private static final String IMPORT_DECLARATION = "import com.javasource.InterpreterSuperClass; \n" +
													 "import java.util.*; \n" +
													 "import java.math.*; \n" +
													 "import java.io.*; \n" +
													 "\n\n\n";
	
	/**
	 * String that represents the declaration prefix of a class that extends this one.
	 */
	private static final String CLASS_DECLARATION_PREFIX = "public class CompileClass extends InterpreterSuperClass {\n\n %s \n\n";
	
	/**
	 * String that represents the declaration suffix of a class that extends this one.
	 */
	private static final String CLASS_DECLARATION_SUFFIX = "}";
	
	/**
	 * String that represents the expression method that subclasses will use to evaluate single expressions.
	 */
	private static final String EXPRESSION_METHOD_STRING = "\t@Override\n" +
		"\tpublic Object evaluate() throws Exception {\n" +
			"\t\t%s\n" +
		"\t}\n";
	
	/**
	 * String that represents the fully built class that will be used to return feedback to the user.
	 */
	private static final String OVERALL_CLASS = IMPORT_DECLARATION + CLASS_DECLARATION_PREFIX + EXPRESSION_METHOD_STRING + CLASS_DECLARATION_SUFFIX;
	
	/**
	 * Method that will return a shell of a new class with expression value put into it.
	 * 
	 * @param globalCode -- the global, class-level code.
	 * @param localCode -- the local, expression-level code.
	 * @return String -- the text version of a new class.
	 */
	public static JavaStringSource generateClass(String globalCode, String localCode) {
		String sourceFile = String.format(OVERALL_CLASS, globalCode, localCode);
		
		try {
			File logFile = new File("FILELOG.java");
			logFile.createNewFile();
			PrintWriter writer = new PrintWriter(logFile);
			writer.write(sourceFile);
			writer.close();
		}
		
		catch(Exception e) {
			System.err.println("Log file creation failed: " + e);
		}
		
		return new JavaStringSource(sourceFile);
	}
}
