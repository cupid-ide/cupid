/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.ActualParam;
import org.earthsystemcurator.cupidLanguage.AnonymousConcept;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.Cardinality;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.ConceptDefBody;
import org.earthsystemcurator.cupidLanguage.ConceptDefOrRef;
import org.earthsystemcurator.cupidLanguage.ConceptRef;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.IDOrPathExpr;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Intent;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.Mappings;
import org.earthsystemcurator.cupidLanguage.Module;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.Subroutine;
import org.earthsystemcurator.cupidLanguage.SubroutineName;
import org.earthsystemcurator.cupidLanguage.Type;
import org.earthsystemcurator.cupidLanguage.UsesEntity;
import org.earthsystemcurator.cupidLanguage.UsesModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CupidLanguagePackageImpl extends EPackageImpl implements CupidLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptDefOrRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonymousConceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptDefBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implicitContextMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usesModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usesEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subroutineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subroutineNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idOrWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idOrPathExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathExprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CupidLanguagePackageImpl()
  {
    super(eNS_URI, CupidLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CupidLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CupidLanguagePackage init()
  {
    if (isInited) return (CupidLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(CupidLanguagePackage.eNS_URI);

    // Obtain or create and register package
    CupidLanguagePackageImpl theCupidLanguagePackage = (CupidLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CupidLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CupidLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCupidLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theCupidLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCupidLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CupidLanguagePackage.eNS_URI, theCupidLanguagePackage);
    return theCupidLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappings()
  {
    return mappingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappings_Mappings()
  {
    return (EReference)mappingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappings_Concepts()
  {
    return (EReference)mappingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptDefOrRef()
  {
    return conceptDefOrRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptDefOrRef_LocalName()
  {
    return (EAttribute)conceptDefOrRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptDefOrRef_Cardinality()
  {
    return (EReference)conceptDefOrRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptDefOrRef_Required()
  {
    return (EAttribute)conceptDefOrRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptDef()
  {
    return conceptDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptDef_Top()
  {
    return (EAttribute)conceptDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptDef_Name()
  {
    return (EAttribute)conceptDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptDef_Mapping()
  {
    return (EReference)conceptDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptDef_Body()
  {
    return (EReference)conceptDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnonymousConcept()
  {
    return anonymousConceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousConcept_Mapping()
  {
    return (EReference)anonymousConceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousConcept_Body()
  {
    return (EReference)anonymousConceptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptDefBody()
  {
    return conceptDefBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptDefBody_Subconcept()
  {
    return (EReference)conceptDefBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptRef()
  {
    return conceptRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptRef_Name()
  {
    return (EReference)conceptRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardinality()
  {
    return cardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinality_ZeroOrMore()
  {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinality_OneOrMore()
  {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_Context()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_Mapping()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplicitContextMapping()
  {
    return implicitContextMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Name()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsesModule()
  {
    return usesModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesModule_Name()
  {
    return (EReference)usesModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsesEntity()
  {
    return usesEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesEntity_Name()
  {
    return (EReference)usesEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubroutine()
  {
    return subroutineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutine_Name()
  {
    return (EReference)subroutineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutine_Params()
  {
    return (EReference)subroutineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalParam()
  {
    return formalParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalParam_Intent()
  {
    return (EReference)formalParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalParam_Type()
  {
    return (EReference)formalParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalParam_Name()
  {
    return (EReference)formalParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntent()
  {
    return intentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntent_In()
  {
    return (EAttribute)intentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntent_Out()
  {
    return (EAttribute)intentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntent_Inout()
  {
    return (EAttribute)intentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Integer()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Character()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Logical()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Real()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Double()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Derived()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_DerivedType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubroutineName()
  {
    return subroutineNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutineName_Name()
  {
    return (EReference)subroutineNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCall()
  {
    return callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_SubroutineName()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Params()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualParam()
  {
    return actualParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActualParam_Keyword()
  {
    return (EAttribute)actualParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActualParam_Optional()
  {
    return (EAttribute)actualParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActualParam_Value()
  {
    return (EReference)actualParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDOrWildcard()
  {
    return idOrWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDOrWildcard_Id()
  {
    return (EAttribute)idOrWildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDOrWildcard_Wildcard()
  {
    return (EAttribute)idOrWildcardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDOrPathExpr()
  {
    return idOrPathExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathExpr()
  {
    return pathExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathExpr_Segments()
  {
    return (EAttribute)pathExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguageFactory getCupidLanguageFactory()
  {
    return (CupidLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mappingsEClass = createEClass(MAPPINGS);
    createEReference(mappingsEClass, MAPPINGS__MAPPINGS);
    createEReference(mappingsEClass, MAPPINGS__CONCEPTS);

    conceptDefOrRefEClass = createEClass(CONCEPT_DEF_OR_REF);
    createEAttribute(conceptDefOrRefEClass, CONCEPT_DEF_OR_REF__LOCAL_NAME);
    createEReference(conceptDefOrRefEClass, CONCEPT_DEF_OR_REF__CARDINALITY);
    createEAttribute(conceptDefOrRefEClass, CONCEPT_DEF_OR_REF__REQUIRED);

    conceptDefEClass = createEClass(CONCEPT_DEF);
    createEAttribute(conceptDefEClass, CONCEPT_DEF__TOP);
    createEAttribute(conceptDefEClass, CONCEPT_DEF__NAME);
    createEReference(conceptDefEClass, CONCEPT_DEF__MAPPING);
    createEReference(conceptDefEClass, CONCEPT_DEF__BODY);

    anonymousConceptEClass = createEClass(ANONYMOUS_CONCEPT);
    createEReference(anonymousConceptEClass, ANONYMOUS_CONCEPT__MAPPING);
    createEReference(anonymousConceptEClass, ANONYMOUS_CONCEPT__BODY);

    conceptDefBodyEClass = createEClass(CONCEPT_DEF_BODY);
    createEReference(conceptDefBodyEClass, CONCEPT_DEF_BODY__SUBCONCEPT);

    conceptRefEClass = createEClass(CONCEPT_REF);
    createEReference(conceptRefEClass, CONCEPT_REF__NAME);

    cardinalityEClass = createEClass(CARDINALITY);
    createEAttribute(cardinalityEClass, CARDINALITY__ZERO_OR_MORE);
    createEAttribute(cardinalityEClass, CARDINALITY__ONE_OR_MORE);

    mappingEClass = createEClass(MAPPING);
    createEReference(mappingEClass, MAPPING__CONTEXT);
    createEReference(mappingEClass, MAPPING__MAPPING);

    implicitContextMappingEClass = createEClass(IMPLICIT_CONTEXT_MAPPING);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__NAME);

    usesModuleEClass = createEClass(USES_MODULE);
    createEReference(usesModuleEClass, USES_MODULE__NAME);

    usesEntityEClass = createEClass(USES_ENTITY);
    createEReference(usesEntityEClass, USES_ENTITY__NAME);

    subroutineEClass = createEClass(SUBROUTINE);
    createEReference(subroutineEClass, SUBROUTINE__NAME);
    createEReference(subroutineEClass, SUBROUTINE__PARAMS);

    formalParamEClass = createEClass(FORMAL_PARAM);
    createEReference(formalParamEClass, FORMAL_PARAM__INTENT);
    createEReference(formalParamEClass, FORMAL_PARAM__TYPE);
    createEReference(formalParamEClass, FORMAL_PARAM__NAME);

    intentEClass = createEClass(INTENT);
    createEAttribute(intentEClass, INTENT__IN);
    createEAttribute(intentEClass, INTENT__OUT);
    createEAttribute(intentEClass, INTENT__INOUT);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__INTEGER);
    createEAttribute(typeEClass, TYPE__CHARACTER);
    createEAttribute(typeEClass, TYPE__LOGICAL);
    createEAttribute(typeEClass, TYPE__REAL);
    createEAttribute(typeEClass, TYPE__DOUBLE);
    createEAttribute(typeEClass, TYPE__DERIVED);
    createEReference(typeEClass, TYPE__DERIVED_TYPE);

    subroutineNameEClass = createEClass(SUBROUTINE_NAME);
    createEReference(subroutineNameEClass, SUBROUTINE_NAME__NAME);

    callEClass = createEClass(CALL);
    createEReference(callEClass, CALL__SUBROUTINE_NAME);
    createEReference(callEClass, CALL__PARAMS);

    actualParamEClass = createEClass(ACTUAL_PARAM);
    createEAttribute(actualParamEClass, ACTUAL_PARAM__KEYWORD);
    createEAttribute(actualParamEClass, ACTUAL_PARAM__OPTIONAL);
    createEReference(actualParamEClass, ACTUAL_PARAM__VALUE);

    idOrWildcardEClass = createEClass(ID_OR_WILDCARD);
    createEAttribute(idOrWildcardEClass, ID_OR_WILDCARD__ID);
    createEAttribute(idOrWildcardEClass, ID_OR_WILDCARD__WILDCARD);

    idOrPathExprEClass = createEClass(ID_OR_PATH_EXPR);

    pathExprEClass = createEClass(PATH_EXPR);
    createEAttribute(pathExprEClass, PATH_EXPR__SEGMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anonymousConceptEClass.getESuperTypes().add(this.getConceptDefOrRef());
    conceptRefEClass.getESuperTypes().add(this.getConceptDefOrRef());
    moduleEClass.getESuperTypes().add(this.getImplicitContextMapping());
    usesModuleEClass.getESuperTypes().add(this.getImplicitContextMapping());
    usesEntityEClass.getESuperTypes().add(this.getImplicitContextMapping());
    subroutineEClass.getESuperTypes().add(this.getImplicitContextMapping());
    subroutineNameEClass.getESuperTypes().add(this.getImplicitContextMapping());
    callEClass.getESuperTypes().add(this.getImplicitContextMapping());
    idOrWildcardEClass.getESuperTypes().add(this.getIDOrPathExpr());
    pathExprEClass.getESuperTypes().add(this.getIDOrPathExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(mappingsEClass, Mappings.class, "Mappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappings_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Mappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappings_Concepts(), this.getConceptDef(), null, "concepts", null, 0, -1, Mappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptDefOrRefEClass, ConceptDefOrRef.class, "ConceptDefOrRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConceptDefOrRef_LocalName(), ecorePackage.getEString(), "localName", null, 0, 1, ConceptDefOrRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConceptDefOrRef_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, ConceptDefOrRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConceptDefOrRef_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, ConceptDefOrRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptDefEClass, ConceptDef.class, "ConceptDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConceptDef_Top(), ecorePackage.getEBoolean(), "top", null, 0, 1, ConceptDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConceptDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConceptDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConceptDef_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, ConceptDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConceptDef_Body(), this.getConceptDefBody(), null, "body", null, 0, 1, ConceptDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anonymousConceptEClass, AnonymousConcept.class, "AnonymousConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnonymousConcept_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, AnonymousConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnonymousConcept_Body(), this.getConceptDefBody(), null, "body", null, 0, 1, AnonymousConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptDefBodyEClass, ConceptDefBody.class, "ConceptDefBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConceptDefBody_Subconcept(), this.getConceptDefOrRef(), null, "subconcept", null, 0, -1, ConceptDefBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptRefEClass, ConceptRef.class, "ConceptRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConceptRef_Name(), this.getConceptDef(), null, "name", null, 0, 1, ConceptRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardinality_ZeroOrMore(), ecorePackage.getEBoolean(), "zeroOrMore", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardinality_OneOrMore(), ecorePackage.getEBoolean(), "oneOrMore", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_Context(), this.getPathExpr(), null, "context", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_Mapping(), this.getImplicitContextMapping(), null, "mapping", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implicitContextMappingEClass, ImplicitContextMapping.class, "ImplicitContextMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usesModuleEClass, UsesModule.class, "UsesModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsesModule_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, UsesModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usesEntityEClass, UsesEntity.class, "UsesEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsesEntity_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, UsesEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subroutineEClass, Subroutine.class, "Subroutine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubroutine_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, Subroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubroutine_Params(), this.getFormalParam(), null, "params", null, 0, -1, Subroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalParamEClass, FormalParam.class, "FormalParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormalParam_Intent(), this.getIntent(), null, "intent", null, 0, 1, FormalParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormalParam_Type(), this.getType(), null, "type", null, 0, 1, FormalParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormalParam_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, FormalParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentEClass, Intent.class, "Intent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntent_In(), ecorePackage.getEBoolean(), "in", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntent_Out(), ecorePackage.getEBoolean(), "out", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntent_Inout(), ecorePackage.getEBoolean(), "inout", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Integer(), ecorePackage.getEBoolean(), "integer", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Character(), ecorePackage.getEBoolean(), "character", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Logical(), ecorePackage.getEBoolean(), "logical", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Real(), ecorePackage.getEBoolean(), "real", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Double(), ecorePackage.getEBoolean(), "double", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_DerivedType(), this.getIDOrPathExpr(), null, "derivedType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subroutineNameEClass, SubroutineName.class, "SubroutineName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubroutineName_Name(), this.getIDOrPathExpr(), null, "name", null, 0, 1, SubroutineName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCall_SubroutineName(), this.getIDOrPathExpr(), null, "subroutineName", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCall_Params(), this.getActualParam(), null, "params", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualParamEClass, ActualParam.class, "ActualParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActualParam_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, ActualParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActualParam_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, ActualParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActualParam_Value(), this.getIDOrPathExpr(), null, "value", null, 0, 1, ActualParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idOrWildcardEClass, IDOrWildcard.class, "IDOrWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDOrWildcard_Id(), ecorePackage.getEString(), "id", null, 0, 1, IDOrWildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIDOrWildcard_Wildcard(), ecorePackage.getEBoolean(), "wildcard", null, 0, 1, IDOrWildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idOrPathExprEClass, IDOrPathExpr.class, "IDOrPathExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pathExprEClass, PathExpr.class, "PathExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathExpr_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, PathExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CupidLanguagePackageImpl
