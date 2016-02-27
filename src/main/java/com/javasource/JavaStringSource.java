package com.javasource;

import java.net.URI;

import javax.tools.SimpleJavaFileObject;

/**
 * A file object that represents Java source that comes from a String.
 * <br><br>
 * 
 * <b>Note:</b> This was copied directly from the Java docs here: <i>http://docs.oracle.com/javase/6/docs/api/javax/tools/JavaCompiler.html</i>.
 * 
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaStringSource extends SimpleJavaFileObject {
	
	/**
     * The source code of this "file".
     */
    private String code;

    /**
     * Constructs a new JavaSourceFromString.
     * 
     * @param name -- The name of the compilation unit represented by this file object.
     * @param code -- The source code for the compilation unit represented by this file object.
     */
    public JavaStringSource(String code) {
        super(URI.create("string:///CompileClass" + Kind.SOURCE.extension), Kind.SOURCE);
        
        // Set the code... to the code, wrapped by a class declaration.
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return code;
    }
}