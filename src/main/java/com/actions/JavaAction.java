package com.actions;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstract class that represents a given java action, subclassed based on the String passed into it.
 * 
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public abstract class JavaAction {
	
	/**
	 * The actions that this action are dependent on.
	 */
	protected Set<JavaAction> dependentActions = new HashSet<JavaAction>();
	
	/**
	 * The raw input.
	 */
	private String rawInput;
	
	/**
	 * Protected constructor to send in the dependent actions and the raw input.
	 * 
	 * @param dependentActions
	 * @param rawInput
	 */
	protected JavaAction(Set<JavaAction> dependentActions, String rawInput) {
		this.dependentActions = dependentActions;
		this.rawInput = rawInput;
	}
	
	/**
	 * Getter for the dependent actions.
	 * 
	 * @return A set of the dependent actions.
	 */
	public Set<JavaAction> getDependentActions() {
		return dependentActions;
	}
	
	/**
	 * Getter for the raw input.
	 * 
	 * @return String -- the raw input.
	 */
	public String getRawInput() {
		return this.rawInput;
	}
}
