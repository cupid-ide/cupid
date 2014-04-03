package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.DeclaredEntity;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.Intent;
import org.earthsystemcurator.cupidLanguage.Module;
import org.earthsystemcurator.cupidLanguage.ModuleName;
import org.earthsystemcurator.cupidLanguage.Subroutine;
import org.earthsystemcurator.cupidLanguage.SubroutineName;
import org.earthsystemcurator.cupidLanguage.Type;
import org.earthsystemcurator.cupidLanguage.UsesEntity;
import org.earthsystemcurator.cupidLanguage.UsesModule;
import org.earthsystemcurator.cupidLanguage.VariableDeclaration;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.stringtemplate.v4.ST;

@SuppressWarnings("restriction")
public class CodeTransformation {

	//a hack to acquire the project handle, required only when adding new files
	//need to think about how to deal with this in a cleaner way
	private static IProject project;
	
	public static void setProject(IProject p) {
		project = p;
	}
	
	public static IFortranAST module(Set<IFortranAST> context, Module mapping) {		
	
		if (project==null) {
			throw new RuntimeException("Project not set for code transformations");
		}
		
		ST code = new ST("module <moduleName>\n"
				  		+ "\nimplicit none\ncontains\nend module");
		
		String moduleName = null;
		if (mapping.getName() != null) {
			moduleName = mapping.getName().getExpr().getId();
		}
		else {
			moduleName = "module_name_default";
		}
		code.add("moduleName", moduleName);
		
		//System.out.println("Module code template:\n" + code.render() + "\n\n");
		
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
		context.add(ast);
		
		return ast;
		
		//ASTModuleNode amn = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit(code);
	
	}
	
	public static void moduleName(IFortranAST context, ModuleName mapping, String value) {		
		moduleName((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping, value);
	}
	
	public static void moduleName(ASTModuleNode context, ModuleName mapping, String value) {
		if (value != null) {
			context.getModuleStmt().getModuleName().getModuleName().setText(value);
		}
	}
	
	public static IASTNode call(IASTNode context, Call mapping) {					
		
		ST code = new ST("\ncall <name.id>(<params:{p|<if(!p.optional || p.value.expr.id)><if(p.keyword)><p.keyword> = <endif><if(p.value.expr.literal)><p.value.expr.literal><else><p.value.expr.id><endif><endif>}; separator=\", \">)\n");
		code.add("name", mapping.getSubroutineName().getExpr());
		code.add("params", mapping.getParams());
				
		System.out.println("Code to parse:\n" + code.render() + "\n");
		
		IBodyConstruct node = CodeExtraction.parseLiteralStatement(code.render());		
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) context;
		ssn.getBody().add(node);
			
		return node;
	}
	
	public static String typeToString(Type t) {
		if (t.isCharacter()) return "character";
		else if (t.isDouble()) return "double precision";
		else if (t.isInteger()) return "integer";
		else if (t.isLogical()) return "logical";
		else if (t.isReal()) return "real";
		else if (t.isDerived()) return "type(" + t.getDerivedType().getExpr().getId() + ")";
		else return "TYPE_NOT_DEFINED";
	}
	
	public static String intentToString(Intent i) {
		if (i.isIn()) return "in";
		else if (i.isOut()) return "out";
		else return "inout";
	}
	
	public static IASTNode usesModule(IFortranAST context, UsesModule mapping) {
		return usesModule((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping);
	}

	
	public static IASTNode usesModule(ASTModuleNode context, UsesModule mapping) {
		
		String moduleName = mapping.getName().getExpr().getId();
		
		ST code = new ST("\n\nuse <moduleName>\n");
		code.add("moduleName", moduleName);
		String renderedCode = code.render();
			
		//find an appropriate location
		ASTUseStmtNode newNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(renderedCode);
		IASTListNode<IBodyConstruct> body = (IASTListNode<IBodyConstruct>) context.getBody();
		ASTUseStmtNode usn = body.findLast(ASTUseStmtNode.class);
		if (usn != null) {
			body.insertAfter(usn, newNode);
		}
		else {
			body.add(0, newNode);
		}
		return newNode;	
		
	}
	
	/**
	 * Ensure that an entity appears within the only list of a use statement.
	 * 
	 * @param context
	 * @param mapping
	 * @param value
	 * @return
	 */
	public static IASTNode usesEntity(ASTUseStmtNode context, UsesEntity mapping, String value) {
		
		String oldName = mapping.getName().getExpr().getId();
		String newName = value;
					
		String code = context.toString().trim();  
		if (context.getOnlyList() == null) {
			code += ", only: ";
		}
		else {
			code += ", &\n";
		}
		if (newName != null && !newName.equals(oldName)) {
			code += newName + " => " + oldName;
		}
		else {
			code += oldName;
		}
		
		ASTUseStmtNode tempNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(code);
		//String newOnlyList = tempNode.getOnlyList().toString();
		if (tempNode.getOnlyList().get(0).getNewName() != null) {
			tempNode.getOnlyList().get(0).getNewName().setWhiteBefore(", only: "); //testing this approach
		}
		else {
			tempNode.getOnlyList().get(0).getName().setWhiteBefore(", only: ");
		}
		
		context.setOnlyList(tempNode.getOnlyList());
		//context.getOnlyList().replaceWith(newOnlyList);
		
		//context.replaceWith(code + "\n\n");
		
		return context;
	
		/*
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
		
		
		return null;
		*/
	}	
		
	
	public static IASTNode variableDeclaration(ASTSubroutineSubprogramNode context, VariableDeclaration mapping) {
		
		String typeStmt;
		if (mapping.getType().isDerived()) {
			typeStmt = "\ntype(" + mapping.getType().getDerivedType().getExpr().getId() + ")";
		}
		else {
			//TODO: handle other types
			typeStmt = "\nundefined";
		}
		
		typeStmt = typeStmt + " :: default_var_name\n";
		
		ASTTypeDeclarationStmtNode tds = (ASTTypeDeclarationStmtNode) CodeExtraction.parseLiteralStatement(typeStmt);
		ASTTypeDeclarationStmtNode last = context.findLast(ASTTypeDeclarationStmtNode.class);
		if (last != null) {
			context.getBody().insertAfter(last, tds);
		}
		else {
			context.getBody().add(tds);
		}
		
		return tds;
	}
	
	public static void declaredEntity(ASTTypeDeclarationStmtNode context, DeclaredEntity mapping, String value) {
		context.getEntityDeclList().get(0).getObjectName().getObjectName().setText(value);
	}
	
	public static void subroutineName(ASTSubroutineSubprogramNode context, SubroutineName mapping, String value) {
		String newName = value;
		if (mapping.getName() != null && mapping.getName().getExpr() != null) {
			newName = mapping.getName().getExpr().getId();
		}
		if (newName != null && newName.length() > 0) {
			context.getSubroutineStmt().getSubroutineName().getSubroutineName().setText(newName);
		}
	}
	
	public static IASTNode subroutine(IFortranAST context, Subroutine mapping) {
		return subroutine((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping);
	}
	
	public static IASTNode subroutine(ASTModuleNode context, Subroutine mapping) {		
		
		//TODO: deal with documentation
		//String doc = Regex.getDocFromAnnotation(modelElem.eClass());
		String doc = null;
		
		ST code = new ST("\n\n<if(doc)>\n!\n! <doc; wrap=\"\n! \", separator=\" \">\n!\n<endif>"
				       + "subroutine <name>(<vars:{v|<v.id>}; separator=\", \">)\n"
					   + "<vars, types, intents:{v, t, i|    <t><if(i)>, intent(<i>)<endif> :: <v.id>}; separator=\"\n\">\n"
					   + "end subroutine\n");
		
		if (mapping.getName().getExpr() != null) { 
			code.add("name", mapping.getName().getExpr().getId());
		}
		else {
			code.add("name", "DEFAULT_SUBROUTINE_NAME");
		}
				
		for (FormalParam fp : mapping.getParams()) {
			code.add("types", typeToString(fp.getType()));
			code.add("intents", intentToString(fp.getIntent()));
			code.add("vars", fp.getName().getExpr());
		}
		if (doc != null) {
			doc = doc.replaceAll("\n", "\n! ");
			code.add("doc", doc.split(" "));
		}
		
		System.out.println("Code to parse:\n" + code.render(72) + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render(72));
		
		//assume it is a module for now
		//ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
	
		context.getModuleBody().add(ssn);
		return ssn;
	}
	
}
