package com.antlr;

// Generated from Java8.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, 
		RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, 
		RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, 
		RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, 
		RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, 
		RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, 
		RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, 
		RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, 
		RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, 
		RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, 
		RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, 
		RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, 
		RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_lf_arrayAccess = 178, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 179, RULE_primaryNoNewArray_lf_primary = 180, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182, 
		RULE_primaryNoNewArray_lfno_primary = 183, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185, 
		RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187, 
		RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189, 
		RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192, 
		RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195, 
		RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198, 
		RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201, 
		RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203, 
		RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206, 
		RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209, 
		RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212, 
		RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215, 
		RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217, 
		RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219, 
		RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222, 
		RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225, 
		RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228, 
		RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230, 
		RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233, 
		RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235, 
		RULE_castExpression = 236;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(480);
					annotation();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(487);
					annotation();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(498);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(509);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(510);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(513);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(514);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(520);
					annotation();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526);
				match(Identifier);
				setState(528);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(527);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				classOrInterfaceType();
				setState(531);
				match(DOT);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(532);
					annotation();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				match(Identifier);
				setState(540);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(539);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(DOT);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(545);
				annotation();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			match(Identifier);
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(552);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(555);
				annotation();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(Identifier);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(562);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(571);
				annotation();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				primitiveType();
				setState(580);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				classOrInterfaceType();
				setState(583);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				typeVariable();
				setState(586);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(590);
				annotation();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(LBRACK);
			setState(597);
			match(RBRACK);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(598);
						annotation();
						}
						}
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(604);
					match(LBRACK);
					setState(605);
					match(RBRACK);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(611);
				typeParameterModifier();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(Identifier);
			setState(619);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(618);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(EXTENDS);
				setState(624);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(EXTENDS);
				setState(626);
				classOrInterfaceType();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(627);
					additionalBound();
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(BITAND);
			setState(636);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LT);
			setState(639);
			typeArgumentList();
			setState(640);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			typeArgument();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(643);
				match(COMMA);
				setState(644);
				typeArgument();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(654);
				annotation();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
			match(QUESTION);
			setState(662);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(661);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(668);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(EXTENDS);
				setState(665);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(SUPER);
				setState(667);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(673);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(674);
					match(DOT);
					setState(675);
					match(Identifier);
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				packageOrTypeName(0);
				setState(683);
				match(DOT);
				setState(684);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(689);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(692);
					match(DOT);
					setState(693);
					match(Identifier);
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				ambiguousName(0);
				setState(701);
				match(DOT);
				setState(702);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712);
					match(DOT);
					setState(713);
					match(Identifier);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				classBodyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				blockStatements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(721);
				importDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(724);
				packageModifier();
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(730);
			match(PACKAGE);
			setState(731);
			match(Identifier);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(732);
				match(DOT);
				setState(733);
				match(Identifier);
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(746);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IMPORT);
			setState(750);
			typeName();
			setState(751);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(IMPORT);
			setState(754);
			packageOrTypeName(0);
			setState(755);
			match(DOT);
			setState(756);
			match(MUL);
			setState(757);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(IMPORT);
			setState(760);
			match(STATIC);
			setState(761);
			typeName();
			setState(762);
			match(DOT);
			setState(763);
			match(Identifier);
			setState(764);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(IMPORT);
			setState(767);
			match(STATIC);
			setState(768);
			typeName();
			setState(769);
			match(DOT);
			setState(770);
			match(MUL);
			setState(771);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(782);
				classModifier();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(CLASS);
			setState(789);
			match(Identifier);
			setState(791);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(790);
				typeParameters();
				}
			}

			setState(794);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(793);
				superclass();
				}
			}

			setState(797);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(796);
				superinterfaces();
				}
			}

			setState(799);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(809);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(807);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(808);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(LT);
			setState(812);
			typeParameterList();
			setState(813);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			typeParameter();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				match(COMMA);
				setState(817);
				typeParameter();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(EXTENDS);
			setState(824);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(IMPLEMENTS);
			setState(827);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			interfaceType();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(830);
				match(COMMA);
				setState(831);
				interfaceType();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(LBRACE);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(838);
				classBodyDeclaration();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(859);
				fieldModifier();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			unannType();
			setState(866);
			variableDeclaratorList();
			setState(867);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(877);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(872);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(873);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(874);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(875);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(876);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			variableDeclarator();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(880);
				match(COMMA);
				setState(881);
				variableDeclarator();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			variableDeclaratorId();
			setState(890);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(888);
				match(ASSIGN);
				setState(889);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(Identifier);
			setState(894);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(893);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(898);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(906);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(910);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(913);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(914);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(919);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(917);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(918);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(Identifier);
				setState(926);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(925);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				unannClassOrInterfaceType();
				setState(929);
				match(DOT);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(930);
					annotation();
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				match(Identifier);
				setState(938);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(937);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(DOT);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(943);
				annotation();
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949);
			match(Identifier);
			setState(951);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(950);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(Identifier);
			setState(955);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(954);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				unannPrimitiveType();
				setState(966);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				unannClassOrInterfaceType();
				setState(969);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				unannTypeVariable();
				setState(972);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(976);
				methodModifier();
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			methodHeader();
			setState(983);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(995);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(988);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(989);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(990);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(991);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(992);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(993);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(994);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1014);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				result();
				setState(998);
				methodDeclarator();
				setState(1000);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(999);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				typeParameters();
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1003);
					annotation();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
				result();
				setState(1010);
				methodDeclarator();
				setState(1012);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1011);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1018);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(Identifier);
			setState(1021);
			match(LPAREN);
			setState(1023);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1022);
				formalParameterList();
				}
			}

			setState(1025);
			match(RPAREN);
			setState(1027);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1026);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				formalParameters();
				setState(1030);
				match(COMMA);
				setState(1031);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				formalParameter();
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1037);
						match(COMMA);
						setState(1038);
						formalParameter();
						}
						} 
					}
					setState(1043);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				receiverParameter();
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1045);
						match(COMMA);
						setState(1046);
						formalParameter();
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1054);
				variableModifier();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			unannType();
			setState(1061);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1065);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1067);
					variableModifier();
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				unannType();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1074);
					annotation();
					}
					}
					setState(1079);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1080);
				match(ELLIPSIS);
				setState(1081);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1086);
				annotation();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1092);
			unannType();
			setState(1095);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1093);
				match(Identifier);
				setState(1094);
				match(DOT);
				}
			}

			setState(1097);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(THROWS);
			setState(1100);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			exceptionType();
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1103);
				match(COMMA);
				setState(1104);
				exceptionType();
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1116);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(STATIC);
			setState(1121);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1123);
				constructorModifier();
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			constructorDeclarator();
			setState(1131);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1130);
				throws_();
				}
			}

			setState(1133);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1139);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1141);
				typeParameters();
				}
			}

			setState(1144);
			simpleTypeName();
			setState(1145);
			match(LPAREN);
			setState(1147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1146);
				formalParameterList();
				}
			}

			setState(1149);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			match(LBRACE);
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1154);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1158);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1157);
				blockStatements();
				}
			}

			setState(1160);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1162);
					typeArguments();
					}
				}

				setState(1165);
				match(THIS);
				setState(1166);
				match(LPAREN);
				setState(1168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1167);
					argumentList();
					}
				}

				setState(1170);
				match(RPAREN);
				setState(1171);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1172);
					typeArguments();
					}
				}

				setState(1175);
				match(SUPER);
				setState(1176);
				match(LPAREN);
				setState(1178);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1177);
					argumentList();
					}
				}

				setState(1180);
				match(RPAREN);
				setState(1181);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182);
				expressionName();
				setState(1183);
				match(DOT);
				setState(1185);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1184);
					typeArguments();
					}
				}

				setState(1187);
				match(SUPER);
				setState(1188);
				match(LPAREN);
				setState(1190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1189);
					argumentList();
					}
				}

				setState(1192);
				match(RPAREN);
				setState(1193);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1195);
				primary();
				setState(1196);
				match(DOT);
				setState(1198);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1197);
					typeArguments();
					}
				}

				setState(1200);
				match(SUPER);
				setState(1201);
				match(LPAREN);
				setState(1203);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1202);
					argumentList();
					}
				}

				setState(1205);
				match(RPAREN);
				setState(1206);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1210);
				classModifier();
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1216);
			match(ENUM);
			setState(1217);
			match(Identifier);
			setState(1219);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1218);
				superinterfaces();
				}
			}

			setState(1221);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(LBRACE);
			setState(1225);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1224);
				enumConstantList();
				}
			}

			setState(1228);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1227);
				match(COMMA);
				}
			}

			setState(1231);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1230);
				enumBodyDeclarations();
				}
			}

			setState(1233);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			enumConstant();
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1236);
					match(COMMA);
					setState(1237);
					enumConstant();
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1243);
				enumConstantModifier();
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1249);
			match(Identifier);
			setState(1255);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1250);
				match(LPAREN);
				setState(1252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1251);
					argumentList();
					}
				}

				setState(1254);
				match(RPAREN);
				}
			}

			setState(1258);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1257);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(SEMI);
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1263);
				classBodyDeclaration();
				}
				}
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1273);
				interfaceModifier();
				}
				}
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1279);
			match(INTERFACE);
			setState(1280);
			match(Identifier);
			setState(1282);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1281);
				typeParameters();
				}
			}

			setState(1285);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1284);
				extendsInterfaces();
				}
			}

			setState(1287);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1296);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1292);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1293);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1294);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1295);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(EXTENDS);
			setState(1299);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(LBRACE);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1302);
				interfaceMemberDeclaration();
				}
				}
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1308);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1313);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1314);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1317);
				constantModifier();
				}
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1323);
			unannType();
			setState(1324);
			variableDeclaratorList();
			setState(1325);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1331);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1333);
				interfaceMethodModifier();
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1339);
			methodHeader();
			setState(1340);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1348);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1345);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1346);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1347);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1350);
					interfaceModifier();
					}
					} 
				}
				setState(1355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1356);
			match(AT);
			setState(1357);
			match(INTERFACE);
			setState(1358);
			match(Identifier);
			setState(1359);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(LBRACE);
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1362);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1368);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1372);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1373);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1374);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1377);
				annotationTypeElementModifier();
				}
				}
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1383);
			unannType();
			setState(1384);
			match(Identifier);
			setState(1385);
			match(LPAREN);
			setState(1386);
			match(RPAREN);
			setState(1388);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1387);
				dims();
				}
			}

			setState(1391);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1390);
				defaultValue();
				}
			}

			setState(1393);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1398);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(DEFAULT);
			setState(1401);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(AT);
			setState(1409);
			typeName();
			setState(1410);
			match(LPAREN);
			setState(1412);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1411);
				elementValuePairList();
				}
			}

			setState(1414);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			elementValuePair();
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1417);
				match(COMMA);
				setState(1418);
				elementValuePair();
				}
				}
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(Identifier);
			setState(1425);
			match(ASSIGN);
			setState(1426);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1430);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(LBRACE);
			setState(1435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1434);
				elementValueList();
				}
			}

			setState(1438);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1437);
				match(COMMA);
				}
			}

			setState(1440);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			elementValue();
			setState(1447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					match(COMMA);
					setState(1444);
					elementValue();
					}
					} 
				}
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(AT);
			setState(1451);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(AT);
			setState(1454);
			typeName();
			setState(1455);
			match(LPAREN);
			setState(1456);
			elementValue();
			setState(1457);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(LBRACE);
			setState(1461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1460);
				variableInitializerList();
				}
			}

			setState(1464);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1463);
				match(COMMA);
				}
			}

			setState(1466);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			variableInitializer();
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1469);
					match(COMMA);
					setState(1470);
					variableInitializer();
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(LBRACE);
			setState(1478);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1477);
				blockStatements();
				}
			}

			setState(1480);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			blockStatement();
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(1483);
				blockStatement();
				}
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1491);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			localVariableDeclaration();
			setState(1495);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1497);
				variableModifier();
				}
				}
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1503);
			unannType();
			setState(1504);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				ifThenStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1508);
				ifThenElseStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1509);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1510);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1511);
				statementWithoutTrailingSubstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1517);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1518);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1533);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1525);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1526);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1527);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1528);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1529);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1530);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1531);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1532);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(Identifier);
			setState(1538);
			match(COLON);
			setState(1539);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(Identifier);
			setState(1542);
			match(COLON);
			setState(1543);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			statementExpression();
			setState(1546);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1551);
				preIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1552);
				preDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1553);
				postIncrementExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1554);
				postDecrementExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1555);
				methodInvocation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1556);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(IF);
			setState(1560);
			match(LPAREN);
			setState(1561);
			expression();
			setState(1562);
			match(RPAREN);
			setState(1563);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(IF);
			setState(1566);
			match(LPAREN);
			setState(1567);
			expression();
			setState(1568);
			match(RPAREN);
			setState(1569);
			statementNoShortIf();
			setState(1570);
			match(ELSE);
			setState(1571);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(IF);
			setState(1574);
			match(LPAREN);
			setState(1575);
			expression();
			setState(1576);
			match(RPAREN);
			setState(1577);
			statementNoShortIf();
			setState(1578);
			match(ELSE);
			setState(1579);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				match(ASSERT);
				setState(1582);
				expression();
				setState(1583);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				match(ASSERT);
				setState(1586);
				expression();
				setState(1587);
				match(COLON);
				setState(1588);
				expression();
				setState(1589);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(SWITCH);
			setState(1594);
			match(LPAREN);
			setState(1595);
			expression();
			setState(1596);
			match(RPAREN);
			setState(1597);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(LBRACE);
			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1600);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1606);
				switchLabel();
				}
				}
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1612);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			switchLabels();
			setState(1615);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			switchLabel();
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1618);
				switchLabel();
				}
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(CASE);
				setState(1625);
				constantExpression();
				setState(1626);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				match(CASE);
				setState(1629);
				enumConstantName();
				setState(1630);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1632);
				match(DEFAULT);
				setState(1633);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(WHILE);
			setState(1639);
			match(LPAREN);
			setState(1640);
			expression();
			setState(1641);
			match(RPAREN);
			setState(1642);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(WHILE);
			setState(1645);
			match(LPAREN);
			setState(1646);
			expression();
			setState(1647);
			match(RPAREN);
			setState(1648);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(DO);
			setState(1651);
			statement();
			setState(1652);
			match(WHILE);
			setState(1653);
			match(LPAREN);
			setState(1654);
			expression();
			setState(1655);
			match(RPAREN);
			setState(1656);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(FOR);
			setState(1667);
			match(LPAREN);
			setState(1669);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1668);
				forInit();
				}
			}

			setState(1671);
			match(SEMI);
			setState(1673);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1672);
				expression();
				}
			}

			setState(1675);
			match(SEMI);
			setState(1677);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1676);
				forUpdate();
				}
			}

			setState(1679);
			match(RPAREN);
			setState(1680);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(FOR);
			setState(1683);
			match(LPAREN);
			setState(1685);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1684);
				forInit();
				}
			}

			setState(1687);
			match(SEMI);
			setState(1689);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1688);
				expression();
				}
			}

			setState(1691);
			match(SEMI);
			setState(1693);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1692);
				forUpdate();
				}
			}

			setState(1695);
			match(RPAREN);
			setState(1696);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			statementExpression();
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1705);
				match(COMMA);
				setState(1706);
				statementExpression();
				}
				}
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(FOR);
			setState(1713);
			match(LPAREN);
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1714);
				variableModifier();
				}
				}
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1720);
			unannType();
			setState(1721);
			variableDeclaratorId();
			setState(1722);
			match(COLON);
			setState(1723);
			expression();
			setState(1724);
			match(RPAREN);
			setState(1725);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			match(FOR);
			setState(1728);
			match(LPAREN);
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1729);
				variableModifier();
				}
				}
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1735);
			unannType();
			setState(1736);
			variableDeclaratorId();
			setState(1737);
			match(COLON);
			setState(1738);
			expression();
			setState(1739);
			match(RPAREN);
			setState(1740);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(BREAK);
			setState(1744);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1743);
				match(Identifier);
				}
			}

			setState(1746);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(CONTINUE);
			setState(1750);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1749);
				match(Identifier);
				}
			}

			setState(1752);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(RETURN);
			setState(1756);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1755);
				expression();
				}
			}

			setState(1758);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(THROW);
			setState(1761);
			expression();
			setState(1762);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(SYNCHRONIZED);
			setState(1765);
			match(LPAREN);
			setState(1766);
			expression();
			setState(1767);
			match(RPAREN);
			setState(1768);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(TRY);
				setState(1771);
				block();
				setState(1772);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(TRY);
				setState(1775);
				block();
				setState(1777);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1776);
					catches();
					}
				}

				setState(1779);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1781);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			catchClause();
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1785);
				catchClause();
				}
				}
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(CATCH);
			setState(1792);
			match(LPAREN);
			setState(1793);
			catchFormalParameter();
			setState(1794);
			match(RPAREN);
			setState(1795);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1797);
				variableModifier();
				}
				}
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1803);
			catchType();
			setState(1804);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			unannClassType();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1807);
				match(BITOR);
				setState(1808);
				classType();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(FINALLY);
			setState(1815);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			match(TRY);
			setState(1818);
			resourceSpecification();
			setState(1819);
			block();
			setState(1821);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1820);
				catches();
				}
			}

			setState(1824);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1823);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(LPAREN);
			setState(1827);
			resourceList();
			setState(1829);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1828);
				match(SEMI);
				}
			}

			setState(1831);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			resource();
			setState(1838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1834);
					match(SEMI);
					setState(1835);
					resource();
					}
					} 
				}
				setState(1840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1841);
				variableModifier();
				}
				}
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1847);
			unannType();
			setState(1848);
			variableDeclaratorId();
			setState(1849);
			match(ASSIGN);
			setState(1850);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1852);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1853);
				arrayCreationExpression();
				}
				break;
			}
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1856);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				typeName();
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1864);
					match(LBRACK);
					setState(1865);
					match(RBRACK);
					}
					}
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1871);
				match(DOT);
				setState(1872);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1874);
				match(VOID);
				setState(1875);
				match(DOT);
				setState(1876);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1877);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1878);
				typeName();
				setState(1879);
				match(DOT);
				setState(1880);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1882);
				match(LPAREN);
				setState(1883);
				expression();
				setState(1884);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1886);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1887);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1888);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1889);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1890);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
				typeName();
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1897);
					match(LBRACK);
					setState(1898);
					match(RBRACK);
					}
					}
					setState(1903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1904);
				match(DOT);
				setState(1905);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1907);
				match(VOID);
				setState(1908);
				match(DOT);
				setState(1909);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1910);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1911);
				typeName();
				setState(1912);
				match(DOT);
				setState(1913);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1915);
				match(LPAREN);
				setState(1916);
				expression();
				setState(1917);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1919);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1920);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1921);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1922);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1925);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1926);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1927);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1928);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1929);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1937);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				typeName();
				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1942);
					match(LBRACK);
					setState(1943);
					match(RBRACK);
					}
					}
					setState(1948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1949);
				match(DOT);
				setState(1950);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1952);
				unannPrimitiveType();
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1953);
					match(LBRACK);
					setState(1954);
					match(RBRACK);
					}
					}
					setState(1959);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1960);
				match(DOT);
				setState(1961);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1963);
				match(VOID);
				setState(1964);
				match(DOT);
				setState(1965);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1966);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1967);
				typeName();
				setState(1968);
				match(DOT);
				setState(1969);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1971);
				match(LPAREN);
				setState(1972);
				expression();
				setState(1973);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1975);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1976);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1977);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1978);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1979);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				typeName();
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1986);
					match(LBRACK);
					setState(1987);
					match(RBRACK);
					}
					}
					setState(1992);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1993);
				match(DOT);
				setState(1994);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1996);
				unannPrimitiveType();
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1997);
					match(LBRACK);
					setState(1998);
					match(RBRACK);
					}
					}
					setState(2003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2004);
				match(DOT);
				setState(2005);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2007);
				match(VOID);
				setState(2008);
				match(DOT);
				setState(2009);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2010);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2011);
				typeName();
				setState(2012);
				match(DOT);
				setState(2013);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2015);
				match(LPAREN);
				setState(2016);
				expression();
				setState(2017);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2019);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2020);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2021);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2022);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				match(NEW);
				setState(2027);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2026);
					typeArguments();
					}
				}

				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2029);
					annotation();
					}
					}
					setState(2034);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2035);
				match(Identifier);
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2036);
					match(DOT);
					setState(2040);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2037);
						annotation();
						}
						}
						setState(2042);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2043);
					match(Identifier);
					}
					}
					setState(2048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2050);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2049);
					typeArgumentsOrDiamond();
					}
				}

				setState(2052);
				match(LPAREN);
				setState(2054);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2053);
					argumentList();
					}
				}

				setState(2056);
				match(RPAREN);
				setState(2058);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2057);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2060);
				expressionName();
				setState(2061);
				match(DOT);
				setState(2062);
				match(NEW);
				setState(2064);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2063);
					typeArguments();
					}
				}

				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2066);
					annotation();
					}
					}
					setState(2071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2072);
				match(Identifier);
				setState(2074);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2073);
					typeArgumentsOrDiamond();
					}
				}

				setState(2076);
				match(LPAREN);
				setState(2078);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2077);
					argumentList();
					}
				}

				setState(2080);
				match(RPAREN);
				setState(2082);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2081);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2084);
				primary();
				setState(2085);
				match(DOT);
				setState(2086);
				match(NEW);
				setState(2088);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2087);
					typeArguments();
					}
				}

				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2090);
					annotation();
					}
					}
					setState(2095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2096);
				match(Identifier);
				setState(2098);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2097);
					typeArgumentsOrDiamond();
					}
				}

				setState(2100);
				match(LPAREN);
				setState(2102);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2101);
					argumentList();
					}
				}

				setState(2104);
				match(RPAREN);
				setState(2106);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2105);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(DOT);
			setState(2111);
			match(NEW);
			setState(2113);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2112);
				typeArguments();
				}
			}

			setState(2118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2115);
				annotation();
				}
				}
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2121);
			match(Identifier);
			setState(2123);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2122);
				typeArgumentsOrDiamond();
				}
			}

			setState(2125);
			match(LPAREN);
			setState(2127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2126);
				argumentList();
				}
			}

			setState(2129);
			match(RPAREN);
			setState(2131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2130);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2192);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2133);
				match(NEW);
				setState(2135);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2134);
					typeArguments();
					}
				}

				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2137);
					annotation();
					}
					}
					setState(2142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2143);
				match(Identifier);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2144);
					match(DOT);
					setState(2148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2145);
						annotation();
						}
						}
						setState(2150);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2151);
					match(Identifier);
					}
					}
					setState(2156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2158);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2157);
					typeArgumentsOrDiamond();
					}
				}

				setState(2160);
				match(LPAREN);
				setState(2162);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2161);
					argumentList();
					}
				}

				setState(2164);
				match(RPAREN);
				setState(2166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2165);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				expressionName();
				setState(2169);
				match(DOT);
				setState(2170);
				match(NEW);
				setState(2172);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2171);
					typeArguments();
					}
				}

				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2174);
					annotation();
					}
					}
					setState(2179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2180);
				match(Identifier);
				setState(2182);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2181);
					typeArgumentsOrDiamond();
					}
				}

				setState(2184);
				match(LPAREN);
				setState(2186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2185);
					argumentList();
					}
				}

				setState(2188);
				match(RPAREN);
				setState(2190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2189);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2194);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				match(LT);
				setState(2196);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2199);
				primary();
				setState(2200);
				match(DOT);
				setState(2201);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				match(SUPER);
				setState(2204);
				match(DOT);
				setState(2205);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2206);
				typeName();
				setState(2207);
				match(DOT);
				setState(2208);
				match(SUPER);
				setState(2209);
				match(DOT);
				setState(2210);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(DOT);
			setState(2215);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2226);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				match(SUPER);
				setState(2218);
				match(DOT);
				setState(2219);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2220);
				typeName();
				setState(2221);
				match(DOT);
				setState(2222);
				match(SUPER);
				setState(2223);
				match(DOT);
				setState(2224);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2228);
				expressionName();
				setState(2229);
				match(LBRACK);
				setState(2230);
				expression();
				setState(2231);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2233);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2234);
				match(LBRACK);
				setState(2235);
				expression();
				setState(2236);
				match(RBRACK);
				}
				break;
			}
			setState(2247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2240);
				primaryNoNewArray_lf_arrayAccess();
				setState(2241);
				match(LBRACK);
				setState(2242);
				expression();
				setState(2243);
				match(RBRACK);
				}
				}
				setState(2249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2250);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2251);
			match(LBRACK);
			setState(2252);
			expression();
			setState(2253);
			match(RBRACK);
			}
			setState(2262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2255);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2256);
					match(LBRACK);
					setState(2257);
					expression();
					setState(2258);
					match(RBRACK);
					}
					} 
				}
				setState(2264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2265);
				expressionName();
				setState(2266);
				match(LBRACK);
				setState(2267);
				expression();
				setState(2268);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2270);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2271);
				match(LBRACK);
				setState(2272);
				expression();
				setState(2273);
				match(RBRACK);
				}
				break;
			}
			setState(2284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2277);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2278);
					match(LBRACK);
					setState(2279);
					expression();
					setState(2280);
					match(RBRACK);
					}
					} 
				}
				setState(2286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				methodName();
				setState(2288);
				match(LPAREN);
				setState(2290);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2289);
					argumentList();
					}
				}

				setState(2292);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2294);
				typeName();
				setState(2295);
				match(DOT);
				setState(2297);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2296);
					typeArguments();
					}
				}

				setState(2299);
				match(Identifier);
				setState(2300);
				match(LPAREN);
				setState(2302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2301);
					argumentList();
					}
				}

				setState(2304);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2306);
				expressionName();
				setState(2307);
				match(DOT);
				setState(2309);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2308);
					typeArguments();
					}
				}

				setState(2311);
				match(Identifier);
				setState(2312);
				match(LPAREN);
				setState(2314);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2313);
					argumentList();
					}
				}

				setState(2316);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2318);
				primary();
				setState(2319);
				match(DOT);
				setState(2321);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2320);
					typeArguments();
					}
				}

				setState(2323);
				match(Identifier);
				setState(2324);
				match(LPAREN);
				setState(2326);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2325);
					argumentList();
					}
				}

				setState(2328);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2330);
				match(SUPER);
				setState(2331);
				match(DOT);
				setState(2333);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2332);
					typeArguments();
					}
				}

				setState(2335);
				match(Identifier);
				setState(2336);
				match(LPAREN);
				setState(2338);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2337);
					argumentList();
					}
				}

				setState(2340);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2341);
				typeName();
				setState(2342);
				match(DOT);
				setState(2343);
				match(SUPER);
				setState(2344);
				match(DOT);
				setState(2346);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2345);
					typeArguments();
					}
				}

				setState(2348);
				match(Identifier);
				setState(2349);
				match(LPAREN);
				setState(2351);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2350);
					argumentList();
					}
				}

				setState(2353);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			match(DOT);
			setState(2359);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2358);
				typeArguments();
				}
			}

			setState(2361);
			match(Identifier);
			setState(2362);
			match(LPAREN);
			setState(2364);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2363);
				argumentList();
				}
			}

			setState(2366);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368);
				methodName();
				setState(2369);
				match(LPAREN);
				setState(2371);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2370);
					argumentList();
					}
				}

				setState(2373);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				typeName();
				setState(2376);
				match(DOT);
				setState(2378);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2377);
					typeArguments();
					}
				}

				setState(2380);
				match(Identifier);
				setState(2381);
				match(LPAREN);
				setState(2383);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2382);
					argumentList();
					}
				}

				setState(2385);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2387);
				expressionName();
				setState(2388);
				match(DOT);
				setState(2390);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2389);
					typeArguments();
					}
				}

				setState(2392);
				match(Identifier);
				setState(2393);
				match(LPAREN);
				setState(2395);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2394);
					argumentList();
					}
				}

				setState(2397);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2399);
				match(SUPER);
				setState(2400);
				match(DOT);
				setState(2402);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2401);
					typeArguments();
					}
				}

				setState(2404);
				match(Identifier);
				setState(2405);
				match(LPAREN);
				setState(2407);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2406);
					argumentList();
					}
				}

				setState(2409);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2410);
				typeName();
				setState(2411);
				match(DOT);
				setState(2412);
				match(SUPER);
				setState(2413);
				match(DOT);
				setState(2415);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2414);
					typeArguments();
					}
				}

				setState(2417);
				match(Identifier);
				setState(2418);
				match(LPAREN);
				setState(2420);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2419);
					argumentList();
					}
				}

				setState(2422);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			expression();
			setState(2431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2427);
				match(COMMA);
				setState(2428);
				expression();
				}
				}
				setState(2433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2434);
				expressionName();
				setState(2435);
				match(COLONCOLON);
				setState(2437);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2436);
					typeArguments();
					}
				}

				setState(2439);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				referenceType();
				setState(2442);
				match(COLONCOLON);
				setState(2444);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2443);
					typeArguments();
					}
				}

				setState(2446);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2448);
				primary();
				setState(2449);
				match(COLONCOLON);
				setState(2451);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2450);
					typeArguments();
					}
				}

				setState(2453);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2455);
				match(SUPER);
				setState(2456);
				match(COLONCOLON);
				setState(2458);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2457);
					typeArguments();
					}
				}

				setState(2460);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2461);
				typeName();
				setState(2462);
				match(DOT);
				setState(2463);
				match(SUPER);
				setState(2464);
				match(COLONCOLON);
				setState(2466);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2465);
					typeArguments();
					}
				}

				setState(2468);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2470);
				classType();
				setState(2471);
				match(COLONCOLON);
				setState(2473);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2472);
					typeArguments();
					}
				}

				setState(2475);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2477);
				arrayType();
				setState(2478);
				match(COLONCOLON);
				setState(2479);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(COLONCOLON);
			setState(2485);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2484);
				typeArguments();
				}
			}

			setState(2487);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2489);
				expressionName();
				setState(2490);
				match(COLONCOLON);
				setState(2492);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2491);
					typeArguments();
					}
				}

				setState(2494);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2496);
				referenceType();
				setState(2497);
				match(COLONCOLON);
				setState(2499);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2498);
					typeArguments();
					}
				}

				setState(2501);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2503);
				match(SUPER);
				setState(2504);
				match(COLONCOLON);
				setState(2506);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2505);
					typeArguments();
					}
				}

				setState(2508);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2509);
				typeName();
				setState(2510);
				match(DOT);
				setState(2511);
				match(SUPER);
				setState(2512);
				match(COLONCOLON);
				setState(2514);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2513);
					typeArguments();
					}
				}

				setState(2516);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2518);
				classType();
				setState(2519);
				match(COLONCOLON);
				setState(2521);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2520);
					typeArguments();
					}
				}

				setState(2523);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2525);
				arrayType();
				setState(2526);
				match(COLONCOLON);
				setState(2527);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2531);
				match(NEW);
				setState(2532);
				primitiveType();
				setState(2533);
				dimExprs();
				setState(2535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2534);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2537);
				match(NEW);
				setState(2538);
				classOrInterfaceType();
				setState(2539);
				dimExprs();
				setState(2541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2540);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2543);
				match(NEW);
				setState(2544);
				primitiveType();
				setState(2545);
				dims();
				setState(2546);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2548);
				match(NEW);
				setState(2549);
				classOrInterfaceType();
				setState(2550);
				dims();
				setState(2551);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			dimExpr();
			setState(2559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2556);
					dimExpr();
					}
					} 
				}
				setState(2561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2562);
				annotation();
				}
				}
				setState(2567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2568);
			match(LBRACK);
			setState(2569);
			expression();
			setState(2570);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2574);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2575);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			lambdaParameters();
			setState(2579);
			match(ARROW);
			setState(2580);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2582);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2583);
				match(LPAREN);
				setState(2585);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2584);
					formalParameterList();
					}
				}

				setState(2587);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2588);
				match(LPAREN);
				setState(2589);
				inferredFormalParameterList();
				setState(2590);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			match(Identifier);
			setState(2599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2595);
				match(COMMA);
				setState(2596);
				match(Identifier);
				}
				}
				setState(2601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2604);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2602);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2606);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			leftHandSide();
			setState(2611);
			assignmentOperator();
			setState(2612);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2614);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2615);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2616);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2621);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2622);
				conditionalOrExpression(0);
				setState(2623);
				match(QUESTION);
				setState(2624);
				expression();
				setState(2625);
				match(COLON);
				setState(2626);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2631);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2633);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2634);
					match(OR);
					setState(2635);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2642);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2644);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2645);
					match(AND);
					setState(2646);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2653);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2655);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2656);
					match(BITOR);
					setState(2657);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2664);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2666);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2667);
					match(CARET);
					setState(2668);
					andExpression(0);
					}
					} 
				}
				setState(2673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2675);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2677);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2678);
					match(BITAND);
					setState(2679);
					equalityExpression(0);
					}
					} 
				}
				setState(2684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2686);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2694);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2688);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2689);
						match(EQUAL);
						setState(2690);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2691);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2692);
						match(NOTEQUAL);
						setState(2693);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2700);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2702);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2703);
						match(LT);
						setState(2704);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2705);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2706);
						match(GT);
						setState(2707);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2708);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2709);
						match(LE);
						setState(2710);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2711);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2712);
						match(GE);
						setState(2713);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2714);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2715);
						match(INSTANCEOF);
						setState(2716);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2723);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2738);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2725);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2726);
						match(LT);
						setState(2727);
						match(LT);
						setState(2728);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2729);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2730);
						match(GT);
						setState(2731);
						match(GT);
						setState(2732);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2733);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2734);
						match(GT);
						setState(2735);
						match(GT);
						setState(2736);
						match(GT);
						setState(2737);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2744);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2752);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2746);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2747);
						match(ADD);
						setState(2748);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2749);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2750);
						match(SUB);
						setState(2751);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2758);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2769);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2760);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2761);
						match(MUL);
						setState(2762);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2763);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2764);
						match(DIV);
						setState(2765);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2766);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2767);
						match(MOD);
						setState(2768);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2781);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2774);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2775);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2776);
				match(ADD);
				setState(2777);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2778);
				match(SUB);
				setState(2779);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2780);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
			match(INC);
			setState(2784);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			match(DEC);
			setState(2787);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
				match(TILDE);
				setState(2791);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2792);
				match(BANG);
				setState(2793);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2794);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2797);
				primary();
				}
				break;
			case 2:
				{
				setState(2798);
				expressionName();
				}
				break;
			}
			setState(2805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2803);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2801);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2802);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2808);
			postfixExpression();
			setState(2809);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2813);
			postfixExpression();
			setState(2814);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2818);
				match(LPAREN);
				setState(2819);
				primitiveType();
				setState(2820);
				match(RPAREN);
				setState(2821);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2823);
				match(LPAREN);
				setState(2824);
				referenceType();
				setState(2828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2825);
					additionalBound();
					}
					}
					setState(2830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2831);
				match(RPAREN);
				setState(2832);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2834);
				match(LPAREN);
				setState(2835);
				referenceType();
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2836);
					additionalBound();
					}
					}
					setState(2841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2842);
				match(RPAREN);
				setState(2843);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 217:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 218:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 219:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 220:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 222:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 223:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 224:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 225:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 226:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0b22\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\3\2\3\2\3\3\3\3\5\3\u01e1\n\3\3\4\7\4"+
		"\u01e4\n\4\f\4\16\4\u01e7\13\4\3\4\3\4\7\4\u01eb\n\4\f\4\16\4\u01ee\13"+
		"\4\3\4\5\4\u01f1\n\4\3\5\3\5\5\5\u01f5\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\5\b\u01fe\n\b\3\t\3\t\5\t\u0202\n\t\3\t\3\t\7\t\u0206\n\t\f\t\16\t\u0209"+
		"\13\t\3\n\7\n\u020c\n\n\f\n\16\n\u020f\13\n\3\n\3\n\5\n\u0213\n\n\3\n"+
		"\3\n\3\n\7\n\u0218\n\n\f\n\16\n\u021b\13\n\3\n\3\n\5\n\u021f\n\n\5\n\u0221"+
		"\n\n\3\13\3\13\7\13\u0225\n\13\f\13\16\13\u0228\13\13\3\13\3\13\5\13\u022c"+
		"\n\13\3\f\7\f\u022f\n\f\f\f\16\f\u0232\13\f\3\f\3\f\5\f\u0236\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u023f\n\20\f\20\16\20\u0242\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u024f\n\21"+
		"\3\22\7\22\u0252\n\22\f\22\16\22\u0255\13\22\3\22\3\22\3\22\7\22\u025a"+
		"\n\22\f\22\16\22\u025d\13\22\3\22\3\22\7\22\u0261\n\22\f\22\16\22\u0264"+
		"\13\22\3\23\7\23\u0267\n\23\f\23\16\23\u026a\13\23\3\23\3\23\5\23\u026e"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0277\n\25\f\25\16\25\u027a"+
		"\13\25\5\25\u027c\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\31\3\31\5\31\u028f\n\31\3"+
		"\32\7\32\u0292\n\32\f\32\16\32\u0295\13\32\3\32\3\32\5\32\u0299\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u029f\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02a7\n\34\f\34\16\34\u02aa\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02b1"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02b9\n\36\f\36\16\36\u02bc\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u02c3\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u02cd\n!\f!\16!\u02d0\13!\3\"\3\"\3\"\5\"\u02d5\n\"\3#\7#\u02d8\n#\f"+
		"#\16#\u02db\13#\3#\3#\3#\3#\7#\u02e1\n#\f#\16#\u02e4\13#\3#\3#\3$\3$\3"+
		"%\3%\3%\3%\5%\u02ee\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u030b\n*\3+\3+\5+\u030f\n"+
		"+\3,\7,\u0312\n,\f,\16,\u0315\13,\3,\3,\3,\5,\u031a\n,\3,\5,\u031d\n,"+
		"\3,\5,\u0320\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u032c\n-\3.\3.\3.\3."+
		"\3/\3/\3/\7/\u0335\n/\f/\16/\u0338\13/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\7\62\u0343\n\62\f\62\16\62\u0346\13\62\3\63\3\63\7\63\u034a"+
		"\n\63\f\63\16\63\u034d\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0355"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u035c\n\65\3\66\7\66\u035f\n\66\f"+
		"\66\16\66\u0362\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0370\n\67\38\38\38\78\u0375\n8\f8\168\u0378\138\39\3"+
		"9\39\59\u037d\n9\3:\3:\5:\u0381\n:\3;\3;\5;\u0385\n;\3<\3<\5<\u0389\n"+
		"<\3=\3=\5=\u038d\n=\3>\3>\3>\5>\u0392\n>\3?\3?\5?\u0396\n?\3?\3?\7?\u039a"+
		"\n?\f?\16?\u039d\13?\3@\3@\5@\u03a1\n@\3@\3@\3@\7@\u03a6\n@\f@\16@\u03a9"+
		"\13@\3@\3@\5@\u03ad\n@\5@\u03af\n@\3A\3A\7A\u03b3\nA\fA\16A\u03b6\13A"+
		"\3A\3A\5A\u03ba\nA\3B\3B\5B\u03be\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\5G\u03d1\nG\3H\7H\u03d4\nH\fH\16H\u03d7\13H\3H\3H\3"+
		"H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03e6\nI\3J\3J\3J\5J\u03eb\nJ\3J\3"+
		"J\7J\u03ef\nJ\fJ\16J\u03f2\13J\3J\3J\3J\5J\u03f7\nJ\5J\u03f9\nJ\3K\3K"+
		"\5K\u03fd\nK\3L\3L\3L\5L\u0402\nL\3L\3L\5L\u0406\nL\3M\3M\3M\3M\3M\5M"+
		"\u040d\nM\3N\3N\3N\7N\u0412\nN\fN\16N\u0415\13N\3N\3N\3N\7N\u041a\nN\f"+
		"N\16N\u041d\13N\5N\u041f\nN\3O\7O\u0422\nO\fO\16O\u0425\13O\3O\3O\3O\3"+
		"P\3P\5P\u042c\nP\3Q\7Q\u042f\nQ\fQ\16Q\u0432\13Q\3Q\3Q\7Q\u0436\nQ\fQ"+
		"\16Q\u0439\13Q\3Q\3Q\3Q\3Q\5Q\u043f\nQ\3R\7R\u0442\nR\fR\16R\u0445\13"+
		"R\3R\3R\3R\5R\u044a\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u0454\nT\fT\16T\u0457"+
		"\13T\3U\3U\5U\u045b\nU\3V\3V\5V\u045f\nV\3W\3W\3X\3X\3X\3Y\7Y\u0467\n"+
		"Y\fY\16Y\u046a\13Y\3Y\3Y\5Y\u046e\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0476\nZ\3["+
		"\5[\u0479\n[\3[\3[\3[\5[\u047e\n[\3[\3[\3\\\3\\\3]\3]\5]\u0486\n]\3]\5"+
		"]\u0489\n]\3]\3]\3^\5^\u048e\n^\3^\3^\3^\5^\u0493\n^\3^\3^\3^\5^\u0498"+
		"\n^\3^\3^\3^\5^\u049d\n^\3^\3^\3^\3^\3^\5^\u04a4\n^\3^\3^\3^\5^\u04a9"+
		"\n^\3^\3^\3^\3^\3^\3^\5^\u04b1\n^\3^\3^\3^\5^\u04b6\n^\3^\3^\3^\5^\u04bb"+
		"\n^\3_\7_\u04be\n_\f_\16_\u04c1\13_\3_\3_\3_\5_\u04c6\n_\3_\3_\3`\3`\5"+
		"`\u04cc\n`\3`\5`\u04cf\n`\3`\5`\u04d2\n`\3`\3`\3a\3a\3a\7a\u04d9\na\f"+
		"a\16a\u04dc\13a\3b\7b\u04df\nb\fb\16b\u04e2\13b\3b\3b\3b\5b\u04e7\nb\3"+
		"b\5b\u04ea\nb\3b\5b\u04ed\nb\3c\3c\3d\3d\7d\u04f3\nd\fd\16d\u04f6\13d"+
		"\3e\3e\5e\u04fa\ne\3f\7f\u04fd\nf\ff\16f\u0500\13f\3f\3f\3f\5f\u0505\n"+
		"f\3f\5f\u0508\nf\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u0513\ng\3h\3h\3h\3i\3"+
		"i\7i\u051a\ni\fi\16i\u051d\13i\3i\3i\3j\3j\3j\3j\3j\5j\u0526\nj\3k\7k"+
		"\u0529\nk\fk\16k\u052c\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l\u0536\nl\3m\7m\u0539"+
		"\nm\fm\16m\u053c\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5n\u0547\nn\3o\7o\u054a"+
		"\no\fo\16o\u054d\13o\3o\3o\3o\3o\3o\3p\3p\7p\u0556\np\fp\16p\u0559\13"+
		"p\3p\3p\3q\3q\3q\3q\3q\5q\u0562\nq\3r\7r\u0565\nr\fr\16r\u0568\13r\3r"+
		"\3r\3r\3r\3r\5r\u056f\nr\3r\5r\u0572\nr\3r\3r\3s\3s\3s\5s\u0579\ns\3t"+
		"\3t\3t\3u\3u\3u\5u\u0581\nu\3v\3v\3v\3v\5v\u0587\nv\3v\3v\3w\3w\3w\7w"+
		"\u058e\nw\fw\16w\u0591\13w\3x\3x\3x\3x\3y\3y\3y\5y\u059a\ny\3z\3z\5z\u059e"+
		"\nz\3z\5z\u05a1\nz\3z\3z\3{\3{\3{\7{\u05a8\n{\f{\16{\u05ab\13{\3|\3|\3"+
		"|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05b8\n~\3~\5~\u05bb\n~\3~\3~\3\177\3\177"+
		"\3\177\7\177\u05c2\n\177\f\177\16\177\u05c5\13\177\3\u0080\3\u0080\5\u0080"+
		"\u05c9\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u05cf\n\u0081\f"+
		"\u0081\16\u0081\u05d2\13\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u05d7\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0084\7\u0084\u05dd\n\u0084\f\u0084\16"+
		"\u0084\u05e0\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u05eb\n\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u05f2\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0600\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0618\n\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u063a\n\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u0644"+
		"\n\u0092\f\u0092\16\u0092\u0647\13\u0092\3\u0092\7\u0092\u064a\n\u0092"+
		"\f\u0092\16\u0092\u064d\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\7\u0094\u0656\n\u0094\f\u0094\16\u0094\u0659\13\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u0665\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\5\u009a\u067f\n\u009a\3\u009b\3\u009b\5\u009b\u0683\n\u009b\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u0688\n\u009c\3\u009c\3\u009c\5\u009c\u068c"+
		"\n\u009c\3\u009c\3\u009c\5\u009c\u0690\n\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\5\u009d\u0698\n\u009d\3\u009d\3\u009d\5\u009d"+
		"\u069c\n\u009d\3\u009d\3\u009d\5\u009d\u06a0\n\u009d\3\u009d\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\5\u009e\u06a7\n\u009e\3\u009f\3\u009f\3\u00a0\3"+
		"\u00a0\3\u00a0\7\u00a0\u06ae\n\u00a0\f\u00a0\16\u00a0\u06b1\13\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\7\u00a1\u06b6\n\u00a1\f\u00a1\16\u00a1\u06b9\13"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\7\u00a2\u06c5\n\u00a2\f\u00a2\16\u00a2\u06c8\13\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\5\u00a3\u06d3\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06d9\n"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06df\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u06f4\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u06f9\n\u00a8\3"+
		"\u00a9\3\u00a9\7\u00a9\u06fd\n\u00a9\f\u00a9\16\u00a9\u0700\13\u00a9\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u0709\n"+
		"\u00ab\f\u00ab\16\u00ab\u070c\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\7\u00ac\u0714\n\u00ac\f\u00ac\16\u00ac\u0717\13\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0720"+
		"\n\u00ae\3\u00ae\5\u00ae\u0723\n\u00ae\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0728\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u072f\n"+
		"\u00b0\f\u00b0\16\u00b0\u0732\13\u00b0\3\u00b1\7\u00b1\u0735\n\u00b1\f"+
		"\u00b1\16\u00b1\u0738\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\5\u00b2\u0741\n\u00b2\3\u00b2\7\u00b2\u0744\n\u00b2\f"+
		"\u00b2\16\u00b2\u0747\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u074d\n\u00b3\f\u00b3\16\u00b3\u0750\13\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0766\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5"+
		"\u076e\n\u00b5\f\u00b5\16\u00b5\u0771\13\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0786"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u078d\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0795\n\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u079b\n\u00b9\f\u00b9\16\u00b9"+
		"\u079e\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9"+
		"\u07a6\n\u00b9\f\u00b9\16\u00b9\u07a9\13\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u07bf\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb"+
		"\u07c7\n\u00bb\f\u00bb\16\u00bb\u07ca\13\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07d2\n\u00bb\f\u00bb\16\u00bb\u07d5"+
		"\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u07ea\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u07ee\n"+
		"\u00bc\3\u00bc\7\u00bc\u07f1\n\u00bc\f\u00bc\16\u00bc\u07f4\13\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\7\u00bc\u07f9\n\u00bc\f\u00bc\16\u00bc\u07fc\13"+
		"\u00bc\3\u00bc\7\u00bc\u07ff\n\u00bc\f\u00bc\16\u00bc\u0802\13\u00bc\3"+
		"\u00bc\5\u00bc\u0805\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0809\n\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u080d\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u0813\n\u00bc\3\u00bc\7\u00bc\u0816\n\u00bc\f\u00bc\16\u00bc\u0819\13"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u081d\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0821"+
		"\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0825\n\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u082b\n\u00bc\3\u00bc\7\u00bc\u082e\n\u00bc\f\u00bc\16"+
		"\u00bc\u0831\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0835\n\u00bc\3\u00bc\3"+
		"\u00bc\5\u00bc\u0839\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u083d\n\u00bc\5\u00bc"+
		"\u083f\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0844\n\u00bd\3\u00bd\7"+
		"\u00bd\u0847\n\u00bd\f\u00bd\16\u00bd\u084a\13\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u084e\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0852\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0856\n\u00bd\3\u00be\3\u00be\5\u00be\u085a\n\u00be\3\u00be\7"+
		"\u00be\u085d\n\u00be\f\u00be\16\u00be\u0860\13\u00be\3\u00be\3\u00be\3"+
		"\u00be\7\u00be\u0865\n\u00be\f\u00be\16\u00be\u0868\13\u00be\3\u00be\7"+
		"\u00be\u086b\n\u00be\f\u00be\16\u00be\u086e\13\u00be\3\u00be\5\u00be\u0871"+
		"\n\u00be\3\u00be\3\u00be\5\u00be\u0875\n\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0879\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u087f\n\u00be\3"+
		"\u00be\7\u00be\u0882\n\u00be\f\u00be\16\u00be\u0885\13\u00be\3\u00be\3"+
		"\u00be\5\u00be\u0889\n\u00be\3\u00be\3\u00be\5\u00be\u088d\n\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0891\n\u00be\5\u00be\u0893\n\u00be\3\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u0898\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u08a7\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08b5\n\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u08c1\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u08c8\n\u00c3\f\u00c3\16\u00c3\u08cb\13\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08d7"+
		"\n\u00c4\f\u00c4\16\u00c4\u08da\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08e6\n\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u08ed\n\u00c5\f\u00c5"+
		"\16\u00c5\u08f0\13\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08f5\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08fc\n\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0901\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u0908\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090d\n"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0914\n\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u0919\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0920\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0925"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u092d"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0932\n\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0936\n\u00c6\3\u00c7\3\u00c7\5\u00c7\u093a\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u093f\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u0946\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u094d\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0952\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0959\n\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u095e\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u0965\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u096a\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0972\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0977\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u097b"+
		"\n\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u0980\n\u00c9\f\u00c9\16\u00c9"+
		"\u0983\13\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0988\n\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u098f\n\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0996\n\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u099d\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u09a5\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u09ac\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u09b4\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u09b8\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09bf\n\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09c6\n\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u09cd\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u09d5\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\5\u00cc\u09dc\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\5\u00cc\u09e4\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5"+
		"\u00cd\u09ea\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09f0\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u09fc\n\u00cd\3\u00ce\3\u00ce\7\u00ce\u0a00\n\u00ce\f"+
		"\u00ce\16\u00ce\u0a03\13\u00ce\3\u00cf\7\u00cf\u0a06\n\u00cf\f\u00cf\16"+
		"\u00cf\u0a09\13\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d1\3\u00d1\5\u00d1\u0a13\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a1c\n\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\5\u00d3\u0a23\n\u00d3\3\u00d4\3\u00d4\3\u00d4\7\u00d4"+
		"\u0a28\n\u00d4\f\u00d4\16\u00d4\u0a2b\13\u00d4\3\u00d5\3\u00d5\5\u00d5"+
		"\u0a2f\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a33\n\u00d6\3\u00d7\3\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a3c\n\u00d8\3\u00d9\3"+
		"\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0a47\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db"+
		"\u0a4f\n\u00db\f\u00db\16\u00db\u0a52\13\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a5a\n\u00dc\f\u00dc\16\u00dc\u0a5d"+
		"\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a65"+
		"\n\u00dd\f\u00dd\16\u00dd\u0a68\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\7\u00de\u0a70\n\u00de\f\u00de\16\u00de\u0a73\13\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a7b\n\u00df"+
		"\f\u00df\16\u00df\u0a7e\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a89\n\u00e0\f\u00e0\16\u00e0"+
		"\u0a8c\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\7\u00e1\u0aa0\n\u00e1\f\u00e1\16\u00e1\u0aa3\13\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0ab5"+
		"\n\u00e2\f\u00e2\16\u00e2\u0ab8\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ac3\n\u00e3\f\u00e3"+
		"\16\u00e3\u0ac6\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ad4\n\u00e4"+
		"\f\u00e4\16\u00e4\u0ad7\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\5\u00e5\u0ae0\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8"+
		"\u0aee\n\u00e8\3\u00e9\3\u00e9\5\u00e9\u0af2\n\u00e9\3\u00e9\3\u00e9\7"+
		"\u00e9\u0af6\n\u00e9\f\u00e9\16\u00e9\u0af9\13\u00e9\3\u00ea\3\u00ea\3"+
		"\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b0d"+
		"\n\u00ee\f\u00ee\16\u00ee\u0b10\13\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\7\u00ee\u0b18\n\u00ee\f\u00ee\16\u00ee\u0b1b\13\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b20\n\u00ee\3\u00ee\2\17\66:@\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u00ef\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\2\6\3\2\65:\7\2"+
		"\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2DD]g\u0c14\2\u01dc\3\2\2\2"+
		"\4\u01e0\3\2\2\2\6\u01f0\3\2\2\2\b\u01f4\3\2\2\2\n\u01f6\3\2\2\2\f\u01f8"+
		"\3\2\2\2\16\u01fd\3\2\2\2\20\u0201\3\2\2\2\22\u0220\3\2\2\2\24\u0222\3"+
		"\2\2\2\26\u0230\3\2\2\2\30\u0237\3\2\2\2\32\u0239\3\2\2\2\34\u023b\3\2"+
		"\2\2\36\u0240\3\2\2\2 \u024e\3\2\2\2\"\u0253\3\2\2\2$\u0268\3\2\2\2&\u026f"+
		"\3\2\2\2(\u027b\3\2\2\2*\u027d\3\2\2\2,\u0280\3\2\2\2.\u0284\3\2\2\2\60"+
		"\u028e\3\2\2\2\62\u0293\3\2\2\2\64\u029e\3\2\2\2\66\u02a0\3\2\2\28\u02b0"+
		"\3\2\2\2:\u02b2\3\2\2\2<\u02c2\3\2\2\2>\u02c4\3\2\2\2@\u02c6\3\2\2\2B"+
		"\u02d4\3\2\2\2D\u02d9\3\2\2\2F\u02e7\3\2\2\2H\u02ed\3\2\2\2J\u02ef\3\2"+
		"\2\2L\u02f3\3\2\2\2N\u02f9\3\2\2\2P\u0300\3\2\2\2R\u030a\3\2\2\2T\u030e"+
		"\3\2\2\2V\u0313\3\2\2\2X\u032b\3\2\2\2Z\u032d\3\2\2\2\\\u0331\3\2\2\2"+
		"^\u0339\3\2\2\2`\u033c\3\2\2\2b\u033f\3\2\2\2d\u0347\3\2\2\2f\u0354\3"+
		"\2\2\2h\u035b\3\2\2\2j\u0360\3\2\2\2l\u036f\3\2\2\2n\u0371\3\2\2\2p\u0379"+
		"\3\2\2\2r\u037e\3\2\2\2t\u0384\3\2\2\2v\u0388\3\2\2\2x\u038c\3\2\2\2z"+
		"\u0391\3\2\2\2|\u0395\3\2\2\2~\u03ae\3\2\2\2\u0080\u03b0\3\2\2\2\u0082"+
		"\u03bb\3\2\2\2\u0084\u03bf\3\2\2\2\u0086\u03c1\3\2\2\2\u0088\u03c3\3\2"+
		"\2\2\u008a\u03c5\3\2\2\2\u008c\u03d0\3\2\2\2\u008e\u03d5\3\2\2\2\u0090"+
		"\u03e5\3\2\2\2\u0092\u03f8\3\2\2\2\u0094\u03fc\3\2\2\2\u0096\u03fe\3\2"+
		"\2\2\u0098\u040c\3\2\2\2\u009a\u041e\3\2\2\2\u009c\u0423\3\2\2\2\u009e"+
		"\u042b\3\2\2\2\u00a0\u043e\3\2\2\2\u00a2\u0443\3\2\2\2\u00a4\u044d\3\2"+
		"\2\2\u00a6\u0450\3\2\2\2\u00a8\u045a\3\2\2\2\u00aa\u045e\3\2\2\2\u00ac"+
		"\u0460\3\2\2\2\u00ae\u0462\3\2\2\2\u00b0\u0468\3\2\2\2\u00b2\u0475\3\2"+
		"\2\2\u00b4\u0478\3\2\2\2\u00b6\u0481\3\2\2\2\u00b8\u0483\3\2\2\2\u00ba"+
		"\u04ba\3\2\2\2\u00bc\u04bf\3\2\2\2\u00be\u04c9\3\2\2\2\u00c0\u04d5\3\2"+
		"\2\2\u00c2\u04e0\3\2\2\2\u00c4\u04ee\3\2\2\2\u00c6\u04f0\3\2\2\2\u00c8"+
		"\u04f9\3\2\2\2\u00ca\u04fe\3\2\2\2\u00cc\u0512\3\2\2\2\u00ce\u0514\3\2"+
		"\2\2\u00d0\u0517\3\2\2\2\u00d2\u0525\3\2\2\2\u00d4\u052a\3\2\2\2\u00d6"+
		"\u0535\3\2\2\2\u00d8\u053a\3\2\2\2\u00da\u0546\3\2\2\2\u00dc\u054b\3\2"+
		"\2\2\u00de\u0553\3\2\2\2\u00e0\u0561\3\2\2\2\u00e2\u0566\3\2\2\2\u00e4"+
		"\u0578\3\2\2\2\u00e6\u057a\3\2\2\2\u00e8\u0580\3\2\2\2\u00ea\u0582\3\2"+
		"\2\2\u00ec\u058a\3\2\2\2\u00ee\u0592\3\2\2\2\u00f0\u0599\3\2\2\2\u00f2"+
		"\u059b\3\2\2\2\u00f4\u05a4\3\2\2\2\u00f6\u05ac\3\2\2\2\u00f8\u05af\3\2"+
		"\2\2\u00fa\u05b5\3\2\2\2\u00fc\u05be\3\2\2\2\u00fe\u05c6\3\2\2\2\u0100"+
		"\u05cc\3\2\2\2\u0102\u05d6\3\2\2\2\u0104\u05d8\3\2\2\2\u0106\u05de\3\2"+
		"\2\2\u0108\u05ea\3\2\2\2\u010a\u05f1\3\2\2\2\u010c\u05ff\3\2\2\2\u010e"+
		"\u0601\3\2\2\2\u0110\u0603\3\2\2\2\u0112\u0607\3\2\2\2\u0114\u060b\3\2"+
		"\2\2\u0116\u0617\3\2\2\2\u0118\u0619\3\2\2\2\u011a\u061f\3\2\2\2\u011c"+
		"\u0627\3\2\2\2\u011e\u0639\3\2\2\2\u0120\u063b\3\2\2\2\u0122\u0641\3\2"+
		"\2\2\u0124\u0650\3\2\2\2\u0126\u0653\3\2\2\2\u0128\u0664\3\2\2\2\u012a"+
		"\u0666\3\2\2\2\u012c\u0668\3\2\2\2\u012e\u066e\3\2\2\2\u0130\u0674\3\2"+
		"\2\2\u0132\u067e\3\2\2\2\u0134\u0682\3\2\2\2\u0136\u0684\3\2\2\2\u0138"+
		"\u0694\3\2\2\2\u013a\u06a6\3\2\2\2\u013c\u06a8\3\2\2\2\u013e\u06aa\3\2"+
		"\2\2\u0140\u06b2\3\2\2\2\u0142\u06c1\3\2\2\2\u0144\u06d0\3\2\2\2\u0146"+
		"\u06d6\3\2\2\2\u0148\u06dc\3\2\2\2\u014a\u06e2\3\2\2\2\u014c\u06e6\3\2"+
		"\2\2\u014e\u06f8\3\2\2\2\u0150\u06fa\3\2\2\2\u0152\u0701\3\2\2\2\u0154"+
		"\u070a\3\2\2\2\u0156\u0710\3\2\2\2\u0158\u0718\3\2\2\2\u015a\u071b\3\2"+
		"\2\2\u015c\u0724\3\2\2\2\u015e\u072b\3\2\2\2\u0160\u0736\3\2\2\2\u0162"+
		"\u0740\3\2\2\2\u0164\u0765\3\2\2\2\u0166\u0767\3\2\2\2\u0168\u0785\3\2"+
		"\2\2\u016a\u078c\3\2\2\2\u016c\u078e\3\2\2\2\u016e\u0794\3\2\2\2\u0170"+
		"\u07be\3\2\2\2\u0172\u07c0\3\2\2\2\u0174\u07e9\3\2\2\2\u0176\u083e\3\2"+
		"\2\2\u0178\u0840\3\2\2\2\u017a\u0892\3\2\2\2\u017c\u0897\3\2\2\2\u017e"+
		"\u08a6\3\2\2\2\u0180\u08a8\3\2\2\2\u0182\u08b4\3\2\2\2\u0184\u08c0\3\2"+
		"\2\2\u0186\u08cc\3\2\2\2\u0188\u08e5\3\2\2\2\u018a\u0935\3\2\2\2\u018c"+
		"\u0937\3\2\2\2\u018e\u097a\3\2\2\2\u0190\u097c\3\2\2\2\u0192\u09b3\3\2"+
		"\2\2\u0194\u09b5\3\2\2\2\u0196\u09e3\3\2\2\2\u0198\u09fb\3\2\2\2\u019a"+
		"\u09fd\3\2\2\2\u019c\u0a07\3\2\2\2\u019e\u0a0e\3\2\2\2\u01a0\u0a12\3\2"+
		"\2\2\u01a2\u0a14\3\2\2\2\u01a4\u0a22\3\2\2\2\u01a6\u0a24\3\2\2\2\u01a8"+
		"\u0a2e\3\2\2\2\u01aa\u0a32\3\2\2\2\u01ac\u0a34\3\2\2\2\u01ae\u0a3b\3\2"+
		"\2\2\u01b0\u0a3d\3\2\2\2\u01b2\u0a46\3\2\2\2\u01b4\u0a48\3\2\2\2\u01b6"+
		"\u0a53\3\2\2\2\u01b8\u0a5e\3\2\2\2\u01ba\u0a69\3\2\2\2\u01bc\u0a74\3\2"+
		"\2\2\u01be\u0a7f\3\2\2\2\u01c0\u0a8d\3\2\2\2\u01c2\u0aa4\3\2\2\2\u01c4"+
		"\u0ab9\3\2\2\2\u01c6\u0ac7\3\2\2\2\u01c8\u0adf\3\2\2\2\u01ca\u0ae1\3\2"+
		"\2\2\u01cc\u0ae4\3\2\2\2\u01ce\u0aed\3\2\2\2\u01d0\u0af1\3\2\2\2\u01d2"+
		"\u0afa\3\2\2\2\u01d4\u0afd\3\2\2\2\u01d6\u0aff\3\2\2\2\u01d8\u0b02\3\2"+
		"\2\2\u01da\u0b1f\3\2\2\2\u01dc\u01dd\t\2\2\2\u01dd\3\3\2\2\2\u01de\u01e1"+
		"\5\6\4\2\u01df\u01e1\5\16\b\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2"+
		"\u01e1\5\3\2\2\2\u01e2\u01e4\5\u00e8u\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01f1\5\b\5\2\u01e9\u01eb\5\u00e8u\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\7\5\2\2\u01f0\u01e5\3\2"+
		"\2\2\u01f0\u01ec\3\2\2\2\u01f1\7\3\2\2\2\u01f2\u01f5\5\n\6\2\u01f3\u01f5"+
		"\5\f\7\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\t\3\2\2\2\u01f6"+
		"\u01f7\t\3\2\2\u01f7\13\3\2\2\2\u01f8\u01f9\t\4\2\2\u01f9\r\3\2\2\2\u01fa"+
		"\u01fe\5\20\t\2\u01fb\u01fe\5\36\20\2\u01fc\u01fe\5 \21\2\u01fd\u01fa"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\17\3\2\2\2\u01ff"+
		"\u0202\5\26\f\2\u0200\u0202\5\34\17\2\u0201\u01ff\3\2\2\2\u0201\u0200"+
		"\3\2\2\2\u0202\u0207\3\2\2\2\u0203\u0206\5\24\13\2\u0204\u0206\5\32\16"+
		"\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\21\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020c\5\u00e8u\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0212\7h\2\2\u0211\u0213\5,\27\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0221\3\2\2\2\u0214\u0215\5\20\t\2\u0215\u0219\7C\2\2\u0216"+
		"\u0218\5\u00e8u\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u021e\7h\2\2\u021d\u021f\5,\27\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0221\3\2\2\2\u0220\u020d\3\2\2\2\u0220\u0214\3\2\2\2\u0221"+
		"\23\3\2\2\2\u0222\u0226\7C\2\2\u0223\u0225\5\u00e8u\2\u0224\u0223\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\7h\2\2\u022a\u022c\5,\27"+
		"\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\25\3\2\2\2\u022d\u022f"+
		"\5\u00e8u\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235"+
		"\7h\2\2\u0234\u0236\5,\27\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\27\3\2\2\2\u0237\u0238\5\22\n\2\u0238\31\3\2\2\2\u0239\u023a\5\24\13"+
		"\2\u023a\33\3\2\2\2\u023b\u023c\5\26\f\2\u023c\35\3\2\2\2\u023d\u023f"+
		"\5\u00e8u\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244"+
		"\7h\2\2\u0244\37\3\2\2\2\u0245\u0246\5\6\4\2\u0246\u0247\5\"\22\2\u0247"+
		"\u024f\3\2\2\2\u0248\u0249\5\20\t\2\u0249\u024a\5\"\22\2\u024a\u024f\3"+
		"\2\2\2\u024b\u024c\5\36\20\2\u024c\u024d\5\"\22\2\u024d\u024f\3\2\2\2"+
		"\u024e\u0245\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u024b\3\2\2\2\u024f!\3"+
		"\2\2\2\u0250\u0252\5\u00e8u\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2"+
		"\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253"+
		"\3\2\2\2\u0256\u0257\7?\2\2\u0257\u0262\7@\2\2\u0258\u025a\5\u00e8u\2"+
		"\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\7?\2\2\u025f"+
		"\u0261\7@\2\2\u0260\u025b\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263#\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267"+
		"\5&\24\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\7h"+
		"\2\2\u026c\u026e\5(\25\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"%\3\2\2\2\u026f\u0270\5\u00e8u\2\u0270\'\3\2\2\2\u0271\u0272\7\23\2\2"+
		"\u0272\u027c\5\36\20\2\u0273\u0274\7\23\2\2\u0274\u0278\5\20\t\2\u0275"+
		"\u0277\5*\26\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u0271\3\2\2\2\u027b\u0273\3\2\2\2\u027c)\3\2\2\2\u027d\u027e\7W\2\2\u027e"+
		"\u027f\5\30\r\2\u027f+\3\2\2\2\u0280\u0281\7F\2\2\u0281\u0282\5.\30\2"+
		"\u0282\u0283\7E\2\2\u0283-\3\2\2\2\u0284\u0289\5\60\31\2\u0285\u0286\7"+
		"B\2\2\u0286\u0288\5\60\31\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a/\3\2\2\2\u028b\u0289\3\2\2\2"+
		"\u028c\u028f\5\16\b\2\u028d\u028f\5\62\32\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028d\3\2\2\2\u028f\61\3\2\2\2\u0290\u0292\5\u00e8u\2\u0291\u0290\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7I\2\2\u0297\u0299\5\64"+
		"\33\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\63\3\2\2\2\u029a\u029b"+
		"\7\23\2\2\u029b\u029f\5\16\b\2\u029c\u029d\7*\2\2\u029d\u029f\5\16\b\2"+
		"\u029e\u029a\3\2\2\2\u029e\u029c\3\2\2\2\u029f\65\3\2\2\2\u02a0\u02a1"+
		"\b\34\1\2\u02a1\u02a2\7h\2\2\u02a2\u02a8\3\2\2\2\u02a3\u02a4\f\3\2\2\u02a4"+
		"\u02a5\7C\2\2\u02a5\u02a7\7h\2\2\u02a6\u02a3\3\2\2\2\u02a7\u02aa\3\2\2"+
		"\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\67\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02ab\u02b1\7h\2\2\u02ac\u02ad\5:\36\2\u02ad\u02ae\7C\2\2\u02ae"+
		"\u02af\7h\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b0\u02ac\3\2"+
		"\2\2\u02b19\3\2\2\2\u02b2\u02b3\b\36\1\2\u02b3\u02b4\7h\2\2\u02b4\u02ba"+
		"\3\2\2\2\u02b5\u02b6\f\3\2\2\u02b6\u02b7\7C\2\2\u02b7\u02b9\7h\2\2\u02b8"+
		"\u02b5\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb;\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02c3\7h\2\2\u02be\u02bf"+
		"\5@!\2\u02bf\u02c0\7C\2\2\u02c0\u02c1\7h\2\2\u02c1\u02c3\3\2\2\2\u02c2"+
		"\u02bd\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3=\3\2\2\2\u02c4\u02c5\7h\2\2\u02c5"+
		"?\3\2\2\2\u02c6\u02c7\b!\1\2\u02c7\u02c8\7h\2\2\u02c8\u02ce\3\2\2\2\u02c9"+
		"\u02ca\f\3\2\2\u02ca\u02cb\7C\2\2\u02cb\u02cd\7h\2\2\u02cc\u02c9\3\2\2"+
		"\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfA"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d5\5f\64\2\u02d2\u02d5\5\u0100\u0081"+
		"\2\u02d3\u02d5\5H%\2\u02d4\u02d1\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5C\3\2\2\2\u02d6\u02d8\5F$\2\u02d7\u02d6\3\2\2\2\u02d8\u02db"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dc\u02dd\7\"\2\2\u02dd\u02e2\7h\2\2\u02de\u02df\7C\2"+
		"\2\u02df\u02e1\7h\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5"+
		"\u02e6\7A\2\2\u02e6E\3\2\2\2\u02e7\u02e8\5\u00e8u\2\u02e8G\3\2\2\2\u02e9"+
		"\u02ee\5J&\2\u02ea\u02ee\5L\'\2\u02eb\u02ee\5N(\2\u02ec\u02ee\5P)\2\u02ed"+
		"\u02e9\3\2\2\2\u02ed\u02ea\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2"+
		"\2\2\u02eeI\3\2\2\2\u02ef\u02f0\7\33\2\2\u02f0\u02f1\58\35\2\u02f1\u02f2"+
		"\7A\2\2\u02f2K\3\2\2\2\u02f3\u02f4\7\33\2\2\u02f4\u02f5\5:\36\2\u02f5"+
		"\u02f6\7C\2\2\u02f6\u02f7\7U\2\2\u02f7\u02f8\7A\2\2\u02f8M\3\2\2\2\u02f9"+
		"\u02fa\7\33\2\2\u02fa\u02fb\7(\2\2\u02fb\u02fc\58\35\2\u02fc\u02fd\7C"+
		"\2\2\u02fd\u02fe\7h\2\2\u02fe\u02ff\7A\2\2\u02ffO\3\2\2\2\u0300\u0301"+
		"\7\33\2\2\u0301\u0302\7(\2\2\u0302\u0303\58\35\2\u0303\u0304\7C\2\2\u0304"+
		"\u0305\7U\2\2\u0305\u0306\7A\2\2\u0306Q\3\2\2\2\u0307\u030b\5T+\2\u0308"+
		"\u030b\5\u00c8e\2\u0309\u030b\7A\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3"+
		"\2\2\2\u030a\u0309\3\2\2\2\u030bS\3\2\2\2\u030c\u030f\5V,\2\u030d\u030f"+
		"\5\u00bc_\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030fU\3\2\2\2\u0310"+
		"\u0312\5X-\2\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317"+
		"\7\13\2\2\u0317\u0319\7h\2\2\u0318\u031a\5Z.\2\u0319\u0318\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u031d\5^\60\2\u031c\u031b\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0320\5`\61\2\u031f"+
		"\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\5d"+
		"\63\2\u0322W\3\2\2\2\u0323\u032c\5\u00e8u\2\u0324\u032c\7%\2\2\u0325\u032c"+
		"\7$\2\2\u0326\u032c\7#\2\2\u0327\u032c\7\3\2\2\u0328\u032c\7(\2\2\u0329"+
		"\u032c\7\24\2\2\u032a\u032c\7)\2\2\u032b\u0323\3\2\2\2\u032b\u0324\3\2"+
		"\2\2\u032b\u0325\3\2\2\2\u032b\u0326\3\2\2\2\u032b\u0327\3\2\2\2\u032b"+
		"\u0328\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032cY\3\2\2\2"+
		"\u032d\u032e\7F\2\2\u032e\u032f\5\\/\2\u032f\u0330\7E\2\2\u0330[\3\2\2"+
		"\2\u0331\u0336\5$\23\2\u0332\u0333\7B\2\2\u0333\u0335\5$\23\2\u0334\u0332"+
		"\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"]\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a\7\23\2\2\u033a\u033b\5\22\n"+
		"\2\u033b_\3\2\2\2\u033c\u033d\7\32\2\2\u033d\u033e\5b\62\2\u033ea\3\2"+
		"\2\2\u033f\u0344\5\30\r\2\u0340\u0341\7B\2\2\u0341\u0343\5\30\r\2\u0342"+
		"\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345c\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u034b\7=\2\2\u0348\u034a"+
		"\5f\64\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7>"+
		"\2\2\u034fe\3\2\2\2\u0350\u0355\5h\65\2\u0351\u0355\5\u00acW\2\u0352\u0355"+
		"\5\u00aeX\2\u0353\u0355\5\u00b0Y\2\u0354\u0350\3\2\2\2\u0354\u0351\3\2"+
		"\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355g\3\2\2\2\u0356\u035c"+
		"\5j\66\2\u0357\u035c\5\u008eH\2\u0358\u035c\5T+\2\u0359\u035c\5\u00c8"+
		"e\2\u035a\u035c\7A\2\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035b\u0358"+
		"\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035ci\3\2\2\2\u035d"+
		"\u035f\5l\67\2\u035e\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363"+
		"\u0364\5v<\2\u0364\u0365\5n8\2\u0365\u0366\7A\2\2\u0366k\3\2\2\2\u0367"+
		"\u0370\5\u00e8u\2\u0368\u0370\7%\2\2\u0369\u0370\7$\2\2\u036a\u0370\7"+
		"#\2\2\u036b\u0370\7(\2\2\u036c\u0370\7\24\2\2\u036d\u0370\7\60\2\2\u036e"+
		"\u0370\7\63\2\2\u036f\u0367\3\2\2\2\u036f\u0368\3\2\2\2\u036f\u0369\3"+
		"\2\2\2\u036f\u036a\3\2\2\2\u036f\u036b\3\2\2\2\u036f\u036c\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370m\3\2\2\2\u0371\u0376\5p9\2\u0372"+
		"\u0373\7B\2\2\u0373\u0375\5p9\2\u0374\u0372\3\2\2\2\u0375\u0378\3\2\2"+
		"\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377o\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0379\u037c\5r:\2\u037a\u037b\7D\2\2\u037b\u037d\5t;\2\u037c"+
		"\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037dq\3\2\2\2\u037e\u0380\7h\2\2\u037f"+
		"\u0381\5\"\22\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381s\3\2\2\2"+
		"\u0382\u0385\5\u01a0\u00d1\2\u0383\u0385\5\u00fa~\2\u0384\u0382\3\2\2"+
		"\2\u0384\u0383\3\2\2\2\u0385u\3\2\2\2\u0386\u0389\5x=\2\u0387\u0389\5"+
		"z>\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389w\3\2\2\2\u038a\u038d"+
		"\5\b\5\2\u038b\u038d\7\5\2\2\u038c\u038a\3\2\2\2\u038c\u038b\3\2\2\2\u038d"+
		"y\3\2\2\2\u038e\u0392\5|?\2\u038f\u0392\5\u008aF\2\u0390\u0392\5\u008c"+
		"G\2\u0391\u038e\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0390\3\2\2\2\u0392"+
		"{\3\2\2\2\u0393\u0396\5\u0082B\2\u0394\u0396\5\u0088E\2\u0395\u0393\3"+
		"\2\2\2\u0395\u0394\3\2\2\2\u0396\u039b\3\2\2\2\u0397\u039a\5\u0080A\2"+
		"\u0398\u039a\5\u0086D\2\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039a"+
		"\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c}\3\2\2\2"+
		"\u039d\u039b\3\2\2\2\u039e\u03a0\7h\2\2\u039f\u03a1\5,\27\2\u03a0\u039f"+
		"\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03af\3\2\2\2\u03a2\u03a3\5|?\2\u03a3"+
		"\u03a7\7C\2\2\u03a4\u03a6\5\u00e8u\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3"+
		"\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03aa\u03ac\7h\2\2\u03ab\u03ad\5,\27\2\u03ac\u03ab\3\2"+
		"\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u039e\3\2\2\2\u03ae"+
		"\u03a2\3\2\2\2\u03af\177\3\2\2\2\u03b0\u03b4\7C\2\2\u03b1\u03b3\5\u00e8"+
		"u\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b9\7h"+
		"\2\2\u03b8\u03ba\5,\27\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u0081\3\2\2\2\u03bb\u03bd\7h\2\2\u03bc\u03be\5,\27\2\u03bd\u03bc\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u0083\3\2\2\2\u03bf\u03c0\5~@\2\u03c0\u0085"+
		"\3\2\2\2\u03c1\u03c2\5\u0080A\2\u03c2\u0087\3\2\2\2\u03c3\u03c4\5\u0082"+
		"B\2\u03c4\u0089\3\2\2\2\u03c5\u03c6\7h\2\2\u03c6\u008b\3\2\2\2\u03c7\u03c8"+
		"\5x=\2\u03c8\u03c9\5\"\22\2\u03c9\u03d1\3\2\2\2\u03ca\u03cb\5|?\2\u03cb"+
		"\u03cc\5\"\22\2\u03cc\u03d1\3\2\2\2\u03cd\u03ce\5\u008aF\2\u03ce\u03cf"+
		"\5\"\22\2\u03cf\u03d1\3\2\2\2\u03d0\u03c7\3\2\2\2\u03d0\u03ca\3\2\2\2"+
		"\u03d0\u03cd\3\2\2\2\u03d1\u008d\3\2\2\2\u03d2\u03d4\5\u0090I\2\u03d3"+
		"\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03d9\5\u0092J\2\u03d9"+
		"\u03da\5\u00aaV\2\u03da\u008f\3\2\2\2\u03db\u03e6\5\u00e8u\2\u03dc\u03e6"+
		"\7%\2\2\u03dd\u03e6\7$\2\2\u03de\u03e6\7#\2\2\u03df\u03e6\7\3\2\2\u03e0"+
		"\u03e6\7(\2\2\u03e1\u03e6\7\24\2\2\u03e2\u03e6\7,\2\2\u03e3\u03e6\7 \2"+
		"\2\u03e4\u03e6\7)\2\2\u03e5\u03db\3\2\2\2\u03e5\u03dc\3\2\2\2\u03e5\u03dd"+
		"\3\2\2\2\u03e5\u03de\3\2\2\2\u03e5\u03df\3\2\2\2\u03e5\u03e0\3\2\2\2\u03e5"+
		"\u03e1\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2"+
		"\2\2\u03e6\u0091\3\2\2\2\u03e7\u03e8\5\u0094K\2\u03e8\u03ea\5\u0096L\2"+
		"\u03e9\u03eb\5\u00a4S\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03f9\3\2\2\2\u03ec\u03f0\5Z.\2\u03ed\u03ef\5\u00e8u\2\u03ee\u03ed\3"+
		"\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1"+
		"\u03f3\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\5\u0094K\2\u03f4\u03f6"+
		"\5\u0096L\2\u03f5\u03f7\5\u00a4S\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03e7\3\2\2\2\u03f8\u03ec\3\2\2\2\u03f9"+
		"\u0093\3\2\2\2\u03fa\u03fd\5v<\2\u03fb\u03fd\7\62\2\2\u03fc\u03fa\3\2"+
		"\2\2\u03fc\u03fb\3\2\2\2\u03fd\u0095\3\2\2\2\u03fe\u03ff\7h\2\2\u03ff"+
		"\u0401\7;\2\2\u0400\u0402\5\u0098M\2\u0401\u0400\3\2\2\2\u0401\u0402\3"+
		"\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\7<\2\2\u0404\u0406\5\"\22\2\u0405"+
		"\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0097\3\2\2\2\u0407\u0408\5\u009a"+
		"N\2\u0408\u0409\7B\2\2\u0409\u040a\5\u00a0Q\2\u040a\u040d\3\2\2\2\u040b"+
		"\u040d\5\u00a0Q\2\u040c\u0407\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u0099"+
		"\3\2\2\2\u040e\u0413\5\u009cO\2\u040f\u0410\7B\2\2\u0410\u0412\5\u009c"+
		"O\2\u0411\u040f\3\2\2\2\u0412\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u041f\3\2\2\2\u0415\u0413\3\2\2\2\u0416\u041b\5\u00a2"+
		"R\2\u0417\u0418\7B\2\2\u0418\u041a\5\u009cO\2\u0419\u0417\3\2\2\2\u041a"+
		"\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041f\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041e\u040e\3\2\2\2\u041e\u0416\3\2\2\2\u041f"+
		"\u009b\3\2\2\2\u0420\u0422\5\u009eP\2\u0421\u0420\3\2\2\2\u0422\u0425"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0426\u0427\5v<\2\u0427\u0428\5r:\2\u0428\u009d\3\2\2\2"+
		"\u0429\u042c\5\u00e8u\2\u042a\u042c\7\24\2\2\u042b\u0429\3\2\2\2\u042b"+
		"\u042a\3\2\2\2\u042c\u009f\3\2\2\2\u042d\u042f\5\u009eP\2\u042e\u042d"+
		"\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0433\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u0437\5v<\2\u0434\u0436\5\u00e8"+
		"u\2\u0435\u0434\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b\7j"+
		"\2\2\u043b\u043c\5r:\2\u043c\u043f\3\2\2\2\u043d\u043f\5\u009cO\2\u043e"+
		"\u0430\3\2\2\2\u043e\u043d\3\2\2\2\u043f\u00a1\3\2\2\2\u0440\u0442\5\u00e8"+
		"u\2\u0441\u0440\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u0446\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u0449\5v"+
		"<\2\u0447\u0448\7h\2\2\u0448\u044a\7C\2\2\u0449\u0447\3\2\2\2\u0449\u044a"+
		"\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\7-\2\2\u044c\u00a3\3\2\2\2\u044d"+
		"\u044e\7/\2\2\u044e\u044f\5\u00a6T\2\u044f\u00a5\3\2\2\2\u0450\u0455\5"+
		"\u00a8U\2\u0451\u0452\7B\2\2\u0452\u0454\5\u00a8U\2\u0453\u0451\3\2\2"+
		"\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u00a7"+
		"\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045b\5\22\n\2\u0459\u045b\5\36\20"+
		"\2\u045a\u0458\3\2\2\2\u045a\u0459\3\2\2\2\u045b\u00a9\3\2\2\2\u045c\u045f"+
		"\5\u00fe\u0080\2\u045d\u045f\7A\2\2\u045e\u045c\3\2\2\2\u045e\u045d\3"+
		"\2\2\2\u045f\u00ab\3\2\2\2\u0460\u0461\5\u00fe\u0080\2\u0461\u00ad\3\2"+
		"\2\2\u0462\u0463\7(\2\2\u0463\u0464\5\u00fe\u0080\2\u0464\u00af\3\2\2"+
		"\2\u0465\u0467\5\u00b2Z\2\u0466\u0465\3\2\2\2\u0467\u046a\3\2\2\2\u0468"+
		"\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0468\3\2"+
		"\2\2\u046b\u046d\5\u00b4[\2\u046c\u046e\5\u00a4S\2\u046d\u046c\3\2\2\2"+
		"\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\5\u00b8]\2\u0470"+
		"\u00b1\3\2\2\2\u0471\u0476\5\u00e8u\2\u0472\u0476\7%\2\2\u0473\u0476\7"+
		"$\2\2\u0474\u0476\7#\2\2\u0475\u0471\3\2\2\2\u0475\u0472\3\2\2\2\u0475"+
		"\u0473\3\2\2\2\u0475\u0474\3\2\2\2\u0476\u00b3\3\2\2\2\u0477\u0479\5Z"+
		".\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u047b\5\u00b6\\\2\u047b\u047d\7;\2\2\u047c\u047e\5\u0098M\2\u047d\u047c"+
		"\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\7<\2\2\u0480"+
		"\u00b5\3\2\2\2\u0481\u0482\7h\2\2\u0482\u00b7\3\2\2\2\u0483\u0485\7=\2"+
		"\2\u0484\u0486\5\u00ba^\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0488\3\2\2\2\u0487\u0489\5\u0100\u0081\2\u0488\u0487\3\2\2\2\u0488\u0489"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7>\2\2\u048b\u00b9\3\2\2\2\u048c"+
		"\u048e\5,\27\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u0490\7-\2\2\u0490\u0492\7;\2\2\u0491\u0493\5\u0190\u00c9\2"+
		"\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495"+
		"\7<\2\2\u0495\u04bb\7A\2\2\u0496\u0498\5,\27\2\u0497\u0496\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\7*\2\2\u049a\u049c\7;\2"+
		"\2\u049b\u049d\5\u0190\u00c9\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2"+
		"\u049d\u049e\3\2\2\2\u049e\u049f\7<\2\2\u049f\u04bb\7A\2\2\u04a0\u04a1"+
		"\5<\37\2\u04a1\u04a3\7C\2\2\u04a2\u04a4\5,\27\2\u04a3\u04a2\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7*\2\2\u04a6\u04a8\7;\2"+
		"\2\u04a7\u04a9\5\u0190\u00c9\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2"+
		"\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7<\2\2\u04ab\u04ac\7A\2\2\u04ac\u04bb"+
		"\3\2\2\2\u04ad\u04ae\5\u0162\u00b2\2\u04ae\u04b0\7C\2\2\u04af\u04b1\5"+
		",\27\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b3\7*\2\2\u04b3\u04b5\7;\2\2\u04b4\u04b6\5\u0190\u00c9\2\u04b5\u04b4"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7<\2\2\u04b8"+
		"\u04b9\7A\2\2\u04b9\u04bb\3\2\2\2\u04ba\u048d\3\2\2\2\u04ba\u0497\3\2"+
		"\2\2\u04ba\u04a0\3\2\2\2\u04ba\u04ad\3\2\2\2\u04bb\u00bb\3\2\2\2\u04bc"+
		"\u04be\5X-\2\u04bd\u04bc\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2"+
		"\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c3"+
		"\7\22\2\2\u04c3\u04c5\7h\2\2\u04c4\u04c6\5`\61\2\u04c5\u04c4\3\2\2\2\u04c5"+
		"\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\5\u00be`\2\u04c8\u00bd"+
		"\3\2\2\2\u04c9\u04cb\7=\2\2\u04ca\u04cc\5\u00c0a\2\u04cb\u04ca\3\2\2\2"+
		"\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04cf\7B\2\2\u04ce\u04cd"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04d2\5\u00c6d"+
		"\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4"+
		"\7>\2\2\u04d4\u00bf\3\2\2\2\u04d5\u04da\5\u00c2b\2\u04d6\u04d7\7B\2\2"+
		"\u04d7\u04d9\5\u00c2b\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u00c1\3\2\2\2\u04dc\u04da\3\2"+
		"\2\2\u04dd\u04df\5\u00c4c\2\u04de\u04dd\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0"+
		"\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e0\3\2"+
		"\2\2\u04e3\u04e9\7h\2\2\u04e4\u04e6\7;\2\2\u04e5\u04e7\5\u0190\u00c9\2"+
		"\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea"+
		"\7<\2\2\u04e9\u04e4\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb"+
		"\u04ed\5d\63\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u00c3\3\2"+
		"\2\2\u04ee\u04ef\5\u00e8u\2\u04ef\u00c5\3\2\2\2\u04f0\u04f4\7A\2\2\u04f1"+
		"\u04f3\5f\64\2\u04f2\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2"+
		"\2\2\u04f4\u04f5\3\2\2\2\u04f5\u00c7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7"+
		"\u04fa\5\u00caf\2\u04f8\u04fa\5\u00dco\2\u04f9\u04f7\3\2\2\2\u04f9\u04f8"+
		"\3\2\2\2\u04fa\u00c9\3\2\2\2\u04fb\u04fd\5\u00ccg\2\u04fc\u04fb\3\2\2"+
		"\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501"+
		"\3\2\2\2\u0500\u04fe\3\2\2\2\u0501\u0502\7\36\2\2\u0502\u0504\7h\2\2\u0503"+
		"\u0505\5Z.\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2\2"+
		"\2\u0506\u0508\5\u00ceh\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\5\u00d0i\2\u050a\u00cb\3\2\2\2\u050b\u0513"+
		"\5\u00e8u\2\u050c\u0513\7%\2\2\u050d\u0513\7$\2\2\u050e\u0513\7#\2\2\u050f"+
		"\u0513\7\3\2\2\u0510\u0513\7(\2\2\u0511\u0513\7)\2\2\u0512\u050b\3\2\2"+
		"\2\u0512\u050c\3\2\2\2\u0512\u050d\3\2\2\2\u0512\u050e\3\2\2\2\u0512\u050f"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513\u00cd\3\2\2\2\u0514"+
		"\u0515\7\23\2\2\u0515\u0516\5b\62\2\u0516\u00cf\3\2\2\2\u0517\u051b\7"+
		"=\2\2\u0518\u051a\5\u00d2j\2\u0519\u0518\3\2\2\2\u051a\u051d\3\2\2\2\u051b"+
		"\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2"+
		"\2\2\u051e\u051f\7>\2\2\u051f\u00d1\3\2\2\2\u0520\u0526\5\u00d4k\2\u0521"+
		"\u0526\5\u00d8m\2\u0522\u0526\5T+\2\u0523\u0526\5\u00c8e\2\u0524\u0526"+
		"\7A\2\2\u0525\u0520\3\2\2\2\u0525\u0521\3\2\2\2\u0525\u0522\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u00d3\3\2\2\2\u0527\u0529\5\u00d6"+
		"l\2\u0528\u0527\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u052e\5v"+
		"<\2\u052e\u052f\5n8\2\u052f\u0530\7A\2\2\u0530\u00d5\3\2\2\2\u0531\u0536"+
		"\5\u00e8u\2\u0532\u0536\7%\2\2\u0533\u0536\7(\2\2\u0534\u0536\7\24\2\2"+
		"\u0535\u0531\3\2\2\2\u0535\u0532\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0534"+
		"\3\2\2\2\u0536\u00d7\3\2\2\2\u0537\u0539\5\u00dan\2\u0538\u0537\3\2\2"+
		"\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d"+
		"\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053e\5\u0092J\2\u053e\u053f\5\u00aa"+
		"V\2\u053f\u00d9\3\2\2\2\u0540\u0547\5\u00e8u\2\u0541\u0547\7%\2\2\u0542"+
		"\u0547\7\3\2\2\u0543\u0547\7\16\2\2\u0544\u0547\7(\2\2\u0545\u0547\7)"+
		"\2\2\u0546\u0540\3\2\2\2\u0546\u0541\3\2\2\2\u0546\u0542\3\2\2\2\u0546"+
		"\u0543\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0545\3\2\2\2\u0547\u00db\3\2"+
		"\2\2\u0548\u054a\5\u00ccg\2\u0549\u0548\3\2\2\2\u054a\u054d\3\2\2\2\u054b"+
		"\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u054b\3\2"+
		"\2\2\u054e\u054f\7i\2\2\u054f\u0550\7\36\2\2\u0550\u0551\7h\2\2\u0551"+
		"\u0552\5\u00dep\2\u0552\u00dd\3\2\2\2\u0553\u0557\7=\2\2\u0554\u0556\5"+
		"\u00e0q\2\u0555\u0554\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2"+
		"\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055b"+
		"\7>\2\2\u055b\u00df\3\2\2\2\u055c\u0562\5\u00e2r\2\u055d\u0562\5\u00d4"+
		"k\2\u055e\u0562\5T+\2\u055f\u0562\5\u00c8e\2\u0560\u0562\7A\2\2\u0561"+
		"\u055c\3\2\2\2\u0561\u055d\3\2\2\2\u0561\u055e\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0561\u0560\3\2\2\2\u0562\u00e1\3\2\2\2\u0563\u0565\5\u00e4s\2\u0564"+
		"\u0563\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2"+
		"\2\2\u0567\u0569\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056a\5v<\2\u056a\u056b"+
		"\7h\2\2\u056b\u056c\7;\2\2\u056c\u056e\7<\2\2\u056d\u056f\5\"\22\2\u056e"+
		"\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u0572\5\u00e6"+
		"t\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u0574\7A\2\2\u0574\u00e3\3\2\2\2\u0575\u0579\5\u00e8u\2\u0576\u0579\7"+
		"%\2\2\u0577\u0579\7\3\2\2\u0578\u0575\3\2\2\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0577\3\2\2\2\u0579\u00e5\3\2\2\2\u057a\u057b\7\16\2\2\u057b\u057c\5"+
		"\u00f0y\2\u057c\u00e7\3\2\2\2\u057d\u0581\5\u00eav\2\u057e\u0581\5\u00f6"+
		"|\2\u057f\u0581\5\u00f8}\2\u0580\u057d\3\2\2\2\u0580\u057e\3\2\2\2\u0580"+
		"\u057f\3\2\2\2\u0581\u00e9\3\2\2\2\u0582\u0583\7i\2\2\u0583\u0584\58\35"+
		"\2\u0584\u0586\7;\2\2\u0585\u0587\5\u00ecw\2\u0586\u0585\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\7<\2\2\u0589\u00eb\3\2"+
		"\2\2\u058a\u058f\5\u00eex\2\u058b\u058c\7B\2\2\u058c\u058e\5\u00eex\2"+
		"\u058d\u058b\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u00ed\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0593\7h\2\2\u0593"+
		"\u0594\7D\2\2\u0594\u0595\5\u00f0y\2\u0595\u00ef\3\2\2\2\u0596\u059a\5"+
		"\u01b2\u00da\2\u0597\u059a\5\u00f2z\2\u0598\u059a\5\u00e8u\2\u0599\u0596"+
		"\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u0598\3\2\2\2\u059a\u00f1\3\2\2\2\u059b"+
		"\u059d\7=\2\2\u059c\u059e\5\u00f4{\2\u059d\u059c\3\2\2\2\u059d\u059e\3"+
		"\2\2\2\u059e\u05a0\3\2\2\2\u059f\u05a1\7B\2\2\u05a0\u059f\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\7>\2\2\u05a3\u00f3\3\2"+
		"\2\2\u05a4\u05a9\5\u00f0y\2\u05a5\u05a6\7B\2\2\u05a6\u05a8\5\u00f0y\2"+
		"\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa"+
		"\3\2\2\2\u05aa\u00f5\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad\7i\2\2\u05ad"+
		"\u05ae\58\35\2\u05ae\u00f7\3\2\2\2\u05af\u05b0\7i\2\2\u05b0\u05b1\58\35"+
		"\2\u05b1\u05b2\7;\2\2\u05b2\u05b3\5\u00f0y\2\u05b3\u05b4\7<\2\2\u05b4"+
		"\u00f9\3\2\2\2\u05b5\u05b7\7=\2\2\u05b6\u05b8\5\u00fc\177\2\u05b7\u05b6"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\7B\2\2\u05ba"+
		"\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7>"+
		"\2\2\u05bd\u00fb\3\2\2\2\u05be\u05c3\5t;\2\u05bf\u05c0\7B\2\2\u05c0\u05c2"+
		"\5t;\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u00fd\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05c8\7="+
		"\2\2\u05c7\u05c9\5\u0100\u0081\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2"+
		"\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\7>\2\2\u05cb\u00ff\3\2\2\2\u05cc\u05d0"+
		"\5\u0102\u0082\2\u05cd\u05cf\5\u0102\u0082\2\u05ce\u05cd\3\2\2\2\u05cf"+
		"\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u0101\3\2"+
		"\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d7\5\u0104\u0083\2\u05d4\u05d7\5T+\2"+
		"\u05d5\u05d7\5\u0108\u0085\2\u05d6\u05d3\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6"+
		"\u05d5\3\2\2\2\u05d7\u0103\3\2\2\2\u05d8\u05d9\5\u0106\u0084\2\u05d9\u05da"+
		"\7A\2\2\u05da\u0105\3\2\2\2\u05db\u05dd\5\u009eP\2\u05dc\u05db\3\2\2\2"+
		"\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1"+
		"\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\5v<\2\u05e2\u05e3\5n8\2\u05e3"+
		"\u0107\3\2\2\2\u05e4\u05eb\5\u0110\u0089\2\u05e5\u05eb\5\u0118\u008d\2"+
		"\u05e6\u05eb\5\u011a\u008e\2\u05e7\u05eb\5\u012c\u0097\2\u05e8\u05eb\5"+
		"\u0132\u009a\2\u05e9\u05eb\5\u010c\u0087\2\u05ea\u05e4\3\2\2\2\u05ea\u05e5"+
		"\3\2\2\2\u05ea\u05e6\3\2\2\2\u05ea\u05e7\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea"+
		"\u05e9\3\2\2\2\u05eb\u0109\3\2\2\2\u05ec\u05f2\5\u010c\u0087\2\u05ed\u05f2"+
		"\5\u0112\u008a\2\u05ee\u05f2\5\u011c\u008f\2\u05ef\u05f2\5\u012e\u0098"+
		"\2\u05f0\u05f2\5\u0134\u009b\2\u05f1\u05ec\3\2\2\2\u05f1\u05ed\3\2\2\2"+
		"\u05f1\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0\3\2\2\2\u05f2\u010b"+
		"\3\2\2\2\u05f3\u0600\5\u00fe\u0080\2\u05f4\u0600\5\u010e\u0088\2\u05f5"+
		"\u0600\5\u0114\u008b\2\u05f6\u0600\5\u011e\u0090\2\u05f7\u0600\5\u0120"+
		"\u0091\2\u05f8\u0600\5\u0130\u0099\2\u05f9\u0600\5\u0144\u00a3\2\u05fa"+
		"\u0600\5\u0146\u00a4\2\u05fb\u0600\5\u0148\u00a5\2\u05fc\u0600\5\u014c"+
		"\u00a7\2\u05fd\u0600\5\u014a\u00a6\2\u05fe\u0600\5\u014e\u00a8\2\u05ff"+
		"\u05f3\3\2\2\2\u05ff\u05f4\3\2\2\2\u05ff\u05f5\3\2\2\2\u05ff\u05f6\3\2"+
		"\2\2\u05ff\u05f7\3\2\2\2\u05ff\u05f8\3\2\2\2\u05ff\u05f9\3\2\2\2\u05ff"+
		"\u05fa\3\2\2\2\u05ff\u05fb\3\2\2\2\u05ff\u05fc\3\2\2\2\u05ff\u05fd\3\2"+
		"\2\2\u05ff\u05fe\3\2\2\2\u0600\u010d\3\2\2\2\u0601\u0602\7A\2\2\u0602"+
		"\u010f\3\2\2\2\u0603\u0604\7h\2\2\u0604\u0605\7J\2\2\u0605\u0606\5\u0108"+
		"\u0085\2\u0606\u0111\3\2\2\2\u0607\u0608\7h\2\2\u0608\u0609\7J\2\2\u0609"+
		"\u060a\5\u010a\u0086\2\u060a\u0113\3\2\2\2\u060b\u060c\5\u0116\u008c\2"+
		"\u060c\u060d\7A\2\2\u060d\u0115\3\2\2\2\u060e\u0618\5\u01ac\u00d7\2\u060f"+
		"\u0618\7h\2\2\u0610\u0618\5\u01a0\u00d1\2\u0611\u0618\5\u01ca\u00e6\2"+
		"\u0612\u0618\5\u01cc\u00e7\2\u0613\u0618\5\u01d2\u00ea\2\u0614\u0618\5"+
		"\u01d6\u00ec\2\u0615\u0618\5\u018a\u00c6\2\u0616\u0618\5\u0176\u00bc\2"+
		"\u0617\u060e\3\2\2\2\u0617\u060f\3\2\2\2\u0617\u0610\3\2\2\2\u0617\u0611"+
		"\3\2\2\2\u0617\u0612\3\2\2\2\u0617\u0613\3\2\2\2\u0617\u0614\3\2\2\2\u0617"+
		"\u0615\3\2\2\2\u0617\u0616\3\2\2\2\u0618\u0117\3\2\2\2\u0619\u061a\7\30"+
		"\2\2\u061a\u061b\7;\2\2\u061b\u061c\5\u01a0\u00d1\2\u061c\u061d\7<\2\2"+
		"\u061d\u061e\5\u0108\u0085\2\u061e\u0119\3\2\2\2\u061f\u0620\7\30\2\2"+
		"\u0620\u0621\7;\2\2\u0621\u0622\5\u01a0\u00d1\2\u0622\u0623\7<\2\2\u0623"+
		"\u0624\5\u010a\u0086\2\u0624\u0625\7\21\2\2\u0625\u0626\5\u0108\u0085"+
		"\2\u0626\u011b\3\2\2\2\u0627\u0628\7\30\2\2\u0628\u0629\7;\2\2\u0629\u062a"+
		"\5\u01a0\u00d1\2\u062a\u062b\7<\2\2\u062b\u062c\5\u010a\u0086\2\u062c"+
		"\u062d\7\21\2\2\u062d\u062e\5\u010a\u0086\2\u062e\u011d\3\2\2\2\u062f"+
		"\u0630\7\4\2\2\u0630\u0631\5\u01a0\u00d1\2\u0631\u0632\7A\2\2\u0632\u063a"+
		"\3\2\2\2\u0633\u0634\7\4\2\2\u0634\u0635\5\u01a0\u00d1\2\u0635\u0636\7"+
		"J\2\2\u0636\u0637\5\u01a0\u00d1\2\u0637\u0638\7A\2\2\u0638\u063a\3\2\2"+
		"\2\u0639\u062f\3\2\2\2\u0639\u0633\3\2\2\2\u063a\u011f\3\2\2\2\u063b\u063c"+
		"\7+\2\2\u063c\u063d\7;\2\2\u063d\u063e\5\u01a0\u00d1\2\u063e\u063f\7<"+
		"\2\2\u063f\u0640\5\u0122\u0092\2\u0640\u0121\3\2\2\2\u0641\u0645\7=\2"+
		"\2\u0642\u0644\5\u0124\u0093\2\u0643\u0642\3\2\2\2\u0644\u0647\3\2\2\2"+
		"\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u064b\3\2\2\2\u0647\u0645"+
		"\3\2\2\2\u0648\u064a\5\u0128\u0095\2\u0649\u0648\3\2\2\2\u064a\u064d\3"+
		"\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d"+
		"\u064b\3\2\2\2\u064e\u064f\7>\2\2\u064f\u0123\3\2\2\2\u0650\u0651\5\u0126"+
		"\u0094\2\u0651\u0652\5\u0100\u0081\2\u0652\u0125\3\2\2\2\u0653\u0657\5"+
		"\u0128\u0095\2\u0654\u0656\5\u0128\u0095\2\u0655\u0654\3\2\2\2\u0656\u0659"+
		"\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0127\3\2\2\2\u0659"+
		"\u0657\3\2\2\2\u065a\u065b\7\b\2\2\u065b\u065c\5\u019e\u00d0\2\u065c\u065d"+
		"\7J\2\2\u065d\u0665\3\2\2\2\u065e\u065f\7\b\2\2\u065f\u0660\5\u012a\u0096"+
		"\2\u0660\u0661\7J\2\2\u0661\u0665\3\2\2\2\u0662\u0663\7\16\2\2\u0663\u0665"+
		"\7J\2\2\u0664\u065a\3\2\2\2\u0664\u065e\3\2\2\2\u0664\u0662\3\2\2\2\u0665"+
		"\u0129\3\2\2\2\u0666\u0667\7h\2\2\u0667\u012b\3\2\2\2\u0668\u0669\7\64"+
		"\2\2\u0669\u066a\7;\2\2\u066a\u066b\5\u01a0\u00d1\2\u066b\u066c\7<\2\2"+
		"\u066c\u066d\5\u0108\u0085\2\u066d\u012d\3\2\2\2\u066e\u066f\7\64\2\2"+
		"\u066f\u0670\7;\2\2\u0670\u0671\5\u01a0\u00d1\2\u0671\u0672\7<\2\2\u0672"+
		"\u0673\5\u010a\u0086\2\u0673\u012f\3\2\2\2\u0674\u0675\7\17\2\2\u0675"+
		"\u0676\5\u0108\u0085\2\u0676\u0677\7\64\2\2\u0677\u0678\7;\2\2\u0678\u0679"+
		"\5\u01a0\u00d1\2\u0679\u067a\7<\2\2\u067a\u067b\7A\2\2\u067b\u0131\3\2"+
		"\2\2\u067c\u067f\5\u0136\u009c\2\u067d\u067f\5\u0140\u00a1\2\u067e\u067c"+
		"\3\2\2\2\u067e\u067d\3\2\2\2\u067f\u0133\3\2\2\2\u0680\u0683\5\u0138\u009d"+
		"\2\u0681\u0683\5\u0142\u00a2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2"+
		"\u0683\u0135\3\2\2\2\u0684\u0685\7\27\2\2\u0685\u0687\7;\2\2\u0686\u0688"+
		"\5\u013a\u009e\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\3"+
		"\2\2\2\u0689\u068b\7A\2\2\u068a\u068c\5\u01a0\u00d1\2\u068b\u068a\3\2"+
		"\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\7A\2\2\u068e"+
		"\u0690\5\u013c\u009f\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0692\7<\2\2\u0692\u0693\5\u0108\u0085\2\u0693\u0137\3"+
		"\2\2\2\u0694\u0695\7\27\2\2\u0695\u0697\7;\2\2\u0696\u0698\5\u013a\u009e"+
		"\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b"+
		"\7A\2\2\u069a\u069c\5\u01a0\u00d1\2\u069b\u069a\3\2\2\2\u069b\u069c\3"+
		"\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\7A\2\2\u069e\u06a0\5\u013c\u009f"+
		"\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2"+
		"\7<\2\2\u06a2\u06a3\5\u010a\u0086\2\u06a3\u0139\3\2\2\2\u06a4\u06a7\5"+
		"\u013e\u00a0\2\u06a5\u06a7\5\u0106\u0084\2\u06a6\u06a4\3\2\2\2\u06a6\u06a5"+
		"\3\2\2\2\u06a7\u013b\3\2\2\2\u06a8\u06a9\5\u013e\u00a0\2\u06a9\u013d\3"+
		"\2\2\2\u06aa\u06af\5\u0116\u008c\2\u06ab\u06ac\7B\2\2\u06ac\u06ae\5\u0116"+
		"\u008c\2\u06ad\u06ab\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06af"+
		"\u06b0\3\2\2\2\u06b0\u013f\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u06b3\7\27"+
		"\2\2\u06b3\u06b7\7;\2\2\u06b4\u06b6\5\u009eP\2\u06b5\u06b4\3\2\2\2\u06b6"+
		"\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2"+
		"\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bb\5v<\2\u06bb\u06bc\5r:\2\u06bc\u06bd"+
		"\7J\2\2\u06bd\u06be\5\u01a0\u00d1\2\u06be\u06bf\7<\2\2\u06bf\u06c0\5\u0108"+
		"\u0085\2\u06c0\u0141\3\2\2\2\u06c1\u06c2\7\27\2\2\u06c2\u06c6\7;\2\2\u06c3"+
		"\u06c5\5\u009eP\2\u06c4\u06c3\3\2\2\2\u06c5\u06c8\3\2\2\2\u06c6\u06c4"+
		"\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c9"+
		"\u06ca\5v<\2\u06ca\u06cb\5r:\2\u06cb\u06cc\7J\2\2\u06cc\u06cd\5\u01a0"+
		"\u00d1\2\u06cd\u06ce\7<\2\2\u06ce\u06cf\5\u010a\u0086\2\u06cf\u0143\3"+
		"\2\2\2\u06d0\u06d2\7\6\2\2\u06d1\u06d3\7h\2\2\u06d2\u06d1\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\7A\2\2\u06d5\u0145\3\2"+
		"\2\2\u06d6\u06d8\7\r\2\2\u06d7\u06d9\7h\2\2\u06d8\u06d7\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db\7A\2\2\u06db\u0147\3\2"+
		"\2\2\u06dc\u06de\7&\2\2\u06dd\u06df\5\u01a0\u00d1\2\u06de\u06dd\3\2\2"+
		"\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\7A\2\2\u06e1\u0149"+
		"\3\2\2\2\u06e2\u06e3\7.\2\2\u06e3\u06e4\5\u01a0\u00d1\2\u06e4\u06e5\7"+
		"A\2\2\u06e5\u014b\3\2\2\2\u06e6\u06e7\7,\2\2\u06e7\u06e8\7;\2\2\u06e8"+
		"\u06e9\5\u01a0\u00d1\2\u06e9\u06ea\7<\2\2\u06ea\u06eb\5\u00fe\u0080\2"+
		"\u06eb\u014d\3\2\2\2\u06ec\u06ed\7\61\2\2\u06ed\u06ee\5\u00fe\u0080\2"+
		"\u06ee\u06ef\5\u0150\u00a9\2\u06ef\u06f9\3\2\2\2\u06f0\u06f1\7\61\2\2"+
		"\u06f1\u06f3\5\u00fe\u0080\2\u06f2\u06f4\5\u0150\u00a9\2\u06f3\u06f2\3"+
		"\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f6\5\u0158\u00ad"+
		"\2\u06f6\u06f9\3\2\2\2\u06f7\u06f9\5\u015a\u00ae\2\u06f8\u06ec\3\2\2\2"+
		"\u06f8\u06f0\3\2\2\2\u06f8\u06f7\3\2\2\2\u06f9\u014f\3\2\2\2\u06fa\u06fe"+
		"\5\u0152\u00aa\2\u06fb\u06fd\5\u0152\u00aa\2\u06fc\u06fb\3\2\2\2\u06fd"+
		"\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0151\3\2"+
		"\2\2\u0700\u06fe\3\2\2\2\u0701\u0702\7\t\2\2\u0702\u0703\7;\2\2\u0703"+
		"\u0704\5\u0154\u00ab\2\u0704\u0705\7<\2\2\u0705\u0706\5\u00fe\u0080\2"+
		"\u0706\u0153\3\2\2\2\u0707\u0709\5\u009eP\2\u0708\u0707\3\2\2\2\u0709"+
		"\u070c\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2"+
		"\2\2\u070c\u070a\3\2\2\2\u070d\u070e\5\u0156\u00ac\2\u070e\u070f\5r:\2"+
		"\u070f\u0155\3\2\2\2\u0710\u0715\5~@\2\u0711\u0712\7X\2\2\u0712\u0714"+
		"\5\22\n\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2"+
		"\u0715\u0716\3\2\2\2\u0716\u0157\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u0719"+
		"\7\25\2\2\u0719\u071a\5\u00fe\u0080\2\u071a\u0159\3\2\2\2\u071b\u071c"+
		"\7\61\2\2\u071c\u071d\5\u015c\u00af\2\u071d\u071f\5\u00fe\u0080\2\u071e"+
		"\u0720\5\u0150\u00a9\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722"+
		"\3\2\2\2\u0721\u0723\5\u0158\u00ad\2\u0722\u0721\3\2\2\2\u0722\u0723\3"+
		"\2\2\2\u0723\u015b\3\2\2\2\u0724\u0725\7;\2\2\u0725\u0727\5\u015e\u00b0"+
		"\2\u0726\u0728\7A\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729"+
		"\3\2\2\2\u0729\u072a\7<\2\2\u072a\u015d\3\2\2\2\u072b\u0730\5\u0160\u00b1"+
		"\2\u072c\u072d\7A\2\2\u072d\u072f\5\u0160\u00b1\2\u072e\u072c\3\2\2\2"+
		"\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u015f"+
		"\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0735\5\u009eP\2\u0734\u0733\3\2\2"+
		"\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0739"+
		"\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073a\5v<\2\u073a\u073b\5r:\2\u073b"+
		"\u073c\7D\2\2\u073c\u073d\5\u01a0\u00d1\2\u073d\u0161\3\2\2\2\u073e\u0741"+
		"\5\u0170\u00b9\2\u073f\u0741\5\u0198\u00cd\2\u0740\u073e\3\2\2\2\u0740"+
		"\u073f\3\2\2\2\u0741\u0745\3\2\2\2\u0742\u0744\5\u016a\u00b6\2\u0743\u0742"+
		"\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746"+
		"\u0163\3\2\2\2\u0747\u0745\3\2\2\2\u0748\u0766\5\2\2\2\u0749\u074e\58"+
		"\35\2\u074a\u074b\7?\2\2\u074b\u074d\7@\2\2\u074c\u074a\3\2\2\2\u074d"+
		"\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0751\3\2"+
		"\2\2\u0750\u074e\3\2\2\2\u0751\u0752\7C\2\2\u0752\u0753\7\13\2\2\u0753"+
		"\u0766\3\2\2\2\u0754\u0755\7\62\2\2\u0755\u0756\7C\2\2\u0756\u0766\7\13"+
		"\2\2\u0757\u0766\7-\2\2\u0758\u0759\58\35\2\u0759\u075a\7C\2\2\u075a\u075b"+
		"\7-\2\2\u075b\u0766\3\2\2\2\u075c\u075d\7;\2\2\u075d\u075e\5\u01a0\u00d1"+
		"\2\u075e\u075f\7<\2\2\u075f\u0766\3\2\2\2\u0760\u0766\5\u0176\u00bc\2"+
		"\u0761\u0766\5\u017e\u00c0\2\u0762\u0766\5\u0184\u00c3\2\u0763\u0766\5"+
		"\u018a\u00c6\2\u0764\u0766\5\u0192\u00ca\2\u0765\u0748\3\2\2\2\u0765\u0749"+
		"\3\2\2\2\u0765\u0754\3\2\2\2\u0765\u0757\3\2\2\2\u0765\u0758\3\2\2\2\u0765"+
		"\u075c\3\2\2\2\u0765\u0760\3\2\2\2\u0765\u0761\3\2\2\2\u0765\u0762\3\2"+
		"\2\2\u0765\u0763\3\2\2\2\u0765\u0764\3\2\2\2\u0766\u0165\3\2\2\2\u0767"+
		"\u0768\3\2\2\2\u0768\u0167\3\2\2\2\u0769\u0786\5\2\2\2\u076a\u076f\58"+
		"\35\2\u076b\u076c\7?\2\2\u076c\u076e\7@\2\2\u076d\u076b\3\2\2\2\u076e"+
		"\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0772\3\2"+
		"\2\2\u0771\u076f\3\2\2\2\u0772\u0773\7C\2\2\u0773\u0774\7\13\2\2\u0774"+
		"\u0786\3\2\2\2\u0775\u0776\7\62\2\2\u0776\u0777\7C\2\2\u0777\u0786\7\13"+
		"\2\2\u0778\u0786\7-\2\2\u0779\u077a\58\35\2\u077a\u077b\7C\2\2\u077b\u077c"+
		"\7-\2\2\u077c\u0786\3\2\2\2\u077d\u077e\7;\2\2\u077e\u077f\5\u01a0\u00d1"+
		"\2\u077f\u0780\7<\2\2\u0780\u0786\3\2\2\2\u0781\u0786\5\u0176\u00bc\2"+
		"\u0782\u0786\5\u017e\u00c0\2\u0783\u0786\5\u018a\u00c6\2\u0784\u0786\5"+
		"\u0192\u00ca\2\u0785\u0769\3\2\2\2\u0785\u076a\3\2\2\2\u0785\u0775\3\2"+
		"\2\2\u0785\u0778\3\2\2\2\u0785\u0779\3\2\2\2\u0785\u077d\3\2\2\2\u0785"+
		"\u0781\3\2\2\2\u0785\u0782\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0784\3\2"+
		"\2\2\u0786\u0169\3\2\2\2\u0787\u078d\5\u0178\u00bd\2\u0788\u078d\5\u0180"+
		"\u00c1\2\u0789\u078d\5\u0186\u00c4\2\u078a\u078d\5\u018c\u00c7\2\u078b"+
		"\u078d\5\u0194\u00cb\2\u078c\u0787\3\2\2\2\u078c\u0788\3\2\2\2\u078c\u0789"+
		"\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u016b\3\2\2\2\u078e"+
		"\u078f\3\2\2\2\u078f\u016d\3\2\2\2\u0790\u0795\5\u0178\u00bd\2\u0791\u0795"+
		"\5\u0180\u00c1\2\u0792\u0795\5\u018c\u00c7\2\u0793\u0795\5\u0194\u00cb"+
		"\2\u0794\u0790\3\2\2\2\u0794\u0791\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0793"+
		"\3\2\2\2\u0795\u016f\3\2\2\2\u0796\u07bf\5\2\2\2\u0797\u079c\58\35\2\u0798"+
		"\u0799\7?\2\2\u0799\u079b\7@\2\2\u079a\u0798\3\2\2\2\u079b\u079e\3\2\2"+
		"\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\3\2\2\2\u079e\u079c"+
		"\3\2\2\2\u079f\u07a0\7C\2\2\u07a0\u07a1\7\13\2\2\u07a1\u07bf\3\2\2\2\u07a2"+
		"\u07a7\5x=\2\u07a3\u07a4\7?\2\2\u07a4\u07a6\7@\2\2\u07a5\u07a3\3\2\2\2"+
		"\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa"+
		"\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07ab\7C\2\2\u07ab\u07ac\7\13\2\2\u07ac"+
		"\u07bf\3\2\2\2\u07ad\u07ae\7\62\2\2\u07ae\u07af\7C\2\2\u07af\u07bf\7\13"+
		"\2\2\u07b0\u07bf\7-\2\2\u07b1\u07b2\58\35\2\u07b2\u07b3\7C\2\2\u07b3\u07b4"+
		"\7-\2\2\u07b4\u07bf\3\2\2\2\u07b5\u07b6\7;\2\2\u07b6\u07b7\5\u01a0\u00d1"+
		"\2\u07b7\u07b8\7<\2\2\u07b8\u07bf\3\2\2\2\u07b9\u07bf\5\u017a\u00be\2"+
		"\u07ba\u07bf\5\u0182\u00c2\2\u07bb\u07bf\5\u0188\u00c5\2\u07bc\u07bf\5"+
		"\u018e\u00c8\2\u07bd\u07bf\5\u0196\u00cc\2\u07be\u0796\3\2\2\2\u07be\u0797"+
		"\3\2\2\2\u07be\u07a2\3\2\2\2\u07be\u07ad\3\2\2\2\u07be\u07b0\3\2\2\2\u07be"+
		"\u07b1\3\2\2\2\u07be\u07b5\3\2\2\2\u07be\u07b9\3\2\2\2\u07be\u07ba\3\2"+
		"\2\2\u07be\u07bb\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bd\3\2\2\2\u07bf"+
		"\u0171\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u0173\3\2\2\2\u07c2\u07ea\5\2"+
		"\2\2\u07c3\u07c8\58\35\2\u07c4\u07c5\7?\2\2\u07c5\u07c7\7@\2\2\u07c6\u07c4"+
		"\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9"+
		"\u07cb\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cc\7C\2\2\u07cc\u07cd\7\13"+
		"\2\2\u07cd\u07ea\3\2\2\2\u07ce\u07d3\5x=\2\u07cf\u07d0\7?\2\2\u07d0\u07d2"+
		"\7@\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3"+
		"\u07d4\3\2\2\2\u07d4\u07d6\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07d7\7C"+
		"\2\2\u07d7\u07d8\7\13\2\2\u07d8\u07ea\3\2\2\2\u07d9\u07da\7\62\2\2\u07da"+
		"\u07db\7C\2\2\u07db\u07ea\7\13\2\2\u07dc\u07ea\7-\2\2\u07dd\u07de\58\35"+
		"\2\u07de\u07df\7C\2\2\u07df\u07e0\7-\2\2\u07e0\u07ea\3\2\2\2\u07e1\u07e2"+
		"\7;\2\2\u07e2\u07e3\5\u01a0\u00d1\2\u07e3\u07e4\7<\2\2\u07e4\u07ea\3\2"+
		"\2\2\u07e5\u07ea\5\u017a\u00be\2\u07e6\u07ea\5\u0182\u00c2\2\u07e7\u07ea"+
		"\5\u018e\u00c8\2\u07e8\u07ea\5\u0196\u00cc\2\u07e9\u07c2\3\2\2\2\u07e9"+
		"\u07c3\3\2\2\2\u07e9\u07ce\3\2\2\2\u07e9\u07d9\3\2\2\2\u07e9\u07dc\3\2"+
		"\2\2\u07e9\u07dd\3\2\2\2\u07e9\u07e1\3\2\2\2\u07e9\u07e5\3\2\2\2\u07e9"+
		"\u07e6\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07e8\3\2\2\2\u07ea\u0175\3\2"+
		"\2\2\u07eb\u07ed\7!\2\2\u07ec\u07ee\5,\27\2\u07ed\u07ec\3\2\2\2\u07ed"+
		"\u07ee\3\2\2\2\u07ee\u07f2\3\2\2\2\u07ef\u07f1\5\u00e8u\2\u07f0\u07ef"+
		"\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u07f5\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u0800\7h\2\2\u07f6\u07fa\7C\2"+
		"\2\u07f7\u07f9\5\u00e8u\2\u07f8\u07f7\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa"+
		"\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2"+
		"\2\2\u07fd\u07ff\7h\2\2\u07fe\u07f6\3\2\2\2\u07ff\u0802\3\2\2\2\u0800"+
		"\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2"+
		"\2\2\u0803\u0805\5\u017c\u00bf\2\u0804\u0803\3\2\2\2\u0804\u0805\3\2\2"+
		"\2\u0805\u0806\3\2\2\2\u0806\u0808\7;\2\2\u0807\u0809\5\u0190\u00c9\2"+
		"\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c"+
		"\7<\2\2\u080b\u080d\5d\63\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d"+
		"\u083f\3\2\2\2\u080e\u080f\5<\37\2\u080f\u0810\7C\2\2\u0810\u0812\7!\2"+
		"\2\u0811\u0813\5,\27\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0817"+
		"\3\2\2\2\u0814\u0816\5\u00e8u\2\u0815\u0814\3\2\2\2\u0816\u0819\3\2\2"+
		"\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\3\2\2\2\u0819\u0817"+
		"\3\2\2\2\u081a\u081c\7h\2\2\u081b\u081d\5\u017c\u00bf\2\u081c\u081b\3"+
		"\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0820\7;\2\2\u081f"+
		"\u0821\5\u0190\u00c9\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822"+
		"\3\2\2\2\u0822\u0824\7<\2\2\u0823\u0825\5d\63\2\u0824\u0823\3\2\2\2\u0824"+
		"\u0825\3\2\2\2\u0825\u083f\3\2\2\2\u0826\u0827\5\u0162\u00b2\2\u0827\u0828"+
		"\7C\2\2\u0828\u082a\7!\2\2\u0829\u082b\5,\27\2\u082a\u0829\3\2\2\2\u082a"+
		"\u082b\3\2\2\2\u082b\u082f\3\2\2\2\u082c\u082e\5\u00e8u\2\u082d\u082c"+
		"\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830"+
		"\u0832\3\2\2\2\u0831\u082f\3\2\2\2\u0832\u0834\7h\2\2\u0833\u0835\5\u017c"+
		"\u00bf\2\u0834\u0833\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836\3\2\2\2\u0836"+
		"\u0838\7;\2\2\u0837\u0839\5\u0190\u00c9\2\u0838\u0837\3\2\2\2\u0838\u0839"+
		"\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\7<\2\2\u083b\u083d\5d\63\2\u083c"+
		"\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\3\2\2\2\u083e\u07eb\3\2"+
		"\2\2\u083e\u080e\3\2\2\2\u083e\u0826\3\2\2\2\u083f\u0177\3\2\2\2\u0840"+
		"\u0841\7C\2\2\u0841\u0843\7!\2\2\u0842\u0844\5,\27\2\u0843\u0842\3\2\2"+
		"\2\u0843\u0844\3\2\2\2\u0844\u0848\3\2\2\2\u0845\u0847\5\u00e8u\2\u0846"+
		"\u0845\3\2\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2"+
		"\2\2\u0849\u084b\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084d\7h\2\2\u084c"+
		"\u084e\5\u017c\u00bf\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f"+
		"\3\2\2\2\u084f\u0851\7;\2\2\u0850\u0852\5\u0190\u00c9\2\u0851\u0850\3"+
		"\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\7<\2\2\u0854"+
		"\u0856\5d\63\2\u0855\u0854\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0179\3\2"+
		"\2\2\u0857\u0859\7!\2\2\u0858\u085a\5,\27\2\u0859\u0858\3\2\2\2\u0859"+
		"\u085a\3\2\2\2\u085a\u085e\3\2\2\2\u085b\u085d\5\u00e8u\2\u085c\u085b"+
		"\3\2\2\2\u085d\u0860\3\2\2\2\u085e\u085c\3\2\2\2\u085e\u085f\3\2\2\2\u085f"+
		"\u0861\3\2\2\2\u0860\u085e\3\2\2\2\u0861\u086c\7h\2\2\u0862\u0866\7C\2"+
		"\2\u0863\u0865\5\u00e8u\2\u0864\u0863\3\2\2\2\u0865\u0868\3\2\2\2\u0866"+
		"\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0866\3\2"+
		"\2\2\u0869\u086b\7h\2\2\u086a\u0862\3\2\2\2\u086b\u086e\3\2\2\2\u086c"+
		"\u086a\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c\3\2"+
		"\2\2\u086f\u0871\5\u017c\u00bf\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2"+
		"\2\u0871\u0872\3\2\2\2\u0872\u0874\7;\2\2\u0873\u0875\5\u0190\u00c9\2"+
		"\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0878"+
		"\7<\2\2\u0877\u0879\5d\63\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879"+
		"\u0893\3\2\2\2\u087a\u087b\5<\37\2\u087b\u087c\7C\2\2\u087c\u087e\7!\2"+
		"\2\u087d\u087f\5,\27\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0883"+
		"\3\2\2\2\u0880\u0882\5\u00e8u\2\u0881\u0880\3\2\2\2\u0882\u0885\3\2\2"+
		"\2\u0883\u0881\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0886\3\2\2\2\u0885\u0883"+
		"\3\2\2\2\u0886\u0888\7h\2\2\u0887\u0889\5\u017c\u00bf\2\u0888\u0887\3"+
		"\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088c\7;\2\2\u088b"+
		"\u088d\5\u0190\u00c9\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e"+
		"\3\2\2\2\u088e\u0890\7<\2\2\u088f\u0891\5d\63\2\u0890\u088f\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0893\3\2\2\2\u0892\u0857\3\2\2\2\u0892\u087a\3\2"+
		"\2\2\u0893\u017b\3\2\2\2\u0894\u0898\5,\27\2\u0895\u0896\7F\2\2\u0896"+
		"\u0898\7E\2\2\u0897\u0894\3\2\2\2\u0897\u0895\3\2\2\2\u0898\u017d\3\2"+
		"\2\2\u0899\u089a\5\u0162\u00b2\2\u089a\u089b\7C\2\2\u089b\u089c\7h\2\2"+
		"\u089c\u08a7\3\2\2\2\u089d\u089e\7*\2\2\u089e\u089f\7C\2\2\u089f\u08a7"+
		"\7h\2\2\u08a0\u08a1\58\35\2\u08a1\u08a2\7C\2\2\u08a2\u08a3\7*\2\2\u08a3"+
		"\u08a4\7C\2\2\u08a4\u08a5\7h\2\2\u08a5\u08a7\3\2\2\2\u08a6\u0899\3\2\2"+
		"\2\u08a6\u089d\3\2\2\2\u08a6\u08a0\3\2\2\2\u08a7\u017f\3\2\2\2\u08a8\u08a9"+
		"\7C\2\2\u08a9\u08aa\7h\2\2\u08aa\u0181\3\2\2\2\u08ab\u08ac\7*\2\2\u08ac"+
		"\u08ad\7C\2\2\u08ad\u08b5\7h\2\2\u08ae\u08af\58\35\2\u08af\u08b0\7C\2"+
		"\2\u08b0\u08b1\7*\2\2\u08b1\u08b2\7C\2\2\u08b2\u08b3\7h\2\2\u08b3\u08b5"+
		"\3\2\2\2\u08b4\u08ab\3\2\2\2\u08b4\u08ae\3\2\2\2\u08b5\u0183\3\2\2\2\u08b6"+
		"\u08b7\5<\37\2\u08b7\u08b8\7?\2\2\u08b8\u08b9\5\u01a0\u00d1\2\u08b9\u08ba"+
		"\7@\2\2\u08ba\u08c1\3\2\2\2\u08bb\u08bc\5\u0168\u00b5\2\u08bc\u08bd\7"+
		"?\2\2\u08bd\u08be\5\u01a0\u00d1\2\u08be\u08bf\7@\2\2\u08bf\u08c1\3\2\2"+
		"\2\u08c0\u08b6\3\2\2\2\u08c0\u08bb\3\2\2\2\u08c1\u08c9\3\2\2\2\u08c2\u08c3"+
		"\5\u0166\u00b4\2\u08c3\u08c4\7?\2\2\u08c4\u08c5\5\u01a0\u00d1\2\u08c5"+
		"\u08c6\7@\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08c2\3\2\2\2\u08c8\u08cb\3\2"+
		"\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u0185\3\2\2\2\u08cb"+
		"\u08c9\3\2\2\2\u08cc\u08cd\5\u016e\u00b8\2\u08cd\u08ce\7?\2\2\u08ce\u08cf"+
		"\5\u01a0\u00d1\2\u08cf\u08d0\7@\2\2\u08d0\u08d8\3\2\2\2\u08d1\u08d2\5"+
		"\u016c\u00b7\2\u08d2\u08d3\7?\2\2\u08d3\u08d4\5\u01a0\u00d1\2\u08d4\u08d5"+
		"\7@\2\2\u08d5\u08d7\3\2\2\2\u08d6\u08d1\3\2\2\2\u08d7\u08da\3\2\2\2\u08d8"+
		"\u08d6\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u0187\3\2\2\2\u08da\u08d8\3\2"+
		"\2\2\u08db\u08dc\5<\37\2\u08dc\u08dd\7?\2\2\u08dd\u08de\5\u01a0\u00d1"+
		"\2\u08de\u08df\7@\2\2\u08df\u08e6\3\2\2\2\u08e0\u08e1\5\u0174\u00bb\2"+
		"\u08e1\u08e2\7?\2\2\u08e2\u08e3\5\u01a0\u00d1\2\u08e3\u08e4\7@\2\2\u08e4"+
		"\u08e6\3\2\2\2\u08e5\u08db\3\2\2\2\u08e5\u08e0\3\2\2\2\u08e6\u08ee\3\2"+
		"\2\2\u08e7\u08e8\5\u0172\u00ba\2\u08e8\u08e9\7?\2\2\u08e9\u08ea\5\u01a0"+
		"\u00d1\2\u08ea\u08eb\7@\2\2\u08eb\u08ed\3\2\2\2\u08ec\u08e7\3\2\2\2\u08ed"+
		"\u08f0\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u0189\3\2"+
		"\2\2\u08f0\u08ee\3\2\2\2\u08f1\u08f2\5> \2\u08f2\u08f4\7;\2\2\u08f3\u08f5"+
		"\5\u0190\u00c9\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3"+
		"\2\2\2\u08f6\u08f7\7<\2\2\u08f7\u0936\3\2\2\2\u08f8\u08f9\58\35\2\u08f9"+
		"\u08fb\7C\2\2\u08fa\u08fc\5,\27\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2"+
		"\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08fe\7h\2\2\u08fe\u0900\7;\2\2\u08ff\u0901"+
		"\5\u0190\u00c9\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\3"+
		"\2\2\2\u0902\u0903\7<\2\2\u0903\u0936\3\2\2\2\u0904\u0905\5<\37\2\u0905"+
		"\u0907\7C\2\2\u0906\u0908\5,\27\2\u0907\u0906\3\2\2\2\u0907\u0908\3\2"+
		"\2\2\u0908\u0909\3\2\2\2\u0909\u090a\7h\2\2\u090a\u090c\7;\2\2\u090b\u090d"+
		"\5\u0190\u00c9\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3"+
		"\2\2\2\u090e\u090f\7<\2\2\u090f\u0936\3\2\2\2\u0910\u0911\5\u0162\u00b2"+
		"\2\u0911\u0913\7C\2\2\u0912\u0914\5,\27\2\u0913\u0912\3\2\2\2\u0913\u0914"+
		"\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\7h\2\2\u0916\u0918\7;\2\2\u0917"+
		"\u0919\5\u0190\u00c9\2\u0918\u0917\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a"+
		"\3\2\2\2\u091a\u091b\7<\2\2\u091b\u0936\3\2\2\2\u091c\u091d\7*\2\2\u091d"+
		"\u091f\7C\2\2\u091e\u0920\5,\27\2\u091f\u091e\3\2\2\2\u091f\u0920\3\2"+
		"\2\2\u0920\u0921\3\2\2\2\u0921\u0922\7h\2\2\u0922\u0924\7;\2\2\u0923\u0925"+
		"\5\u0190\u00c9\2\u0924\u0923\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\3"+
		"\2\2\2\u0926\u0936\7<\2\2\u0927\u0928\58\35\2\u0928\u0929\7C\2\2\u0929"+
		"\u092a\7*\2\2\u092a\u092c\7C\2\2\u092b\u092d\5,\27\2\u092c\u092b\3\2\2"+
		"\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\7h\2\2\u092f\u0931"+
		"\7;\2\2\u0930\u0932\5\u0190\u00c9\2\u0931\u0930\3\2\2\2\u0931\u0932\3"+
		"\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\7<\2\2\u0934\u0936\3\2\2\2\u0935"+
		"\u08f1\3\2\2\2\u0935\u08f8\3\2\2\2\u0935\u0904\3\2\2\2\u0935\u0910\3\2"+
		"\2\2\u0935\u091c\3\2\2\2\u0935\u0927\3\2\2\2\u0936\u018b\3\2\2\2\u0937"+
		"\u0939\7C\2\2\u0938\u093a\5,\27\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2"+
		"\2\2\u093a\u093b\3\2\2\2\u093b\u093c\7h\2\2\u093c\u093e\7;\2\2\u093d\u093f"+
		"\5\u0190\u00c9\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3"+
		"\2\2\2\u0940\u0941\7<\2\2\u0941\u018d\3\2\2\2\u0942\u0943\5> \2\u0943"+
		"\u0945\7;\2\2\u0944\u0946\5\u0190\u00c9\2\u0945\u0944\3\2\2\2\u0945\u0946"+
		"\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\7<\2\2\u0948\u097b\3\2\2\2\u0949"+
		"\u094a\58\35\2\u094a\u094c\7C\2\2\u094b\u094d\5,\27\2\u094c\u094b\3\2"+
		"\2\2\u094c\u094d\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\7h\2\2\u094f"+
		"\u0951\7;\2\2\u0950\u0952\5\u0190\u00c9\2\u0951\u0950\3\2\2\2\u0951\u0952"+
		"\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0954\7<\2\2\u0954\u097b\3\2\2\2\u0955"+
		"\u0956\5<\37\2\u0956\u0958\7C\2\2\u0957\u0959\5,\27\2\u0958\u0957\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\7h\2\2\u095b"+
		"\u095d\7;\2\2\u095c\u095e\5\u0190\u00c9\2\u095d\u095c\3\2\2\2\u095d\u095e"+
		"\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0960\7<\2\2\u0960\u097b\3\2\2\2\u0961"+
		"\u0962\7*\2\2\u0962\u0964\7C\2\2\u0963\u0965\5,\27\2\u0964\u0963\3\2\2"+
		"\2\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\7h\2\2\u0967\u0969"+
		"\7;\2\2\u0968\u096a\5\u0190\u00c9\2\u0969\u0968\3\2\2\2\u0969\u096a\3"+
		"\2\2\2\u096a\u096b\3\2\2\2\u096b\u097b\7<\2\2\u096c\u096d\58";
	private static final String _serializedATNSegment1 =
		"\35\2\u096d\u096e\7C\2\2\u096e\u096f\7*\2\2\u096f\u0971\7C\2\2\u0970\u0972"+
		"\5,\27\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973"+
		"\u0974\7h\2\2\u0974\u0976\7;\2\2\u0975\u0977\5\u0190\u00c9\2\u0976\u0975"+
		"\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7<\2\2\u0979"+
		"\u097b\3\2\2\2\u097a\u0942\3\2\2\2\u097a\u0949\3\2\2\2\u097a\u0955\3\2"+
		"\2\2\u097a\u0961\3\2\2\2\u097a\u096c\3\2\2\2\u097b\u018f\3\2\2\2\u097c"+
		"\u0981\5\u01a0\u00d1\2\u097d\u097e\7B\2\2\u097e\u0980\5\u01a0\u00d1\2"+
		"\u097f\u097d\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3\2\2\2\u0981\u0982"+
		"\3\2\2\2\u0982\u0191\3\2\2\2\u0983\u0981\3\2\2\2\u0984\u0985\5<\37\2\u0985"+
		"\u0987\7\\\2\2\u0986\u0988\5,\27\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2"+
		"\2\2\u0988\u0989\3\2\2\2\u0989\u098a\7h\2\2\u098a\u09b4\3\2\2\2\u098b"+
		"\u098c\5\16\b\2\u098c\u098e\7\\\2\2\u098d\u098f\5,\27\2\u098e\u098d\3"+
		"\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\7h\2\2\u0991"+
		"\u09b4\3\2\2\2\u0992\u0993\5\u0162\u00b2\2\u0993\u0995\7\\\2\2\u0994\u0996"+
		"\5,\27\2\u0995\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2\2\2\u0997"+
		"\u0998\7h\2\2\u0998\u09b4\3\2\2\2\u0999\u099a\7*\2\2\u099a\u099c\7\\\2"+
		"\2\u099b\u099d\5,\27\2\u099c\u099b\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e"+
		"\3\2\2\2\u099e\u09b4\7h\2\2\u099f\u09a0\58\35\2\u09a0\u09a1\7C\2\2\u09a1"+
		"\u09a2\7*\2\2\u09a2\u09a4\7\\\2\2\u09a3\u09a5\5,\27\2\u09a4\u09a3\3\2"+
		"\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\7h\2\2\u09a7"+
		"\u09b4\3\2\2\2\u09a8\u09a9\5\22\n\2\u09a9\u09ab\7\\\2\2\u09aa\u09ac\5"+
		",\27\2\u09ab\u09aa\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad"+
		"\u09ae\7!\2\2\u09ae\u09b4\3\2\2\2\u09af\u09b0\5 \21\2\u09b0\u09b1\7\\"+
		"\2\2\u09b1\u09b2\7!\2\2\u09b2\u09b4\3\2\2\2\u09b3\u0984\3\2\2\2\u09b3"+
		"\u098b\3\2\2\2\u09b3\u0992\3\2\2\2\u09b3\u0999\3\2\2\2\u09b3\u099f\3\2"+
		"\2\2\u09b3\u09a8\3\2\2\2\u09b3\u09af\3\2\2\2\u09b4\u0193\3\2\2\2\u09b5"+
		"\u09b7\7\\\2\2\u09b6\u09b8\5,\27\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8\3\2"+
		"\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\7h\2\2\u09ba\u0195\3\2\2\2\u09bb"+
		"\u09bc\5<\37\2\u09bc\u09be\7\\\2\2\u09bd\u09bf\5,\27\2\u09be\u09bd\3\2"+
		"\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\7h\2\2\u09c1"+
		"\u09e4\3\2\2\2\u09c2\u09c3\5\16\b\2\u09c3\u09c5\7\\\2\2\u09c4\u09c6\5"+
		",\27\2\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7"+
		"\u09c8\7h\2\2\u09c8\u09e4\3\2\2\2\u09c9\u09ca\7*\2\2\u09ca\u09cc\7\\\2"+
		"\2\u09cb\u09cd\5,\27\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce"+
		"\3\2\2\2\u09ce\u09e4\7h\2\2\u09cf\u09d0\58\35\2\u09d0\u09d1\7C\2\2\u09d1"+
		"\u09d2\7*\2\2\u09d2\u09d4\7\\\2\2\u09d3\u09d5\5,\27\2\u09d4\u09d3\3\2"+
		"\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d7\7h\2\2\u09d7"+
		"\u09e4\3\2\2\2\u09d8\u09d9\5\22\n\2\u09d9\u09db\7\\\2\2\u09da\u09dc\5"+
		",\27\2\u09db\u09da\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd"+
		"\u09de\7!\2\2\u09de\u09e4\3\2\2\2\u09df\u09e0\5 \21\2\u09e0\u09e1\7\\"+
		"\2\2\u09e1\u09e2\7!\2\2\u09e2\u09e4\3\2\2\2\u09e3\u09bb\3\2\2\2\u09e3"+
		"\u09c2\3\2\2\2\u09e3\u09c9\3\2\2\2\u09e3\u09cf\3\2\2\2\u09e3\u09d8\3\2"+
		"\2\2\u09e3\u09df\3\2\2\2\u09e4\u0197\3\2\2\2\u09e5\u09e6\7!\2\2\u09e6"+
		"\u09e7\5\6\4\2\u09e7\u09e9\5\u019a\u00ce\2\u09e8\u09ea\5\"\22\2\u09e9"+
		"\u09e8\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09fc\3\2\2\2\u09eb\u09ec\7!"+
		"\2\2\u09ec\u09ed\5\20\t\2\u09ed\u09ef\5\u019a\u00ce\2\u09ee\u09f0\5\""+
		"\22\2\u09ef\u09ee\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09fc\3\2\2\2\u09f1"+
		"\u09f2\7!\2\2\u09f2\u09f3\5\6\4\2\u09f3\u09f4\5\"\22\2\u09f4\u09f5\5\u00fa"+
		"~\2\u09f5\u09fc\3\2\2\2\u09f6\u09f7\7!\2\2\u09f7\u09f8\5\20\t\2\u09f8"+
		"\u09f9\5\"\22\2\u09f9\u09fa\5\u00fa~\2\u09fa\u09fc\3\2\2\2\u09fb\u09e5"+
		"\3\2\2\2\u09fb\u09eb\3\2\2\2\u09fb\u09f1\3\2\2\2\u09fb\u09f6\3\2\2\2\u09fc"+
		"\u0199\3\2\2\2\u09fd\u0a01\5\u019c\u00cf\2\u09fe\u0a00\5\u019c\u00cf\2"+
		"\u09ff\u09fe\3\2\2\2\u0a00\u0a03\3\2\2\2\u0a01\u09ff\3\2\2\2\u0a01\u0a02"+
		"\3\2\2\2\u0a02\u019b\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a04\u0a06\5\u00e8u"+
		"\2\u0a05\u0a04\3\2\2\2\u0a06\u0a09\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a07\u0a08"+
		"\3\2\2\2\u0a08\u0a0a\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a0a\u0a0b\7?\2\2\u0a0b"+
		"\u0a0c\5\u01a0\u00d1\2\u0a0c\u0a0d\7@\2\2\u0a0d\u019d\3\2\2\2\u0a0e\u0a0f"+
		"\5\u01a0\u00d1\2\u0a0f\u019f\3\2\2\2\u0a10\u0a13\5\u01a2\u00d2\2\u0a11"+
		"\u0a13\5\u01aa\u00d6\2\u0a12\u0a10\3\2\2\2\u0a12\u0a11\3\2\2\2\u0a13\u01a1"+
		"\3\2\2\2\u0a14\u0a15\5\u01a4\u00d3\2\u0a15\u0a16\7[\2\2\u0a16\u0a17\5"+
		"\u01a8\u00d5\2\u0a17\u01a3\3\2\2\2\u0a18\u0a23\7h\2\2\u0a19\u0a1b\7;\2"+
		"\2\u0a1a\u0a1c\5\u0098M\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c"+
		"\u0a1d\3\2\2\2\u0a1d\u0a23\7<\2\2\u0a1e\u0a1f\7;\2\2\u0a1f\u0a20\5\u01a6"+
		"\u00d4\2\u0a20\u0a21\7<\2\2\u0a21\u0a23\3\2\2\2\u0a22\u0a18\3\2\2\2\u0a22"+
		"\u0a19\3\2\2\2\u0a22\u0a1e\3\2\2\2\u0a23\u01a5\3\2\2\2\u0a24\u0a29\7h"+
		"\2\2\u0a25\u0a26\7B\2\2\u0a26\u0a28\7h\2\2\u0a27\u0a25\3\2\2\2\u0a28\u0a2b"+
		"\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u01a7\3\2\2\2\u0a2b"+
		"\u0a29\3\2\2\2\u0a2c\u0a2f\5\u01a0\u00d1\2\u0a2d\u0a2f\5\u00fe\u0080\2"+
		"\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2d\3\2\2\2\u0a2f\u01a9\3\2\2\2\u0a30\u0a33"+
		"\5\u01b2\u00da\2\u0a31\u0a33\5\u01ac\u00d7\2\u0a32\u0a30\3\2\2\2\u0a32"+
		"\u0a31\3\2\2\2\u0a33\u01ab\3\2\2\2\u0a34\u0a35\5\u01ae\u00d8\2\u0a35\u0a36"+
		"\5\u01b0\u00d9\2\u0a36\u0a37\5\u01a0\u00d1\2\u0a37\u01ad\3\2\2\2\u0a38"+
		"\u0a3c\5<\37\2\u0a39\u0a3c\5\u017e\u00c0\2\u0a3a\u0a3c\5\u0184\u00c3\2"+
		"\u0a3b\u0a38\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3a\3\2\2\2\u0a3c\u01af"+
		"\3\2\2\2\u0a3d\u0a3e\t\5\2\2\u0a3e\u01b1\3\2\2\2\u0a3f\u0a47\5\u01b4\u00db"+
		"\2\u0a40\u0a41\5\u01b4\u00db\2\u0a41\u0a42\7I\2\2\u0a42\u0a43\5\u01a0"+
		"\u00d1\2\u0a43\u0a44\7J\2\2\u0a44\u0a45\5\u01b2\u00da\2\u0a45\u0a47\3"+
		"\2\2\2\u0a46\u0a3f\3\2\2\2\u0a46\u0a40\3\2\2\2\u0a47\u01b3\3\2\2\2\u0a48"+
		"\u0a49\b\u00db\1\2\u0a49\u0a4a\5\u01b6\u00dc\2\u0a4a\u0a50\3\2\2\2\u0a4b"+
		"\u0a4c\f\3\2\2\u0a4c\u0a4d\7P\2\2\u0a4d\u0a4f\5\u01b6\u00dc\2\u0a4e\u0a4b"+
		"\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51"+
		"\u01b5\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53\u0a54\b\u00dc\1\2\u0a54\u0a55"+
		"\5\u01b8\u00dd\2\u0a55\u0a5b\3\2\2\2\u0a56\u0a57\f\3\2\2\u0a57\u0a58\7"+
		"O\2\2\u0a58\u0a5a\5\u01b8\u00dd\2\u0a59\u0a56\3\2\2\2\u0a5a\u0a5d\3\2"+
		"\2\2\u0a5b\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u01b7\3\2\2\2\u0a5d"+
		"\u0a5b\3\2\2\2\u0a5e\u0a5f\b\u00dd\1\2\u0a5f\u0a60\5\u01ba\u00de\2\u0a60"+
		"\u0a66\3\2\2\2\u0a61\u0a62\f\3\2\2\u0a62\u0a63\7X\2\2\u0a63\u0a65\5\u01ba"+
		"\u00de\2\u0a64\u0a61\3\2\2\2\u0a65\u0a68\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a66"+
		"\u0a67\3\2\2\2\u0a67\u01b9\3\2\2\2\u0a68\u0a66\3\2\2\2\u0a69\u0a6a\b\u00de"+
		"\1\2\u0a6a\u0a6b\5\u01bc\u00df\2\u0a6b\u0a71\3\2\2\2\u0a6c\u0a6d\f\3\2"+
		"\2\u0a6d\u0a6e\7Y\2\2\u0a6e\u0a70\5\u01bc\u00df\2\u0a6f\u0a6c\3\2\2\2"+
		"\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u01bb"+
		"\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\b\u00df\1\2\u0a75\u0a76\5\u01be"+
		"\u00e0\2\u0a76\u0a7c\3\2\2\2\u0a77\u0a78\f\3\2\2\u0a78\u0a79\7W\2\2\u0a79"+
		"\u0a7b\5\u01be\u00e0\2\u0a7a\u0a77\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7a"+
		"\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u01bd\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7f"+
		"\u0a80\b\u00e0\1\2\u0a80\u0a81\5\u01c0\u00e1\2\u0a81\u0a8a\3\2\2\2\u0a82"+
		"\u0a83\f\4\2\2\u0a83\u0a84\7K\2\2\u0a84\u0a89\5\u01c0\u00e1\2\u0a85\u0a86"+
		"\f\3\2\2\u0a86\u0a87\7N\2\2\u0a87\u0a89\5\u01c0\u00e1\2\u0a88\u0a82\3"+
		"\2\2\2\u0a88\u0a85\3\2\2\2\u0a89\u0a8c\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8a"+
		"\u0a8b\3\2\2\2\u0a8b\u01bf\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8d\u0a8e\b\u00e1"+
		"\1\2\u0a8e\u0a8f\5\u01c2\u00e2\2\u0a8f\u0aa1\3\2\2\2\u0a90\u0a91\f\7\2"+
		"\2\u0a91\u0a92\7F\2\2\u0a92\u0aa0\5\u01c2\u00e2\2\u0a93\u0a94\f\6\2\2"+
		"\u0a94\u0a95\7E\2\2\u0a95\u0aa0\5\u01c2\u00e2\2\u0a96\u0a97\f\5\2\2\u0a97"+
		"\u0a98\7L\2\2\u0a98\u0aa0\5\u01c2\u00e2\2\u0a99\u0a9a\f\4\2\2\u0a9a\u0a9b"+
		"\7M\2\2\u0a9b\u0aa0\5\u01c2\u00e2\2\u0a9c\u0a9d\f\3\2\2\u0a9d\u0a9e\7"+
		"\34\2\2\u0a9e\u0aa0\5\16\b\2\u0a9f\u0a90\3\2\2\2\u0a9f\u0a93\3\2\2\2\u0a9f"+
		"\u0a96\3\2\2\2\u0a9f\u0a99\3\2\2\2\u0a9f\u0a9c\3\2\2\2\u0aa0\u0aa3\3\2"+
		"\2\2\u0aa1\u0a9f\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u01c1\3\2\2\2\u0aa3"+
		"\u0aa1\3\2\2\2\u0aa4\u0aa5\b\u00e2\1\2\u0aa5\u0aa6\5\u01c4\u00e3\2\u0aa6"+
		"\u0ab6\3\2\2\2\u0aa7\u0aa8\f\5\2\2\u0aa8\u0aa9\7F\2\2\u0aa9\u0aaa\7F\2"+
		"\2\u0aaa\u0ab5\5\u01c4\u00e3\2\u0aab\u0aac\f\4\2\2\u0aac\u0aad\7E\2\2"+
		"\u0aad\u0aae\7E\2\2\u0aae\u0ab5\5\u01c4\u00e3\2\u0aaf\u0ab0\f\3\2\2\u0ab0"+
		"\u0ab1\7E\2\2\u0ab1\u0ab2\7E\2\2\u0ab2\u0ab3\7E\2\2\u0ab3\u0ab5\5\u01c4"+
		"\u00e3\2\u0ab4\u0aa7\3\2\2\2\u0ab4\u0aab\3\2\2\2\u0ab4\u0aaf\3\2\2\2\u0ab5"+
		"\u0ab8\3\2\2\2\u0ab6\u0ab4\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u01c3\3\2"+
		"\2\2\u0ab8\u0ab6\3\2\2\2\u0ab9\u0aba\b\u00e3\1\2\u0aba\u0abb\5\u01c6\u00e4"+
		"\2\u0abb\u0ac4\3\2\2\2\u0abc\u0abd\f\4\2\2\u0abd\u0abe\7S\2\2\u0abe\u0ac3"+
		"\5\u01c6\u00e4\2\u0abf\u0ac0\f\3\2\2\u0ac0\u0ac1\7T\2\2\u0ac1\u0ac3\5"+
		"\u01c6\u00e4\2\u0ac2\u0abc\3\2\2\2\u0ac2\u0abf\3\2\2\2\u0ac3\u0ac6\3\2"+
		"\2\2\u0ac4\u0ac2\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u01c5\3\2\2\2\u0ac6"+
		"\u0ac4\3\2\2\2\u0ac7\u0ac8\b\u00e4\1\2\u0ac8\u0ac9\5\u01c8\u00e5\2\u0ac9"+
		"\u0ad5\3\2\2\2\u0aca\u0acb\f\5\2\2\u0acb\u0acc\7U\2\2\u0acc\u0ad4\5\u01c8"+
		"\u00e5\2\u0acd\u0ace\f\4\2\2\u0ace\u0acf\7V\2\2\u0acf\u0ad4\5\u01c8\u00e5"+
		"\2\u0ad0\u0ad1\f\3\2\2\u0ad1\u0ad2\7Z\2\2\u0ad2\u0ad4\5\u01c8\u00e5\2"+
		"\u0ad3\u0aca\3\2\2\2\u0ad3\u0acd\3\2\2\2\u0ad3\u0ad0\3\2\2\2\u0ad4\u0ad7"+
		"\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u01c7\3\2\2\2\u0ad7"+
		"\u0ad5\3\2\2\2\u0ad8\u0ae0\5\u01ca\u00e6\2\u0ad9\u0ae0\5\u01cc\u00e7\2"+
		"\u0ada\u0adb\7S\2\2\u0adb\u0ae0\5\u01c8\u00e5\2\u0adc\u0add\7T\2\2\u0add"+
		"\u0ae0\5\u01c8\u00e5\2\u0ade\u0ae0\5\u01ce\u00e8\2\u0adf\u0ad8\3\2\2\2"+
		"\u0adf\u0ad9\3\2\2\2\u0adf\u0ada\3\2\2\2\u0adf\u0adc\3\2\2\2\u0adf\u0ade"+
		"\3\2\2\2\u0ae0\u01c9\3\2\2\2\u0ae1\u0ae2\7Q\2\2\u0ae2\u0ae3\5\u01c8\u00e5"+
		"\2\u0ae3\u01cb\3\2\2\2\u0ae4\u0ae5\7R\2\2\u0ae5\u0ae6\5\u01c8\u00e5\2"+
		"\u0ae6\u01cd\3\2\2\2\u0ae7\u0aee\5\u01d0\u00e9\2\u0ae8\u0ae9\7H\2\2\u0ae9"+
		"\u0aee\5\u01c8\u00e5\2\u0aea\u0aeb\7G\2\2\u0aeb\u0aee\5\u01c8\u00e5\2"+
		"\u0aec\u0aee\5\u01da\u00ee\2\u0aed\u0ae7\3\2\2\2\u0aed\u0ae8\3\2\2\2\u0aed"+
		"\u0aea\3\2\2\2\u0aed\u0aec\3\2\2\2\u0aee\u01cf\3\2\2\2\u0aef\u0af2\5\u0162"+
		"\u00b2\2\u0af0\u0af2\5<\37\2\u0af1\u0aef\3\2\2\2\u0af1\u0af0\3\2\2\2\u0af2"+
		"\u0af7\3\2\2\2\u0af3\u0af6\5\u01d4\u00eb\2\u0af4\u0af6\5\u01d8\u00ed\2"+
		"\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u0af9\3\2\2\2\u0af7\u0af5"+
		"\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u01d1\3\2\2\2\u0af9\u0af7\3\2\2\2\u0afa"+
		"\u0afb\5\u01d0\u00e9\2\u0afb\u0afc\7Q\2\2\u0afc\u01d3\3\2\2\2\u0afd\u0afe"+
		"\7Q\2\2\u0afe\u01d5\3\2\2\2\u0aff\u0b00\5\u01d0\u00e9\2\u0b00\u0b01\7"+
		"R\2\2\u0b01\u01d7\3\2\2\2\u0b02\u0b03\7R\2\2\u0b03\u01d9\3\2\2\2\u0b04"+
		"\u0b05\7;\2\2\u0b05\u0b06\5\6\4\2\u0b06\u0b07\7<\2\2\u0b07\u0b08\5\u01c8"+
		"\u00e5\2\u0b08\u0b20\3\2\2\2\u0b09\u0b0a\7;\2\2\u0b0a\u0b0e\5\16\b\2\u0b0b"+
		"\u0b0d\5*\26\2\u0b0c\u0b0b\3\2\2\2\u0b0d\u0b10\3\2\2\2\u0b0e\u0b0c\3\2"+
		"\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b11\3\2\2\2\u0b10\u0b0e\3\2\2\2\u0b11"+
		"\u0b12\7<\2\2\u0b12\u0b13\5\u01ce\u00e8\2\u0b13\u0b20\3\2\2\2\u0b14\u0b15"+
		"\7;\2\2\u0b15\u0b19\5\16\b\2\u0b16\u0b18\5*\26\2\u0b17\u0b16\3\2\2\2\u0b18"+
		"\u0b1b\3\2\2\2\u0b19\u0b17\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1c\3\2"+
		"\2\2\u0b1b\u0b19\3\2\2\2\u0b1c\u0b1d\7<\2\2\u0b1d\u0b1e\5\u01a2\u00d2"+
		"\2\u0b1e\u0b20\3\2\2\2\u0b1f\u0b04\3\2\2\2\u0b1f\u0b09\3\2\2\2\u0b1f\u0b14"+
		"\3\2\2\2\u0b20\u01db\3\2\2\2\u0144\u01e0\u01e5\u01ec\u01f0\u01f4\u01fd"+
		"\u0201\u0205\u0207\u020d\u0212\u0219\u021e\u0220\u0226\u022b\u0230\u0235"+
		"\u0240\u024e\u0253\u025b\u0262\u0268\u026d\u0278\u027b\u0289\u028e\u0293"+
		"\u0298\u029e\u02a8\u02b0\u02ba\u02c2\u02ce\u02d4\u02d9\u02e2\u02ed\u030a"+
		"\u030e\u0313\u0319\u031c\u031f\u032b\u0336\u0344\u034b\u0354\u035b\u0360"+
		"\u036f\u0376\u037c\u0380\u0384\u0388\u038c\u0391\u0395\u0399\u039b\u03a0"+
		"\u03a7\u03ac\u03ae\u03b4\u03b9\u03bd\u03d0\u03d5\u03e5\u03ea\u03f0\u03f6"+
		"\u03f8\u03fc\u0401\u0405\u040c\u0413\u041b\u041e\u0423\u042b\u0430\u0437"+
		"\u043e\u0443\u0449\u0455\u045a\u045e\u0468\u046d\u0475\u0478\u047d\u0485"+
		"\u0488\u048d\u0492\u0497\u049c\u04a3\u04a8\u04b0\u04b5\u04ba\u04bf\u04c5"+
		"\u04cb\u04ce\u04d1\u04da\u04e0\u04e6\u04e9\u04ec\u04f4\u04f9\u04fe\u0504"+
		"\u0507\u0512\u051b\u0525\u052a\u0535\u053a\u0546\u054b\u0557\u0561\u0566"+
		"\u056e\u0571\u0578\u0580\u0586\u058f\u0599\u059d\u05a0\u05a9\u05b7\u05ba"+
		"\u05c3\u05c8\u05d0\u05d6\u05de\u05ea\u05f1\u05ff\u0617\u0639\u0645\u064b"+
		"\u0657\u0664\u067e\u0682\u0687\u068b\u068f\u0697\u069b\u069f\u06a6\u06af"+
		"\u06b7\u06c6\u06d2\u06d8\u06de\u06f3\u06f8\u06fe\u070a\u0715\u071f\u0722"+
		"\u0727\u0730\u0736\u0740\u0745\u074e\u0765\u076f\u0785\u078c\u0794\u079c"+
		"\u07a7\u07be\u07c8\u07d3\u07e9\u07ed\u07f2\u07fa\u0800\u0804\u0808\u080c"+
		"\u0812\u0817\u081c\u0820\u0824\u082a\u082f\u0834\u0838\u083c\u083e\u0843"+
		"\u0848\u084d\u0851\u0855\u0859\u085e\u0866\u086c\u0870\u0874\u0878\u087e"+
		"\u0883\u0888\u088c\u0890\u0892\u0897\u08a6\u08b4\u08c0\u08c9\u08d8\u08e5"+
		"\u08ee\u08f4\u08fb\u0900\u0907\u090c\u0913\u0918\u091f\u0924\u092c\u0931"+
		"\u0935\u0939\u093e\u0945\u094c\u0951\u0958\u095d\u0964\u0969\u0971\u0976"+
		"\u097a\u0981\u0987\u098e\u0995\u099c\u09a4\u09ab\u09b3\u09b7\u09be\u09c5"+
		"\u09cc\u09d4\u09db\u09e3\u09e9\u09ef\u09fb\u0a01\u0a07\u0a12\u0a1b\u0a22"+
		"\u0a29\u0a2e\u0a32\u0a3b\u0a46\u0a50\u0a5b\u0a66\u0a71\u0a7c\u0a88\u0a8a"+
		"\u0a9f\u0aa1\u0ab4\u0ab6\u0ac2\u0ac4\u0ad3\u0ad5\u0adf\u0aed\u0af1\u0af5"+
		"\u0af7\u0b0e\u0b19\u0b1f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}