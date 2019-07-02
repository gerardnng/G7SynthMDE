/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Action#getActionVariable <em>Action Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Action#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends G7Element {
	/**
	 * Returns the value of the '<em><b>Action Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Variable</em>' reference.
	 * @see #setActionVariable(Variable)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getAction_ActionVariable()
	 * @model derived="true"
	 * @generated
	 */
	Variable getActionVariable();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Action#getActionVariable <em>Action Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Variable</em>' reference.
	 * @see #getActionVariable()
	 * @generated
	 */
	void setActionVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Step#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' container reference.
	 * @see #setStep(Step)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getAction_Step()
	 * @see grafcetmodeling.model.grafcetModeling.Step#getActions
	 * @model opposite="actions" required="true" transient="false"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Action#getStep <em>Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' container reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void parseExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createActionVariable();

} // Action
