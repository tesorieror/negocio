/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.Producto;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductoTest extends ElementoNombradoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductoTest.class);
	}

	/**
	 * Constructs a new Producto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Producto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Producto getFixture() {
		return (Producto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createProducto());
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

} //ProductoTest
