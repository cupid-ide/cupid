package org.earthsystemmodeling.cupid.handlers;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class GenerateCodeJob extends Job {

	NUOPCApplication app;
	IProject project;
	
	public GenerateCodeJob(String name, NUOPCApplication app, IProject project) {
		super(name);
		this.app = app;
		this.project = project;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		for (NUOPCComponent comp : app.getChildren()) {
			if (comp instanceof NUOPCDriver) {
				
				IFile file = project.getFile(comp.getName() + ".F90");
				try {
					file.create(new ByteArrayInputStream(new byte[0]), true, monitor);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver d = 
						new org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver(file);
				d.driverName = comp.getName();
				d = d.fward();
				
				ApplyCodeConceptChanges apply = new ApplyCodeConceptChanges(d);
				try {
					apply.run(monitor);
				} catch (InvocationTargetException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		}
		
		
		return Status.OK_STATUS;
		
	}

}
