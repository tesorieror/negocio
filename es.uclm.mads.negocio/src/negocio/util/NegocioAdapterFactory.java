/**
 */
package negocio.util;

import negocio.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see negocio.NegocioPackage
 * @generated
 */
public class NegocioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NegocioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NegocioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegocioSwitch<Adapter> modelSwitch =
		new NegocioSwitch<Adapter>() {
			@Override
			public Adapter caseNegocio(Negocio object) {
				return createNegocioAdapter();
			}
			@Override
			public Adapter caseElementoNombrado(ElementoNombrado object) {
				return createElementoNombradoAdapter();
			}
			@Override
			public Adapter casePersona(Persona object) {
				return createPersonaAdapter();
			}
			@Override
			public Adapter caseProducto(Producto object) {
				return createProductoAdapter();
			}
			@Override
			public Adapter caseDocumentoComercial(DocumentoComercial object) {
				return createDocumentoComercialAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseAtributoSimple(AtributoSimple object) {
				return createAtributoSimpleAdapter();
			}
			@Override
			public Adapter caseAtributoCompuesto(AtributoCompuesto object) {
				return createAtributoCompuestoAdapter();
			}
			@Override
			public Adapter caseValor(Valor object) {
				return createValorAdapter();
			}
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseValorDirecto(ValorDirecto object) {
				return createValorDirectoAdapter();
			}
			@Override
			public Adapter caseValorIndirecto(ValorIndirecto object) {
				return createValorIndirectoAdapter();
			}
			@Override
			public Adapter caseServicio(Servicio object) {
				return createServicioAdapter();
			}
			@Override
			public Adapter casePago(Pago object) {
				return createPagoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link negocio.Negocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Negocio
	 * @generated
	 */
	public Adapter createNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.ElementoNombrado <em>Elemento Nombrado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.ElementoNombrado
	 * @generated
	 */
	public Adapter createElementoNombradoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Persona
	 * @generated
	 */
	public Adapter createPersonaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Producto
	 * @generated
	 */
	public Adapter createProductoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.DocumentoComercial <em>Documento Comercial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.DocumentoComercial
	 * @generated
	 */
	public Adapter createDocumentoComercialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.AtributoSimple
	 * @generated
	 */
	public Adapter createAtributoSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.AtributoCompuesto <em>Atributo Compuesto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.AtributoCompuesto
	 * @generated
	 */
	public Adapter createAtributoCompuestoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Valor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Valor
	 * @generated
	 */
	public Adapter createValorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.ValorDirecto <em>Valor Directo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.ValorDirecto
	 * @generated
	 */
	public Adapter createValorDirectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.ValorIndirecto <em>Valor Indirecto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.ValorIndirecto
	 * @generated
	 */
	public Adapter createValorIndirectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Servicio
	 * @generated
	 */
	public Adapter createServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link negocio.Pago <em>Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see negocio.Pago
	 * @generated
	 */
	public Adapter createPagoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NegocioAdapterFactory
