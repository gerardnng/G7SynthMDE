package expressionsBuilder;

import g7Expression.g7ExpressionBaseVisitor;
import g7Expression.g7ExpressionParser;
import grafcetmodeling.model.grafcetModeling.*;
import grafcetmodeling.model.grafcetModeling.impl.*;

public class G7ExprVisitor extends g7ExpressionBaseVisitor<Expression>{
	private Grafcet grafcet;
	
	private GrafcetModelingFactoryImpl g7Factory = new GrafcetModelingFactoryImpl();
	
	public G7ExprVisitor(Grafcet g7) {
		super();
		
		this.grafcet = (g7!=null)? g7 : g7Factory.createGrafcet();
		//System.out.println("Creation g7Exp Visitor ... ");
	}
	
	public void setGrafcet(Grafcet g7) {
		this.grafcet = g7;
	}

	@Override 
	public Expression visitMyG7Expr(g7ExpressionParser.MyG7ExprContext ctx) {
		//System.out.print("Begin:  ");
		return  visit(ctx.g7Expr());
	}
	
	//Begin methods to modify
	
	@Override 
	public Expression visitMulDiv_G7Expr(g7ExpressionParser.MulDiv_G7ExprContext ctx) {
		String exp_str = afficher("("+ctx.left.getText()+" "+ctx.op.getText()+" "+ctx.g7Expr(1).getText()+")");
		//MULT|DIV
		
		Expression exp = g7Factory.createExpression();
		/*Expression expLeft = visit(ctx.g7Expr(0));
		Expression expRight = visit(ctx.g7Expr(1));*/
		Expression expLeft = visit(ctx.left);
		Expression expRight = visit(ctx.right);
		
		exp.setSubExpr1(expLeft);
		exp.setSubExpr2(expRight);
		
		AritmeticOperator op = g7Factory.createAritmeticOperator();
		switch (ctx.op.getType()) {
			case g7ExpressionParser.MULT: 
				op.setName(ArithmOpValues.MULT);
				break;
			case g7ExpressionParser.DIV: 
				op.setName(ArithmOpValues.DIV);
				break;
		}
		exp.setOperator(op);
		 
		exp.setType(ExprType.ARITHMETIC);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);
		
