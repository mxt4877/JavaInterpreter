package com.interpret;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.actions.JavaAction;
import com.actions.JavaField;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Listener;
import com.antlr.Java8Parser.ExpressionNameContext;
import com.antlr.Java8Parser.VariableDeclaratorContext;

/**
 * Class that extends {@link Java8Listener} and parses and understands input as defined by the Java8 grammar.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterListener extends Java8BaseListener {

	/**
	 * The actual input.
	 */
	private String rawInput;

	/**
	 * The list of field names.
	 */
	private List<String> fieldNames = new ArrayList<String>();
	
	/**
	 * The list of dependent actions we determined from parsing.
	 */
	private Set<JavaAction> dependentActions = new HashSet<JavaAction>();

	/**
	 * Constructor to pass in the actual raw input.
	 * 
	 * @param rawInput -- directly what the user entered.
	 */
	public JavaInterpreterListener(String rawInput) {
		this.rawInput = rawInput;
	}

	/**
	 * Method to get the list of java actions created as a result of this parsing.
	 * 
	 * @return List of {@link JavaAction}.
	 */
	public List<JavaAction> getJavaAction() {

		// Create the list.
		List<JavaAction> javaActions = new ArrayList<JavaAction>();

		// For the list of field names we gathered... add a new field.
		for(String fieldName : fieldNames) {			
			javaActions.add(new JavaField(rawInput, fieldName, dependentActions));
		}

		// Return this list.
		return javaActions;
	}

	@Override
	public void enterExpressionName(ExpressionNameContext ctx) {
		
		// Expression name is generally a field of some sort.
		String possiblyReferencedField = ctx.Identifier().getText();

		// Get the dependent action from this.
		JavaAction dependentAction = JavaInterpreterMaps.getInstance().getFieldFromName(possiblyReferencedField);

		// If it's not null (meaning we found it), add it in.
		if(dependentAction != null) {
			dependentActions.add(dependentAction);
		}
	}

	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) { 
		fieldNames.add(ctx.variableDeclaratorId().Identifier().getText());
	}
}