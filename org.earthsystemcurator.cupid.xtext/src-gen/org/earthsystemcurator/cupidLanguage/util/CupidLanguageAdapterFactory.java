/**
 */
package org.earthsystemcurator.cupidLanguage.util;

import org.earthsystemcurator.cupidLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage
 * @generated
 */
public class CupidLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CupidLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CupidLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CupidLanguageSwitch<Adapter> modelSwitch =
    new CupidLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseLanguage(Language object)
      {
        return createLanguageAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseConceptDef(ConceptDef object)
      {
        return createConceptDefAdapter();
      }
      @Override
      public Adapter caseSubconceptOrAttribute(SubconceptOrAttribute object)
      {
        return createSubconceptOrAttributeAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseImplicitContextMapping(ImplicitContextMapping object)
      {
        return createImplicitContextMappingAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleName(ModuleName object)
      {
        return createModuleNameAdapter();
      }
      @Override
      public Adapter caseUsesModule(UsesModule object)
      {
        return createUsesModuleAdapter();
      }
      @Override
      public Adapter caseUsesEntity(UsesEntity object)
      {
        return createUsesEntityAdapter();
      }
      @Override
      public Adapter caseSubroutine(Subroutine object)
      {
        return createSubroutineAdapter();
      }
      @Override
      public Adapter caseFormalParam(FormalParam object)
      {
        return createFormalParamAdapter();
      }
      @Override
      public Adapter caseIntent(Intent object)
      {
        return createIntentAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseSubroutineName(SubroutineName object)
      {
        return createSubroutineNameAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseActualParam(ActualParam object)
      {
        return createActualParamAdapter();
      }
      @Override
      public Adapter caseActualParamByKeyword(ActualParamByKeyword object)
      {
        return createActualParamByKeywordAdapter();
      }
      @Override
      public Adapter caseIDOrWildcard(IDOrWildcard object)
      {
        return createIDOrWildcardAdapter();
      }
      @Override
      public Adapter caseIDOrPathExpr(IDOrPathExpr object)
      {
        return createIDOrPathExprAdapter();
      }
      @Override
      public Adapter casePathExpr(PathExpr object)
      {
        return createPathExprAdapter();
      }
      @Override
      public Adapter caseAxis(Axis object)
      {
        return createAxisAdapter();
      }
      @Override
      public Adapter casePathExprTerm(PathExprTerm object)
      {
        return createPathExprTermAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Language
   * @generated
   */
  public Adapter createLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.ConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.ConceptDef
   * @generated
   */
  public Adapter createConceptDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute <em>Subconcept Or Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute
   * @generated
   */
  public Adapter createSubconceptOrAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.ImplicitContextMapping <em>Implicit Context Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.ImplicitContextMapping
   * @generated
   */
  public Adapter createImplicitContextMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.ModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.ModuleName
   * @generated
   */
  public Adapter createModuleNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.UsesModule <em>Uses Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.UsesModule
   * @generated
   */
  public Adapter createUsesModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.UsesEntity <em>Uses Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.UsesEntity
   * @generated
   */
  public Adapter createUsesEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Subroutine <em>Subroutine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Subroutine
   * @generated
   */
  public Adapter createSubroutineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.FormalParam <em>Formal Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.FormalParam
   * @generated
   */
  public Adapter createFormalParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Intent
   * @generated
   */
  public Adapter createIntentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.SubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.SubroutineName
   * @generated
   */
  public Adapter createSubroutineNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.ActualParam <em>Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam
   * @generated
   */
  public Adapter createActualParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.ActualParamByKeyword <em>Actual Param By Keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.ActualParamByKeyword
   * @generated
   */
  public Adapter createActualParamByKeywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard <em>ID Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard
   * @generated
   */
  public Adapter createIDOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.IDOrPathExpr <em>ID Or Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.IDOrPathExpr
   * @generated
   */
  public Adapter createIDOrPathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.PathExpr
   * @generated
   */
  public Adapter createPathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.Axis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.Axis
   * @generated
   */
  public Adapter createAxisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupidLanguage.PathExprTerm <em>Path Expr Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemcurator.cupidLanguage.PathExprTerm
   * @generated
   */
  public Adapter createPathExprTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CupidLanguageAdapterFactory
