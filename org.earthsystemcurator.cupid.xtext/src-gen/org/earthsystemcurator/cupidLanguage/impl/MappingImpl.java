/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.PathExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl#getAfterPathExpr <em>After Path Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected PathExpr context;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected ImplicitContextMapping mapping;

  /**
   * The cached value of the '{@link #getAfterPathExpr() <em>After Path Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfterPathExpr()
   * @generated
   * @ordered
   */
  protected PathExpr afterPathExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return CupidLanguagePackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(PathExpr newContext, NotificationChain msgs)
  {
    PathExpr oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__CONTEXT, oldContext, newContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(PathExpr newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__CONTEXT, newContext, newContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitContextMapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(ImplicitContextMapping newMapping, NotificationChain msgs)
  {
    ImplicitContextMapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(ImplicitContextMapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__MAPPING, newMapping, newMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getAfterPathExpr()
  {
    return afterPathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfterPathExpr(PathExpr newAfterPathExpr, NotificationChain msgs)
  {
    PathExpr oldAfterPathExpr = afterPathExpr;
    afterPathExpr = newAfterPathExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR, oldAfterPathExpr, newAfterPathExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfterPathExpr(PathExpr newAfterPathExpr)
  {
    if (newAfterPathExpr != afterPathExpr)
    {
      NotificationChain msgs = null;
      if (afterPathExpr != null)
        msgs = ((InternalEObject)afterPathExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR, null, msgs);
      if (newAfterPathExpr != null)
        msgs = ((InternalEObject)newAfterPathExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR, null, msgs);
      msgs = basicSetAfterPathExpr(newAfterPathExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR, newAfterPathExpr, newAfterPathExpr));
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
      case CupidLanguagePackage.MAPPING__CONTEXT:
        return basicSetContext(null, msgs);
      case CupidLanguagePackage.MAPPING__MAPPING:
        return basicSetMapping(null, msgs);
      case CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR:
        return basicSetAfterPathExpr(null, msgs);
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
      case CupidLanguagePackage.MAPPING__CONTEXT:
        return getContext();
      case CupidLanguagePackage.MAPPING__MAPPING:
        return getMapping();
      case CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR:
        return getAfterPathExpr();
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
      case CupidLanguagePackage.MAPPING__CONTEXT:
        setContext((PathExpr)newValue);
        return;
      case CupidLanguagePackage.MAPPING__MAPPING:
        setMapping((ImplicitContextMapping)newValue);
        return;
      case CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR:
        setAfterPathExpr((PathExpr)newValue);
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
      case CupidLanguagePackage.MAPPING__CONTEXT:
        setContext((PathExpr)null);
        return;
      case CupidLanguagePackage.MAPPING__MAPPING:
        setMapping((ImplicitContextMapping)null);
        return;
      case CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR:
        setAfterPathExpr((PathExpr)null);
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
      case CupidLanguagePackage.MAPPING__CONTEXT:
        return context != null;
      case CupidLanguagePackage.MAPPING__MAPPING:
        return mapping != null;
      case CupidLanguagePackage.MAPPING__AFTER_PATH_EXPR:
        return afterPathExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
