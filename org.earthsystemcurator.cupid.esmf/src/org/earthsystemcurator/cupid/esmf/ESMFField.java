/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.earthsystemcurator.cupid.sidl.Argument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getStaggerLoc <em>Stagger Loc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getIndex <em>Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFField#getTotalUWidth <em>Total UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField()
 * @model
 * @generated
 */
public interface ESMFField extends ESMFStateItem, ESMFScopedItem {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(ESMFGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_Array()
	 * @model
	 * @generated
	 */
	ESMFArray getArray();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ESMFArray value);

	/**
	 * Returns the value of the '<em><b>Stagger Loc</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stagger Loc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stagger Loc</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @see #setStaggerLoc(ESMFStaggerLoc)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_StaggerLoc()
	 * @model
	 * @generated
	 */
	ESMFStaggerLoc getStaggerLoc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getStaggerLoc <em>Stagger Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stagger Loc</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @see #getStaggerLoc()
	 * @generated
	 */
	void setStaggerLoc(ESMFStaggerLoc value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_ArraySpec()
	 * @model
	 * @generated
	 */
	ESMFArraySpec getArraySpec();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArraySpec <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Spec</em>' reference.
	 * @see #getArraySpec()
	 * @generated
	 */
	void setArraySpec(ESMFArraySpec value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #setIndex(ESMF_INDEX)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_Index()
	 * @model
	 * @generated
	 */
	ESMF_INDEX getIndex();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(ESMF_INDEX value);

	/**
	 * Returns the value of the '<em><b>Total LWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total LWidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total LWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_TotalLWidth()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getTotalLWidth();

	/**
	 * Returns the value of the '<em><b>Total UWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total UWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total UWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFField_TotalUWidth()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getTotalUWidth();

} // ESMFField
