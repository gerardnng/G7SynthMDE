/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.Microcontroller;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrocontrollerTest extends TestCase {

	/**
	 * The fixture for this Microcontroller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Microcontroller fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MicrocontrollerTest.class);
	}

	/**
	 * Constructs a new Microcontroller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Microcontroller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Microcontroller fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Microcontroller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Microcontroller getFixture() {
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
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createMicrocontroller());
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

} //MicrocontrollerTest
