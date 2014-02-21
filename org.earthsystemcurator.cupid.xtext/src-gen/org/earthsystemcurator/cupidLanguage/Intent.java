/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Intent#isIn <em>In</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Intent#isOut <em>Out</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Intent#isInout <em>Inout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIntent()
 * @model
 * @generated
 */
public interface Intent extends EObject
{
  /**
   * Returns the value of the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' attribute.
   * @see #setIn(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIntent_In()
   * @model
   * @generated
   */
  boolean isIn();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Intent#isIn <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' attribute.
   * @see #isIn()
   * @generated
   */
  void setIn(boolean value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' attribute.
   * @see #setOut(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIntent_Out()
   * @model
   * @generated
   */
  boolean isOut();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Intent#isOut <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' attribute.
   * @see #isOut()
   * @generated
   */
  void setOut(boolean value);

  /**
   * Returns the value of the '<em><b>Inout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inout</em>' attribute.
   * @see #setInout(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIntent_Inout()
   * @model
   * @generated
   */
  boolean isInout();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Intent#isInout <em>Inout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inout</em>' attribute.
   * @see #isInout()
   * @generated
   */
  void setInout(boolean value);

} // Intent
