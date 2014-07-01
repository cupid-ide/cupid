/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.Expr#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Expr#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Expr#getPathExpr <em>Path Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' attribute.
   * @see #setWildcard(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getExpr_Wildcard()
   * @model
   * @generated
   */
  boolean isWildcard();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Expr#isWildcard <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' attribute.
   * @see #isWildcard()
   * @generated
   */
  void setWildcard(boolean value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(LocalExpression)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getExpr_Expr()
   * @model containment="true"
   * @generated
   */
  LocalExpression getExpr();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Expr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(LocalExpression value);

  /**
   * Returns the value of the '<em><b>Path Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Expr</em>' containment reference.
   * @see #setPathExpr(PathExpr)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getExpr_PathExpr()
   * @model containment="true"
   * @generated
   */
  PathExpr getPathExpr();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Expr#getPathExpr <em>Path Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Expr</em>' containment reference.
   * @see #getPathExpr()
   * @generated
   */
  void setPathExpr(PathExpr value);

} // Expr
