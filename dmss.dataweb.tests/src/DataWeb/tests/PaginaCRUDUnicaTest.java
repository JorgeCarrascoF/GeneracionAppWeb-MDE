/**
 */
package DataWeb.tests;

import DataWeb.DataWebFactory;
import DataWeb.PaginaCRUDUnica;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina CRUD Unica</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaCRUDUnicaTest extends PaginaDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaCRUDUnicaTest.class);
	}

	/**
	 * Constructs a new Pagina CRUD Unica test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaCRUDUnicaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pagina CRUD Unica test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaginaCRUDUnica getFixture() {
		return (PaginaCRUDUnica)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebFactory.eINSTANCE.createPaginaCRUDUnica());
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

} //PaginaCRUDUnicaTest
