/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.AtributoSimple;
import negocio.NegocioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo Simple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoSimpleTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoSimpleTest.class);
	}

	/**
	 * Constructs a new Atributo Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoSimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtributoSimple getFixture() {
		return (AtributoSimple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createAtributoSimple());
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

} //AtributoSimpleTest
