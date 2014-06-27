package org.earthsystemcurator.cupid.nuopc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.earthsystemcurator.FSM;
import org.earthsystemcurator.cupid.nuopc.fsml.core.ReverseEngineer2;
import org.earthsystemcurator.cupidLanguage.Language;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class CupidTest {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidTest.class);

	static PhotranVPG vpg;
	
	@BeforeClass
	public static void setUp() throws CoreException {
		vpg = PhotranVPG.getInstance();
		assertNotNull(vpg);
	}
	
	/**
	 * Copies a folder from workspace folder in the test project to the testing workspace.
	 * Replaces folder if it already exists in the workspace.
	 * @param projectName
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private IProject copyProjectToWorkspace(String projectName) throws IOException, CoreException  {			
		URL sourceFolder = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path("workspace/" + projectName), null));	
		File srcDir = new File(sourceFolder.getFile());
				
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			p.delete(true, true, new NullProgressMonitor());
		}
		p.create(new NullProgressMonitor());
		File dstDir = p.getLocation().toFile();
		
		//System.out.println("Copy from: " + srcDir + " =====> " + dstDir);
		FileUtils.copyDirectory(srcDir, dstDir);
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		return p;
	}
	
	/*
	private IProject refreshProject(String name) throws CoreException {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		if (!p.exists()) {
			p.create(new NullProgressMonitor());
		}
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		return p;
	}
	*/
	
	private Language registerLanguage(String langFile) throws IOException {
		
		URL langFileURL = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(langFile), null));		
		URI langFileURI = URI.createFileURI(langFileURL.getFile());
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource langResource = rs.getResource(langFileURI, true);
		Language lang = (Language) langResource.getContents().get(0);
		
		URI ecoreFileURI = langFileURI.trimFileExtension().appendFileExtension("ecore");
		Resource ecoreResource = rs.getResource(ecoreFileURI, true);
		EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
		
		EPackage.Registry.INSTANCE.put(lang.getUri(), ecorePackage);
		
		return lang;
		
	}
	
	private EObject reverseEngineer(String projectPath, String languagePath) throws CoreException, IOException {
		IProject p = copyProjectToWorkspace(projectPath);
		assertNotNull(p);
		Language l = registerLanguage(languagePath);
		assertNotNull(l);
		
		vpg.clearDatabase();
		
		final FSM<?> fsm = ReverseEngineer2.reverseEngineer(l, p, vpg); 
		return fsm.getRoot();		
	}
	
	private EList<EObject> getEList(EObject o, String featureName) {
		EReference eref = (EReference) o.eClass().getEStructuralFeature(featureName);
		return (EList<EObject>) o.eGet(eref);
	}
	
	//@Test
	//public void copyTest() throws IOException, CoreException {
	//	copyProjectToWorkspace("fortran");
	//}
	
	@Test
	public void re_Simple_ProjA() throws IOException, CoreException {
		EObject result = reverseEngineer("ProjA", "langs/Simple.cupid");
		assertNotNull(result);
		assertEquals("TopConcept", result.eClass().getName());
		
		EList<EObject> modules = getEList(result, "Module");
		assertEquals(1, modules.size());
	}
	
	@Test
	public void re_Simple_ProjB() throws IOException, CoreException {
		EObject result = reverseEngineer("ProjB", "langs/Simple.cupid");
		assertNotNull(result);
		assertEquals("TopConcept", result.eClass().getName());
		
		EList<EObject> modules = getEList(result, "Module");
		assertEquals(2, modules.size());
	}

}
