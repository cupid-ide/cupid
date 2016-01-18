package org.earthsystemmodeling.cupid.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel;
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
		PROJECT_NUOPC_PROTOTYPES = createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59", "ESMF_7_0_0_beta_snapshot_59");
	}
	
	
	@Test	
	public void NUOPCProtos_bs59() throws SQLException, CoreException {
		
		String dbloc = "~/.cupid/codedb_test";
		String connString = "jdbc:h2:" + dbloc + ";LOG=0;CACHE_SIZE=65536;LOCK_MODE=0;UNDO_LOG=0";
		final CodeDBIndex codeDB = CodeDBIndex.getInstance();
		codeDB.openConnection(connString);
		codeDB.rebuildDatabase();
		codeDB.truncateDatabase();
		
		//skip validation for these files
		final List<String> skipVal = new ArrayList<String>();
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/esm.F90"); //use of ESMF_MethodAdd
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectProto/esm.F90"); //use if ESMF_MethodAdd
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnIceSimpleImplicitProto/ice.F90"); //use of wrong ipdv02p2 (should be p3)
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnIceSimpleImplicitProto/ocn.F90"); //use of wrong ipdv02p2 (should be p3)
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSimpleImplicitProto/ocn.F90"); //same as above
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/OcnModelB/OcnSub/ocnSub.F90"); // calls set service directory, not compderive
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/OcnModelC/OcnSub/ocnSub.F90"); // same as above
		
		class MyResourceVisitor implements IResourceVisitor {
			
			public int driverCount = 0;
			public int mediatorCount = 0;
			public int modelCount = 0;
			
			public boolean fails = false;
			
			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					
					IFile file = (IFile) resource;
					//if (skip.contains(file.getFullPath().toString())) {
					//	System.out.println("Skipping " + file.getFullPath());
					//	return true;
					//}
					
					PhotranVPG.getInstance().releaseAST(file);
					if (PhotranVPG.getInstance().shouldProcessFile(file)) {
						
						IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(file);
						assertNotNull(ast);
						codeDB.truncateDatabase();
						codeDB.indexAST(ast);
						
						InputStream is = file.getContents();
						try {
							LineIterator li = IOUtils.lineIterator(is, "UTF-8");
							while (li.hasNext()) {
								String line = li.nextLine();
								if (line.contains("use NUOPC_Driver")) {
									NUOPCDriver driver = (NUOPCDriver) new NUOPCDriver(codeDB).reverse();
									assertNotNull(driver);
									assertNotNull("No SetServices: " + file.getFullPath(), driver.setServices);
									assertNotNull(driver.importESMF);
									assertNotNull(driver.importNUOPC);
									assertNotNull(driver.importNUOPCGeneric);
									assertNotNull(driver.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!driver.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									driverCount++;
									return true;
								}
								else if (line.contains("use NUOPC_Model")){
									NUOPCModel model = (NUOPCModel) new NUOPCModel(codeDB).reverse();
									assertNotNull(model);
									assertNotNull(model.setServices);
									assertNotNull(model.importESMF);
									assertNotNull(model.importNUOPC);
									assertNotNull(model.importNUOPCGeneric);
									assertNotNull(model.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!model.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									modelCount++;
									return true;
								}
								else if (line.contains("use NUOPC_Mediator")) {
									NUOPCMediator mediator = (NUOPCMediator) new NUOPCMediator(codeDB).reverse();
									assertNotNull(mediator);
									assertNotNull(mediator.setServices);
									assertNotNull(mediator.importESMF);
									assertNotNull(mediator.importNUOPC);
									assertNotNull(mediator.importNUOPCGeneric);
									assertNotNull(mediator.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!mediator.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									mediatorCount++;
									return true;
								}
							}
								
							
						} catch (IOException e) {
							fails = true;
							return false;
						}
					
						
					}
							
					
				}
				return true;
			}
		};
		
		MyResourceVisitor visitor = new MyResourceVisitor();
		PROJECT_NUOPC_PROTOTYPES.accept(visitor);
		
		assertFalse(visitor.fails);
		System.out.println("Driver count = " + visitor.driverCount);
		System.out.println("Model count = " + visitor.modelCount);
		System.out.println("Mediator count = " + visitor.mediatorCount);

		//assertTrue("Driver count is more than 10", visitor.driverCount > 10);
		
		
	}
	
	private String join(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String s : strings) {
			sb.append(s + "\n");
		}
		return sb.toString();
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
