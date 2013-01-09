/**
 */
package org.earthsystemcurator.cupid.esmf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCalKind()
 * @model
 * @generated
 */
public enum ESMFCalKind implements Enumerator {
	/**
	 * The '<em><b>ESMF CALKIND GREGORIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_CALKIND_GREGORIAN_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_CALKIND_GREGORIAN(0, "ESMF_CALKIND_GREGORIAN", "ESMF_CALKIND_GREGORIAN");

	/**
	 * The '<em><b>ESMF CALKIND GREGORIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF CALKIND GREGORIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_CALKIND_GREGORIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_CALKIND_GREGORIAN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cal Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESMFCalKind[] VALUES_ARRAY =
		new ESMFCalKind[] {
			ESMF_CALKIND_GREGORIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Cal Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESMFCalKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cal Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFCalKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFCalKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cal Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFCalKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFCalKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cal Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFCalKind get(int value) {
		switch (value) {
			case ESMF_CALKIND_GREGORIAN_VALUE: return ESMF_CALKIND_GREGORIAN;
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
	private ESMFCalKind(int value, String name, String literal) {
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
	
} //ESMFCalKind
