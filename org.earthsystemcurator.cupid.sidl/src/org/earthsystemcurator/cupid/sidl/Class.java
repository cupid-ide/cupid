/**
 */
package org.earthsystemcurator.cupid.sidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Class#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Class#getParentInterface <em>Parent Interface</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Class#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.sidl.Method}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.sidl.Method#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getClass_Method()
	 * @see org.earthsystemcurator.cupid.sidl.Method#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Parent Interface</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.sidl.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Interface</em>' reference list.
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getClass_ParentInterface()
	 * @model
	 * @generated
	 */
	EList<Interface> getParentInterface();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.sidl.Package#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(org.earthsystemcurator.cupid.sidl.Package)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getClass_Package()
	 * @see org.earthsystemcurator.cupid.sidl.Package#getClass_
	 * @model opposite="class" required="true" transient="false"
	 * @generated
	 */
	org.earthsystemcurator.cupid.sidl.Package getPackage();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Class#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.earthsystemcurator.cupid.sidl.Package value);

} // Class
