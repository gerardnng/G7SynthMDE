/**
 */
package grafcetmodeling.model.grafcetModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stored Moment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStoredMoment()
 * @model
 * @generated
 */
public enum StoredMoment implements Enumerator {
	/**
	 * The '<em><b>Activation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATION(0, "Activation", "Activation"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>De Activation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	DE_ACTIVATION(1, "DeActivation", "DeActivation"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Activation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION
	 * @model name="Activation"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATION_VALUE = 0;

	/**
	 * The '<em><b>De Activation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>De Activation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DE_ACTIVATION
	 * @model name="DeActivation"
	 * @generated
	 * @ordered
	 */
	public static final int DE_ACTIVATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Stored Moment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StoredMoment[] VALUES_ARRAY =
		new StoredMoment[] {
			ACTIVATION,
			DE_ACTIVATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Stored Moment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StoredMoment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stored Moment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StoredMoment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StoredMoment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stored Moment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StoredMoment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StoredMoment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stored Moment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StoredMoment get(int value) {
		switch (value) {
			case ACTIVATION_VALUE: return ACTIVATION;
			case DE_ACTIVATION_VALUE: return DE_ACTIVATION;
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
	private StoredMoment(int value, String name, String literal) {
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
	
} //StoredMoment
