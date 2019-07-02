/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#getDurationMillis <em>Duration Millis</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueOld <em>Value Old</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueNew <em>Value New</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Duration Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Millis</em>' attribute.
	 * @see #setDurationMillis(int)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getBooleanVariable_DurationMillis()
	 * @model required="true"
	 * @generated
	 */
	int getDurationMillis();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#getDurationMillis <em>Duration Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Millis</em>' attribute.
	 * @see #getDurationMillis()
	 * @generated
	 */
	void setDurationMillis(int value);

	/**
	 * Returns the value of the '<em><b>Value Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Old</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Old</em>' attribute.
	 * @see #setValueOld(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getBooleanVariable_ValueOld()
	 * @model required="true"
	 * @generated
	 */
	boolean isValueOld();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueOld <em>Value Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Old</em>' attribute.
	 * @see #isValueOld()
	 * @generated
	 */
	void setValueOld(boolean value);

	/**
	 * Returns the value of the '<em><b>Value New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value New</em>' attribute.
	 * @see #setValueNew(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getBooleanVariable_ValueNew()
	 * @model required="true"
	 * @generated
	 */
	boolean isValueNew();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.BooleanVariable#isValueNew <em>Value New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value New</em>' attribute.
	 * @see #isValueNew()
	 * @generated
	 */
	void setValueNew(boolean value);

} // BooleanVariable
