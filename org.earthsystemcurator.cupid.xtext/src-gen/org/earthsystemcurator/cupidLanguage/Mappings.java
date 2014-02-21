/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mappings#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mappings#getConcepts <em>Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMappings()
 * @model
 * @generated
 */
public interface Mappings extends EObject
{
  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMappings_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMappings();

  /**
   * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.ConceptDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concepts</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMappings_Concepts()
   * @model containment="true"
   * @generated
   */
  EList<ConceptDef> getConcepts();

} // Mappings
