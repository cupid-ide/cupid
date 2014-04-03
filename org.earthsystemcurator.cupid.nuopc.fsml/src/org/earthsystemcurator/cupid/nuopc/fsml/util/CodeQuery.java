package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.FunctionType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.analysis.types.TypeProcessor;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAssignmentStmtNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDerivedTypeStmtNode;
import org.eclipse.photran.internal.core.parser.ASTEntityDeclNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTObjectNameNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTStringConstNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.ASTVisitor;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.vpg.EdgeType;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;

@SuppressWarnings("restriction")
public class CodeQuery {

	////NEW MAPPINGS
	
	//public static <T extends ImplicitContextMapping> Set<ASTCallStmtNode> handleMapping(T icm) {
	//	Class<? extends ImplicitContextMapping> clazz = icm.getClass();
	//	System.out.println("Called version: " + clazz.getCanonicalName());
	//	return null;
	//}
	
	//public static Set<ASTCallStmtNode> handleMapping(Call call) {
	//	System.out.println("Called call version");
	//	return null;
	//}
	
	////END NEW MAPPINGS
	
	public static Pattern P_METAVAR = Pattern.compile("#((\\.\\.|\\w+)/)*\\w+");
	
	public static String moduleName(ASTModuleNode node, Map<String, Object> params) {
		return node.getModuleStmt().getModuleName().getModuleName().getText();
	}
	
	public static String moduleName(IFortranAST ast, Map<String, Object> params) {
		ASTModuleNode node = (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0);
		return moduleName(node, params);
	}
	
	public static String moduleName(ASTUseStmtNode node, Map<String, Object> params) {
		return node.getName().getText();
	}
	
	public static String subroutineName(ASTSubroutineSubprogramNode node, Map<String, Object> params) {
		String subroutineName = (String) params.get("subroutineName");
		if (subroutineName == null) {
			return node.getNameToken().getText();
		}
		else if (subroutineName.equalsIgnoreCase(node.getNameToken().getText())) {
			return node.getNameToken().getText();
		}
		return null;
	}
	
	
	public static boolean matchesParamTypes(ASTSubroutineSubprogramNode node, Type... types) {
		
		int idxType = 0;
		
		if (node.getSubroutineStmt().getSubroutinePars() != null) {
			for (ASTSubroutineParNode spn : node.getSubroutineStmt().getSubroutinePars()) {
				
				List<Definition> defs = spn.getVariableName().resolveBinding();
				if (defs.size() > 0) {
					
					if (types.length > idxType) {
						
						if (!defs.get(0).getType().equals(types[idxType])) {
							return false;
						}
						else {
							idxType++;
						}
						
					}
				}
				else {
					//no definition
					return false;
				}
			}
			
			//have not failed, verify lengths are the same
			if (node.getSubroutineStmt().getSubroutinePars().size() == types.length) {
				return true;
			}
		}
		else if (types.length == 0) {
			return true;				
		}
		return false;
	}
	
	//public static Set<ASTModuleNode> module(IASTNode node, Map<String, Object> params) {
	//	//change later to accept name as parameter
	//	return node.findAll(ASTModuleNode.class);
	//}
	
	public static Set<IFortranAST> module(Set<IFortranAST> asts, Map<String, Object> params) {
	
		Set<IFortranAST> result = new HashSet<IFortranAST>();
		for (IFortranAST astToCheck : asts) {
			if (astToCheck.getRoot() != null &&
				astToCheck.getRoot().getProgramUnitList() != null && 
			    astToCheck.getRoot().getProgramUnitList().size() > 0 &&
			    astToCheck.getRoot().getProgramUnitList().get(0) instanceof ASTModuleNode) {
				result.add(astToCheck);
			}
		}
		
		return result;
	}
	
	
//	public static Set<IFortranAST> module(PhotranVPG vpg, Map<String, Object> params) {
//		Set<IFortranAST> result = new HashSet<IFortranAST>();
//		for (String mod : vpg.listAllModules()) {
//			
//			//TODO: fix this to configure which files to check...
//			if (mod.toLowerCase().startsWith("nuopc")) continue;
//			
//			List<IFile> fl = vpg.findFilesThatExportModule(mod);
//			if (fl.size() != 1) {
//				//TODO
//				System.out.println("Unexpected: zero or multiple files found for module: " + mod);
//			}
//			else {
//				IFile f = fl.get(0);
//				System.out.println("Module: " + mod + " (" + f.getFullPath() + ")");
//				IFortranAST ast = vpg.acquireTransientAST(f);					
//				if (ast == null) {
//					//TODO
//					System.out.println("Warning:  AST not found for file: " + f.getName());
//				}
//				else {
//					result.add(ast);
//				}
//				
//			}
//		}
//		return result;
//	}
	
	
	public static String parseSubroutineSig(String pattern, List<String> intentOut, List<Type> typeOut, List<String> varOut) {
		
		List<String> paramTypes = new ArrayList<String>();
		//List<String> paramIntents = new ArrayList<String>();
		//List<String> paramVars = new ArrayList<String>();
		
		String subroutineName = parseSubroutineSigAsString(pattern, intentOut, paramTypes, varOut);				
		
		//convert strings to Fortran types
		for (String t : paramTypes) {
			if (t.equalsIgnoreCase("integer")) {
				typeOut.add(Type.INTEGER);
			}
			else if (t.equalsIgnoreCase("logical")) {
				typeOut.add(Type.LOGICAL);
			}
			//TODO: FILL IN OTHER TYPES AS NEEDED
			else if (t.startsWith("type(")) {
				typeOut.add(new DerivedType(t.substring(5, t.length()-1)));					
			}
			else {
				throw new RuntimeException("Cannot handle type: " + t);
			}
 				
		}		
		
		return subroutineName;
		
	}
	
