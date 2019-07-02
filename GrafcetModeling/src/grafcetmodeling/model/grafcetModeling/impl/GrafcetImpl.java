/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Action;
import grafcetmodeling.model.grafcetModeling.BooleanVariable;
import grafcetmodeling.model.grafcetModeling.Connection;
import grafcetmodeling.model.grafcetModeling.ExprType;
import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.LevelAction;
import grafcetmodeling.model.grafcetModeling.Operator;
import grafcetmodeling.model.grafcetModeling.Step;
import grafcetmodeling.model.grafcetModeling.StoredAction;
import grafcetmodeling.model.grafcetModeling.TimingOperator;
import grafcetmodeling.model.grafcetModeling.Transition;
import grafcetmodeling.model.grafcetModeling.VarType;
import grafcetmodeling.model.grafcetModeling.Variable;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import expressionsBuilder.GrafcetExpressionParser;
import expressionsBuilder.UnExistingGrafcetVariableException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl#getName <em>Name</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetImpl extends MinimalEObjectImpl.Container implements Grafcet {
	//NNG some useful attributes
	//public boolean hasTimeCondition;
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.GRAFCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		System.out.println("G7: In setName ================");
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.GRAFCET__NAME, oldName, name));
		
		this.generateG7Elements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, GrafcetModelingPackage.GRAFCET__CONNECTIONS, GrafcetModelingPackage.CONNECTION__GRAFCET);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<Step>(Step.class, this, GrafcetModelingPackage.GRAFCET__STEPS, GrafcetModelingPackage.STEP__GRAFCET);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, GrafcetModelingPackage.GRAFCET__TRANSITIONS, GrafcetModelingPackage.TRANSITION__GRAFCET);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, GrafcetModelingPackage.GRAFCET__VARIABLES, GrafcetModelingPackage.VARIABLE__GRAFCET);
		}
		return variables;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void generateG7Elements() {
		//Generate variables associated to steps if not yet
		//It should be called first because they are useful for the other generating functions that follow
		this.generateStepsVariables();
		System.out.println("G7: After generateStepsVariables ================");
		
		this.generateActionsVariables();
		
		//generate expressions transitions Conditions
		this.parseTransitionsExpressions();
		System.out.println("G7: After generateTransitionsExpressions ================");
		
		//Call other methods concerning actions (stored and level)
		this.parseActionsExpressions();
		System.out.println("G7: After generateActionsExpressions ================");
		/*
		boolean b = hasTimeConditions();
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasTimeConditions() {
		System.out.println("\nG7: Hastime Condition ================ENTERING ");
		
		boolean val = transitionsHasTimeCondition();
		if(!val) { val = actionsHasTimeCondition();}
		if(val) {System.out.println("G7: Hastime Condition ================ TRUE !!!!");}
		else {System.out.println("G7: Hastime Condition ================ FALSE !!!! ");}
		
		System.out.println("G7: Hastime Condition ================EXITING ");
		
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private EList<Expression> timeExprs = null;
	
	public EList<Expression> getTimeExprs() {
		System.out.println("\nG7: INCOMMING TO getTimeExprs in Grafcet : "+ getName() );
		
		if(timeExprs == null) {
			timeExprs = new EObjectContainmentEList<Expression>(Expression.class, this, GrafcetModelingPackage.GRAFCET__EXPRESSIONS);
		
			//Looking TIMING CONDITIONS in transitions condition Expressions
			for(Transition trans : this.getTransitions()) {
				addTimeExprs_to_timeExprs_recurse(trans.getTransitionCondition());
			}
			
			System.out.println("G7: IN getTimeExprs after searching in transitions ");
			
			//Looking TIMING CONDITIONS in level actions Expressions 
			for(Step step:this.getSteps())
				for(Action action : step.getActions()) {
					if(action instanceof LevelAction) { //Case of Level actions.
						LevelAction action2 = (LevelAction) action;
						addTimeExprs_to_timeExprs_recurse(action2.getExpressionCondition());
					}
					else { //Case of Stored actions.
						//It can work only if its expressionToEvaluate is of type Logical
						StoredAction action2 = (StoredAction) action;
						if(action2.getExpressionToEvaluate()!=null)
							if(action2.getExpressionToEvaluate().getType() == ExprType.LOGICAL) {
								//System.out.println("G7: NNG in getTimeExp : "+ action2.getExpressionToEvaluate().getName());
								addTimeExprs_to_timeExprs_recurse(action2.getExpressionToEvaluate());
							}
					}
			}
			System.out.println("G7: IN getTimeExprs after searching in actions Expressions ");
			//Looking for stored actions Expressions to Evaluate : IMPOSSIBLE
		}
		
		/*Uncomment to debug the generator in order generate code 
		for expressions such as : [5s/X_4/10s] or [not 5s/X_4]*/
		//printTimeVarsExpressions(timeExprs);
		System.out.println("G7: OUTGOING FROM getTimeExprs in the Grafcet : "+ getName() );
		return timeExprs;
	}
	
	private void addTimeExprs_to_timeExprs_recurse(Expression exp) {
		if(exp!=null) {
			Operator op = exp.getOperator();
			if(op!=null) {
				if(op instanceof TimingOperator) {
					//timeExprs.add(exp); //A Great mistake/error, because the first container loses that object. We should create a copy
					timeExprs.add(getCopyOf(exp));
					System.out.println("\nG7:TIME Expression <"+exp.getName() +"> added to the list.");
					System.out.println("G7:TIME Expression \t\t\t\tC syntax = "+exp.getCExpr());
					System.out.println("G7:TIME Expression	\t\t\tOld C syntax = "+exp.getOldCExpr()+"\n");
				
					//if there is sub-time expressions
					addTimeExprs_to_timeExprs_recurse(exp.getSubExpr2());
				}
				else {
					addTimeExprs_to_timeExprs_recurse(exp.getSubExpr1());
					addTimeExprs_to_timeExprs_recurse(exp.getSubExpr2());
				}
			}
		}
	}
	
	private Expression getCopyOf(Expression exp) {
		return GrafcetExpressionParser.parseBuildExprTree(exp.getName(), this);
	}
	
	private void printTimeVarsExpressions(EList<Expression> tv_list) {
		System.out.println(); System.out.println();
		System.out.println("G7_printTimeVarsExpressions. Number = "+tv_list.size());
		
		for(Expression exp: tv_list) {
			System.out.println();System.out.println();
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX Expression Name = " + exp.getName());
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX Expression C Expr = " + exp.getCExpr());
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX str_left = --------------" );
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX EXPRESSION left = " + exp.getSubExpr1());
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX str_right = -------------" );
			System.out.println("G7_AddTimeVarsRecurse: NNNGGG______XXXXX EXPRESSION right = " + exp.getSubExpr2());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__NAME:
				return getName();
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				return getConnections();
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				return getTransitions();
			case GrafcetModelingPackage.GRAFCET__STEPS:
				return getSteps();
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__NAME:
				setName((String)newValue);
				return;
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case GrafcetModelingPackage.GRAFCET__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				getConnections().clear();
				return;
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				getTransitions().clear();
				return;
			case GrafcetModelingPackage.GRAFCET__STEPS:
				getSteps().clear();
				return;
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				getVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrafcetModelingPackage.GRAFCET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrafcetModelingPackage.GRAFCET__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case GrafcetModelingPackage.GRAFCET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case GrafcetModelingPackage.GRAFCET__STEPS:
				return steps != null && !steps.isEmpty();
			case GrafcetModelingPackage.GRAFCET__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GrafcetModelingPackage.GRAFCET___GENERATE_G7_ELEMENTS:
				generateG7Elements();
				return null;
			case GrafcetModelingPackage.GRAFCET___HAS_TIME_CONDITIONS:
				return hasTimeConditions();
			case GrafcetModelingPackage.GRAFCET___GET_TIME_EXPRS:
				return getTimeExprs();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public void parseTransitionsExpressions() {
		for(Transition trans : this.getTransitions()) {
			trans.parseReceptivity();		
		}
	}
	
	@Override
	public void parseActionsExpressions() {
		for(Step step : this.getSteps()) {
			for(Action act: step.getActions())
				act.parseExpression();		
		}
	}
	
	@Override
	public Variable createAndGetVariable(String varName, boolean isBoolean, VarType type) {
		Variable varf=null;
		try {
			varf = getVariableByName(varName);
		}catch(UnExistingGrafcetVariableException e){
			//e.printStackTrace();
			System.out.println("G7Impl : UnExistingGrafcetVariableException exception. Message = "+e.getMessage());
		}
		if(varf==null) {
			System.out.println("----Creation of an unExisting variable : "+varName+" ---");
			if(isBoolean)
				varf = GrafcetModelingFactoryImpl.eINSTANCE.createBooleanVariable();
			else
				varf = GrafcetModelingFactoryImpl.eINSTANCE.createNumericVariable();
			
			varf.setName(varName);
			varf.setType(type);
			
			//if(!this.variables.contains(varf) || getVariableByName(varName)==null)
			//This variable dois not exist
			this.variables.add(varf);
		}
		return varf;
	}
	
	@Override
	public void generateStepsVariables() {
		BooleanVariable var;
		for(Step step : this.getSteps()) {
			//var = step.generateStepBooleanVariable();
			var = (BooleanVariable) createAndGetVariable(step.proposedStepVarName(), true, VarType.INTERNAL);
			System.out.println("G7: generateStepsVariables ================ Variable got : " + var);
			if(var!= null) {
				step.setVariable(var);
			}
		}
	}
	

	@Override
	public Variable getVariableByName(String varName) throws UnExistingGrafcetVariableException{
		for (Variable var : this.getVariables()) {
			//System.out.println("######## getVariableByName  Variable =   ("+var.getName()+"=="+varName+" : "+var.getName().equals(varName));
			if(var.getName().equals(varName)) {
				return  var;
			}
		}
		//si la variable n'est pas trouvée, émettre cette exception à l'appelant
		throw new UnExistingGrafcetVariableException("The variable <"+varName+"> does not exist in the Grafcet <"+getName()+">");
	}
	
	public void generateActionsVariables(){
		Variable var = null;
		for(Step step : this.getSteps())
			for(Action act: step.getActions()) {
				if(act instanceof StoredAction) {
					StoredAction stAct = (StoredAction) act;
					if(stAct.getFunction()==null) {
						if(stAct.getType() == ExprType.ARITHMETIC)
							var = createAndGetVariable(act.getName(), false, VarType.OUTPUT);
						else // the type is ExprType.LOGICAL
							var = createAndGetVariable(act.getName(), true, VarType.OUTPUT);
					}
				}
				else //Certainly it is a level action
				if(act instanceof LevelAction) {
					var = createAndGetVariable(act.getName(), true, VarType.OUTPUT);
				}
				act.setActionVariable(var);
				System.out.println("G7: generateActionsVariables ================ Action Var generated  : " + var);
			}
	}
	
	private boolean transitionsHasTimeCondition() {
		boolean val = false;
		for(Transition tr : this.getTransitions()) {
			//System.out.println("G7: transition <"+tr.getName()+"> --> hastime Condition ================ ?????????");
			if(tr.getTransitionCondition().hasTimeCondition()) {
				//System.out.println("G7: transition --> hastime Condition ================ true");
				return true;
			}
		}
		return val;
	}
	private boolean actionsHasTimeCondition() {
		boolean val = false;
		for(Step step : this.getSteps()) {
			if(step.getActions()!=null) {
				for(Action a: step.getActions()) {
					if(a instanceof LevelAction) {
						if(((LevelAction) a).getExpressionCondition().hasTimeCondition())
							return true;
					}
					else {
						//Stored action
						if(((StoredAction) a).getExpressionToEvaluate().hasTimeCondition())
							return true;
					}
				}
			}
		}
		return val;
	}

	@Override
	public EList<Expression> getExpressions() {
		// TODO Auto-generated method stub
		return null;
	}

} //GrafcetImpl
