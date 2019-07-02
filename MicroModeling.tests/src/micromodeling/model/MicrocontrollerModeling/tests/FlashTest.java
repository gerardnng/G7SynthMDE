/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.Flash;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flash</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlashTest extends EEPROMTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlashTest.class);
	}

	/**
	 * Constructs a new Flash test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flash test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Flash getFixture() {
		return (Flash)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createFlash());
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

} //FlashTest
