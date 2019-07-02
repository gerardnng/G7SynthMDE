// Generated from G7ActionsExpr.g4 by ANTLR 4.7.1

package g7ActionsExpressions;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G7ActionsExprParser}.
 */
public interface G7ActionsExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(G7ActionsExprParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(G7ActionsExprParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(G7ActionsExprParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(G7ActionsExprParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(G7ActionsExprParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(G7ActionsExprParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link G7ActionsExprParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(G7ActionsExprParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link G7ActionsExprParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(G7ActionsExprParser.Expr2Context ctx);
}