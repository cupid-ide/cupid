/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.ActualParamByKeyword;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.IDOrPathExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Param By Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamByKeywordImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamByKeywordImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualParamByKeywordImpl extends ImplicitContextMappingImpl implements ActualParamByKeyword
{
  /**
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected IDOrPathExpr keyword;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected IDOrPathExpr value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActualParamByKeywordImpl()
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
    return CupidLanguagePackage.Literals.ACTUAL_PARAM_BY_KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrPathExpr getKeyword()
  {
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyword(IDOrPathExpr newKeyword, NotificationChain msgs)
  {
    IDOrPathExpr oldKeyword = keyword;
    keyword = newKeyword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD, oldKeyword, newKeyword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyword(IDOrPathExpr newKeyword)
  {
    if (newKeyword != keyword)
    {
      NotificationChain msgs = null;
      if (keyword != null)
        msgs = ((InternalEObject)keyword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD, null, msgs);
      if (newKeyword != null)
        msgs = ((InternalEObject)newKeyword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD, null, msgs);
      msgs = basicSetKeyword(newKeyword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD, newKeyword, newKeyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrPathExpr getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(IDOrPathExpr newValue, NotificationChain msgs)
  {
    IDOrPathExpr oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(IDOrPathExpr newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE, newValue, newValue));
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
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD:
        return basicSetKeyword(null, msgs);
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE:
        return basicSetValue(null, msgs);
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
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD:
        return getKeyword();
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD:
        setKeyword((IDOrPathExpr)newValue);
        return;
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE:
        setValue((IDOrPathExpr)newValue);
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
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD:
        setKeyword((IDOrPathExpr)null);
        return;
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE:
        setValue((IDOrPathExpr)null);
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
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__KEYWORD:
        return keyword != null;
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ActualParamByKeywordImpl
