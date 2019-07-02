/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.Pin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PinTest extends TestCase {

	/**
	 * The fixture for this Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pin fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PinTest.class);
	}

	/**
	 * Constructs a new Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pin fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pin getFixture() {
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
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createPin());
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

} //PinTest
