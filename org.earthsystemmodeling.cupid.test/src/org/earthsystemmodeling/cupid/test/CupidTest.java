package org.earthsystemmodeling.cupid.test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent.GenericImport;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SpecializationMethodCodeConcept;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@SuppressWarnings("restriction")
public class CupidTest {

	private static IProject PROJECT_NUOPC_PROTOTYPES;
		
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59", "ESMF_7_0_0_beta_snapshot_59");
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, null);
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
	*/
}
