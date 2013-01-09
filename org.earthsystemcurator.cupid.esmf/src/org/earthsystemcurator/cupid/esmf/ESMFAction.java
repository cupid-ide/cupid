/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFAction#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFAction()
 * @model
 * @generated
 */
public interface ESMFAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(ESMFMethod)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFAction_Context()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getAction
	 * @model opposite="action" transient="false"
	 * @generated
	 */
	ESMFMethod getContext();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFAction#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ESMFMethod value);

} // ESMFAction
