package com.interpret.listener;

import java.util.HashSet;
import java.util.Set;

import com.actions.JavaAction;
import com.actions.JavaField;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Listener;
import com.antlr.Java8Parser.ExpressionNameContext;
import com.antlr.Java8Parser.FieldModifierContext;
import com.antlr.Java8Parser.VariableDeclaratorContext;
import com.interpret.JavaInterpreterMaps;

/**
 * Class that extends {@link Java8Listener} and parses and understands input as defined by the Java8 grammar.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaFieldListener extends Java8BaseListener {

	/**
	 * The actual input.
	 */
	private String rawInput;
	
	/**
	 * The modifier.
	 */
	private String modifier;

	/**
	 * The field name.
	 */
	private String fieldName;
	
	/**
	 * The list of dependent actions we determined from parsing.
	 */
	private Set<JavaAction> dependentActions = new HashSet<JavaAction>();

	/**
	 * Constructor to pass in the actual raw input.
	 * 
	 * @param rawInput -- directly what the user entered.
	 */
	public JavaFieldListener(String rawInput) {
		this.rawInput = rawInput;
	}

	/**
	 * Method to get the list of java actions created as a result of this parsing.
	 * 
	 * @return List of {@link JavaAction}.
	 */
	public JavaAction getJavaAction() {
		
		// If the modifier isn't there, add public to it.
		if(this.modifier == null) {
			rawInput = "public " + rawInput;
		}
		
		// Otherwise, replace the modifier with public.
		else if(!this.modifier.equalsIgnoreCase("public")) {
			rawInput = rawInput.replace(this.modifier, "public");
		}

		// Return this list.
		return new JavaField(rawInput, fieldName, dependentActions);
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
		fieldName = ctx.variableDeclaratorId().Identifier().getText();
	}
	
	@Override
	public void enterFieldModifier(FieldModifierContext ctx) {
		this.modifier = ctx.getText();
	}
}