package org.earthsystemmodeling.cupid.cli;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import java.io.ByteArrayInputStream;
import java.io.File;

import org.apache.commons.io.FileUtils;

import org.earthsystemmodeling.cupid.nuopc.v7r.*;

public class CupidCLI implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello world from Cupid CLI!");
		Thread.sleep(250);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject proj = root.getProject("CupidCLI");
		proj.create(new NullProgressMonitor());
		proj.open(new NullProgressMonitor());
		
		IFile res = proj.getFile(new Path("Model.F90"));
		res.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		
		NUOPCModel model = NUOPCModel.newBasicModel(res);  
		model.name = "MyModel";
		model.forward();
		model.applyChanges(new NullProgressMonitor());
		
		File outFile = new File("Model.F90");
		FileUtils.copyInputStreamToFile(res.getContents(), outFile);
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("Goodbye world from Cupid CLI!");
	}

}
