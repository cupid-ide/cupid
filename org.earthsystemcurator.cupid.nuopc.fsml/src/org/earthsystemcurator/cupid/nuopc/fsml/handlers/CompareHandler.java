package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.IOException;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ide.EMFCompareIDEPlugin;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class CompareHandler extends AbstractHandler {

	public static String reverseFile = "C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\nuopc\\Reverse.nuopc";

	/**
	 * The constructor.
	 */
	public CompareHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		@SuppressWarnings("unused")
		NUOPCPackage pack = NUOPCPackage.eINSTANCE;

		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
		String xmi1 = ReverseHandler.reverseFile;
		String xmi2 = ForwardHandler.assertedFile;
		Resource rs1 = load(xmi1, resourceSet1);
		Resource rs2 = load(xmi2, resourceSet2);
		
		Comparison comp = compare(resourceSet1, resourceSet2);
		
		findDiffs(comp.getMatches());
		
//		for (Match m : comp.getMatches()) {
//			System.out.println("Match: " + m.toString());
//			for (Match sm : m.getSubmatches()) {
//				System.out.println("\tSubmatch: " + sm.toString());
//			}			
//		}
//		for (Diff d : comp.getDifferences()) {
//			System.out.println("Diff: " + d.toString());
//			//System.out.println("\tRelated Match: " + d.getMatch());
//			if (d instanceof AttributeChangeSpec) {
//				AttributeChangeSpec acs = (AttributeChangeSpec) d;
//				//System.out.println("\tAttribute name:"  + acs.getAttribute().get);
//			}
//			
//		}

		//TODO:  Recursively visit matches looking for differences
		// - for "ADD" differences (for now), call the forward code transformation		
		
		//System.out.println("Merging from right to left...\n");
		
		//IMerger.Registry registry = EMFCompareIDEPlugin.getDefault().getMergerRegistry();
		//registry.getHighestRankingMerger(diff).copyRightToLeft(diff, new BasicMonitor());
		
		//IMerger.Registry registry = IMerger.RegistryImpl.createStandaloneInstance();
		//for (Diff d : comp.getDifferences()) {		
		//	System.out.println("Merging diff: " + d);
		//	registry.getHighestRankingMerger(d).copyRightToLeft(d, new BasicMonitor());
		//	System.out.println("After merge: " + d);
		//}

		
		//try {
		//	rs1.save(null);
		//} catch (IOException e) {			
		//	e.printStackTrace();
		//}
		
		//System.out.println("Merge complete!");
		
		return null;
	}

	
	
	public void findDiffs(Match m) {
		for (Diff d : m.getDifferences()) {
			if (d instanceof ReferenceChangeSpec) {
				System.out.println("Found ref change diff: (" + d.getKind() + ") ==> " + d);
				ReferenceChangeSpec rcs = (ReferenceChangeSpec) d;
				//EAnnotation ann = rcs.getReference().getEType().getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
				//if (ann != null) {
				//	String mapping = ann.getDetails().get("mapping");
				//	System.out.println("\tMapping for diff: " + mapping);
				//}
			}
		}
		findDiffs(m.getSubmatches());
	}
	
	public void findDiffs(EList<Match> matches) {
		for (Match m : matches) {
			findDiffs(m);
		}
	}

	public Comparison compare(ResourceSet rs1, ResourceSet rs2) {
		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		IComparisonScope scope = EMFCompare.createDefaultScope(rs1, rs2);
				
		return comparator.compare(scope);
	}

	private Resource load(String absolutePath, ResourceSet resourceSet) {
		URI uri = URI.createFileURI(absolutePath);

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("nuopc", new XMIResourceFactoryImpl());

		// Resource will be loaded within the resource set
		return resourceSet.getResource(uri, true);
	}



	IResource extractSelection(ISelection sel) {

		System.out.println("sel = " + sel);

		if (!(sel instanceof IStructuredSelection))
			return null;
		IStructuredSelection ss = (IStructuredSelection) sel;
		Object element = ss.getFirstElement();
		if (element instanceof IResource)
			return (IResource) element;
		if (!(element instanceof IAdaptable))
			return null;
		IAdaptable adaptable = (IAdaptable)element;
		Object adapter = adaptable.getAdapter(IResource.class);
		return (IResource) adapter;
	}
}
