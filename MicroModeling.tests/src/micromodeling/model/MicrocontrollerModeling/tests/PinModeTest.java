/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.PinMode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pin Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PinModeTest extends TestCase {

	/**
	 * The fixture for this Pin Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinMode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PinModeTest.class);
	}

	/**
	 * Constructs a new Pin Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinModeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pin Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PinMode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pin Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinMode getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createPinMode());
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

} //PinModeTest
