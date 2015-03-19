/**
 */
package negocio.impl;

import negocio.Atributo;
import negocio.Elemento;
import negocio.NegocioPackage;
import negocio.TipoCardinalidad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link negocio.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link negocio.impl.AtributoImpl#getCardinalidad <em>Cardinalidad</em>}</li>
 *   <li>{@link negocio.impl.AtributoImpl#getElemento <em>Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalidad() <em>Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidad()
	 * @generated
	 * @ordered
	 */
	protected static final TipoCardinalidad CARDINALIDAD_EDEFAULT = TipoCardinalidad.MULTIPLE;

	/**
	 * The cached value of the '{@link #getCardinalidad() <em>Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidad()
	 * @generated
	 * @ordered
	 */
	protected TipoCardinalidad cardinalidad = CARDINALIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NegocioPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCardinalidad getCardinalidad() {
		return cardinalidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalidad(TipoCardinalidad newCardinalidad) {
		TipoCardinalidad oldCardinalidad = cardinalidad;
		cardinalidad = newCardinalidad == null ? CARDINALIDAD_EDEFAULT : newCardinalidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.ATRIBUTO__CARDINALIDAD, oldCardinalidad, cardinalidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getElemento() {
		if (eContainerFeatureID() != NegocioPackage.ATRIBUTO__ELEMENTO) return null;
		return (Elemento)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElemento(Elemento newElemento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElemento, NegocioPackage.ATRIBUTO__ELEMENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento(Elemento newElemento) {
		if (newElemento != eInternalContainer() || (eContainerFeatureID() != NegocioPackage.ATRIBUTO__ELEMENTO && newElemento != null)) {
			if (EcoreUtil.isAncestor(this, newElemento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElemento != null)
				msgs = ((InternalEObject)newElemento).eInverseAdd(this, NegocioPackage.ELEMENTO__ATRIBUTOS, Elemento.class, msgs);
			msgs = basicSetElemento(newElemento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NegocioPackage.ATRIBUTO__ELEMENTO, newElemento, newElemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElemento((Elemento)otherEnd, msgs);
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
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				return basicSetElemento(null, msgs);
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
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				return eInternalContainer().eInverseRemove(this, NegocioPackage.ELEMENTO__ATRIBUTOS, Elemento.class, msgs);
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
			case NegocioPackage.ATRIBUTO__NOMBRE:
				return getNombre();
			case NegocioPackage.ATRIBUTO__CARDINALIDAD:
				return getCardinalidad();
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				return getElemento();
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
			case NegocioPackage.ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case NegocioPackage.ATRIBUTO__CARDINALIDAD:
				setCardinalidad((TipoCardinalidad)newValue);
				return;
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				setElemento((Elemento)newValue);
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
			case NegocioPackage.ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case NegocioPackage.ATRIBUTO__CARDINALIDAD:
				setCardinalidad(CARDINALIDAD_EDEFAULT);
				return;
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				setElemento((Elemento)null);
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
			case NegocioPackage.ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case NegocioPackage.ATRIBUTO__CARDINALIDAD:
				return cardinalidad != CARDINALIDAD_EDEFAULT;
			case NegocioPackage.ATRIBUTO__ELEMENTO:
				return getElemento() != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", cardinalidad: ");
		result.append(cardinalidad);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
