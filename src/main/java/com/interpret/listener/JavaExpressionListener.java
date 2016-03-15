package com.interpret.listener;

import com.actions.JavaAction;
import com.actions.JavaExpression;
import com.actions.JavaIdentifier;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Parser.AssignmentContext;
import com.antlr.Java8Parser.LeftHandSideContext;
import com.antlr.Java8Parser.StatementExpressionContext;

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
	public void enterAssignment(AssignmentContext assignmentContext) {
		LeftHandSideContext leftHandSide = assignmentContext.leftHandSide();
		
		if(leftHandSide.expressionName() != null) {
			expressionVariable = leftHandSide.expressionName().Identifier().getText();
		}
		
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
			this.javaAction = new JavaIdentifier(this.rawInput);
		}
	}
}
