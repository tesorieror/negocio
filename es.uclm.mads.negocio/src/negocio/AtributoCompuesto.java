/**
 */
package negocio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Compuesto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link negocio.AtributoCompuesto#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @see negocio.NegocioPackage#getAtributoCompuesto()
 * @model
 * @generated
 */
public interface AtributoCompuesto extends Atributo {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link negocio.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see negocio.NegocioPackage#getAtributoCompuesto_Atributos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

} // AtributoCompuesto
