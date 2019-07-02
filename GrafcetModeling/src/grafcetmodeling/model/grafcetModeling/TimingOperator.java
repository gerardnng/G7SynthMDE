/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getType <em>Type</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration1 <em>Duration1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration2 <em>Duration2</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit1 <em>Unit1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit2 <em>Unit2</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator()
 * @model
 * @generated
 */
public interface TimingOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.TimingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimingType
	 * @see #setType(TimingType)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator_Type()
	 * @model
	 * @generated
	 */
	TimingType getType();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimingType
	 * @see #getType()
	 * @generated
	 */
	void setType(TimingType value);

	/**
	 * Returns the value of the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration1</em>' attribute.
	 * @see #setDuration1(int)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator_Duration1()
	 * @model required="true"
	 * @generated
	 */
	int getDuration1();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration1 <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration1</em>' attribute.
	 * @see #getDuration1()
	 * @generated
	 */
	void setDuration1(int value);

	/**
	 * Returns the value of the '<em><b>Duration2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration2</em>' attribute.
	 * @see #setDuration2(int)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator_Duration2()
	 * @model required="true"
	 * @generated
	 */
	int getDuration2();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getDuration2 <em>Duration2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration2</em>' attribute.
	 * @see #getDuration2()
	 * @generated
	 */
	void setDuration2(int value);

	/**
	 * Returns the value of the '<em><b>Unit1</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit1</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @see #setUnit1(TimeUnit)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator_Unit1()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit1();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit1 <em>Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit1</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @see #getUnit1()
	 * @generated
	 */
	void setUnit1(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Unit2</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit2</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @see #setUnit2(TimeUnit)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTimingOperator_Unit2()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit2();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.TimingOperator#getUnit2 <em>Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit2</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.TimeUnit
	 * @see #getUnit2()
	 * @generated
	 */
	void setUnit2(TimeUnit value);

} // TimingOperator
