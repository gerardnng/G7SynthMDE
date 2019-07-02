package expressionsBuilder;

import g7Expression.g7ExpressionBaseVisitor;
import g7Expression.g7ExpressionParser;

public class G7ExprEvalVisitor extends g7ExpressionBaseVisitor<Integer>{
	//private GrafcetImpl grafcet;
	
		//private GrafcetModelingFactoryImpl g7Factory = new GrafcetModelingFactoryImpl();
		
		public G7ExprEvalVisitor() {
			super();
			//System.out.println("Here ...");
		}
		
		@Override 
		public Integer visitMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx) { 
			return  visit(ctx.g7Expr());
		}
		
		
		//Begin methods to modify
		
		@Override 
		public Integer visitMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx) {
			//MULT|DIV
			switch (ctx.op.getType()) {
				case g7ExpressionParser.MULT: 
					return visit(ctx.g7Expr(0)) * visit(ctx.g7Expr(1));
				case g7ExpressionParser.DIV: 
					return visit(ctx.g7Expr(0)) / visit(ctx.g7Expr(1));
			}
		return 0;
		}

		@Override 
		public Integer visitAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx) {
			//ADD |SUB
			switch (ctx.op.getType()) {
				case g7ExpressionParser.ADD: 
					return visit(ctx.g7Expr(0)) + visit(ctx.g7Expr(1));
				case g7ExpressionParser.SUB: 
					return visit(ctx.g7Expr(0)) - visit(ctx.g7Expr(1));
			}
			return 0;
		}
		
		@Override 
		public Integer visitUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx) {
			//(NOT|RE|FE)
			
			switch (ctx.op.getType()) {
				case g7ExpressionParser.NOT: 
					if(visit(ctx.g7Expr())==0)
						return 1;
				//Not Necessary, because we cannot evaluate it
				case g7ExpressionParser.RE: 
					;
				case g7ExpressionParser.FE: 
					;
			}
			return 0;
		}
		
		
		
		@Override 
		public Integer visitEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx) {
			//EQUAL|DIFF
			switch (ctx.op.getType()) {
				case g7ExpressionParser.EQUAL: 
					if(visit(ctx.g7Expr(0))==visit(ctx.g7Expr(1)))
						return 1;
				case g7ExpressionParser.DIFF: 
					if(visit(ctx.g7Expr(0))!=visit(ctx.g7Expr(1)))
						return 1;
			}
			return 0;
		}
		
		
		@Override 
		public Integer visitAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx) {
			//AND|OR
			switch (ctx.op.getType()) {
				case g7ExpressionParser.AND: 
					return visit(ctx.g7Expr(0)) * visit(ctx.g7Expr(1));
				case g7ExpressionParser.OR: 
					return visit(ctx.g7Expr(0)) + visit(ctx.g7Expr(1));
			}
			return 0;
		}
		
		
		@Override 
		public Integer visitLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx) {
			switch (ctx.op.getType()) {
				case g7ExpressionParser.LE: 
					if(visit(ctx.g7Expr(0)) <= visit(ctx.g7Expr(1)))
						return 1;
				case g7ExpressionParser.GE: 
					if(visit(ctx.g7Expr(0)) >= visit(ctx.g7Expr(1)))
						return 1;
				case g7ExpressionParser.LT: 
					if(visit(ctx.g7Expr(0)) < visit(ctx.g7Expr(1)))
						return 1;
				case g7ExpressionParser.GT: 
					if(visit(ctx.g7Expr(0)) > visit(ctx.g7Expr(1)))
						return 1;
			}
			return 0;
		}
		
		//End methods to modify
		
		
		@Override 
		public Integer visitInfixMinus(g7ExpressionParser.InfixMinusContext ctx) { 
			return -visit(ctx.g7Expr());
		}
		
		
		@Override 
		public Integer visitPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx) { 
			return visit(ctx.g7Expr());
		}
		
		
		@Override 
		public Integer visitPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx) { 
			return visit(ctx.atomic());
		}
		
		@Override 
		public Integer visitPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx) {
			//Not Necessary, because we cannot evaluate it
			return visit(ctx.timeLogicG7Expr()); 
		}
		
		
		@Override 
		public Integer visitTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx) {
			//Not Necessary, because we cannot evaluate it
			return visit(ctx.g7Expr());
		}
		
		@Override 
		public Integer visitTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx) { 
			//Not Necessary, because we cannot evaluate it
			//return "L: not ["+ctx.Number().getText()+ctx.U().getText()+"/"+visit(ctx.g7Expr())+"]";
			return visit(ctx.g7Expr());
		}
		
		@Override 
		public Integer visitTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx) {
			//return "D2: ["+ctx.Number(0).getText()+ctx.U(0).getText()+"/"+visit(ctx.g7Expr())+"/"+ctx.Number(1).getText()+ctx.U(1).getText()+"]";
			//Not Necessary, because we cannot evaluate it
			return visit(ctx.g7Expr());
		}
		
		
		@Override 
		public Integer visitAtomNumber(g7ExpressionParser.AtomNumberContext ctx) {
			return Integer.parseInt(ctx.Number().getText());
		}
		
		@Override 
		public Integer visitAtomId(g7ExpressionParser.AtomIdContext ctx) /*throws Exception*/{
			//System.out.println(ctx.Id().getText());
			//Not Necessary, because we have not stored it in memory
			return Integer.parseInt(ctx.Id().getText());
		}
		
		@Override 
		public Integer visitAtomBool(g7ExpressionParser.AtomBoolContext ctx) {
			//true or false
			if(ctx.BoolValue().getText().contentEquals("true"))
				return 1;
			return 0;
		}
}

