/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Action;
import grafcetmodeling.model.grafcetModeling.BooleanVariable;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.Step;
import grafcetmodeling.model.grafcetModeling.StepToTransition;
import grafcetmodeling.model.grafcetModeling.Transition;
import grafcetmodeling.model.grafcetModeling.TransitionToStep;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getGrafcet <em>Grafcet</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getInConnections <em>In Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getOutConnections <em>Out Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getInTransitions <em>In Transitions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StepImpl#getOutTransitions <em>Out Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends G7ElementImpl implements Step {
	/**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;
	
	private static String x_var="X";

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInConnections() <em>In Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionToStep> inConnections;

	/**
	 * The cached value of the '{@link #getOutConnections() <em>Out Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<StepToTransition> outConnections;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable variable;

	/**
	 * The cached setting delegate for the '{@link #getInTransitions() <em>In Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IN_TRANSITIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GrafcetModelingPackage.Literals.STEP__IN_TRANSITIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOutTransitions() <em>Out Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTransitions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUT_TRANSITIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GrafcetModelingPackage.Literals.STEP__OUT_TRANSITIONS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Override
	 * @generated NOT
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.G7_ELEMENT__NAME, oldName, name));
		
		//Just reference an existing variable, so this variable is added since Grafcet instance
		//It failed
		/*
		this.setVariable(this.generateStepVariables());
		*/
		/*
		if(this.variable==null) {
			//Construction of the variable associated
			String varName = x_var+name;
			System.out.println("Creation of a Step variable : " + varName);
			BooleanVariable var = this.getGrafcet().createAndGetBooleanVariable(varName);
			this.variable = var;
		}*/
		/*
		if(this.variable==null) {
			//Construction of the variable associated
			System.out.println("Creation of a Step variable : " + x_var+this.name);
			BooleanVariable var = GrafcetModelingFactory.eINSTANCE.createBooleanVariable();
			this.getGrafcet().getVariables().add(var);
			this.variable = var;
		}
		this.variable.setName(x_var+this.name);
		this.variable.setType(VarType.INTERNAL);
		*/
	}
	/*
	@Override 
	public BooleanVariable generateStepBooleanVariable() {
		//Construction of the variable associated
		String varName = x_var+name;
		BooleanVariable var = this.getGrafcet().createAndGetBooleanVariable(varName);
		if(var!=null) {
			var.setType(VarType.INTERNAL);
		}
		return var; 
	}
	*/
	@Override 
	public String proposedStepVarName() {
		return x_var+name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(".... Deleting a Step. Name: <" + this.name + ">");
		super.finalize();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionToStep> getInConnections() {
		if (inConnections == null) {
			inConnections = new EObjectResolvingEList<TransitionToStep>(TransitionToStep.class, this, GrafcetModelingPackage.STEP__IN_CONNECTIONS);
		}
		return inConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepToTransition> getOutConnections() {
		if (outConnections == null) {
			outConnections = new EObjectResolvingEList<StepToTransition>(StepToTransition.class, this, GrafcetModelingPackage.STEP__OUT_CONNECTIONS);
		}
		return outConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, GrafcetModelingPackage.STEP__ACTIONS, GrafcetModelingPackage.ACTION__STEP);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (BooleanVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetModelingPackage.STEP__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(BooleanVariable newVariable) {
		BooleanVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STEP__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getInTransitions() {
		return (EList<Transition>)IN_TRANSITIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getOutTransitions() {
		return (EList<Transition>)OUT_TRANSITIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createStepActivityVar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GrafcetModelingPackage.STEP__GRAFCET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGrafcet((Grafcet)otherEnd, msgs);
			case GrafcetModelingPackage.STEP__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STEP__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STEP__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet getGrafcet() {
		if (eContainerFeatureID() != GrafcetModelingPackage.STEP__GRAFCET) return null;
		return (Grafcet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcet(Grafcet newGrafcet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGrafcet, GrafcetModelingPackage.STEP__GRAFCET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrafcet(Grafcet newGrafcet) {
		if (newGrafcet != eInternalContainer() || (eContainerFeatureID() != GrafcetModelingPackage.STEP__GRAFCET && newGrafcet != null)) {
			if (EcoreUtil.isAncestor(this, newGrafcet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGrafcet != null)
				msgs = ((InternalEObject)newGrafcet).eInverseAdd(this, GrafcetModelingPackage.GRAFCET__STEPS, Grafcet.class, msgs);
			msgs = basicSetGrafcet(newGrafcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STEP__GRAFCET, newGrafcet, newGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.STEP__GRAFCET:
				return basicSetGrafcet(null, msgs);
			case GrafcetModelingPackage.STEP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GrafcetModelingPackage.STEP__GRAFCET:
				return eInternalContainer().eInverseRemove(this, GrafcetModelingPackage.GRAFCET__STEPS, Grafcet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetModelingPackage.STEP__IS_INITIAL:
				return isIsInitial();
			case GrafcetModelingPackage.STEP__IS_ACTIVE:
				return isIsActive();
			case GrafcetModelingPackage.STEP__GRAFCET:
				return getGrafcet();
			case GrafcetModelingPackage.STEP__IN_CONNECTIONS:
				return getInConnections();
			case GrafcetModelingPackage.STEP__OUT_CONNECTIONS:
				return getOutConnections();
			case GrafcetModelingPackage.STEP__ACTIONS:
				return getActions();
			case GrafcetModelingPackage.STEP__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case GrafcetModelingPackage.STEP__IN_TRANSITIONS:
				return getInTransitions();
			case GrafcetModelingPackage.STEP__OUT_TRANSITIONS:
				return getOutTransitions();
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
			case GrafcetModelingPackage.STEP__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case GrafcetModelingPackage.STEP__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case GrafcetModelingPackage.STEP__GRAFCET:
				setGrafcet((Grafcet)newValue);
				return;
			case GrafcetModelingPackage.STEP__IN_CONNECTIONS:
				getInConnections().clear();
				getInConnections().addAll((Collection<? extends TransitionToStep>)newValue);
				return;
			case GrafcetModelingPackage.STEP__OUT_CONNECTIONS:
				getOutConnections().clear();
				getOutConnections().addAll((Collection<? extends StepToTransition>)newValue);
				return;
			case GrafcetModelingPackage.STEP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case GrafcetModelingPackage.STEP__VARIABLE:
				setVariable((BooleanVariable)newValue);
				return;
			case GrafcetModelingPackage.STEP__IN_TRANSITIONS:
				getInTransitions().clear();
				getInTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case GrafcetModelingPackage.STEP__OUT_TRANSITIONS:
				getOutTransitions().clear();
				getOutTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case GrafcetModelingPackage.STEP__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case GrafcetModelingPackage.STEP__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case GrafcetModelingPackage.STEP__GRAFCET:
				setGrafcet((Grafcet)null);
				return;
			case GrafcetModelingPackage.STEP__IN_CONNECTIONS:
				getInConnections().clear();
				return;
			case GrafcetModelingPackage.STEP__OUT_CONNECTIONS:
				getOutConnections().clear();
				return;
			case GrafcetModelingPackage.STEP__ACTIONS:
				getActions().clear();
				return;
			case GrafcetModelingPackage.STEP__VARIABLE:
				setVariable((BooleanVariable)null);
				return;
			case GrafcetModelingPackage.STEP__IN_TRANSITIONS:
				getInTransitions().clear();
				return;
			case GrafcetModelingPackage.STEP__OUT_TRANSITIONS:
				getOutTransitions().clear();
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
			case GrafcetModelingPackage.STEP__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case GrafcetModelingPackage.STEP__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case GrafcetModelingPackage.STEP__GRAFCET:
				return getGrafcet() != null;
			case GrafcetModelingPackage.STEP__IN_CONNECTIONS:
				return inConnections != null && !inConnections.isEmpty();
			case GrafcetModelingPackage.STEP__OUT_CONNECTIONS:
				return outConnections != null && !outConnections.isEmpty();
			case GrafcetModelingPackage.STEP__ACTIONS:
				return actions != null && !actions.isEmpty();
			case GrafcetModelingPackage.STEP__VARIABLE:
				return variable != null;
			case GrafcetModelingPackage.STEP__IN_TRANSITIONS:
				return IN_TRANSITIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GrafcetModelingPackage.STEP__OUT_TRANSITIONS:
				return OUT_TRANSITIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case GrafcetModelingPackage.STEP___CREATE_STEP_ACTIVITY_VAR:
				createStepActivityVar();
				return null;
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
		result.append(" (isInitial: "); //$NON-NLS-1$
		result.append(isInitial);
		result.append(", isActive: "); //$NON-NLS-1$
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //StepImpl
