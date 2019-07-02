/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.LevelAction;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import expressionsBuilder.GrafcetExpressionParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.LevelActionImpl#getExpressionCondition <em>Expression Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelActionImpl extends ActionImpl implements LevelAction {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionCondition() <em>Expression Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.LEVEL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.LEVEL_ACTION__CONDITION, oldCondition, condition));
		
		//Generate a tree for the corresponding action condition
		//this.parseExpression();
	}
	
	@Override 
	public void parseExpression() {
		if(condition == null) {
			condition = "true";
		}
		else if(condition.isEmpty())
			condition = "true";
		
		Expression tc = GrafcetExpressionParser.parseBuildExprTree(condition, this.getStep().getGrafcet());
		System.out.println(condition + "\t--->\t" + GrafcetExpressionParser.parseAndStringExpr(condition));
		this.setExpressionCondition(tc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpressionCondition() {
		if(expressionCondition==null) {
			parseExpression();
		}
		return expressionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionCondition(Expression newExpressionCondition, NotificationChain msgs) {
		Expression oldExpressionCondition = expressionCondition;
		expressionCondition = newExpressionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION, oldExpressionCondition, newExpressionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionCondition(Expression newExpressionCondition) {
		if (newExpressionCondition != expressionCondition) {
			NotificationChain msgs = null;
			if (expressionCondition != null)
				msgs = ((InternalEObject)expressionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION, null, msgs);
			if (newExpressionCondition != null)
				msgs = ((InternalEObject)newExpressionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION, null, msgs);
			msgs = basicSetExpressionCondition(newExpressionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION, newExpressionCondition, newExpressionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evalCondition() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION:
				return basicSetExpressionCondition(null, msgs);
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
			case GrafcetModelingPackage.LEVEL_ACTION__CONDITION:
				return getCondition();
			case GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION:
				return getExpressionCondition();
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
			case GrafcetModelingPackage.LEVEL_ACTION__CONDITION:
				setCondition((String)newValue);
				return;
			case GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION:
				setExpressionCondition((Expression)newValue);
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
			case GrafcetModelingPackage.LEVEL_ACTION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION:
				setExpressionCondition((Expression)null);
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
			case GrafcetModelingPackage.LEVEL_ACTION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case GrafcetModelingPackage.LEVEL_ACTION__EXPRESSION_CONDITION:
				return expressionCondition != null;
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
			case GrafcetModelingPackage.LEVEL_ACTION___EVAL_CONDITION:
				evalCondition();
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
		result.append(" (condition: "); //$NON-NLS-1$
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //LevelActionImpl
