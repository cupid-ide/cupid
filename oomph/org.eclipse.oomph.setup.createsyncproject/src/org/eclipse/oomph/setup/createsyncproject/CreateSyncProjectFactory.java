/**
 */
package org.eclipse.oomph.setup.createsyncproject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectPackage
 * @generated
 */
public interface CreateSyncProjectFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CreateSyncProjectFactory eINSTANCE = org.eclipse.oomph.setup.createsyncproject.impl.CreateSyncProjectFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  CreateSyncProjectTask createCreateSyncProjectTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CreateSyncProjectPackage getCreateSyncProjectPackage();

} // CreateSyncProjectFactory
