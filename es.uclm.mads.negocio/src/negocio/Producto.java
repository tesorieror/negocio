/**
 */
package negocio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Producto#getNegocio <em>Negocio</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Negocio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Negocio#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negocio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negocio</em>' container reference.
	 * @see #setNegocio(Negocio)
	 * @see negocio.NegocioPackage#getProducto_Negocio()
	 * @see negocio.Negocio#getProductos
	 * @model opposite="productos" required="true" transient="false"
	 * @generated
	 */
	Negocio getNegocio();

	/**
	 * Sets the value of the '{@link negocio.Producto#getNegocio <em>Negocio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negocio</em>' container reference.
	 * @see #getNegocio()
	 * @generated
	 */
	void setNegocio(Negocio value);

} // Producto
