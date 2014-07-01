/**
 */
package org.earthsystemmodeling.psyche.impl;

import java.util.Collection;

import org.earthsystemmodeling.psyche.Annotation;
import org.earthsystemmodeling.psyche.Cardinality;
import org.earthsystemmodeling.psyche.ConceptDef;
import org.earthsystemmodeling.psyche.Mapping;
import org.earthsystemmodeling.psyche.PsychePackage;
import org.earthsystemmodeling.psyche.SubconceptOrAttribute;

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
 * An implementation of the model object '<em><b>Subconcept Or Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#isEssential <em>Essential</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#isMustBeNull <em>Must Be Null</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#isAttrib <em>Attrib</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getAttribMapping <em>Attrib Mapping</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.SubconceptOrAttributeImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubconceptOrAttributeImpl extends MinimalEObjectImpl.Container implements SubconceptOrAttribute
{
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
   * The default value of the '{@link #isMustBeNull() <em>Must Be Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMustBeNull()
   * @generated
   * @ordered
   */
  protected static final boolean MUST_BE_NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMustBeNull() <em>Must Be Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMustBeNull()
   * @generated
   * @ordered
   */
  protected boolean mustBeNull = MUST_BE_NULL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected ConceptDef def;

  /**
   * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected static final boolean REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected boolean reference = REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ConceptDef ref;

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
   * The cached value of the '{@link #getAttribMapping() <em>Attrib Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribMapping()
   * @generated
   * @ordered
   */
  protected Mapping attribMapping;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubconceptOrAttributeImpl()
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
    return PsychePackage.Literals.SUBCONCEPT_OR_ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY, oldCardinality, newCardinality);
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
        msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY, null, msgs);
      if (newCardinality != null)
        msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY, null, msgs);
      msgs = basicSetCardinality(newCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY, newCardinality, newCardinality));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL, oldEssential, essential));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMustBeNull()
  {
    return mustBeNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMustBeNull(boolean newMustBeNull)
  {
    boolean oldMustBeNull = mustBeNull;
    mustBeNull = newMustBeNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL, oldMustBeNull, mustBeNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(ConceptDef newDef, NotificationChain msgs)
  {
    ConceptDef oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(ConceptDef newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(boolean newReference)
  {
    boolean oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ConceptDef)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ConceptDef newRef)
  {
    ConceptDef oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF, oldRef, ref));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB, oldAttrib, attrib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getAttribMapping()
  {
    return attribMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribMapping(Mapping newAttribMapping, NotificationChain msgs)
  {
    Mapping oldAttribMapping = attribMapping;
    attribMapping = newAttribMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING, oldAttribMapping, newAttribMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribMapping(Mapping newAttribMapping)
  {
    if (newAttribMapping != attribMapping)
    {
      NotificationChain msgs = null;
      if (attribMapping != null)
        msgs = ((InternalEObject)attribMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING, null, msgs);
      if (newAttribMapping != null)
        msgs = ((InternalEObject)newAttribMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING, null, msgs);
      msgs = basicSetAttribMapping(newAttribMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING, newAttribMapping, newAttribMapping));
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION);
    }
    return annotation;
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
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY:
        return basicSetCardinality(null, msgs);
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF:
        return basicSetDef(null, msgs);
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING:
        return basicSetAttribMapping(null, msgs);
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__NAME:
        return getName();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY:
        return getCardinality();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL:
        return isEssential();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL:
        return isMustBeNull();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF:
        return getDef();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REFERENCE:
        return isReference();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB:
        return isAttrib();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING:
        return getAttribMapping();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION:
        return getAnnotation();
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
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY:
        setCardinality((Cardinality)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL:
        setEssential((Boolean)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL:
        setMustBeNull((Boolean)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF:
        setDef((ConceptDef)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REFERENCE:
        setReference((Boolean)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF:
        setRef((ConceptDef)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB:
        setAttrib((Boolean)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING:
        setAttribMapping((Mapping)newValue);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
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
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY:
        setCardinality((Cardinality)null);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL:
        setEssential(ESSENTIAL_EDEFAULT);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL:
        setMustBeNull(MUST_BE_NULL_EDEFAULT);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF:
        setDef((ConceptDef)null);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF:
        setRef((ConceptDef)null);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB:
        setAttrib(ATTRIB_EDEFAULT);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING:
        setAttribMapping((Mapping)null);
        return;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION:
        getAnnotation().clear();
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
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__CARDINALITY:
        return cardinality != null;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ESSENTIAL:
        return essential != ESSENTIAL_EDEFAULT;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__MUST_BE_NULL:
        return mustBeNull != MUST_BE_NULL_EDEFAULT;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__DEF:
        return def != null;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REFERENCE:
        return reference != REFERENCE_EDEFAULT;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__REF:
        return ref != null;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB:
        return attrib != ATTRIB_EDEFAULT;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ATTRIB_MAPPING:
        return attribMapping != null;
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", essential: ");
    result.append(essential);
    result.append(", mustBeNull: ");
    result.append(mustBeNull);
    result.append(", reference: ");
    result.append(reference);
    result.append(", attrib: ");
    result.append(attrib);
    result.append(')');
    return result.toString();
  }

} //SubconceptOrAttributeImpl
