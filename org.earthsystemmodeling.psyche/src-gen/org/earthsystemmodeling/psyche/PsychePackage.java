/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.psyche.PsycheFactory
 * @model kind="package"
 * @generated
 */
public interface PsychePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "psyche";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.earthsystemmodeling.org/Psyche";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "psyche";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PsychePackage eINSTANCE = org.earthsystemmodeling.psyche.impl.PsychePackageImpl.init();

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.LanguageImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__URI = 1;

  /**
   * The feature id for the '<em><b>Concept Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__CONCEPT_DEF = 2;

  /**
   * The number of structural features of the '<em>Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.AnnotationImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl <em>Concept Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ConceptDefImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getConceptDef()
   * @generated
   */
  int CONCEPT_DEF = 2;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__MAPPING = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__CHILD = 2;

  /**
   * The feature id for the '<em><b>Named</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__NAMED = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__NAME = 4;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__TOP = 5;

  /**
   * The number of structural features of the '<em>Concept Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl <em>Subconcept Or Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubconceptOrAttribute()
   * @generated
   */
  int SUBCONCEPT_OR_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY = 1;

  /**
   * The feature id for the '<em><b>Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL = 2;

  /**
   * The feature id for the '<em><b>Must Be Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL = 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__DEF = 4;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__REF = 6;

  /**
   * The feature id for the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__ATTRIB = 7;

  /**
   * The feature id for the '<em><b>Attrib Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING = 8;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION = 9;

  /**
   * The number of structural features of the '<em>Subconcept Or Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_OR_ATTRIBUTE_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.CardinalityImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 4;

  /**
   * The feature id for the '<em><b>Zero Or One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__ZERO_OR_ONE = 0;

  /**
   * The feature id for the '<em><b>Zero Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__ZERO_OR_MORE = 1;

  /**
   * The feature id for the '<em><b>One Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__ONE_OR_MORE = 2;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.MappingImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 5;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPPING = 1;

  /**
   * The feature id for the '<em><b>Before</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__BEFORE = 2;

  /**
   * The feature id for the '<em><b>After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__AFTER = 3;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ImplicitContextMappingImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getImplicitContextMapping()
   * @generated
   */
  int IMPLICIT_CONTEXT_MAPPING = 6;

  /**
   * The number of structural features of the '<em>Implicit Context Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ModuleImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getModule()
   * @generated
   */
  int MODULE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ModuleNameImpl <em>Module Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ModuleNameImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getModuleName()
   * @generated
   */
  int MODULE_NAME = 8;

  /**
   * The number of structural features of the '<em>Module Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_NAME_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.UsesModuleImpl <em>Uses Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.UsesModuleImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getUsesModule()
   * @generated
   */
  int USES_MODULE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_MODULE__NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Uses Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_MODULE_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.UsesEntityImpl <em>Uses Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.UsesEntityImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getUsesEntity()
   * @generated
   */
  int USES_ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_ENTITY__NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Uses Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_ENTITY_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.SubroutineImpl <em>Subroutine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.SubroutineImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubroutine()
   * @generated
   */
  int SUBROUTINE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE__NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE__PARAMS = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subroutine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.FormalParamImpl <em>Formal Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.FormalParamImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getFormalParam()
   * @generated
   */
  int FORMAL_PARAM = 12;

  /**
   * The feature id for the '<em><b>Intent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAM__INTENT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAM__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAM__NAME = 2;

  /**
   * The number of structural features of the '<em>Formal Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.IntentImpl <em>Intent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.IntentImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getIntent()
   * @generated
   */
  int INTENT = 13;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__IN = 0;

  /**
   * The feature id for the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__OUT = 1;

  /**
   * The feature id for the '<em><b>Inout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__INOUT = 2;

  /**
   * The number of structural features of the '<em>Intent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.TypeImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getType()
   * @generated
   */
  int TYPE = 14;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INTEGER = 0;

  /**
   * The feature id for the '<em><b>Character</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CHARACTER = 1;

  /**
   * The feature id for the '<em><b>Logical</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__LOGICAL = 2;

  /**
   * The feature id for the '<em><b>Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__REAL = 3;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DOUBLE = 4;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DERIVED = 5;

  /**
   * The feature id for the '<em><b>Derived Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DERIVED_TYPE = 6;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.SubroutineNameImpl <em>Subroutine Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.SubroutineNameImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubroutineName()
   * @generated
   */
  int SUBROUTINE_NAME = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE_NAME__NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subroutine Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE_NAME_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.CallImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getCall()
   * @generated
   */
  int CALL = 16;

  /**
   * The feature id for the '<em><b>Subroutine Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__SUBROUTINE_NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__PARAMS = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ActualParamImpl <em>Actual Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ActualParamImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getActualParam()
   * @generated
   */
  int ACTUAL_PARAM = 17;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__VALUE = 2;

  /**
   * The number of structural features of the '<em>Actual Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ActualParamByKeywordImpl <em>Actual Param By Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ActualParamByKeywordImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getActualParamByKeyword()
   * @generated
   */
  int ACTUAL_PARAM_BY_KEYWORD = 18;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM_BY_KEYWORD__KEYWORD = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actual Param By Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM_BY_KEYWORD_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.VariableDeclarationImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl <em>Function Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getFunctionAssignment()
   * @generated
   */
  int FUNCTION_ASSIGNMENT = 20;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ASSIGNMENT__LHS = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ASSIGNMENT__FUNCTION_NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ASSIGNMENT__PARAMS = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ASSIGNMENT_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.LocalExpressionImpl <em>Local Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.LocalExpressionImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getLocalExpression()
   * @generated
   */
  int LOCAL_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXPRESSION__ID = 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXPRESSION__LITERAL = 1;

  /**
   * The feature id for the '<em><b>Array Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR = 2;

  /**
   * The number of structural features of the '<em>Local Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ArrayConstructorImpl <em>Array Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ArrayConstructorImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getArrayConstructor()
   * @generated
   */
  int ARRAY_CONSTRUCTOR = 22;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONSTRUCTOR__ITEM = 0;

  /**
   * The number of structural features of the '<em>Array Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONSTRUCTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.ExprImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getExpr()
   * @generated
   */
  int EXPR = 23;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__WILDCARD = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR = 1;

  /**
   * The feature id for the '<em><b>Path Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__PATH_EXPR = 2;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.PathExprImpl <em>Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.PathExprImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getPathExpr()
   * @generated
   */
  int PATH_EXPR = 24;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__TAIL = 1;

  /**
   * The number of structural features of the '<em>Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.AxisImpl <em>Axis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.AxisImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getAxis()
   * @generated
   */
  int AXIS = 25;

  /**
   * The feature id for the '<em><b>Ancestor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS__ANCESTOR = 0;

  /**
   * The number of structural features of the '<em>Axis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.DeclaredEntityImpl <em>Declared Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.DeclaredEntityImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getDeclaredEntity()
   * @generated
   */
  int DECLARED_ENTITY = 26;

  /**
   * The number of structural features of the '<em>Declared Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_ENTITY_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.psyche.impl.PathExprTermImpl <em>Path Expr Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.psyche.impl.PathExprTermImpl
   * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getPathExprTerm()
   * @generated
   */
  int PATH_EXPR_TERM = 27;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_TERM__HEAD = PATH_EXPR__HEAD;

  /**
   * The feature id for the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_TERM__TAIL = PATH_EXPR__TAIL;

  /**
   * The feature id for the '<em><b>Axis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_TERM__AXIS = PATH_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_TERM__REF = PATH_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Path Expr Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_TERM_FEATURE_COUNT = PATH_EXPR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see org.earthsystemmodeling.psyche.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Language#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.Language#getName()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Language#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.earthsystemmodeling.psyche.Language#getUri()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.Language#getConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concept Def</em>'.
   * @see org.earthsystemmodeling.psyche.Language#getConceptDef()
   * @see #getLanguage()
   * @generated
   */
  EReference getLanguage_ConceptDef();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.earthsystemmodeling.psyche.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Annotation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.earthsystemmodeling.psyche.Annotation#getKey()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Key();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.earthsystemmodeling.psyche.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Def</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef
   * @generated
   */
  EClass getConceptDef();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.ConceptDef#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#getMapping()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Mapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.ConceptDef#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#getAnnotation()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.ConceptDef#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#getChild()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Child();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ConceptDef#isNamed <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Named</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#isNamed()
   * @see #getConceptDef()
   * @generated
   */
  EAttribute getConceptDef_Named();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ConceptDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#getName()
   * @see #getConceptDef()
   * @generated
   */
  EAttribute getConceptDef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ConceptDef#isTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top</em>'.
   * @see org.earthsystemmodeling.psyche.ConceptDef#isTop()
   * @see #getConceptDef()
   * @generated
   */
  EAttribute getConceptDef_Top();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute <em>Subconcept Or Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subconcept Or Attribute</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute
   * @generated
   */
  EClass getSubconceptOrAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getName()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EAttribute getSubconceptOrAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getCardinality()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EReference getSubconceptOrAttribute_Cardinality();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isEssential <em>Essential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Essential</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#isEssential()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EAttribute getSubconceptOrAttribute_Essential();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isMustBeNull <em>Must Be Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Must Be Null</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#isMustBeNull()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EAttribute getSubconceptOrAttribute_MustBeNull();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getDef()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EReference getSubconceptOrAttribute_Def();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#isReference()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EAttribute getSubconceptOrAttribute_Reference();

  /**
   * Returns the meta object for the reference '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getRef()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EReference getSubconceptOrAttribute_Ref();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#isAttrib <em>Attrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrib</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#isAttrib()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EAttribute getSubconceptOrAttribute_Attrib();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAttribMapping <em>Attrib Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attrib Mapping</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAttribMapping()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EReference getSubconceptOrAttribute_AttribMapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute#getAnnotation()
   * @see #getSubconceptOrAttribute()
   * @generated
   */
  EReference getSubconceptOrAttribute_Annotation();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see org.earthsystemmodeling.psyche.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrOne <em>Zero Or One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zero Or One</em>'.
   * @see org.earthsystemmodeling.psyche.Cardinality#isZeroOrOne()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_ZeroOrOne();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Cardinality#isZeroOrMore <em>Zero Or More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zero Or More</em>'.
   * @see org.earthsystemmodeling.psyche.Cardinality#isZeroOrMore()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_ZeroOrMore();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Cardinality#isOneOrMore <em>One Or More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>One Or More</em>'.
   * @see org.earthsystemmodeling.psyche.Cardinality#isOneOrMore()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_OneOrMore();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.earthsystemmodeling.psyche.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Mapping#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see org.earthsystemmodeling.psyche.Mapping#getContext()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Context();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Mapping#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemmodeling.psyche.Mapping#getMapping()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Mapping();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Mapping#getBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Before</em>'.
   * @see org.earthsystemmodeling.psyche.Mapping#getBefore()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Before();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Mapping#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>After</em>'.
   * @see org.earthsystemmodeling.psyche.Mapping#getAfter()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_After();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ImplicitContextMapping <em>Implicit Context Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implicit Context Mapping</em>'.
   * @see org.earthsystemmodeling.psyche.ImplicitContextMapping
   * @generated
   */
  EClass getImplicitContextMapping();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.earthsystemmodeling.psyche.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.Module#getName()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Name</em>'.
   * @see org.earthsystemmodeling.psyche.ModuleName
   * @generated
   */
  EClass getModuleName();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.UsesModule <em>Uses Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Module</em>'.
   * @see org.earthsystemmodeling.psyche.UsesModule
   * @generated
   */
  EClass getUsesModule();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.UsesModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.UsesModule#getName()
   * @see #getUsesModule()
   * @generated
   */
  EReference getUsesModule_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.UsesEntity <em>Uses Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Entity</em>'.
   * @see org.earthsystemmodeling.psyche.UsesEntity
   * @generated
   */
  EClass getUsesEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.UsesEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.UsesEntity#getName()
   * @see #getUsesEntity()
   * @generated
   */
  EReference getUsesEntity_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Subroutine <em>Subroutine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subroutine</em>'.
   * @see org.earthsystemmodeling.psyche.Subroutine
   * @generated
   */
  EClass getSubroutine();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Subroutine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.Subroutine#getName()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.Subroutine#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemmodeling.psyche.Subroutine#getParams()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.FormalParam <em>Formal Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Param</em>'.
   * @see org.earthsystemmodeling.psyche.FormalParam
   * @generated
   */
  EClass getFormalParam();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.FormalParam#getIntent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intent</em>'.
   * @see org.earthsystemmodeling.psyche.FormalParam#getIntent()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Intent();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.FormalParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.earthsystemmodeling.psyche.FormalParam#getType()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.FormalParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.FormalParam#getName()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intent</em>'.
   * @see org.earthsystemmodeling.psyche.Intent
   * @generated
   */
  EClass getIntent();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Intent#isIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In</em>'.
   * @see org.earthsystemmodeling.psyche.Intent#isIn()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_In();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Intent#isOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out</em>'.
   * @see org.earthsystemmodeling.psyche.Intent#isOut()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Out();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Intent#isInout <em>Inout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inout</em>'.
   * @see org.earthsystemmodeling.psyche.Intent#isInout()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Inout();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.earthsystemmodeling.psyche.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isInteger()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isCharacter <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Character</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isCharacter()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Character();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isLogical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logical</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isLogical()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Logical();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isReal()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Real();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isDouble <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isDouble()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Double();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Type#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see org.earthsystemmodeling.psyche.Type#isDerived()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Derived();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Type#getDerivedType <em>Derived Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Derived Type</em>'.
   * @see org.earthsystemmodeling.psyche.Type#getDerivedType()
   * @see #getType()
   * @generated
   */
  EReference getType_DerivedType();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.SubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subroutine Name</em>'.
   * @see org.earthsystemmodeling.psyche.SubroutineName
   * @generated
   */
  EClass getSubroutineName();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.SubroutineName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemmodeling.psyche.SubroutineName#getName()
   * @see #getSubroutineName()
   * @generated
   */
  EReference getSubroutineName_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.earthsystemmodeling.psyche.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Call#getSubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subroutine Name</em>'.
   * @see org.earthsystemmodeling.psyche.Call#getSubroutineName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_SubroutineName();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.Call#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemmodeling.psyche.Call#getParams()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ActualParam <em>Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Param</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParam
   * @generated
   */
  EClass getActualParam();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ActualParam#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParam#getKeyword()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ActualParam#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParam#isOptional()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.ActualParam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParam#getValue()
   * @see #getActualParam()
   * @generated
   */
  EReference getActualParam_Value();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ActualParamByKeyword <em>Actual Param By Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Param By Keyword</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParamByKeyword
   * @generated
   */
  EClass getActualParamByKeyword();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.ActualParamByKeyword#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.earthsystemmodeling.psyche.ActualParamByKeyword#getKeyword()
   * @see #getActualParamByKeyword()
   * @generated
   */
  EAttribute getActualParamByKeyword_Keyword();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.earthsystemmodeling.psyche.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.earthsystemmodeling.psyche.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.FunctionAssignment <em>Function Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Assignment</em>'.
   * @see org.earthsystemmodeling.psyche.FunctionAssignment
   * @generated
   */
  EClass getFunctionAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.FunctionAssignment#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.earthsystemmodeling.psyche.FunctionAssignment#getLhs()
   * @see #getFunctionAssignment()
   * @generated
   */
  EReference getFunctionAssignment_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.FunctionAssignment#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Name</em>'.
   * @see org.earthsystemmodeling.psyche.FunctionAssignment#getFunctionName()
   * @see #getFunctionAssignment()
   * @generated
   */
  EReference getFunctionAssignment_FunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.psyche.FunctionAssignment#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemmodeling.psyche.FunctionAssignment#getParams()
   * @see #getFunctionAssignment()
   * @generated
   */
  EReference getFunctionAssignment_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.LocalExpression <em>Local Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Expression</em>'.
   * @see org.earthsystemmodeling.psyche.LocalExpression
   * @generated
   */
  EClass getLocalExpression();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.LocalExpression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.earthsystemmodeling.psyche.LocalExpression#getId()
   * @see #getLocalExpression()
   * @generated
   */
  EAttribute getLocalExpression_Id();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.LocalExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.earthsystemmodeling.psyche.LocalExpression#getLiteral()
   * @see #getLocalExpression()
   * @generated
   */
  EAttribute getLocalExpression_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.LocalExpression#getArrayConstructor <em>Array Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Constructor</em>'.
   * @see org.earthsystemmodeling.psyche.LocalExpression#getArrayConstructor()
   * @see #getLocalExpression()
   * @generated
   */
  EReference getLocalExpression_ArrayConstructor();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.ArrayConstructor <em>Array Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Constructor</em>'.
   * @see org.earthsystemmodeling.psyche.ArrayConstructor
   * @generated
   */
  EClass getArrayConstructor();

  /**
   * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.psyche.ArrayConstructor#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Item</em>'.
   * @see org.earthsystemmodeling.psyche.ArrayConstructor#getItem()
   * @see #getArrayConstructor()
   * @generated
   */
  EAttribute getArrayConstructor_Item();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.earthsystemmodeling.psyche.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Expr#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.earthsystemmodeling.psyche.Expr#isWildcard()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Wildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Expr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.earthsystemmodeling.psyche.Expr#getExpr()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.Expr#getPathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path Expr</em>'.
   * @see org.earthsystemmodeling.psyche.Expr#getPathExpr()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_PathExpr();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr</em>'.
   * @see org.earthsystemmodeling.psyche.PathExpr
   * @generated
   */
  EClass getPathExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.PathExpr#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see org.earthsystemmodeling.psyche.PathExpr#getHead()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_Head();

  /**
   * Returns the meta object for the reference '{@link org.earthsystemmodeling.psyche.PathExpr#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tail</em>'.
   * @see org.earthsystemmodeling.psyche.PathExpr#getTail()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_Tail();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.Axis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axis</em>'.
   * @see org.earthsystemmodeling.psyche.Axis
   * @generated
   */
  EClass getAxis();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.psyche.Axis#isAncestor <em>Ancestor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ancestor</em>'.
   * @see org.earthsystemmodeling.psyche.Axis#isAncestor()
   * @see #getAxis()
   * @generated
   */
  EAttribute getAxis_Ancestor();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.DeclaredEntity <em>Declared Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declared Entity</em>'.
   * @see org.earthsystemmodeling.psyche.DeclaredEntity
   * @generated
   */
  EClass getDeclaredEntity();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.psyche.PathExprTerm <em>Path Expr Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr Term</em>'.
   * @see org.earthsystemmodeling.psyche.PathExprTerm
   * @generated
   */
  EClass getPathExprTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemmodeling.psyche.PathExprTerm#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Axis</em>'.
   * @see org.earthsystemmodeling.psyche.PathExprTerm#getAxis()
   * @see #getPathExprTerm()
   * @generated
   */
  EReference getPathExprTerm_Axis();

  /**
   * Returns the meta object for the reference '{@link org.earthsystemmodeling.psyche.PathExprTerm#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.earthsystemmodeling.psyche.PathExprTerm#getRef()
   * @see #getPathExprTerm()
   * @generated
   */
  EReference getPathExprTerm_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PsycheFactory getPsycheFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.LanguageImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getLanguage()
     * @generated
     */
    EClass LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE__URI = eINSTANCE.getLanguage_Uri();

    /**
     * The meta object literal for the '<em><b>Concept Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE__CONCEPT_DEF = eINSTANCE.getLanguage_ConceptDef();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.AnnotationImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl <em>Concept Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ConceptDefImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getConceptDef()
     * @generated
     */
    EClass CONCEPT_DEF = eINSTANCE.getConceptDef();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_DEF__MAPPING = eINSTANCE.getConceptDef_Mapping();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_DEF__ANNOTATION = eINSTANCE.getConceptDef_Annotation();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_DEF__CHILD = eINSTANCE.getConceptDef_Child();

    /**
     * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_DEF__NAMED = eINSTANCE.getConceptDef_Named();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_DEF__NAME = eINSTANCE.getConceptDef_Name();

    /**
     * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_DEF__TOP = eINSTANCE.getConceptDef_Top();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl <em>Subconcept Or Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubconceptOrAttribute()
     * @generated
     */
    EClass SUBCONCEPT_OR_ATTRIBUTE = eINSTANCE.getSubconceptOrAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT_OR_ATTRIBUTE__NAME = eINSTANCE.getSubconceptOrAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY = eINSTANCE.getSubconceptOrAttribute_Cardinality();

    /**
     * The meta object literal for the '<em><b>Essential</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL = eINSTANCE.getSubconceptOrAttribute_Essential();

    /**
     * The meta object literal for the '<em><b>Must Be Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL = eINSTANCE.getSubconceptOrAttribute_MustBeNull();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT_OR_ATTRIBUTE__DEF = eINSTANCE.getSubconceptOrAttribute_Def();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT_OR_ATTRIBUTE__REFERENCE = eINSTANCE.getSubconceptOrAttribute_Reference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT_OR_ATTRIBUTE__REF = eINSTANCE.getSubconceptOrAttribute_Ref();

    /**
     * The meta object literal for the '<em><b>Attrib</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT_OR_ATTRIBUTE__ATTRIB = eINSTANCE.getSubconceptOrAttribute_Attrib();

    /**
     * The meta object literal for the '<em><b>Attrib Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING = eINSTANCE.getSubconceptOrAttribute_AttribMapping();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION = eINSTANCE.getSubconceptOrAttribute_Annotation();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.CardinalityImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '<em><b>Zero Or One</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY__ZERO_OR_ONE = eINSTANCE.getCardinality_ZeroOrOne();

    /**
     * The meta object literal for the '<em><b>Zero Or More</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY__ZERO_OR_MORE = eINSTANCE.getCardinality_ZeroOrMore();

    /**
     * The meta object literal for the '<em><b>One Or More</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY__ONE_OR_MORE = eINSTANCE.getCardinality_OneOrMore();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.MappingImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__CONTEXT = eINSTANCE.getMapping_Context();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPPING = eINSTANCE.getMapping_Mapping();

    /**
     * The meta object literal for the '<em><b>Before</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__BEFORE = eINSTANCE.getMapping_Before();

    /**
     * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__AFTER = eINSTANCE.getMapping_After();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ImplicitContextMappingImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getImplicitContextMapping()
     * @generated
     */
    EClass IMPLICIT_CONTEXT_MAPPING = eINSTANCE.getImplicitContextMapping();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ModuleImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ModuleNameImpl <em>Module Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ModuleNameImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getModuleName()
     * @generated
     */
    EClass MODULE_NAME = eINSTANCE.getModuleName();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.UsesModuleImpl <em>Uses Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.UsesModuleImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getUsesModule()
     * @generated
     */
    EClass USES_MODULE = eINSTANCE.getUsesModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USES_MODULE__NAME = eINSTANCE.getUsesModule_Name();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.UsesEntityImpl <em>Uses Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.UsesEntityImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getUsesEntity()
     * @generated
     */
    EClass USES_ENTITY = eINSTANCE.getUsesEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USES_ENTITY__NAME = eINSTANCE.getUsesEntity_Name();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.SubroutineImpl <em>Subroutine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.SubroutineImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubroutine()
     * @generated
     */
    EClass SUBROUTINE = eINSTANCE.getSubroutine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE__NAME = eINSTANCE.getSubroutine_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE__PARAMS = eINSTANCE.getSubroutine_Params();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.FormalParamImpl <em>Formal Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.FormalParamImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getFormalParam()
     * @generated
     */
    EClass FORMAL_PARAM = eINSTANCE.getFormalParam();

    /**
     * The meta object literal for the '<em><b>Intent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAM__INTENT = eINSTANCE.getFormalParam_Intent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAM__TYPE = eINSTANCE.getFormalParam_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAM__NAME = eINSTANCE.getFormalParam_Name();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.IntentImpl <em>Intent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.IntentImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getIntent()
     * @generated
     */
    EClass INTENT = eINSTANCE.getIntent();

    /**
     * The meta object literal for the '<em><b>In</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT__IN = eINSTANCE.getIntent_In();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT__OUT = eINSTANCE.getIntent_Out();

    /**
     * The meta object literal for the '<em><b>Inout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT__INOUT = eINSTANCE.getIntent_Inout();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.TypeImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__INTEGER = eINSTANCE.getType_Integer();

    /**
     * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__CHARACTER = eINSTANCE.getType_Character();

    /**
     * The meta object literal for the '<em><b>Logical</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__LOGICAL = eINSTANCE.getType_Logical();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__REAL = eINSTANCE.getType_Real();

    /**
     * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__DOUBLE = eINSTANCE.getType_Double();

    /**
     * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__DERIVED = eINSTANCE.getType_Derived();

    /**
     * The meta object literal for the '<em><b>Derived Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__DERIVED_TYPE = eINSTANCE.getType_DerivedType();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.SubroutineNameImpl <em>Subroutine Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.SubroutineNameImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getSubroutineName()
     * @generated
     */
    EClass SUBROUTINE_NAME = eINSTANCE.getSubroutineName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE_NAME__NAME = eINSTANCE.getSubroutineName_Name();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.CallImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Subroutine Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__SUBROUTINE_NAME = eINSTANCE.getCall_SubroutineName();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__PARAMS = eINSTANCE.getCall_Params();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ActualParamImpl <em>Actual Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ActualParamImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getActualParam()
     * @generated
     */
    EClass ACTUAL_PARAM = eINSTANCE.getActualParam();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_PARAM__KEYWORD = eINSTANCE.getActualParam_Keyword();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_PARAM__OPTIONAL = eINSTANCE.getActualParam_Optional();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_PARAM__VALUE = eINSTANCE.getActualParam_Value();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ActualParamByKeywordImpl <em>Actual Param By Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ActualParamByKeywordImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getActualParamByKeyword()
     * @generated
     */
    EClass ACTUAL_PARAM_BY_KEYWORD = eINSTANCE.getActualParamByKeyword();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_PARAM_BY_KEYWORD__KEYWORD = eINSTANCE.getActualParamByKeyword_Keyword();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.VariableDeclarationImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl <em>Function Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getFunctionAssignment()
     * @generated
     */
    EClass FUNCTION_ASSIGNMENT = eINSTANCE.getFunctionAssignment();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ASSIGNMENT__LHS = eINSTANCE.getFunctionAssignment_Lhs();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ASSIGNMENT__FUNCTION_NAME = eINSTANCE.getFunctionAssignment_FunctionName();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ASSIGNMENT__PARAMS = eINSTANCE.getFunctionAssignment_Params();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.LocalExpressionImpl <em>Local Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.LocalExpressionImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getLocalExpression()
     * @generated
     */
    EClass LOCAL_EXPRESSION = eINSTANCE.getLocalExpression();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_EXPRESSION__ID = eINSTANCE.getLocalExpression_Id();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_EXPRESSION__LITERAL = eINSTANCE.getLocalExpression_Literal();

    /**
     * The meta object literal for the '<em><b>Array Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR = eINSTANCE.getLocalExpression_ArrayConstructor();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ArrayConstructorImpl <em>Array Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ArrayConstructorImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getArrayConstructor()
     * @generated
     */
    EClass ARRAY_CONSTRUCTOR = eINSTANCE.getArrayConstructor();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_CONSTRUCTOR__ITEM = eINSTANCE.getArrayConstructor_Item();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.ExprImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__WILDCARD = eINSTANCE.getExpr_Wildcard();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR = eINSTANCE.getExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Path Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__PATH_EXPR = eINSTANCE.getExpr_PathExpr();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.PathExprImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getPathExpr()
     * @generated
     */
    EClass PATH_EXPR = eINSTANCE.getPathExpr();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__HEAD = eINSTANCE.getPathExpr_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__TAIL = eINSTANCE.getPathExpr_Tail();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.AxisImpl <em>Axis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.AxisImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getAxis()
     * @generated
     */
    EClass AXIS = eINSTANCE.getAxis();

    /**
     * The meta object literal for the '<em><b>Ancestor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AXIS__ANCESTOR = eINSTANCE.getAxis_Ancestor();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.DeclaredEntityImpl <em>Declared Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.DeclaredEntityImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getDeclaredEntity()
     * @generated
     */
    EClass DECLARED_ENTITY = eINSTANCE.getDeclaredEntity();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.psyche.impl.PathExprTermImpl <em>Path Expr Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.psyche.impl.PathExprTermImpl
     * @see org.earthsystemmodeling.psyche.impl.PsychePackageImpl#getPathExprTerm()
     * @generated
     */
    EClass PATH_EXPR_TERM = eINSTANCE.getPathExprTerm();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR_TERM__AXIS = eINSTANCE.getPathExprTerm_Axis();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR_TERM__REF = eINSTANCE.getPathExprTerm_Ref();

  }

} //PsychePackage
