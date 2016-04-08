package com.actions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract class that represents a given java action, subclassed based on the String passed into it.
 * 
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public abstract class JavaAction implements Serializable {
	
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
	 * The conditional action that we might also need to put into the maps.
	 */
	private JavaAction conditionalAction;
	
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
	 * Method to add in a dependent action that was not there before.
	 * 
	 * @param dependentAction -- the new dependent action.
	 */
	public void addDependentAction(JavaAction dependentAction) {
		this.dependentActions.add(dependentAction);
	}

	/**
	 * Getter for the dependent actions.
	 * 
	 * @return A set of the dependent actions.
	 */
	public Set<JavaAction> getDependentActions() {
		return this.dependentActions;
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
		return this.actionType;
	}
	
	/**
	 * Method to get the conditional action. Returns NULL if no value.
	 * 
	 * @return {@link JavaAction} -- the conditional action.
	 */
	public JavaAction getConditionalAction() {
		return this.conditionalAction;
	}

	/**
	 * Method to set the conditional action.
	 * 
	 * @param conditionalAction -- the conditional action.
	 */
	public void setConditionalAction(JavaAction conditionalAction) {
		this.conditionalAction = conditionalAction;
	}

	/**
	 * Method to get the name of this action. Default implementation is empty string.
	 * 
	 * @return String -- the name of the action.
	 */
	public String getName() {
		return "";
	}
	
	/**
	 * Method to get the alternate evaluation of a given java action. Default implementation is empty string.
	 * 
	 * @return String -- the alternate evaluation.
	 */
	public String getAlternateEvaluation() {
		return "";
	}
	
	/**
	 * Method to get the declared name, dependent on each of the subclasses.
	 * 
	 * @return String -- declared name.
	 */
	public abstract String getEvaluation();
}
