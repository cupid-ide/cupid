/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Or Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.IDOrPathExpr#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIDOrPathExpr()
 * @model
 * @generated
 */
public interface IDOrPathExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getIDOrPathExpr_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.IDOrPathExpr#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

} // IDOrPathExpr
