/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Action;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;

import grafcetmodeling.model.grafcetModeling.Step;
import grafcetmodeling.model.grafcetModeling.Variable;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ActionImpl#getActionVariable <em>Action Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.ActionImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends G7ElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getActionVariable() <em>Action Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable actionVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getActionVariable() {
		if (actionVariable != null && actionVariable.eIsProxy()) {
			InternalEObject oldActionVariable = (InternalEObject)actionVariable;
			actionVariable = (Variable)eResolveProxy(oldActionVariable);
			if (actionVariable != oldActionVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetModelingPackage.ACTION__ACTION_VARIABLE, oldActionVariable, actionVariable));
			}
		}
		return actionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetActionVariable() {
		return actionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionVariable(Variable newActionVariable) {
		Variable oldActionVariable = actionVariable;
		actionVariable = newActionVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.ACTION__ACTION_VARIABLE, oldActionVariable, actionVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		if (eContainerFeatureID() != GrafcetModelingPackage.ACTION__STEP) return null;
		return (Step)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStep, GrafcetModelingPackage.ACTION__STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		if (newStep != eInternalContainer() || (eContainerFeatureID() != GrafcetModelingPackage.ACTION__STEP && newStep != null)) {
			if (EcoreUtil.isAncestor(this, newStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, GrafcetModelingPackage.STEP__ACTIONS, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.ACTION__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void parseExpression() {
		//done in subclasses
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createActionVariable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.ACTION__STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStep((Step)otherEnd, msgs);
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
			case GrafcetModelingPackage.ACTION__STEP:
				return basicSetStep(null, msgs);
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
			case GrafcetModelingPackage.ACTION__STEP:
				return eInternalContainer().eInverseRemove(this, GrafcetModelingPackage.STEP__ACTIONS, Step.class, msgs);
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
			case GrafcetModelingPackage.ACTION__ACTION_VARIABLE:
				if (resolve) return getActionVariable();
				return basicGetActionVariable();
			case GrafcetModelingPackage.ACTION__STEP:
				return getStep();
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
			case GrafcetModelingPackage.ACTION__ACTION_VARIABLE:
				setActionVariable((Variable)newValue);
				return;
			case GrafcetModelingPackage.ACTION__STEP:
				setStep((Step)newValue);
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
			case GrafcetModelingPackage.ACTION__ACTION_VARIABLE:
				setActionVariable((Variable)null);
				return;
			case GrafcetModelingPackage.ACTION__STEP:
				setStep((Step)null);
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
			case GrafcetModelingPackage.ACTION__ACTION_VARIABLE:
				return actionVariable != null;
			case GrafcetModelingPackage.ACTION__STEP:
				return getStep() != null;
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
			case GrafcetModelingPackage.ACTION___PARSE_EXPRESSION:
				parseExpression();
				return null;
			case GrafcetModelingPackage.ACTION___CREATE_ACTION_VARIABLE:
				createActionVariable();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
