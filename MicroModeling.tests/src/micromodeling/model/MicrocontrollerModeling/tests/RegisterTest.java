/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.Register;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegisterTest extends TestCase {

	/**
	 * The fixture for this Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Register fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegisterTest.class);
	}

	/**
	 * Constructs a new Register test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Register fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Register getFixture() {
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
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createRegister());
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

} //RegisterTest
