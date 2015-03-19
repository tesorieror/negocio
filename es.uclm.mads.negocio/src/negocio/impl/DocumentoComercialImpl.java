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
import negocio.ValorIndirecto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento Comercial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.DocumentoComercialImpl#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.impl.DocumentoComercialImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link negocio.impl.DocumentoComercialImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link negocio.impl.DocumentoComercialImpl#getPagos <em>Pagos</em>}</li>
 *   <li>{@link negocio.impl.DocumentoComercialImpl#getValores <em>Valores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentoComercialImpl extends ElementoNombradoImpl implements DocumentoComercial {
	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> producto;

	/**
	 * The cached value of the '{@link #getPersonas() <em>Personas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonas()
	 * @generated
	 * @ordered
	 */
	protected EList<Persona> personas;

	/**
	 * The cached value of the '{@link #getPagos() <em>Pagos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pago> pagos;

	/**
	 * The cached value of the '{@link #getValores() <em>Valores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValores()
	 * @generated
	 * @ordered
	 */
	protected EList<ValorIndirecto> valores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentoComercialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.DOCUMENTO_COMERCIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negocio getNegocio() {
		if (eContainerFeatureID() != NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO) return null;
		return (Negocio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegocio(Negocio newNegocio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNegocio, NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegocio(Negocio newNegocio) {
		if (newNegocio != eInternalContainer() || (eContainerFeatureID() != NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO && newNegocio != null)) {
			if (EcoreUtil.isAncestor(this, newNegocio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNegocio != null)
				msgs = ((InternalEObject)newNegocio).eInverseAdd(this, NegocioPackage.NEGOCIO__DOCUMENTOS, Negocio.class, msgs);
			msgs = basicSetNegocio(newNegocio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO, newNegocio, newNegocio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectResolvingEList<Producto>(Producto.class, this, NegocioPackage.DOCUMENTO_COMERCIAL__PRODUCTO);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Persona> getPersonas() {
		if (personas == null) {
			personas = new EObjectWithInverseResolvingEList.ManyInverse<Persona>(Persona.class, this, NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS, NegocioPackage.PERSONA__DOCUMENTOS);
		}
		return personas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pago> getPagos() {
		if (pagos == null) {
			pagos = new EObjectWithInverseResolvingEList<Pago>(Pago.class, this, NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS, NegocioPackage.PAGO__DOCUMENTO);
		}
		return pagos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValorIndirecto> getValores() {
		if (valores == null) {
			valores = new EObjectWithInverseResolvingEList<ValorIndirecto>(ValorIndirecto.class, this, NegocioPackage.DOCUMENTO_COMERCIAL__VALORES, NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE);
		}
		return valores;
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
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNegocio((Negocio)otherEnd, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonas()).basicAdd(otherEnd, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPagos()).basicAdd(otherEnd, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValores()).basicAdd(otherEnd, msgs);
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
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				return basicSetNegocio(null, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				return ((InternalEList<?>)getPagos()).basicRemove(otherEnd, msgs);
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				return ((InternalEList<?>)getValores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				return eInternalContainer().eInverseRemove(this, NegocioPackage.NEGOCIO__DOCUMENTOS, Negocio.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				return getNegocio();
			case NegocioPackage.DOCUMENTO_COMERCIAL__PRODUCTO:
				return getProducto();
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				return getPersonas();
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				return getPagos();
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				return getValores();
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
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				setNegocio((Negocio)newValue);
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PRODUCTO:
				getProducto().clear();
				getProducto().addAll((Collection<? extends Producto>)newValue);
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				getPagos().clear();
				getPagos().addAll((Collection<? extends Pago>)newValue);
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				getValores().clear();
				getValores().addAll((Collection<? extends ValorIndirecto>)newValue);
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
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				setNegocio((Negocio)null);
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PRODUCTO:
				getProducto().clear();
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				getPersonas().clear();
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				getPagos().clear();
				return;
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				getValores().clear();
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
			case NegocioPackage.DOCUMENTO_COMERCIAL__NEGOCIO:
				return getNegocio() != null;
			case NegocioPackage.DOCUMENTO_COMERCIAL__PRODUCTO:
				return producto != null && !producto.isEmpty();
			case NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS:
				return personas != null && !personas.isEmpty();
			case NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS:
				return pagos != null && !pagos.isEmpty();
			case NegocioPackage.DOCUMENTO_COMERCIAL__VALORES:
				return valores != null && !valores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentoComercialImpl
