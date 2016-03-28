package com.compiler;

import java.util.ArrayList;
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
		rawErrors.add(diagnostic.toString());
	}
	
	/**
	 * Method to return if void cannot be converted is present.
	 * 
	 * @return TRUE if it contains, FALSE if it doesn't.
	 */
	public boolean shouldTryRecompile() {
		return knownErrors.size() == 1 && knownErrors.contains(KnownCompilerError.VOID_CANNOT_BE_CONVERTED);
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
