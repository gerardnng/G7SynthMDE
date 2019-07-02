/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Variable#getName <em>Name</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Variable#getType <em>Type</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Variable#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.VarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.VarType
	 * @see #setType(VarType)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	VarType getType();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.VarType
	 * @see #getType()
	 * @generated
	 */
	void setType(VarType value);

	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafcet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(Grafcet)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getVariable_Grafcet()
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	Grafcet getGrafcet();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Variable#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(Grafcet value);

} // Variable
