/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.ArithmOpValues;
import grafcetmodeling.model.grafcetModeling.AritmeticOperator;
import grafcetmodeling.model.grafcetModeling.BooleanVariable;
import grafcetmodeling.model.grafcetModeling.ExprType;
import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.LogicOpValues;
import grafcetmodeling.model.grafcetModeling.LogicalOperator;
import grafcetmodeling.model.grafcetModeling.Operator;
import grafcetmodeling.model.grafcetModeling.TimeUnit;
import grafcetmodeling.model.grafcetModeling.TimingOperator;
import grafcetmodeling.model.grafcetModeling.TimingType;
import grafcetmodeling.model.grafcetModeling.Variable;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import expressionsBuilder.UnExistingGrafcetVariableException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getSubExpr1 <em>Sub Expr1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getSubExpr2 <em>Sub Expr2</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#isBoolValue <em>Bool Value</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getArithmValue <em>Arithm Value</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl#isIsConstant <em>Is Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * The cached value of the '{@link #getSubExpr1() <em>Sub Expr1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpr1()
	 * @generated
	 * @ordered
	 */
	protected Expression subExpr1;

	/**
	 * The cached value of the '{@link #getSubExpr2() <em>Sub Expr2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpr2()
	 * @generated
	 * @ordered
	 */
	protected Expression subExpr2;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExprType TYPE_EDEFAULT = ExprType.LOGICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExprType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

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
	 * The default value of the '{@link #isBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolValue()
	 * @generated
	 * @ordered
	 */
	protected boolean boolValue = BOOL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArithmValue() <em>Arithm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ARITHM_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArithmValue() <em>Arithm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmValue()
	 * @generated
	 * @ordered
	 */
	protected int arithmValue = ARITHM_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstant = IS_CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExpressionImpl() {
		super();
	}
	
	public ExpressionImpl(Expression e) {
		super();
		setType(e.getType());
		setIsSimple(e.getIsSimple());
		setName(e.getName());
		setBoolValue(e.getBoolValue());
		setArithmValue(e.getArithmValue());
		setIsConstant(e.getIsConstant());
		System.out.println("\n HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Exp = "+this.name+"\n");
		
		setSubExpr1(e.getSubExpr1());
		setSubExpr2(e.getSubExpr2());
	}
	
	@Override
	public boolean getIsConstant() {
		return this.isConstant;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSubExpr1() {
		return subExpr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubExpr1(Expression newSubExpr1, NotificationChain msgs) {
		Expression oldSubExpr1 = subExpr1;
		subExpr1 = newSubExpr1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__SUB_EXPR1, oldSubExpr1, newSubExpr1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubExpr1(Expression newSubExpr1) {
		if (newSubExpr1 != subExpr1) {
			NotificationChain msgs = null;
			if (subExpr1 != null)
				msgs = ((InternalEObject)subExpr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__SUB_EXPR1, null, msgs);
			if (newSubExpr1 != null)
				msgs = ((InternalEObject)newSubExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__SUB_EXPR1, null, msgs);
			msgs = basicSetSubExpr1(newSubExpr1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__SUB_EXPR1, newSubExpr1, newSubExpr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSubExpr2() {
		return subExpr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubExpr2(Expression newSubExpr2, NotificationChain msgs) {
		Expression oldSubExpr2 = subExpr2;
		subExpr2 = newSubExpr2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__SUB_EXPR2, oldSubExpr2, newSubExpr2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubExpr2(Expression newSubExpr2) {
		if (newSubExpr2 != subExpr2) {
			NotificationChain msgs = null;
			if (subExpr2 != null)
				msgs = ((InternalEObject)subExpr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__SUB_EXPR2, null, msgs);
			if (newSubExpr2 != null)
				msgs = ((InternalEObject)newSubExpr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__SUB_EXPR2, null, msgs);
			msgs = basicSetSubExpr2(newSubExpr2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__SUB_EXPR2, newSubExpr2, newSubExpr2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.EXPRESSION__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExprType newType) {
		ExprType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimple(boolean newIsSimple) {
		boolean oldIsSimple = isSimple;
		isSimple = newIsSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__IS_SIMPLE, oldIsSimple, isSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolValue() {
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolValue(boolean newBoolValue) {
		boolean oldBoolValue = boolValue;
		boolValue = newBoolValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__BOOL_VALUE, oldBoolValue, boolValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArithmValue() {
		return arithmValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmValue(int newArithmValue) {
		int oldArithmValue = arithmValue;
		arithmValue = newArithmValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__ARITHM_VALUE, oldArithmValue, arithmValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetModelingPackage.EXPRESSION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConstant() {
		return isConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstant(boolean newIsConstant) {
		boolean oldIsConstant = isConstant;
		isConstant = newIsConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__IS_CONSTANT, oldIsConstant, isConstant));
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
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evalOld() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getOldCExpr() {
		return getOldCExprRecursively(this);
	}

	private static String getOldCExprRecursively(Expression expr) {
		String str_left_Old="";
		String str_right_Old="";
		if(expr.getSubExpr1()!=null)
			str_left_Old = getOldCExprRecursively(expr.getSubExpr1());
		if(expr.getSubExpr2()!=null)
			str_right_Old = getOldCExprRecursively(expr.getSubExpr2());
		
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+"";
					case ExprType.LOGICAL_VALUE:
						if(expr.getBoolValue())
							return "1";
						else 
							return "0";
						//return expr.getBoolValue()+"";
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					return expr.getVariable().getName()+"_Old";
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
				}
			}
		}
		else {
			//An operator
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				int duration_millis1 = getDurationMillis(op.getDuration1(), op.getUnit1()), duration_millis2;
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					return "("+expr.getSubExpr2().getName2() +"_duration_Old >= "+duration_millis1+"/TIMER_PERIOD)";
					
				case TimingType.DELAYED2_VALUE:
					duration_millis2 = getDurationMillis(op.getDuration2(), op.getUnit2());
					return "(("+expr.getSubExpr2().getName2() +"_duration_Old >= "+duration_millis1+"/TIMER_PERIOD) && "+expr.getSubExpr2().getCExpr()+") || (("+
					expr.getSubExpr2().getName2() +"_duration_Old <= "+duration_millis2+"/TIMER_PERIOD) && !"+expr.getSubExpr2().getCExpr()+")";
				
				case TimingType.LIMITED_VALUE:
					return "("+expr.getSubExpr2().getName2()+"_duration_Old <= "+duration_millis1+"/TIMER_PERIOD)";
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						return "("+str_left_Old+" || "+str_right_Old+")";
					case LogicOpValues.AND_VALUE:
						return "("+str_left_Old+" && "+str_right_Old+")";
					case LogicOpValues.NOT_VALUE:
						return "(! "+str_right_Old+")";
					case LogicOpValues.RE_VALUE:
						return "("+str_right_Old+"_Old == false && "+str_right_Old+" == true)";
					case LogicOpValues.FE_VALUE:
						return "("+str_right_Old+"_Old == true && "+str_right_Old+" == false)";
					case LogicOpValues.EQU_VALUE:
						return "("+str_left_Old+" == "+str_right_Old+")";
					case LogicOpValues.LE_VALUE:
						return "("+str_left_Old+" <= "+str_right_Old+")";
					case LogicOpValues.LT_VALUE:
						return "("+str_left_Old+" < "+str_right_Old+")";
					case LogicOpValues.GE_VALUE:
						return "("+str_left_Old+" >= "+str_right_Old+")";
					case LogicOpValues.GT_VALUE:
						return "("+str_left_Old+" > "+str_right_Old+")";
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return "("+str_left_Old+" + "+str_right_Old+")";
							case ArithmOpValues.SUB_VALUE:
								return "("+str_left_Old+" - "+str_right_Old+")";
							case ArithmOpValues.MULT_VALUE:
								return "("+str_left_Old+" * "+str_right_Old+")";
							case ArithmOpValues.DIV_VALUE:
								return "("+str_left_Old+" / "+str_right_Old+")";
							case ArithmOpValues.UMINUS_VALUE:
								return "(- "+str_right_Old+")";
						}	
					}
		}
		return "";
	}
	
	@Override
	public void evalName2() {
		name2_for_timing_duration = getName2Recursively(this)+"0"+(++number_time_expr);
	}
	
	private static int number_time_expr = 0;
	public String name2_for_timing_duration = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String getName2() {
		//Useful for the implementation of Timing Expressions
		
		//return getName2Recursively(this)+"00";
		//return "00";
		if(name2_for_timing_duration == null) {
			//name2_for_timing_duration = getName2Recursively(this)+"0"+(++number_time_expr);
			name2_for_timing_duration = getName2Recursively(this);
		}
		return name2_for_timing_duration;
	}

	private static String getName2Recursively(Expression expr) {
		String name_left= "";
		String name_right= "";
		if(expr.getSubExpr1()!=null)
			name_left = getName2Recursively(expr.getSubExpr1());
		if(expr.getSubExpr2()!=null)
			name_right = getName2Recursively(expr.getSubExpr2());
		
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+"";
					case ExprType.LOGICAL_VALUE:
						if(expr.getBoolValue())
							return "true_";
						else 
							return "false_";
						//return expr.getBoolValue()+"";
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					return expr.getVariable().getName();
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
				}
			}
		}
		else {
			//An operator
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				int duration_millis1 = getDurationMillis(op.getDuration1(), op.getUnit1()), duration_millis2;
				switch(op.getType().getValue()) {
				
				case TimingType.DELAYED1_VALUE:
					return name_right +"_D1_"+duration_millis1;
				
				case TimingType.DELAYED2_VALUE:
					duration_millis2 = getDurationMillis(op.getDuration2(), op.getUnit2());
					return name_right +"_D2_"+duration_millis1+"_"+duration_millis2;
				
				case TimingType.LIMITED_VALUE:
					return name_right +"_L_"+duration_millis1;
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						return name_left +"_OR_"+name_right;
					case LogicOpValues.AND_VALUE:
						return name_left +"_AND_"+name_right;
					case LogicOpValues.NOT_VALUE:
						return "NOT_"+name_right;
					case LogicOpValues.RE_VALUE:
						return "RE_"+name_right;
					case LogicOpValues.FE_VALUE:
						return "FE_"+name_right;
					case LogicOpValues.EQU_VALUE:
						return name_left +"_EQ_"+name_right;
					case LogicOpValues.LE_VALUE:
						return name_left +"_LE_"+name_right;
					case LogicOpValues.LT_VALUE:
						return name_left +"_LT_"+name_right;
					case LogicOpValues.GE_VALUE:
						return name_left +"_GE_"+name_right;
					case LogicOpValues.GT_VALUE:
						return name_left +"_GT_"+name_right;
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return name_left +"_ADD_"+name_right+"_";
							case ArithmOpValues.SUB_VALUE:
								return name_left +"_SUB_"+name_right+"_";
							case ArithmOpValues.MULT_VALUE:
								return name_left +"_MULT_"+name_right+"_";
							case ArithmOpValues.DIV_VALUE:
								return name_left +"_DIV_"+name_right+"_";
							case ArithmOpValues.UMINUS_VALUE:
								return "_UMINUS_"+name_right+"_";
						}	
					}
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR1:
				return basicSetSubExpr1(null, msgs);
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR2:
				return basicSetSubExpr2(null, msgs);
			case GrafcetModelingPackage.EXPRESSION__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR1:
				return getSubExpr1();
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR2:
				return getSubExpr2();
			case GrafcetModelingPackage.EXPRESSION__OPERATOR:
				return getOperator();
			case GrafcetModelingPackage.EXPRESSION__TYPE:
				return getType();
			case GrafcetModelingPackage.EXPRESSION__IS_SIMPLE:
				return isIsSimple();
			case GrafcetModelingPackage.EXPRESSION__NAME:
				return getName();
			case GrafcetModelingPackage.EXPRESSION__BOOL_VALUE:
				return isBoolValue();
			case GrafcetModelingPackage.EXPRESSION__ARITHM_VALUE:
				return getArithmValue();
			case GrafcetModelingPackage.EXPRESSION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case GrafcetModelingPackage.EXPRESSION__IS_CONSTANT:
				return isIsConstant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR1:
				setSubExpr1((Expression)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR2:
				setSubExpr2((Expression)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__TYPE:
				setType((ExprType)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__IS_SIMPLE:
				setIsSimple((Boolean)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__BOOL_VALUE:
				setBoolValue((Boolean)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__ARITHM_VALUE:
				setArithmValue((Integer)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case GrafcetModelingPackage.EXPRESSION__IS_CONSTANT:
				setIsConstant((Boolean)newValue);
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
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR1:
				setSubExpr1((Expression)null);
				return;
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR2:
				setSubExpr2((Expression)null);
				return;
			case GrafcetModelingPackage.EXPRESSION__OPERATOR:
				setOperator((Operator)null);
				return;
			case GrafcetModelingPackage.EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GrafcetModelingPackage.EXPRESSION__IS_SIMPLE:
				setIsSimple(IS_SIMPLE_EDEFAULT);
				return;
			case GrafcetModelingPackage.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrafcetModelingPackage.EXPRESSION__BOOL_VALUE:
				setBoolValue(BOOL_VALUE_EDEFAULT);
				return;
			case GrafcetModelingPackage.EXPRESSION__ARITHM_VALUE:
				setArithmValue(ARITHM_VALUE_EDEFAULT);
				return;
			case GrafcetModelingPackage.EXPRESSION__VARIABLE:
				setVariable((Variable)null);
				return;
			case GrafcetModelingPackage.EXPRESSION__IS_CONSTANT:
				setIsConstant(IS_CONSTANT_EDEFAULT);
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
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR1:
				return subExpr1 != null;
			case GrafcetModelingPackage.EXPRESSION__SUB_EXPR2:
				return subExpr2 != null;
			case GrafcetModelingPackage.EXPRESSION__OPERATOR:
				return operator != null;
			case GrafcetModelingPackage.EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case GrafcetModelingPackage.EXPRESSION__IS_SIMPLE:
				return isSimple != IS_SIMPLE_EDEFAULT;
			case GrafcetModelingPackage.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrafcetModelingPackage.EXPRESSION__BOOL_VALUE:
				return boolValue != BOOL_VALUE_EDEFAULT;
			case GrafcetModelingPackage.EXPRESSION__ARITHM_VALUE:
				return arithmValue != ARITHM_VALUE_EDEFAULT;
			case GrafcetModelingPackage.EXPRESSION__VARIABLE:
				return variable != null;
			case GrafcetModelingPackage.EXPRESSION__IS_CONSTANT:
				return isConstant != IS_CONSTANT_EDEFAULT;
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
			case GrafcetModelingPackage.EXPRESSION___EVAL:
				eval();
				return null;
			case GrafcetModelingPackage.EXPRESSION___EVAL_OLD:
				evalOld();
				return null;
			case GrafcetModelingPackage.EXPRESSION___GET_CEXPR:
				return getCExpr();
			case GrafcetModelingPackage.EXPRESSION___GET_OLD_CEXPR:
				return getOldCExpr();
			case GrafcetModelingPackage.EXPRESSION___GET_NAME2:
				return getName2();
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
		result.append(" (type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", isSimple: "); //$NON-NLS-1$
		result.append(isSimple);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", boolValue: "); //$NON-NLS-1$
		result.append(boolValue);
		result.append(", arithmValue: "); //$NON-NLS-1$
		result.append(arithmValue);
		result.append(", isConstant: "); //$NON-NLS-1$
		result.append(isConstant);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean getBoolValue() {
		return this.boolValue;
	}
	
	//If it has time conditions
	@Override
	public boolean hasTimeCondition() {
		//System.out.println("Expr: "+this.name+" --> hastime Condition ================ ???????????");
		return hasTimeConditionRecurse(this);
	}
	private boolean hasTimeConditionRecurse(Expression expr) {
		boolean result = false;
		if(expr!=null) {
			if(expr.getOperator() != null ) 
				if(expr.getOperator() instanceof TimingOperator){
					//System.out.println("Expr: "+this.name+" --> hastime Condition ================ true");
					return true;
				}
			//else
			result = hasTimeConditionRecurse(expr.getSubExpr1());
			if(!result)
				result = hasTimeConditionRecurse(expr.getSubExpr2());
		}
		
		return result;
	}
	
	@Override
	public String getInfixTreeString() {
		return getInfixStringTreeRecursively(this);
	}

	private static String getInfixStringTreeRecursively(Expression expr) {
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+"";
					case ExprType.LOGICAL_VALUE:
						return expr.getBoolValue()+"";
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					return expr.getVariable().getName();
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
					return "";
				}
			}
		}
		else {
			//An operator
			String left_expr = "";
			if(expr.getSubExpr1()!=null)
				left_expr = getInfixStringTreeRecursively(expr.getSubExpr1());
			String right_expr = getInfixStringTreeRecursively(expr.getSubExpr2());
			
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					return "["+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"]";
				case TimingType.DELAYED2_VALUE:
					return "["+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"/"+op.getDuration2()+op.getUnit2()+"]";
				case TimingType.LIMITED_VALUE:
					return "[not "+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"]";
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						return "("+left_expr+" or "+right_expr+")";
					case LogicOpValues.AND_VALUE:
						return "("+left_expr+" and "+right_expr+")";
					case LogicOpValues.NOT_VALUE:
						return "(not "+right_expr+")";
					case LogicOpValues.RE_VALUE:
						return "(RE "+right_expr+")";
					case LogicOpValues.FE_VALUE:
						return "(FE "+right_expr+")";
					case LogicOpValues.EQU_VALUE:
						return "("+left_expr+" == "+right_expr+")";
					case LogicOpValues.LE_VALUE:
						return "("+left_expr+" <= "+right_expr+")";
					case LogicOpValues.LT_VALUE:
						return "("+left_expr+" < "+right_expr+")";
					case LogicOpValues.GE_VALUE:
						return "("+left_expr+" >= "+right_expr+")";
					case LogicOpValues.GT_VALUE:
						return "("+left_expr+" > "+right_expr+")";
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return "("+left_expr+" + "+right_expr+")";
							case ArithmOpValues.SUB_VALUE:
								return "("+left_expr+" - "+right_expr+")";
							case ArithmOpValues.MULT_VALUE:
								return "("+left_expr+" * "+right_expr+")";
							case ArithmOpValues.DIV_VALUE:
								return "("+left_expr+" / "+right_expr+")";
							case ArithmOpValues.UMINUS_VALUE:
								return "(- "+right_expr+")";
						}	
					}
		}
		return null;
	}
	
	@Override
	public void fillTreeNamesSimply() {
		fillTreeNamesSimplyRecursively(this);
	}

	private static void fillTreeNamesSimplyRecursively(Expression expr) {
		if(expr.getSubExpr1()!=null)
			fillTreeNamesSimplyRecursively(expr.getSubExpr1());
		if(expr.getSubExpr2()!=null)
			fillTreeNamesSimplyRecursively(expr.getSubExpr2());
		
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						expr.setName(expr.getArithmValue()+"");
						return;
					case ExprType.LOGICAL_VALUE:
						expr.setName(expr.getBoolValue()+"");
						return;
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					expr.setName(expr.getVariable().getName());
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
				}
			}
		}
		else {
			//An operator
			String left_expr = "";
			if(expr.getSubExpr1()!=null)
				left_expr = getInfixStringTreeRecursively(expr.getSubExpr1());
			String right_expr = getInfixStringTreeRecursively(expr.getSubExpr2());
			
			
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					expr.setName("["+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"]");
					return;
				case TimingType.DELAYED2_VALUE:
					expr.setName("["+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"/"+op.getDuration2()+op.getUnit2()+"]");
					return ;
				case TimingType.LIMITED_VALUE:
					expr.setName("[not "+op.getDuration1()+" "+op.getUnit1()+"/"+right_expr+"]");
					return;
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						expr.setName("("+left_expr+" or "+right_expr+")");
						return ;
					case LogicOpValues.AND_VALUE:
						expr.setName("("+left_expr+" and "+right_expr+")");
						return ;
					case LogicOpValues.NOT_VALUE:
						expr.setName("(not "+right_expr+")");
						return ;
					case LogicOpValues.RE_VALUE:
						expr.setName("(RE "+right_expr+")");
						return ;
					case LogicOpValues.FE_VALUE:
						expr.setName("(FE "+right_expr+")");
						return ;
					case LogicOpValues.EQU_VALUE:
						expr.setName("("+left_expr+" == "+right_expr+")");
						return ;
					case LogicOpValues.LE_VALUE:
						expr.setName("("+left_expr+" <= "+right_expr+")");
						return ;
					case LogicOpValues.LT_VALUE:
						expr.setName("("+left_expr+" < "+right_expr+")");
						return ;
					case LogicOpValues.GE_VALUE:
						expr.setName("("+left_expr+" >= "+right_expr+")");
						return ;
					case LogicOpValues.GT_VALUE:
						expr.setName("("+left_expr+" > "+right_expr+")");
						return ;
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								expr.setName("("+left_expr+" + "+right_expr+")");
								return ;
							case ArithmOpValues.SUB_VALUE:
								expr.setName("("+left_expr+" - "+right_expr+")");
								return ;
							case ArithmOpValues.MULT_VALUE:
								expr.setName("("+left_expr+" * "+right_expr+")");
								return ;
							case ArithmOpValues.DIV_VALUE:
								expr.setName("("+left_expr+" / "+right_expr+")");
								return ;
							case ArithmOpValues.UMINUS_VALUE:
								expr.setName("(- "+right_expr+")");
								return ;
						}	
					}
		}
	}
	
	private static int getDurationMillis(int value, TimeUnit unit) {
		
		switch(unit.getValue()) {
		case TimeUnit.MS_VALUE:
			return value;
		case TimeUnit.S_VALUE:
			return value*1000;
		case TimeUnit.M_VALUE:
			return value*1000*60;
		case TimeUnit.H_VALUE:
			return value*1000*60*60;
		default:
			return 0;
		}
		/*
		int duration_millis = 0;
		if(unit.equals("ms"))
			duration_millis = value;
		else
			if(unit.equals("s"))
				duration_millis = value*1000;
			else
				if(unit.equals("m"))
					duration_millis = value*1000*60;
				else
					if(unit.equals("h"))
						duration_millis = value*1000*60*60;
		return duration_millis;*/
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCExpr() {
		return getCExprRecursively(this);
	}

	private static String getCExprRecursively(Expression expr) {
		String str_left="";
		String str_right="";
		if(expr.getSubExpr1()!=null)
			str_left = getCExprRecursively(expr.getSubExpr1());
		if(expr.getSubExpr2()!=null)
			str_right = getCExprRecursively(expr.getSubExpr2());
		/*
		System.out.println("Expr: NNNGGG XXXXX Expression Name = " + expr.getName());
		System.out.println("Expr: NNNGGG XXXXX str_left = " + str_left);
		System.out.println("Expr: NNNGGG XXXXX EXPRESSION left = " + expr.getSubExpr1());
		System.out.println("Expr: NNNGGG XXXXX str_right = " + str_right);
		System.out.println("Expr: NNNGGG XXXXX EXPRESSION right = " + expr.getSubExpr2());
		*/
		if(expr.getIsSimple()) {
			if(expr.getIsConstant()) {
				//System.out.println("\t\t EXPPPPPP --> ArithmValue = "+expr.getArithmValue()+" BoolValue =   "+expr.getBoolValue()+"\n");
				switch(expr.getType().getValue()) {
					case ExprType.ARITHMETIC_VALUE:
						return expr.getArithmValue()+"";
					case ExprType.LOGICAL_VALUE:
						if(expr.getBoolValue())
							return "1";
						else 
							return "0";
				}
			}
			else {
				//A variable
				//System.out.println("\t\t EXPPPPPP --> Variable = "+expr.getVariable().getName()+"\n");
				if(expr.getVariable()!=null) {
					//System.out.println("ERXPRESSION : Variable found : (" + expr.getVariable().getName() + ") ...");
					return expr.getVariable().getName();
				}
				else {
					System.out.println("ERXPRESSION ERROR : A variable should be here but : NOT FOUND ...("+expr.getVariable()+")");
				}
			}
		}
		else {
			//An operator
			if(expr.getOperator() instanceof TimingOperator) {
				TimingOperator op = (TimingOperator)expr.getOperator();
				int duration_millis1 = getDurationMillis(op.getDuration1(), op.getUnit1()), duration_millis2;
				switch(op.getType().getValue()) {
				case TimingType.DELAYED1_VALUE:
					return "("+expr.getSubExpr2().getName2() +"_duration >= "+duration_millis1+"/TIMER_PERIOD)";
				case TimingType.DELAYED2_VALUE:
					duration_millis2 = getDurationMillis(op.getDuration2(), op.getUnit2());
					return "(("+expr.getSubExpr2().getName2() +"_duration >= "+duration_millis1+"/TIMER_PERIOD) && "+expr.getSubExpr2().getCExpr()+") || (("+
							expr.getSubExpr2().getName2() +"_duration <= "+duration_millis2+"/TIMER_PERIOD) && !"+expr.getSubExpr2().getCExpr()+")";
				case TimingType.LIMITED_VALUE:
					return "("+expr.getSubExpr2().getName2()+"_duration <= "+duration_millis1+"/TIMER_PERIOD)";
				}
			}
			else
				if(expr.getOperator() instanceof LogicalOperator) {
					LogicalOperator op = (LogicalOperator)expr.getOperator();
					
					//str_left = getCSyntaxExpressionnRecursively(expr.getSubExpr1());
					
					switch(op.getName().getValue()) {
					case LogicOpValues.OR_VALUE:
						//System.out.println("Expr: NNNGGG str_left = < " + str_left  + " > OR str_right = < " + str_right+" >");
						return "("+str_left+" || "+str_right+")";
					case LogicOpValues.AND_VALUE:
						//System.out.println("Expr: NNNGGG str_left = " + str_left  + " AND str_right = " + str_right);
						return "("+str_left+" && "+str_right+")";
					case LogicOpValues.NOT_VALUE:
						return "(! "+str_right+")";
					case LogicOpValues.RE_VALUE:
						return "("+expr.getSubExpr2().getOldCExpr()+" == false && "+expr.getSubExpr2().getCExpr()+" == true)";
					case LogicOpValues.FE_VALUE:
						return "("+expr.getSubExpr2().getOldCExpr()+" == true && "+expr.getSubExpr2().getCExpr()+" == false)";
					case LogicOpValues.EQU_VALUE:
						return "("+str_left+" == "+str_right+")";
					case LogicOpValues.LE_VALUE:
						return "("+str_left+" <= "+str_right+")";
					case LogicOpValues.LT_VALUE:
						return "("+str_left+" < "+str_right+")";
					case LogicOpValues.GE_VALUE:
						return "("+str_left+" >= "+str_right+")";
					case LogicOpValues.GT_VALUE:
						return "("+str_left+" > "+str_right+")";
					}
				}
				else
					if(expr.getOperator() instanceof AritmeticOperator) {
						AritmeticOperator op = (AritmeticOperator)expr.getOperator();
						switch(op.getName().getValue()) {
							case ArithmOpValues.ADD_VALUE:
								return "("+str_left+" + "+str_right+")";
							case ArithmOpValues.SUB_VALUE:
								return "("+str_left+" - "+str_right+")";
							case ArithmOpValues.MULT_VALUE:
								return "("+str_left+" * "+str_right+")";
							case ArithmOpValues.DIV_VALUE:
								return "("+str_left+" / "+str_right+")";
							case ArithmOpValues.UMINUS_VALUE:
								return "(- "+str_right+")";
						}	
					}
		}
		return "";
	}
	
	@Override
	public void inferExpLeavesType() throws Exception{
		inferExpTypeRecurse(this);
	}
	private static void inferExpTypeRecurse(Expression exp) throws Exception{
	//Infer recursively the type (Logic or Arithmetic) of the expression
		if(exp!=null) {
			if(exp.getOperator() != null) {
				//call with the sub-expressions
				inferExpTypeRecurse(exp.getSubExpr1());
				inferExpTypeRecurse(exp.getSubExpr2());
			}
			else {
				//There is not an operator, the expression is simple
				if(!exp.getIsSimple()) {
					//Report an error
					throw new Exception("The expression "+exp.getName() + " should be simple");
				}
				else {
					if(exp.getIsConstant()) {
						//The type of this expression is already inferred !!!!
					}
					else {
						//Case of variable
						//The type of that expression depends of the type of the variable
						if(exp.getVariable() instanceof BooleanVariable)
							exp.setType(ExprType.LOGICAL);
						else
							exp.setType(ExprType.ARITHMETIC);
					}
				}
			}
		}
	}

	@Override
	public void detectUnexistingVariables(Grafcet g7) throws UnExistingGrafcetVariableException {
		detectUnexistingVariablesRecurse(this, g7);
	}
	private static void detectUnexistingVariablesRecurse(Expression exp, Grafcet g7) throws UnExistingGrafcetVariableException {
		if(exp!=null) {
			if(exp.getIsSimple() && !exp.getIsConstant() && exp.getVariable()==null) {
				throw new UnExistingGrafcetVariableException("The variable <"+exp.getName()+"> does not exist in the Grafcet <"+g7.getName()+">");
			}
		}
	}
} //ExpressionImpl
