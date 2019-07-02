/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Grafcet;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.Step;
import grafcetmodeling.model.grafcetModeling.StepToTransition;
import grafcetmodeling.model.grafcetModeling.Transition;
import grafcetmodeling.model.grafcetModeling.TransitionToStep;

import expressionsBuilder.GrafcetExpressionParser;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getReceptivity <em>Receptivity</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getGrafcet <em>Grafcet</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getInConnections <em>In Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getOutConnections <em>Out Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getInSteps <em>In Steps</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TransitionImpl#getOutSteps <em>Out Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends G7ElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTransitionCondition() <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression transitionCondition;

	/**
	 * The default value of the '{@link #getReceptivity() <em>Receptivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptivity()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEPTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceptivity() <em>Receptivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptivity()
	 * @generated
	 * @ordered
	 */
	protected String receptivity = RECEPTIVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInConnections() <em>In Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<StepToTransition> inConnections;

	/**
	 * The cached value of the '{@link #getOutConnections() <em>Out Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionToStep> outConnections;

	/**
	 * The cached setting delegate for the '{@link #getInSteps() <em>In Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSteps()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IN_STEPS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GrafcetModelingPackage.Literals.TRANSITION__IN_STEPS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOutSteps() <em>Out Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutSteps()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUT_STEPS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GrafcetModelingPackage.Literals.TRANSITION__OUT_STEPS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getTransitionCondition() {
		if(transitionCondition==null) {
			//Build the corresponding transition Condition
			this.parseReceptivity();
		}
		return transitionCondition;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionToStep> getOutConnections() {
		if (outConnections == null) {
			outConnections = new EObjectResolvingEList<TransitionToStep>(TransitionToStep.class, this, GrafcetModelingPackage.TRANSITION__OUT_CONNECTIONS);
		}
		return outConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Step> getInSteps() {
		return (EList<Step>)IN_STEPS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Step> getOutSteps() {
		return (EList<Step>)OUT_STEPS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void parseReceptivity() {
		Expression tc = GrafcetExpressionParser.parseBuildExprTree(receptivity, this.getGrafcet());
		//System.out.println(receptivity + "\t--->\t" + GrafcetExpressionParser.parseAndStringExpr(receptivity));
		this.setTransitionCondition(tc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGrafcet((Grafcet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepToTransition> getInConnections() {
		if (inConnections == null) {
			inConnections = new EObjectResolvingEList<StepToTransition>(StepToTransition.class, this, GrafcetModelingPackage.TRANSITION__IN_CONNECTIONS);
		}
		return inConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionCondition(Expression newTransitionCondition, NotificationChain msgs) {
		Expression oldTransitionCondition = transitionCondition;
		transitionCondition = newTransitionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION, oldTransitionCondition, newTransitionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionCondition(Expression newTransitionCondition) {
		if (newTransitionCondition != transitionCondition) {
			NotificationChain msgs = null;
			if (transitionCondition != null)
				msgs = ((InternalEObject)transitionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION, null, msgs);
			if (newTransitionCondition != null)
				msgs = ((InternalEObject)newTransitionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION, null, msgs);
			msgs = basicSetTransitionCondition(newTransitionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION, newTransitionCondition, newTransitionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceptivity() {
		return receptivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setReceptivity(String newReceptivity) {
		//Debug
		System.out.println("In setReceptivity with : " + newReceptivity);
		
		String oldReceptivity = receptivity;
		receptivity = newReceptivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TRANSITION__RECEPTIVITY, oldReceptivity, receptivity));
		
		//Build the corresponding transition Condition
		if(!(newReceptivity.isEmpty()|| newReceptivity == null)) {
			this.parseReceptivity();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet getGrafcet() {
		if (eContainerFeatureID() != GrafcetModelingPackage.TRANSITION__GRAFCET) return null;
		return (Grafcet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcet(Grafcet newGrafcet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGrafcet, GrafcetModelingPackage.TRANSITION__GRAFCET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrafcet(Grafcet newGrafcet) {
		if (newGrafcet != eInternalContainer() || (eContainerFeatureID() != GrafcetModelingPackage.TRANSITION__GRAFCET && newGrafcet != null)) {
			if (EcoreUtil.isAncestor(this, newGrafcet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGrafcet != null)
				msgs = ((InternalEObject)newGrafcet).eInverseAdd(this, GrafcetModelingPackage.GRAFCET__TRANSITIONS, Grafcet.class, msgs);
			msgs = basicSetGrafcet(newGrafcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TRANSITION__GRAFCET, newGrafcet, newGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION:
				return basicSetTransitionCondition(null, msgs);
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				return basicSetGrafcet(null, msgs);
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
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				return eInternalContainer().eInverseRemove(this, GrafcetModelingPackage.GRAFCET__TRANSITIONS, Grafcet.class, msgs);
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
			case GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION:
				return getTransitionCondition();
			case GrafcetModelingPackage.TRANSITION__RECEPTIVITY:
				return getReceptivity();
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				return getGrafcet();
			case GrafcetModelingPackage.TRANSITION__IN_CONNECTIONS:
				return getInConnections();
			case GrafcetModelingPackage.TRANSITION__OUT_CONNECTIONS:
				return getOutConnections();
			case GrafcetModelingPackage.TRANSITION__IN_STEPS:
				return getInSteps();
			case GrafcetModelingPackage.TRANSITION__OUT_STEPS:
				return getOutSteps();
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
			case GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION:
				setTransitionCondition((Expression)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__RECEPTIVITY:
				setReceptivity((String)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				setGrafcet((Grafcet)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__IN_CONNECTIONS:
				getInConnections().clear();
				getInConnections().addAll((Collection<? extends StepToTransition>)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__OUT_CONNECTIONS:
				getOutConnections().clear();
				getOutConnections().addAll((Collection<? extends TransitionToStep>)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__IN_STEPS:
				getInSteps().clear();
				getInSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case GrafcetModelingPackage.TRANSITION__OUT_STEPS:
				getOutSteps().clear();
				getOutSteps().addAll((Collection<? extends Step>)newValue);
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
			case GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION:
				setTransitionCondition((Expression)null);
				return;
			case GrafcetModelingPackage.TRANSITION__RECEPTIVITY:
				setReceptivity(RECEPTIVITY_EDEFAULT);
				return;
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				setGrafcet((Grafcet)null);
				return;
			case GrafcetModelingPackage.TRANSITION__IN_CONNECTIONS:
				getInConnections().clear();
				return;
			case GrafcetModelingPackage.TRANSITION__OUT_CONNECTIONS:
				getOutConnections().clear();
				return;
			case GrafcetModelingPackage.TRANSITION__IN_STEPS:
				getInSteps().clear();
				return;
			case GrafcetModelingPackage.TRANSITION__OUT_STEPS:
				getOutSteps().clear();
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
			case GrafcetModelingPackage.TRANSITION__TRANSITION_CONDITION:
				return transitionCondition != null;
			case GrafcetModelingPackage.TRANSITION__RECEPTIVITY:
				return RECEPTIVITY_EDEFAULT == null ? receptivity != null : !RECEPTIVITY_EDEFAULT.equals(receptivity);
			case GrafcetModelingPackage.TRANSITION__GRAFCET:
				return getGrafcet() != null;
			case GrafcetModelingPackage.TRANSITION__IN_CONNECTIONS:
				return inConnections != null && !inConnections.isEmpty();
			case GrafcetModelingPackage.TRANSITION__OUT_CONNECTIONS:
				return outConnections != null && !outConnections.isEmpty();
			case GrafcetModelingPackage.TRANSITION__IN_STEPS:
				return IN_STEPS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GrafcetModelingPackage.TRANSITION__OUT_STEPS:
				return OUT_STEPS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case GrafcetModelingPackage.TRANSITION___PARSE_RECEPTIVITY:
				parseReceptivity();
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
		result.append(" (receptivity: "); //$NON-NLS-1$
		result.append(receptivity);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
