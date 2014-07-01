/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.Subroutine#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Subroutine#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getSubroutine()
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
   * @see #setName(Expr)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubroutine_Name()
   * @model containment="true"
   * @generated
   */
  Expr getName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Subroutine#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Expr value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemmodeling.psyche.FormalParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubroutine_Params()
   * @model containment="true"
   * @generated
   */
  EList<FormalParam> getParams();

} // Subroutine
