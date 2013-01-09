/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getTypekind <em>Typekind</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getRank <em>Rank</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArraySpec()
 * @model
 * @generated
 */
public interface ESMFArraySpec extends EObject {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArraySpec_Typekind()
	 * @model required="true"
	 * @generated
	 */
	ESMFTypeKind getTypekind();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getTypekind <em>Typekind</em>}' attribute.
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
	 * @see #setRank(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArraySpec_Rank()
	 * @model required="true"
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFArraySpec_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getArraySpec
	 * @model opposite="arraySpec" transient="false"
	 * @generated
	 */
	ESMFComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFComponent value);

} // ESMFArraySpec
