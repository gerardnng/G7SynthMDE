/**
 */
package grafcetmodeling.model.grafcetModeling.util;

import grafcetmodeling.model.grafcetModeling.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage
 * @generated
 */
public class GrafcetModelingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GrafcetModelingValidator INSTANCE = new GrafcetModelingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "grafcetmodeling.model.grafcetModeling";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetModelingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GrafcetModelingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GrafcetModelingPackage.G7_ELEMENT:
				return validateG7Element((G7Element)value, diagnostics, context);
			case GrafcetModelingPackage.GRAFCET:
				return validateGrafcet((Grafcet)value, diagnostics, context);
			case GrafcetModelingPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case GrafcetModelingPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case GrafcetModelingPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case GrafcetModelingPackage.STEP_TO_TRANSITION:
				return validateStepToTransition((StepToTransition)value, diagnostics, context);
			case GrafcetModelingPackage.TRANSITION_TO_STEP:
				return validateTransitionToStep((TransitionToStep)value, diagnostics, context);
			case GrafcetModelingPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case GrafcetModelingPackage.LEVEL_ACTION:
				return validateLevelAction((LevelAction)value, diagnostics, context);
			case GrafcetModelingPackage.STORED_ACTION:
				return validateStoredAction((StoredAction)value, diagnostics, context);
			case GrafcetModelingPackage.BOOLEAN_VARIABLE:
				return validateBooleanVariable((BooleanVariable)value, diagnostics, context);
			case GrafcetModelingPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case GrafcetModelingPackage.NUMERIC_VARIABLE:
				return validateNumericVariable((NumericVariable)value, diagnostics, context);
			case GrafcetModelingPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case GrafcetModelingPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case GrafcetModelingPackage.TIMING_OPERATOR:
				return validateTimingOperator((TimingOperator)value, diagnostics, context);
			case GrafcetModelingPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case GrafcetModelingPackage.LOGICAL_OPERATOR:
				return validateLogicalOperator((LogicalOperator)value, diagnostics, context);
			case GrafcetModelingPackage.ARITMETIC_OPERATOR:
				return validateAritmeticOperator((AritmeticOperator)value, diagnostics, context);
			case GrafcetModelingPackage.LOGIC_OP_VALUES:
				return validateLogicOpValues((LogicOpValues)value, diagnostics, context);
			case GrafcetModelingPackage.TIMING_TYPE:
				return validateTimingType((TimingType)value, diagnostics, context);
			case GrafcetModelingPackage.VAR_TYPE:
				return validateVarType((VarType)value, diagnostics, context);
			case GrafcetModelingPackage.STORED_MOMENT:
				return validateStoredMoment((StoredMoment)value, diagnostics, context);
			case GrafcetModelingPackage.EXPR_TYPE:
				return validateExprType((ExprType)value, diagnostics, context);
			case GrafcetModelingPackage.ARITHM_OP_VALUES:
				return validateArithmOpValues((ArithmOpValues)value, diagnostics, context);
			case GrafcetModelingPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG7Element(G7Element g7Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(g7Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(grafcet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_uniqueNamesForG7Vars(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_hasAtLeastOneInitialStep(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_validStepToTransition_StepSide(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_validStepToTransition_TransitionSide(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_validTransitionToStep_TransitionSide(grafcet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrafcet_validTransitionToStep_StepSide(grafcet, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueNamesForG7Vars constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__UNIQUE_NAMES_FOR_G7_VARS__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.variables->forAll(v1,v2| v1<>v2 implies v1.name<>v2.name)"; //$NON-NLS-1$

	/**
	 * Validates the uniqueNamesForG7Vars constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_uniqueNamesForG7Vars(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "uniqueNamesForG7Vars", //$NON-NLS-1$
				 GRAFCET__UNIQUE_NAMES_FOR_G7_VARS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasAtLeastOneInitialStep constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__HAS_AT_LEAST_ONE_INITIAL_STEP__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.steps->select(s|s.isInitial)->size()>=1"; //$NON-NLS-1$

	/**
	 * Validates the hasAtLeastOneInitialStep constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_hasAtLeastOneInitialStep(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "hasAtLeastOneInitialStep", //$NON-NLS-1$
				 GRAFCET__HAS_AT_LEAST_ONE_INITIAL_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validStepToTransition_StepSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__VALID_STEP_TO_TRANSITION_STEP_SIDE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.connections->select(c|c.oclIsTypeOf(StepToTransition))->forAll(con|self.steps->select(s|s.outConnections->includes(con))->size()=1)";

	/**
	 * Validates the validStepToTransition_StepSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_validStepToTransition_StepSide(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "validStepToTransition_StepSide", //$NON-NLS-1$
				 GRAFCET__VALID_STEP_TO_TRANSITION_STEP_SIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validStepToTransition_TransitionSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__VALID_STEP_TO_TRANSITION_TRANSITION_SIDE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.connections->select(c|c.oclIsTypeOf(StepToTransition))->forAll(con|self.transitions->select(t|t.inConnections->includes(con))->size()=1)";

	/**
	 * Validates the validStepToTransition_TransitionSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_validStepToTransition_TransitionSide(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "validStepToTransition_TransitionSide", //$NON-NLS-1$
				 GRAFCET__VALID_STEP_TO_TRANSITION_TRANSITION_SIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validTransitionToStep_TransitionSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__VALID_TRANSITION_TO_STEP_TRANSITION_SIDE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.connections->select(c|c.oclIsTypeOf(TransitionToStep))->forAll(con|self.transitions->select(t|t.outConnections->includes(con))->size()=1)";

	/**
	 * Validates the validTransitionToStep_TransitionSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_validTransitionToStep_TransitionSide(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "validTransitionToStep_TransitionSide", //$NON-NLS-1$
				 GRAFCET__VALID_TRANSITION_TO_STEP_TRANSITION_SIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validTransitionToStep_StepSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAFCET__VALID_TRANSITION_TO_STEP_STEP_SIDE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.connections->select(c|c.oclIsTypeOf(TransitionToStep))->forAll(con|self.steps->select(s|s.inConnections->includes(con))->size()=1)";

	/**
	 * Validates the validTransitionToStep_StepSide constraint of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet_validTransitionToStep_StepSide(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.GRAFCET,
				 grafcet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "validTransitionToStep_StepSide", //$NON-NLS-1$
				 GRAFCET__VALID_TRANSITION_TO_STEP_STEP_SIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_stepVarIsInternalVar(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_levelActionVarIsBoolVar(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_uniqueNamesOfActions(step, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the stepVarIsInternalVar constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__STEP_VAR_IS_INTERNAL_VAR__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.variable.type = VarType::Internal";

	/**
	 * Validates the stepVarIsInternalVar constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_stepVarIsInternalVar(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "stepVarIsInternalVar", //$NON-NLS-1$
				 STEP__STEP_VAR_IS_INTERNAL_VAR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the levelActionVarIsBoolVar constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__LEVEL_ACTION_VAR_IS_BOOL_VAR__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.actions->forAll(act|act.oclIsTypeOf(LevelAction) implies act.actionVariable.oclIsTypeOf(BooleanVariable))";

	/**
	 * Validates the levelActionVarIsBoolVar constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_levelActionVarIsBoolVar(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "levelActionVarIsBoolVar", //$NON-NLS-1$
				 STEP__LEVEL_ACTION_VAR_IS_BOOL_VAR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueNamesOfActions constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__UNIQUE_NAMES_OF_ACTIONS__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.actions->forAll(a1,a2| a1<>a2 implies a1.name<>a2.name)"; //$NON-NLS-1$

	/**
	 * Validates the uniqueNamesOfActions constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_uniqueNamesOfActions(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "uniqueNamesOfActions", //$NON-NLS-1$
				 STEP__UNIQUE_NAMES_OF_ACTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_validTransition(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validTransition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__VALID_TRANSITION__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.inConnections->size()>=1 and self.outConnections->size()>=1";

	/**
	 * Validates the validTransition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_validTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "validTransition", //$NON-NLS-1$
				 TRANSITION__VALID_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepToTransition(StepToTransition stepToTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepToTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionToStep(TransitionToStep transitionToStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionToStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelAction(LevelAction levelAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(levelAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredAction(StoredAction storedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanVariable(BooleanVariable booleanVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericVariable(NumericVariable numericVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_VariableExistsInGrafcet(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_AValidConstantExpression(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_SimpleExpressionHasNoSubExpressions(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidUnaryOperationExpression(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidExpressionWithOperator(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidExprWithTimeOp(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_SimpleNonConstExprIsOfVariableType(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidExpressionWithBinaryOperation(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidComparisonOperator_GT(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidComparisonOperator_LT(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidComparisonOperator_GE(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidComparisonOperator_LE(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidLogicOperator_AND(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidLogicOperator_OR(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidArithmeticOperator_ADD(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidArithmeticOperator_SUB(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidArithmeticOperator_MULT(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpression_ValidArithmeticOperator_DIV(expression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the VariableExistsInGrafcet constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VARIABLE_EXISTS_IN_GRAFCET__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.isSimple and not self.isConstant) implies self.variable<>null"; //$NON-NLS-1$

	/**
	 * Validates the VariableExistsInGrafcet constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_VariableExistsInGrafcet(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "VariableExistsInGrafcet", //$NON-NLS-1$
				 EXPRESSION__VARIABLE_EXISTS_IN_GRAFCET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AValidConstantExpression constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__AVALID_CONSTANT_EXPRESSION__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.isConstant implies (self.isSimple and self.variable = null)"; //$NON-NLS-1$

	/**
	 * Validates the AValidConstantExpression constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_AValidConstantExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "AValidConstantExpression", //$NON-NLS-1$
				 EXPRESSION__AVALID_CONSTANT_EXPRESSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SimpleExpressionHasNoSubExpressions constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__SIMPLE_EXPRESSION_HAS_NO_SUB_EXPRESSIONS__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.isSimple implies (self.subExpr1 = null and self.subExpr2 = null)"; //$NON-NLS-1$

	/**
	 * Validates the SimpleExpressionHasNoSubExpressions constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_SimpleExpressionHasNoSubExpressions(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "SimpleExpressionHasNoSubExpressions", //$NON-NLS-1$
				 EXPRESSION__SIMPLE_EXPRESSION_HAS_NO_SUB_EXPRESSIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidUnaryOperationExpression constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_UNARY_OPERATION_EXPRESSION__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator<>null \n" + //$NON-NLS-1$
		"\t\t\tand \n" + //$NON-NLS-1$
		"\t\t\t(self.operator.oclIsTypeOf(TimingOperator)\n" + //$NON-NLS-1$
		"\t\t\t\tor (\n" + //$NON-NLS-1$
		"\t\t\t\t\tself.operator.oclIsTypeOf(LogicalOperator) \n" + //$NON-NLS-1$
		"\t\t\t\t\tand (\n" + //$NON-NLS-1$
		"\t\t\t\t\t\t((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::NOT)\n" + //$NON-NLS-1$
		"\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::RE)\n" + //$NON-NLS-1$
		"\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::FE)\n" + //$NON-NLS-1$
		"\t\t\t\t\t\t)\n" + //$NON-NLS-1$
		"\t\t\t\t)\n" + //$NON-NLS-1$
		"\t\t\t\tor (self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::U_MINUS)\n" + //$NON-NLS-1$
		"\t\t\t)\n" + //$NON-NLS-1$
		"\t\t) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1=null  and self.subExpr2<>null)"; //$NON-NLS-1$

	/**
	 * Validates the ValidUnaryOperationExpression constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidUnaryOperationExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidUnaryOperationExpression", //$NON-NLS-1$
				 EXPRESSION__VALID_UNARY_OPERATION_EXPRESSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidExpressionWithOperator constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_EXPRESSION_WITH_OPERATOR__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator<>null) implies (self.variable = null)"; //$NON-NLS-1$

	/**
	 * Validates the ValidExpressionWithOperator constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidExpressionWithOperator(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidExpressionWithOperator", //$NON-NLS-1$
				 EXPRESSION__VALID_EXPRESSION_WITH_OPERATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidExprWithTimeOp constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_EXPR_WITH_TIME_OP__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\tself.operator.oclIsTypeOf(TimingOperator) implies self.type = ExprType::Logical"; //$NON-NLS-1$

	/**
	 * Validates the ValidExprWithTimeOp constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidExprWithTimeOp(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidExprWithTimeOp", //$NON-NLS-1$
				 EXPRESSION__VALID_EXPR_WITH_TIME_OP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SimpleNonConstExprIsOfVariableType constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__SIMPLE_NON_CONST_EXPR_IS_OF_VARIABLE_TYPE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.isSimple and not self.isConstant and self.variable<>null) implies \n" + //$NON-NLS-1$
		"\t\t(\n" + //$NON-NLS-1$
		"\t\t\t(self.variable.oclIsTypeOf(BooleanVariable) implies self.type = ExprType::Logical)\n" + //$NON-NLS-1$
		"\t\t\tor\n" + //$NON-NLS-1$
		"\t\t\t(self.variable.oclIsTypeOf(NumericVariable) implies self.type = ExprType::Arithmetic)\n" + //$NON-NLS-1$
		"\t\t)"; //$NON-NLS-1$

	/**
	 * Validates the SimpleNonConstExprIsOfVariableType constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_SimpleNonConstExprIsOfVariableType(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "SimpleNonConstExprIsOfVariableType", //$NON-NLS-1$
				 EXPRESSION__SIMPLE_NON_CONST_EXPR_IS_OF_VARIABLE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidExpressionWithBinaryOperation constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_EXPRESSION_WITH_BINARY_OPERATION__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator<>null and self.subExpr1<>null and self.subExpr2<>null) implies (self.subExpr1.type = self.subExpr2.type)"; //$NON-NLS-1$

	/**
	 * Validates the ValidExpressionWithBinaryOperation constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidExpressionWithBinaryOperation(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidExpressionWithBinaryOperation", //$NON-NLS-1$
				 EXPRESSION__VALID_EXPRESSION_WITH_BINARY_OPERATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComparisonOperator_GT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_COMPARISON_OPERATOR_GT__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GT) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidComparisonOperator_GT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidComparisonOperator_GT(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidComparisonOperator_GT", //$NON-NLS-1$
				 EXPRESSION__VALID_COMPARISON_OPERATOR_GT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComparisonOperator_LT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_COMPARISON_OPERATOR_LT__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LT) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidComparisonOperator_LT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidComparisonOperator_LT(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidComparisonOperator_LT", //$NON-NLS-1$
				 EXPRESSION__VALID_COMPARISON_OPERATOR_LT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComparisonOperator_GE constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_COMPARISON_OPERATOR_GE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GE) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidComparisonOperator_GE constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidComparisonOperator_GE(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidComparisonOperator_GE", //$NON-NLS-1$
				 EXPRESSION__VALID_COMPARISON_OPERATOR_GE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComparisonOperator_LE constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_COMPARISON_OPERATOR_LE__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LE) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidComparisonOperator_LE constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidComparisonOperator_LE(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidComparisonOperator_LE", //$NON-NLS-1$
				 EXPRESSION__VALID_COMPARISON_OPERATOR_LE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidLogicOperator_AND constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_LOGIC_OPERATOR_AND__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::AND) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)"; //$NON-NLS-1$

	/**
	 * Validates the ValidLogicOperator_AND constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidLogicOperator_AND(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidLogicOperator_AND", //$NON-NLS-1$
				 EXPRESSION__VALID_LOGIC_OPERATOR_AND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidLogicOperator_OR constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_LOGIC_OPERATOR_OR__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::OR) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)"; //$NON-NLS-1$

	/**
	 * Validates the ValidLogicOperator_OR constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidLogicOperator_OR(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidLogicOperator_OR", //$NON-NLS-1$
				 EXPRESSION__VALID_LOGIC_OPERATOR_OR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidArithmeticOperator_ADD constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_ARITHMETIC_OPERATOR_ADD__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::ADD) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidArithmeticOperator_ADD constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidArithmeticOperator_ADD(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidArithmeticOperator_ADD", //$NON-NLS-1$
				 EXPRESSION__VALID_ARITHMETIC_OPERATOR_ADD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidArithmeticOperator_SUB constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_ARITHMETIC_OPERATOR_SUB__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::SUB) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidArithmeticOperator_SUB constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidArithmeticOperator_SUB(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidArithmeticOperator_SUB", //$NON-NLS-1$
				 EXPRESSION__VALID_ARITHMETIC_OPERATOR_SUB__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidArithmeticOperator_MULT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_ARITHMETIC_OPERATOR_MULT__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::MULT) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidArithmeticOperator_MULT constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidArithmeticOperator_MULT(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidArithmeticOperator_MULT", //$NON-NLS-1$
				 EXPRESSION__VALID_ARITHMETIC_OPERATOR_MULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidArithmeticOperator_DIV constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPRESSION__VALID_ARITHMETIC_OPERATOR_DIV__EEXPRESSION = "\n" + //$NON-NLS-1$
		"\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::DIV) \n" + //$NON-NLS-1$
		"\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)"; //$NON-NLS-1$

	/**
	 * Validates the ValidArithmeticOperator_DIV constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_ValidArithmeticOperator_DIV(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GrafcetModelingPackage.Literals.EXPRESSION,
				 expression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$
				 "ValidArithmeticOperator_DIV", //$NON-NLS-1$
				 EXPRESSION__VALID_ARITHMETIC_OPERATOR_DIV__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingOperator(TimingOperator timingOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAritmeticOperator(AritmeticOperator aritmeticOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aritmeticOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperator(LogicalOperator logicalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicOpValues(LogicOpValues logicOpValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingType(TimingType timingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarType(VarType varType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredMoment(StoredMoment storedMoment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExprType(ExprType exprType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArithmOpValues(ArithmOpValues arithmOpValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GrafcetModelingValidator
