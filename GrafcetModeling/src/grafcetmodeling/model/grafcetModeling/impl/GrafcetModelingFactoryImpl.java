/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetModelingFactoryImpl extends EFactoryImpl implements GrafcetModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrafcetModelingFactory init() {
		try {
			GrafcetModelingFactory theGrafcetModelingFactory = (GrafcetModelingFactory)EPackage.Registry.INSTANCE.getEFactory(GrafcetModelingPackage.eNS_URI);
			if (theGrafcetModelingFactory != null) {
				return theGrafcetModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrafcetModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrafcetModelingPackage.GRAFCET: return createGrafcet();
			case GrafcetModelingPackage.STEP: return createStep();
			case GrafcetModelingPackage.TRANSITION: return createTransition();
			case GrafcetModelingPackage.STEP_TO_TRANSITION: return createStepToTransition();
			case GrafcetModelingPackage.TRANSITION_TO_STEP: return createTransitionToStep();
			case GrafcetModelingPackage.LEVEL_ACTION: return createLevelAction();
			case GrafcetModelingPackage.STORED_ACTION: return createStoredAction();
			case GrafcetModelingPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case GrafcetModelingPackage.NUMERIC_VARIABLE: return createNumericVariable();
			case GrafcetModelingPackage.EXPRESSION: return createExpression();
			case GrafcetModelingPackage.TIMING_OPERATOR: return createTimingOperator();
			case GrafcetModelingPackage.FUNCTION: return createFunction();
			case GrafcetModelingPackage.LOGICAL_OPERATOR: return createLogicalOperator();
			case GrafcetModelingPackage.ARITMETIC_OPERATOR: return createAritmeticOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GrafcetModelingPackage.LOGIC_OP_VALUES:
				return createLogicOpValuesFromString(eDataType, initialValue);
			case GrafcetModelingPackage.TIMING_TYPE:
				return createTimingTypeFromString(eDataType, initialValue);
			case GrafcetModelingPackage.VAR_TYPE:
				return createVarTypeFromString(eDataType, initialValue);
			case GrafcetModelingPackage.STORED_MOMENT:
				return createStoredMomentFromString(eDataType, initialValue);
			case GrafcetModelingPackage.EXPR_TYPE:
				return createExprTypeFromString(eDataType, initialValue);
			case GrafcetModelingPackage.ARITHM_OP_VALUES:
				return createArithmOpValuesFromString(eDataType, initialValue);
			case GrafcetModelingPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GrafcetModelingPackage.LOGIC_OP_VALUES:
				return convertLogicOpValuesToString(eDataType, instanceValue);
			case GrafcetModelingPackage.TIMING_TYPE:
				return convertTimingTypeToString(eDataType, instanceValue);
			case GrafcetModelingPackage.VAR_TYPE:
				return convertVarTypeToString(eDataType, instanceValue);
			case GrafcetModelingPackage.STORED_MOMENT:
				return convertStoredMomentToString(eDataType, instanceValue);
			case GrafcetModelingPackage.EXPR_TYPE:
				return convertExprTypeToString(eDataType, instanceValue);
			case GrafcetModelingPackage.ARITHM_OP_VALUES:
				return convertArithmOpValuesToString(eDataType, instanceValue);
			case GrafcetModelingPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet createGrafcet() {
		GrafcetImpl grafcet = new GrafcetImpl();
		return grafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepToTransition createStepToTransition() {
		StepToTransitionImpl stepToTransition = new StepToTransitionImpl();
		return stepToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionToStep createTransitionToStep() {
		TransitionToStepImpl transitionToStep = new TransitionToStepImpl();
		return transitionToStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelAction createLevelAction() {
		LevelActionImpl levelAction = new LevelActionImpl();
		return levelAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredAction createStoredAction() {
		StoredActionImpl storedAction = new StoredActionImpl();
		return storedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericVariable createNumericVariable() {
		NumericVariableImpl numericVariable = new NumericVariableImpl();
		return numericVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingOperator createTimingOperator() {
		TimingOperatorImpl timingOperator = new TimingOperatorImpl();
		return timingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AritmeticOperator createAritmeticOperator() {
		AritmeticOperatorImpl aritmeticOperator = new AritmeticOperatorImpl();
		return aritmeticOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperator() {
		LogicalOperatorImpl logicalOperator = new LogicalOperatorImpl();
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOpValues createLogicOpValuesFromString(EDataType eDataType, String initialValue) {
		LogicOpValues result = LogicOpValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicOpValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingType createTimingTypeFromString(EDataType eDataType, String initialValue) {
		TimingType result = TimingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarTypeFromString(EDataType eDataType, String initialValue) {
		VarType result = VarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredMoment createStoredMomentFromString(EDataType eDataType, String initialValue) {
		StoredMoment result = StoredMoment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoredMomentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprType createExprTypeFromString(EDataType eDataType, String initialValue) {
		ExprType result = ExprType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExprTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmOpValues createArithmOpValuesFromString(EDataType eDataType, String initialValue) {
		ArithmOpValues result = ArithmOpValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmOpValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetModelingPackage getGrafcetModelingPackage() {
		return (GrafcetModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrafcetModelingPackage getPackage() {
		return GrafcetModelingPackage.eINSTANCE;
	}

	/*
	public LogicOperator createLogicalOperator() {
		LogicOperator logicaloperator = new LogicOperatorImpl();
		return logicaloperator;
	}
*/
	
} //GrafcetModelingFactoryImpl
