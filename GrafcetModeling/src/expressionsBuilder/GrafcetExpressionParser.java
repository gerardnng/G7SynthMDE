package expressionsBuilder;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import g7Expression.g7ExpressionLexer;
import g7Expression.g7ExpressionParser;
import grafcetmodeling.model.grafcetModeling.ArithmOpValues;
import grafcetmodeling.model.grafcetModeling.AritmeticOperator;
import grafcetmodeling.model.grafcetModeling.ExprType;
import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.LogicOpValues;
import grafcetmodeling.model.grafcetModeling.LogicalOperator;
import grafcetmodeling.model.grafcetModeling.TimingOperator;
import grafcetmodeling.model.grafcetModeling.TimingType;


public class GrafcetExpressionParser {
	
	
	public static Expression parseBuildExprTree(String expr_str, Grafcet g7) {
		try {
			Expression exp_result = null;
			
			ANTLRInputStream input = new ANTLRInputStream(expr_str);
			g7ExpressionLexer lexer = new g7ExpressionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			g7ExpressionParser parser = new g7ExpressionParser(tokens);
			//parser.addParseListener(new MyExprBaseListener());
			
			// Start parsing
			ParseTree tree = parser.myG7Expr();
			//System.out.println("\n\n" + tree.toStringTree(parser)+"\n\n"); // print tree as text
			G7ExprVisitor expVisitor = new G7ExprVisitor(g7);
			
			exp_result = expVisitor.visit(tree);
			//Fill the expressions names recursively
			if(exp_result==null)
				System.out.println("C'EST ICI. exp_result = null. Expr Name = "+expr_str);
			else 
			exp_result.fillTreeNamesSimply();
			
			//Validation of the expression in the sense where the used variables exist in the G7 model
			/*try{
				exp_result.detectUnexistingVariables(g7);
			}catch(UnExistingGrafcetVariableException e) {
				e.printStackTrace();
			}
			*/
			
			//Infer recursively the type (Logic or Arithmetic) of the expression
			//exp_result.inferExpLeavesType();
			//OK, done directly in the visitor
			
			//If needed, but not necessary because it is done recursively in the visitor with exp.getInfixTreeString()
			//exp_result.setName(expr_str);
			
			//Fill the 2nd name for code generation
			//exp_result.evalName2();
			//will be called when needed
			
			//Fill the C expressions used in the program recursively
			/*String c_syntax = exp.getCSyntaxExpression();
			Useless: will be call when generation code for every transition*/
			
			//expVisitor.printG7Variables();
			
			
			return exp_result;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static String getInfixTreeString(Expression exp) {
		return getInfixStringTreeRecursively(exp);
	}
	

	private static String getInfixStringTreeRecursively(Expression expr) {
		//Debgging
		//System.out.println("-- EXPRESSION : "+expr.getExpression());
		
		//Verification NEW
		/*System.out.println("------------------------------printString Received---------------------------------\n");
		System.out.println("EXP This Expression: Operator : " +expr.getOperator());
		System.out.println("> EXP SubExpressions of MyG7Expr: " +expr);
		System.out.println("\t EXP Left --> "+expr.getSubExpr1().getVariable().getName()+"   "+expr.getSubExpr1());
		System.out.println("\t EXP Right --> "+expr.getSubExpr2().getVariable().getName()+"   "+expr.getSubExpr2()+"\n");
		System.out.println("------------------------------printString Received END ---------------------------------\n");
		*/
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+"";
					case ExprType.LOGICAL_VALUE:
						return expr.getBoolValue()+"";
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					return expr.getVariable().getName();
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
					return "";
				}
			}
		}
		else {
			//An operator
			
			String right_expr = getInfixStringTreeRecursively(expr.getSubExpr2());
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					return "["+op.getDuration1()+op.getUnit1()+"/"+right_expr+"]";
				case TimingType.DELAYED2_VALUE:
					return "["+op.getDuration1()+op.getUnit1()+"/"+right_expr+"/"+op.getDuration2()+op.getUnit2()+"]";
				case TimingType.LIMITED_VALUE:
					return "[not "+op.getDuration1()+op.getUnit1()+"/"+right_expr+"]";
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" or "+right_expr+")";
					case LogicOpValues.AND_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" and "+right_expr+")";
					case LogicOpValues.NOT_VALUE:
						return "(not "+right_expr+")";
					case LogicOpValues.RE_VALUE:
						return "(RE "+right_expr+")";
					case LogicOpValues.FE_VALUE:
						return "(FE "+right_expr+")";
					case LogicOpValues.EQU_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" == "+right_expr+")";
					case LogicOpValues.LE_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" <= "+right_expr+")";
					case LogicOpValues.LT_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" < "+right_expr+")";
					case LogicOpValues.GE_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" >= "+right_expr+")";
					case LogicOpValues.GT_VALUE:
						return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" > "+right_expr+")";
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" + "+right_expr+")";
							case ArithmOpValues.SUB_VALUE:
								return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" - "+right_expr+")";
							case ArithmOpValues.MULT_VALUE:
								return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" * "+right_expr+")";
							case ArithmOpValues.DIV_VALUE:
								return "("+getInfixStringTreeRecursively(expr.getSubExpr1())+" / "+right_expr+")";
							case ArithmOpValues.UMINUS_VALUE:
								return "(- "+right_expr+")";
						}	
					}
		}
		return null;
	}
	
	public static String getRPN_StringTree(Expression exp) {
		return getRVP_StringTree_Recursively(exp);
	}
	
	//RPN: Reverse Polish Notation
	private static String getRVP_StringTree_Recursively(Expression expr) {
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+" ";
					case ExprType.LOGICAL_VALUE:
						return expr.getBoolValue()+" ";
				}
			}
			else {
				if(expr.getVariable()!=null) {
					return expr.getVariable().getName()+" ";
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
					return "";
				}
			}
		}
		else {
			//An operator
			
			String right_expr = getRVP_StringTree_Recursively(expr.getSubExpr2());
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					return "["+op.getDuration1()+op.getUnit1()+"/"+right_expr+": D1]";
				case TimingType.DELAYED2_VALUE:
					return "["+op.getDuration1()+op.getUnit1()+"/"+right_expr+"/"+op.getDuration2()+op.getUnit2()+" : D2]";
				case TimingType.LIMITED_VALUE:
					return "[not "+op.getDuration1()+op.getUnit1()+"/"+right_expr+" : L]";
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" or ";
					case LogicOpValues.AND_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" and ";
					case LogicOpValues.NOT_VALUE:
						return  right_expr + " not ";
					case LogicOpValues.RE_VALUE:
						return right_expr + " RE ";
					case LogicOpValues.FE_VALUE:
						return right_expr + " FE ";
					case LogicOpValues.EQU_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" == ";
					case LogicOpValues.LE_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" <= ";
					case LogicOpValues.LT_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" < ";
					case LogicOpValues.GE_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" >= ";
					case LogicOpValues.GT_VALUE:
						return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" > ";
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" + ";
							case ArithmOpValues.SUB_VALUE:
								return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" - ";
							case ArithmOpValues.MULT_VALUE:
								return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" * ";
							case ArithmOpValues.DIV_VALUE:
								return right_expr+" "+getRVP_StringTree_Recursively(expr.getSubExpr1())+" / ";
							case ArithmOpValues.UMINUS_VALUE:
								return right_expr+" - ";
						}	
					}
		}
		return null;
	}
	
	//For using a stack of an evaluation 
	/*
	public static List<String> reversePolishNotation(String expr_str, Grafcet g7) {
		List<String> result = new List<String>();
	}
	*/
	
	
	public static Integer ParseAndEvalSimpleExpr(String expression) {
		try {
			ANTLRInputStream input = new ANTLRInputStream(expression);
			g7ExpressionLexer lexer = new g7ExpressionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			g7ExpressionParser parser = new g7ExpressionParser(tokens);
			//parser.addParseListener(new MyExprBaseListener());
			
			// Start parsing
			ParseTree tree = parser.g7Expr();
			
			//System.out.println("\n\n" + tree.toStringTree(parser)+"\n\n"); // print tree as text
			
			G7ExprEvalVisitor strVisitor = new G7ExprEvalVisitor();
			Integer value = strVisitor.visit(tree);
			return value;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}


	public static String parseAndStringExpr(String expression) {
		//System.out.println("\nParse and toString ANTLR4\n");
		try {
			ANTLRInputStream input = new ANTLRInputStream(expression);
			g7ExpressionLexer lexer = new g7ExpressionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			g7ExpressionParser parser = new g7ExpressionParser(tokens);
			//parser.addParseListener(new MyExprBaseListener());
			
			// Start parsing
			ParseTree tree = parser.g7Expr();
			
			//System.out.println("\n\n" + tree.toStringTree(parser)+"\n\n"); // print tree as text
			
			G7ExprStringVisitor strVisitor = new G7ExprStringVisitor();
			String str = strVisitor.visit(tree);
			return str;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static String parseAndStringFromFile(String fileName) {
		
		try {
			FileInputStream expressions =new FileInputStream(fileName);
			
			ANTLRInputStream input = new ANTLRInputStream(expressions);
			g7ExpressionLexer lexer = new g7ExpressionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			g7ExpressionParser parser = new g7ExpressionParser(tokens);
			//parser.addParseListener(new MyExprBaseListener());
			
			// Start parsing
			ParseTree tree = parser.g7Expr();
			
			//System.out.println("\n\n" + tree.toStringTree(parser)+"\n\n"); // print tree as text
			
			G7ExprStringVisitor strVisitor = new G7ExprStringVisitor();
			String str = strVisitor.visit(tree);
			return str;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
}
