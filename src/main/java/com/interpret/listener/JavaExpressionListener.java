package com.interpret.listener;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.actions.ActionType;
import com.actions.JavaAction;
import com.actions.JavaDanglingExpression;
import com.actions.JavaExpression;
import com.actions.JavaIdentifier;
import com.actions.JavaReservedMethod;
import com.actions.JavaReservedMethod.ReservedMethods;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Parser.AssignmentContext;
import com.antlr.Java8Parser.LeftHandSideContext;
import com.antlr.Java8Parser.MethodInvocationContext;
import com.antlr.Java8Parser.MethodInvocation_lfno_primaryContext;
import com.antlr.Java8Parser.PostDecrementExpressionContext;
import com.antlr.Java8Parser.PostIncrementExpressionContext;
import com.antlr.Java8Parser.PreDecrementExpressionContext;
import com.antlr.Java8Parser.PreIncrementExpressionContext;
import com.antlr.Java8Parser.StatementExpressionContext;
import com.antlr.Java8Parser.TypeNameContext;
import com.interpret.InterpreterUtils;
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
			
			// Get the ambigous name if there is one.
			if(leftHandSide.expressionName().ambiguousName() != null) {
				expressionVariable = leftHandSide.expressionName().ambiguousName().Identifier().getText();
			}
			
			// If it's not an ambiguous name, get the expression name.
			else {
				expressionVariable = leftHandSide.expressionName().Identifier().getText();
			}
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
			
			// This is a dangling expression, so grab it.
			this.javaAction = new JavaDanglingExpression(this.rawInput);
			
			// If it matches the reserve methods.
			boolean matchesReserved = ReservedMethods.getMethods().stream().anyMatch( reservedMethod -> this.rawInput.startsWith(reservedMethod) );
			
			// If this is a reserved method...
			if(matchesReserved) {
				
				// A save?
				if(this.rawInput.startsWith(ReservedMethods.SAVE.getMethodName())) {
					JavaInterpreterMaps.getInstance().saveBySerialize();
					this.javaAction = new JavaReservedMethod(ReservedMethods.SAVE, true);
				}
				
				// A load?
				else if(this.rawInput.startsWith(ReservedMethods.LOAD.getMethodName())) {
					
					// The root directory.
					String fullDirectory;
					
					// Get the full directory.
					try {
						fullDirectory = new File(".").getCanonicalPath() + File.separator + "serialize";
						
						// This is the drecitory to iterate over.
						File fullFileDirectory = new File(fullDirectory);
						
						// This is the file index, we'll use to get the actual file.
						int fileIndex = 0;
						
						// List all the serialize possibilities.
						for(File f : fullFileDirectory.listFiles()) {
							System.out.println(fileIndex++ + " : " + f.getName());
						}
						
						// Load it in.
						Scanner newScanner = new Scanner(System.in);
						System.out.println("\n\nSelect a workspace to load:");
						
						// Pick the file.
						int selected = newScanner.nextInt();
						
						// Get the file name.
						JavaInterpreterMaps.getInstance().loadByDeserialize(fullFileDirectory.listFiles()[selected].getName());
						
						// Setup the load.
						this.javaAction = new JavaReservedMethod(ReservedMethods.LOAD, true);
					}
					
					// Re-throw if we fail.
					catch(Exception e) {
						System.err.println("Failed loading!" + e);
						this.javaAction = new JavaReservedMethod(ReservedMethods.LOAD, false);
					}
				}
				
				// Uncatch an exception.
				else if(this.rawInput.startsWith(ReservedMethods.UNCATCH.getMethodName())) {
					
					// Try to gather out the exception.
					Pattern parenPattern = Pattern.compile("uncatch[(](.*)[)];");
					Matcher matcher = parenPattern.matcher(this.rawInput);
					
					// Count the matches.
					int matchCount = 0;
					
					// If we matched, tally the total.
					while(matcher.find()) {
						matchCount++;
					}
					
					// If we have one match, we match our method signature.
					if(matchCount == 1) {
						
						// Redo this...
						matcher = parenPattern.matcher(this.rawInput);
						matcher.matches();
						
						// Get the exception and 'uncatch' it.
						String exceptionName = matcher.group(1);
						
						// Setup the uncatch if we removed.
						boolean removedSuccessfully = JavaInterpreterMaps.getInstance().removeException(exceptionName);
						
						// Set up the java action.
						this.javaAction = new JavaReservedMethod(ReservedMethods.UNCATCH, removedSuccessfully);
					}
				}
			}
		}
	}
	
	@Override
	public void enterPreIncrementExpression(PreIncrementExpressionContext preIncrementExpression) {
		
		// Process only when it's not null. This is unique because it'll think this is a dangling expression, but it's not, because
		// the increment operation is really an expression we need to track, not a dangling one.
		if((this.javaAction != null) && !(InterpreterUtils.isDanglingExpression(this.javaAction))) {
			return;
		}
		
		this.expressionVariable = preIncrementExpression.unaryExpression().getText();
		this.javaAction = new JavaExpression(this.rawInput, expressionVariable);
	}
	
	@Override
	public void enterPreDecrementExpression(PreDecrementExpressionContext preDecrementExpression) {
		
		// Process only when it's not null. This is unique because it'll think this is a dangling expression, but it's not, because
		// the increment operation is really an expression we need to track, not a dangling one.
		if((this.javaAction != null) && !(InterpreterUtils.isDanglingExpression(this.javaAction))) {
			return;
		}
		
		this.expressionVariable = preDecrementExpression.unaryExpression().getText();
		this.javaAction = new JavaExpression(this.rawInput, expressionVariable);
	}
	
	@Override
	public void enterPostIncrementExpression(PostIncrementExpressionContext postIncrementExpression) {
		
		// Process only when it's not null. This is unique because it'll think this is a dangling expression, but it's not, because
		// the increment operation is really an expression we need to track, not a dangling one.
		if((this.javaAction != null) && !(InterpreterUtils.isDanglingExpression(this.javaAction))) {
			return;
		}
		
		this.expressionVariable = postIncrementExpression.postfixExpression().expressionName().Identifier().getText();
		this.javaAction = new JavaExpression(this.rawInput, expressionVariable);
	}
	
	@Override
	public void enterPostDecrementExpression(PostDecrementExpressionContext postDecrementExpression) {
		
		// Process only when it's not null. This is unique because it'll think this is a dangling expression, but it's not, because
		// the increment operation is really an expression we need to track, not a dangling one.
		if((this.javaAction != null) && !(InterpreterUtils.isDanglingExpression(this.javaAction))) {
			return;
		}
		
		this.expressionVariable = postDecrementExpression.postfixExpression().expressionName().Identifier().getText();
		this.javaAction = new JavaExpression(this.rawInput, expressionVariable);
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
