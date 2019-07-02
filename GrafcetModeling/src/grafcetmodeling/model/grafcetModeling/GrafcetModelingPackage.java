/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GrafcetModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grafcetModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/grafcetModeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grafcetModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafcetModelingPackage eINSTANCE = grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.G7ElementImpl <em>G7 Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.G7ElementImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getG7Element()
	 * @generated
	 */
	int G7_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G7_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>G7 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G7_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>G7 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G7_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl <em>Grafcet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getGrafcet()
	 * @generated
	 */
	int GRAFCET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__STEPS = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__VARIABLES = 4;

	/**
	 * The number of structural features of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Generate G7 Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET___GENERATE_G7_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Has Time Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET___HAS_TIME_CONDITIONS = 1;

	/**
	 * The operation id for the '<em>Get Time Exprs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET___GET_TIME_EXPRS = 2;

	/**
	 * The number of operations of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.StepImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = G7_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_INITIAL = G7_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ACTIVE = G7_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__GRAFCET = G7_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IN_CONNECTIONS = G7_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUT_CONNECTIONS = G7_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIONS = G7_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VARIABLE = G7_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IN_TRANSITIONS = G7_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUT_TRANSITIONS = G7_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = G7_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create Step Activity Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___CREATE_STEP_ACTIVITY_VAR = G7_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = G7_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.ConnectionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = G7_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GRAFCET = G7_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = G7_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = G7_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.TransitionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = G7_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_CONDITION = G7_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receptivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECEPTIVITY = G7_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAFCET = G7_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN_CONNECTIONS = G7_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT_CONNECTIONS = G7_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN_STEPS = G7_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Out Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT_STEPS = G7_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = G7_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Parse Receptivity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___PARSE_RECEPTIVITY = G7_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = G7_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.StepToTransitionImpl <em>Step To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.StepToTransitionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStepToTransition()
	 * @generated
	 */
	int STEP_TO_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_TRANSITION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_TRANSITION__GRAFCET = CONNECTION__GRAFCET;

	/**
	 * The number of structural features of the '<em>Step To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_TRANSITION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_TRANSITION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.TransitionToStepImpl <em>Transition To Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.TransitionToStepImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTransitionToStep()
	 * @generated
	 */
	int TRANSITION_TO_STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_STEP__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_STEP__GRAFCET = CONNECTION__GRAFCET;

	/**
	 * The number of structural features of the '<em>Transition To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_STEP_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_STEP_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.ActionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = G7_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_VARIABLE = G7_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STEP = G7_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = G7_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Parse Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PARSE_EXPRESSION = G7_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Action Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CREATE_ACTION_VARIABLE = G7_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = G7_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl <em>Level Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLevelAction()
	 * @generated
	 */
	int LEVEL_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION__ACTION_VARIABLE = ACTION__ACTION_VARIABLE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION__STEP = ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION__EXPRESSION_CONDITION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Parse Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION___PARSE_EXPRESSION = ACTION___PARSE_EXPRESSION;

	/**
	 * The operation id for the '<em>Create Action Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION___CREATE_ACTION_VARIABLE = ACTION___CREATE_ACTION_VARIABLE;

	/**
	 * The operation id for the '<em>Eval Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION___EVAL_CONDITION = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl <em>Stored Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStoredAction()
	 * @generated
	 */
	int STORED_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__ACTION_VARIABLE = ACTION__ACTION_VARIABLE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__STEP = ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__MOMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression To Evaluate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__EXPRESSION_TO_EVALUATE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__FUNCTION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stored Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__STORED_EXPRESSION = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__TYPE = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stored Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Parse Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___PARSE_EXPRESSION = ACTION___PARSE_EXPRESSION;

	/**
	 * The operation id for the '<em>Create Action Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___CREATE_ACTION_VARIABLE = ACTION___CREATE_ACTION_VARIABLE;

	/**
	 * The operation id for the '<em>Eval Stored Expr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___EVAL_STORED_EXPR = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stored Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.VariableImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GRAFCET = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__GRAFCET = VARIABLE__GRAFCET;

	/**
	 * The feature id for the '<em><b>Duration Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__DURATION_MILLIS = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE_OLD = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE_NEW = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.NumericVariableImpl <em>Numeric Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.NumericVariableImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getNumericVariable()
	 * @generated
	 */
	int NUMERIC_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE__GRAFCET = VARIABLE__GRAFCET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Sub Expr1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SUB_EXPR1 = 0;

	/**
	 * The feature id for the '<em><b>Sub Expr2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SUB_EXPR2 = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_SIMPLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BOOL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Arithm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ARITHM_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_CONSTANT = 9;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EVAL = 0;

	/**
	 * The operation id for the '<em>Eval Old</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EVAL_OLD = 1;

	/**
	 * The operation id for the '<em>Get CExpr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_CEXPR = 2;

	/**
	 * The operation id for the '<em>Get Old CExpr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_OLD_CEXPR = 3;

	/**
	 * The operation id for the '<em>Get Name2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_NAME2 = 4;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.OperatorImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 14;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl <em>Timing Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimingOperator()
	 * @generated
	 */
	int TIMING_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR__TYPE = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR__DURATION1 = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR__DURATION2 = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR__UNIT1 = OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR__UNIT2 = OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Timing Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Timing Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.AritmeticOperatorImpl <em>Aritmetic Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.AritmeticOperatorImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getAritmeticOperator()
	 * @generated
	 */
	int ARITMETIC_OPERATOR = 18;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.LogicalOperatorImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.impl.FunctionImpl
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__NAME = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITMETIC_OPERATOR__NAME = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aritmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITMETIC_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aritmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITMETIC_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.LogicOpValues <em>Logic Op Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.LogicOpValues
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLogicOpValues()
	 * @generated
	 */
	int LOGIC_OP_VALUES = 19;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.TimingType <em>Timing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.TimingType
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimingType()
	 * @generated
	 */
	int TIMING_TYPE = 20;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.VarType <em>Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.VarType
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 21;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.StoredMoment <em>Stored Moment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.StoredMoment
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStoredMoment()
	 * @generated
	 */
	int STORED_MOMENT = 22;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.ExprType <em>Expr Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getExprType()
	 * @generated
	 */
	int EXPR_TYPE = 23;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.ArithmOpValues <em>Arithm Op Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.ArithmOpValues
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getArithmOpValues()
	 * @generated
	 */
	int ARITHM_OP_VALUES = 24;

	/**
	 * The meta object id for the '{@link grafcetmodeling.model.grafcetModeling.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 25;

	int GRAFCET__EXPRESSIONS = 0;


	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.G7Element <em>G7 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G7 Element</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.G7Element
	 * @generated
	 */
	EClass getG7Element();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.G7Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.G7Element#getName()
	 * @see #getG7Element()
	 * @generated
	 */
	EAttribute getG7Element_Name();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Grafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafcet</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet
	 * @generated
	 */
	EClass getGrafcet();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getName()
	 * @see #getGrafcet()
	 * @generated
	 */
	EAttribute getGrafcet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getConnections()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getSteps()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getTransitions()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getVariables()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getExpressions()
	 * @see #getGrafcet()
	 * @generated NOT
	 */
	EReference getGrafcet_Expressions();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Grafcet#generateG7Elements() <em>Generate G7 Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate G7 Elements</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#generateG7Elements()
	 * @generated
	 */
	EOperation getGrafcet__GenerateG7Elements();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Grafcet#hasTimeConditions() <em>Has Time Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Time Conditions</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#hasTimeConditions()
	 * @generated
	 */
	EOperation getGrafcet__HasTimeConditions();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getTimeExprs() <em>Get Time Exprs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Exprs</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getTimeExprs()
	 * @generated
	 */
	EOperation getGrafcet__GetTimeExprs();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Step#getInConnections <em>In Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Connections</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getInConnections()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InConnections();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Step#getOutConnections <em>Out Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Connections</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getOutConnections()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcetmodeling.model.grafcetModeling.Step#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getActions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Actions();

	/**
	 * Returns the meta object for the reference '{@link grafcetmodeling.model.grafcetModeling.Step#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getVariable()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Variable();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Step#getInTransitions <em>In Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Transitions</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getInTransitions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InTransitions();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Step#getOutTransitions <em>Out Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Transitions</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getOutTransitions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutTransitions();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Step#createStepActivityVar() <em>Create Step Activity Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Step Activity Var</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Step#createStepActivityVar()
	 * @generated
	 */
	EOperation getStep__CreateStepActivityVar();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Step#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#isIsInitial()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Step#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#isIsActive()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_IsActive();

	/**
	 * Returns the meta object for the container reference '{@link grafcetmodeling.model.grafcetModeling.Step#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Step#getGrafcet()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Grafcet();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the container reference '{@link grafcetmodeling.model.grafcetModeling.Connection#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Connection#getGrafcet()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Grafcet();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Transition#getOutConnections <em>Out Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Connections</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getOutConnections()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutConnections();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Transition#getInSteps <em>In Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Steps</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getInSteps()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_InSteps();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Transition#getOutSteps <em>Out Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Steps</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getOutSteps()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutSteps();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Transition#parseReceptivity() <em>Parse Receptivity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Receptivity</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#parseReceptivity()
	 * @generated
	 */
	EOperation getTransition__ParseReceptivity();

	/**
	 * Returns the meta object for the reference list '{@link grafcetmodeling.model.grafcetModeling.Transition#getInConnections <em>In Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Connections</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getInConnections()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_InConnections();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.Transition#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getTransitionCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionCondition();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Transition#getReceptivity <em>Receptivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receptivity</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getReceptivity()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Receptivity();

	/**
	 * Returns the meta object for the container reference '{@link grafcetmodeling.model.grafcetModeling.Transition#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getGrafcet()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Grafcet();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.StepToTransition <em>Step To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step To Transition</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StepToTransition
	 * @generated
	 */
	EClass getStepToTransition();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.TransitionToStep <em>Transition To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition To Step</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TransitionToStep
	 * @generated
	 */
	EClass getTransitionToStep();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link grafcetmodeling.model.grafcetModeling.Action#getActionVariable <em>Action Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Action#getActionVariable()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionVariable();

	/**
	 * Returns the meta object for the container reference '{@link grafcetmodeling.model.grafcetModeling.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Step</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Action#getStep()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Step();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Action#parseExpression() <em>Parse Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Expression</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Action#parseExpression()
	 * @generated
	 */
	EOperation getAction__ParseExpression();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Action#createActionVariable() <em>Create Action Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Action Variable</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Action#createActionVariable()
	 * @generated
	 */
	EOperation getAction__CreateActionVariable();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.LevelAction <em>Level Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Action</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LevelAction
	 * @generated
	 */
	EClass getLevelAction();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.LevelAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LevelAction#getCondition()
	 * @see #getLevelAction()
	 * @generated
	 */
	EAttribute getLevelAction_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.LevelAction#getExpressionCondition <em>Expression Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Condition</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LevelAction#getExpressionCondition()
	 * @see #getLevelAction()
	 * @generated
	 */
	EReference getLevelAction_ExpressionCondition();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.LevelAction#evalCondition() <em>Eval Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Condition</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.LevelAction#evalCondition()
	 * @generated
	 */
	EOperation getLevelAction__EvalCondition();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.StoredAction <em>Stored Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Action</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction
	 * @generated
	 */
	EClass getStoredAction();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getMoment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#getMoment()
	 * @see #getStoredAction()
	 * @generated
	 */
	EAttribute getStoredAction_Moment();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getExpressionToEvaluate <em>Expression To Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression To Evaluate</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#getExpressionToEvaluate()
	 * @see #getStoredAction()
	 * @generated
	 */
	EReference getStoredAction_ExpressionToEvaluate();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#getFunction()
	 * @see #getStoredAction()
	 * @generated
	 */
	EReference getStoredAction_Function();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getStoredExpression <em>Stored Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stored Expression</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#getStoredExpression()
	 * @see #getStoredAction()
	 * @generated
	 */
	EAttribute getStoredAction_StoredExpression();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#getType()
	 * @see #getStoredAction()
	 * @generated
	 */
	EAttribute getStoredAction_Type();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#evalStoredExpr() <em>Eval Stored Expr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Stored Expr</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.StoredAction#evalStoredExpr()
	 * @generated
	 */
	EOperation getStoredAction__EvalStoredExpr();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#getDurationMillis <em>Duration Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Millis</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.BooleanVariable#getDurationMillis()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_DurationMillis();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueOld <em>Value Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Old</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueOld()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_ValueOld();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueNew <em>Value New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value New</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueNew()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_ValueNew();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the container reference '{@link grafcetmodeling.model.grafcetModeling.Variable#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Variable#getGrafcet()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Grafcet();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.NumericVariable <em>Numeric Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.NumericVariable
	 * @generated
	 */
	EClass getNumericVariable();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.NumericVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.NumericVariable#getValue()
	 * @see #getNumericVariable()
	 * @generated
	 */
	EAttribute getNumericVariable_Value();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr1 <em>Sub Expr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Expr1</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getSubExpr1()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_SubExpr1();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr2 <em>Sub Expr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Expr2</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getSubExpr2()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_SubExpr2();

	/**
	 * Returns the meta object for the containment reference '{@link grafcetmodeling.model.grafcetModeling.Expression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getOperator()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Operator();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#isIsSimple <em>Is Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simple</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#isIsSimple()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_IsSimple();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#isBoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Value</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#isBoolValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_BoolValue();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#getArithmValue <em>Arithm Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arithm Value</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getArithmValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ArithmValue();

	/**
	 * Returns the meta object for the reference '{@link grafcetmodeling.model.grafcetModeling.Expression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getVariable()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Variable();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#isIsConstant <em>Is Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constant</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#isIsConstant()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_IsConstant();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Expression#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#eval()
	 * @generated
	 */
	EOperation getExpression__Eval();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Expression#evalOld() <em>Eval Old</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Old</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#evalOld()
	 * @generated
	 */
	EOperation getExpression__EvalOld();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Expression#getCExpr() <em>Get CExpr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CExpr</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getCExpr()
	 * @generated
	 */
	EOperation getExpression__GetCExpr();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Expression#getOldCExpr() <em>Get Old CExpr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Old CExpr</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getOldCExpr()
	 * @generated
	 */
	EOperation getExpression__GetOldCExpr();

	/**
	 * Returns the meta object for the '{@link grafcetmodeling.model.grafcetModeling.Expression#getName2() <em>Get Name2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name2</em>' operation.
	 * @see grafcetmodeling.model.grafcetModeling.Expression#getName2()
	 * @generated
	 */
	EOperation getExpression__GetName2();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.TimingOperator <em>Timing Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Operator</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator
	 * @generated
	 */
	EClass getTimingOperator();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator#getType()
	 * @see #getTimingOperator()
	 * @generated
	 */
	EAttribute getTimingOperator_Type();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration1 <em>Duration1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration1</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration1()
	 * @see #getTimingOperator()
	 * @generated
	 */
	EAttribute getTimingOperator_Duration1();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration2 <em>Duration2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration2</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration2()
	 * @see #getTimingOperator()
	 * @generated
	 */
	EAttribute getTimingOperator_Duration2();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit1 <em>Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit1</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit1()
	 * @see #getTimingOperator()
	 * @generated
	 */
	EAttribute getTimingOperator_Unit1();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit2 <em>Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit2</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit2()
	 * @see #getTimingOperator()
	 * @generated
	 */
	EAttribute getTimingOperator_Unit2();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.AritmeticOperator <em>Aritmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aritmetic Operator</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.AritmeticOperator
	 * @generated
	 */
	EClass getAritmeticOperator();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.AritmeticOperator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.AritmeticOperator#getName()
	 * @see #getAritmeticOperator()
	 * @generated
	 */
	EAttribute getAritmeticOperator_Name();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.LogicalOperator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LogicalOperator#getName()
	 * @see #getLogicalOperator()
	 * @generated
	 */
	EAttribute getLogicalOperator_Name();

	/**
	 * Returns the meta object for class '{@link grafcetmodeling.model.grafcetModeling.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link grafcetmodeling.model.grafcetModeling.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.LogicOpValues <em>Logic Op Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Op Values</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.LogicOpValues
	 * @generated
	 */
	EEnum getLogicOpValues();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.TimingType <em>Timing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimingType
	 * @generated
	 */
	EEnum getTimingType();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.VarType
	 * @generated
	 */
	EEnum getVarType();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.StoredMoment <em>Stored Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stored Moment</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.StoredMoment
	 * @generated
	 */
	EEnum getStoredMoment();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.ExprType <em>Expr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expr Type</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @generated
	 */
	EEnum getExprType();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.ArithmOpValues <em>Arithm Op Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithm Op Values</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.ArithmOpValues
	 * @generated
	 */
	EEnum getArithmOpValues();

	/**
	 * Returns the meta object for enum '{@link grafcetmodeling.model.grafcetModeling.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrafcetModelingFactory getGrafcetModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.G7ElementImpl <em>G7 Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.G7ElementImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getG7Element()
		 * @generated
		 */
		EClass G7_ELEMENT = eINSTANCE.getG7Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute G7_ELEMENT__NAME = eINSTANCE.getG7Element_Name();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl <em>Grafcet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getGrafcet()
		 * @generated
		 */
		EClass GRAFCET = eINSTANCE.getGrafcet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET__NAME = eINSTANCE.getGrafcet_Name();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__CONNECTIONS = eINSTANCE.getGrafcet_Connections();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__STEPS = eINSTANCE.getGrafcet_Steps();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__TRANSITIONS = eINSTANCE.getGrafcet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__VARIABLES = eINSTANCE.getGrafcet_Variables();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		EReference GRAFCET__EXPRESSIONS = eINSTANCE.getGrafcet_Expressions();

		/**
		 * The meta object literal for the '<em><b>Generate G7 Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAFCET___GENERATE_G7_ELEMENTS = eINSTANCE.getGrafcet__GenerateG7Elements();

		/**
		 * The meta object literal for the '<em><b>Has Time Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAFCET___HAS_TIME_CONDITIONS = eINSTANCE.getGrafcet__HasTimeConditions();

		/**
		 * The meta object literal for the '<em><b>Get Time Exprs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAFCET___GET_TIME_EXPRS = eINSTANCE.getGrafcet__GetTimeExprs();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.StepImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>In Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IN_CONNECTIONS = eINSTANCE.getStep_InConnections();

		/**
		 * The meta object literal for the '<em><b>Out Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUT_CONNECTIONS = eINSTANCE.getStep_OutConnections();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ACTIONS = eINSTANCE.getStep_Actions();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__VARIABLE = eINSTANCE.getStep_Variable();

		/**
		 * The meta object literal for the '<em><b>In Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IN_TRANSITIONS = eINSTANCE.getStep_InTransitions();

		/**
		 * The meta object literal for the '<em><b>Out Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUT_TRANSITIONS = eINSTANCE.getStep_OutTransitions();

		/**
		 * The meta object literal for the '<em><b>Create Step Activity Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEP___CREATE_STEP_ACTIVITY_VAR = eINSTANCE.getStep__CreateStepActivityVar();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IS_INITIAL = eINSTANCE.getStep_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IS_ACTIVE = eINSTANCE.getStep_IsActive();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__GRAFCET = eINSTANCE.getStep_Grafcet();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.ConnectionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__GRAFCET = eINSTANCE.getConnection_Grafcet();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.TransitionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Out Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT_CONNECTIONS = eINSTANCE.getTransition_OutConnections();

		/**
		 * The meta object literal for the '<em><b>In Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__IN_STEPS = eINSTANCE.getTransition_InSteps();

		/**
		 * The meta object literal for the '<em><b>Out Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT_STEPS = eINSTANCE.getTransition_OutSteps();

		/**
		 * The meta object literal for the '<em><b>Parse Receptivity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___PARSE_RECEPTIVITY = eINSTANCE.getTransition__ParseReceptivity();

		/**
		 * The meta object literal for the '<em><b>In Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__IN_CONNECTIONS = eINSTANCE.getTransition_InConnections();

		/**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_CONDITION = eINSTANCE.getTransition_TransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Receptivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__RECEPTIVITY = eINSTANCE.getTransition_Receptivity();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GRAFCET = eINSTANCE.getTransition_Grafcet();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.StepToTransitionImpl <em>Step To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.StepToTransitionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStepToTransition()
		 * @generated
		 */
		EClass STEP_TO_TRANSITION = eINSTANCE.getStepToTransition();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.TransitionToStepImpl <em>Transition To Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.TransitionToStepImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTransitionToStep()
		 * @generated
		 */
		EClass TRANSITION_TO_STEP = eINSTANCE.getTransitionToStep();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.ActionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_VARIABLE = eINSTANCE.getAction_ActionVariable();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STEP = eINSTANCE.getAction_Step();

		/**
		 * The meta object literal for the '<em><b>Parse Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PARSE_EXPRESSION = eINSTANCE.getAction__ParseExpression();

		/**
		 * The meta object literal for the '<em><b>Create Action Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CREATE_ACTION_VARIABLE = eINSTANCE.getAction__CreateActionVariable();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl <em>Level Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLevelAction()
		 * @generated
		 */
		EClass LEVEL_ACTION = eINSTANCE.getLevelAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_ACTION__CONDITION = eINSTANCE.getLevelAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Expression Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_ACTION__EXPRESSION_CONDITION = eINSTANCE.getLevelAction_ExpressionCondition();

		/**
		 * The meta object literal for the '<em><b>Eval Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEVEL_ACTION___EVAL_CONDITION = eINSTANCE.getLevelAction__EvalCondition();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl <em>Stored Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStoredAction()
		 * @generated
		 */
		EClass STORED_ACTION = eINSTANCE.getStoredAction();

		/**
		 * The meta object literal for the '<em><b>Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_ACTION__MOMENT = eINSTANCE.getStoredAction_Moment();

		/**
		 * The meta object literal for the '<em><b>Expression To Evaluate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_ACTION__EXPRESSION_TO_EVALUATE = eINSTANCE.getStoredAction_ExpressionToEvaluate();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_ACTION__FUNCTION = eINSTANCE.getStoredAction_Function();

		/**
		 * The meta object literal for the '<em><b>Stored Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_ACTION__STORED_EXPRESSION = eINSTANCE.getStoredAction_StoredExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_ACTION__TYPE = eINSTANCE.getStoredAction_Type();

		/**
		 * The meta object literal for the '<em><b>Eval Stored Expr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORED_ACTION___EVAL_STORED_EXPR = eINSTANCE.getStoredAction__EvalStoredExpr();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Duration Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__DURATION_MILLIS = eINSTANCE.getBooleanVariable_DurationMillis();

		/**
		 * The meta object literal for the '<em><b>Value Old</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__VALUE_OLD = eINSTANCE.getBooleanVariable_ValueOld();

		/**
		 * The meta object literal for the '<em><b>Value New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__VALUE_NEW = eINSTANCE.getBooleanVariable_ValueNew();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.VariableImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__GRAFCET = eINSTANCE.getVariable_Grafcet();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.NumericVariableImpl <em>Numeric Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.NumericVariableImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getNumericVariable()
		 * @generated
		 */
		EClass NUMERIC_VARIABLE = eINSTANCE.getNumericVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_VARIABLE__VALUE = eINSTANCE.getNumericVariable_Value();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.ExpressionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Sub Expr1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SUB_EXPR1 = eINSTANCE.getExpression_SubExpr1();

		/**
		 * The meta object literal for the '<em><b>Sub Expr2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SUB_EXPR2 = eINSTANCE.getExpression_SubExpr2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Is Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__IS_SIMPLE = eINSTANCE.getExpression_IsSimple();

		/**
		 * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BOOL_VALUE = eINSTANCE.getExpression_BoolValue();

		/**
		 * The meta object literal for the '<em><b>Arithm Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__ARITHM_VALUE = eINSTANCE.getExpression_ArithmValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__VARIABLE = eINSTANCE.getExpression_Variable();

		/**
		 * The meta object literal for the '<em><b>Is Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__IS_CONSTANT = eINSTANCE.getExpression_IsConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___EVAL = eINSTANCE.getExpression__Eval();

		/**
		 * The meta object literal for the '<em><b>Eval Old</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___EVAL_OLD = eINSTANCE.getExpression__EvalOld();

		/**
		 * The meta object literal for the '<em><b>Get CExpr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_CEXPR = eINSTANCE.getExpression__GetCExpr();

		/**
		 * The meta object literal for the '<em><b>Get Old CExpr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_OLD_CEXPR = eINSTANCE.getExpression__GetOldCExpr();

		/**
		 * The meta object literal for the '<em><b>Get Name2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_NAME2 = eINSTANCE.getExpression__GetName2();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.OperatorImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl <em>Timing Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimingOperator()
		 * @generated
		 */
		EClass TIMING_OPERATOR = eINSTANCE.getTimingOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_OPERATOR__TYPE = eINSTANCE.getTimingOperator_Type();

		/**
		 * The meta object literal for the '<em><b>Duration1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_OPERATOR__DURATION1 = eINSTANCE.getTimingOperator_Duration1();

		/**
		 * The meta object literal for the '<em><b>Duration2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_OPERATOR__DURATION2 = eINSTANCE.getTimingOperator_Duration2();

		/**
		 * The meta object literal for the '<em><b>Unit1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_OPERATOR__UNIT1 = eINSTANCE.getTimingOperator_Unit1();

		/**
		 * The meta object literal for the '<em><b>Unit2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_OPERATOR__UNIT2 = eINSTANCE.getTimingOperator_Unit2();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.AritmeticOperatorImpl <em>Aritmetic Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.AritmeticOperatorImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getAritmeticOperator()
		 * @generated
		 */
		EClass ARITMETIC_OPERATOR = eINSTANCE.getAritmeticOperator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITMETIC_OPERATOR__NAME = eINSTANCE.getAritmeticOperator_Name();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.LogicalOperatorImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OPERATOR__NAME = eINSTANCE.getLogicalOperator_Name();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.impl.FunctionImpl
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.LogicOpValues <em>Logic Op Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.LogicOpValues
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getLogicOpValues()
		 * @generated
		 */
		EEnum LOGIC_OP_VALUES = eINSTANCE.getLogicOpValues();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.TimingType <em>Timing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.TimingType
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimingType()
		 * @generated
		 */
		EEnum TIMING_TYPE = eINSTANCE.getTimingType();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.VarType <em>Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.VarType
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getVarType()
		 * @generated
		 */
		EEnum VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.StoredMoment <em>Stored Moment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.StoredMoment
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getStoredMoment()
		 * @generated
		 */
		EEnum STORED_MOMENT = eINSTANCE.getStoredMoment();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.ExprType <em>Expr Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.ExprType
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getExprType()
		 * @generated
		 */
		EEnum EXPR_TYPE = eINSTANCE.getExprType();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.ArithmOpValues <em>Arithm Op Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.ArithmOpValues
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getArithmOpValues()
		 * @generated
		 */
		EEnum ARITHM_OP_VALUES = eINSTANCE.getArithmOpValues();

		/**
		 * The meta object literal for the '{@link grafcetmodeling.model.grafcetModeling.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
		 * @see grafcetmodeling.model.grafcetModeling.impl.GrafcetModelingPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

	}

} //GrafcetModelingPackage
