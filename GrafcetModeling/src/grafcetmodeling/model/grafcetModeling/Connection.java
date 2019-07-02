/**
 */
package grafcetmodeling.model.grafcetModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Connection#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends G7Element {

	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafcet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(Grafcet)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getConnection_Grafcet()
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getConnections
	 * @model opposite="connections" required="true" transient="false"
	 * @generated
	 */
	Grafcet getGrafcet();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Connection#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(Grafcet value);
} // Connection
