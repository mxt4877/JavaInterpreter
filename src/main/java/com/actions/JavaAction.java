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
	 * The action type.
	 */
	protected ActionType actionType;
	
	/**
	 * The raw input.
	 */
	private String rawInput;
	
	/**
	 * Protected constructor to send in the raw input.
	 * 
	 * @param rawInput -- the raw input of the user. 
	 */
	protected JavaAction(String rawInput, ActionType actionType) {
		this.rawInput = rawInput;
		this.actionType = actionType;
	}
	
	/**
	 * Method that will set the dependent actions.
	 * 
	 * @param dependentActions -- set the dependent actions here.
	 */
	public void setDependentActions(Set<JavaAction> dependentActions) {
		this.dependentActions = dependentActions;
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

	/**
	 * Getter for the action type.
	 * 
	 * @return {@link ActionType} -- the action type.
	 */
	public ActionType getActionType() {
		return actionType;
	}
	
	/**
	 * Method to get the declared name, dependent on each of the subclasses.
	 * 
	 * @return String -- declared name.
	 */
	public abstract String getEvaluation();
	
	/**
	 * Method to get the alternate evaluation of a given java action. Default implementation is empty string.
	 * 
	 * @return String -- the alternate evaluation.
	 */
	public String getAlternateEvaluation() {
		return "";
	}
}
