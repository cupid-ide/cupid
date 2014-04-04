package org.earthsystemcurator.cupid.xtext.tests;

import org.junit.runner.RunWith;
import org.eclipse.xtext.junit4.InjectWith;
import org.earthsystemcurator.CupidLanguageInjectorProvider;
import org.eclipse.xtext.junit4.XtextRunner;

import static org.junit.Assert.*;

import org.eclipse.xtext.junit4.util.ParseHelper;

import com.google.inject.Inject;

import org.earthsystemcurator.cupidLanguage.Language;
import org.junit.BeforeClass;
import org.junit.Test;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.junit.Before;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import java.net.URL;
import java.net.MalformedURLException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.URI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.google.inject.Guice;

import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.parser.IEncodingProvider;

@InjectWith(CupidLanguageInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CupidTests {

	@Inject
	ParseHelper<Language> parser;

	@Inject
	IGenerator generator;
	
	IFileSystemAccess fsa;
	
	public CupidTests() {
		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath("C:\\Users\\Rocky\\git\\cupid\\org.earthsystemcurator.cupid.xtext.tests\\src\\tests");
		
		Guice.createInjector(new AbstractGenericModule() {	
			@SuppressWarnings("unused")
			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}
			
		}).injectMembers(fsa);
		this.fsa = fsa;
	}
	
	@BeforeClass
	public static void setUp() {
		OCLinEcoreStandaloneSetup.doSetup();
		OCLstdlib.install();	
	}

	@Test
	public void simpleParse() {		
		Language model = parseSimpleLang();
		
		assertNotNull(model);
		assertNotNull(model.getConceptDef());
		assertNotNull(model.getConceptDef().get(0));
		assertEquals(model.getConceptDef().get(0).getName(), "TopConcept");		
	}
	
	@Test
	public void generatorTest() {
			
		Language lang = parseSimpleLang();
		assertNotNull(lang.eResource());
		assertNotNull(fsa);
		
		generator.doGenerate(lang.eResource(), fsa);

	}

	public Language parseSimpleLang() {
		
		URL langURL = null;
		try {
			langURL = new URL("file:C:\\Users\\Rocky\\git\\cupid\\org.earthsystemcurator.cupid.xtext.tests\\src\\tests\\simple.cupid");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream is = null;
		try {
			is = new FileInputStream(langURL.getFile());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResourceSet rs = new ResourceSetImpl();
		//val langResource = rs.getResource(URI.createFileURI(langURL.getPath()), true);
		//langResource.
		
		return parser.parse(is, URI.createFileURI(langURL.getPath()), null, rs);
	}

}
