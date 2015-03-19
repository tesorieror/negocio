/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.ValorDirecto;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valor Directo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValorDirectoTest extends ValorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValorDirectoTest.class);
	}

	/**
	 * Constructs a new Valor Directo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorDirectoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Valor Directo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValorDirecto getFixture() {
		return (ValorDirecto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createValorDirecto());
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

} //ValorDirectoTest
