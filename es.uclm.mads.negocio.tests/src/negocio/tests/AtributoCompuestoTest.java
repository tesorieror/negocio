/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.AtributoCompuesto;
import negocio.NegocioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo Compuesto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoCompuestoTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoCompuestoTest.class);
	}

	/**
	 * Constructs a new Atributo Compuesto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoCompuestoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo Compuesto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtributoCompuesto getFixture() {
		return (AtributoCompuesto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createAtributoCompuesto());
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

} //AtributoCompuestoTest
