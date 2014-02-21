/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.ConceptDefBody;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.Mapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl#isTop <em>Top</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDefImpl extends MinimalEObjectImpl.Container implements ConceptDef
{
  /**
   * The default value of the '{@link #isTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTop()
   * @generated
   * @ordered
   */
  protected static final boolean TOP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTop()
   * @generated
   * @ordered
   */
  protected boolean top = TOP_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Mapping mapping;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ConceptDefBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConceptDefImpl()
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
    return CupidLanguagePackage.Literals.CONCEPT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(boolean newTop)
  {
    boolean oldTop = top;
    top = newTop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__TOP, oldTop, top));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs)
  {
    Mapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Mapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__MAPPING, newMapping, newMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDefBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ConceptDefBody newBody, NotificationChain msgs)
  {
    ConceptDefBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ConceptDefBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF__BODY, newBody, newBody));
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
      case CupidLanguagePackage.CONCEPT_DEF__MAPPING:
        return basicSetMapping(null, msgs);
      case CupidLanguagePackage.CONCEPT_DEF__BODY:
        return basicSetBody(null, msgs);
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
      case CupidLanguagePackage.CONCEPT_DEF__TOP:
        return isTop();
      case CupidLanguagePackage.CONCEPT_DEF__NAME:
        return getName();
      case CupidLanguagePackage.CONCEPT_DEF__MAPPING:
        return getMapping();
      case CupidLanguagePackage.CONCEPT_DEF__BODY:
        return getBody();
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
      case CupidLanguagePackage.CONCEPT_DEF__TOP:
        setTop((Boolean)newValue);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__NAME:
        setName((String)newValue);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__BODY:
        setBody((ConceptDefBody)newValue);
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
      case CupidLanguagePackage.CONCEPT_DEF__TOP:
        setTop(TOP_EDEFAULT);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__MAPPING:
        setMapping((Mapping)null);
        return;
      case CupidLanguagePackage.CONCEPT_DEF__BODY:
        setBody((ConceptDefBody)null);
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
      case CupidLanguagePackage.CONCEPT_DEF__TOP:
        return top != TOP_EDEFAULT;
      case CupidLanguagePackage.CONCEPT_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CupidLanguagePackage.CONCEPT_DEF__MAPPING:
        return mapping != null;
      case CupidLanguagePackage.CONCEPT_DEF__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (top: ");
    result.append(top);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConceptDefImpl
