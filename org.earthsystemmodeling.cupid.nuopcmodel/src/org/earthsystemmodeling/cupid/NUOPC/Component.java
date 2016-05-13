/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Component#getIPDVersion <em>IPD Version</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Component#getAdvance <em>Advance</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
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
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>IPD Version</b></em>' attribute.
	 * The default value is <code>"IPDv01"</code>.
	 * The literals are from the enumeration {@link org.earthsystemmodeling.cupid.NUOPC.IPDVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPD Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPD Version</em>' attribute.
	 * @see org.earthsystemmodeling.cupid.NUOPC.IPDVersion
	 * @see #setIPDVersion(IPDVersion)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getComponent_IPDVersion()
	 * @model default="IPDv01" required="true"
	 * @generated
	 */
	IPDVersion getIPDVersion();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getIPDVersion <em>IPD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPD Version</em>' attribute.
	 * @see org.earthsystemmodeling.cupid.NUOPC.IPDVersion
	 * @see #getIPDVersion()
	 * @generated
	 */
	void setIPDVersion(IPDVersion value);

	/**
	 * Returns the value of the '<em><b>Advance</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Advance}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advance</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getComponent_Advance()
	 * @see org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent
	 * @model opposite="component" containment="true" required="true"
	 * @generated
	 */
	EList<Advance> getAdvance();

} // Component
