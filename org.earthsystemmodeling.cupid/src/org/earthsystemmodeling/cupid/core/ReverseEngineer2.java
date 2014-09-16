package org.earthsystemmodeling.cupid.core;


import java.util.HashSet;
import java.util.Set;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.properties.CupidPropertyPage;
import org.earthsystemmodeling.cupid.util.CodeQuery2;
import org.earthsystemmodeling.cupid.util.CodeTransformation;
import org.earthsystemmodeling.psyche.ConceptDef;
import org.earthsystemmodeling.psyche.Language;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.osgi.framework.FrameworkUtil;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.NoMoreSolutionException;
import alice.tuprolog.NoSolutionException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Struct;
import alice.tuprolog.Theory;
import alice.tuprolog.UnknownVarException;
import alice.tuprolog.Var;
import alice.tuprolog.lib.InvalidObjectIdException;
import alice.tuprolog.lib.JavaLibrary;

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
				
		vpg.releaseAllASTs();
		
		try {
			//String fileList = project.getPersistentProperty(CupidPropertyPage.NUOPC_FILES_QN);
			IEclipsePreferences prefs = new ProjectScope(project).getNode("org.earthsystemmodeling.cupid");
			String fileList = prefs.get(CupidPropertyPage.NUOPC_FILES_PROPERTY, null);	
		
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
				Set<IFile> files = getFiles(project.members());
				for (IFile f : files) {
					CupidActivator.log("ReverseEngineer2.reverseEngineer: adding file: " + f.getFullPath());
					IFortranAST ast = vpg.acquireTransientAST(f);							
					if (ast == null) {
						CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer - AST not found: " + f.getFullPath());
					}
					else {
						asts.add(ast);
					}
				}
				CupidActivator.log(files.size() + " total Fortran files found in project.");
			}
		} 
		catch (CoreException e1) {
			CupidActivator.log(Status.ERROR, "ReverseEngineer2.reverseEngineer", e1);
			return fsm;
		}
		
		CupidActivator.log("Found ASTs for " + asts.size() + " files.");
		
		//root = reverse(fsm, asts, topConcept, root, fsm.getMappings(), eFactory);
	
		//testing indexing code
		
		//CodeDBIndex codeIndex = CodeDBIndex.getInstance();
		//codeIndex.indexASTs(asts);
		//codeIndex.printClauseList();
		
		/*
		Prolog prolog = codeIndex.getProlog();
		try {
			
			// subroutine(#id, #parent, name, [#stmt_1, #stmt_2...])
			// call(#id, #parent, subroutine name)
			//def(#id, ref(file, offset, length),  type, intentIn?, intentOut?)
			//FrameworkUtil.getBundle(ReverseEngineer2.class).getResource("").
			
			prolog.addTheory(new Theory("nuopc_module(_id, _name) :- module(_id, _, _name, _), uses(_, _id, 'NUOPC', _)."));
			prolog.addTheory(new Theory("nuopc_module(_id, _name, _ss) :- nuopc_module(_id, _name), "
					+ "subroutine(_sid, _id, _ss, _), "
					+ "call(_, _sid, 'NUOPC_CompDerive')."));
			
			prolog.addTheory(new Theory("esmf_method(_id, _name) :- subroutine(_id, _, _name, _), "
					+ "subroutineParam(_param0, _id, 0, _name0, _def0), "
					+ "def(_def0, _, 'type(esmf_gridcomp)', _, _)."));
			
			
			//SolveInfo sol = prolog.solve("nuopc_module(_id, _name, _ss).");
			SolveInfo sol = prolog.solve("esmf_method(_id, _name).");
			while (true) {
				System.out.println("\nSolution: ");
				try {
					for (Var var : sol.getBindingVars()) {
						System.out.println("\t" + var.getName() + " = " + sol.getVarValue(var.getName()));
					}
					
					//get object
					//JavaLibrary lib = (JavaLibrary) prolog.getLibrary("alice.tuprolog.lib.JavaLibrary");
					//Object obj = lib.getRegisteredObject((Struct) sol.getTerm("MObj"));
					
					sol = prolog.solveNext();
				} catch (NoSolutionException | NoMoreSolutionException e) {
					break;
				}
				
			
			}	
						
		} catch (MalformedGoalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidTheoryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
		*/
		
		fsm.reverse(asts);
		
		CupidActivator.log("exit ReverseEngineer2.reverseEngineer");
		
		return fsm;
		
	}
	
	
	
	private static Set<IFile> getFiles(IResource[] resources) throws CoreException {
		Set<IFile> files = new HashSet<IFile>();
		for (IResource r : resources) {
			if (r instanceof IFile) {
				if (r.getProjectRelativePath().getFileExtension() != null &&
					(r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f") ||
					r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f90"))) {
					files.add((IFile) r);
				}
			}
			else if (r instanceof IFolder) {
				files.addAll( getFiles(  ((IFolder) r).members() )  );
			}
		}
		return files;
	
	}
		
	
}
