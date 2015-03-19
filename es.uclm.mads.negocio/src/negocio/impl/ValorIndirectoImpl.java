/**
 */
package negocio.impl;

import negocio.DocumentoComercial;
import negocio.NegocioPackage;
import negocio.ValorIndirecto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Indirecto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.ValorIndirectoImpl#getJustificante <em>Justificante</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValorIndirectoImpl extends ValorImpl implements ValorIndirecto {
	/**
	 * The cached value of the '{@link #getJustificante() <em>Justificante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificante()
	 * @generated
	 * @ordered
	 */
	protected DocumentoComercial justificante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValorIndirectoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.VALOR_INDIRECTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercial getJustificante() {
		if (justificante != null && justificante.eIsProxy()) {
			InternalEObject oldJustificante = (InternalEObject)justificante;
			justificante = (DocumentoComercial)eResolveProxy(oldJustificante);
			if (justificante != oldJustificante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE, oldJustificante, justificante));
			}
		}
		return justificante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoComercial basicGetJustificante() {
		return justificante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJustificante(DocumentoComercial newJustificante, NotificationChain msgs) {
		DocumentoComercial oldJustificante = justificante;
		justificante = newJustificante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE, oldJustificante, newJustificante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustificante(DocumentoComercial newJustificante) {
		if (newJustificante != justificante) {
			NotificationChain msgs = null;
			if (justificante != null)
				msgs = ((InternalEObject)justificante).eInverseRemove(this, NegocioPackage.DOCUMENTO_COMERCIAL__VALORES, DocumentoComercial.class, msgs);
			if (newJustificante != null)
				msgs = ((InternalEObject)newJustificante).eInverseAdd(this, NegocioPackage.DOCUMENTO_COMERCIAL__VALORES, DocumentoComercial.class, msgs);
			msgs = basicSetJustificante(newJustificante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE, newJustificante, newJustificante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				if (justificante != null)
					msgs = ((InternalEObject)justificante).eInverseRemove(this, NegocioPackage.DOCUMENTO_COMERCIAL__VALORES, DocumentoComercial.class, msgs);
				return basicSetJustificante((DocumentoComercial)otherEnd, msgs);
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
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				return basicSetJustificante(null, msgs);
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
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				if (resolve) return getJustificante();
				return basicGetJustificante();
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
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				setJustificante((DocumentoComercial)newValue);
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
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				setJustificante((DocumentoComercial)null);
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
			case NegocioPackage.VALOR_INDIRECTO__JUSTIFICANTE:
				return justificante != null;
		}
		return super.eIsSet(featureID);
	}

} //ValorIndirectoImpl
