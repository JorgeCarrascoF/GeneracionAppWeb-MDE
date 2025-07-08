/**
 */
package DataWeb.tests;

import DataWeb.DataWebFactory;
import DataWeb.PaginaDetalle;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina Detalle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaDetalleTest extends PaginaDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaDetalleTest.class);
	}

	/**
	 * Constructs a new Pagina Detalle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaDetalleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pagina Detalle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaginaDetalle getFixture() {
		return (PaginaDetalle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebFactory.eINSTANCE.createPaginaDetalle());
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

} //PaginaDetalleTest
