/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Call#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Call#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends ImplicitContextMapping
{
  /**
   * Returns the value of the '<em><b>Subroutine Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subroutine Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subroutine Name</em>' containment reference.
   * @see #setSubroutineName(IDOrPathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getCall_SubroutineName()
   * @model containment="true"
   * @generated
   */
  IDOrPathExpr getSubroutineName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Call#getSubroutineName <em>Subroutine Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subroutine Name</em>' containment reference.
   * @see #getSubroutineName()
   * @generated
   */
  void setSubroutineName(IDOrPathExpr value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.ActualParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<ActualParam> getParams();

} // Call
