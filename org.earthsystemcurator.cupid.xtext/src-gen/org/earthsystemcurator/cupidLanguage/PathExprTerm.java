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
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#getRef <em>Ref</em>}</li>
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
   * Returns the value of the '<em><b>Axis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' containment reference.
   * @see #setAxis(Axis)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExprTerm_Axis()
   * @model containment="true"
   * @generated
   */
  Axis getAxis();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.PathExprTerm#getAxis <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' containment reference.
   * @see #getAxis()
   * @generated
   */
  void setAxis(Axis value);

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

} // PathExprTerm
