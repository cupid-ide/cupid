package org.earthsystemcurator.cupid.nuopc.fsml.fe;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.EcoreUtils;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.stringtemplate.v4.ST;

@SuppressWarnings("restriction")
public class ForwardEngineer {

	private Map<Object, Object> revMappings;
	private IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
	private IProject container;	
	//private Set<IFortranAST> astsToReindent = new HashSet<IFortranAST>();
	
	//private IFortranAST recentAST = null;
	
	public ForwardEngineer() {
		//mergerRegistry.add(new CupidRefChangeMerger());
	}
	
	public void setContainer(IProject container) {
		this.container = container;
	}

	public void forward(NUOPCApplication reversed, NUOPCApplication asserted, Map<Object, Object> revMap) {
		this.revMappings = revMap;
		//astsToReindent.clear();
		Comparison comp = compare(reversed, asserted);
		forwardDiffs(comp.getMatches());
		
		//TODO: brute force do reindenting - optimize
		//perhaps related each mapped node back to its AST
		
		//for (IFortranAST ast : astsToReindent) {
		//	System.out.println("Reindenting: " + ast.getFile().getName());
		//	Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
		//}
		for (Object val : revMap.values()) {
			if (val instanceof IFortranAST) {
				Reindenter.reindent(((IFortranAST) val).getRoot(), (IFortranAST) val, Strategy.REINDENT_EACH_LINE);
			}
		}
		
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
	
	
	
	protected void forwardDiffs(Match m) {
		
		//System.out.println("Match: " + m);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (Diff d : m.getDifferences()) {
			//only interested in DELETEs for now (i.e., an addition to the asserted model)
			if (d.getKind() == DifferenceKind.DELETE) {
				if (d instanceof ReferenceChangeSpec) {
					System.out.println("\tDiff: (" + d.getKind() + ") ==> " + d + "\n");
					forwardDiff((ReferenceChangeSpec) d);
					/*
					System.out.print("Process diff? ");
					try {
						String resp = br.readLine();
						if (resp.trim().equalsIgnoreCase("y")) {
							forwardDiff((ReferenceChangeSpec) d);
						}
					} catch (IOException e) {
						return;
					}
					*/
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
		Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(diff.getReference());
		if (keywordMap != null) {			
			EObject addedElem = diff.getValue();
			
			//context is one of:  IASTNode, IFortranAST, PhotranVPG
			Object fortranElem = null;
			EObject parentMatch = diff.getMatch().getLeft();
			if (parentMatch == null) {
				System.out.println("Warning: parent match on LEFT is NULL");
			}
			else {
				fortranElem = revMappings.get(parentMatch);
				if (fortranElem == null) {
					System.out.println("Warning: no reverse mapping found for: " + diff.getMatch().getLeft());
				}
			}
						
			Object newFortranElem = forwardAdd(fortranElem, addedElem, keywordMap);			
			//if (newFortranElem instanceof IFortranAST) {
			//	astsToReindent.add((IFortranAST) newFortranElem);
			//}
			
			//TODO:  see about reusing a monitor for efficiency sake
			//System.out.println("Before merge: (" + diff.getState() + ") --> ");
			//System.out.println("\tParent match LEFT: " + diff.getMatch().getLeft());
			//System.out.println("\tValue: " + diff.getValue());
			
			mergerRegistry.getHighestRankingMerger(diff).copyRightToLeft(diff, new BasicMonitor());			
			
			//System.out.println("After merge: (" + diff.getState() + ") --> ");
			//System.out.println("\tParent match LEFT: " + diff.getMatch().getLeft());
			//System.out.println("\tValue: " + diff.getValue());
			
			//find ref to new match created after copying
			Match m = diff.getMatch().getComparison().getMatch(addedElem);
			
			//System.out.println("\tCopied value: " + m.getLeft());
			
			if (m.getLeft() != null) {
				//update mappings
				revMappings.put(m.getLeft(), newFortranElem);
			}
			else {
				System.out.println("Warning: could not find newly created node matching: " + addedElem);
			}
						
		}		
	}
	

		
	public Object forwardAdd(Object fortranElem, EObject modelElem, Map<String, Object> params) {
	
		String methodName = null;
		if (params.size() > 0) {
			//by convention, first parameter keyword determines method name
			methodName = (String) params.keySet().toArray()[0];
			//skip metavariables for now
		}
		
		//IASTNode node = null;
				
		Method method = null;
		for (Method m : ForwardEngineer.class.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName)) {
				Class<?> c = m.getParameterTypes()[0];
				if (c.isInstance(fortranElem)) {
					method = m;
					break;
				}
			}
		}
		
		if (method == null) {
			System.out.println("Method not found: " + methodName + " with first param type: " + fortranElem.getClass());
			return null;
		}
		
//		try {
//		
//			method = this.getClass().getMethod(methodName, IASTNode.class, EObject.class, Map.class);
//		} catch (SecurityException e) {
//			e.printStackTrace();
//			return null;
//		} catch (NoSuchMethodException e) {
//			//e.printStackTrace();
//			System.out.println("No forward method for mapping: " + e.getMessage());
//			return null;
//		}
//		
		Object newFortranElem = null;
		try {
			newFortranElem = method.invoke(this, fortranElem, modelElem, params);
			System.out.println(methodName + " generated new code: " + newFortranElem);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
					
		return newFortranElem;
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
	
	
	//public IFortranAST module(PhotranVPG vpg, EObject modelElem, Map<String, Object> params) {
	public IFortranAST module(Set<IFortranAST> asts, EObject modelElem, Map<String, Object> params) {
		
		//System.out.println("Module: vpg context = " + vpg);
		//vpg.getVPGWriter()
		//subroutine dummy()\nend subroutine\n
		ST code = new ST("module <moduleName>\n"
				  		+ "<useModule, oldName, newName:{u,o,n|use <u>, only: <n> => <o>}; separator=\"\n\">\n"
				  		+ "\nimplicit none\ncontains\nend module");
		
		String moduleName = findMappedValueString("moduleName", modelElem);
		if (moduleName == null || moduleName.trim().length() == 0) {
			moduleName = "module_name_default";
		}
		code.add("moduleName", moduleName);
		
		List<String> useModule = new ArrayList<String>();
		List<String> oldName = new ArrayList<String>();
		List<String> newName = new ArrayList<String>();
		
		//collect use statements
		//this mechanism assumes that "uses" mappings are direct children
		for (EAttribute ea : modelElem.eClass().getEAttributes()) {
			Map<String,Object> mapping = Regex.getMappingFromAnnotation(ea);
			if (mapping != null && mapping.size() > 0 && mapping.entrySet().iterator().next().getKey().equalsIgnoreCase("uses")) {
				useModule.add((String) mapping.get("uses"));
				oldName.add((String) mapping.get("entity"));
				newName.add((String) modelElem.eGet(ea));
			}
		}
		code.add("useModule", useModule);
		code.add("oldName", oldName);
		code.add("newName", newName);
		
		System.out.println("Module code template:\n" + code.render() + "\n\n");
		
		//container.
		IFile fileToAdd = container.getFile(moduleName.toLowerCase() + ".F90");
				
		if (!fileToAdd.exists()) {
		    byte[] bytes = code.render().getBytes();
		    InputStream source = new ByteArrayInputStream(bytes);
		    try {
		    	//TODO: look at fileToAdd.setContents(...)
				fileToAdd.create(source, IResource.NONE, null);				
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
		
		
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(fileToAdd);
		asts.add(ast);
		
		return ast;
		
		//ASTModuleNode amn = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit(code);
			
		//if we are adding a module, then no file exists
		//so we need to therefore create a new file in the workspace, etc.
	}
	
	/*
	private String coalesce(String...elems) {
		for (String s : elems) {
			if (s != null) return s;
		}
		return null;
	}
	*/
	
	public IASTNode call(IASTNode context, EObject modelElem, Map<String, Object> params) {		
		
		//call NUOPC_StateAdvertiseField(importState, StandardName="air_pressure_at_sea_level", rc=rc)
		
		String callSig = (String) params.get("call");
		
		List<String> vars = null;
		List<String> keywords = null;
		@SuppressWarnings("unchecked")
		List<String> varsAndKeywords[] = new List[] {null, null};
		
		String subroutineName = CodeQuery.parseCallSig(callSig, varsAndKeywords);
		vars = varsAndKeywords[0];
		keywords = varsAndKeywords[1];
		
		//substitute model attributes for metavariables
		if (subroutineName.startsWith("#")) {
			subroutineName = EcoreUtils.eGetSFValue(subroutineName, modelElem, subroutineName);
		}
		for (int i=0; i<vars.size(); i++) {
			if (vars.get(i) == null) {
				vars.set(i, "arg"+i);
			}
			else if (vars.get(i).startsWith("#")) {
				vars.set(i, EcoreUtils.eGetSFValue(vars.get(i), modelElem, "arg"+i));
			}
		}	
		
		
		//Map<Object,String> args = collectActualArguments(modelElem);
		
		ST code = new ST("\n\n! this is a comment\ncall <name>(<vars, keys:{v,k|<if(k)><k> = <endif><v>}; separator=\", \">)\n");
		code.add("name", subroutineName);
		code.add("vars", vars);
		code.add("keys", keywords);
		
		/*
		for (Entry<Object,String> e : args.entrySet()) {
			if (e.getKey() instanceof String) {
				code.add("args", e.getKey() + " = " + e.getValue());
			}
			else {
				code.add("args", e.getValue());
			}
		}
		*/
		
		System.out.println("Code to parse:\n" + code.render() + "\n");
		
		IBodyConstruct node = CodeExtraction.parseLiteralStatement(code.render());		
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) context;
		ssn.getBody().add(node);
		
		//Reindenter.reindent(node, recentAST, Strategy.REINDENT_EACH_LINE);
		
		return node;
	}	
	
	public IASTNode subroutine(IFortranAST context, EObject modelElem, Map<String, Object> params) {		
		
		String subroutineSig = (String) params.get("subroutine");
		String subroutineName; // 1, subroutineName2;
		//subroutineName1 = findMappedValueString("subroutineName", modelElem);
		
		List<String> types = new ArrayList<String>();
		List<String> intents = new ArrayList<String>();
		List<String> vars = new ArrayList<String>();
		subroutineName = CodeQuery.parseSubroutineSigAsString(subroutineSig, intents, types, vars);
		
		//substitute model attributes for metavariables
		if (subroutineName.startsWith("#")) {
			subroutineName = EcoreUtils.eGetSFValue(subroutineName.substring(1), modelElem, null);
		}
		for (int i=0; i<vars.size(); i++) {
			if (vars.get(i) == null) {
				vars.set(i, "arg"+i);
			}
			else if (vars.get(i).startsWith("#")) {
				vars.set(i, EcoreUtils.eGetSFValue(vars.get(i).substring(1), modelElem, vars.get(i).substring(1)));
			}
		}	
		
		String doc = Regex.getDocFromAnnotation(modelElem.eClass());
				
		ST code = new ST("\n\n<if(doc)>\n!\n! <doc; wrap=\"\n! \", separator=\" \">\n!\n<endif>"
				       + "subroutine <name>(<vars:{v|<v>}; separator=\", \">)\n"
					   + "<vars, types, intents:{v, t, i|    <t><if(i)>, intent(<i>)<endif> :: <v>}; separator=\"\n\">\n"
					   + "end subroutine\n");
				
		code.add("name", subroutineName);
		code.add("types", types);
		code.add("intents", intents);
		code.add("vars", vars);
		if (doc != null) {
			doc = doc.replaceAll("\n", "\n! ");
			code.add("doc", doc.split(" "));			
		}
		System.out.println("Code to parse:\n" + code.render(72) + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render(72));
		
		//assume it is a module for now
		ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
		amn.getModuleBody().add(ssn);
		
		
		//Reindenter.reindent(ssn, context, Strategy.REINDENT_EACH_LINE);
		
		//record this for later reindenting
		//recentAST = context;
		
		return ssn;
	}
	
	/*
	public IASTNode uses(IFortranAST context, String modelElem, Map<String, Object> params) {		
		
		//use NUOPC_Model, only: model_routine_SS_blah    => routine_SetServices, model_label_Advance => label_Advance
		  
		String usesModule = (String) params.get("uses");
		String usesEntity = (String) params.get("entity");
		
		ST code = new ST("\n\nsuse <moduleName>, only: <newName> => <oldName>");
		code.add("moduleName", usesModule);
		code.add("newName", modelElem);
		code.add("oldName", usesEntity);
		
		System.out.println("Code to parse:\n" + code.render() + "\n");
		
		ASTUseStmtNode usn = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(code.render());
		
		//assume it is a module for now
		ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
		amn.getModuleBody().add(0, usn);
		
		//Reindenter.reindent(ssn, context, Strategy.REINDENT_EACH_LINE);
		
		//record this for later reindenting
		//recentAST = context;
		
		return usn;
	}
	*/
	
	
	
	
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
			Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(sf);
			if (keywordMap != null && keywordMap.keySet().toArray()[0].equals(mapping)) {
				return (String) parent.eGet(sf);
			}
		}		
		return null;		
	}
	
	private static Map<Object, String> collectActualArguments(EObject parent) {
		//sort with integer args first followed by keyword args
		Map<Object, String> args = new TreeMap<Object, String>(new Comparator<Object>(){
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Integer && o2 instanceof Integer) {
					return (Integer) o1 - (Integer) o2;
				}
				else if (o1 instanceof Integer && o2 instanceof String) {
					return -1;
				}
				else if (o2 instanceof Integer && o1 instanceof String) {
					return 1;
				}
				else {
					return 0;
				}					
			}
		});
		
		//Map<String, String> keywordArgs = new HashMap<String, String>();
		
		for (EStructuralFeature sf : parent.eClass().getEStructuralFeatures()) {
			Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(sf);
			if (keywordMap != null) {
				Entry<String, Object> first = keywordMap.entrySet().iterator().next();
				//String[] keys = null;
				//keys = keywordMap.keySet().toArray(keys);
				if (first.getKey().equals("argByIndex") || first.getKey().equals("argByKeyword")) {
					args.put(first.getValue(), (String) parent.eGet(sf));
				}
				
				//return (String) parent.eGet(sf);
			}
		}
		
		return args;
	}
	
}