	public static Pattern P_SUBROUTINESIG = Pattern.compile("((?:#?\\w+)|(?:\\*))\\(((?:((in|out|inout)\\s+)?(integer|logical|type\\(\\w+\\))(\\s*#?\\w+)?,?\\s*)*)\\)");
	public static Pattern P_SUBROUTINEPARAM = Pattern.compile("((in|out|inout)\\s+)?(integer|logical|type\\(\\w+\\))(\\s*(#?\\w+))?");
	
	public static String parseSubroutineSigAsString(String pattern, List<String> intentOut, List<String> typeOut, List<String> varOut) {
		
		Matcher match = P_SUBROUTINESIG.matcher(pattern);
		
		if (!match.matches()) {
			throw new RuntimeException("Illegal subroutine pattern: " + pattern);
		}
		
		//System.out.println("\n\nSubroutine signature:");
		//for (int i=0; i < match.groupCount(); i++) {
		//	System.out.println("Group (" + i + ") --> " + match.group(i));
		//}
		
		String subroutineName = match.group(1);
		//String[] paramTypes = match.group(2).split("\\s*,\\s*");
		
		Matcher match2 = P_SUBROUTINEPARAM.matcher(match.group(2));
		
		while(match2.find()) {
			//for (int i=0; i <= match2.groupCount(); i++) {
			//	System.out.println("Sub Group (" + i + ") --> " + match2.group(i));
			//}
			if (intentOut != null)	intentOut.add(match2.group(2));
			if (typeOut != null) typeOut.add(match2.group(3));
			if (varOut != null) varOut.add(match2.group(5));
		}
				
		return subroutineName;
		
	}
	
	//public static Set<ASTSubroutineSubprogramNode> subroutine(IFortranAST ast, Map<String, Object> params) {
	//	return subroutine(ast.getRoot().getProgramUnitList().get(0), params);
	//}
	
	public static Map<ASTSubroutineSubprogramNode, Map<String, String>> subroutine(IFortranAST ast, Map<String, Object> params) {
		return subroutine(ast.getRoot().getProgramUnitList().get(0), params);
	}
	
	public static Map<ASTSubroutineSubprogramNode, Map<String, String>> subroutine(IASTNode node, Map<String, Object> params) {
		
		String pattern = (String) params.get("subroutine");
		
		List<Type> types = new ArrayList<Type>();
		List<String> vars = new ArrayList<String>();
		String subroutineName = parseSubroutineSig(pattern, null, types, vars);
		
		Map<ASTSubroutineSubprogramNode, Map<String, String>> result = new LinkedHashMap<ASTSubroutineSubprogramNode, Map<String, String>>();
		
		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
		ssnloop: for (ASTSubroutineSubprogramNode ssn : nodes) {
			
			Map<String, String> metavariableMap = new HashMap<String, String>();
			String sName = ssn.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
			
			if (!subroutineName.equals("*")) {
				//subroutine name is significant
				if (subroutineName.startsWith("#")) {
					//match name and store in metavariable map
					metavariableMap.put(subroutineName, sName);
				}
				else if (!sName.equalsIgnoreCase(subroutineName)) {
					continue ssnloop;
				}
			}
			
			int idxType = 0;
			
			if (ssn.getSubroutineStmt().getSubroutinePars() != null) {
				for (ASTSubroutineParNode spn : ssn.getSubroutineStmt().getSubroutinePars()) {
					
					List<Definition> defs = spn.getVariableName().resolveBinding();
					if (defs.size() > 0) {
						
						if (types.size() > idxType) {
														
							if (!defs.get(0).getType().equals(types.get(idxType))) {
								continue ssnloop;
							}
							else {
								if (vars.get(idxType) != null && vars.get(idxType).startsWith("#")) {
									metavariableMap.put(vars.get(idxType), spn.getVariableName().getText());
								}
								idxType++;
							}
							
						}
												
					}					
				}
				
				//have not failed, verify lengths are the same
				if (ssn.getSubroutineStmt().getSubroutinePars().size() == types.size()) {
					result.put(ssn, metavariableMap);
				}
			}
			else if (types.size() == 0) {
				//no params				
				result.put(ssn, metavariableMap);				
			}
				
			
		}
		
		return result;
	}
	
//	public static Set<ASTSubroutineSubprogramNode> subroutine(IASTNode node, Map<String, Object> params) {
//		
//		String pattern = (String) params.get("subroutine");
//		
//		List<Type> types = new ArrayList<Type>();
//		String subroutineName = parseSubroutineSig(pattern, null, types, null);
//		
//		HashSet<ASTSubroutineSubprogramNode> result = new HashSet<ASTSubroutineSubprogramNode>();
//		
//		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
//		ssnloop: for (ASTSubroutineSubprogramNode ssn : nodes) {
//			
//			if (!subroutineName.equals("*")) {
//				//subroutine name is significant
//				//if (subroutineName.startsWith("#")) {
//				//	
//				//}
//				
//				if (!ssn.getNameToken().getText().equalsIgnoreCase(subroutineName)) {
//					continue ssnloop;
//				}
//			}
//			
//			int idxType = 0;
//			
//			if (ssn.getSubroutineStmt().getSubroutinePars() != null) {
//				for (ASTSubroutineParNode spn : ssn.getSubroutineStmt().getSubroutinePars()) {
//					
//					List<Definition> defs = spn.getVariableName().resolveBinding();
//					if (defs.size() > 0) {
//						
//						if (types.size() > idxType) {
//														
//							if (!defs.get(0).getType().equals(types.get(idxType))) {
//								continue ssnloop;
//							}
//							else {
//								idxType++;
//							}
//							
//						}
//					}					
//				}
//				
//				//have not failed, verify lengths are the same
//				if (ssn.getSubroutineStmt().getSubroutinePars().size() == types.size()) {
//					result.add(ssn);
//				}
//			}
//			else if (types.size() == 0) {
//				//no params				
//				result.add(ssn);				
//			}
//				
//			
//		}
//		
//		return result;
//		
//	}
	
