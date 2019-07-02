/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Pin#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Pin#getNature <em>Nature</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Pin#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Pin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPin_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Pin#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.PinNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.PinNature
	 * @see #setNature(PinNature)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getPin_Nature()
	 * @model
	 * @generated
	 */
	PinNature getNature();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Pin#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.PinNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(PinNature value);

} // Pin
