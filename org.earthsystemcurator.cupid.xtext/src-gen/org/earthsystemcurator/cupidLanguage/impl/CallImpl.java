/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import java.util.Collection;

import org.earthsystemcurator.cupidLanguage.ActualParam;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.Expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ImplicitContextMappingImpl implements Call
{
  /**
   * The cached value of the '{@link #getSubroutineName() <em>Subroutine Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubroutineName()
   * @generated
   * @ordered
   */
  protected Expr subroutineName;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ActualParam> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
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
    return CupidLanguagePackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getSubroutineName()
  {
    return subroutineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubroutineName(Expr newSubroutineName, NotificationChain msgs)
  {
    Expr oldSubroutineName = subroutineName;
    subroutineName = newSubroutineName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CALL__SUBROUTINE_NAME, oldSubroutineName, newSubroutineName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubroutineName(Expr newSubroutineName)
  {
    if (newSubroutineName != subroutineName)
    {
      NotificationChain msgs = null;
      if (subroutineName != null)
        msgs = ((InternalEObject)subroutineName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CALL__SUBROUTINE_NAME, null, msgs);
      if (newSubroutineName != null)
        msgs = ((InternalEObject)newSubroutineName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CALL__SUBROUTINE_NAME, null, msgs);
      msgs = basicSetSubroutineName(newSubroutineName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CALL__SUBROUTINE_NAME, newSubroutineName, newSubroutineName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActualParam> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ActualParam>(ActualParam.class, this, CupidLanguagePackage.CALL__PARAMS);
    }
    return params;
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
      case CupidLanguagePackage.CALL__SUBROUTINE_NAME:
        return basicSetSubroutineName(null, msgs);
      case CupidLanguagePackage.CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case CupidLanguagePackage.CALL__SUBROUTINE_NAME:
        return getSubroutineName();
      case CupidLanguagePackage.CALL__PARAMS:
        return getParams();
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
      case CupidLanguagePackage.CALL__SUBROUTINE_NAME:
        setSubroutineName((Expr)newValue);
        return;
      case CupidLanguagePackage.CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ActualParam>)newValue);
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
      case CupidLanguagePackage.CALL__SUBROUTINE_NAME:
        setSubroutineName((Expr)null);
        return;
      case CupidLanguagePackage.CALL__PARAMS:
        getParams().clear();
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
      case CupidLanguagePackage.CALL__SUBROUTINE_NAME:
        return subroutineName != null;
      case CupidLanguagePackage.CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CallImpl
