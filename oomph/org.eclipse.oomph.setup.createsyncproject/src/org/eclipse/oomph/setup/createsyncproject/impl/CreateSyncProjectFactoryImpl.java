/**
 */
package org.eclipse.oomph.setup.createsyncproject.impl;

import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectFactory;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectPackage;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateSyncProjectFactoryImpl extends EFactoryImpl implements CreateSyncProjectFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CreateSyncProjectFactory init()
  {
    try
    {
      CreateSyncProjectFactory theCreateSyncProjectFactory = (CreateSyncProjectFactory)EPackage.Registry.INSTANCE.getEFactory(CreateSyncProjectPackage.eNS_URI);
      if (theCreateSyncProjectFactory != null)
      {
        return theCreateSyncProjectFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CreateSyncProjectFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSyncProjectFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK:
      return createCreateSyncProjectTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSyncProjectTask createCreateSyncProjectTask()
  {
    CreateSyncProjectTaskImpl createSyncProjectTask = new CreateSyncProjectTaskImpl();
    return createSyncProjectTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSyncProjectPackage getCreateSyncProjectPackage()
  {
    return (CreateSyncProjectPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CreateSyncProjectPackage getPackage()
  {
    return CreateSyncProjectPackage.eINSTANCE;
  }

} // CreateSyncProjectFactoryImpl
