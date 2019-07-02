/**
 */
package micromodeling.model.MicrocontrollerModeling.tests;

import junit.textui.TestRunner;

import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.PinOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pin Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PinOperationTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PinOperationTest.class);
	}

	/**
	 * Constructs a new Pin Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pin Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PinOperation getFixture() {
		return (PinOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicrocontrollerModelingFactory.eINSTANCE.createPinOperation());
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

} //PinOperationTest
