package org.earthsystemmodeling.cupid.nuopc.v7r;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.NUOPCFrameworkDB;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.core.vpg.eclipse.VPGSchedulingRule;


@SuppressWarnings("restriction")
public class NUOPCFrameworkManager {

	private static NUOPCFrameworkManager instance;
	
	protected NUOPCFrameworkDB db;
	
	private static NUOPCResourceChangeListener nuopcResourceListener;
	
	private List<INUOPCDatabaseListener> listeners;
	
	protected NUOPCFrameworkManager() {
		db = NUOPCFrameworkDB.getInstance();
		listeners = new LinkedList<INUOPCDatabaseListener>();
	}
	
	public static NUOPCFrameworkManager getInstance() {
		if (instance == null) {
			instance = new NUOPCFrameworkManager();
		}
		return instance;
	}
	
	public void start() {
		if (nuopcResourceListener == null) {
			nuopcResourceListener = new NUOPCResourceChangeListener();
		}
		ResourcesPlugin.getWorkspace().addResourceChangeListener(nuopcResourceListener, IResourceChangeEvent.POST_CHANGE);
		ensureDBIsUpToDate();
	}
	
	public void stop() {
		if (nuopcResourceListener != null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(nuopcResourceListener);
		}
	}
	
	private final class NUOPCResourceChangeListener implements IResourceChangeListener {
        @Override
		public void resourceChanged(IResourceChangeEvent event) {
            if (!(event.getSource() instanceof IWorkspace)) return;

            if (event.getType() != IResourceChangeEvent.POST_CHANGE) return;

            final IResourceDelta delta = event.getDelta();
            if (delta == null) return;
            
            //wait a bit for VPG update job to start first
            new NUOPCResourceDeltaJob(delta).schedule(500);
        }
    }

    private final class NUOPCResourceDeltaJob extends WorkspaceJob {
        private final IResourceDelta delta;
        //private static final String FAMILY = "NUOPCResourceDeltaJob.family";

        private NUOPCResourceDeltaJob(IResourceDelta delta) {
            super("NUOPC database indexer");
        	this.delta = delta;
        	setRule(VPGSchedulingRule.getInstance());
        	
        }
        
        /*
        @Override
        public boolean belongsTo(Object family) {
        	return family == FAMILY;
        }
        
        @Override
        public boolean shouldSchedule() {
        	return getJobManager().find(FAMILY).length == 0;
        }
		*/

        @Override 
        public IStatus runInWorkspace(final IProgressMonitor monitor) {
            try {
            	monitor.beginTask("Synchronizing NUOPC database", IProgressMonitor.UNKNOWN);
                NUOPCResourceDeltaVisitor visitor = new NUOPCResourceDeltaVisitor();
                delta.accept(visitor);
            }
            catch (CoreException e) {
                CupidActivator.log("Error in NUOPC update background process", e);
            }
            finally {
                monitor.done();
            }
            return Status.OK_STATUS;
        }
    }

    private final class NUOPCResourceDeltaVisitor implements IResourceDeltaVisitor {
 
    	@Override
        public boolean visit(IResourceDelta delta) {
            try {
                IResource resource = delta.getResource();
                if (!(resource instanceof IFile)) {
                	return true;
                }
                IFile file = (IFile) resource;

                switch (delta.getKind()) {
                case IResourceDelta.ADDED:
                case IResourceDelta.REMOVED:
                    updateDB(file, delta);
                    break;	

                case IResourceDelta.CHANGED:
//                	if ((delta.getFlags() & IResourceDelta.MARKERS) != 0) {
//                		System.out.println(delta.getFlags());
//                	}
//                	if ((delta.getFlags() & IResourceDelta.CONTENT) != 0) {
//                		System.out.println(delta.getFlags());
//                	}
//                	if ((delta.getFlags() & IResourceDelta.REPLACED) != 0) {
//                		System.out.println(delta.getFlags());
//                	}
                    if ((delta.getFlags() & (IResourceDelta.CONTENT|IResourceDelta.REPLACED)) != 0) {
                    	updateDB(file, delta);
                    }
                    break;
                
                }
            }
            catch (Exception e) {
               CupidActivator.log("Error in NUOPC resource visitor", e);        
            }
            return true;
        }

    }
	
	
    public <C extends CodeConcept<?,?>> C acquireConcept(IFile file) {
		return acquireConcept(file, false);
	}
    
