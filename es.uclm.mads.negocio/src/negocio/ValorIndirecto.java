/**
 */
package negocio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Indirecto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.ValorIndirecto#getJustificante <em>Justificante</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getValorIndirecto()
 * @model
 * @generated
 */
public interface ValorIndirecto extends Valor {
	/**
	 * Returns the value of the '<em><b>Justificante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link negocio.DocumentoComercial#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justificante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justificante</em>' reference.
	 * @see #setJustificante(DocumentoComercial)
	 * @see negocio.NegocioPackage#getValorIndirecto_Justificante()
	 * @see negocio.DocumentoComercial#getValores
	 * @model opposite="valores" required="true"
	 * @generated
	 */
	DocumentoComercial getJustificante();

	/**
	 * Sets the value of the '{@link negocio.ValorIndirecto#getJustificante <em>Justificante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justificante</em>' reference.
	 * @see #getJustificante()
	 * @generated
	 */
	void setJustificante(DocumentoComercial value);

} // ValorIndirecto
