/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grid Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getIndexflag <em>Indexflag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_GridCreate' post='created(self.grid)'"
 * @generated
 */
public interface ESMFActionGridCreate extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCreate_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCreate_DistGrid()
	 * @model required="true"
	 * @generated
	 */
	ESMFDistGrid getDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getDistGrid <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Grid</em>' reference.
	 * @see #getDistGrid()
	 * @generated
	 */
	void setDistGrid(ESMFDistGrid value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCreate_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCreate_Indexflag()
	 * @model
	 * @generated
	 */
	ESMF_INDEX getIndexflag();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getIndexflag <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #getIndexflag()
	 * @generated
	 */
	void setIndexflag(ESMF_INDEX value);

} // ESMFActionGridCreate
