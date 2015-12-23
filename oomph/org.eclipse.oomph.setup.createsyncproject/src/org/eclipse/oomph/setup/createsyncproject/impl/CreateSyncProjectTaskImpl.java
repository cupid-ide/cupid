/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.oomph.setup.createsyncproject.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectPackage;
import org.eclipse.oomph.setup.createsyncproject.CreateSyncProjectTask;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sync Project Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CreateSyncProjectTaskImpl extends SetupTaskImpl implements CreateSyncProjectTask
{
  private static final int PRIORITY = PRIORITY_DEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateSyncProjectTaskImpl()
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
    return CreateSyncProjectPackage.Literals.CREATE_SYNC_PROJECT_TASK;
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    // TODO Implement CreateSyncProjectTaskImpl.isNeeded()
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    // TODO Implement CreateSyncProjectTaskImpl.perform()
    context.log("Implement CreateSyncProjectTaskImpl.perform()");
    System.out.println("ROCKY TEST INSIDE CreateSyncProjectTaskImpl.perform();!!!");
  }

  @Override
  public void dispose()
  {
    // TODO Implement CreateSyncProjectTaskImpl.perform() or remove this override if not needed
  }

} // CreateSyncProjectTaskImpl
