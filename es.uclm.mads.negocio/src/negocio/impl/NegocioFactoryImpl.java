/**
 */
package negocio.impl;

import negocio.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegocioFactoryImpl extends EFactoryImpl implements NegocioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NegocioFactory init() {
		try {
			NegocioFactory theNegocioFactory = (NegocioFactory)EPackage.Registry.INSTANCE.getEFactory(NegocioPackage.eNS_URI);
			if (theNegocioFactory != null) {
				return theNegocioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NegocioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NegocioPackage.NEGOCIO: return createNegocio();
			case NegocioPackage.PERSONA: return createPersona();
			case NegocioPackage.PRODUCTO: return createProducto();
			case NegocioPackage.DOCUMENTO_COMERCIAL: return createDocumentoComercial();
			case NegocioPackage.ATRIBUTO_SIMPLE: return createAtributoSimple();
			case NegocioPackage.ATRIBUTO_COMPUESTO: return createAtributoCompuesto();
			case NegocioPackage.VALOR_DIRECTO: return createValorDirecto();
			case NegocioPackage.VALOR_INDIRECTO: return createValorIndirecto();
			case NegocioPackage.SERVICIO: return createServicio();
			case NegocioPackage.PAGO: return createPago();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NegocioPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case NegocioPackage.TIPO_PERSONA:
				return createTipoPersonaFromString(eDataType, initialValue);
			case NegocioPackage.TIPO_CARDINALIDAD:
				return createTipoCardinalidadFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NegocioPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case NegocioPackage.TIPO_PERSONA:
				return convertTipoPersonaToString(eDataType, instanceValue);
			case NegocioPackage.TIPO_CARDINALIDAD:
				return convertTipoCardinalidadToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negocio createNegocio() {
		NegocioImpl negocio = new NegocioImpl();
		return negocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercial createDocumentoComercial() {
		DocumentoComercialImpl documentoComercial = new DocumentoComercialImpl();
		return documentoComercial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoSimple createAtributoSimple() {
		AtributoSimpleImpl atributoSimple = new AtributoSimpleImpl();
		return atributoSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoCompuesto createAtributoCompuesto() {
		AtributoCompuestoImpl atributoCompuesto = new AtributoCompuestoImpl();
		return atributoCompuesto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorDirecto createValorDirecto() {
		ValorDirectoImpl valorDirecto = new ValorDirectoImpl();
		return valorDirecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorIndirecto createValorIndirecto() {
		ValorIndirectoImpl valorIndirecto = new ValorIndirectoImpl();
		return valorIndirecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicio createServicio() {
		ServicioImpl servicio = new ServicioImpl();
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pago createPago() {
		PagoImpl pago = new PagoImpl();
		return pago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPersona createTipoPersonaFromString(EDataType eDataType, String initialValue) {
		TipoPersona result = TipoPersona.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPersonaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCardinalidad createTipoCardinalidadFromString(EDataType eDataType, String initialValue) {
		TipoCardinalidad result = TipoCardinalidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoCardinalidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioPackage getNegocioPackage() {
		return (NegocioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NegocioPackage getPackage() {
		return NegocioPackage.eINSTANCE;
	}

} //NegocioFactoryImpl