	public static String formalParam(ASTSubroutineSubprogramNode node, Map<String, Object> params) {
		
		
		int idx = (Integer) params.get("formalParam") - 1;
		return node.getSubroutineStmt().getSubroutinePars().get(idx).getVariableName().getText();		
	}
	
	
	public static Map<ASTUseStmtNode, Map<String,String>> usesModule(IFortranAST ast, Map<String, Object> params) {
		return usesModule((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), params);
	}
	
	public static Map<ASTUseStmtNode, Map<String,String>> usesModule(ASTModuleNode node, Map<String, Object> params) {
		String moduleName = (String) params.get("usesModule");
		//String entityName = (String) params.get("entity");
		
		Map<ASTUseStmtNode, Map<String,String>> result = new HashMap<ASTUseStmtNode, Map<String,String>>();		
		
		for (ASTUseStmtNode usn : node.findAll(ASTUseStmtNode.class)) {
			Map<String,String> metavariableMap = new HashMap<String,String>();
			if (moduleName.startsWith("#")) {
				metavariableMap.put(moduleName, usn.getName().getText());				
			}
			else if (!usn.getName().getText().equalsIgnoreCase(moduleName)) {
				continue;
			}
			result.put(usn, metavariableMap);
		}
		
		return result;
	}
	
	public static Set<String> usesEntity(ASTUseStmtNode node, Map<String, Object> params) {
		String entityName = (String) params.get("usesEntity");
		Set<String> result = new HashSet<String>();
		
		//TODO: this requires an explicit only list and does not look into the imported module
		//itself to determine what public entities are imported
		if (node.getOnlyList() != null) {
			for (ASTOnlyNode only : node.getOnlyList()) {
				if (entityName != null && entityName.length() > 0 && !only.getName().getText().equalsIgnoreCase(entityName)) {
					continue;
				}
				else {
					if (only.getNewName() != null) {
						result.add(only.getNewName().getText());
					}
					else {
						result.add(entityName);
					}
				}
			}
		}
		
		return result;
	}
	
	
	public static Token uses(IFortranAST ast, Map<String, Object> params) {
		return uses((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), params);
	}
	
	public static Token uses(ASTModuleNode node, Map<String, Object> params) {
		
		String moduleName = (String) params.get("uses");
		String entityName = (String) params.get("entity");
		
		for (ASTUseStmtNode usn : node.findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase(moduleName)) {
				for (ASTOnlyNode only : usn.getOnlyList()) {
					if (only.getName().getText().equalsIgnoreCase(entityName)) {
						if (only.getNewName() != null) {
							return only.getNewName();
						}
						else {
							return only.getName();
						}
					}
				}
				//TODO: if we get here, the entity might still be imported, 
				//just not listed in the only clause
			}
		}
		
