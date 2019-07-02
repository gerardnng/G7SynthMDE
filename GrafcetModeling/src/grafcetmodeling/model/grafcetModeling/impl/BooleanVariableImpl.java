/**
 */
package grafcetmodeling.model.grafcetModeling.impl;

import grafcetmodeling.model.grafcetModeling.BooleanVariable;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl#getDurationMillis <em>Duration Millis</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl#isValueOld <em>Value Old</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.impl.BooleanVariableImpl#isValueNew <em>Value New</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanVariableImpl extends VariableImpl implements BooleanVariable {
	/**
	 * The default value of the '{@link #getDurationMillis() <em>Duration Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMillis()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_MILLIS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationMillis() <em>Duration Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMillis()
	 * @generated
	 * @ordered
	 */
	protected int durationMillis = DURATION_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #isValueOld() <em>Value Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueOld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_OLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValueOld() <em>Value Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueOld()
	 * @generated
	 * @ordered
	 */
	protected boolean valueOld = VALUE_OLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isValueNew() <em>Value New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueNew()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_NEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValueNew() <em>Value New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueNew()
	 * @generated
	 * @ordered
	 */
	protected boolean valueNew = VALUE_NEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetModelingPackage.Literals.BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationMillis() {
		return durationMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMillis(int newDurationMillis) {
		int oldDurationMillis = durationMillis;
		durationMillis = newDurationMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.BOOLEAN_VARIABLE__DURATION_MILLIS, oldDurationMillis, durationMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValueOld() {
		return valueOld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOld(boolean newValueOld) {
		boolean oldValueOld = valueOld;
		valueOld = newValueOld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_OLD, oldValueOld, valueOld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValueNew() {
		return valueNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueNew(boolean newValueNew) {
		boolean oldValueNew = valueNew;
		valueNew = newValueNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_NEW, oldValueNew, valueNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__DURATION_MILLIS:
				return getDurationMillis();
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_OLD:
				return isValueOld();
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_NEW:
				return isValueNew();
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
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__DURATION_MILLIS:
				setDurationMillis((Integer)newValue);
				return;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_OLD:
				setValueOld((Boolean)newValue);
				return;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_NEW:
				setValueNew((Boolean)newValue);
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
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__DURATION_MILLIS:
				setDurationMillis(DURATION_MILLIS_EDEFAULT);
				return;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_OLD:
				setValueOld(VALUE_OLD_EDEFAULT);
				return;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_NEW:
				setValueNew(VALUE_NEW_EDEFAULT);
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
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__DURATION_MILLIS:
				return durationMillis != DURATION_MILLIS_EDEFAULT;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_OLD:
				return valueOld != VALUE_OLD_EDEFAULT;
			case GrafcetModelingPackage.BOOLEAN_VARIABLE__VALUE_NEW:
				return valueNew != VALUE_NEW_EDEFAULT;
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
		result.append(" (durationMillis: "); //$NON-NLS-1$
		result.append(durationMillis);
		result.append(", valueOld: "); //$NON-NLS-1$
		result.append(valueOld);
		result.append(", valueNew: "); //$NON-NLS-1$
		result.append(valueNew);
		result.append(')');
		return result.toString();
	}

} //BooleanVariableImpl
