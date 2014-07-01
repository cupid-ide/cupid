/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrOne <em>Zero Or One</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrMore <em>Zero Or More</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.Cardinality#isOneOrMore <em>One Or More</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject
{
  /**
   * Returns the value of the '<em><b>Zero Or One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zero Or One</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zero Or One</em>' attribute.
   * @see #setZeroOrOne(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getCardinality_ZeroOrOne()
   * @model
   * @generated
   */
  boolean isZeroOrOne();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrOne <em>Zero Or One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zero Or One</em>' attribute.
   * @see #isZeroOrOne()
   * @generated
   */
  void setZeroOrOne(boolean value);

  /**
   * Returns the value of the '<em><b>Zero Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zero Or More</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zero Or More</em>' attribute.
   * @see #setZeroOrMore(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getCardinality_ZeroOrMore()
   * @model
   * @generated
   */
  boolean isZeroOrMore();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrMore <em>Zero Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zero Or More</em>' attribute.
   * @see #isZeroOrMore()
   * @generated
   */
  void setZeroOrMore(boolean value);

  /**
   * Returns the value of the '<em><b>One Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Or More</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Or More</em>' attribute.
   * @see #setOneOrMore(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getCardinality_OneOrMore()
   * @model
   * @generated
   */
  boolean isOneOrMore();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Cardinality#isOneOrMore <em>One Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Or More</em>' attribute.
   * @see #isOneOrMore()
   * @generated
   */
  void setOneOrMore(boolean value);

} // Cardinality
