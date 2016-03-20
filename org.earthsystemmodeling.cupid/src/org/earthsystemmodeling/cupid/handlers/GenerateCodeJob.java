package org.earthsystemmodeling.cupid.handlers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.Mediator;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.v7r.MainGenerator;
import org.earthsystemmodeling.cupid.nuopc.v7r.MakefileGenerator;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.MultiPartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.UIJob;

public class GenerateCodeJob extends Job {

	private Application app;
	private IContainer container;
	private boolean openEditor;
	
	public GenerateCodeJob(String name, Application app, IContainer container, boolean openEditor) {
		super(name);
		this.app = app;
		this.container = container;
		this.openEditor = openEditor;
	}
	
	/*
	protected Set<Component> collectChildren(Application app) {
		HashSet<Component> children = new HashSet<Component>();
		children.addAll(app.getChildren());
		for (Component c : app.getChildren()) {
			collectChildren(c, children);
		}
		return children;
	}
	
	protected void collectChildren(Component c, Set<Component> children) {
		if (c instanceof Driver) {
			Driver d = (Driver) c;
			children.addAll(d.getChildren());
			for (Component child : d.getChildren()) {
				collectChildren(child, children);
			}
		}
	}
	*/
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		final List<IFile> changedFiles = new ArrayList<IFile>();
		
		for (Component comp : app.getAllChildren()) {
			
			IFile file;
			try {
				file = createEmptyFile(container, comp.getName() + ".F90");
			} catch (CoreException e) {
				CupidActivator.log("Error generating code", e);
				return new Status(Status.ERROR, CupidActivator.PLUGIN_ID, "Error generating code", e);
			}
			
			if (file == null) continue;
			
			NUOPCComponent newComp = null;
			
			if (comp instanceof Driver) {
				newComp = NUOPCDriver.newDriver(file, (Driver) comp);
			}
			else if (comp instanceof Model) {
				newComp = NUOPCModel.newModel(file, (Model) comp);
			}
			else if (comp instanceof Mediator) {
				newComp = new NUOPCMediator(file);
			}
			
			newComp.name = comp.getName();
			newComp = newComp.forward();
			new ApplyCodeConceptChanges(newComp).run(monitor);
			changedFiles.add(file);
			
		}
		
		try {
			IFile fMainProgram = createEmptyFile(container, app.getName() + ".F90");
			if (fMainProgram != null) {
				MainGenerator.generateAndWrite(app, fMainProgram);
				changedFiles.add(fMainProgram);
			}
			
			IFile fMakefile = createEmptyFile(container, "Makefile");
			if (fMakefile != null) {
				MakefileGenerator.generateAndWrite(app, fMakefile);
				changedFiles.add(fMakefile);
			}
			
		} catch (CoreException e) {
			CupidActivator.log("Error generating code", e);
			return new Status(Status.ERROR, CupidActivator.PLUGIN_ID, "Error generating code", e);
		}
		
		
		if (openEditor && changedFiles.size() > 0) {
			UIJob uijob = new UIJob("Open editor on generated code") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					IWorkbenchPage page = window.getActivePage();
					try {
						IDE.openEditors(page, changedFiles.toArray(new IFile[0]));
					} catch (MultiPartInitException e) {
						CupidActivator.log("Error while opening editor(s) on generated file(s)", e);
					}
					return Status.OK_STATUS;
				}
			};
			uijob.schedule();
		}
		
		
		return Status.OK_STATUS;
		
	}
	
	static IFile createEmptyFile(IContainer container, final String name) throws CoreException {
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
			
			UIJob uijob = new UIJob("Confirm") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					boolean overwrite = MessageDialog.openQuestion(null, "Overwrite file?", "The file " + name + " already exists.  Okay to overwrite?");
					if (overwrite) {
						return Status.OK_STATUS;
					}
					else {
						return Status.CANCEL_STATUS;
					}
				}
			};
			
			uijob.schedule();
			try {
				uijob.join();
			} catch (InterruptedException e) {
				return null;
			}			
			
			if (uijob.getResult().isOK()) {
				file.setContents(new ByteArrayInputStream(new byte[0]), true, true, new NullProgressMonitor());
			}
			else {
				return null;
			}
			//throw new RuntimeException("Target file for code generation already exists: " + file.getFullPath());
		}
		return file;
	}

}
