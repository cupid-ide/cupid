package org.earthsystemmodeling.cupid.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestHelpers {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(TestHelpers.class);
	
	/**
	 * Copies a folder from workspace folder in the test project to the testing workspace.
	 * Replaces folder if it already exists in the workspace.
	 * @param projectName
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws InterruptedException 
	 */
	public static IProject createProjectFromFolder(String relativePath, String projectName) throws IOException, CoreException  {			
		URL sourceFolder = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(relativePath), null));	
		File srcDir = new File(sourceFolder.getFile());
				
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			File dstDir = p.getLocation().toFile();
			dstDir.delete();
			p.delete(true, true, new NullProgressMonitor());
		}
		
		p = root.getProject(projectName);
		p.create(new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		File dstDir = p.getLocation().toFile();
		
		//System.out.println("Copy from: " + srcDir + " =====> " + dstDir);
		FileUtils.copyDirectory(srcDir, dstDir);
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		//p.open(new NullProgressMonitor());
		return p;
	}
	
	public static IProject createEmptyProject(String projectName) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			p.delete(true, true, new NullProgressMonitor());
		}
		p.create(new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		return p;
	}
	
	public static IFile createBlankFile(IProject p, String filename) throws CoreException {
		IFile f = p.getFile(filename);
		f.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		return f;
	}
	
	public static IFile copyFileIntoProject(IProject p, String filename) throws IOException, CoreException {
		URL sourceFile = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(filename), null));	
		File srcFile = new File(sourceFile.getFile());
		File dstDir = p.getLocation().toFile();
		FileUtils.copyFileToDirectory(srcFile, dstDir);
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		return p.getFile(srcFile.getName());
	}
	
	public static boolean compileProject(IProject p, String makeTarget) throws IOException, InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("make", makeTarget);
		Map<String, String> env = pb.environment();
		//env.put("ESMFMKFILE", "/home/rocky/ESMF-INSTALLS/v7bs59/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk");
		if (System.getProperty("ESMFMKFILE") != null) {
			env.put("ESMFMKFILE", System.getProperty("ESMFMKFILE"));
		}
		pb.directory(p.getLocation().toFile());
		
		Process compileProc = pb.start();
		
		String stdout = IOUtils.toString(compileProc.getInputStream());
		String stderr = IOUtils.toString(compileProc.getErrorStream());
		compileProc.waitFor();
		
		if (compileProc.exitValue() != 0) {
			System.out.println("\n\n********\nFAILED TO COMPILE GENERATED COD\n*********\n");
			System.out.println("STDOUT:\n\n" + stdout);
			System.out.println("\nSTDERR:\n\n" + stderr);
			return false;
		}
		else {
			return true;
		}
		
	}
	
}
