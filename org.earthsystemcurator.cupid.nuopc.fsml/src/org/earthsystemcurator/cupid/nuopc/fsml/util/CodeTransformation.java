package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.Intent;
import org.earthsystemcurator.cupidLanguage.Subroutine;
import org.earthsystemcurator.cupidLanguage.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.stringtemplate.v4.ST;

@SuppressWarnings("restriction")
public class CodeTransformation {

	public static IASTNode call(IASTNode context, Call mapping) {					
		
		ST code = new ST("\ncall <name.id>(<params:{p|<if(!p.optional || p.value.id)><if(p.keyword)><p.keyword> = <endif><p.value.id><endif>}; separator=\", \">)\n");
		code.add("name", mapping.getSubroutineName());
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
		else if (t.isDerived()) return "type(" + ((IDOrWildcard) t.getDerivedType()).getId() + ")";
		else return "TYPE_NOT_DEFINED";
	}
	
	public static String intentToString(Intent i) {
		if (i.isIn()) return "in";
		else if (i.isOut()) return "out";
		else return "inout";
	}
	
	public static IASTNode subroutine(IFortranAST context, Subroutine mapping) {		
		
		//TODO: deal with documentation
		//String doc = Regex.getDocFromAnnotation(modelElem.eClass());
		String doc = null;
		
		ST code = new ST("\n\n<if(doc)>\n!\n! <doc; wrap=\"\n! \", separator=\" \">\n!\n<endif>"
				       + "subroutine <name.id>(<vars:{v|<v.id>}; separator=\", \">)\n"
					   + "<vars, types, intents:{v, t, i|    <t><if(i)>, intent(<i>)<endif> :: <v.id>}; separator=\"\n\">\n"
					   + "end subroutine\n");
				
		code.add("name", mapping.getName());
		//code.add("params", mapping.getParams());
		for (FormalParam fp : mapping.getParams()) {
			code.add("types", typeToString(fp.getType()));
			code.add("intents", intentToString(fp.getIntent()));
			code.add("vars", fp.getName());
		}
		if (doc != null) {
			doc = doc.replaceAll("\n", "\n! ");
			code.add("doc", doc.split(" "));			
		}
		
		System.out.println("Code to parse:\n" + code.render(72) + "\n");
		
		ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code.render(72));
		
		//assume it is a module for now
		ASTModuleNode amn = (ASTModuleNode) context.getRoot().getProgramUnitList().get(0);
	
		amn.getModuleBody().add(ssn);
		return ssn;
	}
	
}
