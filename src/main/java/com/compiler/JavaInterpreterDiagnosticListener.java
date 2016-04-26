package com.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;

/**
 * Class to do diagnostics when compilation takes place.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterDiagnosticListener implements DiagnosticListener {
	
	/**
	 * The list of compile errors.
	 */
	private List<KnownCompilerError> knownErrors = new ArrayList<KnownCompilerError>();
	
	/**
	 * The list of raw errors.
	 */
	private List<String> rawErrors = new LinkedList<String>();

	@Override
	public void report(Diagnostic diagnostic) {
		
		// Put the error lines together.
		List<String> errorLines = Arrays.asList(diagnostic.toString().replaceAll("\\/CompileClass.java:[0-9]+: ", "").replace("error:", "ERROR:").split("\n"));
		
		// The ultimate error message for this.
		StringBuilder diagnosticError = new StringBuilder("A compiler error was encountered as a result of the input. See below for details.\n\n\t" + errorLines.get(0) + "\n");
		
		// If we need to exclude this line.
		boolean excludeLine = false;
		
		// Add them in with a proper spacing.
		for(String errorLine : errorLines.subList(1, errorLines.size())) {
			
			// Should we exclude this line?
			if(excludeLine) {
				excludeLine = false;
				continue;
			}
			
			// If we've got result returned, we need to exclude this line and the next.
			if(errorLine.contains("Result returned: -->")) {
				excludeLine = true;
			}
			
			// Otherwise, we need to check to see if we make reference to the compile clas, we don't want that to show.
			else if(!errorLine.contains("location: class CompileClass")) {
				diagnosticError.append("\t\t" + errorLine + "\n");
			}
		}
		
		// Get the message.
		String diagnosticMessage = diagnostic.getMessage(Locale.getDefault());
		
		// Try to match.
		for(KnownCompilerError knownError : KnownCompilerError.values()) {
			
			// If we matched, add it into the list.
			if(diagnosticMessage.equalsIgnoreCase(knownError.getCompilerMessage())) {
				knownErrors.add(knownError);
			}
		}
		
		// Add in the error.
		rawErrors.add(diagnosticError.toString());
	}
	
	/**
	 * Method to return if void cannot be converted is present.
	 * 
	 * @return TRUE if it contains, FALSE if it doesn't.
	 */
	public boolean shouldTryRecompile() {
		return knownErrors.size() == 1 && knownErrors.contains(KnownCompilerError.VOID_NOT_ALLOWED_HERE);
	}
	
	/**
	 * Method to print the errors we found.
	 */
	public void printErrors() {
		
		// Loop through and print each error.
		for(String error : rawErrors) {
			System.err.println(error);
		}
	}
}