		return exp;
	}
	
	@Override 
	public Expression visitAddSub_G7Expr(g7ExpressionParser.AddSub_G7ExprContext ctx) {
		String exp_str = afficher("("+ctx.left.getText()+" "+ctx.op.getText()+" "+ctx.g7Expr(1).getText()+")");
		//ADD |SUB
		
		Expression exp = g7Factory.createExpression();
		/*Expression expLeft = visit(ctx.g7Expr(0));
		Expression expRight = visit(ctx.g7Expr(1));*/
		Expression expLeft = visit(ctx.left);
		Expression expRight = visit(ctx.right);
		exp.setSubExpr1(expLeft);
		exp.setSubExpr2(expRight);
		
		AritmeticOperator op = g7Factory.createAritmeticOperator();
		switch (ctx.op.getType()) {
			case g7ExpressionParser.ADD: 
				op.setName(ArithmOpValues.ADD);
				break;
			case g7ExpressionParser.SUB: 
				op.setName(ArithmOpValues.SUB);
				break;
		}
		exp.setOperator(op);
		
		exp.setType(ExprType.ARITHMETIC);
		exp.setIsSimple(false);
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);
		
		return exp;
	}
	
	@Override 
	public Expression visitUnaryLogicOp(g7ExpressionParser.UnaryLogicOpContext ctx) {
		String exp_str = afficher("("+ctx.op.getText()+" "+ctx.g7Expr().getText()+")");
		//System.out.print(exp_str);
		//(NOT|RE|FE)
		Expression exp = g7Factory.createExpression();
		Expression expLeft = visit(ctx.g7Expr());
		
		exp.setSubExpr1(null);
		exp.setSubExpr2(expLeft);
		
		LogicalOperator op = g7Factory.createLogicalOperator();
		
		switch (ctx.op.getType()) {
			case g7ExpressionParser.NOT: 
				op.setName(LogicOpValues.NOT);
				break;
			case g7ExpressionParser.RE: 
				op.setName(LogicOpValues.RE);
				break;
			case g7ExpressionParser.FE: 
				op.setName(LogicOpValues.FE);
				break;
		}
		
		exp.setOperator(op);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);
		
		return exp;
	}
	
	
	@Override 
	public Expression visitEqualDiff_G7Expr(g7ExpressionParser.EqualDiff_G7ExprContext ctx) {
		String exp_str = afficher("("+ctx.left.getText()+" "+ctx.op.getText()+" "+ctx.g7Expr(1).getText()+")");
		//EQUAL|DIFF
		
		Expression exp = g7Factory.createExpression();
		/*Expression expLeft = visit(ctx.g7Expr(0));
		Expression expRight = visit(ctx.g7Expr(1));*/
		Expression expLeft = visit(ctx.left);
		Expression expRight = visit(ctx.right);
		
		exp.setSubExpr1(expLeft);
		exp.setSubExpr2(expRight);
		
		LogicalOperator op = g7Factory.createLogicalOperator();
		switch (ctx.op.getType()) {
			case g7ExpressionParser.EQUAL: 
				op.setName(LogicOpValues.EQU);
				break;
			case g7ExpressionParser.DIFF: 
				op.setName(LogicOpValues.NEQ);
				break;
		}
		exp.setOperator(op);
	
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);

		return exp;  
	}
	
	@Override 
	public Expression visitAndOr_G7Expr(g7ExpressionParser.AndOr_G7ExprContext ctx) {
		//String exp_str = afficher("("+ctx.left.getText()+" "+ctx.op.getText()+" "+ctx.g7Expr(1).getText()+")");
		//AND|OR
		
		Expression exp = g7Factory.createExpression();
		/*Expression expLeft = visit(ctx.g7Expr(0));
		Expression expRight = visit(ctx.g7Expr(1));*/
		Expression expLeft = visit(ctx.left);
		Expression expRight = visit(ctx.right);
		
		
		exp.setSubExpr1(expLeft);
		exp.setSubExpr2(expRight);
		
		//System.out.println("Expr: NNG_XXXXX expLeft = " + expLeft);
		//System.out.println("Expr: NNG_XXXXX expRight = " + expRight);
		
		//Creating the operator
		LogicalOperator op = g7Factory.createLogicalOperator();
		switch (ctx.op.getType()) {
			case g7ExpressionParser.AND: 
				op.setName(LogicOpValues.AND);
				break;
			case g7ExpressionParser.OR: 
				op.setName(LogicOpValues.OR);
				break;
		}
		exp.setOperator(op);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);

		return exp;
	}

	@Override 
	public Expression visitLEcmp_G7Expr(g7ExpressionParser.LEcmp_G7ExprContext ctx) {
		//String exp_str = afficher("("+ctx.g7Expr(0).getText()+" "+ctx.op.getText()+" "+ctx.g7Expr(1).getText()+")");
	
		Expression exp = g7Factory.createExpression();
		/*Expression expLeft = visit(ctx.g7Expr(0));
		Expression expRight = visit(ctx.g7Expr(1));*/
		Expression expLeft = visit(ctx.left);
		Expression expRight = visit(ctx.right);
		
		exp.setSubExpr1(expLeft);
		exp.setSubExpr2(expRight);
		//op = (LE|GE|LT|GT)
		LogicalOperator op = g7Factory.createLogicalOperator();
		switch (ctx.op.getType()) {
			case g7ExpressionParser.LE: 
				op.setName(LogicOpValues.LE);
				break;
			case g7ExpressionParser.GE: 
				op.setName(LogicOpValues.GE);
				break;
			case g7ExpressionParser.LT: 
				op.setName(LogicOpValues.LT);
				break;
			case g7ExpressionParser.GT: 
				op.setName(LogicOpValues.GT);
				break;
		}
		exp.setOperator(op);
	
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);

		return exp;
	}
	
	//End methods to modify

	@Override
	public Expression visitPrimaryParenthesis(g7ExpressionParser.PrimaryParenthesisContext ctx) {
		String exp_str = afficher("("+ctx.g7Expr().getText()+")");
		return visit(ctx.g7Expr()); 
	}
	
	//Visit arithmetic expressions operator
	
	@Override 
	public Expression visitInfixMinus(g7ExpressionParser.InfixMinusContext ctx) {
		String exp_str = afficher("(-"+ctx.g7Expr().getText()+")");
		
		Expression exp = g7Factory.createExpression();
		Expression expRight = visit(ctx.g7Expr());
		
		//Left Expression is a constant value : 0
		/*Expression expLeft = g7Factory.createExpression();
		expLeft.setIsSimple(true);
		expLeft.setIsConstant(true);
		expLeft.setArithmValue(0);
		expLeft.setType(ExprType.ARITHMETIC);
		
		exp.setSubExpr1(expLeft);
		*/
		exp.setSubExpr1(null);
		exp.setSubExpr2(expRight);
		
		AritmeticOperator op = g7Factory.createAritmeticOperator();
		op.setName(ArithmOpValues.UMINUS);
		exp.setOperator(op);
		
		exp.setType(ExprType.ARITHMETIC);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);
		
		return exp;
	}
	
	//Parsing Timing operators

	@Override 
	public Expression visitPrimaryTiming(g7ExpressionParser.PrimaryTimingContext ctx) { 
		return visit(ctx.timeLogicG7Expr());
	}
	
	@Override 
	public Expression visitTimeLogicDelayed1(g7ExpressionParser.TimeLogicDelayed1Context ctx) {
		String exp_str = afficher("[TD1: "+ctx.Number().getText()+ctx.U().getText()+"/"+ctx.g7Expr().getText()+"]");
		
		Expression exp = g7Factory.createExpression();
		Expression expLeft = visit(ctx.g7Expr());
		
		exp.setSubExpr1(null);
		exp.setSubExpr2(expLeft);
		
		TimingOperator op = g7Factory.createTimingOperator();
		op.setType(TimingType.DELAYED1);
		
		//op.setDuration1(Integer.parseInt(ctx.Number().getText()));
		//op.setUnit1(ctx.U().getText());
		op.setDuration1((new Double(ctx.nb.getText())).intValue());
		op.setUnit1(this.getTimeUnit(ctx.unit.getText()));
		op.setDuration2(0);
		op.setUnit2(null);
		
		exp.setOperator(op);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		exp.setIsConstant(false);
		
		//exp.evalName2(); //Used in code generation
		
		return exp; 
	}
	 
	private TimeUnit getTimeUnit(String textUnit) {
		if(textUnit.equals("ms"))
			return TimeUnit.MS;
		else
			if(textUnit.equals("s"))
				return TimeUnit.S;
			else
				if(textUnit.equals("m"))
					return TimeUnit.M;
				else
					if(textUnit.equals("h"))
						return TimeUnit.H;
		return null;
	}

	public Expression visitTimeLogicG7ExprLimited(g7ExpressionParser.TimeLogicG7ExprLimitedContext ctx) { 
		String exp_str = afficher("[TL: "+ctx.Number().getText()+ctx.U().getText()+"/"+ctx.g7Expr().getText()+"]");
		
		Expression exp = g7Factory.createExpression();
		Expression expLeft = visit(ctx.g7Expr());
		
		exp.setSubExpr1(null);
		exp.setSubExpr2(expLeft);
		
		TimingOperator op = g7Factory.createTimingOperator();
		op.setType(TimingType.LIMITED);
		
		//op.setDuration1(Integer.parseInt(ctx.Number().getText()));
		//op.setUnit1(ctx.U().getText());
		op.setDuration1((new Double(ctx.nb.getText())).intValue()); //NNG
		op.setUnit1(this.getTimeUnit(ctx.unit.getText()));
		op.setDuration2(0);
		op.setUnit2(null);
		exp.setOperator(op);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		exp.setIsConstant(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		
		//exp.evalName2(); //Used in code generation
		
		return exp; 
	}
	
	@Override 
	public Expression visitTimeLogicDelayed2(g7ExpressionParser.TimeLogicDelayed2Context ctx) {
		String exp_str = afficher("[TD2: "+ctx.Number(0).getText()+ctx.U(0).getText()+"/"+ctx.g7Expr().getText()+"/"+ctx.Number(0).getText()+ctx.U(0).getText()+"]");

		//ctx.Number(0).getText()
		
		Expression exp = g7Factory.createExpression();
		Expression expLeft = visit(ctx.g7Expr());
		exp.setSubExpr1(null);
		exp.setSubExpr2(expLeft);
		
		TimingOperator op = g7Factory.createTimingOperator();
		op.setType(TimingType.DELAYED2);
		
		/*op.setDuration1(Integer.parseInt(ctx.Number(0).getText())); //Also good
		op.setUnit1(ctx.U(0).getText());
		op.setDuration2(Integer.parseInt(ctx.Number(1).getText())); //Also good
		op.setUnit2(ctx.U(1).getText());*/
		
		op.setDuration1((new Double(ctx.nb1.getText())).intValue());
		op.setUnit1(this.getTimeUnit(ctx.unit1.getText()));
		op.setDuration2((new Double(ctx.nb2.getText())).intValue());
		op.setUnit2(this.getTimeUnit(ctx.unit2.getText()));
		exp.setOperator(op);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(false);
		exp.setIsConstant(false);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		
		//exp.evalName2(); //Used in code generation
		
		return exp; 
	}
	
	//Parsing Atomic expressions
	
	@Override
	public Expression visitPrimaryAtom(g7ExpressionParser.PrimaryAtomContext ctx) {
		Expression exp = visit(ctx.atomic());
		/*
		if(exp.getVariable()!= null)
			System.out.println("\nG7ExpVisitor: OK. New variable set ----> "+exp.getVariable().getName());
		System.out.println("NNG ............. Atom !!!! Exp = "+exp);*/
		return exp ;
		//return visit(ctx.atomic());
	}
	
	@Override 
	public Expression visitAtomNumber(g7ExpressionParser.AtomNumberContext ctx) {
		String exp_str = afficher(ctx.Number().getText());
		
		//Build constant expression
		Expression exp = g7Factory.createExpression();
		exp.setArithmValue((new Double(ctx.Number().getText())).intValue());
		
		exp.setType(ExprType.ARITHMETIC);
		exp.setIsSimple(true);
		exp.setIsConstant(true);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		
		exp.setOperator(null);
		exp.setSubExpr1(null);
		exp.setSubExpr2(null);
		
		return exp;
	}
	
	@Override 
	public Expression visitAtomId(g7ExpressionParser.AtomIdContext ctx) /*throws Exception*/{ 
		String exp_str = afficher(ctx.Id().getText());
		Expression exp = g7Factory.createExpression();
		String varName = exp_str;

		Variable var=null;
		try {
			var = this.grafcet.getVariableByName(varName);
		}catch(UnExistingGrafcetVariableException e){
			//e.printStackTrace();
			System.out.println("G7ExpVisitor : UnExistingGrafcetVariableException exception. Message = "+e.getMessage());
		}
		
		if(var==null) {
			System.out.println("G7ExpVisitor: Error. The following variable does not exist in the G7 model " + this.grafcet.getName() + " <Expected Variable : "+varName + "> !!");
		}
		else {
			System.out.println("G7ExpVisitor: Goood !!!. Variable  <"+varName + "> found in the grafcet <" + this.grafcet.getName()+">");
			exp.setVariable(var);
			//Inferring the type of that expression according to the type of variable
			if (var instanceof BooleanVariable)
				exp.setType(ExprType.LOGICAL);
			else
				exp.setType(ExprType.ARITHMETIC);
		}
		exp.setIsSimple(true);
		exp.setIsConstant(false);
		//exp.setName(varName);
		exp.setName(exp.getInfixTreeString());
		
		exp.setOperator(null);
		exp.setSubExpr1(null);
		exp.setSubExpr2(null);
		
		return exp;
	}
	
	@Override 
	public Expression visitAtomBool(g7ExpressionParser.AtomBoolContext ctx) {
		String exp_str = afficher(ctx.BoolValue().getText());
		//Build constant expression
		Expression exp = g7Factory.createExpression();
		
		boolean bVal = false;
		if(ctx.BoolValue().getText().contentEquals("true"))
			bVal = true;
		else
			bVal = false;
		exp.setBoolValue(bVal);
		
		exp.setType(ExprType.LOGICAL);
		exp.setIsSimple(true);
		exp.setIsConstant(true);
		//exp.setName(exp_str);
		//exp.setName(GrafcetExpressionParser.getInfixTreeString(exp));
		exp.setName(exp.getInfixTreeString());
		
		exp.setOperator(null);
		exp.setSubExpr1(null);
		exp.setSubExpr2(null);
		
		return exp; 
	}
	private static String afficher(String texte) {
		System.out.println(texte);
		return texte;
	}
	public void printG7Variables() {
		System.out.println("Liste des variables du grafcet "+this.grafcet.getName().toUpperCase());
		for(Variable v : this.grafcet.getVariables())
			System.out.println(v.getName());
	}
}
