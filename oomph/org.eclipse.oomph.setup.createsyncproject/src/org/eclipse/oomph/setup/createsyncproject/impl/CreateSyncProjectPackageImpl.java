/**
 */
package org.eclipse.oomph.setup.createsyncproject.impl;

import org.eclipse.oomph.setup.SetupPackage;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectFactory;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectPackage;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateSyncProjectPackageImpl extends EPackageImpl implements CreateSyncProjectPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createSyncProjectTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CreateSyncProjectPackageImpl()
  {
    super(eNS_URI, CreateSyncProjectFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link CreateSyncProjectPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CreateSyncProjectPackage init()
  {
    if (isInited)
    {
      return (CreateSyncProjectPackage)EPackage.Registry.INSTANCE.getEPackage(CreateSyncProjectPackage.eNS_URI);
    }

    // Obtain or create and register package
    CreateSyncProjectPackageImpl theCreateSyncProjectPackage = (CreateSyncProjectPackageImpl)(EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof CreateSyncProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CreateSyncProjectPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCreateSyncProjectPackage.createPackageContents();

    // Initialize created meta-data
    theCreateSyncProjectPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCreateSyncProjectPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CreateSyncProjectPackage.eNS_URI, theCreateSyncProjectPackage);
    return theCreateSyncProjectPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateSyncProjectTask()
  {
    return createSyncProjectTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSyncProjectFactory getCreateSyncProjectFactory()
  {
    return (CreateSyncProjectFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    createSyncProjectTaskEClass = createEClass(CREATE_SYNC_PROJECT_TASK);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    createSyncProjectTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(createSyncProjectTaskEClass, CreateSyncProjectTask.class, "CreateSyncProjectTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(
        "file:/home/rocky/eclipse/oomph-master/git/org.eclipse.oomph/plugins/org.eclipse.oomph.setup.createsyncproject/model/CreateSyncProject.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/base/LabelProvider
    createLabelProviderAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source,
        new String[] { "schemaLocation.http", "http://git.eclipse.org/c/oomph/org.eclipse.oomph.createsyncproject/plain/setups/models/CreateSyncProject.ecore",
            "schemaLocation",
            "file:/home/rocky/eclipse/oomph-master/git/org.eclipse.oomph/plugins/org.eclipse.oomph.setup.createsyncproject/model/CreateSyncProject.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(this, source, new String[] { "variableName", "setup.createsyncproject.p2", "repository", "${oomph.update.url}", "installableUnits",
        "org.eclipse.oomph.setup.createsyncproject.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/base/LabelProvider</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createLabelProviderAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/base/LabelProvider";
    addAnnotation(this, source, new String[] { "imageBaseURI",
        "http://git.eclipse.org/c/oomph/org.eclipse.oomph.git/plain/plugins/org.eclipse.oomph.setup.createsyncproject.edit/icons/full/obj16" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(createSyncProjectTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

} // CreateSyncProjectPackageImpl
