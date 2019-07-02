/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.LevelAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.LevelAction#getExpressionCondition <em>Expression Condition</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getLevelAction()
 * @model
 * @generated
 */
public interface LevelAction extends Action {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getLevelAction_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.LevelAction#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Expression Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Condition</em>' containment reference.
	 * @see #setExpressionCondition(Expression)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getLevelAction_ExpressionCondition()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Expression getExpressionCondition();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.LevelAction#getExpressionCondition <em>Expression Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Condition</em>' containment reference.
	 * @see #getExpressionCondition()
	 * @generated
	 */
	void setExpressionCondition(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evalCondition();

} // LevelAction
