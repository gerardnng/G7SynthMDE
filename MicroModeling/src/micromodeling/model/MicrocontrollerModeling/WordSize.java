/**
 */
package micromodeling.model.MicrocontrollerModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Word Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getWordSize()
 * @model
 * @generated
 */
public enum WordSize implements Enumerator {
	/**
	 * The '<em><b>Wd 8bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_8BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_8BITS(0, "wd_8bits", "wd_8bits"),

	/**
	 * The '<em><b>Wd 16bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_16BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_16BITS(1, "wd_16bits", "wd_16bits"),

	/**
	 * The '<em><b>Wd 24bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_24BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_24BITS(2, "wd_24bits", "wd_24bits"),

	/**
	 * The '<em><b>Wd 32bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_32BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_32BITS(3, "wd_32bits", "wd_32bits"),

	/**
	 * The '<em><b>Wd 48bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_48BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_48BITS(4, "wd_48bits", "wd_48bits"),

	/**
	 * The '<em><b>Wd 64bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_64BITS_VALUE
	 * @generated
	 * @ordered
	 */
	WD_64BITS(5, "wd_64bits", "wd_64bits");

	/**
	 * The '<em><b>Wd 8bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 8bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_8BITS
	 * @model name="wd_8bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_8BITS_VALUE = 0;

	/**
	 * The '<em><b>Wd 16bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 16bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_16BITS
	 * @model name="wd_16bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_16BITS_VALUE = 1;

	/**
	 * The '<em><b>Wd 24bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 24bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_24BITS
	 * @model name="wd_24bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_24BITS_VALUE = 2;

	/**
	 * The '<em><b>Wd 32bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 32bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_32BITS
	 * @model name="wd_32bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_32BITS_VALUE = 3;

	/**
	 * The '<em><b>Wd 48bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 48bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_48BITS
	 * @model name="wd_48bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_48BITS_VALUE = 4;

	/**
	 * The '<em><b>Wd 64bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wd 64bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD_64BITS
	 * @model name="wd_64bits"
	 * @generated
	 * @ordered
	 */
	public static final int WD_64BITS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Word Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WordSize[] VALUES_ARRAY =
		new WordSize[] {
			WD_8BITS,
			WD_16BITS,
			WD_24BITS,
			WD_32BITS,
			WD_48BITS,
			WD_64BITS,
		};

	/**
	 * A public read-only list of all the '<em><b>Word Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WordSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Word Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WordSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WordSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Word Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WordSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WordSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Word Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WordSize get(int value) {
		switch (value) {
			case WD_8BITS_VALUE: return WD_8BITS;
			case WD_16BITS_VALUE: return WD_16BITS;
			case WD_24BITS_VALUE: return WD_24BITS;
			case WD_32BITS_VALUE: return WD_32BITS;
			case WD_48BITS_VALUE: return WD_48BITS;
			case WD_64BITS_VALUE: return WD_64BITS;
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
	private WordSize(int value, String name, String literal) {
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
	
} //WordSize
