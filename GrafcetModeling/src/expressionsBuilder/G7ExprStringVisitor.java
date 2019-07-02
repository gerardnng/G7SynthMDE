package expressionsBuilder;

import g7Expression.g7ExpressionBaseVisitor;
import g7Expression.g7ExpressionParser;

public class G7ExprStringVisitor extends g7ExpressionBaseVisitor<String>{
	//private GrafcetImpl grafcet;
	
	//private GrafcetModelingFactoryImpl g7Factory = new GrafcetModelingFactoryImpl();
	
	public G7ExprStringVisitor() {
		super();
		//System.out.println("Here ...");
	}
	
	@Override 
	public String visitMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx) { 
		return  visit(ctx.g7Expr());
	}
	
	
	//Begin methods to modify
	
	@Override 
	public String visitMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx) {
		//MULT|DIV
		switch (ctx.op.getType()) {
			case g7ExpressionParser.MULT: 
				return "("+visit(ctx.g7Expr(0)) +"*"+ visit(ctx.g7Expr(1))+")";
			case g7ExpressionParser.DIV: 
				return "("+visit(ctx.g7Expr(0)) +"/"+ visit(ctx.g7Expr(1))+")";
		}
		return null;
	}
	
	@Override 
	public String visitAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx) {
		//ADD |SUB
		switch (ctx.op.getType()) {
		case g7ExpressionParser.ADD: 
			return "("+visit(ctx.g7Expr(0)) +"+"+ visit(ctx.g7Expr(1))+")";
		case g7ExpressionParser.SUB: 
			return "("+visit(ctx.g7Expr(0)) +"-"+ visit(ctx.g7Expr(1))+")";
	}
	return null;
	}
	
	@Override 
	public String visitUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx) {
		//(NOT|RE|FE)
		
		switch (ctx.op.getType()) {
			case g7ExpressionParser.NOT: 
				return "(not "+visit(ctx.g7Expr())+")";
			
			case g7ExpressionParser.RE: 
				return "(RE "+visit(ctx.g7Expr())+")";
			case g7ExpressionParser.FE: 
				return "(FE "+visit(ctx.g7Expr())+")";
		}
		return null;
	}
	
	
	@Override 
	public String visitEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx) {
		//EQUAL|DIFF
		switch (ctx.op.getType()) {
			case g7ExpressionParser.EQUAL: 
				return "("+visit(ctx.g7Expr(0)) +"=="+ visit(ctx.g7Expr(1))+")";
			//Not Necessary, because we cannot evaluate it
			case g7ExpressionParser.DIFF: 
				return "("+visit(ctx.g7Expr(0)) +"!="+ visit(ctx.g7Expr(1))+")";
		}
		return null;
	}
	
	
	
	@Override 
	public String visitAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx) {
		//AND|OR
		switch (ctx.op.getType()) {
			case g7ExpressionParser.AND: 
				//return "("+visit(ctx.g7Expr(0)) +" and "+ visit(ctx.g7Expr(1))+")";
				return "("+visit(ctx.g7Expr(0)) +" and "+ visit(ctx.g7Expr(1))+")";
			//Not Necessary, because we cannot evaluate it
			case g7ExpressionParser.OR: 
				return "("+visit(ctx.g7Expr(0)) +" or "+ visit(ctx.g7Expr(1))+")";
		}
		return null;
	}
	
	
	
	@Override 
	public String visitLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx) {
		//(LE|GE|LT|GT)
		switch (ctx.op.getType()) {
		case g7ExpressionParser.LE: 
			return "("+visit(ctx.g7Expr(0)) +"<="+ visit(ctx.g7Expr(1))+")";
		case g7ExpressionParser.GE: 
			return "("+visit(ctx.g7Expr(0)) +">="+ visit(ctx.g7Expr(1))+")";
		case g7ExpressionParser.LT: 
			return "("+visit(ctx.g7Expr(0)) +"<"+ visit(ctx.g7Expr(1))+")";
		case g7ExpressionParser.GT: 
			return "("+visit(ctx.g7Expr(0)) +">"+ visit(ctx.g7Expr(1))+")";
		}
		return null;
	}
	
	//End methods to modify


	@Override 
	public String visitInfixMinus(g7ExpressionParser.InfixMinusContext ctx) { 
		return "-("+visit(ctx.g7Expr()) +")";
	}
	
	@Override 
	public String visitPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx) { 
		return visit(ctx.g7Expr());
	}

	@Override 
	public String visitPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx) { 
		return visit(ctx.atomic());
	}
	
	
	@Override 
	public String visitPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx) { 
		return "("+visit(ctx.timeLogicG7Expr())+")"; 
	}
	
	
	@Override 
	public String visitTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx) {
		//return "("+visit(ctx.g7Expr()) + ")";
		return "D1: ["+ctx.Number().getText()+ctx.U().getText()+"/"+visit(ctx.g7Expr())+"]";
	}
	
	@Override 
	public String visitTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx) { 
		return "L: not ["+ctx.Number().getText()+ctx.U().getText()+"/"+visit(ctx.g7Expr())+"]";
	}
	
	@Override 
	public String visitTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx) {
		return "D2: ["+ctx.Number(0).getText()+ctx.U(0).getText()+"/"+visit(ctx.g7Expr())+"/"+ctx.Number(1).getText()+ctx.U(1).getText()+"]";
	}
	
	@Override 
	public String visitAtomNumber(g7ExpressionParser.AtomNumberContext ctx) {
		return ctx.Number().getText();
	}
	
	@Override 
	public String visitAtomId(g7ExpressionParser.AtomIdContext ctx) /*throws Exception*/{
		//System.out.println(ctx.Id().getText());
		return ctx.Id().getText();
	}
	
	@Override 
	public String visitAtomBool(g7ExpressionParser.AtomBoolContext ctx) { 
		return ctx.BoolValue().getText(); //true or false
	}
}


