/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import java.util.Collection;

import org.earthsystemcurator.cupidLanguage.ConceptDefBody;
import org.earthsystemcurator.cupidLanguage.ConceptDefOrRef;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Def Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefBodyImpl#getSubconcept <em>Subconcept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDefBodyImpl extends MinimalEObjectImpl.Container implements ConceptDefBody
{
  /**
   * The cached value of the '{@link #getSubconcept() <em>Subconcept</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubconcept()
   * @generated
   * @ordered
   */
  protected EList<ConceptDefOrRef> subconcept;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConceptDefBodyImpl()
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
    return CupidLanguagePackage.Literals.CONCEPT_DEF_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConceptDefOrRef> getSubconcept()
  {
    if (subconcept == null)
    {
      subconcept = new EObjectContainmentEList<ConceptDefOrRef>(ConceptDefOrRef.class, this, CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT);
    }
    return subconcept;
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
      case CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT:
        return ((InternalEList<?>)getSubconcept()).basicRemove(otherEnd, msgs);
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
      case CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT:
        return getSubconcept();
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
      case CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT:
        getSubconcept().clear();
        getSubconcept().addAll((Collection<? extends ConceptDefOrRef>)newValue);
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
      case CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT:
        getSubconcept().clear();
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
      case CupidLanguagePackage.CONCEPT_DEF_BODY__SUBCONCEPT:
        return subconcept != null && !subconcept.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConceptDefBodyImpl
