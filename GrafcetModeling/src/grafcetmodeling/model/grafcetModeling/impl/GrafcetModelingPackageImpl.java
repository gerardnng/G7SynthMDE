/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Action;
import grafcetmodeling.model.grafcetModeling.ArithmOpValues;
import grafcetmodeling.model.grafcetModeling.AritmeticOperator;
import grafcetmodeling.model.grafcetModeling.BooleanVariable;
import grafcetmodeling.model.grafcetModeling.Connection;
import grafcetmodeling.model.grafcetModeling.ExprType;
import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Function;
import grafcetmodeling.model.grafcetModeling.G7Element;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingFactory;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.LevelAction;
import grafcetmodeling.model.grafcetModeling.LogicOpValues;
import grafcetmodeling.model.grafcetModeling.LogicalOperator;
import grafcetmodeling.model.grafcetModeling.NumericVariable;
import grafcetmodeling.model.grafcetModeling.Operator;
import grafcetmodeling.model.grafcetModeling.Step;
import grafcetmodeling.model.grafcetModeling.StepToTransition;
import grafcetmodeling.model.grafcetModeling.StoredAction;
import grafcetmodeling.model.grafcetModeling.StoredMoment;
import grafcetmodeling.model.grafcetModeling.TimeUnit;
import grafcetmodeling.model.grafcetModeling.TimingOperator;
import grafcetmodeling.model.grafcetModeling.TimingType;
import grafcetmodeling.model.grafcetModeling.Transition;
import grafcetmodeling.model.grafcetModeling.TransitionToStep;
import grafcetmodeling.model.grafcetModeling.VarType;
import grafcetmodeling.model.grafcetModeling.Variable;

import grafcetmodeling.model.grafcetModeling.util.GrafcetModelingValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetModelingPackageImpl extends EPackageImpl implements GrafcetModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g7ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionToStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aritmeticOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicOpValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storedMomentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exprTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmOpValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrafcetModelingPackageImpl() {
		super(eNS_URI, GrafcetModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GrafcetModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrafcetModelingPackage init() {
		if (isInited) return (GrafcetModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GrafcetModelingPackage.eNS_URI);

		// Obtain or create and register package
		GrafcetModelingPackageImpl theGrafcetModelingPackage = (GrafcetModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrafcetModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrafcetModelingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGrafcetModelingPackage.createPackageContents();

		// Initialize created meta-data
		theGrafcetModelingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGrafcetModelingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GrafcetModelingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGrafcetModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrafcetModelingPackage.eNS_URI, theGrafcetModelingPackage);
		return theGrafcetModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG7Element() {
		return g7ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG7Element_Name() {
		return (EAttribute)g7ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcet() {
		return grafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcet_Name() {
		return (EAttribute)grafcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Connections() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Steps() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Transitions() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Variables() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrafcet__GenerateG7Elements() {
		return grafcetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrafcet__HasTimeConditions() {
		return grafcetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrafcet__GetTimeExprs() {
		return grafcetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InConnections() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_OutConnections() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Actions() {
		return (EReference)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Variable() {
		return (EReference)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InTransitions() {
		return (EReference)stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_OutTransitions() {
		return (EReference)stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStep__CreateStepActivityVar() {
		return stepEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsInitial() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsActive() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Grafcet() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Grafcet() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutConnections() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_InSteps() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutSteps() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ParseReceptivity() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_InConnections() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TransitionCondition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Receptivity() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Grafcet() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepToTransition() {
		return stepToTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionToStep() {
		return transitionToStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ActionVariable() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Step() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__ParseExpression() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__CreateActionVariable() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelAction() {
		return levelActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelAction_Condition() {
		return (EAttribute)levelActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelAction_ExpressionCondition() {
		return (EReference)levelActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLevelAction__EvalCondition() {
		return levelActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoredAction() {
		return storedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredAction_Moment() {
		return (EAttribute)storedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredAction_ExpressionToEvaluate() {
		return (EReference)storedActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredAction_Function() {
		return (EReference)storedActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredAction_StoredExpression() {
		return (EAttribute)storedActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredAction_Type() {
		return (EAttribute)storedActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoredAction__EvalStoredExpr() {
		return storedActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_DurationMillis() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_ValueOld() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_ValueNew() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Grafcet() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericVariable() {
		return numericVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericVariable_Value() {
		return (EAttribute)numericVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_SubExpr1() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_SubExpr2() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operator() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Type() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_IsSimple() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_BoolValue() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_ArithmValue() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Variable() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_IsConstant() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Name() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__Eval() {
		return expressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__EvalOld() {
		return expressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetCExpr() {
		return expressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetOldCExpr() {
		return expressionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetName2() {
		return expressionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingOperator() {
		return timingOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingOperator_Type() {
		return (EAttribute)timingOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingOperator_Duration1() {
		return (EAttribute)timingOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingOperator_Duration2() {
		return (EAttribute)timingOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingOperator_Unit1() {
		return (EAttribute)timingOperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingOperator_Unit2() {
		return (EAttribute)timingOperatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAritmeticOperator() {
		return aritmeticOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAritmeticOperator_Name() {
		return (EAttribute)aritmeticOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalOperator_Name() {
		return (EAttribute)logicalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Body() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicOpValues() {
		return logicOpValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingType() {
		return timingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVarType() {
		return varTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStoredMoment() {
		return storedMomentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExprType() {
		return exprTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmOpValues() {
		return arithmOpValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetModelingFactory getGrafcetModelingFactory() {
		return (GrafcetModelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		g7ElementEClass = createEClass(G7_ELEMENT);
		createEAttribute(g7ElementEClass, G7_ELEMENT__NAME);

		grafcetEClass = createEClass(GRAFCET);
		createEAttribute(grafcetEClass, GRAFCET__NAME);
		createEReference(grafcetEClass, GRAFCET__CONNECTIONS);
		createEReference(grafcetEClass, GRAFCET__TRANSITIONS);
		createEReference(grafcetEClass, GRAFCET__STEPS);
		createEReference(grafcetEClass, GRAFCET__VARIABLES);
		createEOperation(grafcetEClass, GRAFCET___GENERATE_G7_ELEMENTS);
		createEOperation(grafcetEClass, GRAFCET___HAS_TIME_CONDITIONS);
		createEOperation(grafcetEClass, GRAFCET___GET_TIME_EXPRS);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__IS_INITIAL);
		createEAttribute(stepEClass, STEP__IS_ACTIVE);
		createEReference(stepEClass, STEP__GRAFCET);
		createEReference(stepEClass, STEP__IN_CONNECTIONS);
		createEReference(stepEClass, STEP__OUT_CONNECTIONS);
		createEReference(stepEClass, STEP__ACTIONS);
		createEReference(stepEClass, STEP__VARIABLE);
		createEReference(stepEClass, STEP__IN_TRANSITIONS);
		createEReference(stepEClass, STEP__OUT_TRANSITIONS);
		createEOperation(stepEClass, STEP___CREATE_STEP_ACTIVITY_VAR);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__GRAFCET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRANSITION_CONDITION);
		createEAttribute(transitionEClass, TRANSITION__RECEPTIVITY);
		createEReference(transitionEClass, TRANSITION__GRAFCET);
		createEReference(transitionEClass, TRANSITION__IN_CONNECTIONS);
		createEReference(transitionEClass, TRANSITION__OUT_CONNECTIONS);
		createEReference(transitionEClass, TRANSITION__IN_STEPS);
		createEReference(transitionEClass, TRANSITION__OUT_STEPS);
		createEOperation(transitionEClass, TRANSITION___PARSE_RECEPTIVITY);

		stepToTransitionEClass = createEClass(STEP_TO_TRANSITION);

		transitionToStepEClass = createEClass(TRANSITION_TO_STEP);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTION_VARIABLE);
		createEReference(actionEClass, ACTION__STEP);
		createEOperation(actionEClass, ACTION___PARSE_EXPRESSION);
		createEOperation(actionEClass, ACTION___CREATE_ACTION_VARIABLE);

		levelActionEClass = createEClass(LEVEL_ACTION);
		createEAttribute(levelActionEClass, LEVEL_ACTION__CONDITION);
		createEReference(levelActionEClass, LEVEL_ACTION__EXPRESSION_CONDITION);
		createEOperation(levelActionEClass, LEVEL_ACTION___EVAL_CONDITION);

		storedActionEClass = createEClass(STORED_ACTION);
		createEAttribute(storedActionEClass, STORED_ACTION__MOMENT);
		createEReference(storedActionEClass, STORED_ACTION__EXPRESSION_TO_EVALUATE);
		createEReference(storedActionEClass, STORED_ACTION__FUNCTION);
		createEAttribute(storedActionEClass, STORED_ACTION__STORED_EXPRESSION);
		createEAttribute(storedActionEClass, STORED_ACTION__TYPE);
		createEOperation(storedActionEClass, STORED_ACTION___EVAL_STORED_EXPR);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__DURATION_MILLIS);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__VALUE_OLD);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__VALUE_NEW);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEReference(variableEClass, VARIABLE__GRAFCET);

		numericVariableEClass = createEClass(NUMERIC_VARIABLE);
		createEAttribute(numericVariableEClass, NUMERIC_VARIABLE__VALUE);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__SUB_EXPR1);
		createEReference(expressionEClass, EXPRESSION__SUB_EXPR2);
		createEReference(expressionEClass, EXPRESSION__OPERATOR);
		createEAttribute(expressionEClass, EXPRESSION__TYPE);
		createEAttribute(expressionEClass, EXPRESSION__IS_SIMPLE);
		createEAttribute(expressionEClass, EXPRESSION__NAME);
		createEAttribute(expressionEClass, EXPRESSION__BOOL_VALUE);
		createEAttribute(expressionEClass, EXPRESSION__ARITHM_VALUE);
		createEReference(expressionEClass, EXPRESSION__VARIABLE);
		createEAttribute(expressionEClass, EXPRESSION__IS_CONSTANT);
		createEOperation(expressionEClass, EXPRESSION___EVAL);
		createEOperation(expressionEClass, EXPRESSION___EVAL_OLD);
		createEOperation(expressionEClass, EXPRESSION___GET_CEXPR);
		createEOperation(expressionEClass, EXPRESSION___GET_OLD_CEXPR);
		createEOperation(expressionEClass, EXPRESSION___GET_NAME2);

		operatorEClass = createEClass(OPERATOR);

		timingOperatorEClass = createEClass(TIMING_OPERATOR);
		createEAttribute(timingOperatorEClass, TIMING_OPERATOR__TYPE);
		createEAttribute(timingOperatorEClass, TIMING_OPERATOR__DURATION1);
		createEAttribute(timingOperatorEClass, TIMING_OPERATOR__DURATION2);
		createEAttribute(timingOperatorEClass, TIMING_OPERATOR__UNIT1);
		createEAttribute(timingOperatorEClass, TIMING_OPERATOR__UNIT2);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__BODY);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);
		createEAttribute(logicalOperatorEClass, LOGICAL_OPERATOR__NAME);

		aritmeticOperatorEClass = createEClass(ARITMETIC_OPERATOR);
		createEAttribute(aritmeticOperatorEClass, ARITMETIC_OPERATOR__NAME);

		// Create enums
		logicOpValuesEEnum = createEEnum(LOGIC_OP_VALUES);
		timingTypeEEnum = createEEnum(TIMING_TYPE);
		varTypeEEnum = createEEnum(VAR_TYPE);
		storedMomentEEnum = createEEnum(STORED_MOMENT);
		exprTypeEEnum = createEEnum(EXPR_TYPE);
		arithmOpValuesEEnum = createEEnum(ARITHM_OP_VALUES);
		timeUnitEEnum = createEEnum(TIME_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stepEClass.getESuperTypes().add(this.getG7Element());
		connectionEClass.getESuperTypes().add(this.getG7Element());
		transitionEClass.getESuperTypes().add(this.getG7Element());
		stepToTransitionEClass.getESuperTypes().add(this.getConnection());
		transitionToStepEClass.getESuperTypes().add(this.getConnection());
		actionEClass.getESuperTypes().add(this.getG7Element());
		levelActionEClass.getESuperTypes().add(this.getAction());
		storedActionEClass.getESuperTypes().add(this.getAction());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		numericVariableEClass.getESuperTypes().add(this.getVariable());
		timingOperatorEClass.getESuperTypes().add(this.getOperator());
		logicalOperatorEClass.getESuperTypes().add(this.getOperator());
		aritmeticOperatorEClass.getESuperTypes().add(this.getOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(g7ElementEClass, G7Element.class, "G7Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getG7Element_Name(), ecorePackage.getEString(), "name", null, 0, 1, G7Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(grafcetEClass, Grafcet.class, "Grafcet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGrafcet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGrafcet_Connections(), this.getConnection(), this.getConnection_Grafcet(), "connections", null, 0, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGrafcet_Transitions(), this.getTransition(), this.getTransition_Grafcet(), "transitions", null, 0, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGrafcet_Steps(), this.getStep(), this.getStep_Grafcet(), "steps", null, 0, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGrafcet_Variables(), this.getVariable(), this.getVariable_Grafcet(), "variables", null, 0, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getGrafcet__GenerateG7Elements(), null, "generateG7Elements", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getGrafcet__HasTimeConditions(), ecorePackage.getEBoolean(), "hasTimeConditions", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getGrafcet__GetTimeExprs(), this.getExpression(), "getTimeExprs", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStep_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStep_IsActive(), ecorePackage.getEBoolean(), "isActive", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_Grafcet(), this.getGrafcet(), this.getGrafcet_Steps(), "grafcet", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_InConnections(), this.getTransitionToStep(), null, "inConnections", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_OutConnections(), this.getStepToTransition(), null, "outConnections", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_Actions(), this.getAction(), this.getAction_Step(), "actions", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_Variable(), this.getBooleanVariable(), null, "variable", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_InTransitions(), this.getTransition(), null, "inTransitions", null, 0, -1, Step.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStep_OutTransitions(), this.getTransition(), null, "outTransitions", null, 0, -1, Step.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getStep__CreateStepActivityVar(), null, "createStepActivityVar", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnection_Grafcet(), this.getGrafcet(), this.getGrafcet_Connections(), "grafcet", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTransition_TransitionCondition(), this.getExpression(), null, "transitionCondition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransition_Receptivity(), ecorePackage.getEString(), "receptivity", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Grafcet(), this.getGrafcet(), this.getGrafcet_Transitions(), "grafcet", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_InConnections(), this.getStepToTransition(), null, "inConnections", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_OutConnections(), this.getTransitionToStep(), null, "outConnections", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_InSteps(), this.getStep(), null, "inSteps", null, 0, -1, Transition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_OutSteps(), this.getStep(), null, "outSteps", null, 0, -1, Transition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getTransition__ParseReceptivity(), null, "parseReceptivity", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(stepToTransitionEClass, StepToTransition.class, "StepToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(transitionToStepEClass, TransitionToStep.class, "TransitionToStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAction_ActionVariable(), this.getVariable(), null, "actionVariable", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_Step(), this.getStep(), this.getStep_Actions(), "step", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAction__ParseExpression(), null, "parseExpression", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAction__CreateActionVariable(), null, "createActionVariable", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(levelActionEClass, LevelAction.class, "LevelAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLevelAction_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, LevelAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLevelAction_ExpressionCondition(), this.getExpression(), null, "expressionCondition", null, 0, 1, LevelAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getLevelAction__EvalCondition(), null, "evalCondition", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(storedActionEClass, StoredAction.class, "StoredAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStoredAction_Moment(), this.getStoredMoment(), "moment", null, 0, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStoredAction_ExpressionToEvaluate(), this.getExpression(), null, "expressionToEvaluate", null, 0, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStoredAction_Function(), this.getFunction(), null, "function", null, 0, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStoredAction_StoredExpression(), ecorePackage.getEString(), "storedExpression", null, 0, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStoredAction_Type(), this.getExprType(), "type", null, 0, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getStoredAction__EvalStoredExpr(), null, "evalStoredExpr", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBooleanVariable_DurationMillis(), ecorePackage.getEInt(), "durationMillis", null, 1, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBooleanVariable_ValueOld(), ecorePackage.getEBoolean(), "valueOld", null, 1, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBooleanVariable_ValueNew(), ecorePackage.getEBoolean(), "valueNew", null, 1, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVariable_Type(), this.getVarType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariable_Grafcet(), this.getGrafcet(), this.getGrafcet_Variables(), "grafcet", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(numericVariableEClass, NumericVariable.class, "NumericVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNumericVariable_Value(), ecorePackage.getEInt(), "value", null, 1, 1, NumericVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExpression_SubExpr1(), this.getExpression(), null, "subExpr1", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpression_SubExpr2(), this.getExpression(), null, "subExpr2", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpression_Operator(), this.getOperator(), null, "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpression_Type(), this.getExprType(), "type", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpression_IsSimple(), ecorePackage.getEBoolean(), "isSimple", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpression_BoolValue(), ecorePackage.getEBoolean(), "boolValue", "false", 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getExpression_ArithmValue(), ecorePackage.getEInt(), "arithmValue", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpression_Variable(), this.getVariable(), null, "variable", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpression_IsConstant(), ecorePackage.getEBoolean(), "isConstant", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExpression__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExpression__EvalOld(), null, "evalOld", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExpression__GetCExpr(), ecorePackage.getEString(), "getCExpr", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExpression__GetOldCExpr(), ecorePackage.getEString(), "getOldCExpr", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExpression__GetName2(), ecorePackage.getEString(), "getName2", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(timingOperatorEClass, TimingOperator.class, "TimingOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTimingOperator_Type(), this.getTimingType(), "type", null, 0, 1, TimingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTimingOperator_Duration1(), ecorePackage.getEInt(), "duration1", null, 1, 1, TimingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTimingOperator_Duration2(), ecorePackage.getEInt(), "duration2", null, 1, 1, TimingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTimingOperator_Unit1(), this.getTimeUnit(), "unit1", null, 0, 1, TimingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTimingOperator_Unit2(), this.getTimeUnit(), "unit2", null, 0, 1, TimingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFunction_Body(), ecorePackage.getEString(), "body", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLogicalOperator_Name(), this.getLogicOpValues(), "name", null, 0, 1, LogicalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(aritmeticOperatorEClass, AritmeticOperator.class, "AritmeticOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAritmeticOperator_Name(), this.getArithmOpValues(), "name", null, 0, 1, AritmeticOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(logicOpValuesEEnum, LogicOpValues.class, "LogicOpValues"); //$NON-NLS-1$
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.OR);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.AND);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.NOT);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.RE);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.FE);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.EQU);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.LE);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.LT);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.GE);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.GT);
		addEEnumLiteral(logicOpValuesEEnum, LogicOpValues.NEQ);

		initEEnum(timingTypeEEnum, TimingType.class, "TimingType"); //$NON-NLS-1$
		addEEnumLiteral(timingTypeEEnum, TimingType.DELAYED1);
		addEEnumLiteral(timingTypeEEnum, TimingType.LIMITED);
		addEEnumLiteral(timingTypeEEnum, TimingType.DELAYED2);

		initEEnum(varTypeEEnum, VarType.class, "VarType"); //$NON-NLS-1$
		addEEnumLiteral(varTypeEEnum, VarType.INPUT);
		addEEnumLiteral(varTypeEEnum, VarType.OUTPUT);
		addEEnumLiteral(varTypeEEnum, VarType.INTERNAL);

		initEEnum(storedMomentEEnum, StoredMoment.class, "StoredMoment"); //$NON-NLS-1$
		addEEnumLiteral(storedMomentEEnum, StoredMoment.ACTIVATION);
		addEEnumLiteral(storedMomentEEnum, StoredMoment.DE_ACTIVATION);

		initEEnum(exprTypeEEnum, ExprType.class, "ExprType"); //$NON-NLS-1$
		addEEnumLiteral(exprTypeEEnum, ExprType.LOGICAL);
		addEEnumLiteral(exprTypeEEnum, ExprType.ARITHMETIC);

		initEEnum(arithmOpValuesEEnum, ArithmOpValues.class, "ArithmOpValues"); //$NON-NLS-1$
		addEEnumLiteral(arithmOpValuesEEnum, ArithmOpValues.ADD);
		addEEnumLiteral(arithmOpValuesEEnum, ArithmOpValues.SUB);
		addEEnumLiteral(arithmOpValuesEEnum, ArithmOpValues.MULT);
		addEEnumLiteral(arithmOpValuesEEnum, ArithmOpValues.DIV);
		addEEnumLiteral(arithmOpValuesEEnum, ArithmOpValues.UMINUS);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit"); //$NON-NLS-1$
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.M);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.H);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (grafcetEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueNamesForG7Vars hasAtLeastOneInitialStep validStepToTransition_StepSide validStepToTransition_TransitionSide validTransitionToStep_TransitionSide validTransitionToStep_StepSide" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (stepEClass, 
		   source, 
		   new String[] {
			 "constraints", "stepVarIsInternalVar levelActionVarIsBoolVar uniqueNamesOfActions" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "validTransition" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "VariableExistsInGrafcet AValidConstantExpression SimpleExpressionHasNoSubExpressions ValidUnaryOperationExpression ValidExpressionWithOperator ValidExprWithTimeOp SimpleNonConstExprIsOfVariableType ValidExpressionWithBinaryOperation ValidComparisonOperator_GT ValidComparisonOperator_LT ValidComparisonOperator_GE ValidComparisonOperator_LE ValidLogicOperator_AND ValidLogicOperator_OR ValidArithmeticOperator_ADD ValidArithmeticOperator_SUB ValidArithmeticOperator_MULT ValidArithmeticOperator_DIV" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"; //$NON-NLS-1$	
		addAnnotation
		  (grafcetEClass, 
		   source, 
		   new String[] {
			 "uniqueNamesForG7Vars", "\n\t\tself.variables->forAll(v1,v2| v1<>v2 implies v1.name<>v2.name)", //$NON-NLS-1$ //$NON-NLS-2$
			 "hasAtLeastOneInitialStep", "\n\t\tself.steps->select(s|s.isInitial)->size()>=1", //$NON-NLS-1$ //$NON-NLS-2$
			 "validStepToTransition_StepSide", "\n\t\tself.connections->select(c|c.oclIsTypeOf(StepToTransition))->forAll(con|self.steps->select(s|s.outConnections->includes(con))->size()=1)", //$NON-NLS-1$ //$NON-NLS-2$
			 "validStepToTransition_TransitionSide", "\n\t\tself.connections->select(c|c.oclIsTypeOf(StepToTransition))->forAll(con|self.transitions->select(t|t.inConnections->includes(con))->size()=1)", //$NON-NLS-1$ //$NON-NLS-2$
			 "validTransitionToStep_TransitionSide", "\n\t\tself.connections->select(c|c.oclIsTypeOf(TransitionToStep))->forAll(con|self.transitions->select(t|t.outConnections->includes(con))->size()=1)", //$NON-NLS-1$ //$NON-NLS-2$
			 "validTransitionToStep_StepSide", "\n\t\tself.connections->select(c|c.oclIsTypeOf(TransitionToStep))->forAll(con|self.steps->select(s|s.inConnections->includes(con))->size()=1)" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (stepEClass, 
		   source, 
		   new String[] {
			 "stepVarIsInternalVar", "\n\t\tself.variable.type = VarType::Internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "levelActionVarIsBoolVar", "\n\t\tself.actions->forAll(act|act.oclIsTypeOf(LevelAction) implies act.actionVariable.oclIsTypeOf(BooleanVariable))", //$NON-NLS-1$ //$NON-NLS-2$
			 "uniqueNamesOfActions", "\n\t\tself.actions->forAll(a1,a2| a1<>a2 implies a1.name<>a2.name)" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getStep_InTransitions(), 
		   source, 
		   new String[] {
			 "derivation", "(grafcet.transitions->select(trans|trans.outConnections->exists(outCon|self.inConnections->includes(outCon))))->asSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getStep_OutTransitions(), 
		   source, 
		   new String[] {
			 "derivation", "(grafcet.transitions->select(trans|trans.inConnections->exists(inCon|self.outConnections->includes(inCon))))->asSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "validTransition", "\n\t\tself.inConnections->size()>=1 and self.outConnections->size()>=1" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTransition_InSteps(), 
		   source, 
		   new String[] {
			 "derivation", "(grafcet.steps->select(step|step.outConnections->exists(outCon|self.inConnections->includes(outCon))))->asSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTransition_OutSteps(), 
		   source, 
		   new String[] {
			 "derivation", "(grafcet.steps->select(step|step.inConnections->exists(inCon|self.outConnections->includes(inCon))))->asSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "VariableExistsInGrafcet", "\n\t\t(self.isSimple and not self.isConstant) implies self.variable<>null", //$NON-NLS-1$ //$NON-NLS-2$
			 "AValidConstantExpression", "\n\t\tself.isConstant implies (self.isSimple and self.variable = null)", //$NON-NLS-1$ //$NON-NLS-2$
			 "SimpleExpressionHasNoSubExpressions", "\n\t\tself.isSimple implies (self.subExpr1 = null and self.subExpr2 = null)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidUnaryOperationExpression", "\n\t\t(self.operator<>null \n\t\t\tand \n\t\t\t(self.operator.oclIsTypeOf(TimingOperator)\n\t\t\t\tor (\n\t\t\t\t\tself.operator.oclIsTypeOf(LogicalOperator) \n\t\t\t\t\tand (\n\t\t\t\t\t\t((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::NOT)\n\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::RE)\n\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::FE)\n\t\t\t\t\t\t)\n\t\t\t\t)\n\t\t\t\tor (self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::U_MINUS)\n\t\t\t)\n\t\t) \n\t\timplies (self.subExpr1=null  and self.subExpr2<>null)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidExpressionWithOperator", "\n\t\t(self.operator<>null) implies (self.variable = null)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidExprWithTimeOp", "\n\t\tself.operator.oclIsTypeOf(TimingOperator) implies self.type = ExprType::Logical", //$NON-NLS-1$ //$NON-NLS-2$
			 "SimpleNonConstExprIsOfVariableType", "\n\t\t(self.isSimple and not self.isConstant and self.variable<>null) implies \n\t\t(\n\t\t\t(self.variable.oclIsTypeOf(BooleanVariable) implies self.type = ExprType::Logical)\n\t\t\tor\n\t\t\t(self.variable.oclIsTypeOf(NumericVariable) implies self.type = ExprType::Arithmetic)\n\t\t)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidExpressionWithBinaryOperation", "\n\t\t(self.operator<>null and self.subExpr1<>null and self.subExpr2<>null) implies (self.subExpr1.type = self.subExpr2.type)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidComparisonOperator_GT", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidComparisonOperator_LT", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidComparisonOperator_GE", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GE) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidComparisonOperator_LE", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LE) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidLogicOperator_AND", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::AND) \n\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidLogicOperator_OR", "\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::OR) \n\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidArithmeticOperator_ADD", "\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::ADD) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidArithmeticOperator_SUB", "\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::SUB) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidArithmeticOperator_MULT", "\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::MULT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)", //$NON-NLS-1$ //$NON-NLS-2$
			 "ValidArithmeticOperator_DIV", "\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::DIV) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection"; //$NON-NLS-1$	
		addAnnotation
		  (getStep_InTransitions(), 
		   source, 
		   new String[] {
			 "nullFree", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getStep_OutTransitions(), 
		   source, 
		   new String[] {
			 "nullFree", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTransition_InSteps(), 
		   source, 
		   new String[] {
			 "nullFree", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTransition_OutSteps(), 
		   source, 
		   new String[] {
			 "nullFree", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	@Override
	public EReference getGrafcet_Expressions() {
		// TODO Auto-generated method stub
		return null;
	}

} //GrafcetModelingPackageImpl
