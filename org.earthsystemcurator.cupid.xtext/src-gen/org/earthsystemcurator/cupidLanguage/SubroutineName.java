/**
 */
package org.earthsystemcurator.cupidLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.SubroutineName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubroutineName()
 * @model
 * @generated
 */
public interface SubroutineName extends ImplicitContextMapping
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(IDOrPathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubroutineName_Name()
   * @model containment="true"
   * @generated
   */
  IDOrPathExpr getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.SubroutineName#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(IDOrPathExpr value);

} // SubroutineName
