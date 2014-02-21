/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subroutine#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subroutine#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubroutine()
 * @model
 * @generated
 */
public interface Subroutine extends ImplicitContextMapping
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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubroutine_Name()
   * @model containment="true"
   * @generated
   */
  IDOrPathExpr getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subroutine#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(IDOrPathExpr value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.FormalParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubroutine_Params()
   * @model containment="true"
   * @generated
   */
  EList<FormalParam> getParams();

} // Subroutine
