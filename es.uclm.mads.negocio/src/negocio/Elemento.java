/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Elemento#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link negocio.Elemento#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getElemento()
 * @model abstract="true"
 * @generated
 */
public interface Elemento extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Atributo}.
	 * It is bidirectional and its opposite is '{@link negocio.Atributo#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see negocio.NegocioPackage#getElemento_Atributos()
	 * @see negocio.Atributo#getElemento
	 * @model opposite="elemento" containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see negocio.NegocioPackage#getElemento_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link negocio.Elemento#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // Elemento
