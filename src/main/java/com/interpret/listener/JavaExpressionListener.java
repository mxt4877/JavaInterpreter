package com.interpret.listener;

import com.actions.ActionType;
import com.actions.JavaAction;
import com.actions.JavaDanglingExpression;
import com.actions.JavaExpression;
import com.actions.JavaIdentifier;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Parser.ArgumentListContext;
import com.antlr.Java8Parser.AssignmentContext;
import com.antlr.Java8Parser.LeftHandSideContext;
import com.antlr.Java8Parser.MethodInvocationContext;
import com.antlr.Java8Parser.MethodInvocation_lfno_primaryContext;
import com.antlr.Java8Parser.StatementExpressionContext;
import com.antlr.Java8Parser.TypeNameContext;
import com.interpret.JavaInterpreterMaps;

/**
 * Class that extends {@link Java8BaseListener} and parses and understands input as defined by the Java8 grammar.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaExpressionListener extends Java8BaseListener {
	
	/**
	 * The actual input.
	 */
	private String rawInput;

	/**
	 * The field name.
	 */
	private String expressionVariable;
	
	/**
	 * The java action resulting from this parse tree.
	 */
	private JavaAction javaAction;
	
	/**
	 * Method to get the java action for this listener.
	 * 
	 * @return {@link JavaAction} -- the java action.
	 */
	public JavaAction getJavaAction() {
		return this.javaAction;
	}
	
	/**
	 * Constructor to pass in the actual raw input.
	 * 
	 * @param rawInput -- directly what the user entered.
	 */
	public JavaExpressionListener(String rawInput) {
		this.rawInput = rawInput;
	}
	
	@Override
	public void enterMethodInvocation(MethodInvocationContext methodInvocationContext) {
		this.expressionVariable = methodInvocationContext.methodName().Identifier().getText();
		this.javaAction = new JavaIdentifier(rawInput, expressionVariable);
	}
	
	@Override
	public void enterAssignment(AssignmentContext assignmentContext) {
		
		// Get the left hand side of the assignment.
		LeftHandSideContext leftHandSide = assignmentContext.leftHandSide();
		
		// Grab the expression name off of the left hand side.
		if(leftHandSide.expressionName() != null) {
			expressionVariable = leftHandSide.expressionName().Identifier().getText();
		}
		
		// Otherwise, try and set access on the array.
		else if(leftHandSide.arrayAccess() != null) {
			expressionVariable = leftHandSide.arrayAccess().expressionName().Identifier().getText();
		}
		
		// This is the expression we use to get the variable to set in the map.
		this.javaAction = new JavaExpression(rawInput, expressionVariable);
	}
	
	@Override
	public void enterStatementExpression(StatementExpressionContext statementExpression) {
		
		// The identifier, if it exists by itself.
		if(statementExpression.Identifier() != null) {
			this.javaAction = new JavaIdentifier(this.rawInput, statementExpression.Identifier().getText());
		}
		
		// An expression can also live by itself, so just grab the text off of it.
		if(statementExpression.expression() != null) {
			this.javaAction = new JavaDanglingExpression(this.rawInput);
		}
	}
	
	@Override
	public void enterMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext methodInvocationWithNoPrimaryContext) {
		
		// Try to get the expression name, it may be something we need to track.
		TypeNameContext typeNameContext = methodInvocationWithNoPrimaryContext.typeName();
		
		// If we can find the expression name, we'll need to be sure it's included with local code when it executes.
		if(typeNameContext != null) {
			
			// The referenced field for this method invocation.
			String referencedField = typeNameContext.Identifier().getText();
			
			// If this thing exists, then we need to be sure it's included in any other calls or references to it.
			if(JavaInterpreterMaps.getInstance().containsEntry(referencedField, ActionType.FIELD)) {
				this.javaAction.setConditionalAction(new JavaExpression(rawInput, referencedField));
			}
		}
	}
}
