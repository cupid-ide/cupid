/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import java.util.Collection;

import org.earthsystemcurator.cupidLanguage.Annotation;
import org.earthsystemcurator.cupidLanguage.Cardinality;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.ConceptDefBody;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.Subconcept;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subconcept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#isAttrib <em>Attrib</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#isEssential <em>Essential</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#isRef <em>Ref</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getConceptDef <em>Concept Def</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.SubconceptImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubconceptImpl extends MinimalEObjectImpl.Container implements Subconcept
{
  /**
   * The default value of the '{@link #isAttrib() <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAttrib()
   * @generated
   * @ordered
   */
  protected static final boolean ATTRIB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAttrib() <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAttrib()
   * @generated
   * @ordered
   */
  protected boolean attrib = ATTRIB_EDEFAULT;

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
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected Cardinality cardinality;

  /**
   * The default value of the '{@link #isEssential() <em>Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEssential()
   * @generated
   * @ordered
   */
  protected static final boolean ESSENTIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEssential() <em>Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEssential()
   * @generated
   * @ordered
   */
  protected boolean essential = ESSENTIAL_EDEFAULT;

  /**
   * The default value of the '{@link #isRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRef()
   * @generated
   * @ordered
   */
  protected static final boolean REF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRef()
   * @generated
   * @ordered
   */
  protected boolean ref = REF_EDEFAULT;

  /**
   * The cached value of the '{@link #getConceptDef() <em>Concept Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConceptDef()
   * @generated
   * @ordered
   */
  protected ConceptDef conceptDef;

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
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotation;

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
  protected SubconceptImpl()
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
    return CupidLanguagePackage.Literals.SUBCONCEPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAttrib()
  {
    return attrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrib(boolean newAttrib)
  {
    boolean oldAttrib = attrib;
    attrib = newAttrib;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__ATTRIB, oldAttrib, attrib));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__CARDINALITY, oldCardinality, newCardinality);
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
        msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__CARDINALITY, null, msgs);
      if (newCardinality != null)
        msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__CARDINALITY, null, msgs);
      msgs = basicSetCardinality(newCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__CARDINALITY, newCardinality, newCardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEssential()
  {
    return essential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEssential(boolean newEssential)
  {
    boolean oldEssential = essential;
    essential = newEssential;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__ESSENTIAL, oldEssential, essential));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(boolean newRef)
  {
    boolean oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef getConceptDef()
  {
    if (conceptDef != null && conceptDef.eIsProxy())
    {
      InternalEObject oldConceptDef = (InternalEObject)conceptDef;
      conceptDef = (ConceptDef)eResolveProxy(oldConceptDef);
      if (conceptDef != oldConceptDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF, oldConceptDef, conceptDef));
      }
    }
    return conceptDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef basicGetConceptDef()
  {
    return conceptDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConceptDef(ConceptDef newConceptDef)
  {
    ConceptDef oldConceptDef = conceptDef;
    conceptDef = newConceptDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF, oldConceptDef, conceptDef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__MAPPING, oldMapping, newMapping);
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
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__MAPPING, newMapping, newMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotation()
  {
    if (annotation == null)
    {
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, CupidLanguagePackage.SUBCONCEPT__ANNOTATION);
    }
    return annotation;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidLanguagePackage.SUBCONCEPT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.SUBCONCEPT__BODY, newBody, newBody));
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
      case CupidLanguagePackage.SUBCONCEPT__CARDINALITY:
        return basicSetCardinality(null, msgs);
      case CupidLanguagePackage.SUBCONCEPT__MAPPING:
        return basicSetMapping(null, msgs);
      case CupidLanguagePackage.SUBCONCEPT__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case CupidLanguagePackage.SUBCONCEPT__BODY:
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
      case CupidLanguagePackage.SUBCONCEPT__ATTRIB:
        return isAttrib();
      case CupidLanguagePackage.SUBCONCEPT__NAME:
        return getName();
      case CupidLanguagePackage.SUBCONCEPT__CARDINALITY:
        return getCardinality();
      case CupidLanguagePackage.SUBCONCEPT__ESSENTIAL:
        return isEssential();
      case CupidLanguagePackage.SUBCONCEPT__REF:
        return isRef();
      case CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF:
        if (resolve) return getConceptDef();
        return basicGetConceptDef();
      case CupidLanguagePackage.SUBCONCEPT__MAPPING:
        return getMapping();
      case CupidLanguagePackage.SUBCONCEPT__ANNOTATION:
        return getAnnotation();
      case CupidLanguagePackage.SUBCONCEPT__BODY:
        return getBody();
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
      case CupidLanguagePackage.SUBCONCEPT__ATTRIB:
        setAttrib((Boolean)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__NAME:
        setName((String)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__CARDINALITY:
        setCardinality((Cardinality)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__ESSENTIAL:
        setEssential((Boolean)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__REF:
        setRef((Boolean)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF:
        setConceptDef((ConceptDef)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case CupidLanguagePackage.SUBCONCEPT__BODY:
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
      case CupidLanguagePackage.SUBCONCEPT__ATTRIB:
        setAttrib(ATTRIB_EDEFAULT);
        return;
      case CupidLanguagePackage.SUBCONCEPT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CupidLanguagePackage.SUBCONCEPT__CARDINALITY:
        setCardinality((Cardinality)null);
        return;
      case CupidLanguagePackage.SUBCONCEPT__ESSENTIAL:
        setEssential(ESSENTIAL_EDEFAULT);
        return;
      case CupidLanguagePackage.SUBCONCEPT__REF:
        setRef(REF_EDEFAULT);
        return;
      case CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF:
        setConceptDef((ConceptDef)null);
        return;
      case CupidLanguagePackage.SUBCONCEPT__MAPPING:
        setMapping((Mapping)null);
        return;
      case CupidLanguagePackage.SUBCONCEPT__ANNOTATION:
        getAnnotation().clear();
        return;
      case CupidLanguagePackage.SUBCONCEPT__BODY:
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
      case CupidLanguagePackage.SUBCONCEPT__ATTRIB:
        return attrib != ATTRIB_EDEFAULT;
      case CupidLanguagePackage.SUBCONCEPT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CupidLanguagePackage.SUBCONCEPT__CARDINALITY:
        return cardinality != null;
      case CupidLanguagePackage.SUBCONCEPT__ESSENTIAL:
        return essential != ESSENTIAL_EDEFAULT;
      case CupidLanguagePackage.SUBCONCEPT__REF:
        return ref != REF_EDEFAULT;
      case CupidLanguagePackage.SUBCONCEPT__CONCEPT_DEF:
        return conceptDef != null;
      case CupidLanguagePackage.SUBCONCEPT__MAPPING:
        return mapping != null;
      case CupidLanguagePackage.SUBCONCEPT__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case CupidLanguagePackage.SUBCONCEPT__BODY:
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
    result.append(" (attrib: ");
    result.append(attrib);
    result.append(", name: ");
    result.append(name);
    result.append(", essential: ");
    result.append(essential);
    result.append(", ref: ");
    result.append(ref);
    result.append(')');
    return result.toString();
  }

} //SubconceptImpl
