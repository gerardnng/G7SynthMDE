/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.LogicalOperator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getLogicalOperator()
 * @model
 * @generated
 */
public interface LogicalOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.LogicOpValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.LogicOpValues
	 * @see #setName(LogicOpValues)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getLogicalOperator_Name()
	 * @model
	 * @generated
	 */
	LogicOpValues getName();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.LogicalOperator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.LogicOpValues
	 * @see #getName()
	 * @generated
	 */
	void setName(LogicOpValues value);

} // LogicalOperator
