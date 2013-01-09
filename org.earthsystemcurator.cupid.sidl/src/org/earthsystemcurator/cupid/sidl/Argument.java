/**
 */
package org.earthsystemcurator.cupid.sidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Argument#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Argument#getMode <em>Mode</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Argument#getType <em>Type</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.Argument#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
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
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArgument_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.sidl.ModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.earthsystemcurator.cupid.sidl.ModeEnum
	 * @see #setMode(ModeEnum)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArgument_Mode()
	 * @model required="true"
	 * @generated
	 */
	ModeEnum getMode();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Argument#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.earthsystemcurator.cupid.sidl.ModeEnum
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeEnum value);

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
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArgument_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SIDLType getType();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Argument#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SIDLType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.sidl.Method#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArgument_Method()
	 * @see org.earthsystemcurator.cupid.sidl.Method#getArgument
	 * @model opposite="argument" required="true" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.Argument#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // Argument
