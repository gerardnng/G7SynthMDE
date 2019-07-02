/**
 */
package micromodeling.model.MicrocontrollerModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.PinOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPinOperation()
 * @model
 * @generated
 */
public interface PinOperation extends Function {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.OperationName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.OperationName
	 * @see #setName(OperationName)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPinOperation_Name()
	 * @model
	 * @generated
	 */
	OperationName getName();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.PinOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.OperationName
	 * @see #getName()
	 * @generated
	 */
	void setName(OperationName value);

} // PinOperation
