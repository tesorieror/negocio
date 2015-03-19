/**
 */
package negocio.impl;

import negocio.DocumentoComercial;
import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Persona;
import negocio.Valor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.PagoImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link negocio.impl.PagoImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link negocio.impl.PagoImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link negocio.impl.PagoImpl#getNegocio <em>Negocio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagoImpl extends MinimalEObjectImpl.Container implements Pago {
	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected DocumentoComercial documento;

	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected Persona persona;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected Valor valor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.PAGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercial getDocumento() {
		if (documento != null && documento.eIsProxy()) {
			InternalEObject oldDocumento = (InternalEObject)documento;
			documento = (DocumentoComercial)eResolveProxy(oldDocumento);
			if (documento != oldDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NegocioPackage.PAGO__DOCUMENTO, oldDocumento, documento));
			}
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercial basicGetDocumento() {
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumento(DocumentoComercial newDocumento, NotificationChain msgs) {
		DocumentoComercial oldDocumento = documento;
		documento = newDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__DOCUMENTO, oldDocumento, newDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(DocumentoComercial newDocumento) {
		if (newDocumento != documento) {
			NotificationChain msgs = null;
			if (documento != null)
				msgs = ((InternalEObject)documento).eInverseRemove(this, NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS, DocumentoComercial.class, msgs);
			if (newDocumento != null)
				msgs = ((InternalEObject)newDocumento).eInverseAdd(this, NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS, DocumentoComercial.class, msgs);
			msgs = basicSetDocumento(newDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__DOCUMENTO, newDocumento, newDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getPersona() {
		if (persona != null && persona.eIsProxy()) {
			InternalEObject oldPersona = (InternalEObject)persona;
			persona = (Persona)eResolveProxy(oldPersona);
			if (persona != oldPersona) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NegocioPackage.PAGO__PERSONA, oldPersona, persona));
			}
		}
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetPersona() {
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersona(Persona newPersona, NotificationChain msgs) {
		Persona oldPersona = persona;
		persona = newPersona;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__PERSONA, oldPersona, newPersona);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(Persona newPersona) {
		if (newPersona != persona) {
			NotificationChain msgs = null;
			if (persona != null)
				msgs = ((InternalEObject)persona).eInverseRemove(this, NegocioPackage.PERSONA__PAGOS, Persona.class, msgs);
			if (newPersona != null)
				msgs = ((InternalEObject)newPersona).eInverseAdd(this, NegocioPackage.PERSONA__PAGOS, Persona.class, msgs);
			msgs = basicSetPersona(newPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__PERSONA, newPersona, newPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valor getValor() {
		if (valor != null && valor.eIsProxy()) {
			InternalEObject oldValor = (InternalEObject)valor;
			valor = (Valor)eResolveProxy(oldValor);
			if (valor != oldValor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NegocioPackage.PAGO__VALOR, oldValor, valor));
			}
		}
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valor basicGetValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValor(Valor newValor, NotificationChain msgs) {
		Valor oldValor = valor;
		valor = newValor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__VALOR, oldValor, newValor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(Valor newValor) {
		if (newValor != valor) {
			NotificationChain msgs = null;
			if (valor != null)
				msgs = ((InternalEObject)valor).eInverseRemove(this, NegocioPackage.VALOR__PAGOS, Valor.class, msgs);
			if (newValor != null)
				msgs = ((InternalEObject)newValor).eInverseAdd(this, NegocioPackage.VALOR__PAGOS, Valor.class, msgs);
			msgs = basicSetValor(newValor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__VALOR, newValor, newValor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negocio getNegocio() {
		if (eContainerFeatureID() != NegocioPackage.PAGO__NEGOCIO) return null;
		return (Negocio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegocio(Negocio newNegocio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNegocio, NegocioPackage.PAGO__NEGOCIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegocio(Negocio newNegocio) {
		if (newNegocio != eInternalContainer() || (eContainerFeatureID() != NegocioPackage.PAGO__NEGOCIO && newNegocio != null)) {
			if (EcoreUtil.isAncestor(this, newNegocio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNegocio != null)
				msgs = ((InternalEObject)newNegocio).eInverseAdd(this, NegocioPackage.NEGOCIO__PAGOS, Negocio.class, msgs);
			msgs = basicSetNegocio(newNegocio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.PAGO__NEGOCIO, newNegocio, newNegocio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NegocioPackage.PAGO__DOCUMENTO:
				if (documento != null)
					msgs = ((InternalEObject)documento).eInverseRemove(this, NegocioPackage.DOCUMENTO_COMERCIAL__PAGOS, DocumentoComercial.class, msgs);
				return basicSetDocumento((DocumentoComercial)otherEnd, msgs);
			case NegocioPackage.PAGO__PERSONA:
				if (persona != null)
					msgs = ((InternalEObject)persona).eInverseRemove(this, NegocioPackage.PERSONA__PAGOS, Persona.class, msgs);
				return basicSetPersona((Persona)otherEnd, msgs);
			case NegocioPackage.PAGO__VALOR:
				if (valor != null)
					msgs = ((InternalEObject)valor).eInverseRemove(this, NegocioPackage.VALOR__PAGOS, Valor.class, msgs);
				return basicSetValor((Valor)otherEnd, msgs);
			case NegocioPackage.PAGO__NEGOCIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNegocio((Negocio)otherEnd, msgs);
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
			case NegocioPackage.PAGO__DOCUMENTO:
				return basicSetDocumento(null, msgs);
			case NegocioPackage.PAGO__PERSONA:
				return basicSetPersona(null, msgs);
			case NegocioPackage.PAGO__VALOR:
				return basicSetValor(null, msgs);
			case NegocioPackage.PAGO__NEGOCIO:
				return basicSetNegocio(null, msgs);
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
			case NegocioPackage.PAGO__NEGOCIO:
				return eInternalContainer().eInverseRemove(this, NegocioPackage.NEGOCIO__PAGOS, Negocio.class, msgs);
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
			case NegocioPackage.PAGO__DOCUMENTO:
				if (resolve) return getDocumento();
				return basicGetDocumento();
			case NegocioPackage.PAGO__PERSONA:
				if (resolve) return getPersona();
				return basicGetPersona();
			case NegocioPackage.PAGO__VALOR:
				if (resolve) return getValor();
				return basicGetValor();
			case NegocioPackage.PAGO__NEGOCIO:
				return getNegocio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NegocioPackage.PAGO__DOCUMENTO:
				setDocumento((DocumentoComercial)newValue);
				return;
			case NegocioPackage.PAGO__PERSONA:
				setPersona((Persona)newValue);
				return;
			case NegocioPackage.PAGO__VALOR:
				setValor((Valor)newValue);
				return;
			case NegocioPackage.PAGO__NEGOCIO:
				setNegocio((Negocio)newValue);
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
			case NegocioPackage.PAGO__DOCUMENTO:
				setDocumento((DocumentoComercial)null);
				return;
			case NegocioPackage.PAGO__PERSONA:
				setPersona((Persona)null);
				return;
			case NegocioPackage.PAGO__VALOR:
				setValor((Valor)null);
				return;
			case NegocioPackage.PAGO__NEGOCIO:
				setNegocio((Negocio)null);
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
			case NegocioPackage.PAGO__DOCUMENTO:
				return documento != null;
			case NegocioPackage.PAGO__PERSONA:
				return persona != null;
			case NegocioPackage.PAGO__VALOR:
				return valor != null;
			case NegocioPackage.PAGO__NEGOCIO:
				return getNegocio() != null;
		}
		return super.eIsSet(featureID);
	}

} //PagoImpl
