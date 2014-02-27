/**
 */
package org.earthsystemcurator.cupidLanguage;

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
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface CupidLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cupidLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.earthsystemcurator.org/CupidLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cupidLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CupidLanguagePackage eINSTANCE = org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.LanguageImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getLanguage()
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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl <em>Subconcept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubconcept()
   * @generated
   */
  int SUBCONCEPT = 1;

  /**
   * The feature id for the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__ATTRIB = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__NAME = 1;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__CARDINALITY = 2;

  /**
   * The feature id for the '<em><b>Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__ESSENTIAL = 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__REF = 4;

  /**
   * The feature id for the '<em><b>Concept Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__CONCEPT_DEF = 5;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__MAPPING = 6;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT__BODY = 8;

  /**
   * The number of structural features of the '<em>Subconcept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCONCEPT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.AnnotationImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 2;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl <em>Concept Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getConceptDef()
   * @generated
   */
  int CONCEPT_DEF = 3;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__TOP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__MAPPING = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF__BODY = 4;

  /**
   * The number of structural features of the '<em>Concept Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefBodyImpl <em>Concept Def Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ConceptDefBodyImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getConceptDefBody()
   * @generated
   */
  int CONCEPT_DEF_BODY = 4;

  /**
   * The feature id for the '<em><b>Subconcept</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF_BODY__SUBCONCEPT = 0;

  /**
   * The number of structural features of the '<em>Concept Def Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_DEF_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 5;

  /**
   * The feature id for the '<em><b>Zero Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__ZERO_OR_MORE = 0;

  /**
   * The feature id for the '<em><b>One Or More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__ONE_OR_MORE = 1;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.MappingImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 6;

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
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getImplicitContextMapping()
   * @generated
   */
  int IMPLICIT_CONTEXT_MAPPING = 7;

  /**
   * The number of structural features of the '<em>Implicit Context Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ModuleImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getModule()
   * @generated
   */
  int MODULE = 8;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ModuleNameImpl <em>Module Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ModuleNameImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getModuleName()
   * @generated
   */
  int MODULE_NAME = 9;

  /**
   * The number of structural features of the '<em>Module Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_NAME_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.UsesModuleImpl <em>Uses Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.UsesModuleImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getUsesModule()
   * @generated
   */
  int USES_MODULE = 10;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.UsesEntityImpl <em>Uses Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.UsesEntityImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getUsesEntity()
   * @generated
   */
  int USES_ENTITY = 11;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubroutineImpl <em>Subroutine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.SubroutineImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubroutine()
   * @generated
   */
  int SUBROUTINE = 12;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.FormalParamImpl <em>Formal Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.FormalParamImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getFormalParam()
   * @generated
   */
  int FORMAL_PARAM = 13;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.IntentImpl <em>Intent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.IntentImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIntent()
   * @generated
   */
  int INTENT = 14;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.TypeImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubroutineNameImpl <em>Subroutine Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.SubroutineNameImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubroutineName()
   * @generated
   */
  int SUBROUTINE_NAME = 16;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.CallImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCall()
   * @generated
   */
  int CALL = 17;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl <em>Actual Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getActualParam()
   * @generated
   */
  int ACTUAL_PARAM = 18;

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
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl <em>ID Or Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrPathExpr()
   * @generated
   */
  int ID_OR_PATH_EXPR = 20;

  /**
   * The number of structural features of the '<em>ID Or Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_PATH_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl <em>ID Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrWildcard()
   * @generated
   */
  int ID_OR_WILDCARD = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD__ID = ID_OR_PATH_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD__WILDCARD = ID_OR_PATH_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ID Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD_FEATURE_COUNT = ID_OR_PATH_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.PathExprImpl <em>Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.PathExprImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getPathExpr()
   * @generated
   */
  int PATH_EXPR = 21;

  /**
   * The feature id for the '<em><b>Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__SEGMENTS = ID_OR_PATH_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_FEATURE_COUNT = ID_OR_PATH_EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Language#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Language#getName()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Language#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Language#getUri()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Language#getConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concept Def</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Language#getConceptDef()
   * @see #getLanguage()
   * @generated
   */
  EReference getLanguage_ConceptDef();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Subconcept <em>Subconcept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subconcept</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept
   * @generated
   */
  EClass getSubconcept();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isAttrib <em>Attrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrib</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#isAttrib()
   * @see #getSubconcept()
   * @generated
   */
  EAttribute getSubconcept_Attrib();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getName()
   * @see #getSubconcept()
   * @generated
   */
  EAttribute getSubconcept_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getCardinality()
   * @see #getSubconcept()
   * @generated
   */
  EReference getSubconcept_Cardinality();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isEssential <em>Essential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Essential</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#isEssential()
   * @see #getSubconcept()
   * @generated
   */
  EAttribute getSubconcept_Essential();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#isRef()
   * @see #getSubconcept()
   * @generated
   */
  EAttribute getSubconcept_Ref();

  /**
   * Returns the meta object for the reference '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept Def</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getConceptDef()
   * @see #getSubconcept()
   * @generated
   */
  EReference getSubconcept_ConceptDef();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getMapping()
   * @see #getSubconcept()
   * @generated
   */
  EReference getSubconcept_Mapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getAnnotation()
   * @see #getSubconcept()
   * @generated
   */
  EReference getSubconcept_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subconcept#getBody()
   * @see #getSubconcept()
   * @generated
   */
  EReference getSubconcept_Body();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Annotation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Annotation#getKey()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Key();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Def</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef
   * @generated
   */
  EClass getConceptDef();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#isTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef#isTop()
   * @see #getConceptDef()
   * @generated
   */
  EAttribute getConceptDef_Top();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef#getName()
   * @see #getConceptDef()
   * @generated
   */
  EAttribute getConceptDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef#getMapping()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Mapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef#getAnnotation()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef#getBody()
   * @see #getConceptDef()
   * @generated
   */
  EReference getConceptDef_Body();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ConceptDefBody <em>Concept Def Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Def Body</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDefBody
   * @generated
   */
  EClass getConceptDefBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.ConceptDefBody#getSubconcept <em>Subconcept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subconcept</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDefBody#getSubconcept()
   * @see #getConceptDefBody()
   * @generated
   */
  EReference getConceptDefBody_Subconcept();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Cardinality#isZeroOrMore <em>Zero Or More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zero Or More</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Cardinality#isZeroOrMore()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_ZeroOrMore();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Cardinality#isOneOrMore <em>One Or More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>One Or More</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Cardinality#isOneOrMore()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_OneOrMore();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Mapping#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping#getContext()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Context();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Mapping#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping#getMapping()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Mapping();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ImplicitContextMapping <em>Implicit Context Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implicit Context Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ImplicitContextMapping
   * @generated
   */
  EClass getImplicitContextMapping();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Module#getName()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ModuleName
   * @generated
   */
  EClass getModuleName();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.UsesModule <em>Uses Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Module</em>'.
   * @see org.earthsystemcurator.cupidLanguage.UsesModule
   * @generated
   */
  EClass getUsesModule();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.UsesModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.UsesModule#getName()
   * @see #getUsesModule()
   * @generated
   */
  EReference getUsesModule_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.UsesEntity <em>Uses Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Entity</em>'.
   * @see org.earthsystemcurator.cupidLanguage.UsesEntity
   * @generated
   */
  EClass getUsesEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.UsesEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.UsesEntity#getName()
   * @see #getUsesEntity()
   * @generated
   */
  EReference getUsesEntity_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Subroutine <em>Subroutine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subroutine</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subroutine
   * @generated
   */
  EClass getSubroutine();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Subroutine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subroutine#getName()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Subroutine#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Subroutine#getParams()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.FormalParam <em>Formal Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Param</em>'.
   * @see org.earthsystemcurator.cupidLanguage.FormalParam
   * @generated
   */
  EClass getFormalParam();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getIntent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intent</em>'.
   * @see org.earthsystemcurator.cupidLanguage.FormalParam#getIntent()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Intent();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.earthsystemcurator.cupidLanguage.FormalParam#getType()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.FormalParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.FormalParam#getName()
   * @see #getFormalParam()
   * @generated
   */
  EReference getFormalParam_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intent</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Intent
   * @generated
   */
  EClass getIntent();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Intent#isIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Intent#isIn()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_In();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Intent#isOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Intent#isOut()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Out();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Intent#isInout <em>Inout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inout</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Intent#isInout()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Inout();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isInteger()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isCharacter <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Character</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isCharacter()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Character();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isLogical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logical</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isLogical()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Logical();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isReal()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Real();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isDouble <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isDouble()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Double();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.Type#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#isDerived()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Derived();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Type#getDerivedType <em>Derived Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Derived Type</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Type#getDerivedType()
   * @see #getType()
   * @generated
   */
  EReference getType_DerivedType();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.SubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subroutine Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.SubroutineName
   * @generated
   */
  EClass getSubroutineName();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.SubroutineName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.SubroutineName#getName()
   * @see #getSubroutineName()
   * @generated
   */
  EReference getSubroutineName_Name();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Call#getSubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subroutine Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call#getSubroutineName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_SubroutineName();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Call#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call#getParams()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ActualParam <em>Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Param</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam
   * @generated
   */
  EClass getActualParam();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ActualParam#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#getKeyword()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ActualParam#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#isOptional()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.ActualParam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#getValue()
   * @see #getActualParam()
   * @generated
   */
  EReference getActualParam_Value();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard <em>ID Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Or Wildcard</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard
   * @generated
   */
  EClass getIDOrWildcard();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard#getId()
   * @see #getIDOrWildcard()
   * @generated
   */
  EAttribute getIDOrWildcard_Id();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard#isWildcard()
   * @see #getIDOrWildcard()
   * @generated
   */
  EAttribute getIDOrWildcard_Wildcard();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.IDOrPathExpr <em>ID Or Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Or Path Expr</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrPathExpr
   * @generated
   */
  EClass getIDOrPathExpr();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr</em>'.
   * @see org.earthsystemcurator.cupidLanguage.PathExpr
   * @generated
   */
  EClass getPathExpr();

  /**
   * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupidLanguage.PathExpr#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Segments</em>'.
   * @see org.earthsystemcurator.cupidLanguage.PathExpr#getSegments()
   * @see #getPathExpr()
   * @generated
   */
  EAttribute getPathExpr_Segments();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CupidLanguageFactory getCupidLanguageFactory();

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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.LanguageImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getLanguage()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl <em>Subconcept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubconcept()
     * @generated
     */
    EClass SUBCONCEPT = eINSTANCE.getSubconcept();

    /**
     * The meta object literal for the '<em><b>Attrib</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT__ATTRIB = eINSTANCE.getSubconcept_Attrib();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT__NAME = eINSTANCE.getSubconcept_Name();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT__CARDINALITY = eINSTANCE.getSubconcept_Cardinality();

    /**
     * The meta object literal for the '<em><b>Essential</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT__ESSENTIAL = eINSTANCE.getSubconcept_Essential();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCONCEPT__REF = eINSTANCE.getSubconcept_Ref();

    /**
     * The meta object literal for the '<em><b>Concept Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT__CONCEPT_DEF = eINSTANCE.getSubconcept_ConceptDef();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT__MAPPING = eINSTANCE.getSubconcept_Mapping();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT__ANNOTATION = eINSTANCE.getSubconcept_Annotation();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCONCEPT__BODY = eINSTANCE.getSubconcept_Body();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.AnnotationImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getAnnotation()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl <em>Concept Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getConceptDef()
     * @generated
     */
    EClass CONCEPT_DEF = eINSTANCE.getConceptDef();

    /**
     * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_DEF__TOP = eINSTANCE.getConceptDef_Top();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_DEF__NAME = eINSTANCE.getConceptDef_Name();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_DEF__BODY = eINSTANCE.getConceptDef_Body();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefBodyImpl <em>Concept Def Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ConceptDefBodyImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getConceptDefBody()
     * @generated
     */
    EClass CONCEPT_DEF_BODY = eINSTANCE.getConceptDefBody();

    /**
     * The meta object literal for the '<em><b>Subconcept</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_DEF_BODY__SUBCONCEPT = eINSTANCE.getConceptDefBody_Subconcept();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.MappingImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMapping()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getImplicitContextMapping()
     * @generated
     */
    EClass IMPLICIT_CONTEXT_MAPPING = eINSTANCE.getImplicitContextMapping();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ModuleImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getModule()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ModuleNameImpl <em>Module Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ModuleNameImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getModuleName()
     * @generated
     */
    EClass MODULE_NAME = eINSTANCE.getModuleName();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.UsesModuleImpl <em>Uses Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.UsesModuleImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getUsesModule()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.UsesEntityImpl <em>Uses Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.UsesEntityImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getUsesEntity()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubroutineImpl <em>Subroutine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.SubroutineImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubroutine()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.FormalParamImpl <em>Formal Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.FormalParamImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getFormalParam()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.IntentImpl <em>Intent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.IntentImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIntent()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.TypeImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getType()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.SubroutineNameImpl <em>Subroutine Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.SubroutineNameImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getSubroutineName()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.CallImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCall()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl <em>Actual Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getActualParam()
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
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl <em>ID Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrWildcard()
     * @generated
     */
    EClass ID_OR_WILDCARD = eINSTANCE.getIDOrWildcard();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_OR_WILDCARD__ID = eINSTANCE.getIDOrWildcard_Id();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_OR_WILDCARD__WILDCARD = eINSTANCE.getIDOrWildcard_Wildcard();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl <em>ID Or Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrPathExpr()
     * @generated
     */
    EClass ID_OR_PATH_EXPR = eINSTANCE.getIDOrPathExpr();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.PathExprImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getPathExpr()
     * @generated
     */
    EClass PATH_EXPR = eINSTANCE.getPathExpr();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_EXPR__SEGMENTS = eINSTANCE.getPathExpr_Segments();

  }

} //CupidLanguagePackage
