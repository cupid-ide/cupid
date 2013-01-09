/**
 */
package org.earthsystemcurator.cupid.sidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Method#getShortname <em>Shortname</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Method#getType <em>Type</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Method#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Method#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Shortname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortname</em>' attribute.
	 * @see #setShortname(String)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getMethod_Shortname()
	 * @model required="true"
	 * @generated
	 */
	String getShortname();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Method#getShortname <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortname</em>' attribute.
	 * @see #getShortname()
	 * @generated
	 */
	void setShortname(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SIDLType)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getMethod_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SIDLType getType();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Method#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SIDLType value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.sidl.Argument}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.sidl.Argument#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getMethod_Argument()
	 * @see org.earthsystemcurator.cupid.sidl.Argument#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.sidl.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(org.earthsystemcurator.cupid.sidl.Class)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getMethod_Class()
	 * @see org.earthsystemcurator.cupid.sidl.Class#getMethod
	 * @model opposite="method" transient="false"
	 * @generated
	 */
	org.earthsystemcurator.cupid.sidl.Class getClass_();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Method#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.earthsystemcurator.cupid.sidl.Class value);

} // Method
