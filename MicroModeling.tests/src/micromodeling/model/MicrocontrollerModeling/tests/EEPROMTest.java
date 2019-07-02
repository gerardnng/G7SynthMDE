/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.EEPROM;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EEPROM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEPROMTest extends ROMTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EEPROMTest.class);
	}

	/**
	 * Constructs a new EEPROM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEPROMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EEPROM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EEPROM getFixture() {
		return (EEPROM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createEEPROM());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EEPROMTest
