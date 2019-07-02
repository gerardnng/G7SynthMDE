/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Processor#getUnit <em>Unit</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Processor#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getProcessor_Speed()
	 * @model required="true"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Processor#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.SpeedUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.SpeedUnit
	 * @see #setUnit(SpeedUnit)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getProcessor_Unit()
	 * @model
	 * @generated
	 */
	SpeedUnit getUnit();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Processor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.SpeedUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(SpeedUnit value);

} // Processor
