/**
 */
package negocio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Dato</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see negocio.NegocioPackage#getTipoDato()
 * @model
 * @generated
 */
public enum TipoDato implements Enumerator {
	/**
	 * The '<em><b>ENTERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERO_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERO(0, "ENTERO", "ENTERO"),

	/**
	 * The '<em><b>TEXTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTO_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTO(1, "TEXTO", "TEXTO"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(2, "REAL", "REAL"),

	/**
	 * The '<em><b>FECHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA(3, "FECHA", "FECHA"),

	/**
	 * The '<em><b>MONEDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEDA_VALUE
	 * @generated
	 * @ordered
	 */
	MONEDA(4, "MONEDA", "MONEDA");

	/**
	 * The '<em><b>ENTERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTERO_VALUE = 0;

	/**
	 * The '<em><b>TEXTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTO_VALUE = 1;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 2;

	/**
	 * The '<em><b>FECHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FECHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_VALUE = 3;

	/**
	 * The '<em><b>MONEDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONEDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONEDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONEDA_VALUE = 4;

	/**
	 * An array of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoDato[] VALUES_ARRAY =
		new TipoDato[] {
			ENTERO,
			TEXTO,
			REAL,
			FECHA,
			MONEDA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoDato> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDato get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDato getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDato get(int value) {
		switch (value) {
			case ENTERO_VALUE: return ENTERO;
			case TEXTO_VALUE: return TEXTO;
			case REAL_VALUE: return REAL;
			case FECHA_VALUE: return FECHA;
			case MONEDA_VALUE: return MONEDA;
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
	private TipoDato(int value, String name, String literal) {
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
	
} //TipoDato
