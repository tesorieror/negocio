/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documento Comercial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.DocumentoComercial#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.DocumentoComercial#getProducto <em>Producto</em>}</li>
 *   <li>{@link negocio.DocumentoComercial#getPersonas <em>Personas</em>}</li>
 *   <li>{@link negocio.DocumentoComercial#getPagos <em>Pagos</em>}</li>
 *   <li>{@link negocio.DocumentoComercial#getValores <em>Valores</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getDocumentoComercial()
 * @model
 * @generated
 */
public interface DocumentoComercial extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Negocio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Negocio#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negocio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negocio</em>' container reference.
	 * @see #setNegocio(Negocio)
	 * @see negocio.NegocioPackage#getDocumentoComercial_Negocio()
	 * @see negocio.Negocio#getDocumentos
	 * @model opposite="documentos" required="true" transient="false"
	 * @generated
	 */
	Negocio getNegocio();

	/**
	 * Sets the value of the '{@link negocio.DocumentoComercial#getNegocio <em>Negocio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negocio</em>' container reference.
	 * @see #getNegocio()
	 * @generated
	 */
	void setNegocio(Negocio value);

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' reference list.
	 * The list contents are of type {@link negocio.Producto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' reference list.
	 * @see negocio.NegocioPackage#getDocumentoComercial_Producto()
	 * @model
	 * @generated
	 */
	EList<Producto> getProducto();

	/**
	 * Returns the value of the '<em><b>Personas</b></em>' reference list.
	 * The list contents are of type {@link negocio.Persona}.
	 * It is bidirectional and its opposite is '{@link negocio.Persona#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' reference list.
	 * @see negocio.NegocioPackage#getDocumentoComercial_Personas()
	 * @see negocio.Persona#getDocumentos
	 * @model opposite="documentos"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Pagos</b></em>' reference list.
	 * The list contents are of type {@link negocio.Pago}.
	 * It is bidirectional and its opposite is '{@link negocio.Pago#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagos</em>' reference list.
	 * @see negocio.NegocioPackage#getDocumentoComercial_Pagos()
	 * @see negocio.Pago#getDocumento
	 * @model opposite="documento"
	 * @generated
	 */
	EList<Pago> getPagos();

	/**
	 * Returns the value of the '<em><b>Valores</b></em>' reference list.
	 * The list contents are of type {@link negocio.ValorIndirecto}.
	 * It is bidirectional and its opposite is '{@link negocio.ValorIndirecto#getJustificante <em>Justificante</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' reference list.
	 * @see negocio.NegocioPackage#getDocumentoComercial_Valores()
	 * @see negocio.ValorIndirecto#getJustificante
	 * @model opposite="justificante"
	 * @generated
	 */
	EList<ValorIndirecto> getValores();

} // DocumentoComercial
