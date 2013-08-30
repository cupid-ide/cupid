package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.FunctionType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.analysis.types.TypeProcessor;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IExpr;

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
	
		
	public static Set<ASTSubroutineSubprogramNode> subroutine(IASTNode node, Map<String, Object> params) {
		
		String pattern = (String) params.get("subroutine");
		System.out.println("subroutine: " + pattern);
		
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
		
		for (int i=0; i < paramTypes.length; i++) {
			System.out.println("Param = " + paramTypes[i]);
		}
		
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
		
		for (ASTCallStmtNode csn : node.findAll(ASTCallStmtNode.class)) {
			
			System.out.println("Examining subroutine: " + csn.getSubroutineName()); 
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
				
				if (found) return true;
			}
			// no definition - just check for match
			else if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
				//System.out.println("\tNo defs found, comparing subroutine names");
				return true;		
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
