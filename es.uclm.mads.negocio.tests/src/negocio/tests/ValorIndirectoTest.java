/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.ValorIndirecto;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valor Indirecto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValorIndirectoTest extends ValorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValorIndirectoTest.class);
	}

	/**
	 * Constructs a new Valor Indirecto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorIndirectoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Valor Indirecto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValorIndirecto getFixture() {
		return (ValorIndirecto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createValorIndirecto());
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

} //ValorIndirectoTest
