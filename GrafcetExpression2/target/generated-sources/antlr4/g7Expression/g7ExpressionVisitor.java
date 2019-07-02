// Generated from g7Expression.g4 by ANTLR 4.7.1

package g7Expression;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link g7ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface g7ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link g7ExpressionParser#myG7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualDiff_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryAtom}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryParenthesis}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixMinus(g7ExpressionParser.InfixMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryTiming}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LEcmp_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryLogicOp}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeLogicDelayed2}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code timeLogicDelayed1}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code timeLogicG7ExprLimited}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(g7ExpressionParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomId(g7ExpressionParser.AtomIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomBool}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomBool(g7ExpressionParser.AtomBoolContext ctx);
}