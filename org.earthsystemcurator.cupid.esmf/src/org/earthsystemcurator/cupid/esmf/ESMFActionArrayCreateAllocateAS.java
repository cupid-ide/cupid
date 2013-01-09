/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Array Create Allocate AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalUWidth <em>Total UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_ArrayCreate'"
 * @generated
 */
public interface ESMFActionArrayCreateAllocateAS extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference.
	 * @see #setArray(ESMFArray)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_Array()
	 * @model required="true"
	 * @generated
	 */
	ESMFArray getArray();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ESMFArray value);

	/**
	 * Returns the value of the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist Grid</em>' reference.
	 * @see #setDistGrid(ESMFDistGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_DistGrid()
	 * @model required="true"
	 * @generated
	 */
	ESMFDistGrid getDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getDistGrid <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Grid</em>' reference.
	 * @see #getDistGrid()
	 * @generated
	 */
	void setDistGrid(ESMFDistGrid value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_ArraySpec()
	 * @model required="true"
	 * @generated
	 */
	ESMFArraySpec getArraySpec();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArraySpec <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Spec</em>' reference.
	 * @see #getArraySpec()
	 * @generated
	 */
	void setArraySpec(ESMFArraySpec value);

	/**
	 * Returns the value of the '<em><b>Indexflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexflag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #setIndexflag(ESMF_INDEX)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_Indexflag()
	 * @model
	 * @generated
	 */
	ESMF_INDEX getIndexflag();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getIndexflag <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #getIndexflag()
	 * @generated
	 */
	void setIndexflag(ESMF_INDEX value);

	/**
	 * Returns the value of the '<em><b>Total LWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total LWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total LWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_TotalLWidth()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getTotalLWidth();

	/**
	 * Returns the value of the '<em><b>Total UWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total UWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total UWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreateAllocateAS_TotalUWidth()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getTotalUWidth();

} // ESMFActionArrayCreateAllocateAS
