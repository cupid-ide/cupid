package org.earthsystemcurator;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.PathExprTerm;
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute;
import org.earthsystemcurator.generator.CupidLanguageGenerator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;

public class CupidToEcore {

	/*
	public static void main(String[] args) throws IOException {
		Injector injector = new CupidLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI uri = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.cupid");
		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		URI inputURI = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.oclinecore");
		URI ecoreURI = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.ecore");
		Resource ecoreResource = doLoadOCLinEcore(inputURI, ecoreURI);
		
	}
	*/
	
	public static void saveAsXMI(Resource xtextResource) {
		//EcoreUtil.resolveAll(xtextResource);
		URI xmiURI = xtextResource.getURI().trimFileExtension().appendFileExtension("xmi");
		
		Resource xmiResource = xtextResource.getResourceSet().createResource(xmiURI);
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateEcoreModel(URI inputURI) throws IOException {
		
		//get XMI representation
		/*
		EcoreUtil.resolveAll(xtextResource);
		URI xmiURI = xtextResource.getURI().trimFileExtension().appendFileExtension("xmi");
		
		Resource xmiResource = xtextResource.getResourceSet().createResource(xmiURI);
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*
		*/
		
		//generate Ecore model in oclinecore abstract syntax
		/*
		File targetDir = getJavaFile(xtextResource.getURI()).getParentFile();
		GenerateCupidLanguage gcl = new GenerateCupidLanguage(xtextResource.getContents().get(0), targetDir, new ArrayList<Object>());	
		gcl.doGenerate(new BasicMonitor());
		*/
			
		//convert to ecore file
		//URI inputURI = xtextResource.getURI().trimFileExtension().appendFileExtension("oclinecore");
		//URI ecoreURI = xtextResource.getURI().trimFileExtension().appendFileExtension("ecore");
		URI ecoreURI = inputURI.trimFileExtension().appendFileExtension("ecore");
		
		//verify oclinecore file exists
		IFile oclinecoreFile = getFile(inputURI);
		try {
			oclinecoreFile.refreshLocal(0, new NullProgressMonitor());
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		
		if (!oclinecoreFile.exists()) {
			throw new RuntimeException("Error generating OCLinEcore intermediate representation: " + inputURI.toPlatformString(true));
		}
		
		/*
		IFile ecoreFile = getFile(ecoreURI);
		if (ecoreFile.exists()) {
			try {
				ecoreFile.delete(true, false, new NullProgressMonitor());
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
		*/
		
		Resource ecoreResource = doLoadOCLinEcore(inputURI, ecoreURI);
		ecoreResource.save(null);
		
	
	}
	
	 static OCL ocl = OCL.newInstance();
	 
	 public static Resource doLoadOCLinEcore(URI inputURI, URI ecoreURI) throws IOException {
		 
		 MetaModelManager metaModelManager = ocl.getMetaModelManager();
		 ResourceSet externalResourceSet = metaModelManager.getExternalResourceSet();
		 
		 //Resource existing = externalResourceSet.getResource(inputURI, false);
		 //if (existing != null) {
		 //	 existing.delete(null);
		 //}	 
		 
		 BaseCSResource xtextResource = (BaseCSResource) externalResourceSet.getResource(inputURI, true);
         //if (xtextResource != null) {
        	 xtextResource.unload();
        	 xtextResource.load(null);
        	 //xtextResource.delete(null);
        	 //throw new RuntimeException("Error loading resource for conversion to Ecore XMI: " + inputURI.toPlatformString(true));
         //}
         //xtextResource = (BaseCSResource) externalResourceSet.createResource(inputURI);
         //xtextResource.load(null);
         
         Resource existingEcoreResource = externalResourceSet.getResource(ecoreURI, false);
         if (existingEcoreResource != null) {
        	 existingEcoreResource.delete(null);
         }
         
		 //MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
         xtextResource.load(null);
         Resource asResource = ocl.cs2pivot(xtextResource);
         Resource ecoreResource = ocl.pivot2ecore(asResource, ecoreURI);
         return ecoreResource;
	 
	 }	

	 
	 /**
		 * Convert EMF URI to Eclipse file
		 */
	protected static IFile getFile(URI uri) {
		String platformString = uri.toPlatformString(true);
		if (platformString != null) {
			Path path = new Path(platformString);
			return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}
		return null;
	}
	
	/**
	 * Get the Java file for a URI
	 * 
	 * @param uri
	 * @return Java file
	 */
	protected static File getJavaFile(URI uri) {
		if (uri.isPlatform()) {
			IFile file = getFile(uri);
			IPath location = file.getLocation();
			return location.toFile();
		}
		return new File(uri.toFileString());
	}
	
}
