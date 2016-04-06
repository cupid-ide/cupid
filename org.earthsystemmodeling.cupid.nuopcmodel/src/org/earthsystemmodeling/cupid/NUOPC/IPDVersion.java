/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IPD Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getIPDVersion()
 * @model
 * @generated
 */
public enum IPDVersion implements Enumerator {
	/**
	 * The '<em><b>IP Dv00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DV00_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DV00(0, "IPDv00", "IPDv00"),

	/**
	 * The '<em><b>IP Dv01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DV01_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DV01(1, "IPDv01", "IPDv01"),

	/**
	 * The '<em><b>IP Dv02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DV02_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DV02(2, "IPDv02", "IPDv02"),

	/**
	 * The '<em><b>IP Dv03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DV03_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DV03(3, "IPDv03", "IPDv03"),

	/**
	 * The '<em><b>IP Dv04</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DV04_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DV04(4, "IPDv04", "IPDv04");

	/**
	 * The '<em><b>IP Dv00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Dv00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DV00
	 * @model name="IPDv00"
	 * @generated
	 * @ordered
	 */
	public static final int IP_DV00_VALUE = 0;

	/**
	 * The '<em><b>IP Dv01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Dv01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DV01
	 * @model name="IPDv01"
	 * @generated
	 * @ordered
	 */
	public static final int IP_DV01_VALUE = 1;

	/**
	 * The '<em><b>IP Dv02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Dv02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DV02
	 * @model name="IPDv02"
	 * @generated
	 * @ordered
	 */
	public static final int IP_DV02_VALUE = 2;

	/**
	 * The '<em><b>IP Dv03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Dv03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DV03
	 * @model name="IPDv03"
	 * @generated
	 * @ordered
	 */
	public static final int IP_DV03_VALUE = 3;

	/**
	 * The '<em><b>IP Dv04</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Dv04</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DV04
	 * @model name="IPDv04"
	 * @generated
	 * @ordered
	 */
	public static final int IP_DV04_VALUE = 4;

	/**
	 * An array of all the '<em><b>IPD Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IPDVersion[] VALUES_ARRAY =
		new IPDVersion[] {
			IP_DV00,
			IP_DV01,
			IP_DV02,
			IP_DV03,
			IP_DV04,
		};

	/**
	 * A public read-only list of all the '<em><b>IPD Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IPDVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IPD Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPDVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IPDVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IPD Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPDVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IPDVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IPD Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPDVersion get(int value) {
		switch (value) {
			case IP_DV00_VALUE: return IP_DV00;
			case IP_DV01_VALUE: return IP_DV01;
			case IP_DV02_VALUE: return IP_DV02;
			case IP_DV03_VALUE: return IP_DV03;
			case IP_DV04_VALUE: return IP_DV04;
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
	private IPDVersion(int value, String name, String literal) {
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
	
} //IPDVersion
