/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExpr#getHead <em>Head</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.PathExpr#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExpr()
 * @model
 * @generated
 */
public interface PathExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(PathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExpr_Head()
   * @model containment="true"
   * @generated
   */
  PathExpr getHead();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.PathExpr#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(PathExpr value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' reference.
   * @see #setTail(SubconceptOrAttribute)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getPathExpr_Tail()
   * @model
   * @generated
   */
  SubconceptOrAttribute getTail();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.PathExpr#getTail <em>Tail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' reference.
   * @see #getTail()
   * @generated
   */
  void setTail(SubconceptOrAttribute value);

} // PathExpr
