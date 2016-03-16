package org.earthsystemmodeling.cupid.nuopc.v7r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class NUOPCFrameworkManager {

	private static NUOPCFrameworkManager instance;
	
	protected Map<IFile, NUOPCDriver> driverMap;
	protected Map<IFile, NUOPCModel> modelMap;
	protected Map<IFile, NUOPCMediator> mediatorMap;
	
	protected NUOPCFrameworkManager() {
		driverMap = new HashMap<IFile, NUOPCDriver>();
		modelMap = new HashMap<IFile, NUOPCModel>();
		mediatorMap = new HashMap<IFile, NUOPCMediator>();
	}
	
	public static NUOPCFrameworkManager getInstance() {
		if (instance == null) {
			instance = new NUOPCFrameworkManager();
		}
		return instance;
	}
	
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
	
	public void ensureDBIsUpToDate() {
		
		Job updateJob = new Job("Update NUOPC database") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				PhotranVPG vpg = PhotranVPG.getInstance();
				vpg.ensureVPGIsUpToDate(monitor);
				
				clearDB();
				
				List<IFile> files;
				files = vpg.findFilesThatImportModule("NUOPC_Driver");
				for (IFile f : files) {
					NUOPCDriver driver = new NUOPCDriver(f).reverse();
					if (driver != null) {
						driverMap.put(f, driver);
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Model");
				for (IFile f : files) {
					NUOPCModel model = new NUOPCModel(f).reverse();
					if (model != null) {
						modelMap.put(f, model);
					}
				}
				
				files = vpg.findFilesThatImportModule("NUOPC_Mediator");
				for (IFile f : files) {
					NUOPCMediator mediator = new NUOPCMediator(f).reverse();
					if (mediator != null) {
						mediatorMap.put(f, mediator);
					}
				}
			
				return Status.OK_STATUS;
			}
			
		};
		
		updateJob.schedule();
		try {
			updateJob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	protected void clearDB() {
		driverMap.clear();
		modelMap.clear();
		mediatorMap.clear();
	}
	
	
}
