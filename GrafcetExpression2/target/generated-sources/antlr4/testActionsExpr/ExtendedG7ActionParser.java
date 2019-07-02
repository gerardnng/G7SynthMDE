package testActionsExpr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import g7ActionsExpressions.G7ActionsExprLexer;
import g7ActionsExpressions.G7ActionsExprParser;

public class ExtendedG7ActionParser {
	public static ExtendedG7Action getExtendedActionExpression(String expression){
		try {
			ANTLRInputStream input = new ANTLRInputStream(expression);
			G7ActionsExprLexer lexer = new G7ActionsExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			G7ActionsExprParser parser = new G7ActionsExprParser(tokens);

			ParseTree tree = parser.actExpr();
			
			System.out.println("\nTree : " + tree.toStringTree(parser)+"\n"); // print tree as text
			
			ExtendedG7ActionVisitor actionVisitor = new ExtendedG7ActionVisitor();
			ExtendedG7Action extExpr = actionVisitor.visit(tree);
			return extExpr;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	public static ExtendedG7Action parseActionExpression(String expression, String actionName)throws Exception{

		ExtendedG7Action extExpr = getExtendedActionExpression(expression);
		if(!extExpr.validateAction(actionName)) {
			throw new Exception("The action <"+actionName+"> is not concordent with its expression "+expression);
		}
		return extExpr;
	}
}
