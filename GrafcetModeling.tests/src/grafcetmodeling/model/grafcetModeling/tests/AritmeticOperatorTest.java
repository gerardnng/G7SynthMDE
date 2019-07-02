/**
 */
package grafcetmodeling.model.grafcetModeling.tests;

import grafcetmodeling.model.grafcetModeling.AritmeticOperator;
import grafcetmodeling.model.grafcetModeling.GrafcetModelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aritmetic Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AritmeticOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AritmeticOperatorTest.class);
	}

	/**
	 * Constructs a new Aritmetic Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AritmeticOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aritmetic Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AritmeticOperator getFixture() {
		return (AritmeticOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafcetModelingFactory.eINSTANCE.createAritmeticOperator());
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

} //AritmeticOperatorTest
