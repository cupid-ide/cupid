package org.earthsystemmodeling.cupid.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.earthsystemmodeling.psyche.ActualParam;
import org.earthsystemmodeling.psyche.ActualParamByKeyword;
import org.earthsystemmodeling.psyche.Call;
import org.earthsystemmodeling.psyche.DeclaredEntity;
import org.earthsystemmodeling.psyche.Expr;
import org.earthsystemmodeling.psyche.FormalParam;
import org.earthsystemmodeling.psyche.FunctionAssignment;
import org.earthsystemmodeling.psyche.Module;
import org.earthsystemmodeling.psyche.ModuleName;
import org.earthsystemmodeling.psyche.PathExpr;
import org.earthsystemmodeling.psyche.Subroutine;
import org.earthsystemmodeling.psyche.SubroutineName;
import org.earthsystemmodeling.psyche.UsesEntity;
import org.earthsystemmodeling.psyche.UsesModule;
import org.earthsystemmodeling.psyche.VariableDeclaration;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.parser.ASTAcValueNode;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTAssignmentStmtNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTEntityDeclNode;
import org.eclipse.photran.internal.core.parser.ASTFunctionArgListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTSectionSubscriptNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class CodeQuery2 {

	public static String actualParamByKeyword(ASTCallStmtNode context, ActualParamByKeyword mapping) {
		ASTSubroutineArgNode san = findArgByKeyword(mapping.getKeyword(), context.getArgList());
		if (san != null) {
			return san.getExpr().toString().trim();
		}
		else {
			return null;
		}
	}
	
	public static Map<ASTCallStmtNode, Map<PathExpr, String>> call(IASTNode context, Call mapping) {
		
		Map<ASTCallStmtNode, Map<PathExpr, String>> result = new HashMap<ASTCallStmtNode, Map<PathExpr, String>>();
		
		csnloop : for (ASTCallStmtNode csn : context.findAll(ASTCallStmtNode.class)) {
			
			final Map<PathExpr, String> bindings = newBindings();					
			
			if (!matchAndBind(mapping.getSubroutineName(), csn.getSubroutineName().getText(), bindings)) {
				continue;
			}
			
			//if (mapping.getSubroutineName().getExpr() != null && mapping.getSubroutineName().getExpr().getId() != null) {
			//	if (mapping.getSubroutineName().getExpr().getId().contains("NUOPC_CompSet")) {
			//		System.out.println("subroutine = " + mapping.getSubroutineName().getExpr().getId());
			//	}
			//}
			
			/*
			if (mapping.getSubroutineName().getPathExpr() != null) {
				bindings.put(mapping.getSubroutineName().getPathExpr(), csn.getSubroutineName().getText().trim());
			}
			else {
				
				if (!mapping.getSubroutineName().isWildcard() && !csn.getSubroutineName().getText().trim().equalsIgnoreCase(mapping.getSubroutineName().getExpr().getId())) {
					continue;
				}
			}
			*/
			
			//deal with arguments now
			if (mapping.getParams() != null) {
				
				//arg list could be smaller since some can be optional, but cannot be larger
				if (csn.getArgList().size() > mapping.getParams().size()) {
					continue csnloop;
				}
				
				varloop: for (int i = 0; i < mapping.getParams().size(); i++) {
					
					ASTSubroutineArgNode san;
					ActualParam param = mapping.getParams().get(i);
					String keyword = param.getKeyword();
					Expr value = param.getValue();
					
					if (keyword == null) {
						//match by index						
						if (csn.getArgList().size() <= i) {
							continue csnloop;
						}
						san = csn.getArgList().get(i);
					}
					else {
						//match by keyword
						san = findArgByKeyword(keyword, csn.getArgList());						
					}
					
					if (san == null) {
						if (param.isOptional()) {
							//optional argument not present, so ignore it
							continue varloop;
						}
						else {
							continue csnloop;
						}
					}
					else if (value.getPathExpr() != null) {
						bindings.put(value.getPathExpr(), san.getExpr().toString().trim());
					}
					else if (value.getExpr() != null && value.getExpr().getLiteral() != null) {
						//System.out.println("literal search = " + value.getExpr().getLiteral());
						//System.out.println("\t=>compared to = " + san.getExpr().toString().trim());
						
						if (!san.getExpr().toString().trim().equals(value.getExpr().getLiteral())) {
							continue csnloop;
						}
						
					}
					else if (value.getExpr() != null && value.getExpr().getArrayConstructor() != null) {
						if (san.getExpr() instanceof ASTArrayConstructorNode) {
							ASTArrayConstructorNode acn = (ASTArrayConstructorNode) san.getExpr();
							ASTAcValueNode avn = acn.getAcValueList().get(0);
							String actual = avn.getExpr().toString().trim();
							String need = value.getExpr().getArrayConstructor().getItem().get(0).trim();
							//System.out.println("compare: " + actual);
							//System.out.println("to: " + need);
							if (!actual.equalsIgnoreCase(need)) {
								continue csnloop;
							}
						}
						else {
							continue csnloop;
						}
					}
					else if (!value.isWildcard() && !san.getExpr().toString().trim().equalsIgnoreCase(value.getExpr().getId())) {
						//if not wildcard, make sure expressions match
						//System.out.println("Expr = |" + san.getExpr().toString() + "|");
						continue csnloop;
					}							
				}			
			}
			
			//everything matched, so add to result
			result.put(csn, bindings);
		}
		
		//System.out.println("return");
		return result;	
		
	}
	
	public static Map<IFortranAST, Map<PathExpr, String>> module(Set<IFortranAST> asts, Module mapping) {
		
		Map<IFortranAST, Map<PathExpr, String>> result = new HashMap<IFortranAST, Map<PathExpr, String>>();
		
		for (IFortranAST astToCheck : asts) {
			if (astToCheck.getRoot() != null &&
				astToCheck.getRoot().getProgramUnitList() != null && 
			    astToCheck.getRoot().getProgramUnitList().size() > 0 &&
			    astToCheck.getRoot().getProgramUnitList().get(0) instanceof ASTModuleNode) {
				
				ASTModuleNode node = (ASTModuleNode) astToCheck.getRoot().getProgramUnitList().get(0);
				
				if (mapping.getName() != null) {
					Map<PathExpr, String> bindings = newBindings();
					if (matchAndBind(mapping.getName(), node.getModuleStmt().getModuleName().getModuleName().getText(), bindings)) {
						result.put(astToCheck,  bindings);
					}
					/*
					if (mapping.getName().isWildcard() ||
					    (mapping.getName().getExpr()!=null && mapping.getName().getExpr().getId().equalsIgnoreCase(node.getModuleStmt().getModuleName().getModuleName().getText()))) {
						result.put(astToCheck, null);
					}
					else if (mapping.getName().getPathExpr() != null) {
						Map<PathExpr, String> bindings = new HashMap<PathExpr, String>();
						bindings.put(mapping.getName().getPathExpr(), node.getModuleStmt().getModuleName().getModuleName().getText());
						result.put(astToCheck, bindings);
					}
					*/
				}
				else {
					result.put(astToCheck, null);
				}
			
			}
		}
		
		return result;
	}
	
	public static String moduleName(ASTModuleNode node, ModuleName moduleName) {
		return node.getModuleStmt().getModuleName().getModuleName().getText();
	}
	
	public static String moduleName(IFortranAST ast, ModuleName moduleName) {
		ASTModuleNode node = (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0);
		return moduleName(node, moduleName);
	}
	
	
	
	//public static boolean isPathExpr(IDOrPathExpr obj) {
	//	return obj instanceof PathExpr;
	//}
	
	//public static PathExpr asPathExpr(IDOrPathExpr obj) {
	//	return (PathExpr) obj;
	//}
	
	//public static IDOrWildcard asIDOrWildcard(IDOrPathExpr obj) {
	//	return (IDOrWildcard) obj;
	//}
	
	//TODO: handle literals
	public static boolean matchAndBind(Expr var, String value, Map<PathExpr, String> bindings) {
		if (var.getPathExpr() != null) {
			bindings.put(var.getPathExpr(), value);
			return true;
		}
		else if (!var.isWildcard() && !value.trim().equalsIgnoreCase(var.getExpr().getId())) {
			return false;
		}
		return true;
	}
	
	
	public static Map<ASTUseStmtNode, Map<PathExpr, String>> usesModule(IFortranAST ast, UsesModule mapping) {
		return usesModule((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), mapping);
	}
	
	public static Map<ASTUseStmtNode, Map<PathExpr, String>> usesModule(ASTModuleNode node, UsesModule mapping) {
				
		Map<ASTUseStmtNode, Map<PathExpr, String>> result = new HashMap<ASTUseStmtNode, Map<PathExpr, String>>();		
		
		for (ASTUseStmtNode usn : node.findAll(ASTUseStmtNode.class)) {
			Map<PathExpr, String> bindings = newBindings();
			
			if (!matchAndBind(mapping.getName(), usn.getName().getText(), bindings)) {
				continue;
			}
			
			result.put(usn, bindings);
		}
		
		return result;
	}
	
	public static Map<String, Map<PathExpr, String>> usesEntity(ASTUseStmtNode node, UsesEntity mapping) {
		Map<String, Map<PathExpr, String>> result = new HashMap<String, Map<PathExpr, String>>();
		
		//TODO: this requires an explicit only list and does not look into the imported module
		//itself to determine what public entities are imported
		if (node.getOnlyList() != null) {
			for (ASTOnlyNode only : node.getOnlyList()) {
				String value;
				if (only.getNewName() != null) {
					value = only.getNewName().getText();
				}
				else {
					value = only.getName().getText();
				}
				
				Map<PathExpr, String> bindings = newBindings();
				if (!matchAndBind(mapping.getName(), only.getName().getText(), bindings)) {
					continue;
				}
				else {
					result.put(value, bindings);
				}
			}
		}
		
		return result;
	}
	
	
	
	
	public static Map<ASTSubroutineSubprogramNode, Map<PathExpr, String>> subroutine(IFortranAST ast, Subroutine mapping) {
		return subroutine(ast.getRoot().getProgramUnitList().get(0), mapping);
	}
	
	public static Map<ASTSubroutineSubprogramNode, Map<PathExpr, String>> subroutine(IASTNode node, Subroutine mapping) {
			
		Map<ASTSubroutineSubprogramNode, Map<PathExpr, String>> result = new LinkedHashMap<ASTSubroutineSubprogramNode, Map<PathExpr, String>>();
		
		Set<ASTSubroutineSubprogramNode> nodes = node.findAll(ASTSubroutineSubprogramNode.class);
		ssnloop: for (ASTSubroutineSubprogramNode ssn : nodes) {
			
			Map<PathExpr, String> bindings = newBindings();
			String subroutineName = ssn.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
			
			if (!matchAndBind(mapping.getName(), subroutineName, bindings)) {
				continue ssnloop;
			}
			//IDOrWildcard sName = (IDOrWildcard) mapping.getName();
			/*if (!mapping.getName().isWildcard() && mapping.getName().getId() != null && !subroutineName.equalsIgnoreCase(sName.getId())) {
				continue ssnloop;
			}
			else {
				bindings.put(mapping.getName(), subroutineName);
			}
			*/
			
			
			int idxParam = 0;
			
			if (mapping.getParams().size() == 0) {
				//no params	to check		
				result.put(ssn, bindings);				
			}
			else if (ssn.getSubroutineStmt().getSubroutinePars() != null) {
				for (ASTSubroutineParNode spn : ssn.getSubroutineStmt().getSubroutinePars()) {
					
					List<Definition> defs = spn.getVariableName().resolveBinding();
					if (defs.size() > 0) {
						
						if (mapping.getParams().size() > idxParam) {
							
							FormalParam param = mapping.getParams().get(idxParam);
							
							if (!defs.get(0).getType().equals(translateType(param.getType()))) {
								continue ssnloop;
							}
							else {
								if (param.getName().getPathExpr() != null) {
									bindings.put(param.getName().getPathExpr(), spn.getVariableName().getText());
								}
								idxParam++;
							}							
						}												
					}
					else {
						//TODO: deal with this more gracefully
						throw new RuntimeException("Cannot resolve binding for variable: " + spn.getVariableName().getText() + " inside subroutine " + subroutineName);
					}
					
				}
				
				//have not failed, verify lengths are the same
				if (ssn.getSubroutineStmt().getSubroutinePars().size() == mapping.getParams().size()) {
					result.put(ssn, bindings);
				}
			}
			
				
			
		}
		
		return result;
	}
	
	private static Map<PathExpr, String> newBindings() {
		return new HashMap<PathExpr, String>();
	}
	
	private static Map<PathExpr, String> newBindings(PathExpr pe, String s) {
		Map<PathExpr, String> bindings = newBindings();
		bindings.put(pe, s);
		return bindings;
	}
	
	public static Map<String, Map<PathExpr, String>> subroutineName(ASTSubroutineSubprogramNode node, SubroutineName mapping) {
		
		Map<String, Map<PathExpr, String>> result = new HashMap<String, Map<PathExpr, String>>();
		String name = null;
		try {
		//name = node.getNameToken().getText();
		name = node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
		}
		catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		
		Map<PathExpr, String> bindings = newBindings();
		
		if (mapping.getName() == null) {
			result.put(name, null);
		}
		else if (matchAndBind(mapping.getName(), name, bindings)) {
			result.put(name, bindings);
		}
		/*
		else if (mapping.getName() instanceof IDOrWildcard) {
			if (((IDOrWildcard) mapping.getName()).getId().equalsIgnoreCase(name) ||
			    ((IDOrWildcard) mapping.getName()).isWildcard()) {
				result.put(name, null);
			}
		}
		else {
			result.put(name, newBindings((PathExpr) mapping.getName(), name));
		}
		*/
		return result;
	}
	
	public static Type translateType(org.earthsystemmodeling.psyche.Type inType) {
		if (inType.isReal()) return Type.REAL;
		else if (inType.isCharacter()) return Type.CHARACTER;
		else if (inType.isDouble()) return Type.DOUBLEPRECISION;
		else if (inType.isInteger()) return Type.INTEGER;
		else if (inType.isLogical()) return Type.LOGICAL;
		else if (inType.isDerived()) return new DerivedType(inType.getDerivedType().getExpr().getId());
		else return null;
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
	
	public static ASTFunctionArgListNode findFuncArgByKeyword(String keyword, IASTListNode<ASTFunctionArgListNode> argList) {
		if (keyword.endsWith("?")) keyword = keyword.substring(0, keyword.length()-1);
		for (ASTFunctionArgListNode ssn : argList) {
			if (ssn.getFunctionArg().getName() != null && ssn.getFunctionArg().getName().getText().equalsIgnoreCase(keyword)) {
				return ssn;
			}
		}
		return null;
	}
	
	public static Map<ASTTypeDeclarationStmtNode, Map<PathExpr, String>> variableDeclaration(ScopingNode node, VariableDeclaration mapping) {
			
		Map<ASTTypeDeclarationStmtNode, Map<PathExpr, String>> result = new HashMap<ASTTypeDeclarationStmtNode, Map<PathExpr, String>>();
		org.earthsystemmodeling.psyche.Type type = mapping.getType();
		
		Set<ASTTypeDeclarationStmtNode> nodes = node.findAll(ASTTypeDeclarationStmtNode.class);
		for (ASTTypeDeclarationStmtNode n : nodes) {
			
			boolean toAdd = false;
			Map<PathExpr, String> bindings = null;
				
			if (type.isInteger() && n.getTypeSpec().isInteger() || 
				type.isCharacter() && n.getTypeSpec().isCharacter() ||
				type.isLogical() && n.getTypeSpec().isLogical() ||
				type.isReal() && n.getTypeSpec().isReal() ||
				type.isDouble() && n.getTypeSpec().isDouble()) {
				//TODO: add other built-in types as needed
				toAdd = true;
			}
			else if (type.isDerived() && n.getTypeSpec().isDerivedType()) {				
				bindings = newBindings();
				String typeName = n.getTypeSpec().getTypeName().getText().trim();
				toAdd = matchAndBind(type.getDerivedType(), typeName, bindings);
			}
			
			// if we found the type, then add it
			if (toAdd) {
				result.put(n, bindings);
				//for (ASTEntityDeclNode decl : n.getEntityDeclList()) {
					//result.put(decl.getObjectName().getObjectName().getText(), bindings);
				//}
			}
				
		}
	
		return result;
	}
	
	public static Map<String, Map<PathExpr, String>> declaredEntity(ASTTypeDeclarationStmtNode context, DeclaredEntity mapping) {
		Map<String, Map<PathExpr, String>> result = new HashMap<String, Map<PathExpr, String>>();
		for (ASTEntityDeclNode edn : context.getEntityDeclList()) {
			result.put(edn.getObjectName().getObjectName().getText(), null);
		}
		return result;
	}
	
	public static Map<ASTAssignmentStmtNode, Map<PathExpr, String>> functionAssignment(IASTNode context, FunctionAssignment mapping) {
	
		Map<ASTAssignmentStmtNode, Map<PathExpr, String>> result = new HashMap<ASTAssignmentStmtNode, Map<PathExpr, String>>();
		
		Set<ASTAssignmentStmtNode> nodes = context.findAll(ASTAssignmentStmtNode.class);
		asnloop: for (ASTAssignmentStmtNode node : nodes) {
			Map<PathExpr, String> bindings = newBindings();
			//we are only considering a subset of assignment statements
			if (node.getLhsVariable() != null && node.getRhs() instanceof ASTVarOrFnRefNode) {
						
				//match lhs
				String varName = node.getLhsVariable().getName().getText();
				if (!matchAndBind(mapping.getLhs(), varName, bindings)) {
					continue;
				}
				
				//match function name
				ASTVarOrFnRefNode rhs = (ASTVarOrFnRefNode) node.getRhs();
				String funcName = rhs.getName().getName().getText();
				if (!matchAndBind(mapping.getFunctionName(), funcName, bindings)) {
					continue;
				}
				
				//match parameters
				//deal with arguments now
				if (mapping.getParams() != null) {
					
					varloop: for (int i = 0; i < mapping.getParams().size(); i++) {
						
						ASTFunctionArgListNode ssn;
						ActualParam param = mapping.getParams().get(i);
						String keyword = param.getKeyword();
						Expr value = param.getValue();
						
						if (keyword == null) {
							//match by index		
							//TODO: deal with getPrimarySectionSubscriptList
							if (rhs.getFunctionArgList().size() <= i) {
								continue asnloop;
							}
							ssn = rhs.getFunctionArgList().get(i);
						}
						else {
							//match by keyword
							//ssn = findFuncArgByKeyword(keyword, rhs.getPrimarySectionSubscriptList());
							ssn = findFuncArgByKeyword(keyword, rhs.getFunctionArgList());	
						}
						
						if (ssn == null) {
							if (param.isOptional()) {
								//optional argument not present, so ignore it
								continue varloop;
							}
							else {
								continue asnloop;
							}
						}
						else if (value.getPathExpr() != null) {
							bindings.put(value.getPathExpr(), ssn.getFunctionArg().getExpr().toString().trim());
						}
						else if (value.getExpr() != null && value.getExpr().getLiteral() != null) {
							//System.out.println("literal search = " + value.getExpr().getLiteral());
							//System.out.println("\t=>compared to = " + ssn.getExpr().toString().trim());
							
							if (!ssn.getFunctionArg().getExpr().toString().trim().equals(value.getExpr().getLiteral())) {
								continue asnloop;
							}
							
						}
						else if (!value.isWildcard() && !ssn.getFunctionArg().getExpr().toString().trim().equalsIgnoreCase(value.getExpr().getId())) {
							//if not wildcard, make sure expressions match
							//System.out.println("Expr = |" + san.getExpr().toString() + "|");
							continue asnloop;
						}		
					}
				}
				
				result.put(node, bindings);
			}
			else {
				//TODO: other lhs options not supported
			}
		}
		
		return result;
		
	}
	
	/*
	public static Map<ASTVarOrFnRefNode, Map<PathExpr, String>> rightHandSideFunctionRef(ASTAssignmentStmtNode context, RightHandSideFunctionRef mapping) {
		
		Map<ASTVarOrFnRefNode, Map<PathExpr, String>> result = new HashMap<ASTVarOrFnRefNode, Map<PathExpr, String>>();
		
		if (context.getRhs() instanceof ASTVarOrFnRefNode) {
			result.put((ASTVarOrFnRefNode) context.getRhs(), null);
		}
		
		return result;
	}
	*/
	
}
