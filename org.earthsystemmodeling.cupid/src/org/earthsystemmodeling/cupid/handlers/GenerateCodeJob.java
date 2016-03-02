package org.earthsystemmodeling.cupid.handlers;

import java.io.ByteArrayInputStream;

import org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCModel;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class GenerateCodeJob extends Job {

	NUOPCApplication app;
	IContainer container;
	
	public GenerateCodeJob(String name, NUOPCApplication app, IContainer container) {
		super(name);
		this.app = app;
		this.container = container;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		for (NUOPCComponent comp : app.getChildren()) {
			
			IFile file;
			try {
				file = createEmptyFile(container, comp.getName() + ".F90");
			} catch (CoreException e) {
				throw new RuntimeException("Error generating code", e);
			}
			
			org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent newComp = null;
			
			if (comp instanceof NUOPCDriver) {
				newComp = new org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver(file);
			}
			else if (comp instanceof NUOPCModel) {
				newComp = new org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel(file);
			}
			else if (comp instanceof NUOPCMediator) {
				newComp = new org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator(file);
			}
			
			newComp.name = comp.getName();
			newComp = newComp.fward();
			new ApplyCodeConceptChanges(newComp).run(monitor);
		}
		
		
		return Status.OK_STATUS;
		
	}
	
	static IFile createEmptyFile(IContainer container, String name) throws CoreException {
		IFile file = null;
		if (container instanceof IProject) {
			file = ((IProject) container).getFile(name);
		}
		else if (container instanceof IFolder) {
			file = ((IFolder) container).getFile(name);
		}
		else {
			throw new RuntimeException("Generated code must be in a project root or a subfolder.");
		}
		if (!file.exists()) {
			file.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		}
		else {
			throw new RuntimeException("Target file for code generation already exists: " + file.getFullPath());
		}
		return file;
	}

}