		return null;
		
	}
	
	
	
	//recusively follows BINDING and RENAME edges until the parent AST node of the token has the type clazz
	@SuppressWarnings("unchecked")
	public static <NodeType extends ASTNode> NodeType followOutgoingTo(PhotranTokenRef ptr, Class<NodeType> clazz) {		
		for (PhotranTokenRef ptr2 : ptr.followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
			Token t = ptr2.findToken();
			if (t.getParent().getClass() == clazz) {
				return (NodeType) t.getParent();
			}		
			else {
				NodeType x =  followOutgoingTo(ptr2, clazz);
				if (x!=null) {
					return x;
				}				
			}
		}
		for (PhotranTokenRef ptr2 : ptr.followOutgoing(EdgeType.RENAMED_BINDING_EDGE_TYPE)) {
			Token t = ptr2.findToken();
			if (t.getParent().getClass() == clazz) {
				return (NodeType) t.getParent();
			}		
			else {
				NodeType x =  followOutgoingTo(ptr2, clazz);
				if (x!=null) {
					return x;
				}				
			}
		}
		
		return null;
	}
	
	//returns true if the variable with the given name appears 
	//on the LHS of an assignment within the given scope
	public static boolean assigns(ScopingNode node, Map<String, Object> params) {
		
		String varName = (String) params.get("assigns");
		
		for (ASTAssignmentStmtNode asn : node.findAll(ASTAssignmentStmtNode.class)) {
			if (asn.getLhsVariable().getName().getText().equalsIgnoreCase(varName)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static Set<String> localVariable(ScopingNode node, Map<String, Object> params) {
		
		//TODO:  this does not handle derived types that a renamed module entities
		
		Set<String> result = new HashSet<String>();
		
		final String varType = ((String) params.get("localVariable")).toLowerCase();
		final String definedInModule = ((String) params.get("definedInModule")).toLowerCase();
		
		//System.out.println("searching "  + node.getName() + " for localVariable type: " + varType);

		//for (PhotranTokenRef ptr : node.getRepresentativeToken().followIncoming(EdgeType.DEFINED_IN_SCOPE_EDGE_TYPE)) {
    	//	Token t = ptr.findToken()
    	//	System.out.println("\tDEFINED IN SCOPE: " + t);
		//}

		
		//current searching for local type declaration statements
		//there might be module-level variables referenced, which would not be picked up
		Set<ASTTypeDeclarationStmtNode> nodes = node.findAll(ASTTypeDeclarationStmtNode.class);
		for (ASTTypeDeclarationStmtNode n : nodes) {
					
			boolean toAdd = false;
		
			if (varType.equalsIgnoreCase("integer") && n.getTypeSpec().isInteger() || 
				varType.equalsIgnoreCase("character") && n.getTypeSpec().isCharacter() ||
				varType.equalsIgnoreCase("logical") && n.getTypeSpec().isLogical() ||
				varType.equalsIgnoreCase("real") && n.getTypeSpec().isReal() ||
				varType.equalsIgnoreCase("double") && n.getTypeSpec().isDouble()) {
				//TODO: add other built-in types as needed
				toAdd = true;
			}
			else if (varType.startsWith("type(") && n.getTypeSpec().isDerivedType()) {
				
				//this type name could be a renamed module entity
				//System.out.println("\tfound declaration: " + n.getTypeSpec().getTypeName());
				//System.out.println("\tfound def: " + def);
				
				PhotranTokenRef ptr = n.getTypeSpec().getTypeName().getTokenRef();
				
				ASTDerivedTypeStmtNode dtsn = followOutgoingTo(ptr, ASTDerivedTypeStmtNode.class);
				if (dtsn != null) {
					if (("type(" + dtsn.getTypeName().getText() + ")").equalsIgnoreCase(varType)) {
						//System.out.println("dtsn = " + dtsn);
						if (definedInModule != null) {
							ScopingNode sn = dtsn.getTypeName().getEnclosingScope();
							if (sn.isModule()) {
								if (((ASTModuleNode) sn).getName().equalsIgnoreCase(definedInModule)) {
									toAdd = true;
								}
							}
							else {
								throw new RuntimeException("Expecting module as scoping node....");
							}
						}
						else {	
							toAdd = true;
						}
					}
				}
				else {
					//throw new RuntimeException("Could not find derived type statement for: " + ptr.findToken());
				}
				
				/*
				for (PhotranTokenRef defPtr : ptr.followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
					Token tkn = defPtr.findToken();
					if (tkn.getParent() instanceof ASTDerivedTypeStmtNode) {
						ASTDerivedTypeStmtNode dtsn = (ASTDerivedTypeStmtNode) tkn.getParent();
						dtsn.getTypeName()
					}
					
					System.out.println("BINDING_EDGE_TYPE: " + ptr2);
					//binding edge is: 
					// - newName token of ASTOnlyNode
					// - typeName token of ASTDrivedTypeStmtNode
					
				}
				for (PhotranTokenRef ptr2 : ptr1.followOutgoing(EdgeType.IMPORTED_INTO_SCOPE_EDGE_TYPE)) {
					Token t = ptr2.findToken();
					System.out.println("IMPORTED_INTO_SCOPE_EDGE_TYPE: " + ptr2);
				}
				for (PhotranTokenRef ptr2 : ptr1.followOutgoing(EdgeType.RENAMED_BINDING_EDGE_TYPE)) {
					Token t = ptr2.findToken();
					System.out.println("RENAMED_BINDING_EDGE_TYPE: " + ptr2);
				}				
				*/
				
				//this will look in local scope and then parent scopes recursively
				/*
				List<PhotranTokenRef> ptrs = node.manuallyResolve(n.getTypeSpec().getTypeName());
				for (PhotranTokenRef ptr : ptrs) {
					
					for (PhotranTokenRef ptr2 : ptr.followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
						System.out.println("BINDING_EDGE_TYPE: " + ptr2);
					}
					for (PhotranTokenRef ptr2 : ptr.followOutgoing(EdgeType.IMPORTED_INTO_SCOPE_EDGE_TYPE)) {
						System.out.println("IMPORTED_INTO_SCOPE_EDGE_TYPE: " + ptr2);
					}
					for (PhotranTokenRef ptr2 : ptr.followOutgoing(EdgeType.RENAMED_BINDING_EDGE_TYPE)) {
						Token t = ptr2.findToken();
						System.out.println("RENAMED_BINDING_EDGE_TYPE: " + ptr2);
						//typeName of ASTDerivedTypeStmtNode
					}
					*/
				
					/*
					Token t = ptr.findToken();
					System.out.println("\t\t--> ftr = " + t);
					List<Definition> defs = t.resolveBinding();
					for (Definition d : defs) {
						Definition d2 = findDefinitionOfRenamedModuleEntity(n.findNearestAncestor(ASTModuleNode.class), d);
						//d.findAllReferences(true);
						System.out.println("\t\t\t--> d: "+ d);
						System.out.println("\t\t\t--> d2: "+ d2);
					}
					*/
					
					//System.out.println("\t\t----> " + ftr.findToken())
				}
												
				// if we found the type, then add it
				if (toAdd) {
					//result.add(def.getDeclaredName());
					for (ASTEntityDeclNode decl : n.getEntityDeclList()) {
						result.add(decl.getObjectName().getObjectName().getText());
					}
				}
				
			}
		
		
		
		
		
		  
		 //this approach fails because def.getType() does not resolve
		 //the type all the way back to the declaring module (e.g., in the
		 //case of renamed module entities)
		/*
		List<Definition> defs = node.getAllDefinitions();
		for (Definition def : defs) {
			
			
			System.out.println("\tlocal def: " + def);
			if (def.isLocalVariable() && def.getType() != null) {
								
				System.out.println(def.isRenamedModuleEntity());
				System.out.println(def.getTokenRef().findToken());
				
				boolean found = def.getType().processUsing(new TypeProcessor<Boolean>() {
					
					@Override
					public Boolean ifDerivedType(String derivedTypeName,
							DerivedType type) {
						
						System.out.println("\t\tderivedTypeName = " + derivedTypeName);
						System.out.println("\t\tType = " + type);						
	
						return false;
					}
					
					@Override
					public Boolean ifUnknown(Type type) {
						return false;
					}
					
					@Override
					public Boolean ifInteger(Type type) {
						return varType.equalsIgnoreCase("integer");
					}
					
				});
				if (found) {
					result.add(def.getDeclaredName());
				}
			}
		}
		*/
		
		return result;
	}
	
	public static Set<ASTSubroutineSubprogramNode> findSubroutineByParamTypes(IASTNode node, String... stypes) {
		Type[] types = new Type[stypes.length];
		
		for (int i=0; i<stypes.length; i++) {
			if (stypes[i].equalsIgnoreCase("integer")) {
				types[i] = Type.INTEGER;
			}
			//FILL IN OTHER TYPES
			else {
				types[i] = new DerivedType(stypes[i]);
			}
 				
		}
		return findSubroutineByParamTypes(node, types);
	}
	
	public static Set<ASTSubroutineSubprogramNode> findSubroutineByParamTypes(IASTNode node, Type... types) {
		
		//System.out.println("findSubroutineByParamTypes:");
		
		HashSet<ASTSubroutineSubprogramNode> result = new HashSet<ASTSubroutineSubprogramNode>();
		
		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
		ssnloop: for (ASTSubroutineSubprogramNode ssn : nodes) {
			
			int idxType = 0;
			
			if (ssn.getSubroutineStmt().getSubroutinePars() != null) {
				for (ASTSubroutineParNode spn : ssn.getSubroutineStmt().getSubroutinePars()) {
					
					List<Definition> defs = spn.getVariableName().resolveBinding();
					if (defs.size() > 0) {
						
						if (types.length > idxType) {
							
							if (!defs.get(0).getType().equals(types[idxType])) {
								continue ssnloop;
							}
							else {
								idxType++;
							}
							
						}
					}					
				}
				
				//have not failed, verify lengths are the same
				if (ssn.getSubroutineStmt().getSubroutinePars().size() == types.length) {
					result.add(ssn);
				}
			}
			else if (types.length == 0) {
				//no params				
				result.add(ssn);				
			}
				
			
		}
		
		
		return result;
	}
	
	public static ASTSubroutineSubprogramNode findSubroutineByName(IASTNode node, String name) {
					
		for (ASTSubroutineSubprogramNode ssn : node.findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getNameToken().getText().equalsIgnoreCase(name))
				return ssn;
		}
			
		return null;
	}
	
	
	protected static String propagateValOrSymbol(IExpr expr) {
		
		if (expr instanceof ASTVarOrFnRefNode) {
			
			ASTVarOrFnRefNode vofrn = (ASTVarOrFnRefNode) expr;			
			
			//attempt to propagate constant	from initializer		
			ASTObjectNameNode onn = followOutgoingTo(vofrn.getName().getName().getTokenRef(), ASTObjectNameNode.class);
			if (onn != null) {
				final String[] constVal = {null};
				onn.getParent().accept(new ASTVisitor() {
					@Override
					public void visitASTStringConstNode(ASTStringConstNode node) {
						constVal[0] = node.getStringConst().getText();						
					}
					@Override
					public void visitASTIntConstNode(ASTIntConstNode node) {
						constVal[0] = node.getIntConst().getText();
					}
					//TODO: override for other kinds of constants
				});
				
				if (constVal[0] != null) {
					return constVal[0].trim();
				}
				else {
					return onn.getObjectName().getText().trim();
				}
								
			}
			
		}
		
		return expr.toString().trim();
		
	}
	
	public static String argByKeyword(ASTCallStmtNode node, Map<String, Object> params) {
		String keyword = (String) params.get("argByKeyword");	
		for (ASTSubroutineArgNode san : node.getArgList()) {
			if (san.getName() != null && san.getName().getText().equalsIgnoreCase(keyword)) {
				//TODO: make consistent wrt constant propagation
				return propagateValOrSymbol(san.getExpr());						
			}
		}		
		return null;
	}
	
	public static String argByIndex(ASTCallStmtNode node, Map<String, Object> params) {			
		int idx = (Integer) params.get("argByIndex");
		if (node.getArgList() == null || idx > node.getArgList().size()) {
			return null;
		}
		else {
			//TODO: make consistent wrt constant propagation
			return propagateValOrSymbol(node.getArgList().get(idx - 1).getExpr());
		}
	}
	
	
	//old ones
	public static Pattern P_CALLSIG = Pattern.compile("(#?(?:(?:\\.\\.|\\w+)/)*\\w+|(?:\\*))(\\(((?:((\\w+)\\??\\s*=\\s*)?(\\s*((?:#(?:../)*)?\\w+))?,?\\s*)*)\\))?");	
	public static Pattern P_CALLARG = Pattern.compile("((\\w+\\??)\\s*=\\s*)?((?:#(?:../)*)?\\w+)");
	
	//new ones
	//public static Pattern P_CALLSIG = Pattern.compile("(#?(?:(?:\\.\\.|\\w+)/)*\\w+|(?:\\*))(\\(((?:((\\w+)\\??\\s*=\\s*)?(\\s*((?:#(?:(?:\\.\\.|\\w+))?/)*\\w+))?,?\\s*)*)\\))?");
	//public static Pattern P_CALLARG = Pattern.compile("((\\w+\\??)\\s*=\\s*)?((?:#(?:(?:\\.\\.|\\w+)/)*)?\\w+)");
	
		
	//out[0] --> list of vars (may be null)
	//out[1] --> list of keywords (may be null)
	public static String parseCallSig(String callSig, List<String> out[]) {
		
		Matcher match = P_CALLSIG.matcher(callSig);
		
		if (!match.matches()) {
			throw new RuntimeException("Illegal call signature pattern: " + callSig);
		}
		
//		for (int i = 0; i <= match.groupCount(); i++) {
//			System.out.println("Group (" + i + ") --> " + match.group(i));
//		}
//		Group (0) --> ESMF_MethodAdd(#gcomp, #label, #userRoutine)
//		Group (1) --> ESMF_MethodAdd
//		Group (2) --> (#gcomp, #label, #userRoutine)
//		Group (3) --> #gcomp, #label, #userRoutine
//		Group (4) --> null
//		Group (5) --> null
//		Group (6) --> #userRoutine
//		Group (7) --> #userRoutine
		
		String subroutineName = match.group(1);
					
		//if group 2 is null, then no argument pattern is specified
		//so accept any number of arguments
		if (match.group(2) != null) {
			
			Matcher argMatcher = P_CALLARG.matcher(match.group(3));
		
			out[0] = new ArrayList<String>();
			out[1] = new ArrayList<String>();
				
			while (argMatcher.find()) {
				//for (int i = 0; i <= argMatcher.groupCount(); i++) {
				//	System.out.println("argMatcher Group (" + i + ") --> " + argMatcher.group(i));
				//}
				out[1].add(argMatcher.group(2));
				out[0].add(argMatcher.group(3));
			}
		}
		
		return subroutineName;
		
	}
	
		
	
	public static Map<ASTCallStmtNode, Map<String,String>> call(IASTNode node, Map<String, Object> params) {
			
		String callSig = (String) params.get("call");
		
		List<String> vars = null;
		List<String> keywords = null;		
		@SuppressWarnings("unchecked")
		List<String> varsAndKeywords[] = new List[] {null, null};
		
		final String subroutineName = parseCallSig(callSig, varsAndKeywords);
		vars = varsAndKeywords[0];
		keywords = varsAndKeywords[1];
		
		Map<ASTCallStmtNode, Map<String,String>> result = new HashMap<ASTCallStmtNode, Map<String, String>>();
		
		csnloop : for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			final Map<String,String> metavariableMap = new HashMap<String, String>();			
			
			//System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
			//TODO: decide the semantics of this code query
			//does it check for the literal name provided or does it try to resolve?
			//could introduce two different queries:
			// call: "NUOPC_Blah()" --> resolves NUOPC_Blah as far as possible
			// callLiteral: "NUOPC_Blah()" --> looks for NUOPC_Blah in the code
			
			/*
			List<Definition> defs = csn.getSubroutineName().resolveBinding();
			
			//find name before rename
			if (defs.size() > 0) {
				
				//defs.get(0).getTokenRef().
				boolean found = defs.get(0).getType().processUsing(new TypeProcessor<Boolean>() {
					@Override
					public Boolean ifFunctionType(String name, FunctionType functionType) {
						//System.out.println("\tExamining function: " + name);
						if (subroutineName.equals("*")) {
							return true;
						}
						else if (subroutineName.startsWith("#")) {
							//match name as metavariable
							metavariableMap.put(subroutineName, name);
						}
						else if (name.equalsIgnoreCase(subroutineName)) {
							return true;							
						}
						return false;
					}
				});				
				
				if (!found) {
					continue;
				}
			}
			*/
			// no definition - just check for match
			if (subroutineName.startsWith("#.")) {
				//TODO: assuming we can only populate direct attributes (not parents)
				//could also use the semantic that only non-mapped attributes (i.e.,
				//no mapping annotation present) can be populated
				//
				//dealing with this is somewhat complex because all of the nodes
				//in the path expression may not exist--so their mappings would
				//have to be verified some how
				continue;
			}
			if (subroutineName.startsWith("#")) {
				metavariableMap.put(subroutineName, csn.getSubroutineName().getText().trim());
			}
			else if (!subroutineName.equals("*") && !csn.getSubroutineName().getText().trim().equalsIgnoreCase(subroutineName)) {
				//System.out.println("\tNo defs found, comparing subroutine names");
				continue;
			}
			
			
			//deal with arguments now
			if (vars != null) {
				
				varloop: for (int i = 0; i < keywords.size(); i++) {
					
					ASTSubroutineArgNode san;
					
					if (keywords.get(i) == null) {
						//match by index						
						if (csn.getArgList().size() <= i) {
							continue csnloop;
						}
						
						san = csn.getArgList().get(i);
					}
					else {
						//match by keyword
						san = findArgByKeyword(keywords.get(i), csn.getArgList());						
					}
					
					if (san == null) {
						if (keywords.get(i).endsWith("?")) {
							//optional argument not present, so ignore it
							continue varloop;
						}
						else {
							continue csnloop;
						}
					}
					else if (vars.get(i).startsWith("#")) {
						//TODO: need to determine semantics for how far to resolve variables
						//for now, just use textual value of expression
						//metavariableMap.put(vars.get(i), propagateValOrSymbol(san.getExpr()));		
						metavariableMap.put(vars.get(i), san.getExpr().toString().trim());	
					}
					else if (!san.getExpr().toString().equalsIgnoreCase(vars.get(i))) {
						continue csnloop;
					}
					
					
				}
				
				/*
				//if (vars.size() != csn.getArgList().size()) continue;				
				for (int i = 0; i < csn.getArgList().size(); i++) {
					ASTSubroutineArgNode san = csn.getArgList().get(i);
					if (keywords.get(i) != null && (san.getName() == null || !san.getName().getText().equalsIgnoreCase(keywords.get(i)))) {
						continue csnloop;
					}
					else if (vars.get(i).startsWith("#")) {
						//TODO: need to determine semantics for how far to resolve variables
						//for now, just use textual value of expression
						//metavariableMap.put(vars.get(i), propagateValOrSymbol(san.getExpr()));						
						metavariableMap.put(vars.get(i), san.getExpr().toString());						
					}
					//else if (!propagateValOrSymbol(san.getExpr()).equalsIgnoreCase(vars.get(i))) {
					else if (!san.getExpr().toString().equalsIgnoreCase(vars.get(i))) {
					//	var is a literal and did not match
						continue csnloop;						
					}
				}
				*/
				
			}
			
			//everything matched, so add to result
			result.put(csn, metavariableMap);
		}
		return result;
	}
	
	
	
	
	public static ASTSubroutineArgNode findArgByKeyword(String keyword, IASTListNode<ASTSubroutineArgNode> argList) {
		if (keyword.endsWith("?")) keyword = keyword.substring(0, keyword.length()-1);
		for (ASTSubroutineArgNode san : argList) {
			if (san.getName() != null && san.getName().getText().equalsIgnoreCase(keyword)) {
				return san;
			}
		}
		return null;
	}
	
	public static boolean calls(IASTNode node, Map<String, Object> params) {
		
		final String subroutineName = (String) params.get("calls");
		final String definedInModule = (String) params.get("definedInModule");
		
		//if (subroutineName.equals("routine_SetServices") && definedInModule != null && definedInModule.equals("NUOPC_DriverAtmOcn")) {
		//	System.out.println("\there");
		//}
		
		for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			//System.out.println("Calls Examining subroutine: " + csn.getSubroutineName()); 
			//if (csn.getSubroutineName().getText().equalsIgnoreCase("NUOPC_RunSequenceDeallocate")) {
			//	System.out.println("\there");
			//}
			List<Definition> defs = csn.getSubroutineName().resolveBinding();
						
			//find name before rename
			if (defs.size() > 0) {
				
				//defs.get(0).getTokenRef().
				//if (defs.get(0).getType() == null) {
				//	throw new RuntimeException("calls: Definition Type is null");					
				//}
				
				boolean found = defs.get(0).getType().processUsing(new TypeProcessor<Boolean>() {
					
					@Override
					public Boolean ifFunctionType(String name, FunctionType functionType) {
						//System.out.println("\tExamining function: " + name);
						if (name != null && name.equalsIgnoreCase(subroutineName)) {							
							return true;							
						}
						return false;
					}
					
					@Override
					public Boolean ifUnknown(Type type) {						
						//this could be a Fortran interface -- TODO: deal with it, need to dig deeper to find actual type
						return false;
					}
					
				});				
				
				if (found) {
					//at least name matches, see if module name matches
					if (definedInModule != null) {
						//System.out.println("\tChecking module name for subroutine: " + subroutineName);
						Definition def = defs.get(0);
						ASTUseStmtNode usn = null;
						if (def.isRenamedModuleEntity()) {
							usn = def.getTokenRef().findToken().findNearestAncestor(ASTUseStmtNode.class);
							if (usn.getName().getText().equalsIgnoreCase(definedInModule)) {
								return true;
							}
							else {
								return false;
							}
						}
						else {
							throw new RuntimeException("calls - definedInModule");
						}
					}
					else {
						return true;
					}
				}
			}
			// no definition - just check for match
			else {
				
				//System.out.println("No defs found for: " + subroutineName);
				
				//List<PhotranTokenRef> trefs = csn.getSubroutineName().manuallyResolveBinding();
				//for (PhotranTokenRef tf : trefs) {
				//	System.out.println("\tToken Ref: " + tf.findToken());
				//}				
				
				if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
			
					//System.out.println("\tNo defs found, comparing subroutine names");
					return true;
				}
			}
			
		}
		return false;
	}
	
	public static Set<ASTCallStmtNode> getCallStatement(IASTNode node, final String subroutineName) {
		
		Set<ASTCallStmtNode> ret = new HashSet<ASTCallStmtNode>();
		
		for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			//System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
			List<Definition> defs = csn.getSubroutineName().resolveBinding();
			
			//find name before rename
			if (defs.size() > 0) {
				
				boolean found = defs.get(0).getType().processUsing(new TypeProcessor<Boolean>() {
					@Override
					public Boolean ifFunctionType(String name, FunctionType functionType) {
						if (name.equalsIgnoreCase(subroutineName)) {
							return true;							
						}						
						return false;
					}
				});				
				
				if (found) ret.add(csn);
			}
			// no definition - just check for match
			else if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
				ret.add(csn);
			}
			
		}
		return ret;
	}
	
	/*
	 *  TODO: This should be improved to qualify the subroutine name with the module name
	 */
	public static Set<ASTSubroutineSubprogramNode> findSubroutineWithCall(IASTNode node, final String subroutineName) {
		final HashSet<ASTSubroutineSubprogramNode> result = new HashSet<ASTSubroutineSubprogramNode>();
						
		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
		
		for (final ASTSubroutineSubprogramNode ssn : nodes) {
			for (ASTCallStmtNode csn : ssn.findAll(ASTCallStmtNode.class)) {
				
				//System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
				List<Definition> defs = csn.getSubroutineName().resolveBinding();
				
				//find name before rename
				if (defs.size() > 0) {
					
					defs.get(0).getType().processUsing(new TypeProcessor<Object>() {
						@Override
						public String ifFunctionType(String name, FunctionType functionType) {
							if (name.equalsIgnoreCase(subroutineName)) {
								result.add(ssn);								
							}
							return null;
						}
					});
										
				}
				// no definition - just check for match
				else if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
					result.add(ssn);		
				}
				
			}
		}
				
		return result;
	}
	
	//testing
	//public static void main(String[] args) {
	//	CodeQuery.subroutine(null, "setServices(logical,integer)");
	//	CodeQuery.subroutine(null, "*(logical,integer,type(blah))");
	//	CodeQuery.subroutine(null, "setServices()");
	//}
	
	
}
