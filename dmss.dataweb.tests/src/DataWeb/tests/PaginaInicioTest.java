/**
 */
package DataWeb.tests;

import DataWeb.DataWebFactory;
import DataWeb.PaginaInicio;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina Inicio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaInicioTest extends PaginaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaInicioTest.class);
	}

	/**
	 * Constructs a new Pagina Inicio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaInicioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pagina Inicio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaginaInicio getFixture() {
		return (PaginaInicio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebFactory.eINSTANCE.createPaginaInicio());
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

} //PaginaInicioTest
