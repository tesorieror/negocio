/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Persona#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.Persona#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link negocio.Persona#getPagos <em>Pagos</em>}</li>
 *   <li>{@link negocio.Persona#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Negocio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Negocio#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negocio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negocio</em>' container reference.
	 * @see #setNegocio(Negocio)
	 * @see negocio.NegocioPackage#getPersona_Negocio()
	 * @see negocio.Negocio#getPersonas
	 * @model opposite="personas" required="true" transient="false"
	 * @generated
	 */
	Negocio getNegocio();

	/**
	 * Sets the value of the '{@link negocio.Persona#getNegocio <em>Negocio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negocio</em>' container reference.
	 * @see #getNegocio()
	 * @generated
	 */
	void setNegocio(Negocio value);

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link negocio.DocumentoComercial}.
	 * It is bidirectional and its opposite is '{@link negocio.DocumentoComercial#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see negocio.NegocioPackage#getPersona_Documentos()
	 * @see negocio.DocumentoComercial#getPersonas
	 * @model opposite="personas"
	 * @generated
	 */
	EList<DocumentoComercial> getDocumentos();

	/**
	 * Returns the value of the '<em><b>Pagos</b></em>' reference list.
	 * The list contents are of type {@link negocio.Pago}.
	 * It is bidirectional and its opposite is '{@link negocio.Pago#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagos</em>' reference list.
	 * @see negocio.NegocioPackage#getPersona_Pagos()
	 * @see negocio.Pago#getPersona
	 * @model opposite="persona"
	 * @generated
	 */
	EList<Pago> getPagos();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link negocio.TipoPersona}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see negocio.TipoPersona
	 * @see #setTipo(TipoPersona)
	 * @see negocio.NegocioPackage#getPersona_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoPersona getTipo();

	/**
	 * Sets the value of the '{@link negocio.Persona#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see negocio.TipoPersona
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPersona value);

} // Persona
