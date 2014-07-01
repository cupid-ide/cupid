/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#getChild <em>Child</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#isNamed <em>Named</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.ConceptDef#isTop <em>Top</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef()
 * @model
 * @generated
 */
public interface ConceptDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(Mapping)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Mapping()
   * @model containment="true"
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.ConceptDef#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemmodeling.psyche.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemmodeling.psyche.SubconceptOrAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference list.
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Child()
   * @model containment="true"
   * @generated
   */
  EList<SubconceptOrAttribute> getChild();

  /**
   * Returns the value of the '<em><b>Named</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named</em>' attribute.
   * @see #setNamed(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Named()
   * @model
   * @generated
   */
  boolean isNamed();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.ConceptDef#isNamed <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named</em>' attribute.
   * @see #isNamed()
   * @generated
   */
  void setNamed(boolean value);

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
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.ConceptDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' attribute.
   * @see #setTop(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getConceptDef_Top()
   * @model
   * @generated
   */
  boolean isTop();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.ConceptDef#isTop <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' attribute.
   * @see #isTop()
   * @generated
   */
  void setTop(boolean value);

} // ConceptDef
