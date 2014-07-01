/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subconcept Or Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isEssential <em>Essential</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isMustBeNull <em>Must Be Null</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getDef <em>Def</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isReference <em>Reference</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getRef <em>Ref</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isAttrib <em>Attrib</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAttribMapping <em>Attrib Mapping</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute()
 * @model
 * @generated
 */
public interface SubconceptOrAttribute extends EObject
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
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Cardinality()
   * @model containment="true"
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Essential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Essential</em>' attribute.
   * @see #setEssential(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Essential()
   * @model
   * @generated
   */
  boolean isEssential();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isEssential <em>Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Essential</em>' attribute.
   * @see #isEssential()
   * @generated
   */
  void setEssential(boolean value);

  /**
   * Returns the value of the '<em><b>Must Be Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Must Be Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Must Be Null</em>' attribute.
   * @see #setMustBeNull(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_MustBeNull()
   * @model
   * @generated
   */
  boolean isMustBeNull();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isMustBeNull <em>Must Be Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Must Be Null</em>' attribute.
   * @see #isMustBeNull()
   * @generated
   */
  void setMustBeNull(boolean value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(ConceptDef)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Def()
   * @model containment="true"
   * @generated
   */
  ConceptDef getDef();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(ConceptDef value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isReference()
   * @generated
   */
  void setReference(boolean value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ConceptDef)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Ref()
   * @model
   * @generated
   */
  ConceptDef getRef();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ConceptDef value);

  /**
   * Returns the value of the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrib</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib</em>' attribute.
   * @see #setAttrib(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Attrib()
   * @model
   * @generated
   */
  boolean isAttrib();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isAttrib <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrib</em>' attribute.
   * @see #isAttrib()
   * @generated
   */
  void setAttrib(boolean value);

  /**
   * Returns the value of the '<em><b>Attrib Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrib Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib Mapping</em>' containment reference.
   * @see #setAttribMapping(Mapping)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_AttribMapping()
   * @model containment="true"
   * @generated
   */
  Mapping getAttribMapping();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAttribMapping <em>Attrib Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrib Mapping</em>' containment reference.
   * @see #getAttribMapping()
   * @generated
   */
  void setAttribMapping(Mapping value);

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
   * @see org.earthsystemmodeling.psyche.PsychePackage#getSubconceptOrAttribute_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

} // SubconceptOrAttribute
