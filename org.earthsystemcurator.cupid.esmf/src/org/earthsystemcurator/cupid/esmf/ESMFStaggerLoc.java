/**
 */
package org.earthsystemcurator.cupid.esmf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stagger Loc</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStaggerLoc()
 * @model
 * @generated
 */
public enum ESMFStaggerLoc implements Enumerator {
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
	ESMF_STAGGERLOC_CORNER(1, "ESMF_STAGGERLOC_CORNER", "ESMF_STAGGERLOC_CORNER"),

	/**
	 * The '<em><b>ESMF STAGGERLOC EDGE1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_EDGE1_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_STAGGERLOC_EDGE1(2, "ESMF_STAGGERLOC_EDGE1", "ESMF_STAGGERLOC_EDGE1"),

	/**
	 * The '<em><b>ESMF STAGGERLOC EDGE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_EDGE2_VALUE
	 * @generated
	 * @ordered
	 */
	ESMF_STAGGERLOC_EDGE2(3, "ESMF_STAGGERLOC_EDGE2", "ESMF_STAGGERLOC_EDGE2");

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
	 * The '<em><b>ESMF STAGGERLOC EDGE1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF STAGGERLOC EDGE1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_EDGE1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_STAGGERLOC_EDGE1_VALUE = 2;

	/**
	 * The '<em><b>ESMF STAGGERLOC EDGE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESMF STAGGERLOC EDGE2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESMF_STAGGERLOC_EDGE2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESMF_STAGGERLOC_EDGE2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Stagger Loc</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESMFStaggerLoc[] VALUES_ARRAY =
		new ESMFStaggerLoc[] {
			ESMF_STAGGERLOC_CENTER,
			ESMF_STAGGERLOC_CORNER,
			ESMF_STAGGERLOC_EDGE1,
			ESMF_STAGGERLOC_EDGE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Stagger Loc</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESMFStaggerLoc> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stagger Loc</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFStaggerLoc get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFStaggerLoc result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stagger Loc</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFStaggerLoc getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESMFStaggerLoc result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stagger Loc</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFStaggerLoc get(int value) {
		switch (value) {
			case ESMF_STAGGERLOC_CENTER_VALUE: return ESMF_STAGGERLOC_CENTER;
			case ESMF_STAGGERLOC_CORNER_VALUE: return ESMF_STAGGERLOC_CORNER;
			case ESMF_STAGGERLOC_EDGE1_VALUE: return ESMF_STAGGERLOC_EDGE1;
			case ESMF_STAGGERLOC_EDGE2_VALUE: return ESMF_STAGGERLOC_EDGE2;
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
	private ESMFStaggerLoc(int value, String name, String literal) {
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
	
} //ESMFStaggerLoc
