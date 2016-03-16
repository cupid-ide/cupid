package org.earthsystemmodeling.cupid.test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.ClosedChannelException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.photran.internal.core.FProjectNature;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestHelpers {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(TestHelpers.class);
	
	private static IProgressMonitor NPM = new NullProgressMonitor();
	
	/**
	 * Copies a folder from workspace folder in the test project to the testing workspace.
	 * Replaces folder if it already exists in the workspace.
	 * @param projectName
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws InterruptedException 
	 */
	public static synchronized IProject createProjectFromFolder(String relativePath, String projectName) throws IOException, CoreException  {			
		URL sourceFolder = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(relativePath), null));	
		File srcDir = new File(sourceFolder.getFile());
				
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			File dstDir = p.getLocation().toFile();
			dstDir.delete();
			p.delete(true, true, NPM);
		}
		
		p = root.getProject(projectName);
		p.create(NPM);
		p.open(NPM);
		File dstDir = p.getLocation().toFile();
		
		//System.out.println("Copy from: " + srcDir + " =====> " + dstDir);
		for (int i=0; i<5; i++) {
			try {
				FileUtils.copyDirectory(srcDir, dstDir);
			}
			catch (ClosedChannelException cce) {
				continue;
			}
			break;
		}
		p.refreshLocal(IResource.DEPTH_INFINITE, NPM);
		//p.open(NPM);
		return p;
	}
	
	@SuppressWarnings("restriction")
	public static synchronized IProject createFortranProjectFromFolder(String relativePath, String projectName) throws IOException, CoreException {
		IProject p = createProjectFromFolder(relativePath, projectName);
		FProjectNature.addFNature(p, NPM);
		return p;
	}
	
	public static IProject createEmptyProject(String projectName) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			p.delete(true, true, NPM);
		}
		p.create(NPM);
		p.open(NPM);
		return p;
	}
	
	@SuppressWarnings("restriction")
	public static IProject createEmptyFortranProject(String projectName) throws CoreException {
		IProject p = createEmptyProject(projectName);
		FProjectNature.addFNature(p, NPM);
		return p;
	}
	
	public static IFile createBlankFile(IProject p, String filename) throws CoreException {
		IFile f = p.getFile(filename);
		f.create(new ByteArrayInputStream(new byte[0]), true, NPM);
		return f;
	}
	
	public static synchronized IFile copyFileIntoProject(IProject p, String filename) throws IOException, CoreException {
		URL sourceFile = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(filename), null));	
		File srcFile = new File(sourceFile.getFile());
		File dstDir = p.getLocation().toFile();
		for (int i=0; i<5; i++) {
			try {
				FileUtils.copyFileToDirectory(srcFile, dstDir);
			}
			catch (ClosedChannelException cce) {
				continue;
			}
			break;
		}
		p.refreshLocal(IResource.DEPTH_INFINITE, NPM);
		return p.getFile(srcFile.getName());
	}
	
	public static boolean compileProject(IProject p, String ESMFMKFILE, String... makeTarget) throws IOException, InterruptedException {
		
		for (String target : makeTarget) {
			ProcessBuilder pb = new ProcessBuilder("make", target);
			Map<String, String> env = pb.environment();
			env.put("ESMFMKFILE", ESMFMKFILE);
			pb.directory(p.getLocation().toFile());
			
			Process compileProc = pb.start();
			
			String stdout = IOUtils.toString(compileProc.getInputStream());
			String stderr = IOUtils.toString(compileProc.getErrorStream());
			compileProc.waitFor();
			
			if (compileProc.exitValue() != 0) {
				System.out.println("\n\n*****************************************");
				System.out.println("FAILED TO COMPILE GENERATED CODE");
				System.out.println("Working directory: " + p.getLocation().toFile().getPath());
				System.out.println("******************************************");
				System.out.println("\nSTDOUT:\n****************************\n\n" + stdout);
				System.out.println("\nSTDERR:\n****************************\n\n" + stderr);
				return false;
			}
			
		}
		return true;
			
	}
	
	public static String getMakefileFragmentLoc(String esmfTag) {
		if (System.getenv("ESMF_INSTALL_ROOT") == null) {
			throw new RuntimeException("Environment variables ESMF_INSTALL_ROOT must be defined.");
		}
		else {
			return System.getenv("ESMF_INSTALL_ROOT") + "/" + esmfTag + "/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk";
		}
	}
	
}
