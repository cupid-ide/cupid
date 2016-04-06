/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESMF STAGGERLOC</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getESMF_STAGGERLOC()
 * @model
 * @generated
 */
public enum ESMF_STAGGERLOC implements Enumerator {
	/**
	 * The '<em><b>ESMF STAGGERLOC CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_STAGGERLOC_CENTER(0, "ESMF_STAGGERLOC_CENTER", "ESMF_STAGGERLOC_CENTER"),

	/**
	 * The '<em><b>ESMF STAGGERLOC CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_STAGGERLOC_CORNER(1, "ESMF_STAGGERLOC_CORNER", "ESMF_STAGGERLOC_CORNER");

	/**
	 * The '<em><b>ESMF STAGGERLOC CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF STAGGERLOC CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_STAGGERLOC_CENTER_VALUE = 0;

	/**
	 * The '<em><b>ESMF STAGGERLOC CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF STAGGERLOC CORNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_STAGGERLOC_CORNER_VALUE = 1;

	/**
	 * An array of all the '<em><b>ESMF STAGGERLOC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESMF_STAGGERLOC[] VALUES_ARRAY =
		new ESMF_STAGGERLOC[] {
			ESMF_STAGGERLOC_CENTER,
			ESMF_STAGGERLOC_CORNER,
		};

	/**
	 * A public read-only list of all the '<em><b>ESMF STAGGERLOC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESMF_STAGGERLOC> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESMF STAGGERLOC</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESMF_STAGGERLOC get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMF_STAGGERLOC result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESMF STAGGERLOC</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESMF_STAGGERLOC getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMF_STAGGERLOC result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESMF STAGGERLOC</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESMF_STAGGERLOC get(int value) {
		switch (value) {
			case ESMF_STAGGERLOC_CENTER_VALUE: return ESMF_STAGGERLOC_CENTER;
			case ESMF_STAGGERLOC_CORNER_VALUE: return ESMF_STAGGERLOC_CORNER;
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
	private ESMF_STAGGERLOC(int value, String name, String literal) {
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
	
} //ESMF_STAGGERLOC
