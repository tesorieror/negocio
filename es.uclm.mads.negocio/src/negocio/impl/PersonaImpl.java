/**
 */
package negocio.impl;

import java.util.Collection;

import negocio.DocumentoComercial;
import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Persona;
import negocio.TipoPersona;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.PersonaImpl#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.impl.PersonaImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link negocio.impl.PersonaImpl#getPagos <em>Pagos</em>}</li>
 *   <li>{@link negocio.impl.PersonaImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaImpl extends ElementoNombradoImpl implements Persona {
	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentoComercial> documentos;

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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPersona TIPO_EDEFAULT = TipoPersona.JURIDICA;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoPersona tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negocio getNegocio() {
		if (eContainerFeatureID() != NegocioPackage.PERSONA__NEGOCIO) return null;
		return (Negocio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegocio(Negocio newNegocio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNegocio, NegocioPackage.PERSONA__NEGOCIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegocio(Negocio newNegocio) {
		if (newNegocio != eInternalContainer() || (eContainerFeatureID() != NegocioPackage.PERSONA__NEGOCIO && newNegocio != null)) {
			if (EcoreUtil.isAncestor(this, newNegocio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNegocio != null)
				msgs = ((InternalEObject)newNegocio).eInverseAdd(this, NegocioPackage.NEGOCIO__PERSONAS, Negocio.class, msgs);
			msgs = basicSetNegocio(newNegocio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PERSONA__NEGOCIO, newNegocio, newNegocio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentoComercial> getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectWithInverseResolvingEList.ManyInverse<DocumentoComercial>(DocumentoComercial.class, this, NegocioPackage.PERSONA__DOCUMENTOS, NegocioPackage.DOCUMENTO_COMERCIAL__PERSONAS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pago> getPagos() {
		if (pagos == null) {
			pagos = new EObjectWithInverseResolvingEList<Pago>(Pago.class, this, NegocioPackage.PERSONA__PAGOS, NegocioPackage.PAGO__PERSONA);
		}
		return pagos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPersona getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoPersona newTipo) {
		TipoPersona oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PERSONA__TIPO, oldTipo, tipo));
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
			case NegocioPackage.PERSONA__NEGOCIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNegocio((Negocio)otherEnd, msgs);
			case NegocioPackage.PERSONA__DOCUMENTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentos()).basicAdd(otherEnd, msgs);
			case NegocioPackage.PERSONA__PAGOS:
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
			case NegocioPackage.PERSONA__NEGOCIO:
				return basicSetNegocio(null, msgs);
			case NegocioPackage.PERSONA__DOCUMENTOS:
				return ((InternalEList<?>)getDocumentos()).basicRemove(otherEnd, msgs);
			case NegocioPackage.PERSONA__PAGOS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NegocioPackage.PERSONA__NEGOCIO:
				return eInternalContainer().eInverseRemove(this, NegocioPackage.NEGOCIO__PERSONAS, Negocio.class, msgs);
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
			case NegocioPackage.PERSONA__NEGOCIO:
				return getNegocio();
			case NegocioPackage.PERSONA__DOCUMENTOS:
				return getDocumentos();
			case NegocioPackage.PERSONA__PAGOS:
				return getPagos();
			case NegocioPackage.PERSONA__TIPO:
				return getTipo();
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
			case NegocioPackage.PERSONA__NEGOCIO:
				setNegocio((Negocio)newValue);
				return;
			case NegocioPackage.PERSONA__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection<? extends DocumentoComercial>)newValue);
				return;
			case NegocioPackage.PERSONA__PAGOS:
				getPagos().clear();
				getPagos().addAll((Collection<? extends Pago>)newValue);
				return;
			case NegocioPackage.PERSONA__TIPO:
				setTipo((TipoPersona)newValue);
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
			case NegocioPackage.PERSONA__NEGOCIO:
				setNegocio((Negocio)null);
				return;
			case NegocioPackage.PERSONA__DOCUMENTOS:
				getDocumentos().clear();
				return;
			case NegocioPackage.PERSONA__PAGOS:
				getPagos().clear();
				return;
			case NegocioPackage.PERSONA__TIPO:
				setTipo(TIPO_EDEFAULT);
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
			case NegocioPackage.PERSONA__NEGOCIO:
				return getNegocio() != null;
			case NegocioPackage.PERSONA__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
			case NegocioPackage.PERSONA__PAGOS:
				return pagos != null && !pagos.isEmpty();
			case NegocioPackage.PERSONA__TIPO:
				return tipo != TIPO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
