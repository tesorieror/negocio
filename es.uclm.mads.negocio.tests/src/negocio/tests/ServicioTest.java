/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.Servicio;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicioTest extends ProductoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServicioTest.class);
	}

	/**
	 * Constructs a new Servicio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Servicio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Servicio getFixture() {
		return (Servicio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createServicio());
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

} //ServicioTest
