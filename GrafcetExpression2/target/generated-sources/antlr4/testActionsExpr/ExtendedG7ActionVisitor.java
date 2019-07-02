package testActionsExpr;

import g7ActionsExpressions.G7ActionsExprBaseVisitor;
import g7ActionsExpressions.G7ActionsExprParser;

public class ExtendedG7ActionVisitor extends G7ActionsExprBaseVisitor<ExtendedG7Action>{
	
	@Override
	public ExtendedG7Action visitAssignmentExpr(G7ActionsExprParser.AssignmentExprContext ctx) {
		System.out.println("Action Visitor : ASG");
		String actionName = ctx.ID().getText();
		String exprToEvaluate = ctx.expr2().getText();
		ExtendedG7Action extAction = new ExtendedG7Action(actionName,exprToEvaluate);

		if(ctx.SAT().equals("(ACT)")) {//Action on Activation : (ACT)
			extAction.setActionType(ExtendedG7Action.Type_Stored_in_Activation);
		}else { ////Action on Desactivation : (DEC)
			extAction.setActionType(ExtendedG7Action.Type_Stored_in_DeActivation);
		}
		extAction.setType(ExtendedG7Action.Type_store_action);
		return extAction; 
	}

	@Override 
	public ExtendedG7Action visitIfExpr(G7ActionsExprParser.IfExprContext ctx) {
		System.out.println("Action Visitor : IF");
		String actionName = ctx.ID().getText();
		String exprToEvaluate = ctx.expr2().getText(); 
		
		ExtendedG7Action extAction = new ExtendedG7Action(actionName,exprToEvaluate);
		extAction.setType(ExtendedG7Action.Type_level_action_cond);
		return extAction;
	}

	@Override 
	public ExtendedG7Action visitIdExpr(G7ActionsExprParser.IdExprContext ctx) {
		System.out.println("Action Visitor : ID");
		String actionName = ctx.ID().getText();
		ExtendedG7Action extAction = new ExtendedG7Action(actionName,null);
		extAction.setType(ExtendedG7Action.Type_level_action);
		return extAction;
	}
	
}
