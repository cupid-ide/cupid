/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.Cardinality;
import org.earthsystemcurator.cupidLanguage.ConceptDefOrRef;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Def Or Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefOrRefImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefOrRefImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.ConceptDefOrRefImpl#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDefOrRefImpl extends MinimalEObjectImpl.Container implements ConceptDefOrRef
{
  /**
   * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected String localName = LOCAL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected Cardinality cardinality;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConceptDefOrRefImpl()
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
    return CupidLanguagePackage.Literals.CONCEPT_DEF_OR_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalName()
  {
    return localName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalName(String newLocalName)
  {
    String oldLocalName = localName;
    localName = newLocalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF_OR_REF__LOCAL_NAME, oldLocalName, localName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs)
  {
    Cardinality oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY, oldCardinality, newCardinality);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinality(Cardinality newCardinality)
  {
    if (newCardinality != cardinality)
    {
      NotificationChain msgs = null;
      if (cardinality != null)
        msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY, null, msgs);
      if (newCardinality != null)
        msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY, null, msgs);
      msgs = basicSetCardinality(newCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY, newCardinality, newCardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CONCEPT_DEF_OR_REF__REQUIRED, oldRequired, required));
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
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY:
        return basicSetCardinality(null, msgs);
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
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__LOCAL_NAME:
        return getLocalName();
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY:
        return getCardinality();
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__REQUIRED:
        return isRequired();
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
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__LOCAL_NAME:
        setLocalName((String)newValue);
        return;
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY:
        setCardinality((Cardinality)newValue);
        return;
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__REQUIRED:
        setRequired((Boolean)newValue);
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
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__LOCAL_NAME:
        setLocalName(LOCAL_NAME_EDEFAULT);
        return;
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY:
        setCardinality((Cardinality)null);
        return;
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
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
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__LOCAL_NAME:
        return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__CARDINALITY:
        return cardinality != null;
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF__REQUIRED:
        return required != REQUIRED_EDEFAULT;
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
    result.append(" (localName: ");
    result.append(localName);
    result.append(", required: ");
    result.append(required);
    result.append(')');
    return result.toString();
  }

} //ConceptDefOrRefImpl
