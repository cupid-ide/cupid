package org.earthsystemmodeling.cupid.nuopc.v7r;

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
	
	public <C extends CodeConcept<?,?>> C acquireConcept(IFile file, boolean throwException) throws ReverseEngineerException {
		C concept = acquireConcept(file);
		if (concept == null) {
			throw new ReverseEngineerException("Expected concept not present");
		}
		return concept;
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
				
				db.clear();
				//db.clearMarksToKeep();
				
				List<IFile> files;
				files = vpg.findFilesThatImportModule("NUOPC_Driver");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?					
						if (db.isOutOfDate(f)) {
							NUOPCDriver driver;
							try {
								driver = new NUOPCDriver(f).reverse();
							} catch (ReverseEngineerException e) {
								CupidActivator.debug("", e);
								continue;
							}
							if (driver != null) {
								db.store(f, driver);
								//db.markToKeep(f);
							}
						}
						else {
						//db.markToKeep(f);
						}
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Model");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?
						if (db.isOutOfDate(f)) {
							NUOPCModel model;
							try {
								model = new NUOPCModel(f).reverse();
							} catch (ReverseEngineerException e) {
								CupidActivator.debug("", e);
								continue;
							}
							if (model != null) {
								db.store(f, model);
								//db.markToKeep(f);
							}
						}
						else {
							//db.markToKeep(f);
						}
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Mediator");
				for (IFile f : files) {
					if (f != null) {  //TODO: why null?
						if (db.isOutOfDate(f)) {
							NUOPCMediator mediator;
							try {
								mediator = new NUOPCMediator(f).reverse();
							} catch (ReverseEngineerException e) {
								CupidActivator.debug("", e);
								continue;
							}
							if (mediator != null) {
								db.store(f, mediator);
								//db.markToKeep(f);
							}
						}
						else {
							//db.markToKeep(f);
						}
					}
				}
			
				//db.removeUnmarked();
				
				return Status.OK_STATUS;
			}
			
		};
		
		updateJob.setRule(VPGSchedulingRule.getInstance());
		updateJob.schedule();
		//boolean completed = false;
		try {
			updateJob.join();
		} catch (InterruptedException e) {
			CupidActivator.debug("", e);
		}
		
		//if (!completed) {
		//	CupidActivator.debug("Failed to update Fortran database.");
		//}
		
		
	}
	
	
	
}
