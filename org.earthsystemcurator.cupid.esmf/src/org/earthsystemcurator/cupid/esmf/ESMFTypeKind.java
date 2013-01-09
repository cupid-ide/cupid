/**
 */
package org.earthsystemcurator.cupid.esmf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFTypeKind()
 * @model
 * @generated
 */
public enum ESMFTypeKind implements Enumerator {
	/**
	 * The '<em><b>ESMF TYPEKIND I1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I1_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_I1(0, "ESMF_TYPEKIND_I1", "ESMF_TYPEKIND_I1"),

	/**
	 * The '<em><b>ESMF TYPEKIND I2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I2_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_I2(1, "ESMF_TYPEKIND_I2", "ESMF_TYPEKIND_I2"),

	/**
	 * The '<em><b>ESMF TYPEKIND I4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I4_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_I4(2, "ESMF_TYPEKIND_I4", "ESMF_TYPEKIND_I4"),

	/**
	 * The '<em><b>ESMF TYPEKIND I8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I8_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_I8(3, "ESMF_TYPEKIND_I8", "ESMF_TYPEKIND_I8"),

	/**
	 * The '<em><b>ESMF TYPEKIND R4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_R4_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_R4(4, "ESMF_TYPEKIND_R4", "ESMF_TYPEKIND_R4"),

	/**
	 * The '<em><b>ESMF TYPEKIND R8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_R8_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_TYPEKIND_R8(5, "ESMF_TYPEKIND_R8", "ESMF_TYPEKIND_R8");

	/**
	 * The '<em><b>ESMF TYPEKIND I1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND I1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_I1_VALUE = 0;

	/**
	 * The '<em><b>ESMF TYPEKIND I2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND I2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_I2_VALUE = 1;

	/**
	 * The '<em><b>ESMF TYPEKIND I4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND I4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_I4_VALUE = 2;

	/**
	 * The '<em><b>ESMF TYPEKIND I8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND I8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_I8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_I8_VALUE = 3;

	/**
	 * The '<em><b>ESMF TYPEKIND R4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND R4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_R4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_R4_VALUE = 4;

	/**
	 * The '<em><b>ESMF TYPEKIND R8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF TYPEKIND R8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_TYPEKIND_R8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_TYPEKIND_R8_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESMFTypeKind[] VALUES_ARRAY =
		new ESMFTypeKind[] {
			ESMF_TYPEKIND_I1,
			ESMF_TYPEKIND_I2,
			ESMF_TYPEKIND_I4,
			ESMF_TYPEKIND_I8,
			ESMF_TYPEKIND_R4,
			ESMF_TYPEKIND_R8,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESMFTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFTypeKind get(int value) {
		switch (value) {
			case ESMF_TYPEKIND_I1_VALUE: return ESMF_TYPEKIND_I1;
			case ESMF_TYPEKIND_I2_VALUE: return ESMF_TYPEKIND_I2;
			case ESMF_TYPEKIND_I4_VALUE: return ESMF_TYPEKIND_I4;
			case ESMF_TYPEKIND_I8_VALUE: return ESMF_TYPEKIND_I8;
			case ESMF_TYPEKIND_R4_VALUE: return ESMF_TYPEKIND_R4;
			case ESMF_TYPEKIND_R8_VALUE: return ESMF_TYPEKIND_R8;
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
	private ESMFTypeKind(int value, String name, String literal) {
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
	
} //ESMFTypeKind
