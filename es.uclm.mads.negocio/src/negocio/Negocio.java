/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negocio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Negocio#getPersonas <em>Personas</em>}</li>
 *   <li>{@link negocio.Negocio#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link negocio.Negocio#getProductos <em>Productos</em>}</li>
 *   <li>{@link negocio.Negocio#getValores <em>Valores</em>}</li>
 *   <li>{@link negocio.Negocio#getPagos <em>Pagos</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getNegocio()
 * @model
 * @generated
 */
public interface Negocio extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Persona}.
	 * It is bidirectional and its opposite is '{@link negocio.Persona#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see negocio.NegocioPackage#getNegocio_Personas()
	 * @see negocio.Persona#getNegocio
	 * @model opposite="negocio" containment="true" required="true"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.DocumentoComercial}.
	 * It is bidirectional and its opposite is '{@link negocio.DocumentoComercial#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' containment reference list.
	 * @see negocio.NegocioPackage#getNegocio_Documentos()
	 * @see negocio.DocumentoComercial#getNegocio
	 * @model opposite="negocio" containment="true" required="true"
	 * @generated
	 */
	EList<DocumentoComercial> getDocumentos();

	/**
	 * Returns the value of the '<em><b>Productos</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Producto}.
	 * It is bidirectional and its opposite is '{@link negocio.Producto#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productos</em>' containment reference list.
	 * @see negocio.NegocioPackage#getNegocio_Productos()
	 * @see negocio.Producto#getNegocio
	 * @model opposite="negocio" containment="true" required="true"
	 * @generated
	 */
	EList<Producto> getProductos();

	/**
	 * Returns the value of the '<em><b>Valores</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Valor}.
	 * It is bidirectional and its opposite is '{@link negocio.Valor#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' containment reference list.
	 * @see negocio.NegocioPackage#getNegocio_Valores()
	 * @see negocio.Valor#getNegocio
	 * @model opposite="negocio" containment="true"
	 * @generated
	 */
	EList<Valor> getValores();

	/**
	 * Returns the value of the '<em><b>Pagos</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Pago}.
	 * It is bidirectional and its opposite is '{@link negocio.Pago#getNegocio <em>Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagos</em>' containment reference list.
	 * @see negocio.NegocioPackage#getNegocio_Pagos()
	 * @see negocio.Pago#getNegocio
	 * @model opposite="negocio" containment="true"
	 * @generated
	 */
	EList<Pago> getPagos();

} // Negocio
