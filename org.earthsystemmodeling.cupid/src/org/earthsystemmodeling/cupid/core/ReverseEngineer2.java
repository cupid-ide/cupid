package org.earthsystemmodeling.cupid.core;


import java.util.HashSet;
import java.util.Set;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.properties.CupidPropertyPage;
import org.earthsystemmodeling.cupid.util.CodeQuery2;
import org.earthsystemmodeling.cupid.util.CodeTransformation;
import org.earthsystemmodeling.psyche.ConceptDef;
import org.earthsystemmodeling.psyche.Language;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ReverseEngineer2 {
	 
	
	public static FSM<?> reverseEngineer(Language lang, IProject project, PhotranVPG vpg) {
		
		CupidActivator.log("enter ReverseEngineer2.reverseEngineer");
		
		ConceptDef topConcept = null;
		for (ConceptDef cd : lang.getConceptDef()) {
			if (cd.isTop()) {
				topConcept = cd;
				break;
			}
		}
		
		if (topConcept == null) {
			throw new RuntimeException("Language " + lang.getName() + " does not define a top level concept.");
		}
				
		FSM<?> fsm = new FSM<EObject>(lang, project, CodeQuery2.class, CodeTransformation.class, CupidActivator.getDefault().getLog());
		
		//a bit of a hack here for the root name
		//EStructuralFeature sfName = topClass.getEStructuralFeature("name");
		//if (sfName != null) {
		//	root.eSet(sfName, project.getName());
		//}
				
		Set<IFortranAST> asts = new HashSet<IFortranAST>();	
				
		try {
			String fileList = project.getPersistentProperty(CupidPropertyPage.NUOPC_FILES_QN);
			if (fileList != null && fileList.length() > 1) {
				for (String path : fileList.split("\n")) {		
					IFile f = (IFile) project.findMember(path.trim());
					//System.out.println("Adding Fortran file: " + path.trim());
					CupidActivator.log("ReverseEngineer2.reverseEngineer: adding file: " + path.trim());
					if (f != null) {
						IFortranAST ast = vpg.acquireTransientAST(f);						
						if (ast == null) {
							CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer - AST not found: " + f.getFullPath());
						}
						else {
							asts.add(ast);
						}
					}
					else {
						//System.out.println("File not found in project: " + path);
						CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer - File not found: " + path);
					}
				}
			}
			else {
				for (IResource r : project.members()) {
					//TODO: deal with folders - recursive method
					if (r instanceof IFile) {
						//System.out.println("Full path: " + r.getFullPath());
						//TODO: deal with these file extensions
						if (r.getProjectRelativePath().getFileExtension() != null &&
							(r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f") ||
							r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f90"))) {
							CupidActivator.log("ReverseEngineer2.reverseEngineer: adding file: " + r.getFullPath());
							IFortranAST ast = vpg.acquireTransientAST((IFile) r);							
							if (ast == null) {
								CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer - AST not found: " + r.getFullPath());
							}
							else {
								asts.add(ast);
							}
						}
					
					}
				}
			}
		} 
		catch (CoreException e1) {
			CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer", e1);
			//e1.printStackTrace();
			return fsm;
		}
		
		//root = reverse(fsm, asts, topConcept, root, fsm.getMappings(), eFactory);
	
		fsm.reverse(asts);
		
		CupidActivator.log("exit ReverseEngineer2.reverseEngineer");
		
		return fsm;
		
	}
		
	
}
