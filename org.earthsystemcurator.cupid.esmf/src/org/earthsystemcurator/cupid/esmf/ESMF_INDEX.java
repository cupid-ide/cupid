/**
 */
package org.earthsystemcurator.cupid.esmf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESMF INDEX</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMF_INDEX()
 * @model
 * @generated
 */
public enum ESMF_INDEX implements Enumerator {
	/**
	 * The '<em><b>ESMF INDEX DELOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_DELOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_INDEX_DELOCAL(0, "ESMF_INDEX_DELOCAL", "ESMF_INDEX_DELOCAL"),

	/**
	 * The '<em><b>ESMF INDEX GLOBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_GLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_INDEX_GLOBAL(1, "ESMF_INDEX_GLOBAL", "ESMF_INDEX_GLOBAL"),

	/**
	 * The '<em><b>ESMF INDEX USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_USER_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_INDEX_USER(2, "ESMF_INDEX_USER", "ESMF_INDEX_USER");

	/**
	 * The '<em><b>ESMF INDEX DELOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF INDEX DELOCAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_DELOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_INDEX_DELOCAL_VALUE = 0;

	/**
	 * The '<em><b>ESMF INDEX GLOBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF INDEX GLOBAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_GLOBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_INDEX_GLOBAL_VALUE = 1;

	/**
	 * The '<em><b>ESMF INDEX USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF INDEX USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_INDEX_USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_INDEX_USER_VALUE = 2;

	/**
	 * An array of all the '<em><b>ESMF INDEX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESMF_INDEX[] VALUES_ARRAY =
		new ESMF_INDEX[] {
			ESMF_INDEX_DELOCAL,
			ESMF_INDEX_GLOBAL,
			ESMF_INDEX_USER,
		};

	/**
	 * A public read-only list of all the '<em><b>ESMF INDEX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESMF_INDEX> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESMF INDEX</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMF_INDEX get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMF_INDEX result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESMF INDEX</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMF_INDEX getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMF_INDEX result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESMF INDEX</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMF_INDEX get(int value) {
		switch (value) {
			case ESMF_INDEX_DELOCAL_VALUE: return ESMF_INDEX_DELOCAL;
			case ESMF_INDEX_GLOBAL_VALUE: return ESMF_INDEX_GLOBAL;
			case ESMF_INDEX_USER_VALUE: return ESMF_INDEX_USER;
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
	private ESMF_INDEX(int value, String name, String literal) {
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
	
} //ESMF_INDEX
