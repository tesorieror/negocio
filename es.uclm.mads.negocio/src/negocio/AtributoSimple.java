/**
 */
package negocio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.AtributoSimple#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getAtributoSimple()
 * @model
 * @generated
 */
public interface AtributoSimple extends Atributo {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link negocio.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see negocio.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see negocio.NegocioPackage#getAtributoSimple_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link negocio.AtributoSimple#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see negocio.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

} // AtributoSimple
