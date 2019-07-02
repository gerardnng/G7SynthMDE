/**
 */
package micromodeling.model.MicrocontrollerModeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getTimerConfig()
 * @model
 * @generated
 */
public interface TimerConfig extends Function {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.TimerOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerOp
	 * @see #setName(TimerOp)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getTimerConfig_Name()
	 * @model
	 * @generated
	 */
	TimerOp getName();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerOp
	 * @see #getName()
	 * @generated
	 */
	void setName(TimerOp value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getTimerConfig_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

} // TimerConfig
