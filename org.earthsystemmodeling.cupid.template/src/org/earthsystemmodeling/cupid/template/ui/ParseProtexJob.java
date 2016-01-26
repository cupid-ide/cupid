package org.earthsystemmodeling.cupid.template.ui;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI;
import org.earthsystemmodeling.cupid.template.core.ProtexASTVisitor;
import org.earthsystemmodeling.cupid.template.core.ProtexParser;
import org.earthsystemmodeling.cupid.template.core.ProtexParser.ProtexParsingException;
import org.earthsystemmodeling.cupid.template.core.ProtexStore;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICElementVisitor;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ParseProtexJob extends Job {

	private String apiid;
	private List<Object> resourcesToParse;
	private ICElement root = null;
	
	public ParseProtexJob(String jobname, String apiid, List<Object> resourcesToParse) {
		super(jobname);
		this.apiid = apiid;
		this.resourcesToParse = resourcesToParse;
	}
	
	public ParseProtexJob(String jobname, String apiid, ICElement root) {
		super(jobname);
		this.apiid = apiid;
		this.root = root;	
	}
		
	@Override
	public IStatus run(final IProgressMonitor monitor) {

		if (root != null) {
			
			final List<Object> resourceList = new ArrayList<Object>();
			try {
				root.accept(new ICElementVisitor() {
					@Override
					public boolean visit(ICElement element) throws CoreException {
						if (element instanceof ITranslationUnit) {
							IFile file = ((ITranslationUnit) element).getFile();
							//if (file.getFileExtension().equalsIgnoreCase("F90") || file.getFileExtension().equalsIgnoreCase("F")) {
							if (include(file)) {
								resourceList.add(file);						
							}
						}
						if (monitor.isCanceled()) {
							return false;
						}
						return true;
					}
				});
			} catch (CoreException e) {
				CupidActivator.log("Error retrieving resource for Protex parsing", e);
			}
			
			resourcesToParse = resourceList;
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
		}
		else {
			List<Object> filteredList = new ArrayList<Object>(resourcesToParse.size());
			for (Object res : resourcesToParse) {
				if ((res instanceof IFile) && include((IFile) res)) {
					filteredList.add(res);
				}
			}
			resourcesToParse = filteredList;
		}
		
		monitor.beginTask("Parsing Protex", resourcesToParse.size());  

		PhotranVPG.getInstance().releaseAllASTs();
		final ProtexAPI protexAPI = new ProtexAPI(apiid);

		for (Object res : resourcesToParse) {
			if (res instanceof IFile) {
				IFile file = (IFile) res;
				//if (file.getFileExtension()!=null && file.getFileExtension().equalsIgnoreCase("F90") || file.getFileExtension().equalsIgnoreCase("F")) {
				if (include(file)) {
					monitor.subTask(file.getName());
					
					IFortranAST ast = PhotranVPG.getInstance().acquirePermanentAST(file);
					if (ast == null) {
						CupidActivator.debug("Error parsing Fortran in " + file.getFullPath());
					}
					else {
						ast.accept(new ProtexASTVisitor(protexAPI));
						PhotranVPG.getInstance().releaseAST(file);
					}
					
					/*
					try {
						ProtexParser parser = new ProtexParser(file.getContents(), protexAPI);
						parser.parse();
					} catch (CoreException e) {
						CupidActivator.log("Error opening file for Protex Parsing: " + file.getName(), e);
					} catch (ProtexParsingException e) {
						CupidActivator.log("Error parsing Protex in file: " + file.getName(), e);
					}
					*/
					monitor.worked(1);
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
				}
			}
		}
		
		ProtexStore store = ProtexStore.getInstance();
		store.save(protexAPI);

		monitor.done();
		return Status.OK_STATUS;

	}

	private boolean include(IFile file) {		
		return file.exists() && 
				PhotranVPG.getInstance().shouldProcessFile(file);		
	}
}
