/**
 */
package negocio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Pago#getDocumento <em>Documento</em>}</li>
 *   <li>{@link negocio.Pago#getPersona <em>Persona</em>}</li>
 *   <li>{@link negocio.Pago#getValor <em>Valor</em>}</li>
 *   <li>{@link negocio.Pago#getNegocio <em>Negocio</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getPago()
 * @model
 * @generated
 */
public interface Pago extends EObject {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link negocio.DocumentoComercial#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference.
	 * @see #setDocumento(DocumentoComercial)
	 * @see negocio.NegocioPackage#getPago_Documento()
	 * @see negocio.DocumentoComercial#getPagos
	 * @model opposite="pagos" required="true"
	 * @generated
	 */
	DocumentoComercial getDocumento();

	/**
	 * Sets the value of the '{@link negocio.Pago#getDocumento <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(DocumentoComercial value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link negocio.Persona#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see negocio.NegocioPackage#getPago_Persona()
	 * @see negocio.Persona#getPagos
	 * @model opposite="pagos" required="true"
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link negocio.Pago#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link negocio.Valor#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' reference.
	 * @see #setValor(Valor)
	 * @see negocio.NegocioPackage#getPago_Valor()
	 * @see negocio.Valor#getPagos
	 * @model opposite="pagos" required="true"
	 * @generated
	 */
	Valor getValor();

	/**
	 * Sets the value of the '{@link negocio.Pago#getValor <em>Valor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' reference.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(Valor value);

	/**
	 * Returns the value of the '<em><b>Negocio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Negocio#getPagos <em>Pagos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negocio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negocio</em>' container reference.
	 * @see #setNegocio(Negocio)
	 * @see negocio.NegocioPackage#getPago_Negocio()
	 * @see negocio.Negocio#getPagos
	 * @model opposite="pagos" required="true" transient="false"
	 * @generated
	 */
	Negocio getNegocio();

	/**
	 * Sets the value of the '{@link negocio.Pago#getNegocio <em>Negocio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negocio</em>' container reference.
	 * @see #getNegocio()
	 * @generated
	 */
	void setNegocio(Negocio value);

} // Pago
