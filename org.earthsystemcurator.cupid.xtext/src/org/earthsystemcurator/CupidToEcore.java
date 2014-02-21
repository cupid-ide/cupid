package org.earthsystemcurator;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class CupidToEcore {

	public static void main(String[] args) {
		Injector injector = new CupidLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI uri = URI.createURI("instances/mytest.cupid");
		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI("mytest.cupid.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
