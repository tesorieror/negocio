/**
 */
package negocio.impl;

import java.util.Collection;

import negocio.DocumentoComercial;
import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Persona;
import negocio.Producto;
import negocio.Valor;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negocio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.NegocioImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link negocio.impl.NegocioImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link negocio.impl.NegocioImpl#getProductos <em>Productos</em>}</li>
 *   <li>{@link negocio.impl.NegocioImpl#getValores <em>Valores</em>}</li>
 *   <li>{@link negocio.impl.NegocioImpl#getPagos <em>Pagos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegocioImpl extends ElementoNombradoImpl implements Negocio {
	/**
	 * The cached value of the '{@link #getPersonas() <em>Personas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonas()
	 * @generated
	 * @ordered
	 */
	protected EList<Persona> personas;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentoComercial> documentos;

	/**
	 * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> productos;

	/**
	 * The cached value of the '{@link #getValores() <em>Valores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValores()
	 * @generated
	 * @ordered
	 */
	protected EList<Valor> valores;

	/**
	 * The cached value of the '{@link #getPagos() <em>Pagos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pago> pagos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegocioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.NEGOCIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Persona> getPersonas() {
		if (personas == null) {
			personas = new EObjectContainmentWithInverseEList<Persona>(Persona.class, this, NegocioPackage.NEGOCIO__PERSONAS, NegocioPackage.PERSONA__NEGOCIO);
		}
		return personas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentoComercial> getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectContainmentWithInverseEList<DocumentoComercial>(DocumentoComercial.class, this, NegocioPackage.NEGOCIO__DOCUMENTOS, NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProductos() {
		if (productos == null) {
			productos = new EObjectContainmentWithInverseEList<Producto>(Producto.class, this, NegocioPackage.NEGOCIO__PRODUCTOS, NegocioPackage.PRODUCTO__NEGOCIO);
		}
		return productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valor> getValores() {
		if (valores == null) {
			valores = new EObjectContainmentWithInverseEList<Valor>(Valor.class, this, NegocioPackage.NEGOCIO__VALORES, NegocioPackage.VALOR__NEGOCIO);
		}
		return valores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pago> getPagos() {
		if (pagos == null) {
			pagos = new EObjectContainmentWithInverseEList<Pago>(Pago.class, this, NegocioPackage.NEGOCIO__PAGOS, NegocioPackage.PAGO__NEGOCIO);
		}
		return pagos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonas()).basicAdd(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentos()).basicAdd(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductos()).basicAdd(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__VALORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValores()).basicAdd(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__PAGOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPagos()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				return ((InternalEList<?>)getDocumentos()).basicRemove(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				return ((InternalEList<?>)getProductos()).basicRemove(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__VALORES:
				return ((InternalEList<?>)getValores()).basicRemove(otherEnd, msgs);
			case NegocioPackage.NEGOCIO__PAGOS:
				return ((InternalEList<?>)getPagos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				return getPersonas();
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				return getDocumentos();
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				return getProductos();
			case NegocioPackage.NEGOCIO__VALORES:
				return getValores();
			case NegocioPackage.NEGOCIO__PAGOS:
				return getPagos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection<? extends DocumentoComercial>)newValue);
				return;
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				getProductos().clear();
				getProductos().addAll((Collection<? extends Producto>)newValue);
				return;
			case NegocioPackage.NEGOCIO__VALORES:
				getValores().clear();
				getValores().addAll((Collection<? extends Valor>)newValue);
				return;
			case NegocioPackage.NEGOCIO__PAGOS:
				getPagos().clear();
				getPagos().addAll((Collection<? extends Pago>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				getPersonas().clear();
				return;
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				getDocumentos().clear();
				return;
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				getProductos().clear();
				return;
			case NegocioPackage.NEGOCIO__VALORES:
				getValores().clear();
				return;
			case NegocioPackage.NEGOCIO__PAGOS:
				getPagos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NegocioPackage.NEGOCIO__PERSONAS:
				return personas != null && !personas.isEmpty();
			case NegocioPackage.NEGOCIO__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
			case NegocioPackage.NEGOCIO__PRODUCTOS:
				return productos != null && !productos.isEmpty();
			case NegocioPackage.NEGOCIO__VALORES:
				return valores != null && !valores.isEmpty();
			case NegocioPackage.NEGOCIO__PAGOS:
				return pagos != null && !pagos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NegocioImpl