	@SuppressWarnings("unchecked")
	public <C extends CodeConcept<?,?>> C acquireConcept(IFile file, boolean forceUpdate) {
		if (forceUpdate) {
			Job j = ensureDBIsUpToDate();
			try {
				j.join();
			} catch (InterruptedException e) {
				CupidActivator.debug("Failed to update NUOPC database", e);
			}
		}
		return (C) db.retrieve(file);
	}
	
	public <C extends CodeConcept<?,?>> C acquireConcept(IFile file, boolean forceUpdate, boolean throwException) throws ReverseEngineerException {
		C concept = acquireConcept(file, forceUpdate);
		if (concept == null) {
			throw new ReverseEngineerException("Expected concept not present");
		}
		return concept;
	}
	
	public List<NUOPCDriver> listAllDrivers() {
		//ensureDBIsUpToDate();
		return db.retrieveAll(NUOPCDriver.class);
	}
		
	public List<NUOPCModel> listAllModels() {
		//ensureDBIsUpToDate();
		return db.retrieveAll(NUOPCModel.class);
	}
	
	public List<NUOPCMediator> listAllMediators() {
		//ensureDBIsUpToDate();
		return db.retrieveAll(NUOPCMediator.class);
	}
	
	public Set<Entry<IFile, CodeConcept<?, ?>>> listAllComponents() {
		//ensureDBIsUpToDate();
		return db.retrieveAll();
	}
	
	public <C extends CodeConcept<?,?>> List<C> listAllComponents(Class<? extends CodeConcept<?,?>> clazz) {
		//ensureDBIsUpToDate();
		return db.retrieveAll(clazz);
	}
	
	
	private void updateDB(IFile file, IResourceDelta delta) {
		
		boolean updated = false;
		
		switch (delta.getKind()) {
        case IResourceDelta.ADDED:
        case IResourceDelta.CHANGED:
        	
        	final PhotranVPG vpg = PhotranVPG.getInstance();
        	if (vpg.findFilesThatImportModule("NUOPC_Driver").contains(file)) {
        		try {
					NUOPCDriver driver = new NUOPCDriver(file).reverse();
					if (driver != null) {
						db.store(file, driver);						
					}
				} catch (ReverseEngineerException e) {
					CupidActivator.debug("", e);					
				}
        		updated = true;
        	}
        	else if (vpg.findFilesThatImportModule("NUOPC_Model").contains(file)) {
        		try {
					NUOPCModel model = new NUOPCModel(file).reverse();
					if (model != null) {
						db.store(file, model);						
					}
				} catch (ReverseEngineerException e) {
					CupidActivator.debug("", e);					
				}
        		updated = true;
        	}
        	else if (vpg.findFilesThatImportModule("NUOPC_Mediator").contains(file)) {
        		try {
					NUOPCMediator mediator = new NUOPCMediator(file).reverse();
					if (mediator != null) {
						db.store(file, mediator);						
					}
				} catch (ReverseEngineerException e) {
					CupidActivator.debug("", e);					
				}
        		updated = true;
        	}      	
        	break;
        
        case IResourceDelta.REMOVED:
            if (db.retrieve(file) != null) {
            	db.delete(file);
            	updated = true;
            }
            break;	
		}
		
		if (updated) {
			for (INUOPCDatabaseListener listener : listeners) {
				listener.updated();
			}
		}
	}
	
	private void refreshDB() {
		
		final PhotranVPG vpg = PhotranVPG.getInstance();
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
		
		for (INUOPCDatabaseListener listener : listeners) {
			listener.updated();
		}
		
		
	}
	
	
	public Job ensureDBIsUpToDate() {
		
		Job updateJob = new Job("Update NUOPC database") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				final PhotranVPG vpg = PhotranVPG.getInstance();
				monitor.beginTask("Updating NUOPC database", 10);
				monitor.subTask("Photran indexer");
				vpg.ensureVPGIsUpToDate(new SubProgressMonitor(monitor, 9));

				refreshDB();
				
				monitor.worked(1);
				monitor.done();
				return Status.OK_STATUS;
			}
			
		};
				
		updateJob.setRule(VPGSchedulingRule.getInstance());
		updateJob.schedule();
		return updateJob;
		
		//try {
		//	updateJob.join();
		//} catch (InterruptedException e) {
		//	CupidActivator.debug("", e);
		//}
		
		
	}
	
	
	public void addDBListener(INUOPCDatabaseListener listener) {
		listeners.add(listener);
	}
	
	public void removeDBListener(INUOPCDatabaseListener listener) {
		listeners.remove(listener);
	}
	
	public static interface INUOPCDatabaseListener {
		public void updated();
	}
	
	
}
