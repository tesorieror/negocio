/**
 */
package negocio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link negocio.Atributo#getCardinalidad <em>Cardinalidad</em>}</li>
 *   <li>{@link negocio.Atributo#getElemento <em>Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getAtributo()
 * @model abstract="true"
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see negocio.NegocioPackage#getAtributo_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link negocio.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Cardinalidad</b></em>' attribute.
	 * The literals are from the enumeration {@link negocio.TipoCardinalidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalidad</em>' attribute.
	 * @see negocio.TipoCardinalidad
	 * @see #setCardinalidad(TipoCardinalidad)
	 * @see negocio.NegocioPackage#getAtributo_Cardinalidad()
	 * @model required="true"
	 * @generated
	 */
	TipoCardinalidad getCardinalidad();

	/**
	 * Sets the value of the '{@link negocio.Atributo#getCardinalidad <em>Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalidad</em>' attribute.
	 * @see negocio.TipoCardinalidad
	 * @see #getCardinalidad()
	 * @generated
	 */
	void setCardinalidad(TipoCardinalidad value);

	/**
	 * Returns the value of the '<em><b>Elemento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Elemento#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento</em>' container reference.
	 * @see #setElemento(Elemento)
	 * @see negocio.NegocioPackage#getAtributo_Elemento()
	 * @see negocio.Elemento#getAtributos
	 * @model opposite="atributos" transient="false"
	 * @generated
	 */
	Elemento getElemento();

	/**
	 * Sets the value of the '{@link negocio.Atributo#getElemento <em>Elemento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento</em>' container reference.
	 * @see #getElemento()
	 * @generated
	 */
	void setElemento(Elemento value);

} // Atributo
