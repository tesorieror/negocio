/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.Negocio;
import negocio.NegocioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negocio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegocioTest extends ElementoNombradoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegocioTest.class);
	}

	/**
	 * Constructs a new Negocio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negocio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Negocio getFixture() {
		return (Negocio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createNegocio());
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

} //NegocioTest
