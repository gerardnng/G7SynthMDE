/**
 */
package grafcetmodeling.model.grafcetModeling.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>grafcetModeling</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetModelingTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GrafcetModelingTests("grafcetModeling Tests"); //$NON-NLS-1$
		suite.addTestSuite(GrafcetTest.class);
		suite.addTestSuite(StepTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(LevelActionTest.class);
		suite.addTestSuite(StoredActionTest.class);
		suite.addTestSuite(ExpressionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetModelingTests(String name) {
		super(name);
	}

} //GrafcetModelingTests
