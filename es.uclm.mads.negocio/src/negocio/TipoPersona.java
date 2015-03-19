/**
 */
package negocio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Persona</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see negocio.NegocioPackage#getTipoPersona()
 * @model
 * @generated
 */
public enum TipoPersona implements Enumerator {
	/**
	 * The '<em><b>JURIDICA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JURIDICA_VALUE
	 * @generated
	 * @ordered
	 */
	JURIDICA(0, "JURIDICA", "JURIDICA"),

	/**
	 * The '<em><b>FISICA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISICA_VALUE
	 * @generated
	 * @ordered
	 */
	FISICA(1, "FISICA", "FISICA");

	/**
	 * The '<em><b>JURIDICA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JURIDICA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JURIDICA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JURIDICA_VALUE = 0;

	/**
	 * The '<em><b>FISICA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FISICA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FISICA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FISICA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tipo Persona</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPersona[] VALUES_ARRAY =
		new TipoPersona[] {
			JURIDICA,
			FISICA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Persona</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPersona> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Persona</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPersona get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPersona result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Persona</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPersona getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPersona result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Persona</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPersona get(int value) {
		switch (value) {
			case JURIDICA_VALUE: return JURIDICA;
			case FISICA_VALUE: return FISICA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoPersona(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoPersona
