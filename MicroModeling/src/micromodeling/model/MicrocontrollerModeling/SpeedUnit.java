/**
 */
package micromodeling.model.MicrocontrollerModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Speed Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getSpeedUnit()
 * @model
 * @generated
 */
public enum SpeedUnit implements Enumerator {
	/**
	 * The '<em><b>Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HZ(0, "Hz", "Hz"),

	/**
	 * The '<em><b>Mhz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MHZ_VALUE
	 * @generated
	 * @ordered
	 */
	MHZ(1, "Mhz", "Mhz"),

	/**
	 * The '<em><b>GHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ(2, "GHz", "GHz"), /**
	 * The '<em><b>MIPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIPS_VALUE
	 * @generated
	 * @ordered
	 */
	MIPS(3, "MIPS", "MIPS");

	/**
	 * The '<em><b>Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HZ
	 * @model name="Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HZ_VALUE = 0;

	/**
	 * The '<em><b>Mhz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mhz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MHZ
	 * @model name="Mhz"
	 * @generated
	 * @ordered
	 */
	public static final int MHZ_VALUE = 1;

	/**
	 * The '<em><b>GHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GHz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GHZ
	 * @model name="GHz"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_VALUE = 2;

	/**
	 * The '<em><b>MIPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIPS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Speed Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpeedUnit[] VALUES_ARRAY =
		new SpeedUnit[] {
			HZ,
			MHZ,
			GHZ,
			MIPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Speed Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpeedUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Speed Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeedUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speed Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeedUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speed Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnit get(int value) {
		switch (value) {
			case HZ_VALUE: return HZ;
			case MHZ_VALUE: return MHZ;
			case GHZ_VALUE: return GHZ;
			case MIPS_VALUE: return MIPS;
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
	private SpeedUnit(int value, String name, String literal) {
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
	
} //SpeedUnit
