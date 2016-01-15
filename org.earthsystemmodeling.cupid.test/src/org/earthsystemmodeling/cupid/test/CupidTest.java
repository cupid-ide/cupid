package org.earthsystemmodeling.cupid.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


@SuppressWarnings("restriction")
public class CupidTest {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidTest.class);

	private static IProject PROJECT_NUOPC_PROTOTYPES;
		
	@BeforeClass
	public static void setUp() throws CoreException, IOException {
		PROJECT_NUOPC_PROTOTYPES = createProjectFromFolder("target/checkout", "NUOPC");
	}
	
	
	@Test	
	public void anotherTest() throws SQLException, CoreException {
		
		String dbloc = "~/.cupid/codedb_test";
		String connString = "jdbc:h2:" + dbloc + ";LOG=0;CACHE_SIZE=65536;LOCK_MODE=0;UNDO_LOG=0";
		final CodeDBIndex codeDB = CodeDBIndex.getInstance();
		codeDB.openConnection(connString);
		codeDB.rebuildDatabase();
		codeDB.truncateDatabase();
		
		class MyResourceVisitor implements IResourceVisitor {
			
			public int driverCount = 0;
			
			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					
					IFile file = (IFile) resource;
					PhotranVPG.getInstance().releaseAST(file);
					if (PhotranVPG.getInstance().shouldProcessFile(file)) {
						IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(file);
						assertNotNull(ast);
						codeDB.truncateDatabase();
						codeDB.indexAST(ast);
					
						NUOPCDriver driver = (NUOPCDriver) new NUOPCDriver(codeDB).reverse();
						if (driver != null) driverCount++;
					}
					
					//assertNotNull("Driver discovered", driver);
					//assertNotNull("Driver has set services", driver.setServices);				
					
				}
				return true;
			}
		};
		
		MyResourceVisitor visitor = new MyResourceVisitor();
		PROJECT_NUOPC_PROTOTYPES.accept(visitor);
		
		assertTrue("Driver count is more than 10", visitor.driverCount > 10);
		
		
	}
	
	
	/**
	 * Copies a folder from workspace folder in the test project to the testing workspace.
	 * Replaces folder if it already exists in the workspace.
	 * @param projectName
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private static IProject createProjectFromFolder(String relativePath, String projectName) throws IOException, CoreException  {			
		URL sourceFolder = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(relativePath), null));	
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
	
	/*
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
		
		//TODO: check line below
		final FSM<?> fsm = ReverseEngineer.reverseEngineer(p); 
		return fsm.getRoot();		
	}
	
	
	@SuppressWarnings("unchecked")
	private EList<EObject> getEList(EObject o, String featureName) {
		EReference eref = (EReference) o.eClass().getEStructuralFeature(featureName);
		return (EList<EObject>) o.eGet(eref);
	}
	
	@Test
	public void re_Simple_ProjA() throws IOException, CoreException {
		EObject result = reverseEngineer("ProjA", "langs/Simple.psyche");
		assertNotNull(result);
		assertEquals("TopConcept", result.eClass().getName());
		
		EList<EObject> modules = getEList(result, "Module");
		assertEquals(1, modules.size());
	}
	
	@Test
	public void re_Simple_ProjB() throws IOException, CoreException {
		EObject result = reverseEngineer("ProjB", "langs/Simple.psyche");
		assertNotNull(result);
		assertEquals("TopConcept", result.eClass().getName());
		
		EList<EObject> modules = getEList(result, "Module");
		assertEquals(2, modules.size());
	}
	*/
}
