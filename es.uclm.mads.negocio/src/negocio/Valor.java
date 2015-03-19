/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.Valor#getNegocio <em>Negocio</em>}</li>
 *   <li>{@link negocio.Valor#getPagos <em>Pagos</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getValor()
 * @model abstract="true"
 * @generated
 */
public interface Valor extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Negocio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link negocio.Negocio#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negocio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negocio</em>' container reference.
	 * @see #setNegocio(Negocio)
	 * @see negocio.NegocioPackage#getValor_Negocio()
	 * @see negocio.Negocio#getValores
	 * @model opposite="valores" required="true" transient="false"
	 * @generated
	 */
	Negocio getNegocio();

	/**
	 * Sets the value of the '{@link negocio.Valor#getNegocio <em>Negocio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negocio</em>' container reference.
	 * @see #getNegocio()
	 * @generated
	 */
	void setNegocio(Negocio value);

	/**
	 * Returns the value of the '<em><b>Pagos</b></em>' reference list.
	 * The list contents are of type {@link negocio.Pago}.
	 * It is bidirectional and its opposite is '{@link negocio.Pago#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagos</em>' reference list.
	 * @see negocio.NegocioPackage#getValor_Pagos()
	 * @see negocio.Pago#getValor
	 * @model opposite="valor" required="true"
	 * @generated
	 */
	EList<Pago> getPagos();

} // Valor
