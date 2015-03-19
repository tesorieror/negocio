/**
 */
package negocio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see negocio.NegocioFactory
 * @model kind="package"
 * @generated
 */
public interface NegocioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "negocio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://negocio/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "negocio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NegocioPackage eINSTANCE = negocio.impl.NegocioPackageImpl.init();

	/**
	 * The meta object id for the '{@link negocio.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ElementoImpl
	 * @see negocio.impl.NegocioPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 9;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__ID = 1;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ElementoNombradoImpl <em>Elemento Nombrado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ElementoNombradoImpl
	 * @see negocio.impl.NegocioPackageImpl#getElementoNombrado()
	 * @generated
	 */
	int ELEMENTO_NOMBRADO = 1;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO__ATRIBUTOS = ELEMENTO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO__ID = ELEMENTO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO__NOMBRE = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elemento Nombrado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elemento Nombrado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.NegocioImpl <em>Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.NegocioImpl
	 * @see negocio.impl.NegocioPackageImpl#getNegocio()
	 * @generated
	 */
	int NEGOCIO = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__ATRIBUTOS = ELEMENTO_NOMBRADO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__ID = ELEMENTO_NOMBRADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__PERSONAS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__DOCUMENTOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Productos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__PRODUCTOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__VALORES = ELEMENTO_NOMBRADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO__PAGOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOCIO_OPERATION_COUNT = ELEMENTO_NOMBRADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.PersonaImpl
	 * @see negocio.impl.NegocioPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 2;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ATRIBUTOS = ELEMENTO_NOMBRADO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = ELEMENTO_NOMBRADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NEGOCIO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOCUMENTOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__PAGOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TIPO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = ELEMENTO_NOMBRADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ProductoImpl
	 * @see negocio.impl.NegocioPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 3;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ATRIBUTOS = ELEMENTO_NOMBRADO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID = ELEMENTO_NOMBRADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NEGOCIO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = ELEMENTO_NOMBRADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.DocumentoComercialImpl <em>Documento Comercial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.DocumentoComercialImpl
	 * @see negocio.impl.NegocioPackageImpl#getDocumentoComercial()
	 * @generated
	 */
	int DOCUMENTO_COMERCIAL = 4;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__ATRIBUTOS = ELEMENTO_NOMBRADO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__ID = ELEMENTO_NOMBRADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__NEGOCIO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__PRODUCTO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__PERSONAS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__PAGOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL__VALORES = ELEMENTO_NOMBRADO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Documento Comercial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Documento Comercial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_COMERCIAL_OPERATION_COUNT = ELEMENTO_NOMBRADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.AtributoImpl
	 * @see negocio.impl.NegocioPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Cardinalidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__CARDINALIDAD = 1;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ELEMENTO = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link negocio.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.AtributoSimpleImpl
	 * @see negocio.impl.NegocioPackageImpl#getAtributoSimple()
	 * @generated
	 */
	int ATRIBUTO_SIMPLE = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Cardinalidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__CARDINALIDAD = ATRIBUTO__CARDINALIDAD;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__ELEMENTO = ATRIBUTO__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__TIPO = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.AtributoCompuestoImpl <em>Atributo Compuesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.AtributoCompuestoImpl
	 * @see negocio.impl.NegocioPackageImpl#getAtributoCompuesto()
	 * @generated
	 */
	int ATRIBUTO_COMPUESTO = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Cardinalidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__CARDINALIDAD = ATRIBUTO__CARDINALIDAD;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__ELEMENTO = ATRIBUTO__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__ATRIBUTOS = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo Compuesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atributo Compuesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ValorImpl <em>Valor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ValorImpl
	 * @see negocio.impl.NegocioPackageImpl#getValor()
	 * @generated
	 */
	int VALOR = 8;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR__ATRIBUTOS = ELEMENTO_NOMBRADO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR__ID = ELEMENTO_NOMBRADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR__NEGOCIO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR__PAGOS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_OPERATION_COUNT = ELEMENTO_NOMBRADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ValorDirectoImpl <em>Valor Directo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ValorDirectoImpl
	 * @see negocio.impl.NegocioPackageImpl#getValorDirecto()
	 * @generated
	 */
	int VALOR_DIRECTO = 10;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO__ATRIBUTOS = VALOR__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO__ID = VALOR__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO__NOMBRE = VALOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO__NEGOCIO = VALOR__NEGOCIO;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO__PAGOS = VALOR__PAGOS;

	/**
	 * The number of structural features of the '<em>Valor Directo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO_FEATURE_COUNT = VALOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valor Directo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_DIRECTO_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ValorIndirectoImpl <em>Valor Indirecto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ValorIndirectoImpl
	 * @see negocio.impl.NegocioPackageImpl#getValorIndirecto()
	 * @generated
	 */
	int VALOR_INDIRECTO = 11;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__ATRIBUTOS = VALOR__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__ID = VALOR__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__NOMBRE = VALOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__NEGOCIO = VALOR__NEGOCIO;

	/**
	 * The feature id for the '<em><b>Pagos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__PAGOS = VALOR__PAGOS;

	/**
	 * The feature id for the '<em><b>Justificante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO__JUSTIFICANTE = VALOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valor Indirecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO_FEATURE_COUNT = VALOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valor Indirecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_INDIRECTO_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.ServicioImpl <em>Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.ServicioImpl
	 * @see negocio.impl.NegocioPackageImpl#getServicio()
	 * @generated
	 */
	int SERVICIO = 12;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ATRIBUTOS = PRODUCTO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ID = PRODUCTO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__NOMBRE = PRODUCTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__NEGOCIO = PRODUCTO__NEGOCIO;

	/**
	 * The number of structural features of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_FEATURE_COUNT = PRODUCTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_OPERATION_COUNT = PRODUCTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link negocio.impl.PagoImpl <em>Pago</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.impl.PagoImpl
	 * @see negocio.impl.NegocioPackageImpl#getPago()
	 * @generated
	 */
	int PAGO = 13;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__PERSONA = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__VALOR = 2;

	/**
	 * The feature id for the '<em><b>Negocio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__NEGOCIO = 3;

	/**
	 * The number of structural features of the '<em>Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link negocio.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.TipoDato
	 * @see negocio.impl.NegocioPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 14;

	/**
	 * The meta object id for the '{@link negocio.TipoPersona <em>Tipo Persona</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.TipoPersona
	 * @see negocio.impl.NegocioPackageImpl#getTipoPersona()
	 * @generated
	 */
	int TIPO_PERSONA = 15;

	/**
	 * The meta object id for the '{@link negocio.TipoCardinalidad <em>Tipo Cardinalidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see negocio.TipoCardinalidad
	 * @see negocio.impl.NegocioPackageImpl#getTipoCardinalidad()
	 * @generated
	 */
	int TIPO_CARDINALIDAD = 16;


	/**
	 * Returns the meta object for class '{@link negocio.Negocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negocio</em>'.
	 * @see negocio.Negocio
	 * @generated
	 */
	EClass getNegocio();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Negocio#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see negocio.Negocio#getPersonas()
	 * @see #getNegocio()
	 * @generated
	 */
	EReference getNegocio_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Negocio#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentos</em>'.
	 * @see negocio.Negocio#getDocumentos()
	 * @see #getNegocio()
	 * @generated
	 */
	EReference getNegocio_Documentos();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Negocio#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productos</em>'.
	 * @see negocio.Negocio#getProductos()
	 * @see #getNegocio()
	 * @generated
	 */
	EReference getNegocio_Productos();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Negocio#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valores</em>'.
	 * @see negocio.Negocio#getValores()
	 * @see #getNegocio()
	 * @generated
	 */
	EReference getNegocio_Valores();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Negocio#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagos</em>'.
	 * @see negocio.Negocio#getPagos()
	 * @see #getNegocio()
	 * @generated
	 */
	EReference getNegocio_Pagos();

	/**
	 * Returns the meta object for class '{@link negocio.ElementoNombrado <em>Elemento Nombrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Nombrado</em>'.
	 * @see negocio.ElementoNombrado
	 * @generated
	 */
	EClass getElementoNombrado();

	/**
	 * Returns the meta object for the attribute '{@link negocio.ElementoNombrado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see negocio.ElementoNombrado#getNombre()
	 * @see #getElementoNombrado()
	 * @generated
	 */
	EAttribute getElementoNombrado_Nombre();

	/**
	 * Returns the meta object for class '{@link negocio.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see negocio.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the container reference '{@link negocio.Persona#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negocio</em>'.
	 * @see negocio.Persona#getNegocio()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Negocio();

	/**
	 * Returns the meta object for the reference list '{@link negocio.Persona#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see negocio.Persona#getDocumentos()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Documentos();

	/**
	 * Returns the meta object for the reference list '{@link negocio.Persona#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pagos</em>'.
	 * @see negocio.Persona#getPagos()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Pagos();

	/**
	 * Returns the meta object for the attribute '{@link negocio.Persona#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see negocio.Persona#getTipo()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Tipo();

	/**
	 * Returns the meta object for class '{@link negocio.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see negocio.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the container reference '{@link negocio.Producto#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negocio</em>'.
	 * @see negocio.Producto#getNegocio()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Negocio();

	/**
	 * Returns the meta object for class '{@link negocio.DocumentoComercial <em>Documento Comercial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento Comercial</em>'.
	 * @see negocio.DocumentoComercial
	 * @generated
	 */
	EClass getDocumentoComercial();

	/**
	 * Returns the meta object for the container reference '{@link negocio.DocumentoComercial#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negocio</em>'.
	 * @see negocio.DocumentoComercial#getNegocio()
	 * @see #getDocumentoComercial()
	 * @generated
	 */
	EReference getDocumentoComercial_Negocio();

	/**
	 * Returns the meta object for the reference list '{@link negocio.DocumentoComercial#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producto</em>'.
	 * @see negocio.DocumentoComercial#getProducto()
	 * @see #getDocumentoComercial()
	 * @generated
	 */
	EReference getDocumentoComercial_Producto();

	/**
	 * Returns the meta object for the reference list '{@link negocio.DocumentoComercial#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personas</em>'.
	 * @see negocio.DocumentoComercial#getPersonas()
	 * @see #getDocumentoComercial()
	 * @generated
	 */
	EReference getDocumentoComercial_Personas();

	/**
	 * Returns the meta object for the reference list '{@link negocio.DocumentoComercial#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pagos</em>'.
	 * @see negocio.DocumentoComercial#getPagos()
	 * @see #getDocumentoComercial()
	 * @generated
	 */
	EReference getDocumentoComercial_Pagos();

	/**
	 * Returns the meta object for the reference list '{@link negocio.DocumentoComercial#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valores</em>'.
	 * @see negocio.DocumentoComercial#getValores()
	 * @see #getDocumentoComercial()
	 * @generated
	 */
	EReference getDocumentoComercial_Valores();

	/**
	 * Returns the meta object for class '{@link negocio.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see negocio.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link negocio.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see negocio.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link negocio.Atributo#getCardinalidad <em>Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidad</em>'.
	 * @see negocio.Atributo#getCardinalidad()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Cardinalidad();

	/**
	 * Returns the meta object for the container reference '{@link negocio.Atributo#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Elemento</em>'.
	 * @see negocio.Atributo#getElemento()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_Elemento();

	/**
	 * Returns the meta object for class '{@link negocio.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Simple</em>'.
	 * @see negocio.AtributoSimple
	 * @generated
	 */
	EClass getAtributoSimple();

	/**
	 * Returns the meta object for the attribute '{@link negocio.AtributoSimple#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see negocio.AtributoSimple#getTipo()
	 * @see #getAtributoSimple()
	 * @generated
	 */
	EAttribute getAtributoSimple_Tipo();

	/**
	 * Returns the meta object for class '{@link negocio.AtributoCompuesto <em>Atributo Compuesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Compuesto</em>'.
	 * @see negocio.AtributoCompuesto
	 * @generated
	 */
	EClass getAtributoCompuesto();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.AtributoCompuesto#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see negocio.AtributoCompuesto#getAtributos()
	 * @see #getAtributoCompuesto()
	 * @generated
	 */
	EReference getAtributoCompuesto_Atributos();

	/**
	 * Returns the meta object for class '{@link negocio.Valor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor</em>'.
	 * @see negocio.Valor
	 * @generated
	 */
	EClass getValor();

	/**
	 * Returns the meta object for the container reference '{@link negocio.Valor#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negocio</em>'.
	 * @see negocio.Valor#getNegocio()
	 * @see #getValor()
	 * @generated
	 */
	EReference getValor_Negocio();

	/**
	 * Returns the meta object for the reference list '{@link negocio.Valor#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pagos</em>'.
	 * @see negocio.Valor#getPagos()
	 * @see #getValor()
	 * @generated
	 */
	EReference getValor_Pagos();

	/**
	 * Returns the meta object for class '{@link negocio.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see negocio.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the containment reference list '{@link negocio.Elemento#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see negocio.Elemento#getAtributos()
	 * @see #getElemento()
	 * @generated
	 */
	EReference getElemento_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link negocio.Elemento#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see negocio.Elemento#getId()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Id();

	/**
	 * Returns the meta object for class '{@link negocio.ValorDirecto <em>Valor Directo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Directo</em>'.
	 * @see negocio.ValorDirecto
	 * @generated
	 */
	EClass getValorDirecto();

	/**
	 * Returns the meta object for class '{@link negocio.ValorIndirecto <em>Valor Indirecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Indirecto</em>'.
	 * @see negocio.ValorIndirecto
	 * @generated
	 */
	EClass getValorIndirecto();

	/**
	 * Returns the meta object for the reference '{@link negocio.ValorIndirecto#getJustificante <em>Justificante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Justificante</em>'.
	 * @see negocio.ValorIndirecto#getJustificante()
	 * @see #getValorIndirecto()
	 * @generated
	 */
	EReference getValorIndirecto_Justificante();

	/**
	 * Returns the meta object for class '{@link negocio.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio</em>'.
	 * @see negocio.Servicio
	 * @generated
	 */
	EClass getServicio();

	/**
	 * Returns the meta object for class '{@link negocio.Pago <em>Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pago</em>'.
	 * @see negocio.Pago
	 * @generated
	 */
	EClass getPago();

	/**
	 * Returns the meta object for the reference '{@link negocio.Pago#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documento</em>'.
	 * @see negocio.Pago#getDocumento()
	 * @see #getPago()
	 * @generated
	 */
	EReference getPago_Documento();

	/**
	 * Returns the meta object for the reference '{@link negocio.Pago#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persona</em>'.
	 * @see negocio.Pago#getPersona()
	 * @see #getPago()
	 * @generated
	 */
	EReference getPago_Persona();

	/**
	 * Returns the meta object for the reference '{@link negocio.Pago#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valor</em>'.
	 * @see negocio.Pago#getValor()
	 * @see #getPago()
	 * @generated
	 */
	EReference getPago_Valor();

	/**
	 * Returns the meta object for the container reference '{@link negocio.Pago#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negocio</em>'.
	 * @see negocio.Pago#getNegocio()
	 * @see #getPago()
	 * @generated
	 */
	EReference getPago_Negocio();

	/**
	 * Returns the meta object for enum '{@link negocio.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see negocio.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link negocio.TipoPersona <em>Tipo Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Persona</em>'.
	 * @see negocio.TipoPersona
	 * @generated
	 */
	EEnum getTipoPersona();

	/**
	 * Returns the meta object for enum '{@link negocio.TipoCardinalidad <em>Tipo Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Cardinalidad</em>'.
	 * @see negocio.TipoCardinalidad
	 * @generated
	 */
	EEnum getTipoCardinalidad();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NegocioFactory getNegocioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link negocio.impl.NegocioImpl <em>Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.NegocioImpl
		 * @see negocio.impl.NegocioPackageImpl#getNegocio()
		 * @generated
		 */
		EClass NEGOCIO = eINSTANCE.getNegocio();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOCIO__PERSONAS = eINSTANCE.getNegocio_Personas();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOCIO__DOCUMENTOS = eINSTANCE.getNegocio_Documentos();

		/**
		 * The meta object literal for the '<em><b>Productos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOCIO__PRODUCTOS = eINSTANCE.getNegocio_Productos();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOCIO__VALORES = eINSTANCE.getNegocio_Valores();

		/**
		 * The meta object literal for the '<em><b>Pagos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOCIO__PAGOS = eINSTANCE.getNegocio_Pagos();

		/**
		 * The meta object literal for the '{@link negocio.impl.ElementoNombradoImpl <em>Elemento Nombrado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ElementoNombradoImpl
		 * @see negocio.impl.NegocioPackageImpl#getElementoNombrado()
		 * @generated
		 */
		EClass ELEMENTO_NOMBRADO = eINSTANCE.getElementoNombrado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_NOMBRADO__NOMBRE = eINSTANCE.getElementoNombrado_Nombre();

		/**
		 * The meta object literal for the '{@link negocio.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.PersonaImpl
		 * @see negocio.impl.NegocioPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Negocio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__NEGOCIO = eINSTANCE.getPersona_Negocio();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__DOCUMENTOS = eINSTANCE.getPersona_Documentos();

		/**
		 * The meta object literal for the '<em><b>Pagos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__PAGOS = eINSTANCE.getPersona_Pagos();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TIPO = eINSTANCE.getPersona_Tipo();

		/**
		 * The meta object literal for the '{@link negocio.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ProductoImpl
		 * @see negocio.impl.NegocioPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Negocio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__NEGOCIO = eINSTANCE.getProducto_Negocio();

		/**
		 * The meta object literal for the '{@link negocio.impl.DocumentoComercialImpl <em>Documento Comercial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.DocumentoComercialImpl
		 * @see negocio.impl.NegocioPackageImpl#getDocumentoComercial()
		 * @generated
		 */
		EClass DOCUMENTO_COMERCIAL = eINSTANCE.getDocumentoComercial();

		/**
		 * The meta object literal for the '<em><b>Negocio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_COMERCIAL__NEGOCIO = eINSTANCE.getDocumentoComercial_Negocio();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_COMERCIAL__PRODUCTO = eINSTANCE.getDocumentoComercial_Producto();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_COMERCIAL__PERSONAS = eINSTANCE.getDocumentoComercial_Personas();

		/**
		 * The meta object literal for the '<em><b>Pagos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_COMERCIAL__PAGOS = eINSTANCE.getDocumentoComercial_Pagos();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_COMERCIAL__VALORES = eINSTANCE.getDocumentoComercial_Valores();

		/**
		 * The meta object literal for the '{@link negocio.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.AtributoImpl
		 * @see negocio.impl.NegocioPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Cardinalidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__CARDINALIDAD = eINSTANCE.getAtributo_Cardinalidad();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__ELEMENTO = eINSTANCE.getAtributo_Elemento();

		/**
		 * The meta object literal for the '{@link negocio.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.AtributoSimpleImpl
		 * @see negocio.impl.NegocioPackageImpl#getAtributoSimple()
		 * @generated
		 */
		EClass ATRIBUTO_SIMPLE = eINSTANCE.getAtributoSimple();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO_SIMPLE__TIPO = eINSTANCE.getAtributoSimple_Tipo();

		/**
		 * The meta object literal for the '{@link negocio.impl.AtributoCompuestoImpl <em>Atributo Compuesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.AtributoCompuestoImpl
		 * @see negocio.impl.NegocioPackageImpl#getAtributoCompuesto()
		 * @generated
		 */
		EClass ATRIBUTO_COMPUESTO = eINSTANCE.getAtributoCompuesto();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_COMPUESTO__ATRIBUTOS = eINSTANCE.getAtributoCompuesto_Atributos();

		/**
		 * The meta object literal for the '{@link negocio.impl.ValorImpl <em>Valor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ValorImpl
		 * @see negocio.impl.NegocioPackageImpl#getValor()
		 * @generated
		 */
		EClass VALOR = eINSTANCE.getValor();

		/**
		 * The meta object literal for the '<em><b>Negocio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR__NEGOCIO = eINSTANCE.getValor_Negocio();

		/**
		 * The meta object literal for the '<em><b>Pagos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR__PAGOS = eINSTANCE.getValor_Pagos();

		/**
		 * The meta object literal for the '{@link negocio.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ElementoImpl
		 * @see negocio.impl.NegocioPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO__ATRIBUTOS = eINSTANCE.getElemento_Atributos();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__ID = eINSTANCE.getElemento_Id();

		/**
		 * The meta object literal for the '{@link negocio.impl.ValorDirectoImpl <em>Valor Directo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ValorDirectoImpl
		 * @see negocio.impl.NegocioPackageImpl#getValorDirecto()
		 * @generated
		 */
		EClass VALOR_DIRECTO = eINSTANCE.getValorDirecto();

		/**
		 * The meta object literal for the '{@link negocio.impl.ValorIndirectoImpl <em>Valor Indirecto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ValorIndirectoImpl
		 * @see negocio.impl.NegocioPackageImpl#getValorIndirecto()
		 * @generated
		 */
		EClass VALOR_INDIRECTO = eINSTANCE.getValorIndirecto();

		/**
		 * The meta object literal for the '<em><b>Justificante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_INDIRECTO__JUSTIFICANTE = eINSTANCE.getValorIndirecto_Justificante();

		/**
		 * The meta object literal for the '{@link negocio.impl.ServicioImpl <em>Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.ServicioImpl
		 * @see negocio.impl.NegocioPackageImpl#getServicio()
		 * @generated
		 */
		EClass SERVICIO = eINSTANCE.getServicio();

		/**
		 * The meta object literal for the '{@link negocio.impl.PagoImpl <em>Pago</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.impl.PagoImpl
		 * @see negocio.impl.NegocioPackageImpl#getPago()
		 * @generated
		 */
		EClass PAGO = eINSTANCE.getPago();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGO__DOCUMENTO = eINSTANCE.getPago_Documento();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGO__PERSONA = eINSTANCE.getPago_Persona();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGO__VALOR = eINSTANCE.getPago_Valor();

		/**
		 * The meta object literal for the '<em><b>Negocio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGO__NEGOCIO = eINSTANCE.getPago_Negocio();

		/**
		 * The meta object literal for the '{@link negocio.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.TipoDato
		 * @see negocio.impl.NegocioPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link negocio.TipoPersona <em>Tipo Persona</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.TipoPersona
		 * @see negocio.impl.NegocioPackageImpl#getTipoPersona()
		 * @generated
		 */
		EEnum TIPO_PERSONA = eINSTANCE.getTipoPersona();

		/**
		 * The meta object literal for the '{@link negocio.TipoCardinalidad <em>Tipo Cardinalidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see negocio.TipoCardinalidad
		 * @see negocio.impl.NegocioPackageImpl#getTipoCardinalidad()
		 * @generated
		 */
		EEnum TIPO_CARDINALIDAD = eINSTANCE.getTipoCardinalidad();

	}

} //NegocioPackage
