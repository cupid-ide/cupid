package org.earthsystemcurator.cupid.nuopc.fsml.fe;

import java.lang.annotation.Retention;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.jws.soap.InitParam;

import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class ForwardEngineer {

	public IASTNode forward(IASTNode ast, EObject modelElem) {
	
		EClass modelElemClass = modelElem.eClass();
		EAnnotation ann = modelElemClass.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		String mapping = ann.getDetails().get("mapping");
		System.out.println("mapping = " + mapping);
		int idx = mapping.indexOf(":");
		String mappingName;
		if (idx > 0) {
			mappingName = mapping.substring(0, idx).trim();
		}
		else {
			mappingName = mapping;
		}
		
		for (Method method : this.getClass().getMethods()) {
			if (method.getName().equalsIgnoreCase(mappingName)) {
				
				//assume no parameters for now - just match name
				try {
	
					Object result = method.invoke(this);
					System.out.println("result = " + result);
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		return null;
	}
	
	
	public IASTNode subroutine(String mapping, IASTNode context, EObject modelElem) {
		
		
		
		
		return null;
	}
	
	public IASTNode module(IASTNode inNode, EObject modelElem) {
		
		ASTModuleNode node = null;
		
		if (!(inNode instanceof ASTModuleNode)) {
			node = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit("module test\nimplicit none\ncontains\nsubroutine dummy()\nend subroutine\nend module");			
		}
		else {
			node = (ASTModuleNode) inNode;
		}
		
		//find subfeature with "name" mapping
		String moduleName = null;
		for (EStructuralFeature sf : modelElem.eClass().getEStructuralFeatures()) {
			EAnnotation sfann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
			String sfmapping = sfann.getDetails().get("mapping");
			if (sfmapping.equalsIgnoreCase("moduleName")) {
				moduleName = (String) modelElem.eGet(sf);
			}
		}
		
		if (node.getModuleStmt() == null)
			node.setModuleStmt(new ASTModuleStmtNode());
		
		if (node.getModuleStmt().getModuleName() == null)
			node.getModuleStmt().setModuleName(new ASTModuleNameNode());
		
		node.getModuleStmt().getModuleName().getModuleName().setText(moduleName);
		
		return node;
	}
	
	
	
}
