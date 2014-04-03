/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FormalParam#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FormalParam#getType <em>Type</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FormalParam#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFormalParam()
 * @model
 * @generated
 */
public interface FormalParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Intent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intent</em>' containment reference.
   * @see #setIntent(Intent)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFormalParam_Intent()
   * @model containment="true"
   * @generated
   */
  Intent getIntent();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getIntent <em>Intent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intent</em>' containment reference.
   * @see #getIntent()
   * @generated
   */
  void setIntent(Intent value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFormalParam_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Expr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFormalParam_Name()
   * @model containment="true"
   * @generated
   */
  Expr getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Expr value);

} // FormalParam
