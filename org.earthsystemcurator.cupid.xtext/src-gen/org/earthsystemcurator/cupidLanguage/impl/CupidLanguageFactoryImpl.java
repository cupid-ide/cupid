/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CupidLanguageFactoryImpl extends EFactoryImpl implements CupidLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CupidLanguageFactory init()
  {
    try
    {
      CupidLanguageFactory theCupidLanguageFactory = (CupidLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(CupidLanguagePackage.eNS_URI);
      if (theCupidLanguageFactory != null)
      {
        return theCupidLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CupidLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CupidLanguagePackage.MAPPINGS: return createMappings();
      case CupidLanguagePackage.MAPPING: return createMapping();
      case CupidLanguagePackage.IMPLICIT_CONTEXT_MAPPING: return createImplicitContextMapping();
      case CupidLanguagePackage.CALL: return createCall();
      case CupidLanguagePackage.ACTUAL_PARAM: return createActualParam();
      case CupidLanguagePackage.ID_OR_WILDCARD: return createIDOrWildcard();
      case CupidLanguagePackage.ID_OR_PATH_EXPR: return createIDOrPathExpr();
      case CupidLanguagePackage.PATH_EXPR: return createPathExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappings createMappings()
  {
    MappingsImpl mappings = new MappingsImpl();
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitContextMapping createImplicitContextMapping()
  {
    ImplicitContextMappingImpl implicitContextMapping = new ImplicitContextMappingImpl();
    return implicitContextMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParam createActualParam()
  {
    ActualParamImpl actualParam = new ActualParamImpl();
    return actualParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrWildcard createIDOrWildcard()
  {
    IDOrWildcardImpl idOrWildcard = new IDOrWildcardImpl();
    return idOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrPathExpr createIDOrPathExpr()
  {
    IDOrPathExprImpl idOrPathExpr = new IDOrPathExprImpl();
    return idOrPathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr createPathExpr()
  {
    PathExprImpl pathExpr = new PathExprImpl();
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguagePackage getCupidLanguagePackage()
  {
    return (CupidLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CupidLanguagePackage getPackage()
  {
    return CupidLanguagePackage.eINSTANCE;
  }

} //CupidLanguageFactoryImpl
