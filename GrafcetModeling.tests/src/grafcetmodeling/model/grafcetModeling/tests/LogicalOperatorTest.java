/**
 */
package grafcetmodeling.model.grafcetModeling.tests;

import grafcetmodeling.model.grafcetModeling.GrafcetModelingFactory;
import grafcetmodeling.model.grafcetModeling.LogicalOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalOperatorTest.class);
	}

	/**
	 * Constructs a new Logical Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalOperator getFixture() {
		return (LogicalOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafcetModelingFactory.eINSTANCE.createLogicalOperator());
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

} //LogicalOperatorTest
