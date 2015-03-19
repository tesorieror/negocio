/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.NegocioFactory;
import negocio.Persona;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonaTest extends ElementoNombradoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonaTest.class);
	}

	/**
	 * Constructs a new Persona test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Persona test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Persona getFixture() {
		return (Persona)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createPersona());
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

} //PersonaTest
