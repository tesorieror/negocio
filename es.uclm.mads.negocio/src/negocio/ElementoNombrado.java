/**
 */
package negocio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Nombrado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.ElementoNombrado#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getElementoNombrado()
 * @model abstract="true"
 * @generated
 */
public interface ElementoNombrado extends Elemento {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>"Elemento"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see negocio.NegocioPackage#getElementoNombrado_Nombre()
	 * @model default="Elemento" required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link negocio.ElementoNombrado#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // ElementoNombrado
