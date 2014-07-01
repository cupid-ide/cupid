/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.Call#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Call#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getCall()
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
   * @see #setSubroutineName(Expr)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getCall_SubroutineName()
   * @model containment="true"
   * @generated
   */
  Expr getSubroutineName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Call#getSubroutineName <em>Subroutine Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subroutine Name</em>' containment reference.
   * @see #getSubroutineName()
   * @generated
   */
  void setSubroutineName(Expr value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemmodeling.psyche.ActualParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.earthsystemmodeling.psyche.PsychePackage#getCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<ActualParam> getParams();

} // Call
