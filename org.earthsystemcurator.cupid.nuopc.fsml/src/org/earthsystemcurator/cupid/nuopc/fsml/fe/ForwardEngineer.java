package org.earthsystemcurator.cupid.nuopc.fsml.fe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.re.ReverseEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Equivalence;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ForwardEngineer {

	private Map<EObject, IASTNode> revMappings;
			
	protected Comparison compare(Notifier left, Notifier right) {
		// Configure EMF Compare		
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		IComparisonScope scope = EMFCompare.createDefaultScope(left, right);
				
		return comparator.compare(scope);
	}
	
	public static Map<String, Object> getMappingFromAnnotation(EStructuralFeature sf) {
		EAnnotation ann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		if (ann != null) {
			return Regex.parseMappingExpression(ann.getDetails().get("mapping"));			
		}
		else {
			return null;
		}
	}
	
	protected void forwardDiffs(Match m) {
		for (Diff d : m.getDifferences()) {
			//only interested in DELETEs for now (i.e., an addition to the asserted model)
			if (d.getKind() == DifferenceKind.DELETE) {
				if (d instanceof ReferenceChangeSpec) {
					System.out.println("\n\n====================\nDiff: (" + d.getKind() + ") ==> " + d);
					ReferenceChangeSpec rcs = (ReferenceChangeSpec) d;
					//String mapping = getMappingFromAnnotation(rcs.getReference());
					forwardDiff(rcs);
				}
			}
		}
		forwardDiffs(m.getSubmatches());
	}
	
	protected void forwardDiffs(EList<Match> matches) {
		for (Match m : matches) {
			forwardDiffs(m);
		}
	}
	
	protected void forwardDiff(ReferenceChangeSpec diff) {
		Map<String, Object> keywordMap = getMappingFromAnnotation(diff.getReference());
		if (keywordMap != null) {			
			EObject addedElem = diff.getValue();
			IASTNode context = revMappings.get(diff.getMatch().getLeft());
			if (context == null) {
				System.out.println("Warning: no reverse mapping found for: " + diff.getMatch().getLeft());
			}
			forwardAdd(context, addedElem, keywordMap);			
			
			//add node to parent
			//forwardAdd(revMappings.get(diff.getMatch().getLeft()), node, keywordMap);
		}		
	}
	

	public void forward(NUOPCApplication reversed, NUOPCApplication asserted, Map<EObject, IASTNode> revMappings) {

		this.revMappings = revMappings;
		
		Comparison comp = compare(reversed, asserted);
		forwardDiffs(comp.getMatches());		
		
//		for (NUOPCModel nm : app.getNuopcModel()) {
//			if (nm.getName() != null) {
//				 //List<IFile> files = vpg.findFilesThatExportModule(nm.getName());
//				 //if (files.size() == 1) {
//				//	 IFortranAST ast = vpg.acquirePermanentAST(files.get(0));
//				//	 ASTModuleNode amn = (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0);
//				//	 
//				 //}
//				 //else {
//				//	 throw new RuntimeException("More than one file with module: " + nm.getName() + " ... Handle this...");
//				 //}
//				//just start null for now				
//				ASTModuleNode amn = (ASTModuleNode) forward(null, nm, null);
//				System.out.println(amn);
//			}
//			else {
//				throw new RuntimeException("Module with no name... Handle this...");
//			}
//		}
	}
	
	
	public void forwardAdd(IASTNode context, EObject modelElem, Map<String, Object> params) {
	
		String methodName = null;
		if (params.size() > 0) {
			//by convention, first parameter keyword determines method name
			methodName = (String) params.keySet().toArray()[0];
			//skip metavariables for now
		}
		
		//IASTNode node = null;
		
		Method method = null;
		try {
			method = this.getClass().getMethod(methodName, IASTNode.class, EObject.class, Map.class);
		} catch (SecurityException e) {
			e.printStackTrace();
			return;
		} catch (NoSuchMethodException e) {
			//e.printStackTrace();
			System.out.println("No forward method for mapping: " + e.getMessage());
			return;
		}
		
		try {
			IASTNode newNode = (IASTNode) method.invoke(this, context, modelElem, params);
			System.out.println(methodName + " generated new code: " + newNode);
			revMappings.put(modelElem, newNode);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
			
		
				
		/*
		for (Method method : this.getClass().getMethods()) {
			if (method.getName().equalsIgnoreCase(methodName)) {
				
				try {
					node = (IASTNode) method.invoke(this, modelElem, params);
					System.out.println("result = " + node);			
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				
			}
		}
		*/
		
		/*
		if (modelElem instanceof EObject) {
			for (EStructuralFeature sf : ((EObject) modelElem).eClass().getEStructuralFeatures()) {
				
				EAnnotation sfann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
				if (sfann == null) 
					continue;
				
				String sfmapping = sfann.getDetails().get("mapping");
				if (sfmapping == null) 
					continue;
				
				Map<String, Object> keywordMap = Regex.parseMappingExpression(sfmapping);
				
				//the structural feature is either an EAttribute or an EReference
				Object sfVal = ((EObject) modelElem).eGet(sf);
				
				if (!sf.isMany()) {					
					forward(node, sfVal, keywordMap);
				}
				else {
					EList sfValList = (EList) sfVal; 					
					for (Object sfValItem : sfValList) {
						forward(node, sfValItem, keywordMap);
					}
				}
			
			} //end for
		
		} //end if modelElem instanceof EObject
		*/
		
		//return node;
	}
	
	
	//private void forwardAdd(IASTNode context, IASTNode node, Map<String, Object> keywordMap) {
	//	throw new RuntimeException("Default forwardAdd");		
	//}
	
	//private void forwardAdd(ASTModuleNode context, ASTSubroutineSubprogramNode node, Map<String, Object> keywordMap) {
	//	System.out.println("Inside forwardAdd (module, subprogram)");
	//	context.getModuleBody().add(node);
		//throw new RuntimeException("Default forwardAdd");		
	//}
	
	/*
	public IASTNode subroutine(String mapping, IASTNode context, EObject modelElem) {
		
		
		
		
		return null;
	}
	*/
	
	
	public IASTNode module(IASTNode context, EObject modelElem, Map<String, Object> params) {
		String code = "module %s\nimplicit none\ncontains\nsubroutine dummy()\nend subroutine\nend module";
		String moduleName = findMappedValueString("moduleName", modelElem);
		code = String.format(code, moduleName);
		
		ASTModuleNode amn = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit(code);
		
		return amn;
		//if we are adding a module, then no file exists
		//so we need to therefore create a new file in the workspace, etc.
	}
	
	
	public IASTNode subroutine(IASTNode context, EObject modelElem, Map<String, Object> params) {		
		
		String subroutineSig = (String) params.get("subroutine");
		String subroutineName = null;
		List<Type> types = new ArrayList<Type>();
		subroutineName = CodeQuery.parseSubroutineSig(subroutineSig, types);
				
		String code = "subroutine %s()\nend subroutine\n";
		subroutineName = findMappedValueString("subroutineName", modelElem);
		code = String.format(code, subroutineName);
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code);
		
		//assume it is a module for now
		ASTModuleNode amn = (ASTModuleNode) context;
		amn.getModuleBody().add(ssn);
		//Reindenter.
		
		return ssn;
	}
	
	
	
	
	
	
	/*public IASTNode moduleName(ASTModuleNode node, String modelElem, Map<String, Object> params) {
		
		if (node.getModuleStmt() == null)
			node.setModuleStmt(new ASTModuleStmtNode());
		
		if (node.getModuleStmt().getModuleName() == null)
			node.getModuleStmt().setModuleName(new ASTModuleNameNode());
		
		node.getModuleStmt().getModuleName().getModuleName().setText(modelElem);

		return node;
		
	}*/
	
	private static String findMappedValueString(String mapping, EObject parent) {		
		for (EStructuralFeature sf : parent.eClass().getEStructuralFeatures()) {
			Map<String, Object> keywordMap = getMappingFromAnnotation(sf);
			if (keywordMap != null && keywordMap.keySet().toArray()[0].equals(mapping)) {
				return (String) parent.eGet(sf);
			}
		}		
		return null;		
	}
	
}
