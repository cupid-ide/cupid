/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFState#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFState#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFState()
 * @model
 * @generated
 */
public interface ESMFState extends ESMFStateItem {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFState_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getState
	 * @model opposite="state" transient="false"
	 * @generated
	 */
	ESMFComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFState#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFComponent value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFStateItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFState_Item()
	 * @model
	 * @generated
	 */
	EList<ESMFStateItem> getItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stateRequired="true" itemListRequired="true" itemListMany="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_StateAdd'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body=''"
	 * @generated
	 */
	void add(ESMFState state, EList<ESMFStateItem> itemList, int rc);

} // ESMFState
