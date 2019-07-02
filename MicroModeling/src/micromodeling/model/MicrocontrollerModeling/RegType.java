/**
 */
package micromodeling.model.MicrocontrollerModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reg Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#getRegType()
 * @model
 * @generated
 */
public enum RegType implements Enumerator {
	/**
	 * The '<em><b>Accumulator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCUMULATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACCUMULATOR(0, "accumulator", "accumulator"),

	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL(1, "general", "general"),

	/**
	 * The '<em><b>PCounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PCOUNTER(2, "PCounter", "PCounter"),

	/**
	 * The '<em><b>Stack</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACK_VALUE
	 * @generated
	 * @ordered
	 */
	STACK(3, "Stack", "Stack"),

	/**
	 * The '<em><b>CCR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCR_VALUE
	 * @generated
	 * @ordered
	 */
	CCR(4, "CCR", "CCR"),

	/**
	 * The '<em><b>ICR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICR_VALUE
	 * @generated
	 * @ordered
	 */
	ICR(5, "ICR", "ICR"),

	/**
	 * The '<em><b>IR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IR_VALUE
	 * @generated
	 * @ordered
	 */
	IR(6, "IR", "IR");

	/**
	 * The '<em><b>Accumulator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accumulator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCUMULATOR
	 * @model name="accumulator"
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE = 0;

	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @model name="general"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_VALUE = 1;

	/**
	 * The '<em><b>PCounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PCounter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCOUNTER
	 * @model name="PCounter"
	 * @generated
	 * @ordered
	 */
	public static final int PCOUNTER_VALUE = 2;

	/**
	 * The '<em><b>Stack</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stack</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STACK
	 * @model name="Stack"
	 * @generated
	 * @ordered
	 */
	public static final int STACK_VALUE = 3;

	/**
	 * The '<em><b>CCR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CCR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CCR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CCR_VALUE = 4;

	/**
	 * The '<em><b>ICR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICR_VALUE = 5;

	/**
	 * The '<em><b>IR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reg Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegType[] VALUES_ARRAY =
		new RegType[] {
			ACCUMULATOR,
			GENERAL,
			PCOUNTER,
			STACK,
			CCR,
			ICR,
			IR,
		};

	/**
	 * A public read-only list of all the '<em><b>Reg Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reg Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reg Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reg Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegType get(int value) {
		switch (value) {
			case ACCUMULATOR_VALUE: return ACCUMULATOR;
			case GENERAL_VALUE: return GENERAL;
			case PCOUNTER_VALUE: return PCOUNTER;
			case STACK_VALUE: return STACK;
			case CCR_VALUE: return CCR;
			case ICR_VALUE: return ICR;
			case IR_VALUE: return IR;
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
	private RegType(int value, String name, String literal) {
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
	
} //RegType
