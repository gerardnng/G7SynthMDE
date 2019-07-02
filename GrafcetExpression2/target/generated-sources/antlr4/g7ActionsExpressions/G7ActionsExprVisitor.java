// Generated from G7ActionsExpr.g4 by ANTLR 4.7.1

package g7ActionsExpressions;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link G7ActionsExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface G7ActionsExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(G7ActionsExprParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(G7ActionsExprParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link G7ActionsExprParser#actExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(G7ActionsExprParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link G7ActionsExprParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(G7ActionsExprParser.Expr2Context ctx);
}