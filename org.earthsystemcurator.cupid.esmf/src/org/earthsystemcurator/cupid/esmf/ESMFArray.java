/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getFarray <em>Farray</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloLWidth <em>Halo LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloUWidth <em>Halo UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray()
 * @model
 * @generated
 */
public interface ESMFArray extends ESMFStateItem, ESMFScopedItem {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_Component()
	 * @model required="true"
	 * @generated
	 */
	ESMFComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFComponent value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_ArraySpec()
	 * @model required="true"
	 * @generated
	 */
	ESMFArraySpec getArraySpec();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getArraySpec <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Spec</em>' reference.
	 * @see #getArraySpec()
	 * @generated
	 */
	void setArraySpec(ESMFArraySpec value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_DistGrid()
	 * @model required="true"
	 * @generated
	 */
	ESMFDistGrid getDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getDistGrid <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Grid</em>' reference.
	 * @see #getDistGrid()
	 * @generated
	 */
	void setDistGrid(ESMFDistGrid value);

	/**
	 * Returns the value of the '<em><b>Farray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farray</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farray</em>' attribute.
	 * @see #setFarray(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_Farray()
	 * @model
	 * @generated
	 */
	String getFarray();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getFarray <em>Farray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farray</em>' attribute.
	 * @see #getFarray()
	 * @generated
	 */
	void setFarray(String value);

	/**
	 * Returns the value of the '<em><b>Indexflag</b></em>' attribute.
	 * The default value is <code>"0"</code>.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_Indexflag()
	 * @model default="0" required="true"
	 * @generated
	 */
	ESMF_INDEX getIndexflag();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getIndexflag <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #getIndexflag()
	 * @generated
	 */
	void setIndexflag(ESMF_INDEX value);

	/**
	 * Returns the value of the '<em><b>Halo LWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Halo LWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Halo LWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_HaloLWidth()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getHaloLWidth();

	/**
	 * Returns the value of the '<em><b>Halo UWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Halo UWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Halo UWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArray_HaloUWidth()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getHaloUWidth();

} // ESMFArray
