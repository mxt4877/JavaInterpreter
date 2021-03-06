package com.interpret;

import java.util.ArrayList;
import java.util.List;

import com.actions.ActionType;
import com.actions.JavaAction;

/**
 * Class that contains utility methods for interpretation.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class InterpreterUtils {
	
	/**
	 * The global actions -- the ones that we want to append at the CLASS level.
	 */
	private static final List<ActionType> GLOBAL_ACTIONS = new ArrayList<ActionType>() {{
		add(ActionType.METHOD);
		add(ActionType.FIELD);
		add(ActionType.CLASS);
		add(ActionType.ENUM);
	}};
	
	/**
	 * The global actions -- the ones that we want to append at the METHOD level.
	 */
	private static final List<ActionType> LOCAL_ACTIONS = new ArrayList<ActionType>() {{
		add(ActionType.IDENTIFIER);
		add(ActionType.EXPRESSION);
	}};
	
	/**
	 * Return if this is a global action -- an action that should be at the class level.
	 * 
	 * @param javaAction -- the action to test.
	 * @return TRUE for global, FALSE for not.
	 */
	public static boolean isGlobal(JavaAction javaAction) {
		return GLOBAL_ACTIONS.contains(javaAction.getActionType());
	}
	
	/**
	 * Return if this is a local action -- an action that should be at the method level.
	 * 
	 * @param javaAction -- the action to test.
	 * @return TRUE for local, FALSE for not.
	 */
	public static boolean isLocal(JavaAction javaAction) {
		return LOCAL_ACTIONS.contains(javaAction.getActionType());
	}
	
	/**
	 * Return if this is an identifier -- special logic for this.
	 * 
	 * @param javaAction -- the action type.
	 * @return TRUE if identifier, FALSE if not.
	 */
	public static boolean isIdentifier(JavaAction javaAction) {
		return ActionType.IDENTIFIER.equals(javaAction.getActionType());
	}
	
	/**
	 * Return if this is a method.
	 * 
	 * @param javaAction -- the action type.
	 * @return TRUE if method, FALSE if not.
	 */
	public static boolean isMethod(JavaAction javaAction) {
		return ActionType.METHOD.equals(javaAction.getActionType());
	}
	
	/**
	 * Return if this is a loop.
	 * 
	 * @param javaAction -- the action type.
	 * @return TRUE if loop, FALSE if not.
	 */
	public static boolean isLoopOrIf(JavaAction javaAction) {
		return ActionType.LOOP_OR_IF.equals(javaAction.getActionType());
	}
	
	/**
	 * Return if this is a dangling expression.
	 * 
	 * @param javaAction -- the action type.
	 * @return TRUE if dangling expression, FALSE if not.
	 */
	public static boolean isDanglingExpression(JavaAction javaAction) {
		return ActionType.DANGLING_EXPRESSION.equals(javaAction.getActionType());
	}
}
