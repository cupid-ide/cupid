package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

import org.earthsystemcurator.cupidLanguage.Annotation;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.DeclaredEntity;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.FunctionAssignment;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Terminal;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAssignmentStmtNode;
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

	private static final int LINE_WIDTH = 72;
	
	//a hack to acquire the project handle, required only when adding new files
	//need to think about how to deal with this in a cleaner way
	private static IProject project;
	
	public static void setProject(IProject p) {
		project = p;
	}
	
	//for convenience and consistency
	private static ST STWithDoc(String template, List<Annotation> anots) {
		String docPreamble = "<if(doc)>\n\n! <doc; wrap=\"\n! \", separator=\" \">\n<endif>";
		ST st = new ST(docPreamble + template);
		String doc = getDoc(anots);
		if (doc != null) {
			st.add("doc", doc.replaceAll("\n", "\n! ").split(" "));
		}
		return st;
	}
	
	private static void setMapsTo(EObject modelElem, Object value) {
		EStructuralFeature esf = modelElem.eClass().getEStructuralFeature("mapsTo");
		modelElem.eSet(esf, value);
	}
	
	public static IFortranAST module(Set<IFortranAST> context, Module mapping, List<Annotation> anots) {		
	
		if (project==null) {
			throw new RuntimeException("Project not set for code transformations");
		}
		
		ST code = STWithDoc("module <moduleName>\n\nimplicit none\ncontains\nend module", anots);
		
		String moduleName = null;
		if (mapping.getName() != null) {
			moduleName = mapping.getName().getExpr().getId();
		}
		else {
			moduleName = "module_name_default";
		}
		code.add("moduleName", moduleName);
			
		System.out.println("Module code template:\n" + code.render(LINE_WIDTH) + "\n\n");
		
		IFile fileToAdd = project.getFile(moduleName.toLowerCase() + ".F90");
				
		if (!fileToAdd.exists()) {
			byte[] bytes = code.render(LINE_WIDTH).getBytes();
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
			return null;
		}
		
		IFortranAST ast = PhotranVPG.getInstance().parse(fileToAdd.getFullPath().toString());		
		//IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(fileToAdd);

		context.add(ast);		
		return ast;
	
	}
	
	public static void moduleName(IFortranAST context, ModuleName mapping, String value, List<Annotation> anots) {		
		moduleName((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping, value, anots);
	}
	
	public static void moduleName(ASTModuleNode context, ModuleName mapping, String value, List<Annotation> anots) {
		if (value != null) {
			context.getModuleStmt().getModuleName().getModuleName().setText(value);
		}
	}
	
	public static IASTNode call(IASTNode context, Call mapping, List<Annotation> anots) {					
		
		ST code = STWithDoc("\ncall <name.id>(<params:{p|<if(!p.optional || p.value.expr.id)><if(p.keyword)><p.keyword> = <endif><if(p.value.expr.literal)><p.value.expr.literal><else><p.value.expr.id><endif><endif>}; wrap=\"&\n\", separator=\", \">)\n", anots);
		code.add("name", mapping.getSubroutineName().getExpr());
		code.add("params", mapping.getParams());
				
		//System.out.println("Code to parse:\n" + code.render(LINE_WIDTH) + "\n");
		
		IBodyConstruct node = CodeExtraction.parseLiteralStatement(code.render(LINE_WIDTH));		
		
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
	
	public static IASTNode usesModule(IFortranAST context, UsesModule mapping, List<Annotation> anots) {
		return usesModule((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping, anots);
	}

	
	@SuppressWarnings("unchecked")
	public static IASTNode usesModule(ASTModuleNode context, UsesModule mapping, List<Annotation> anots) {
		
		String moduleName = mapping.getName().getExpr().getId();
		
		ST code = STWithDoc("use <moduleName>\n", anots);
		code.add("moduleName", moduleName);
			
		//find an appropriate location
		ASTUseStmtNode newNode = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement(code.render(LINE_WIDTH));
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
	public static IASTNode usesEntity(ASTUseStmtNode contextNode, UsesEntity mapping, String value, List<Annotation> anots, EObject context) {
		
		String oldName = mapping.getName().getExpr().getId();
		String newName = value;
					
		String code = contextNode.toString().trim();  
		if (contextNode.getOnlyList() == null) {
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
		contextNode.replaceWith(tempNode);
		
		//TODO: don't like this break in modularity as the transformation
		//class is now aware of the model elements
		//
		//all the mapping should be handled separately from the code transformation stuff...
		setMapsTo(context, tempNode);
		
		/*
		if (contextNode.getOnlyList() == null) {
			if (tempNode.getOnlyList().get(0).getNewName() != null) {
				tempNode.getOnlyList().get(0).getNewName().setWhiteBefore(", only: "); //works, but a bit hacky
			}
			else {
				tempNode.getOnlyList().get(0).getName().setWhiteBefore(", only: ");
			}
		}
		
		//context.
		contextNode.setOnlyList(tempNode.getOnlyList());
		*/		
		
		return contextNode;	
		
	}	
		
	
	public static IASTNode variableDeclaration(ASTSubroutineSubprogramNode context, VariableDeclaration mapping, List<Annotation> anots) {
		
		ST code = STWithDoc("\ntype(<type>) :: DEFAULT_VAR_NAME\n", anots);
		code.add("type", mapping.getType().getDerivedType().getExpr().getId());
		
		/*
		String typeStmt;
		if (mapping.getType().isDerived()) {
			typeStmt = "\ntype(" + mapping.getType().getDerivedType().getExpr().getId() + ")";
		}
		else {
			//TODO: handle other types
			typeStmt = "\nundefined";
		}
		
		typeStmt = typeStmt + " :: DEFAULT_VAR_NAME\n";
		*/
		
		ASTTypeDeclarationStmtNode tds = (ASTTypeDeclarationStmtNode) CodeExtraction.parseLiteralStatement(code.render(LINE_WIDTH));
		ASTTypeDeclarationStmtNode last = context.findLast(ASTTypeDeclarationStmtNode.class);
		if (last != null) {
			context.getBody().insertAfter(last, tds);
		}
		else {
			context.getBody().add(tds);
		}
		
		return tds;
	}
	
	public static void declaredEntity(ASTTypeDeclarationStmtNode context, DeclaredEntity mapping, String value, List<Annotation> anots) {
		context.getEntityDeclList().get(0).getObjectName().getObjectName().setText(value);
	}
	
	public static void subroutineName(ASTSubroutineSubprogramNode context, SubroutineName mapping, String value, List<Annotation> anots) {
		String newName = value;
		if (mapping.getName() != null && mapping.getName().getExpr() != null) {
			newName = mapping.getName().getExpr().getId();
		}
		if (newName != null && newName.length() > 0) {
			context.getSubroutineStmt().getSubroutineName().getSubroutineName().setText(newName);
		}
	}
	
	public static IASTNode subroutine(IFortranAST context, Subroutine mapping, List<Annotation> anots) {
		return subroutine((ASTModuleNode) context.getRoot().getProgramUnitList().get(0), mapping, anots);
	}
	
	public static IASTNode subroutine(ASTModuleNode context, Subroutine mapping, List<Annotation> anots) {				
		
		ST code = STWithDoc("subroutine <name>(<vars:{v|<v.id>}; separator=\", \">)\n"
					   + "<vars, types, intents:{v, t, i|    <t><if(i)>, intent(<i>)<endif> :: <v.id>}; separator=\"\n\">\n"
					   + "end subroutine\n", anots);
		
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
		
		//System.out.println("Code to parse:\n" + code.render(LINE_WIDTH) + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render(LINE_WIDTH));
		
		//assume it is a module for now
		//ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
	
		context.getModuleBody().add(ssn);
		return ssn;
	}
	
	public static IASTNode functionAssignment(ASTSubroutineSubprogramNode context, FunctionAssignment mapping, List<Annotation> anots) {		
		
		ST code = STWithDoc("<var> = <func>(<params:{p|<if(!p.optional || p.value.expr.id)><if(p.keyword)><p.keyword> = <endif><if(p.value.expr.literal)><p.value.expr.literal><else><p.value.expr.id><endif><endif>}; separator=\", \">)", anots);
		code.add("var", mapping.getLhs().getExpr().getId());
		code.add("func", mapping.getFunctionName().getExpr().getId());
		code.add("params", mapping.getParams());
		
		ASTAssignmentStmtNode node = (ASTAssignmentStmtNode) CodeExtraction.parseLiteralStatement(code.render(LINE_WIDTH));
		
		//TODO:for now, add to end
		context.getBody().add(node);
		return node;
		
	}
	
	static String getAnnotationValue(List<Annotation> anots, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : anots) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return a.getValue();
			}
		}
		return null;
	}
	
	static String getDoc(List<Annotation> anots) {
		return getAnnotationValue(anots, "doc");
	}
	
}
