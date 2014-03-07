/**
 */
package org.earthsystemcurator.cupidLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expr Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#getRef <em>Ref</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#isGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExprTerm()
 * @model
 * @generated
 */
public interface PathExprTerm extends PathExpr
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(SubconceptOrAttribute)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExprTerm_Ref()
   * @model
   * @generated
   */
  SubconceptOrAttribute getRef();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(SubconceptOrAttribute value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute.
   * @see #setGuard(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExprTerm_Guard()
   * @model
   * @generated
   */
  boolean isGuard();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#isGuard <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' attribute.
   * @see #isGuard()
   * @generated
   */
  void setGuard(boolean value);

} // PathExprTerm
