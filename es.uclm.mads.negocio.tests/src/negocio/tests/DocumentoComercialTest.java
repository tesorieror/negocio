/**
 */
package negocio.tests;

import junit.textui.TestRunner;

import negocio.DocumentoComercial;
import negocio.NegocioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Documento Comercial</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentoComercialTest extends ElementoNombradoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentoComercialTest.class);
	}

	/**
	 * Constructs a new Documento Comercial test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercialTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Documento Comercial test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DocumentoComercial getFixture() {
		return (DocumentoComercial)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NegocioFactory.eINSTANCE.createDocumentoComercial());
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

} //DocumentoComercialTest
