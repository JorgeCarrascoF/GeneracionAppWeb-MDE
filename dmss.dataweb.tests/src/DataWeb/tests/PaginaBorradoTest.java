/**
 */
package DataWeb.tests;

import DataWeb.DataWebFactory;
import DataWeb.PaginaBorrado;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina Borrado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaBorradoTest extends PaginaDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaBorradoTest.class);
	}

	/**
	 * Constructs a new Pagina Borrado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaBorradoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pagina Borrado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaginaBorrado getFixture() {
		return (PaginaBorrado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebFactory.eINSTANCE.createPaginaBorrado());
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

} //PaginaBorradoTest
