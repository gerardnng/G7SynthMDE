/**
 */
package grafcetmodeling.model.grafcetModeling.tests;

import grafcetmodeling.model.grafcetModeling.GrafcetModelingFactory;
import grafcetmodeling.model.grafcetModeling.TimingOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timing Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimingOperatorTest.class);
	}

	/**
	 * Constructs a new Timing Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timing Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimingOperator getFixture() {
		return (TimingOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafcetModelingFactory.eINSTANCE.createTimingOperator());
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

} //TimingOperatorTest
