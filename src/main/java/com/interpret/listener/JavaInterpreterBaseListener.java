package com.interpret.listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.actions.ActionType;
import com.actions.JavaAction;
import com.antlr.Java8BaseListener;
import com.antlr.Java8Lexer;
import com.antlr.Java8Parser;
import com.antlr.Java8Parser.ClassDeclarationContext;
import com.antlr.Java8Parser.FieldDeclarationContext;
import com.antlr.Java8Parser.MethodDeclarationContext;
import com.antlr.Java8Parser.StatementExpressionContext;
import com.interpret.JavaInterpreterMaps;

/**
 * Class that extends {@link Java8BaseListener}, the base listener generated by ANTLR. But, here we figure out
 * the topmost part of the parse tree we care about and then pass the input along into the nested listener we created for
 * each of these topmost trees.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public class JavaInterpreterBaseListener extends Java8BaseListener {
	
	/**
	 * The actual input.
	 */
	private String rawInput;
	
	/**
	 * The new action we are going to create here.
	 */
	private JavaAction newAction;
	
	/**
	 * The constructor that takes the raw input in.
	 * 
	 * @param rawInput -- the raw input.
	 */
	public JavaInterpreterBaseListener(String rawInput) {
		this.rawInput = rawInput;
	}
	
	@Override
	public void enterFieldDeclaration(FieldDeclarationContext feildDeclarationContext) {
		
		// Find the relevant dependencies.
		Set<JavaAction> dependentActions = getDependentActions(findIdentifiers(feildDeclarationContext));
		
		// Go walk this specifically.
		Java8Parser newParser = getNewParser();
		
		// Pass through the raw input to the field listener.
		JavaFieldListener listener = new JavaFieldListener(rawInput);
		
		// Get the walker and walk with the new listener.
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, newParser.fieldDeclaration());
		
		// Set the new action.
		this.newAction = listener.getJavaAction();
		
		// Set the dependent actions.
		newAction.setDependentActions(dependentActions);
	}
	
	@Override
	public void enterStatementExpression(StatementExpressionContext statementContext) {
		System.out.println(findIdentifiers(statementContext));
		System.out.println("Got an statement expression context...");
	}
	
	@Override
	public void enterMethodDeclaration(MethodDeclarationContext methodDeclarationContext) {
		System.out.println(findIdentifiers(methodDeclarationContext));
	}
	
	@Override
	public void enterClassDeclaration(ClassDeclarationContext classDeclarationContext) {
		System.out.println("Got a class...");
	}
	
	/**
	 * Get the java action from the nested listener we created.
	 * 
	 * @return {@link JavaAction} -- the new java action.
	 */
	public JavaAction getJavaAction() {
		return this.newAction;
	}
	
	/**
	 * Method to determine the identifiers of the given parse tree. Brute force + recursion to see what parse trees
	 * actually have the "Identifier" method on them, and store their text in a list to be returned.
	 * 
	 * @param parseContext -- the parse tree.
	 * @return 
	 */
	private Set<String> findIdentifiers(ParserRuleContext parseContext) {
		
		// Get the list of identifiers.
		Set<String> identifiers = new LinkedHashSet<String>();
		
		// Go through each of the children trees that we have.
		for(ParseTree aTree : parseContext.children) {
			
			try {
				
				// This is the identifier method that we wil invoke.
				Method identifierMethod = aTree.getClass().getMethod("Identifier", null);
				
				// The terminal node is the identifier as per the antlr grammar for java.
				TerminalNode node = null;
				
				// Invoke the method. We really should not have issues, but put them to the console if we do.
				try {
					node = (TerminalNode) identifierMethod.invoke(aTree, null);
				} 
				
				// Catch various exceptions here and re-throw the error.
				catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.err.println("Exception... " + e);
				}
				
				// If we made it here, we have a method for identifiers.
				identifiers.add(node.getText());
			}
				
			// No method? Keep going.
			catch(NoSuchMethodException e) {
				;
			}
			
			// Recurse on all of the child nodes if they exist.
			if(aTree.getChildCount() > 0) {
				identifiers.addAll(findIdentifiers((ParserRuleContext)aTree));
			}			
		}
		
		// Return what we built up.
		return identifiers;
	}
	
	/**
	 * Method to find the relevent actions based on the identifiers. We will check each possible action type that might be referenced. If so,
	 * then we will have the string associated to it in the compiled class to be referenced.
	 * 
	 * @param relevantIdentifiers -- the names of the relevant identifiers.
	 * @return Set -- a list of dependent actions to return based on the identifiers.
	 */
	private Set<JavaAction> getDependentActions(Set<String> relevantIdentifiers) {
		
		// The return list.
		Set<JavaAction> dependentActions = new LinkedHashSet<JavaAction>();
		
		// Loop through the identifiers.
		for(String relevantIdentifer : relevantIdentifiers) {
			
			// Loop through each possible action that it could match.
			for(ActionType possibleAction : ActionType.values()) {
				
				// If we have a match, add it.
				if(JavaInterpreterMaps.getInstance().containsEntry(relevantIdentifer, possibleAction)) {
					dependentActions.add(JavaInterpreterMaps.getInstance().getEntry(relevantIdentifer, possibleAction));
				}
			}
		}
		
		// Return the built up list of dependents.
		return dependentActions;
	}
	
	/**
	 * Method to get the new parser.
	 * 
	 * @return {@link Java8Parser}, the parser.
	 */
	private Java8Parser getNewParser() {
		
		// Put it into a lexer.
    	Java8Lexer java8Lexer = new Java8Lexer(new ANTLRInputStream(this.rawInput));
    	
    	// Generate the token stream from that lexer.
    	CommonTokenStream tokenStream = new CommonTokenStream(java8Lexer);
    	
    	// Now return the parser.
    	return new Java8Parser(tokenStream);
	}
}
