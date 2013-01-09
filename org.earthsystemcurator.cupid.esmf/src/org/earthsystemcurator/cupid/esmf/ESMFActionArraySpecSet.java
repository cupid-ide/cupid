/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Array Spec Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getTypekind <em>Typekind</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArraySpecSet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_ArraySpecSet'"
 * @generated
 */
public interface ESMFActionArraySpecSet extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Spec</em>' reference.
	 * @see #setArraySpec(ESMFArraySpec)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArraySpecSet_ArraySpec()
	 * @model required="true"
	 * @generated
	 */
	ESMFArraySpec getArraySpec();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getArraySpec <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Spec</em>' reference.
	 * @see #getArraySpec()
	 * @generated
	 */
	void setArraySpec(ESMFArraySpec value);

	/**
	 * Returns the value of the '<em><b>Typekind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMFTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typekind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typekind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @see #setTypekind(ESMFTypeKind)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArraySpecSet_Typekind()
	 * @model required="true"
	 * @generated
	 */
	ESMFTypeKind getTypekind();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getTypekind <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typekind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @see #getTypekind()
	 * @generated
	 */
	void setTypekind(ESMFTypeKind value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArraySpecSet_Rank()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getRank();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(String value);

} // ESMFActionArraySpecSet
