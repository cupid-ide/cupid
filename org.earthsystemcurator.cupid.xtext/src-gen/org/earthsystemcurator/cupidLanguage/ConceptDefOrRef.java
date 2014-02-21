/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Def Or Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefOrRef()
 * @model
 * @generated
 */
public interface ConceptDefOrRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Name</em>' attribute.
   * @see #setLocalName(String)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefOrRef_LocalName()
   * @model
   * @generated
   */
  String getLocalName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#getLocalName <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Name</em>' attribute.
   * @see #getLocalName()
   * @generated
   */
  void setLocalName(String value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(Cardinality)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefOrRef_Cardinality()
   * @model containment="true"
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefOrRef_Required()
   * @model
   * @generated
   */
  boolean isRequired();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
  void setRequired(boolean value);

} // ConceptDefOrRef
