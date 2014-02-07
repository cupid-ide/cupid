package org.earthsystemcurator.cupid.nuopc.fsml.core;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.EcoreUtils;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.photran.internal.core.lexer.FileOrIFile;
import org.eclipse.photran.internal.core.lexer.Terminal;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTSeparatedListNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
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

	public void forward(FSM rev, FSM forward) {
		this.revMappings = rev.getMappings();
		//astsToReindent.clear();
		Comparison comp = compare(rev.getRoot(), forward.getRoot());
		forwardDiffs(comp.getMatches());
		
		//TODO: brute force do reindenting - optimize
		//perhaps related each mapped node back to its AST
		
		//for (IFortranAST ast : astsToReindent) {
		//	System.out.println("Reindenting: " + ast.getFile().getName());
		//	Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
		//}
		for (Object val : this.revMappings.values()) {
			if (val instanceof IFortranAST) {
				Reindenter.reindent(((IFortranAST) val).getRoot(), (IFortranAST) val, Strategy.REINDENT_EACH_LINE);
			}
		}
	}
	
	/*
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
	*/
	
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
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
			
			//context is one of:  IASTNode, IFortranAST, Set<IFortranAST>
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
		
		Object newFortranElem = null;
		try {
			newFortranElem = method.invoke(this, fortranElem, modelElem, params);
			//System.out.println(methodName + " generated new code: " + newFortranElem);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}				
		
		return newFortranElem;
	}
	
	/*
	private void createMarker(Object elem) {
		if (elem instanceof IASTNode) {
			try {
	        	IASTNode node = (IASTNode) elem;	        	
				
	        	Token firstToken = node.findFirstToken();
	        	Token lastToken = node.findLastToken();
	        	
	        	//if (firstToken == null
	        	 //   || lastToken == null
	             //   || firstToken.getPhysicalFile() == null
	              //  || firstToken.getPhysicalFile().getIFile() == null)
	        	  //  return null;

	        	int startOffset = firstToken.getFileOffset();
	            //startOffset -= token.getWhiteBefore().length();

	            int endOffset = lastToken.getFileOffset() + lastToken.getLength();
	            //endOffset += lastToken.getWhiteAfter().length();
	            
	            //IMarker marker = firstToken.getEnclosingScope().createMarker();
	            //marker.
	            
	            
	            IFile f = findFile(node);
	            if (f != null) {
	            	//"org.earthsystemcurator.cupid.marker"
	            	IMarker marker = f.createMarker(IMarker.BOOKMARK);
	            	marker.setAttribute(IMarker.CHAR_START, startOffset);
	            	marker.setAttribute(IMarker.CHAR_END, endOffset);
	            	marker.setAttribute(IMarker.MESSAGE, "Cupid generated code: " + elem.getClass().getCanonicalName());
	            	marker.setAttribute(IMarker.LOCATION, "Line: " + firstToken.getLine());
	            }
	            
	        }
	        catch (CoreException e) {
	        	e.printStackTrace();
	        }
			
		}
	}
	*/
	
	/**
	 * Find the associated IFile by working up the tree toward the root.
	 * @param newNode
	 * @return
	 */
	/*
	private IFile findFile(IASTNode newNode) {
		while (newNode != null) {
			Token t = newNode.findFirstToken();
			if (t.getPhysicalFile() != null && t.getPhysicalFile().getIFile() != null) {
				return t.getPhysicalFile().getIFile();
			}
			else {
				newNode = newNode.getParent();
			}
		}
		return null;
	}
	*/
	
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
	
	public static IASTNode uses(IFortranAST ast, String renamedEntity, Map<String, Object> params) {
		return uses((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), renamedEntity, params);
	}
	
	public static IASTNode uses(ASTModuleNode module, String renamedEntity, Map<String, Object> params) {
			    	  
		String moduleName = (String) params.get("uses");
		String entityName = (String) params.get("entity");
		
		//determine if there is already a use statement for the module
		Map<String,Object> query = new HashMap<String, Object>();
		query.put("usesModule", moduleName);
		Map<ASTUseStmtNode, ?> results = CodeQuery.usesModule(module, query);
		
		if (results.size() > 0) {
			ASTUseStmtNode addToNode = results.keySet().iterator().next();
			String code = addToNode.toString().trim();
			//if (code.endsWith("\n")) code = code.substring(0, code.length()-1);
			if (addToNode.getOnlyList() == null) {
				code += ", only: ";
			}
			else {
				code += ", ";
			}
			if (!renamedEntity.equals(entityName)) {
				code += renamedEntity + " => " + entityName;
			}
			else {
				code += entityName;
			}
			
			addToNode.replaceWith(code);
			return addToNode;
		}
		else {
			String code = "use " + moduleName + ", only: " + renamedEntity + " => " + entityName;
			ASTUseStmtNode newNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(code);
		
			//find an appropriate location
			IASTListNode<IBodyConstruct> body = (IASTListNode<IBodyConstruct>) module.getBody();
			ASTUseStmtNode usn = body.findLast(ASTUseStmtNode.class);
			if (usn != null) {
				body.insertAfter(usn, newNode);
			}
			else {
				body.add(0, newNode);
			}
			return newNode;
		}
		
		
	}
	
	public static IASTNode usesModule(IFortranAST ast, EObject modelElem, Map<String, Object> params) {
		return usesModule((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), modelElem, params);
	}

	public static IASTNode usesModule(ASTModuleNode module, EObject modelElem, Map<String, Object> params) {
		String moduleName = (String) params.get("usesModule");	
		
		ST code = new ST("\n\nuse <moduleName>, only: <oldName, newName:{o,n|&\n\t<n> => <o>}; separator=\", \">\n");
		code.add("moduleName", moduleName);
		//String code = "use " + moduleName;
				
		//find usesEntity children
		Map<String, Map<String, Object>> entities = findMappedValueStrings("usesEntity", modelElem); 
		//if (entities.size() > 0) {
			
			//code += ", only: ";
			for (Entry<String, Map<String,Object>> entity : entities.entrySet()) {
				String renamedEntity = entity.getKey();
				String entityName = (String) entity.getValue().get("usesEntity");
				code.add("oldName", entityName);
				code.add("newName", renamedEntity);
				//if (!renamedEntity.equals(entityName)) {
				//	code += renamedEntity + " => " + entityName + ", ";
				//}
				//else {
				//	code += entityName + ", ";
				//}
			}
			
		//}
		
		//find an appropriate location
		String renderedCode = code.render();
		ASTUseStmtNode newNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(renderedCode);
		IASTListNode<IBodyConstruct> body = (IASTListNode<IBodyConstruct>) module.getBody();
		ASTUseStmtNode usn = body.findLast(ASTUseStmtNode.class);
		if (usn != null) {
			body.insertAfter(usn, newNode);
		}
		else {
			body.add(0, newNode);
		}
		return newNode;			
	}
	
	
	public static String usesEntityXXX(ASTUseStmtNode usn, String renamedEntity, Map<String, Object> params) {
		String entityName = (String) params.get("usesEntity");
		
		String code = usn.toString().trim();
		//ASTListNode<ASTOnlyNode> aln;
		if (usn.getOnlyList() == null) {
			//usn.setOnlyList(new ASTSeparatedListNode<ASTOnlyNode>());
			code += ", only: ";
		}
		else {
			code += ", ";
		}
		
		//ASTOnlyNode newOnlyNode = new ASTOnlyNode();
		//Token name = new Token(Terminal.T_IDENT, entityName);
		//Token rename = null;
		//newOnlyNode.setName(name);
		
		if (!entityName.equals(renamedEntity)) {
			code += renamedEntity + " => " + entityName;
			//newOnlyNode.replaceWith(renamedEntity + " => " + entityName);
			//Token name = new Token(Terminal.T_IDENT, entityName);
			//newOnlyNode.setName(name);
			//rename = new Token(Terminal.T_IDENT, renamedEntity);
			//newOnlyNode.setIsRenamed(rename);
		}
		else {
		//	newOnlyNode.replaceWith(entityName);
			code += entityName;
		}
		//usn.getOnlyList().add(newOnlyNode);
		
		//if (rename != null) {
		//	return rename.getText();
		//}
		//else {
		//	return name.getText();
		//}
		//ASTUseStmtNode newNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(code);
		
		//if we do a replacement, then the mappings will be off
		//handle this by either:
		// - updating the mappings?
		// - not doing the replacement?
		
		usn.replaceWith(code);
		
		//TODO: fix this return
		return null;
		
	}
	
	

	
	
	//public IFortranAST module(PhotranVPG vpg, EObject modelElem, Map<String, Object> params) {
	public static IFortranAST module(Set<IFortranAST> asts, EObject modelElem, Map<String, Object> params) {
		
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
		
		IProject project = (IProject) params.get("_project");
		IFile fileToAdd = project.getFile(moduleName.toLowerCase() + ".F90");
				
		if (!fileToAdd.exists()) {
			byte[] bytes = code.render().getBytes();
		    //byte[] bytes = "".getBytes();
			
			InputStream source = new ByteArrayInputStream(bytes);
		    try {
		    	//TODO: look at fileToAdd.setContents(...)
				fileToAdd.create(source, IResource.NONE, null);
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
		else {
			//if it already exists, we need to deal with this - do not overwrite existing file...
		}
		
		
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(fileToAdd);
		asts.add(ast);
		
		return ast;
		
		//ASTModuleNode amn = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit(code);
					
	}
	
	/*
	private String coalesce(String...elems) {
		for (String s : elems) {
			if (s != null) return s;
		}
		return null;
	}
	*/
	
	public static IASTNode call(IASTNode context, EObject modelElem, Map<String, Object> params) {		
				
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
		
		ST code = new ST("\ncall <name>(<vars, keys:{v,k|<if(k)><k> = <endif><v>}; separator=\", \">)\n");
		code.add("name", subroutineName);
		code.add("vars", vars);
		code.add("keys", keywords);
				
		System.out.println("Code to parse:\n" + code.render() + "\n");
		
		IBodyConstruct node = CodeExtraction.parseLiteralStatement(code.render());		
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) context;
		ssn.getBody().add(node);
				
		//Reindenter.reindent(node, recentAST, Strategy.REINDENT_EACH_LINE);
		
		return node;
	}	
	
	public static IASTNode subroutine(IFortranAST context, EObject modelElem, Map<String, Object> params) {		
		
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
		
		//System.out.println("Code to parse:\n" + code.render(72) + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render(72));
		
		//assume it is a module for now
		ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
		
		//System.out.println("Offset before: " + amn.findLastToken().getFileOffset());
		
		amn.getModuleBody().add(ssn);
		
		//PhotranVPG.getInstance().commitChangesFromInMemoryASTs(new NullProgressMonitor(), 1, context.getFile());
		//System.out.println("Offset after: " + amn.findLastToken().getFileOffset());
		
		
		//IFortranAST ast2 = PhotranVPG.getInstance().acquireTransientAST(context.getFile());
		//System.out.println("\n===============ast2=============\n\n");
		//System.out.println(ast2.getRoot().toString());
		//System.out.println("\n===============end ast2=============\n\n");		
		
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
	
	private static Map<String, Map<String, Object>> findMappedValueStrings(String mapping, EObject parent) {		
		Map<String, Map<String, Object>> result = new HashMap<String, Map<String,Object>>();
		
		for (EStructuralFeature sf : parent.eClass().getEStructuralFeatures()) {
			String mappingType = Regex.getMappingTypeFromAnnotation(sf);
			Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(sf);
			if (mappingType != null && mappingType.equals(mapping)) {
				result.put((String) parent.eGet(sf), keywordMap);
			}
		}		
		
		return result;		
	}
	
	/*
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
	*/
	
}
