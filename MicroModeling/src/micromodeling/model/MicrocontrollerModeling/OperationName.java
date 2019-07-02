/**
 */
package micromodeling.model.MicrocontrollerModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getOperationName()
 * @model
 * @generated
 */
public enum OperationName implements Enumerator {
	/**
	 * The '<em><b>Digital Pin Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_PIN_READ_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_PIN_READ(0, "digitalPinRead", "digitalPinRead"),

	/**
	 * The '<em><b>Digital Pin Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_PIN_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_PIN_WRITE(1, "digitalPinWrite", "digitalPinWrite"),

	/**
	 * The '<em><b>Analog Pin Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_PIN_READ_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_PIN_READ(2, "analogPinRead", "analogPinRead"),

	/**
	 * The '<em><b>Analog Pin Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_PIN_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_PIN_WRITE(3, "analogPinWrite", "analogPinWrite"),

	/**
	 * The '<em><b>Pin Config Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_CONFIG_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_CONFIG_MODE(4, "pinConfigMode", "pinConfigMode");

	/**
	 * The '<em><b>Digital Pin Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital Pin Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_PIN_READ
	 * @model name="digitalPinRead"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_PIN_READ_VALUE = 0;

	/**
	 * The '<em><b>Digital Pin Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital Pin Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_PIN_WRITE
	 * @model name="digitalPinWrite"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_PIN_WRITE_VALUE = 1;

	/**
	 * The '<em><b>Analog Pin Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analog Pin Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALOG_PIN_READ
	 * @model name="analogPinRead"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_PIN_READ_VALUE = 2;

	/**
	 * The '<em><b>Analog Pin Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analog Pin Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALOG_PIN_WRITE
	 * @model name="analogPinWrite"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_PIN_WRITE_VALUE = 3;

	/**
	 * The '<em><b>Pin Config Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pin Config Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_CONFIG_MODE
	 * @model name="pinConfigMode"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_CONFIG_MODE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Operation Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationName[] VALUES_ARRAY =
		new OperationName[] {
			DIGITAL_PIN_READ,
			DIGITAL_PIN_WRITE,
			ANALOG_PIN_READ,
			ANALOG_PIN_WRITE,
			PIN_CONFIG_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationName get(int value) {
		switch (value) {
			case DIGITAL_PIN_READ_VALUE: return DIGITAL_PIN_READ;
			case DIGITAL_PIN_WRITE_VALUE: return DIGITAL_PIN_WRITE;
			case ANALOG_PIN_READ_VALUE: return ANALOG_PIN_READ;
			case ANALOG_PIN_WRITE_VALUE: return ANALOG_PIN_WRITE;
			case PIN_CONFIG_MODE_VALUE: return PIN_CONFIG_MODE;
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
	private OperationName(int value, String name, String literal) {
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
	
} //OperationName
