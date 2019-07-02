/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Memory#getUnit <em>Unit</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Memory#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMemory()
 * @model abstract="true"
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMemory_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Memory#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.MemoryUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.MemoryUnit
	 * @see #setUnit(MemoryUnit)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMemory_Unit()
	 * @model
	 * @generated
	 */
	MemoryUnit getUnit();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Memory#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.MemoryUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MemoryUnit value);

} // Memory
