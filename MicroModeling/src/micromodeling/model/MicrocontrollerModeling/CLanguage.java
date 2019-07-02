/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLanguage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getTimerconfig <em>Timerconfig</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getPinmode <em>Pinmode</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#isHasMain <em>Has Main</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getFilesExtension <em>Files Extension</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getPinoperation <em>Pinoperation</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage()
 * @model
 * @generated
 */
public interface CLanguage extends EObject {
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
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Timerconfig</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.TimerConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timerconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timerconfig</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_Timerconfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimerConfig> getTimerconfig();

	/**
	 * Returns the value of the '<em><b>Pinmode</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.PinMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinmode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinmode</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_Pinmode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PinMode> getPinmode();

	/**
	 * Returns the value of the '<em><b>Has Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Main</em>' attribute.
	 * @see #setHasMain(boolean)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_HasMain()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasMain();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#isHasMain <em>Has Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Main</em>' attribute.
	 * @see #isHasMain()
	 * @generated
	 */
	void setHasMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Files Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files Extension</em>' attribute.
	 * @see #setFilesExtension(String)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_FilesExtension()
	 * @model
	 * @generated
	 */
	String getFilesExtension();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getFilesExtension <em>Files Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files Extension</em>' attribute.
	 * @see #getFilesExtension()
	 * @generated
	 */
	void setFilesExtension(String value);

	/**
	 * Returns the value of the '<em><b>Pinoperation</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.PinOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinoperation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinoperation</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getCLanguage_Pinoperation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PinOperation> getPinoperation();

} // CLanguage
