/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import grafcetmodeling.model.grafcetModeling.TimeUnit;
import grafcetmodeling.model.grafcetModeling.TimingOperator;
import grafcetmodeling.model.grafcetModeling.TimingType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl#getDuration1 <em>Duration1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl#getDuration2 <em>Duration2</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl#getUnit1 <em>Unit1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.TimingOperatorImpl#getUnit2 <em>Unit2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingOperatorImpl extends OperatorImpl implements TimingOperator {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TimingType TYPE_EDEFAULT = TimingType.DELAYED1;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TimingType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration1() <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration1()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration1() <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration1()
	 * @generated
	 * @ordered
	 */
	protected int duration1 = DURATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration2() <em>Duration2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration2()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration2() <em>Duration2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration2()
	 * @generated
	 * @ordered
	 */
	protected int duration2 = DURATION2_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit1() <em>Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit1()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT1_EDEFAULT = TimeUnit.MS;

	/**
	 * The cached value of the '{@link #getUnit1() <em>Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit1()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit1 = UNIT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit2() <em>Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit2()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT2_EDEFAULT = TimeUnit.MS;

	/**
	 * The cached value of the '{@link #getUnit2() <em>Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit2()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit2 = UNIT2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.TIMING_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TimingType newType) {
		TimingType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TIMING_OPERATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration1() {
		return duration1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration1(int newDuration1) {
		int oldDuration1 = duration1;
		duration1 = newDuration1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TIMING_OPERATOR__DURATION1, oldDuration1, duration1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration2() {
		return duration2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration2(int newDuration2) {
		int oldDuration2 = duration2;
		duration2 = newDuration2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TIMING_OPERATOR__DURATION2, oldDuration2, duration2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit1() {
		return unit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit1(TimeUnit newUnit1) {
		TimeUnit oldUnit1 = unit1;
		unit1 = newUnit1 == null ? UNIT1_EDEFAULT : newUnit1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TIMING_OPERATOR__UNIT1, oldUnit1, unit1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit2() {
		return unit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit2(TimeUnit newUnit2) {
		TimeUnit oldUnit2 = unit2;
		unit2 = newUnit2 == null ? UNIT2_EDEFAULT : newUnit2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.TIMING_OPERATOR__UNIT2, oldUnit2, unit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetModelingPackage.TIMING_OPERATOR__TYPE:
				return getType();
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION1:
				return getDuration1();
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION2:
				return getDuration2();
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT1:
				return getUnit1();
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT2:
				return getUnit2();
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
			case GrafcetModelingPackage.TIMING_OPERATOR__TYPE:
				setType((TimingType)newValue);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION1:
				setDuration1((Integer)newValue);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION2:
				setDuration2((Integer)newValue);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT1:
				setUnit1((TimeUnit)newValue);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT2:
				setUnit2((TimeUnit)newValue);
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
			case GrafcetModelingPackage.TIMING_OPERATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION1:
				setDuration1(DURATION1_EDEFAULT);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION2:
				setDuration2(DURATION2_EDEFAULT);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT1:
				setUnit1(UNIT1_EDEFAULT);
				return;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT2:
				setUnit2(UNIT2_EDEFAULT);
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
			case GrafcetModelingPackage.TIMING_OPERATOR__TYPE:
				return type != TYPE_EDEFAULT;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION1:
				return duration1 != DURATION1_EDEFAULT;
			case GrafcetModelingPackage.TIMING_OPERATOR__DURATION2:
				return duration2 != DURATION2_EDEFAULT;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT1:
				return unit1 != UNIT1_EDEFAULT;
			case GrafcetModelingPackage.TIMING_OPERATOR__UNIT2:
				return unit2 != UNIT2_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", duration1: "); //$NON-NLS-1$
		result.append(duration1);
		result.append(", duration2: "); //$NON-NLS-1$
		result.append(duration2);
		result.append(", unit1: "); //$NON-NLS-1$
		result.append(unit1);
		result.append(", unit2: "); //$NON-NLS-1$
		result.append(unit2);
		result.append(')');
		return result.toString();
	}

} //TimingOperatorImpl
