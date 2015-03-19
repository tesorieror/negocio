/**
 */
package negocio.impl;

import java.util.Collection;

import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Valor;

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
 * An implementation of the model object '<em><b>Valor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.ValorImpl#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.impl.ValorImpl#getPagos <em>Pagos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValorImpl extends ElementoNombradoImpl implements Valor {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.VALOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negocio getNegocio() {
		if (eContainerFeatureID() != NegocioPackage.VALOR__NEGOCIO) return null;
		return (Negocio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegocio(Negocio newNegocio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNegocio, NegocioPackage.VALOR__NEGOCIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegocio(Negocio newNegocio) {
		if (newNegocio != eInternalContainer() || (eContainerFeatureID() != NegocioPackage.VALOR__NEGOCIO && newNegocio != null)) {
			if (EcoreUtil.isAncestor(this, newNegocio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNegocio != null)
				msgs = ((InternalEObject)newNegocio).eInverseAdd(this, NegocioPackage.NEGOCIO__VALORES, Negocio.class, msgs);
			msgs = basicSetNegocio(newNegocio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.VALOR__NEGOCIO, newNegocio, newNegocio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pago> getPagos() {
		if (pagos == null) {
			pagos = new EObjectWithInverseResolvingEList<Pago>(Pago.class, this, NegocioPackage.VALOR__PAGOS, NegocioPackage.PAGO__VALOR);
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
			case NegocioPackage.VALOR__NEGOCIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNegocio((Negocio)otherEnd, msgs);
			case NegocioPackage.VALOR__PAGOS:
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
			case NegocioPackage.VALOR__NEGOCIO:
				return basicSetNegocio(null, msgs);
			case NegocioPackage.VALOR__PAGOS:
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
			case NegocioPackage.VALOR__NEGOCIO:
				return eInternalContainer().eInverseRemove(this, NegocioPackage.NEGOCIO__VALORES, Negocio.class, msgs);
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
			case NegocioPackage.VALOR__NEGOCIO:
				return getNegocio();
			case NegocioPackage.VALOR__PAGOS:
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
			case NegocioPackage.VALOR__NEGOCIO:
				setNegocio((Negocio)newValue);
				return;
			case NegocioPackage.VALOR__PAGOS:
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
			case NegocioPackage.VALOR__NEGOCIO:
				setNegocio((Negocio)null);
				return;
			case NegocioPackage.VALOR__PAGOS:
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
			case NegocioPackage.VALOR__NEGOCIO:
				return getNegocio() != null;
			case NegocioPackage.VALOR__PAGOS:
				return pagos != null && !pagos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValorImpl
