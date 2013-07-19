package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.types.FunctionType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.analysis.types.TypeProcessor;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class CodeQuery {

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
	
	public static boolean containsCall(IASTNode node, final String subroutineName) {
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
				
				if (found) return true;
			}
			// no definition - just check for match
			else if (csn.getSubroutineName().getText().equalsIgnoreCase(subroutineName)) {
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
	
}
