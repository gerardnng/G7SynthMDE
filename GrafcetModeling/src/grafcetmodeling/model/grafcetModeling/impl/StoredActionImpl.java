/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.Expression;
import grafcetmodeling.model.grafcetModeling.Function;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.StoredAction;
import grafcetmodeling.model.grafcetModeling.StoredMoment;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import expressionsBuilder.GrafcetExpressionParser;
import grafcetmodeling.model.grafcetModeling.ExprType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stored Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl#getMoment <em>Moment</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl#getExpressionToEvaluate <em>Expression To Evaluate</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl#getStoredExpression <em>Stored Expression</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.StoredActionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoredActionImpl extends ActionImpl implements StoredAction {
	/**
	 * The default value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected static final StoredMoment MOMENT_EDEFAULT = StoredMoment.ACTIVATION;

	/**
	 * The cached value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected StoredMoment moment = MOMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionToEvaluate() <em>Expression To Evaluate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionToEvaluate()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionToEvaluate;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The default value of the '{@link #getStoredExpression() <em>Stored Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String STORED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoredExpression() <em>Stored Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredExpression()
	 * @generated
	 * @ordered
	 */
	protected String storedExpression = STORED_EXPRESSION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoredActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.STORED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredMoment getMoment() {
		return moment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoment(StoredMoment newMoment) {
		StoredMoment oldMoment = moment;
		moment = newMoment == null ? MOMENT_EDEFAULT : newMoment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__MOMENT, oldMoment, moment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionToEvaluate() {
		return expressionToEvaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionToEvaluate(Expression newExpressionToEvaluate, NotificationChain msgs) {
		Expression oldExpressionToEvaluate = expressionToEvaluate;
		expressionToEvaluate = newExpressionToEvaluate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE, oldExpressionToEvaluate, newExpressionToEvaluate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionToEvaluate(Expression newExpressionToEvaluate) {
		if (newExpressionToEvaluate != expressionToEvaluate) {
			NotificationChain msgs = null;
			if (expressionToEvaluate != null)
				msgs = ((InternalEObject)expressionToEvaluate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE, null, msgs);
			if (newExpressionToEvaluate != null)
				msgs = ((InternalEObject)newExpressionToEvaluate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE, null, msgs);
			msgs = basicSetExpressionToEvaluate(newExpressionToEvaluate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE, newExpressionToEvaluate, newExpressionToEvaluate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.STORED_ACTION__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetModelingPackage.STORED_ACTION__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoredExpression() {
		return storedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStoredExpression(String newStoredExpression) {
		String oldStoredExpression = storedExpression;
		storedExpression = newStoredExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__STORED_EXPRESSION, oldStoredExpression, storedExpression));	
		
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.STORED_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evalStoredExpr() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override 
	public void parseExpression(){
		if(this.getFunction()==null) {
			if(storedExpression.isEmpty()|| storedExpression == null) {
				if(this.type == ExprType.LOGICAL)
					storedExpression = "false";
				else	//the type is arithmetic
					storedExpression = "0";
			}
			Expression tc = GrafcetExpressionParser.parseBuildExprTree(storedExpression, this.getStep().getGrafcet());
			System.out.println(storedExpression + "\t--->\t" + GrafcetExpressionParser.parseAndStringExpr(storedExpression));
			this.setExpressionToEvaluate(tc);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE:
				return basicSetExpressionToEvaluate(null, msgs);
			case GrafcetModelingPackage.STORED_ACTION__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case GrafcetModelingPackage.STORED_ACTION__MOMENT:
				return getMoment();
			case GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE:
				return getExpressionToEvaluate();
			case GrafcetModelingPackage.STORED_ACTION__FUNCTION:
				return getFunction();
			case GrafcetModelingPackage.STORED_ACTION__STORED_EXPRESSION:
				return getStoredExpression();
			case GrafcetModelingPackage.STORED_ACTION__TYPE:
				return getType();
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
			case GrafcetModelingPackage.STORED_ACTION__MOMENT:
				setMoment((StoredMoment)newValue);
				return;
			case GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE:
				setExpressionToEvaluate((Expression)newValue);
				return;
			case GrafcetModelingPackage.STORED_ACTION__FUNCTION:
				setFunction((Function)newValue);
				return;
			case GrafcetModelingPackage.STORED_ACTION__STORED_EXPRESSION:
				setStoredExpression((String)newValue);
				return;
			case GrafcetModelingPackage.STORED_ACTION__TYPE:
				setType((ExprType)newValue);
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
			case GrafcetModelingPackage.STORED_ACTION__MOMENT:
				setMoment(MOMENT_EDEFAULT);
				return;
			case GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE:
				setExpressionToEvaluate((Expression)null);
				return;
			case GrafcetModelingPackage.STORED_ACTION__FUNCTION:
				setFunction((Function)null);
				return;
			case GrafcetModelingPackage.STORED_ACTION__STORED_EXPRESSION:
				setStoredExpression(STORED_EXPRESSION_EDEFAULT);
				return;
			case GrafcetModelingPackage.STORED_ACTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GrafcetModelingPackage.STORED_ACTION__MOMENT:
				return moment != MOMENT_EDEFAULT;
			case GrafcetModelingPackage.STORED_ACTION__EXPRESSION_TO_EVALUATE:
				return expressionToEvaluate != null;
			case GrafcetModelingPackage.STORED_ACTION__FUNCTION:
				return function != null;
			case GrafcetModelingPackage.STORED_ACTION__STORED_EXPRESSION:
				return STORED_EXPRESSION_EDEFAULT == null ? storedExpression != null : !STORED_EXPRESSION_EDEFAULT.equals(storedExpression);
			case GrafcetModelingPackage.STORED_ACTION__TYPE:
				return type != TYPE_EDEFAULT;
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
			case GrafcetModelingPackage.STORED_ACTION___EVAL_STORED_EXPR:
				evalStoredExpr();
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
		result.append(" (moment: "); //$NON-NLS-1$
		result.append(moment);
		result.append(", storedExpression: "); //$NON-NLS-1$
		result.append(storedExpression);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StoredActionImpl
