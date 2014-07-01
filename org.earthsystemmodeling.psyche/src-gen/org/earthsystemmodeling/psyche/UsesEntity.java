/**
 */
package org.earthsystemmodeling.psyche;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.UsesEntity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getUsesEntity()
 * @model
 * @generated
 */
public interface UsesEntity extends ImplicitContextMapping
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
   * @see org.earthsystemmodeling.psyche.PsychePackage#getUsesEntity_Name()
   * @model containment="true"
   * @generated
   */
  Expr getName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.UsesEntity#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Expr value);

} // UsesEntity
