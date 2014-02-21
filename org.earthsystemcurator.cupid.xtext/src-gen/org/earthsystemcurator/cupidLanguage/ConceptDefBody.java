/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Def Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDefBody#getSubconcept <em>Subconcept</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefBody()
 * @model
 * @generated
 */
public interface ConceptDefBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Subconcept</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.ConceptDefOrRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subconcept</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subconcept</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDefBody_Subconcept()
   * @model containment="true"
   * @generated
   */
  EList<ConceptDefOrRef> getSubconcept();

} // ConceptDefBody
