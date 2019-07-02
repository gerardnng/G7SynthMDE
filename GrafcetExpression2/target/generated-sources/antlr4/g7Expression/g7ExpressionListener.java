// Generated from g7Expression.g4 by ANTLR 4.7.1

package g7Expression;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link g7ExpressionParser}.
 */
public interface g7ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link g7ExpressionParser#myG7Expr}.
	 * @param ctx the parse tree
	 */
	void enterMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link g7ExpressionParser#myG7Expr}.
	 * @param ctx the parse tree
	 */
	void exitMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualDiff_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualDiff_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryAtom}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryAtom}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryParenthesis}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryParenthesis}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixMinus(g7ExpressionParser.InfixMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixMinus(g7ExpressionParser.InfixMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryTiming}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryTiming}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEcmp_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEcmp_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryLogicOp}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryLogicOp}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr_G7Expr}
	 * labeled alternative in {@link g7ExpressionParser#g7Expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeLogicDelayed2}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void enterTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code timeLogicDelayed2}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void exitTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code timeLogicDelayed1}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void enterTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code timeLogicDelayed1}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void exitTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code timeLogicG7ExprLimited}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void enterTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeLogicG7ExprLimited}
	 * labeled alternative in {@link g7ExpressionParser#timeLogicG7Expr}.
	 * @param ctx the parse tree
	 */
	void exitTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(g7ExpressionParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(g7ExpressionParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomId(g7ExpressionParser.AtomIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomId(g7ExpressionParser.AtomIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomBool}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomBool(g7ExpressionParser.AtomBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomBool}
	 * labeled alternative in {@link g7ExpressionParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomBool(g7ExpressionParser.AtomBoolContext ctx);
}