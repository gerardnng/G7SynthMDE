/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.StoredAction#getMoment <em>Moment</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.StoredAction#getExpressionToEvaluate <em>Expression To Evaluate</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.StoredAction#getFunction <em>Function</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.StoredAction#getStoredExpression <em>Stored Expression</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.StoredAction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction()
 * @model
 * @generated
 */
public interface StoredAction extends Action {
	/**
	 * Returns the value of the '<em><b>Moment</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.StoredMoment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.StoredMoment
	 * @see #setMoment(StoredMoment)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction_Moment()
	 * @model
	 * @generated
	 */
	StoredMoment getMoment();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getMoment <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.StoredMoment
	 * @see #getMoment()
	 * @generated
	 */
	void setMoment(StoredMoment value);

	/**
	 * Returns the value of the '<em><b>Expression To Evaluate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression To Evaluate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression To Evaluate</em>' containment reference.
	 * @see #setExpressionToEvaluate(Expression)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction_ExpressionToEvaluate()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Expression getExpressionToEvaluate();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getExpressionToEvaluate <em>Expression To Evaluate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression To Evaluate</em>' containment reference.
	 * @see #getExpressionToEvaluate()
	 * @generated
	 */
	void setExpressionToEvaluate(Expression value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Stored Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Expression</em>' attribute.
	 * @see #setStoredExpression(String)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction_StoredExpression()
	 * @model
	 * @generated
	 */
	String getStoredExpression();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getStoredExpression <em>Stored Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored Expression</em>' attribute.
	 * @see #getStoredExpression()
	 * @generated
	 */
	void setStoredExpression(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.ExprType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @see #setType(ExprType)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredAction_Type()
	 * @model
	 * @generated
	 */
	ExprType getType();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.StoredAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExprType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evalStoredExpr();

} // StoredAction
