package org.earthsystemmodeling.cupid.cli;

import java.io.File;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.photran.internal.core.FProjectNature;
import org.eclipse.photran.internal.core.properties.SearchPathProperties;

@SuppressWarnings("restriction")
public class CupidCLI implements IApplication {

	//private Application app;
	//private static NUOPCFactory factory;
	//private Map<String, Component> compMap;
	
	private static ConsoleProgressMonitor monitor = new ConsoleProgressMonitor(System.out);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		String[] args = (String[]) context.getArguments().get("application.args");
		
		String rootDir = null;
		String configFile = null;
		String cmd = null;
		
		/* parse arguments */
		for (String arg : args) {
			String[] keyVal = arg.split("=", 2);
			if (keyVal.length == 2) {
				String key = keyVal[0].trim();
				if (key.equalsIgnoreCase("rootDir")) {
					rootDir = keyVal[1].trim();
				}
				else if (key.equalsIgnoreCase("config")) {
					configFile = keyVal[1].trim();
				}
				else if (key.equalsIgnoreCase("cmd")) {
					cmd = keyVal[1].trim();
				}
				else {
					console("Ignoring unrecognized parameter: " + key);
				}
			}
			else {
				console("Ignoring unrecognized argument: " + arg);
			}
		}

		if (cmd == null) {
			console("Missing required parameter: cmd");
		}
		
		if (cmd.equalsIgnoreCase("generate")) {
			
			if (configFile == null) {
				console("Missing required parameter: configFile");
				return IApplication.EXIT_OK;
			}
			
			File configF = new File(rootDir, configFile);
			console("Using configFile = " + configF.getAbsolutePath());
			if (!configF.exists()) {
				console("configFile does not exist: " + configF.getAbsolutePath());
				return IApplication.EXIT_OK;
			}
			
			IFolder root = linkToRootDirectory(configF.getParent());
			if (root == null) {
				console("Error linking to root directory: " + configF.getParent());
				return IApplication.EXIT_OK;
			}
			
			ConfigParser parser = new ConfigParser(root);
			parser.generate(configF);
			
		}
		else {
			console("Unrecognized command: " + cmd);
			return IApplication.EXIT_OK;
		}
		
		/*
		if (rootDir == null) {
			console("Missing required parameter: rootDir");
			return IApplication.EXIT_OK;
		}
								
		console("Using rootDir = " + rootDir);
		File f = new File(rootDir);
		if (!f.exists()) {
			console("rootDir does not exist: " + rootDir);
			return IApplication.EXIT_OK;
		}
		if (!f.isDirectory()) {
			System.out.println("rootDir is not a directory: " + rootDir);
			return IApplication.EXIT_OK;
		}
		*/	
		
		return IApplication.EXIT_OK;
		
	}
	
	private IFolder linkToRootDirectory(String rootDir) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject proj = root.getProject("CupidCLI");
		if (!proj.exists()) {
			proj.create(monitor);
			proj.open(monitor);
			FProjectNature.addFNature(proj, monitor);
			new SearchPathProperties().setProperty(proj, SearchPathProperties.ENABLE_VPG_PROPERTY_NAME, "true");
		}
		else {
			proj.open(monitor);
		}
						
		IFolder linkToRoot = proj.getFolder("linkToRoot");
		IPath locationToLink = new Path(rootDir);
		IStatus stat = workspace.validateLinkLocation(linkToRoot, locationToLink);
		if (stat.getSeverity() == IStatus.OK || stat.getSeverity() == IStatus.WARNING) {
			linkToRoot.createLink(locationToLink, IResource.REPLACE, monitor);
		} else {
		    console("Error creating link to rootDir: " + stat.getMessage());
		    return null;
		}
				
		proj.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return linkToRoot;
	}
	

	@Override
	public void stop() {
		console("Force quit Cupid");
	}

	
	@SuppressWarnings("unused")
	private void findComps() throws OperationCanceledException, InterruptedException {
		
		NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
		
		Job ensure = manager.ensureDBIsUpToDate();
		ensure.join(60*1000, monitor);
		if (!ensure.getResult().isOK()) {
			console("Did not finish after one minute.");
		}
		
		console("Found components:");
		Set<Entry<IFile, CodeConcept<?, ?>>> allComps = manager.listAllComponents();
		allComps.forEach((e) -> {
			console(e.getKey().getName() + " : " + e.getValue().name());
		});	
		
	}
	
	public static void console(String toWrite) {
		System.out.println(toWrite);
	}
	
}
