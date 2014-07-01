package org.earthsystemmodeling.pysche.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.earthsystemmodeling.psyche.ConceptDef;
import org.earthsystemmodeling.psyche.Language;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Guice;
import com.google.inject.Inject;

import org.earthsystemmodeling.PsycheInjectorProvider;

@InjectWith(PsycheInjectorProvider.class)
@RunWith(XtextRunner.class)
public class PsycheTests {

	@Inject
	ParseHelper<Language> parser;

	@Inject
	IGenerator generator;
	
	JavaIoFileSystemAccess fsa;
	
	public PsycheTests() {
		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath("src/tests/output");
		
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
	public void parseSimple() {		
		Language model = parse("src/tests/simple.psyche");
		
		assertNotNull(model);
		assertNotNull(model.getConceptDef());
		assertNotNull(model.getConceptDef().get(0));
		assertEquals(model.getConceptDef().get(0).getName(), "TopConcept");		
	}
	
	@Test
	public void parseSimple2() {		
		Language model = parse("src/tests/simple2.psyche");
		
		assertNotNull(model);
		assertNotNull(model.getConceptDef());
		assertNotNull(model.getConceptDef().get(0));
		assertEquals(model.getConceptDef().get(0).getName(), "Simple2");
		assertEquals(model.getConceptDef().get(1).getName(), "Con1");
		assertEquals(model.getConceptDef().get(2).getName(), "Con2");
		
		ConceptDef simple2 = model.getConceptDef().get(0);
		assertEquals(simple2.getChild().get(0).getName(), "c1");
		assertEquals(simple2.getChild().get(1).getName(), "c2");
		assertEquals(simple2.getChild().get(2).getName(), "c3");
	}
	
	
	@Test
	public void generatorSimple() {
			
		Language lang = parse("src/tests/simple.psyche");
		assertNotNull(lang.eResource());
		assertNotNull(fsa);
		
		generator.doGenerate(lang.eResource(), fsa);
		CharSequence cs;
		cs = fsa.readTextFile("simple.oclinecore");
		cs = fsa.readTextFile("simple.ecore");

	}
	
	@Test
	public void generatorSimple2() {
			
		Language lang = parse("src/tests/simple2.psyche");
		assertNotNull(lang.eResource());
		assertNotNull(fsa);
		
		generator.doGenerate(lang.eResource(), fsa);
		CharSequence cs;
		cs = fsa.readTextFile("simple2.oclinecore");
		cs = fsa.readTextFile("simple2.ecore");

		EPackage ep = getEPackageFromEcore("simple2.ecore");
		assertEquals(ep.getName(), "simple2");
		assertNotNull(ep.getEClassifier("Simple2"));
		assertNotNull(ep.getEClassifier("Con1"));
		assertNotNull(ep.getEClassifier("Con2"));
		assertNotNull(ep.getEClassifier("Simple2__C3"));
		
		EClass con1class = (EClass) ep.getEClassifier("Con1");
		EReference c2ref = con1class.getEReferences().get(0);
		assertEquals(c2ref.getLowerBound(), 0);
		assertEquals(c2ref.getUpperBound(), -1);
		
		EClass con2class = (EClass) ep.getEClassifier("Con2");
		EReference c1ref = con2class.getEReferences().get(0);
		assertEquals(c1ref.getLowerBound(), 1);
		assertEquals(c1ref.getUpperBound(), -1);
		
		
	}

		
	private EPackage getEPackageFromEcore(String filename) {
		ResourceSet rs = new ResourceSetImpl();
		Resource ecoreResource = rs.getResource(fsa.getURI("simple2.ecore"), true);
		return (EPackage) ecoreResource.getContents().get(0);
	}

	private Language parse(String filename) {
			
		InputStream is = null;
		try {
			is = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		ResourceSet rs = new ResourceSetImpl();
		return parser.parse(is, URI.createFileURI(filename), null, rs);
	}

}
