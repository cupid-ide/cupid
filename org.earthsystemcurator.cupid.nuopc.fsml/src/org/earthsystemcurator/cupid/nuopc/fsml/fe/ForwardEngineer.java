package org.earthsystemcurator.cupid.nuopc.fsml.fe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import org.eclipse.emf.common.util.BasicMonitor;
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
import org.eclipse.emf.compare.merge.IMerger;
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
import org.stringtemplate.v4.ST;

@SuppressWarnings("restriction")
public class ForwardEngineer {

	private Map<EObject, IASTNode> revMappings;
	private IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
			
	
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
		
		System.out.println("Match: " + m);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (Diff d : m.getDifferences()) {
			//only interested in DELETEs for now (i.e., an addition to the asserted model)
			//if (d.getKind() == DifferenceKind.DELETE) {
				if (d instanceof ReferenceChangeSpec) {
					System.out.println("\tDiff: (" + d.getKind() + ") ==> " + d + "\n");
					System.out.print("Process diff? ");
					try {
						String resp = br.readLine();
						if (resp.trim().equalsIgnoreCase("y")) {
							forwardDiff((ReferenceChangeSpec) d);
						}
					} catch (IOException e) {
						return;
					}
					
				}
			//}
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
			
			//diff.getMatch().getLeft() could be null if 
			//the current difference is dependent on a previous one
			//UNLESS we copy diffs from rightToLeft as we go
			
			IASTNode context = null;
			EObject parentMatch = diff.getMatch().getLeft();
			if (parentMatch == null) {
				System.out.println("Warning: parent match on LEFT is NULL");
			}
			else {
				context = revMappings.get(parentMatch);
				if (context == null) {
					System.out.println("Warning: no reverse mapping found for: " + diff.getMatch().getLeft());
				}
			}
			
			//SKIP actual forward add for now
			IASTNode newNode = forwardAdd(context, addedElem, keywordMap);			
			
			//copy the difference from right to left?
			
			//TODO:  see about reusing a monitor for efficiency sake
			System.out.println("Before merge: (" + diff.getState() + ") --> ");
			System.out.println("\tParent match LEFT: " + diff.getMatch().getLeft());
			System.out.println("\tValue: " + diff.getValue());
			
			mergerRegistry.getHighestRankingMerger(diff).copyRightToLeft(diff, new BasicMonitor());
			
			System.out.println("After merge: (" + diff.getState() + ") --> ");
			System.out.println("\tParent match LEFT: " + diff.getMatch().getLeft());
			System.out.println("\tValue: " + diff.getValue());
			
			//find ref to new match created after copying
			Match m = diff.getMatch().getComparison().getMatch(addedElem);
			
			System.out.println("\tCopied value: " + m.getLeft());
			
			if (m.getLeft() != null) {
				//update mappings
				revMappings.put(m.getLeft(), newNode);
			}
			else {
				System.out.println("Warning: could not find newly created node matching: " + addedElem);
			}
						
		}		
	}
	

	
	
	
	public IASTNode forwardAdd(IASTNode context, EObject modelElem, Map<String, Object> params) {
	
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
			return null;
		} catch (NoSuchMethodException e) {
			//e.printStackTrace();
			System.out.println("No forward method for mapping: " + e.getMessage());
			return null;
		}
		
		IASTNode newNode = null;
		try {
			newNode = (IASTNode) method.invoke(this, context, modelElem, params);
			System.out.println(methodName + " generated new code: " + newNode);
			//this is NOT the right modelElem to add to mapping -- should be the
			//one copied from rightToLeft
			//revMappings.put(modelElem, newNode);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
					
		return newNode;
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
	
	private String coalesce(String...elems) {
		for (String s : elems) {
			if (s != null) return s;
		}
		return null;
	}
	
	public IASTNode subroutine(IASTNode context, EObject modelElem, Map<String, Object> params) {		
		
		String subroutineSig = (String) params.get("subroutine");
		String subroutineName1, subroutineName2;
		subroutineName1 = findMappedValueString("subroutineName", modelElem);
		
		List<Type> types = new ArrayList<Type>();
		subroutineName2 = CodeQuery.parseSubroutineSig(subroutineSig, types);
		
		//code = String.format(code, subroutineName);
	
		ST code = new ST("subroutine <name>(<arg:{a|arg<i0>}; separator=\", \">)\n"
					   + "<arg:{a|    <a> :: arg<i0>}; separator=\"\n\">\n"
					   + "end subroutine\n");
		
		code.add("name", coalesce(subroutineName1, subroutineName2));
		code.add("arg", types);
		System.out.println("Code to parse:\n" + code.render() + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render());
		
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