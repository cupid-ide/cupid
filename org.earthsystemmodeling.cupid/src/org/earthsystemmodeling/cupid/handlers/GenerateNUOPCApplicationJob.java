package org.earthsystemmodeling.cupid.handlers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.Connector;
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
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.MultiPartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.UIJob;

public class GenerateNUOPCApplicationJob extends Job {

	private Application app;
	private IContainer container;
	private boolean openEditor;
	
	public GenerateNUOPCApplicationJob(String name, Application app, IContainer container, boolean openEditor) {
		super(name);
		this.app = app;
		this.container = container;
		this.openEditor = openEditor;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		final List<IFile> changedFiles = new ArrayList<IFile>();
		IFile file;

		//collect list of files that would be overwritten and confirm
		for (Component comp : app.getAllChildren()) {			
			if (comp instanceof Connector) {
				continue;  //for now, custom connectors now supported
			}
			file = container.getFile(new Path(comp.getName() + ".F90"));
			if (file.exists()) {
				changedFiles.add(file);
			}
		}
		file = container.getFile(new Path(app.getName() + ".F90"));
		if (file.exists()) {
			changedFiles.add(file);
		}
		file = container.getFile(new Path("Makefile"));
		if (file.exists()) {
			changedFiles.add(file);
		}
		
		
		if (changedFiles.size() > 0) {
			UIJob uijob = new UIJob("Confirm") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					
					String fileList = "";
					for (IFile f : changedFiles) {
						fileList += f.getName() + "\n";
					}
					
					boolean overwrite = MessageDialog.openQuestion(null, "Overwrite file?", 
							"The following files will be overwritten.  Is this okay?\n\n" + fileList);
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
				return Status.CANCEL_STATUS;
			}			
			
			if (!uijob.getResult().isOK()) {
				return Status.CANCEL_STATUS;
			}
		}
					
		changedFiles.clear();
		
		for (Component comp : app.getAllChildren()) {
			
			if (comp instanceof Connector) {
				continue;  //for now, custom connectors now supported
			}
			
			//file = container.getFile(new Path(comp.getName() + ".F90"));
			//if (!file.exists()) {
			try {
				file = createEmptyFile(container, comp.getName() + ".F90", false);
			} catch (CoreException e) {
				CupidActivator.log("Error generating code", e);
				return new Status(Status.ERROR, CupidActivator.PLUGIN_ID, "Error generating code", e);
			}
			//}
			
			if (file == null) continue;
			
			NUOPCComponent newComp = null;
			
			if (comp instanceof Driver) {
				newComp = NUOPCDriver.newDriver(file, (Driver) comp);
			}
			else if (comp instanceof Model) {
				newComp = NUOPCModel.newModel(file, (Model) comp);
			}
			else if (comp instanceof Mediator) {
				newComp = NUOPCMediator.newMediator(file, (Mediator) comp);
			}
			//else if (comp instanceof Connector) {
			//	continue;  ///custom connectors not yet supported
			//}
			
			//newComp.name = comp.getName();
			newComp.forward();
			newComp.applyChanges(monitor);
			
			//new ApplyCodeConceptChanges(newComp).run(monitor);
			changedFiles.add(file);
			
		}
		
		try {
			IFile fMainProgram = createEmptyFile(container, app.getName() + ".F90", false);
			if (fMainProgram != null) {
				MainGenerator.generateAndWrite(app, fMainProgram);
				changedFiles.add(fMainProgram);
			}
			
			IFile fMakefile = createEmptyFile(container, "Makefile", false);
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
	
	static IFile createEmptyFile(IContainer container, final String name, final boolean confirmInUI) throws CoreException {
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
		else if (confirmInUI) {
			
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
		else {
			// do not confirm, just overwrite
			file.setContents(new ByteArrayInputStream(new byte[0]), true, true, new NullProgressMonitor());
		}
		return file;
	}

}
