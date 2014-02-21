/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import java.util.Collection;

import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.Mappings;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.MappingsImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.MappingsImpl#getConcepts <em>Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingsImpl extends MinimalEObjectImpl.Container implements Mappings
{
  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> mappings;

  /**
   * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcepts()
   * @generated
   * @ordered
   */
  protected EList<ConceptDef> concepts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CupidLanguagePackage.Literals.MAPPINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, CupidLanguagePackage.MAPPINGS__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConceptDef> getConcepts()
  {
    if (concepts == null)
    {
      concepts = new EObjectContainmentEList<ConceptDef>(ConceptDef.class, this, CupidLanguagePackage.MAPPINGS__CONCEPTS);
    }
    return concepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.MAPPINGS__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
      case CupidLanguagePackage.MAPPINGS__CONCEPTS:
        return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.MAPPINGS__MAPPINGS:
        return getMappings();
      case CupidLanguagePackage.MAPPINGS__CONCEPTS:
        return getConcepts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.MAPPINGS__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case CupidLanguagePackage.MAPPINGS__CONCEPTS:
        getConcepts().clear();
        getConcepts().addAll((Collection<? extends ConceptDef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.MAPPINGS__MAPPINGS:
        getMappings().clear();
        return;
      case CupidLanguagePackage.MAPPINGS__CONCEPTS:
        getConcepts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.MAPPINGS__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case CupidLanguagePackage.MAPPINGS__CONCEPTS:
        return concepts != null && !concepts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappingsImpl
