/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.NumericVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getNumericVariable()
 * @model
 * @generated
 */
public interface NumericVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getNumericVariable_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.NumericVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NumericVariable
