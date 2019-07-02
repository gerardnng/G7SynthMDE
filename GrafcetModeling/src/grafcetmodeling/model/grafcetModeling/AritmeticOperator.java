/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aritmetic Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.AritmeticOperator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getAritmeticOperator()
 * @model
 * @generated
 */
public interface AritmeticOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.ArithmOpValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ArithmOpValues
	 * @see #setName(ArithmOpValues)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getAritmeticOperator_Name()
	 * @model
	 * @generated
	 */
	ArithmOpValues getName();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.AritmeticOperator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ArithmOpValues
	 * @see #getName()
	 * @generated
	 */
	void setName(ArithmOpValues value);

} // AritmeticOperator
