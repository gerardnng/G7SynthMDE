/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getPins <em>Pins</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getClanguage <em>Clanguage</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getProcessor <em>Processor</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFamily <em>Family</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRom <em>Rom</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFlash <em>Flash</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRam <em>Ram</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getWordMemory <em>Word Memory</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRegisters <em>Registers</em>}</li>
 * </ul>
 *
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueName_PerPin uniquePinNumber_PerPin asLeast_OneRomOrFlashMemory'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueName_PerPin='\n\t\tself.pins-&gt;forAll(p1, p2|p1&lt;&gt;p1 implies p1.name&lt;&gt;p2.name)' uniquePinNumber_PerPin='\n\t\tself.pins-&gt;forAll(p1, p2|p1&lt;&gt;p1 implies p1.number&lt;&gt;p2.number)' asLeast_OneRomOrFlashMemory='\n\t\tnot(self.flash = null and self.roms-&gt;isEmpty())'"
 * @generated
 */
public interface Microcontroller extends EObject {
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
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.Pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Pins()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * Returns the value of the '<em><b>Clanguage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clanguage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clanguage</em>' containment reference.
	 * @see #setClanguage(CLanguage)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Clanguage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLanguage getClanguage();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getClanguage <em>Clanguage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clanguage</em>' containment reference.
	 * @see #getClanguage()
	 * @generated
	 */
	void setClanguage(CLanguage value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Processor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessor();

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Rom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom</em>' containment reference.
	 * @see #setRom(ROM)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Rom()
	 * @model containment="true"
	 * @generated
	 */
	ROM getRom();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRom <em>Rom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom</em>' containment reference.
	 * @see #getRom()
	 * @generated
	 */
	void setRom(ROM value);

	/**
	 * Returns the value of the '<em><b>Flash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flash</em>' containment reference.
	 * @see #setFlash(Flash)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Flash()
	 * @model containment="true"
	 * @generated
	 */
	Flash getFlash();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFlash <em>Flash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash</em>' containment reference.
	 * @see #getFlash()
	 * @generated
	 */
	void setFlash(Flash value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' containment reference.
	 * @see #setRam(RAM)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Ram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RAM getRam();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRam <em>Ram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' containment reference.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(RAM value);

	/**
	 * Returns the value of the '<em><b>Word Memory</b></em>' attribute.
	 * The literals are from the enumeration {@link micromodeling.model.MicrocontrollerModeling.WordSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Memory</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.WordSize
	 * @see #setWordMemory(WordSize)
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_WordMemory()
	 * @model
	 * @generated
	 */
	WordSize getWordMemory();

	/**
	 * Sets the value of the '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getWordMemory <em>Word Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Memory</em>' attribute.
	 * @see micromodeling.model.MicrocontrollerModeling.WordSize
	 * @see #getWordMemory()
	 * @generated
	 */
	void setWordMemory(WordSize value);

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link micromodeling.model.MicrocontrollerModeling.Register}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getMicrocontroller_Registers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Register> getRegisters();

} // Microcontroller
