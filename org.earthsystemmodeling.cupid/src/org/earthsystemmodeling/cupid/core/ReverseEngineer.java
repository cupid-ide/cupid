package org.earthsystemmodeling.cupid.core;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ReverseEngineer {
	 
	protected static Language lang = loadLanguageEcore();
	
	protected static Language loadLanguageEcore() {
		
		CupidActivator.log("enter ReverseEngineer.loadLanguageEcore");
		
		//platform:/resource/nuopcdef/src/nuopc.cupid
		//platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/nuopc.cupid
		
		//default set in /org.earthsystemmodeling.cupid/src/org/earthsystemcurator/cupid/nuopc/fsml/preferences/PreferenceInitializer.java
		
		String langURIString = CupidActivator.getDefault().getPreferenceStore().getString(CupidPreferencePage.CUPID_LANGUAGE_URI);
		CupidActivator.log("ReverseEngineer.loadLanguageEcore: language URI = " + langURIString);
		URI langURI = URI.createURI(langURIString);
		
		
		ResourceSet rs = new ResourceSetImpl();
		Resource langResource = null;
		try {
			langResource = rs.getResource(langURI, true);
		}
		catch (WrappedException we) {
			CupidActivator.log(Status.ERROR, "Cupid language definition file not found: " + langURI, we);
			throw new RuntimeException("Cupid language definition file not found: " + langURI);
		}
		Language lang = (Language) langResource.getContents().get(0);
		
		//add default NUOPC metamodel to registry if necessary
		
		//if (EPackage.Registry.INSTANCE.getEPackage("http://www.earthsystemcurator.org/nuopcgen") == null) {
		CupidActivator.log("ReverseEngineer.loadLanguageEcore: registering EPackage");
		//URI ecoreURI = URI.createURI("platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/NUOPC.ecore");
		URI ecoreURI = langURI.trimFileExtension().appendFileExtension("ecore");	
		
		Resource ecoreResource = rs.getResource(ecoreURI, true);
		EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put("http://www.earthsystemcurator.org/nuopcgen", ecorePackage);
		CupidActivator.log("ReverseEngineer.loadLanguageEcore: registering EPackage - complete");
		
		
		CupidActivator.log("exit ReverseEngineer.loadLanguageEcore");
		
		return lang;
		
	}

	public static FSM<?> reverseEngineer(IProject project) {
		
		List<IFile> files = new ArrayList<IFile>();
		
		IEclipsePreferences prefs = new ProjectScope(project).getNode("org.earthsystemmodeling.cupid");
		String fileList = prefs.get(CupidPropertyPage.NUOPC_FILES_PROPERTY, null);	
		
		if (fileList != null && fileList.length() > 1) {
			for (String path : fileList.split("\n")) {		
				IFile f = (IFile) project.findMember(path.trim());
				if (f!=null) {
					files.add(f);
				}
			}
		}
		else {
			try {
				files.addAll(getFiles(project.members()));
			} catch (CoreException e) {
				CupidActivator.log("Error getting project members", e);
			}
		}
		
		return reverseEngineer(files);
	} 
		
	public static FSM<?> reverseEngineer(IFile file) {
		ArrayList<IFile> lst = new ArrayList<IFile>();
		lst.add(file);
		return reverseEngineer(lst);
	}
	
	public static FSM<?> reverseEngineer(List<IFile> files) {
		
		CupidActivator.log("enter ReverseEngineer.reverseEngineer");
		
		if (files.size() == 0) {
			CupidActivator.log("empty file list");
			return null;
		}
		
		//preference determines whether to reload language every time
		//(slower but useful while developing the langauge definition)
		boolean langReload = CupidActivator.getDefault().getPreferenceStore().getBoolean(CupidPreferencePage.CUPID_LANGUAGE_RELOAD);
		
		if (langReload || lang == null) {
			lang = loadLanguageEcore();
		}
		
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
		
		//TODO: assume all files are from same project
		IProject project = files.get(0).getProject();
		
		FSM<?> fsm = new FSM<EObject>(lang, project, CodeQuery2.class, CodeTransformation.class, CupidActivator.getDefault().getLog());
		
		//a bit of a hack here for the root name
		//EStructuralFeature sfName = topClass.getEStructuralFeature("name");
		//if (sfName != null) {
		//	root.eSet(sfName, project.getName());
		//}
				
		Set<IFortranAST> asts = new HashSet<IFortranAST>();	
		
		PhotranVPG vpg = PhotranVPG.getInstance();
		vpg.releaseAllASTs();
		
		for (IFile f : files) {
			CupidActivator.log("ReverseEngineer.reverseEngineer: adding file: " + f.getFullPath());
			IFortranAST ast = vpg.acquireTransientAST(f);							
			if (ast == null) {
				CupidActivator.log(Status.ERROR, "ReverseEngineer.reverseEngineer - AST not found: " + f.getFullPath());
			}
			else {
				asts.add(ast);
			}
		}
		CupidActivator.log("Found ASTs for " + asts.size() + " files.");
		
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
		
		CupidActivator.log("exit ReverseEngineer.reverseEngineer");
		
		return fsm;
		
	}
	
	
	
	private static Set<IFile> getFiles(IResource[] resources)  {
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
				try {
					files.addAll( getFiles(  ((IFolder) r).members() )  );
				} catch (CoreException e) {
					CupidActivator.log("Error getting file list from project", e);
				}
			}
		}
		return files;
	
	}
		
	
}
