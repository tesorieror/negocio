/**
 */
package negocio.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.Pago;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagoTest extends TestCase {

	/**
	 * The fixture for this Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pago fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagoTest.class);
	}

	/**
	 * Constructs a new Pago test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pago fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pago getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createPago());
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

} //PagoTest
