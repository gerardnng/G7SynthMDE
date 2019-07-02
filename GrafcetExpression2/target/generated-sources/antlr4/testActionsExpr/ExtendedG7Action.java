package testActionsExpr;

public class ExtendedG7Action {

	//types of actions
	public static final int Type_level_action = 1;
	public static final int Type_level_action_cond = 2;
	public static final int Type_store_action = 3;
	//types of stored actions
	public static final int Type_Stored_in_Activation = 1;
	public static final int Type_Stored_in_DeActivation = 2;
	
	//The following values are parsed and returned by the Visitor: ExtendedG7ActionVisitor
	private String variableName;
	private String str_g7xpression;// ID := actionExpression #or ID if actionExpression
	private int type;
	private int actionType;

	//private Expression expr; //To uncomment and build when there is an expression (condition or right hand side)
	//condition or expression to evaluate, in the case of a store action
	
	public ExtendedG7Action(String varname, String actionExpr) {
		this.variableName = varname;
		this.str_g7xpression = actionExpr;
	}
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String name) {
		this.variableName = name;
	}
	public String getG7xpression() {
		return str_g7xpression;
	}
	public void setG7xpression(String actionExpression) {
		this.str_g7xpression = actionExpression;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public boolean validateAction(String definedName) {
		//An action is considered to be valid if its name is use in action expression
		//definedName = name put by the user
		return variableName.equals(definedName);
	}
	public int getActionType() {
		return actionType;
	}
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}
	
}
