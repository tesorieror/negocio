/**
 */
package negocio.impl;

import negocio.Atributo;
import negocio.AtributoCompuesto;
import negocio.AtributoSimple;
import negocio.DocumentoComercial;
import negocio.Elemento;
import negocio.ElementoNombrado;
import negocio.Negocio;
import negocio.NegocioFactory;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Persona;
import negocio.Producto;
import negocio.Servicio;
import negocio.TipoCardinalidad;
import negocio.TipoDato;
import negocio.TipoPersona;
import negocio.Valor;
import negocio.ValorDirecto;
import negocio.ValorIndirecto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegocioPackageImpl extends EPackageImpl implements NegocioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negocioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoNombradoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentoComercialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoCompuestoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorDirectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorIndirectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPersonaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoCardinalidadEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see negocio.NegocioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NegocioPackageImpl() {
		super(eNS_URI, NegocioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NegocioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NegocioPackage init() {
		if (isInited) return (NegocioPackage)EPackage.Registry.INSTANCE.getEPackage(NegocioPackage.eNS_URI);

		// Obtain or create and register package
		NegocioPackageImpl theNegocioPackage = (NegocioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NegocioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NegocioPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNegocioPackage.createPackageContents();

		// Initialize created meta-data
		theNegocioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNegocioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NegocioPackage.eNS_URI, theNegocioPackage);
		return theNegocioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegocio() {
		return negocioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegocio_Personas() {
		return (EReference)negocioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegocio_Documentos() {
		return (EReference)negocioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegocio_Productos() {
		return (EReference)negocioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegocio_Valores() {
		return (EReference)negocioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegocio_Pagos() {
		return (EReference)negocioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoNombrado() {
		return elementoNombradoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoNombrado_Nombre() {
		return (EAttribute)elementoNombradoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_Negocio() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_Documentos() {
		return (EReference)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_Pagos() {
		return (EReference)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Tipo() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducto() {
		return productoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducto_Negocio() {
		return (EReference)productoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentoComercial() {
		return documentoComercialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoComercial_Negocio() {
		return (EReference)documentoComercialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoComercial_Producto() {
		return (EReference)documentoComercialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoComercial_Personas() {
		return (EReference)documentoComercialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoComercial_Pagos() {
		return (EReference)documentoComercialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoComercial_Valores() {
		return (EReference)documentoComercialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Cardinalidad() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtributo_Elemento() {
		return (EReference)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoSimple() {
		return atributoSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributoSimple_Tipo() {
		return (EAttribute)atributoSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoCompuesto() {
		return atributoCompuestoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtributoCompuesto_Atributos() {
		return (EReference)atributoCompuestoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValor() {
		return valorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValor_Negocio() {
		return (EReference)valorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValor_Pagos() {
		return (EReference)valorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElemento_Atributos() {
		return (EReference)elementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElemento_Id() {
		return (EAttribute)elementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorDirecto() {
		return valorDirectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorIndirecto() {
		return valorIndirectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorIndirecto_Justificante() {
		return (EReference)valorIndirectoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicio() {
		return servicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPago() {
		return pagoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPago_Documento() {
		return (EReference)pagoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPago_Persona() {
		return (EReference)pagoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPago_Valor() {
		return (EReference)pagoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPago_Negocio() {
		return (EReference)pagoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPersona() {
		return tipoPersonaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoCardinalidad() {
		return tipoCardinalidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioFactory getNegocioFactory() {
		return (NegocioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		negocioEClass = createEClass(NEGOCIO);
		createEReference(negocioEClass, NEGOCIO__PERSONAS);
		createEReference(negocioEClass, NEGOCIO__DOCUMENTOS);
		createEReference(negocioEClass, NEGOCIO__PRODUCTOS);
		createEReference(negocioEClass, NEGOCIO__VALORES);
		createEReference(negocioEClass, NEGOCIO__PAGOS);

		elementoNombradoEClass = createEClass(ELEMENTO_NOMBRADO);
		createEAttribute(elementoNombradoEClass, ELEMENTO_NOMBRADO__NOMBRE);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__NEGOCIO);
		createEReference(personaEClass, PERSONA__DOCUMENTOS);
		createEReference(personaEClass, PERSONA__PAGOS);
		createEAttribute(personaEClass, PERSONA__TIPO);

		productoEClass = createEClass(PRODUCTO);
		createEReference(productoEClass, PRODUCTO__NEGOCIO);

		documentoComercialEClass = createEClass(DOCUMENTO_COMERCIAL);
		createEReference(documentoComercialEClass, DOCUMENTO_COMERCIAL__NEGOCIO);
		createEReference(documentoComercialEClass, DOCUMENTO_COMERCIAL__PRODUCTO);
		createEReference(documentoComercialEClass, DOCUMENTO_COMERCIAL__PERSONAS);
		createEReference(documentoComercialEClass, DOCUMENTO_COMERCIAL__PAGOS);
		createEReference(documentoComercialEClass, DOCUMENTO_COMERCIAL__VALORES);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__CARDINALIDAD);
		createEReference(atributoEClass, ATRIBUTO__ELEMENTO);

		atributoSimpleEClass = createEClass(ATRIBUTO_SIMPLE);
		createEAttribute(atributoSimpleEClass, ATRIBUTO_SIMPLE__TIPO);

		atributoCompuestoEClass = createEClass(ATRIBUTO_COMPUESTO);
		createEReference(atributoCompuestoEClass, ATRIBUTO_COMPUESTO__ATRIBUTOS);

		valorEClass = createEClass(VALOR);
		createEReference(valorEClass, VALOR__NEGOCIO);
		createEReference(valorEClass, VALOR__PAGOS);

		elementoEClass = createEClass(ELEMENTO);
		createEReference(elementoEClass, ELEMENTO__ATRIBUTOS);
		createEAttribute(elementoEClass, ELEMENTO__ID);

		valorDirectoEClass = createEClass(VALOR_DIRECTO);

		valorIndirectoEClass = createEClass(VALOR_INDIRECTO);
		createEReference(valorIndirectoEClass, VALOR_INDIRECTO__JUSTIFICANTE);

		servicioEClass = createEClass(SERVICIO);

		pagoEClass = createEClass(PAGO);
		createEReference(pagoEClass, PAGO__DOCUMENTO);
		createEReference(pagoEClass, PAGO__PERSONA);
		createEReference(pagoEClass, PAGO__VALOR);
		createEReference(pagoEClass, PAGO__NEGOCIO);

		// Create enums
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		tipoPersonaEEnum = createEEnum(TIPO_PERSONA);
		tipoCardinalidadEEnum = createEEnum(TIPO_CARDINALIDAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		negocioEClass.getESuperTypes().add(this.getElementoNombrado());
		elementoNombradoEClass.getESuperTypes().add(this.getElemento());
		personaEClass.getESuperTypes().add(this.getElementoNombrado());
		productoEClass.getESuperTypes().add(this.getElementoNombrado());
		documentoComercialEClass.getESuperTypes().add(this.getElementoNombrado());
		atributoSimpleEClass.getESuperTypes().add(this.getAtributo());
		atributoCompuestoEClass.getESuperTypes().add(this.getAtributo());
		valorEClass.getESuperTypes().add(this.getElementoNombrado());
		valorDirectoEClass.getESuperTypes().add(this.getValor());
		valorIndirectoEClass.getESuperTypes().add(this.getValor());
		servicioEClass.getESuperTypes().add(this.getProducto());

		// Initialize classes, features, and operations; add parameters
		initEClass(negocioEClass, Negocio.class, "Negocio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegocio_Personas(), this.getPersona(), this.getPersona_Negocio(), "personas", null, 1, -1, Negocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegocio_Documentos(), this.getDocumentoComercial(), this.getDocumentoComercial_Negocio(), "documentos", null, 1, -1, Negocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegocio_Productos(), this.getProducto(), this.getProducto_Negocio(), "productos", null, 1, -1, Negocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegocio_Valores(), this.getValor(), this.getValor_Negocio(), "valores", null, 0, -1, Negocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegocio_Pagos(), this.getPago(), this.getPago_Negocio(), "pagos", null, 0, -1, Negocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoNombradoEClass, ElementoNombrado.class, "ElementoNombrado", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoNombrado_Nombre(), ecorePackage.getEString(), "nombre", "Elemento", 1, 1, ElementoNombrado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_Negocio(), this.getNegocio(), this.getNegocio_Personas(), "negocio", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Documentos(), this.getDocumentoComercial(), this.getDocumentoComercial_Personas(), "documentos", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Pagos(), this.getPago(), this.getPago_Persona(), "pagos", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Tipo(), this.getTipoPersona(), "tipo", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProducto_Negocio(), this.getNegocio(), this.getNegocio_Productos(), "negocio", null, 1, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentoComercialEClass, DocumentoComercial.class, "DocumentoComercial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentoComercial_Negocio(), this.getNegocio(), this.getNegocio_Documentos(), "negocio", null, 1, 1, DocumentoComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentoComercial_Producto(), this.getProducto(), null, "producto", null, 0, -1, DocumentoComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentoComercial_Personas(), this.getPersona(), this.getPersona_Documentos(), "personas", null, 0, -1, DocumentoComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentoComercial_Pagos(), this.getPago(), this.getPago_Documento(), "pagos", null, 0, -1, DocumentoComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentoComercial_Valores(), this.getValorIndirecto(), this.getValorIndirecto_Justificante(), "valores", null, 0, -1, DocumentoComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Cardinalidad(), this.getTipoCardinalidad(), "cardinalidad", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributo_Elemento(), this.getElemento(), this.getElemento_Atributos(), "elemento", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoSimpleEClass, AtributoSimple.class, "AtributoSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributoSimple_Tipo(), this.getTipoDato(), "tipo", null, 1, 1, AtributoSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoCompuestoEClass, AtributoCompuesto.class, "AtributoCompuesto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtributoCompuesto_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, AtributoCompuesto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorEClass, Valor.class, "Valor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValor_Negocio(), this.getNegocio(), this.getNegocio_Valores(), "negocio", null, 1, 1, Valor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValor_Pagos(), this.getPago(), this.getPago_Valor(), "pagos", null, 1, -1, Valor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElemento_Atributos(), this.getAtributo(), this.getAtributo_Elemento(), "atributos", null, 0, -1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_Id(), ecorePackage.getELong(), "id", null, 1, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorDirectoEClass, ValorDirecto.class, "ValorDirecto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valorIndirectoEClass, ValorIndirecto.class, "ValorIndirecto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValorIndirecto_Justificante(), this.getDocumentoComercial(), this.getDocumentoComercial_Valores(), "justificante", null, 1, 1, ValorIndirecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicioEClass, Servicio.class, "Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagoEClass, Pago.class, "Pago", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPago_Documento(), this.getDocumentoComercial(), this.getDocumentoComercial_Pagos(), "documento", null, 1, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPago_Persona(), this.getPersona(), this.getPersona_Pagos(), "persona", null, 1, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPago_Valor(), this.getValor(), this.getValor_Pagos(), "valor", null, 1, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPago_Negocio(), this.getNegocio(), this.getNegocio_Pagos(), "negocio", null, 1, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.ENTERO);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.TEXTO);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.REAL);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.FECHA);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.MONEDA);

		initEEnum(tipoPersonaEEnum, TipoPersona.class, "TipoPersona");
		addEEnumLiteral(tipoPersonaEEnum, TipoPersona.JURIDICA);
		addEEnumLiteral(tipoPersonaEEnum, TipoPersona.FISICA);

		initEEnum(tipoCardinalidadEEnum, TipoCardinalidad.class, "TipoCardinalidad");
		addEEnumLiteral(tipoCardinalidadEEnum, TipoCardinalidad.MULTIPLE);
		addEEnumLiteral(tipoCardinalidadEEnum, TipoCardinalidad.SIMPLE);

		// Create resource
		createResource(eNS_URI);
	}

} //NegocioPackageImpl
