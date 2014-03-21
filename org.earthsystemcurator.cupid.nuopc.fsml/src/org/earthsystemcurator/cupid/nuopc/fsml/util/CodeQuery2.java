package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.earthsystemcurator.cupidLanguage.ActualParam;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.IDOrPathExpr;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.Module;
import org.earthsystemcurator.cupidLanguage.ModuleName;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.Subroutine;
import org.earthsystemcurator.cupidLanguage.SubroutineName;
import org.earthsystemcurator.cupidLanguage.UsesEntity;
import org.earthsystemcurator.cupidLanguage.UsesModule;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class CodeQuery2 {

	public static Map<ASTCallStmtNode, Map<PathExpr, String>> call(IASTNode context, Call mapping) {
		
		Map<ASTCallStmtNode, Map<PathExpr, String>> result = new HashMap<ASTCallStmtNode, Map<PathExpr, String>>();
		
		csnloop : for (ASTCallStmtNode csn : context.findAll(ASTCallStmtNode.class)) {
			
			final Map<PathExpr, String> bindings = new HashMap<PathExpr, String>();					
			
			if (mapping.getSubroutineName() instanceof PathExpr) {
				bindings.put((PathExpr) mapping.getSubroutineName(), csn.getSubroutineName().getText().trim());
			}
			else {
				IDOrWildcard subroutineName = (IDOrWildcard) mapping.getSubroutineName();
				if (!subroutineName.isWildcard() && !csn.getSubroutineName().getText().trim().equalsIgnoreCase(subroutineName.getId())) {
					continue;
				}
			}
			
			//deal with arguments now
			if (mapping.getParams() != null) {
				
				varloop: for (int i = 0; i < mapping.getParams().size(); i++) {
					
					ASTSubroutineArgNode san;
					ActualParam param = mapping.getParams().get(i);
					String keyword = param.getKeyword();
					IDOrPathExpr value = param.getValue();
					
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
					else if (value instanceof PathExpr) {
						bindings.put((PathExpr) value, san.getExpr().toString().trim());
					}
					else if (value.getLiteral() != null && !san.getExpr().toString().trim().equals(value.getLiteral())) {
						continue csnloop;
					}
					else if (value instanceof IDOrWildcard) {
						//if not wildcard, make sure expressions match
						if (!((IDOrWildcard) value).isWildcard() && !san.getExpr().toString().trim().equalsIgnoreCase(((IDOrWildcard) value).getId())) {
						//System.out.println("Expr = |" + san.getExpr().toString() + "|");
						continue csnloop;
						}
					}							
				}			
			}
			
			//everything matched, so add to result
			result.put(csn, bindings);
		}
		
		System.out.println("return");
		return result;	
		
	}
	
	public static Map<ASTModuleNode, Map<PathExpr, String>> module(Set<IFortranAST> asts, Module mapping) {
		
		Map<ASTModuleNode, Map<PathExpr, String>> result = new HashMap<ASTModuleNode, Map<PathExpr, String>>();
		
		for (IFortranAST astToCheck : asts) {
			if (astToCheck.getRoot() != null &&
				astToCheck.getRoot().getProgramUnitList() != null && 
			    astToCheck.getRoot().getProgramUnitList().size() > 0 &&
			    astToCheck.getRoot().getProgramUnitList().get(0) instanceof ASTModuleNode) {
				
				ASTModuleNode node = (ASTModuleNode) astToCheck.getRoot().getProgramUnitList().get(0);
				
				if (mapping.getName() != null) {
					if (mapping.getName() instanceof IDOrWildcard) {
						IDOrWildcard moduleName = (IDOrWildcard) mapping.getName();
						if (moduleName.isWildcard() ||
						    moduleName.getId().equalsIgnoreCase(node.getModuleStmt().getModuleName().getModuleName().getText())) {
							result.put(node, null);
						}
					}
					else {
						Map<PathExpr, String> bindings = new HashMap<PathExpr, String>();
						bindings.put((PathExpr) mapping.getName(), node.getModuleStmt().getModuleName().getModuleName().getText());
						result.put(node, bindings);
					}
				}
				else {
					result.put(node, null);
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
	
	
	
	public static boolean isPathExpr(IDOrPathExpr obj) {
		return obj instanceof PathExpr;
	}
	
	public static PathExpr asPathExpr(IDOrPathExpr obj) {
		return (PathExpr) obj;
	}
	
	public static IDOrWildcard asIDOrWildcard(IDOrPathExpr obj) {
		return (IDOrWildcard) obj;
	}
	
	public static boolean matchAndBind(IDOrPathExpr var, String value, Map<PathExpr, String> bindings) {
		if (isPathExpr(var)) {
			bindings.put(asPathExpr(var), value);
			return true;
		}
		else if (!asIDOrWildcard(var).isWildcard() && !value.equalsIgnoreCase(asIDOrWildcard(var).getId())) {
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
			
			Map<PathExpr, String> bindings = new HashMap<PathExpr, String>();
			String subroutineName = ssn.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
			
			if (mapping.getName() instanceof IDOrWildcard) {
				IDOrWildcard sName = (IDOrWildcard) mapping.getName();
				if (!sName.isWildcard() && !subroutineName.equalsIgnoreCase(sName.getId())) {
					continue ssnloop;
				}
			}
			else {
				bindings.put((PathExpr) mapping.getName(), subroutineName);
			}
			
			int idxParam = 0;
			
			if (ssn.getSubroutineStmt().getSubroutinePars() != null) {
				for (ASTSubroutineParNode spn : ssn.getSubroutineStmt().getSubroutinePars()) {
					
					List<Definition> defs = spn.getVariableName().resolveBinding();
					if (defs.size() > 0) {
						
						if (mapping.getParams().size() > idxParam) {
							
							FormalParam param = mapping.getParams().get(idxParam);
							
							if (!defs.get(0).getType().equals(translateType(param.getType()))) {
								continue ssnloop;
							}
							else {
								if (param.getName() instanceof PathExpr) {
									bindings.put((PathExpr) param.getName(), spn.getVariableName().getText());
								}
								idxParam++;
							}							
						}												
					}
					
				}
				
				//have not failed, verify lengths are the same
				if (ssn.getSubroutineStmt().getSubroutinePars().size() == mapping.getParams().size()) {
					result.put(ssn, bindings);
				}
			}
			else if (mapping.getParams().size() == 0) {
				//no params				
				result.put(ssn, bindings);				
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
		String name = node.getNameToken().getText();
		if (mapping.getName() == null) {
			result.put(name, null);
		}
		else if (mapping.getName() instanceof IDOrWildcard) {
			if (((IDOrWildcard) mapping.getName()).getId().equalsIgnoreCase(name) ||
			    ((IDOrWildcard) mapping.getName()).isWildcard()) {
				result.put(name, null);
			}
		}
		else {
			result.put(name, newBindings((PathExpr) mapping.getName(), name));
		}
		
		return result;
	}
	
	public static Type translateType(org.earthsystemcurator.cupidLanguage.Type inType) {
		if (inType.isReal()) return Type.REAL;
		else if (inType.isCharacter()) return Type.CHARACTER;
		else if (inType.isDouble()) return Type.DOUBLEPRECISION;
		else if (inType.isInteger()) return Type.INTEGER;
		else if (inType.isLogical()) return Type.LOGICAL;
		else if (inType.isDerived()) return new DerivedType(((IDOrWildcard)inType.getDerivedType()).getId());
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
	
}
