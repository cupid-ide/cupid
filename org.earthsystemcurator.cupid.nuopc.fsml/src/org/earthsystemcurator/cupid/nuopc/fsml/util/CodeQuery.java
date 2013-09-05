package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.FunctionType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.analysis.types.TypeProcessor;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDerivedTypeStmtNode;
import org.eclipse.photran.internal.core.parser.ASTEntityDeclNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.vpg.EdgeType;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class CodeQuery {

	public static String moduleName(ASTModuleNode node) {
		return node.getModuleStmt().getModuleName().getModuleName().getText();
	}
	
	public static String subroutineName(ASTSubroutineSubprogramNode node) {
		return node.getNameToken().getText();		
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
	
	public static Set<ASTModuleNode> module(IASTNode node, Map<String, Object> params) {
		//change later to accept name as parameter
		return node.findAll(ASTModuleNode.class);
	}
	
	
	public static Set<ASTSubroutineSubprogramNode> subroutine(IASTNode node, Map<String, Object> params) {
		
		String pattern = (String) params.get("subroutine");
		//System.out.println("subroutine: " + pattern);
		
		Pattern p = Pattern.compile("((?:\\w+)|(?:\\*))\\(((?:(integer|logical|type\\(\\w+\\)),?\\s*)*)\\)");
		Matcher match = p.matcher(pattern);
		
		if (!match.matches()) {
			throw new RuntimeException("Illegal subroutine pattern: " + pattern);
		}
		
		//for (int i=0; i <= match.groupCount(); i++) {
		//	System.out.println("Group: " + match.group(i));
		//}
		
		String subroutineName = match.group(1);
		String[] paramTypes = match.group(2).split("\\s*,\\s*");
		
		//for (int i=0; i < paramTypes.length; i++) {
		//	System.out.println("Param = " + paramTypes[i]);
		//}
		
		Type[] types = new Type[paramTypes.length];
		
		for (int i=0; i < paramTypes.length; i++) {
			if (paramTypes[i].equalsIgnoreCase("integer")) {
				types[i] = Type.INTEGER;
			}
			else if (paramTypes[i].equalsIgnoreCase("logical")) {
				types[i] = Type.LOGICAL;
			}
			//TODO: FILL IN OTHER TYPES AS NEEDED
			else if (paramTypes[i].startsWith("type(")) {
				types[i] = new DerivedType(paramTypes[i].substring(5, paramTypes[i].length()-1));				
			}
			else {
				throw new RuntimeException("Cannot handle type: " + paramTypes[i]);
			}
 				
		}
		
		
		HashSet<ASTSubroutineSubprogramNode> result = new HashSet<ASTSubroutineSubprogramNode>();
		
		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
		ssnloop: for (ASTSubroutineSubprogramNode ssn : nodes) {
			
			if (!subroutineName.equals("*")) {
				if (!ssn.getNameToken().getText().equalsIgnoreCase(subroutineName)) {
					continue ssnloop;
				}
			}
			
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
	
	public static String formalParam(ASTSubroutineSubprogramNode node, Map<String, Object> params) {
		
		
		int idx = (Integer) params.get("formalParam") - 1;
		return node.getSubroutineStmt().getSubroutinePars().get(idx).getVariableName().getText();		
	}
	
	
	public static String uses(ASTModuleNode node, Map<String, Object> params) {
		
		String moduleName = (String) params.get("uses");
		String entityName = (String) params.get("entity");
		
		for (ASTUseStmtNode usn : node.findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase(moduleName)) {
				for (ASTOnlyNode only : usn.getOnlyList()) {
					if (only.getName().getText().equalsIgnoreCase(entityName)) {
						if (only.getNewName() != null) {
							return only.getNewName().getText();
						}
						else {
							return entityName;
						}
					}
				}
			}			
		}
		
		return null;
		
	}
	
	public static Definition findDefinitionOfRenamedModuleEntity(ASTModuleNode node, Definition def) {
		
		for (ASTUseStmtNode usn : node.findAll(ASTUseStmtNode.class)) {
			if (usn.getOnlyList() != null) {
				for (ASTOnlyNode on : usn.getOnlyList()) {				
					if (on.getNewName() != null && on.getNewName().getText().equalsIgnoreCase(def.getCanonicalizedName())) {
						//this is the renamed entity
						//for (PhotranTokenRef ptr : on.getName().getTokenRef().followOutgoing(EdgeType.IMPORTED_INTO_SCOPE_EDGE_TYPE)) {
						//	System.out.println("EDGE imported: " + ptr.findToken());
						//}
						for (PhotranTokenRef ptr : on.getName().getTokenRef().followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
							Token t = ptr.findToken();
							Definition d = PhotranVPG.getInstance().getDefinitionFor(ptr);
							System.out.println("Definition = " + d);
							//System.out.println("EDGE binding: " + ptr.findToken());
						}
						
						//Definition d = PhotranVPG.getInstance().getDefinitionFor(ptr);
						//return d;
						//for (Definition d : PhotranVPG.getInstance().getModuleSymbolTable(usn.getName().getText())) {
						//	if (d.getCanonicalizedName().equals(on.getName().getText().toLowerCase())) {
						//		return d;
						//	}
						//}
					}
				}
			}
		}
		
		return null;
		
	}
	
	//recusively follows BINDING and RENAME edges until the parent AST node of the token has the type clazz
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
	
	public static Set<String> localVariable(ScopingNode node, Map<String, Object> params) {
		
		//TODO:  this does not handle derived types that a renamed module entities
		
		Set<String> result = new HashSet<String>();
		
		final String varType = ((String) params.get("localVariable")).toLowerCase();
		final String definedInModule = ((String) params.get("definedInModule")).toLowerCase();
		
		System.out.println("searching "  + node.getName() + " for localVariable type: " + varType);
				
		//Set<ASTTypeDeclarationStmtNode> nodes = node.findAll(ASTTypeDeclarationStmtNode.class);
		//for (ASTTypeDeclarationStmtNode n : nodes) {
		
		for (final Definition def : node.getAllDefinitions()) {
					
			boolean toAdd = false;
		
			//if (varType.equals("integer") || varType.equals("character") || 
			//	varType.equals("logical") || varType.equals("real") || 
			//	varType.equals("double precision")) {
			
			if (true) {
				
				//intrinsic type
				//if (def.isIntrinsic()) {
					
					toAdd = def.getType().processUsing(new TypeProcessor<Boolean>() {
						
						@Override
						public Boolean ifDerivedType(String derivedTypeName, DerivedType type) {
							if (varType.startsWith("type(")) {
								
								
								//START HERE - definition approach is not working - revert?
								Set<PhotranTokenRef> ptrs = def.findAllReferences(false);
								for (PhotranTokenRef ptr : ptrs) {
									Token t = ptr.findToken();
									System.out.println("ptr = " + t);
								}
								
								PhotranTokenRef ptr = def.getTokenRef();
								ASTDerivedTypeStmtNode dtsn = followOutgoingTo(ptr, ASTDerivedTypeStmtNode.class);
								if (dtsn != null && ("type(" + dtsn.getTypeName().getText() + ")").equalsIgnoreCase(varType)) {
									System.out.println("dtsn = " + dtsn);
									if (definedInModule != null) {
										ScopingNode sn = dtsn.getTypeName().getEnclosingScope();
										if (sn.isModule()) {
											if (((ASTModuleNode) sn).getName().equalsIgnoreCase(definedInModule)) {
												return true;
											}
										}
										else {
											throw new RuntimeException("Expecting module as scoping node....");
										}
									}
									else {	
										return true;
									}
								}
								
								
							}
							
							return false;
						}
						
						@Override
						public Boolean ifInteger(Type type) {
							return varType.equals("integer");
						}
						
						@Override
						public Boolean ifCharacter(Type type) {
							return varType.equals("character");
						}
						
						@Override
						public Boolean ifLogical(Type type) {
							return varType.equals("logical");
						}
						
						@Override
						public Boolean ifReal(Type type) {
							return varType.equals("real");
						}
						
						@Override
						public Boolean ifDoublePrecision(Type type) {
							return varType.equals("double precision");
						}
						
					});
				//}
				
			} // end if check for instrinsic
				
			
			//if (varType.equalsIgnoreCase("integer") && n.getTypeSpec().isInteger() || 
			//	varType.equalsIgnoreCase("character") && n.getTypeSpec().isCharacter() ||
			//	varType.equalsIgnoreCase("logical") && n.getTypeSpec().isLogical() ||
			//	varType.equalsIgnoreCase("real") && n.getTypeSpec().isReal() ||
			//	varType.equalsIgnoreCase("double") && n.getTypeSpec().isDouble()) {
			//	//TODO: add other built-in types as needed
			//	toAdd = true;
			//}
			else if (varType.startsWith("type(") && def.isDerivedType()) {
				
				//this type name could be a renamed module entity
				//System.out.println("\tfound declaration: " + n.getTypeSpec().getTypeName());
				System.out.println("\tfound def: " + def);
				
				//PhotranTokenRef ptr = n.getTypeSpec().getTypeName().getTokenRef();
				PhotranTokenRef ptr = def.getTokenRef();				
				
				ASTDerivedTypeStmtNode dtsn = followOutgoingTo(ptr, ASTDerivedTypeStmtNode.class);
				if (dtsn != null && ("type(" + dtsn.getTypeName().getText() + ")").equalsIgnoreCase(varType)) {
					System.out.println("dtsn = " + dtsn);
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
					result.add(def.getDeclaredName());
					//for (ASTEntityDeclNode decl : n.getEntityDeclList()) {
					//	result.add(decl.getObjectName().getObjectName().getText());
					//}
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
	
	
	public static String argByKeyword(ASTCallStmtNode node, Map<String, Object> params) {
		
		String keyword = (String) params.get("argByKeyword");
		
		for (ASTSubroutineArgNode san : node.getArgList()) {
			if (san.getName() != null && san.getName().getText().equalsIgnoreCase(keyword)) {
				//if (san.getExpr() instanceof ASTStringConstNode) {
				//	
				//}
				//TODO handle different kinds of expressions here
				return san.getExpr().toString();						
			}
		}
		
		return null;
	}
	
	public static String argByIndex(ASTCallStmtNode node, Map<String, Object> params) {		
		
		//int idx = Integer.valueOf(index);
		int idx = (Integer) params.get("argByIndex");
		
		IExpr expr = node.getArgList().get(idx - 1).getExpr();
		if (expr instanceof ASTVarOrFnRefNode) {
			ASTVarOrFnRefNode vofrn = (ASTVarOrFnRefNode) expr;			
			List<Definition> defs = vofrn.getName().getName().resolveBinding();
			if (defs.size() > 0) {
				
				if (defs.get(0).isRenamedModuleEntity()) {
					
					//System.out.println(defs.get(0).describe());
					//System.out.println(defs.get(0).describeClassification());
					//defs.get(0).
										
					//Iterable<PhotranTokenRef> iter = defs.get(0).getTokenRef().followOutgoing(EdgeType.RENAMED_BINDING_EDGE_TYPE);
					//for (PhotranTokenRef ptr : iter) {
					//	Token t = ptr.findToken();
					//	System.out.println(t);	
					//}
					
					ASTOnlyNode aon = defs.get(0).getTokenRef().findToken().findNearestAncestor(ASTOnlyNode.class);
					if (aon != null) {
						return aon.getName().getText();
					}
				}
				
				//return defs.get(0).g
				/*
				String found = defs.get(0).getType().processUsing(new TypeProcessor<String>() {
					
					@Override
					public String ifCharacter(Type type) {
						// TODO Auto-generated method stub
						return super.ifCharacter(type);
					}
					
				});		
				*/
			}
		}
		return expr.toString();			
	}
	
	public static Set<ASTCallStmtNode> call(IASTNode node, Map<String, Object> params) {
		
		final String subroutineName = (String) params.get("call");
		
		HashSet<ASTCallStmtNode> result = new HashSet<ASTCallStmtNode>();
		
		for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			//System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
			List<Definition> defs = csn.getSubroutineName().resolveBinding();
			
			//find name before rename
			if (defs.size() > 0) {
				
				//defs.get(0).getTokenRef().
				boolean found = defs.get(0).getType().processUsing(new TypeProcessor<Boolean>() {
					@Override
					public Boolean ifFunctionType(String name, FunctionType functionType) {
						//System.out.println("\tExamining function: " + name);
						if (name.equalsIgnoreCase(subroutineName)) {
							return true;							
						}
						return false;
					}
				});				
				
				if (found) {
					result.add(csn);
				}
			}
			// no definition - just check for match
			else if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
				//System.out.println("\tNo defs found, comparing subroutine names");
				result.add(csn);	
			}
			
		}
		return result;
	}
	
	public static boolean calls(IASTNode node, Map<String, Object> params) {
		
		final String subroutineName = (String) params.get("calls");
		final String definedInModule = (String) params.get("definedInModule");
		
		if (subroutineName.equals("routine_SetServices") && definedInModule != null && definedInModule.equals("NUOPC_DriverAtmOcn")) {
			System.out.println("\there");
		}
		
		for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			System.out.println("Calls Examining subroutine: " + csn.getSubroutineName()); 
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
						System.out.println("\tChecking module name for subroutine: " + subroutineName);
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
				
				System.out.println("No defs found for: " + subroutineName);
				
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
				
				System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
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
