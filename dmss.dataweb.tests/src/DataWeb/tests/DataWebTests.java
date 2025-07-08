/**
 */
package DataWeb.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataWeb</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebTests extends TestSuite {

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
		TestSuite suite = new DataWebTests("DataWeb Tests");
		suite.addTestSuite(AplicacionTest.class);
		suite.addTestSuite(EntidadTest.class);
		suite.addTestSuite(RolTest.class);
		suite.addTestSuite(PaginaIndiceTest.class);
		suite.addTestSuite(PaginaIndiceDetalleTest.class);
		suite.addTestSuite(PaginaEncuestaCuestionarioTest.class);
		suite.addTestSuite(PaginaIndiceExtendidoTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebTests(String name) {
		super(name);
	}

} //DataWebTests
