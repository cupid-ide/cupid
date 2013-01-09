/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Dist Grid Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMaxIndex <em>Max Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getRegDecomp <em>Reg Decomp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionDistGridCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_DistGridCreate'"
 * @generated
 */
public interface ESMFActionDistGridCreate extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionDistGridCreate_DistGrid()
	 * @model required="true"
	 * @generated
	 */
	ESMFDistGrid getDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getDistGrid <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Grid</em>' reference.
	 * @see #getDistGrid()
	 * @generated
	 */
	void setDistGrid(ESMFDistGrid value);

	/**
	 * Returns the value of the '<em><b>Min Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Index</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Index</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionDistGridCreate_MinIndex()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getMinIndex();

	/**
	 * Returns the value of the '<em><b>Max Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Index</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Index</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionDistGridCreate_MaxIndex()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getMaxIndex();

	/**
	 * Returns the value of the '<em><b>Reg Decomp</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Decomp</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Decomp</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionDistGridCreate_RegDecomp()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getRegDecomp();

} // ESMFActionDistGridCreate
