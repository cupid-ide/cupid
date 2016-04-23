package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.NUOPCFrameworkDB;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.core.vpg.eclipse.VPGSchedulingRule;

@SuppressWarnings("restriction")
public class NUOPCFrameworkManager {

	private static NUOPCFrameworkManager instance;
	
	protected NUOPCFrameworkDB db;
	
	protected NUOPCFrameworkManager() {
		db = NUOPCFrameworkDB.getInstance();
	}
	
	public static NUOPCFrameworkManager getInstance() {
		if (instance == null) {
			instance = new NUOPCFrameworkManager();
		}
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <C extends CodeConcept<?,?>> C acquireConcept(IFile file) {
		ensureDBIsUpToDate();
		return (C) db.retrieve(file);
	}
	
	/*
	public List<NUOPCDriver> listAllDrivers() {
		return new ArrayList<NUOPCDriver>(driverMap.values());
	}
	
	public NUOPCDriver findDriverForFile(IFile file) {
		return driverMap.get(file);
	}
	
	public List<NUOPCModel> listAllModels() {
		return new ArrayList<NUOPCModel>(modelMap.values());
	}
	
	public NUOPCModel findModelForFile(IFile file) {
		return modelMap.get(file);
	}

	public List<NUOPCMediator> listAllMediators() {
		return new ArrayList<NUOPCMediator>(mediatorMap.values());
	}
	
	public NUOPCMediator findMediatorForFile(IFile file) {
		return mediatorMap.get(file);
	}
	
	*/
	
	protected void ensureDBIsUpToDate() {
		
		Job updateJob = new Job("Update NUOPC database") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				PhotranVPG vpg = PhotranVPG.getInstance();
				vpg.ensureVPGIsUpToDate(monitor);
				
				//WorkspaceJob job = vpg.queueJobToEnsureVPGIsUpToDate();
				//try {
				//	job.join();
				//} catch (InterruptedException ie) {
				//	CupidActivator.log("", ie);
				//}
				
				db.clearMarksToKeep();
				
				List<IFile> files;
				files = vpg.findFilesThatImportModule("NUOPC_Driver");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?					
						if (db.isOutOfDate(f)) {
							NUOPCDriver driver;
							driver = new NUOPCDriver(f).reverse();
							if (driver != null) {
								db.store(f, driver);
								db.markToKeep(f);
							}
						}
						else {
							db.markToKeep(f);
						}
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Model");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?
						if (db.isOutOfDate(f)) {
							NUOPCModel model;
							model = new NUOPCModel(f).reverse();
							if (model != null) {
								db.store(f, model);
								db.markToKeep(f);
							}
						}
						else {
							db.markToKeep(f);
						}
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Mediator");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?
						if (db.isOutOfDate(f)) {
							NUOPCMediator mediator;
							mediator = new NUOPCMediator(f).reverse();
							if (mediator != null) {
								db.store(f, mediator);
								db.markToKeep(f);
							}
						}
						else {
							db.markToKeep(f);
						}
					}
				}
			
				db.removeUnmarked();
				
				return Status.OK_STATUS;
			}
			
		};
		
		updateJob.setRule(VPGSchedulingRule.getInstance());
		updateJob.schedule();
		try {
			updateJob.join();
		} catch (InterruptedException e) {
			CupidActivator.debug("", e);
		}
		
		
		
	}
	
	
	
}
