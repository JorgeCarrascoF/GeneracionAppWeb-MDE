/**
 */
package DataWeb.tests;

import DataWeb.DataWebFactory;
import DataWeb.PaginaIndiceDetalle;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina Indice Detalle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaIndiceDetalleTest extends PaginaIndiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaIndiceDetalleTest.class);
	}

	/**
	 * Constructs a new Pagina Indice Detalle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaIndiceDetalleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pagina Indice Detalle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaginaIndiceDetalle getFixture() {
		return (PaginaIndiceDetalle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebFactory.eINSTANCE.createPaginaIndiceDetalle());
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

} //PaginaIndiceDetalleTest
