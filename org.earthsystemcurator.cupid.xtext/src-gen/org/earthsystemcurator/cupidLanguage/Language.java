/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Language#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Language#getUri <em>Uri</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Language#getConceptDef <em>Concept Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getLanguage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Language#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getLanguage_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Language#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Concept Def</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.ConceptDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept Def</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getLanguage_ConceptDef()
   * @model containment="true"
   * @generated
   */
  EList<ConceptDef> getConceptDef();

} // Language
