package com.interpret.listener;

import com.actions.JavaAction;
import com.actions.JavaField;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Parser.FieldModifierContext;
import com.antlr.Java8Parser.VariableDeclaratorContext;

/**
 * Class that extends {@link Java8BaseListener} and parses and understands input as defined by the Java8 grammar.
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
		
		// If the modifier is there, remove it.
		if(this.modifier != null) {
			rawInput = rawInput.replaceAll(this.modifier, "");
		}
		
		// Return this list.
		return new JavaField(rawInput, fieldName);
	}

	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) { 
		this.fieldName = ctx.variableDeclaratorId().Identifier().getText();
	}
	
	@Override
	public void enterFieldModifier(FieldModifierContext ctx) {
		this.modifier = ctx.getText();
	}
}
