/**
 */
package negocio.util;

import negocio.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see negocio.NegocioPackage
 * @generated
 */
public class NegocioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NegocioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioSwitch() {
		if (modelPackage == null) {
			modelPackage = NegocioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NegocioPackage.NEGOCIO: {
				Negocio negocio = (Negocio)theEObject;
				T result = caseNegocio(negocio);
				if (result == null) result = caseElementoNombrado(negocio);
				if (result == null) result = caseElemento(negocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.ELEMENTO_NOMBRADO: {
				ElementoNombrado elementoNombrado = (ElementoNombrado)theEObject;
				T result = caseElementoNombrado(elementoNombrado);
				if (result == null) result = caseElemento(elementoNombrado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.PERSONA: {
				Persona persona = (Persona)theEObject;
				T result = casePersona(persona);
				if (result == null) result = caseElementoNombrado(persona);
				if (result == null) result = caseElemento(persona);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.PRODUCTO: {
				Producto producto = (Producto)theEObject;
				T result = caseProducto(producto);
				if (result == null) result = caseElementoNombrado(producto);
				if (result == null) result = caseElemento(producto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.DOCUMENTO_COMERCIAL: {
				DocumentoComercial documentoComercial = (DocumentoComercial)theEObject;
				T result = caseDocumentoComercial(documentoComercial);
				if (result == null) result = caseElementoNombrado(documentoComercial);
				if (result == null) result = caseElemento(documentoComercial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.ATRIBUTO_SIMPLE: {
				AtributoSimple atributoSimple = (AtributoSimple)theEObject;
				T result = caseAtributoSimple(atributoSimple);
				if (result == null) result = caseAtributo(atributoSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.ATRIBUTO_COMPUESTO: {
				AtributoCompuesto atributoCompuesto = (AtributoCompuesto)theEObject;
				T result = caseAtributoCompuesto(atributoCompuesto);
				if (result == null) result = caseAtributo(atributoCompuesto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.VALOR: {
				Valor valor = (Valor)theEObject;
				T result = caseValor(valor);
				if (result == null) result = caseElementoNombrado(valor);
				if (result == null) result = caseElemento(valor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.ELEMENTO: {
				Elemento elemento = (Elemento)theEObject;
				T result = caseElemento(elemento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.VALOR_DIRECTO: {
				ValorDirecto valorDirecto = (ValorDirecto)theEObject;
				T result = caseValorDirecto(valorDirecto);
				if (result == null) result = caseValor(valorDirecto);
				if (result == null) result = caseElementoNombrado(valorDirecto);
				if (result == null) result = caseElemento(valorDirecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.VALOR_INDIRECTO: {
				ValorIndirecto valorIndirecto = (ValorIndirecto)theEObject;
				T result = caseValorIndirecto(valorIndirecto);
				if (result == null) result = caseValor(valorIndirecto);
				if (result == null) result = caseElementoNombrado(valorIndirecto);
				if (result == null) result = caseElemento(valorIndirecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.SERVICIO: {
				Servicio servicio = (Servicio)theEObject;
				T result = caseServicio(servicio);
				if (result == null) result = caseProducto(servicio);
				if (result == null) result = caseElementoNombrado(servicio);
				if (result == null) result = caseElemento(servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NegocioPackage.PAGO: {
				Pago pago = (Pago)theEObject;
				T result = casePago(pago);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegocio(Negocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Nombrado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Nombrado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoNombrado(ElementoNombrado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersona(Persona object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Producto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducto(Producto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documento Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documento Comercial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentoComercial(DocumentoComercial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoSimple(AtributoSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Compuesto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Compuesto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoCompuesto(AtributoCompuesto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValor(Valor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Directo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Directo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorDirecto(ValorDirecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Indirecto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Indirecto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorIndirecto(ValorIndirecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicio(Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pago</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pago</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePago(Pago object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NegocioSwitch
