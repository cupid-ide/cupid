/**
 */
package org.earthsystemmodeling.psyche.impl;

import java.util.Collection;

import org.earthsystemmodeling.psyche.Annotation;
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
 * An implementation of the model object '<em><b>Concept Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#isNamed <em>Named</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ConceptDefImpl#isTop <em>Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDefImpl extends MinimalEObjectImpl.Container implements ConceptDef
{
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
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected EList<SubconceptOrAttribute> child;

  /**
   * The default value of the '{@link #isNamed() <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNamed()
   * @generated
   * @ordered
   */
  protected static final boolean NAMED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNamed() <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNamed()
   * @generated
   * @ordered
   */
  protected boolean named = NAMED_EDEFAULT;

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
    return PsychePackage.Literals.CONCEPT_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.CONCEPT_DEF__MAPPING, oldMapping, newMapping);
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
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.CONCEPT_DEF__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.CONCEPT_DEF__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.CONCEPT_DEF__MAPPING, newMapping, newMapping));
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, PsychePackage.CONCEPT_DEF__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubconceptOrAttribute> getChild()
  {
    if (child == null)
    {
      child = new EObjectContainmentEList<SubconceptOrAttribute>(SubconceptOrAttribute.class, this, PsychePackage.CONCEPT_DEF__CHILD);
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNamed()
  {
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamed(boolean newNamed)
  {
    boolean oldNamed = named;
    named = newNamed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.CONCEPT_DEF__NAMED, oldNamed, named));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.CONCEPT_DEF__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.CONCEPT_DEF__TOP, oldTop, top));
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
      case PsychePackage.CONCEPT_DEF__MAPPING:
        return basicSetMapping(null, msgs);
      case PsychePackage.CONCEPT_DEF__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case PsychePackage.CONCEPT_DEF__CHILD:
        return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
      case PsychePackage.CONCEPT_DEF__MAPPING:
        return getMapping();
      case PsychePackage.CONCEPT_DEF__ANNOTATION:
        return getAnnotation();
      case PsychePackage.CONCEPT_DEF__CHILD:
        return getChild();
      case PsychePackage.CONCEPT_DEF__NAMED:
        return isNamed();
      case PsychePackage.CONCEPT_DEF__NAME:
        return getName();
      case PsychePackage.CONCEPT_DEF__TOP:
        return isTop();
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
      case PsychePackage.CONCEPT_DEF__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case PsychePackage.CONCEPT_DEF__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case PsychePackage.CONCEPT_DEF__CHILD:
        getChild().clear();
        getChild().addAll((Collection<? extends SubconceptOrAttribute>)newValue);
        return;
      case PsychePackage.CONCEPT_DEF__NAMED:
        setNamed((Boolean)newValue);
        return;
      case PsychePackage.CONCEPT_DEF__NAME:
        setName((String)newValue);
        return;
      case PsychePackage.CONCEPT_DEF__TOP:
        setTop((Boolean)newValue);
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
      case PsychePackage.CONCEPT_DEF__MAPPING:
        setMapping((Mapping)null);
        return;
      case PsychePackage.CONCEPT_DEF__ANNOTATION:
        getAnnotation().clear();
        return;
      case PsychePackage.CONCEPT_DEF__CHILD:
        getChild().clear();
        return;
      case PsychePackage.CONCEPT_DEF__NAMED:
        setNamed(NAMED_EDEFAULT);
        return;
      case PsychePackage.CONCEPT_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PsychePackage.CONCEPT_DEF__TOP:
        setTop(TOP_EDEFAULT);
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
      case PsychePackage.CONCEPT_DEF__MAPPING:
        return mapping != null;
      case PsychePackage.CONCEPT_DEF__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case PsychePackage.CONCEPT_DEF__CHILD:
        return child != null && !child.isEmpty();
      case PsychePackage.CONCEPT_DEF__NAMED:
        return named != NAMED_EDEFAULT;
      case PsychePackage.CONCEPT_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PsychePackage.CONCEPT_DEF__TOP:
        return top != TOP_EDEFAULT;
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
    result.append(" (named: ");
    result.append(named);
    result.append(", name: ");
    result.append(name);
    result.append(", top: ");
    result.append(top);
    result.append(')');
    return result.toString();
  }

} //ConceptDefImpl
