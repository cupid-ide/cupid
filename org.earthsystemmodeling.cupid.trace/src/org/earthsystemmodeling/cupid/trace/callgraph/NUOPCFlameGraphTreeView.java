package org.earthsystemmodeling.cupid.trace.callgraph;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.SubSecondTimeWithUnitFormat;
import org.eclipse.tracecompass.internal.analysis.timing.core.callgraph.AggregatedCalledFunction;
import org.eclipse.tracecompass.internal.analysis.timing.core.callgraph.AggregatedCalledFunctionStatistics;
import org.eclipse.tracecompass.internal.analysis.timing.core.callgraph.ThreadNode;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceClosedSignal;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;


public class NUOPCFlameGraphTreeView extends TmfView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCFlameGraphTreeView";

	private ITmfTrace fTrace;
	private NUOPCFlameGraphTreeViewer fViewer;
	private NUOPCCtfCallGraphAnalysis fFlamegraphModule = null;
	
	private final Semaphore fLock = new Semaphore(1);
    private Job fJob;
	
	public NUOPCFlameGraphTreeView() {
		super(ID);
	}
		 
	@Override
	public void createPartControl(Composite parent) {
		fViewer = new NUOPCFlameGraphTreeViewer(parent);
        ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
        if (trace != null) {
           traceSelected(new TmfTraceSelectedSignal(this, trace));
        }
	}
	
	@Override
	public void setFocus() {
	}
	
	@Override
    public void dispose() {
        super.dispose();
        if (fViewer != null) {
            fViewer.dispose();
        }
    }
	
	
	@TmfSignalHandler
    public void traceSelected(final TmfTraceSelectedSignal signal) {
        fTrace = signal.getTrace();
        if (fTrace != null) {
            fFlamegraphModule = TmfTraceUtils.getAnalysisModuleOfClass(fTrace, NUOPCCtfCallGraphAnalysis.class, NUOPCCtfCallGraphAnalysis.ID);
            buildFlameGraph(fFlamegraphModule);
        }
    }
	
	public void buildFlameGraph(NUOPCCtfCallGraphAnalysis callGraphAnalysis) {
        /*
         * Note for synchronization:
         *
         * Acquire the lock at entry. then we have 4 places to release it
         *
         * 1- if the lock failed
         *
         * 2- if the data is null and we have no UI to update
         *
         * 3- if the request is cancelled before it gets to the display
         *
         * 4- on a clean execution
         */
        Job job = fJob;
        if (job != null) {
            job.cancel();
        }
        try {
            fLock.acquire();
        } catch (InterruptedException e) {
            Activator.logWarning(e.getMessage(), e);
            fLock.release();
        }
        if (callGraphAnalysis == null) {
            fViewer.setInput(null);
            fLock.release();
            return;
        }
        fViewer.setInput(callGraphAnalysis.getThreadNodes());
        callGraphAnalysis.schedule();
        job = new Job("NUOPC Call Graph Analysis") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }
                    callGraphAnalysis.waitForCompletion(monitor);
                    Display.getDefault().asyncExec(() -> {
                        fViewer.setInput(callGraphAnalysis.getThreadNodes());
                        //fTimeGraphViewer.resetStartFinishTime();
                    });
                    return Status.OK_STATUS;
                } finally {
                    fJob = null;
                    fLock.release();
                }
            }
        };
        fJob = job;
        job.schedule();
    }
	
	@TmfSignalHandler
    public void traceClosed(final TmfTraceClosedSignal signal) {
        if (signal.getTrace() == fTrace) {
            fViewer.setInput(null);
        }
    }
	
	
	public class NUOPCFlameGraphTreeViewer extends AbstractTmfTreeViewer {

		private final Format FORMATTER = new SubSecondTimeWithUnitFormat();
		
		//private NUOPCCtfCallGraphAnalysis fModule;
		private List<ThreadNode> fThreadNodes;
		
		public NUOPCFlameGraphTreeViewer(Composite parent) {
			
			super(parent, true);
			setLabelProvider(new FlameGraphTreeLabelProvider());
	        getTreeViewer().setAutoExpandLevel(2);
	       
			
			//getTreeViewer().setAutoExpandLevel(2);
	        //filterMap = new HashMap<>();
	        
	        //IActionBars bars = getViewSite().getActionBars();
	        //IToolBarManager toolbarManager = bars.getToolBarManager();
	        	        
	        //IMenuManager menuManager = bars.getMenuManager();
	        
	        /*
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.COMPONENT_ATTRIBUTE_ROOT, "Component Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.STATE, "State"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.STATE_ATTRIBUTE_ROOT, "State Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD, "Field"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD_ATTRIBUTE_ROOT, "Field Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD_STATISTIC_ROOT, "Field Statistics"));
	        */        
		}
		
		
		public void setInput(List<ThreadNode> nodes) {
			fThreadNodes = nodes;
			updateContent(getWindowStartTime(), getWindowEndTime(), false);
		}
			
		
		
		/*
		@Override
	    public void initializeDataSource() {
			
	    }
		*/
		
		/*
		private class FilterAction extends Action {
			//private String label;
			private NUOPCFieldEntryType type;
			
			public FilterAction(NUOPCFieldEntryType type, String label) {
				this.type = type;
				setText("Include " + label);
				setChecked(true);
			}
			@Override
			public int getStyle() {
				return Action.AS_CHECK_BOX;
			}
			@Override
			public void run() {
				filterMap.put(type, isChecked());
				getTreeViewer().setInput(null);				
			}
		}
		*/

		@Override
		protected ITmfTreeColumnDataProvider getColumnDataProvider() {
			 return new ITmfTreeColumnDataProvider() {

		            @Override
		            public List<TmfTreeColumnData> getColumnData() {
		                List<TmfTreeColumnData> columns = new ArrayList<>();
		                TmfTreeColumnData column;
		                
		                column = new TmfTreeColumnData("Level");
		                column.setWidth(250);
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof ThreadEntry && e2 instanceof ThreadEntry) {
		                    		return (int) (((ThreadEntry) e1).getThreadNode().getId() - ((ThreadEntry) e2).getThreadNode().getId());
		                    	}
		                    	else if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		return ((AggregatedCalledFunctionEntry) e1).getName().compareTo(((AggregatedCalledFunctionEntry) e2).getName());
		                    	}
		                    	return 0;
		                    }		                 
		                });		                
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Total time");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		if (((AggregatedCalledFunctionEntry) e1).getFunction().getDuration() < ((AggregatedCalledFunctionEntry) e2).getFunction().getDuration()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("Total time spent, including time spent in sub-regions");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Self time");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		if (((AggregatedCalledFunctionEntry) e1).getFunction().getSelfTime() < ((AggregatedCalledFunctionEntry) e2).getFunction().getSelfTime()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("Total time spent, exclusive of time spent in sub-regions");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Count");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		if (((AggregatedCalledFunctionEntry) e1).getFunction().getNbCalls() < ((AggregatedCalledFunctionEntry) e2).getFunction().getNbCalls()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("Number of times called");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Mean");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		AggregatedCalledFunctionStatistics stats1 = ((AggregatedCalledFunctionEntry) e1).getFunction().getFunctionStatistics();
		                    		AggregatedCalledFunctionStatistics stats2 = ((AggregatedCalledFunctionEntry) e2).getFunction().getFunctionStatistics();
		                    		if (stats1.getDurationStatistics().getMean() < stats2.getDurationStatistics().getMean()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("The average time per execution, inclusive of all sub-regions");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Min");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		AggregatedCalledFunctionStatistics stats1 = ((AggregatedCalledFunctionEntry) e1).getFunction().getFunctionStatistics();
		                    		AggregatedCalledFunctionStatistics stats2 = ((AggregatedCalledFunctionEntry) e2).getFunction().getFunctionStatistics();
		                    		if (stats1.getDurationStatistics().getMin() < stats2.getDurationStatistics().getMin()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("The minimum execution time among all calls, inclusive of all sub-regions");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Max");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		AggregatedCalledFunctionStatistics stats1 = ((AggregatedCalledFunctionEntry) e1).getFunction().getFunctionStatistics();
		                    		AggregatedCalledFunctionStatistics stats2 = ((AggregatedCalledFunctionEntry) e2).getFunction().getFunctionStatistics();
		                    		if (stats1.getDurationStatistics().getMax() < stats2.getDurationStatistics().getMax()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("The maximum execution time among all calls, inclusive of all sub-regions");
		                columns.add(column);
		                
		                column = new TmfTreeColumnData("Std Dev");
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                    	if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
		                    		AggregatedCalledFunctionStatistics stats1 = ((AggregatedCalledFunctionEntry) e1).getFunction().getFunctionStatistics();
		                    		AggregatedCalledFunctionStatistics stats2 = ((AggregatedCalledFunctionEntry) e2).getFunction().getFunctionStatistics();
		                    		if (stats1.getDurationStatistics().getStdDev() < stats2.getDurationStatistics().getStdDev()) {
		                    			return -1;
		                    		}
		                    		else return 1;
		                    	}
		                    	return 0;
		                    }		                 
		                });
		                column.setTooltip("The standard deviation among all calls, inclusive of all sub-regions");
		                columns.add(column);
		                		                
		                return columns;
		            }

		        };
		}
		

		@Override
		protected ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection) {
			if (isSelection) {
				return null;
			}
			
			ITmfTreeViewerEntry root = new RootEntry(fThreadNodes);
			return root;
		}
		
		
		protected class FlameGraphTreeLabelProvider extends TreeLabelProvider {

	        @SuppressWarnings("restriction")
			@Override
	        public String getColumnText(Object element, int columnIndex) {
	            if (element instanceof ThreadEntry) {
	            	ThreadEntry thread = (ThreadEntry) element;
	            	if (columnIndex == 0) {
	            		return thread.getName();
	            	}
	            	else {
	            		return "---";
	            	}
	            }
	            else if (element instanceof AggregatedCalledFunctionEntry) {
	            	AggregatedCalledFunctionEntry func = (AggregatedCalledFunctionEntry) element;
	            	if (columnIndex == 0) {
	            		return func.getName();
	            	}
	            	else if (columnIndex == 1) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getDuration()));
	            	}
	            	else if (columnIndex == 2) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getSelfTime()));
	            	}
	            	else if (columnIndex == 3) {
	            		return String.valueOf(func.getFunction().getNbCalls());	            		
	            	}
	            	else if (columnIndex == 4) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMean()));
	            	}
	            	else if (columnIndex == 5) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMin()));
	            	}
	            	else if (columnIndex == 6) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMax()));
	            	}
	            	else if (columnIndex == 7) {
	            		return String.valueOf(FORMATTER.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getStdDev()));
	            	}
	            }
	            return super.getColumnText(element, columnIndex);
	        }

	        /*
	        @Override
	        public Color getBackground(Object element, int columnIndex) {
	            return super.getBackground(element, columnIndex);
	        }
	        */
	        
	        /*
	        @Override
	        public Image getColumnImage(Object element, int columnIndex) {
	        	if (columnIndex == 0) {
	        		NUOPCFieldEntry fe = (NUOPCFieldEntry) element;
	        		if (fe.getType().getIcon() != null) {
	        			ImageDescriptor image = Activator.getImageDescriptor("icons/" + fe.getType().getIcon());
	        			return image.createImage();  //createResource?
	        		}
	        	}
	        	return super.getColumnImage(element, columnIndex);
	        }
	        */
	    }
		
	}
	
	protected static class RootEntry extends TmfTreeViewerEntry {

		public RootEntry(List<ThreadNode> nodes) {
			super("");
			if (nodes != null) {
				nodes.forEach(n -> addChild(new ThreadEntry(n)));
			}
		}
		
	}
	
	@SuppressWarnings("restriction")
	protected static class ThreadEntry extends TmfTreeViewerEntry {
		
		private ThreadNode fNode;
		
		public ThreadEntry(ThreadNode node) {
			super("PET " + node.getId());
			fNode = node;
			for (AggregatedCalledFunction f : node.getChildren()) {
				addChild(new AggregatedCalledFunctionEntry(f));
			}
		}
		
		public ThreadNode getThreadNode() {
			return fNode;
		}
		
	}

	@SuppressWarnings("restriction")
	protected static class AggregatedCalledFunctionEntry extends TmfTreeViewerEntry {
		
		private AggregatedCalledFunction fFunc;
		
		public AggregatedCalledFunctionEntry(AggregatedCalledFunction func) {
			super(func.getSymbol().toString());	
			fFunc = func;
			for (AggregatedCalledFunction child : fFunc.getChildren()) {
				addChild(new AggregatedCalledFunctionEntry(child));
			}
		}
		
		public AggregatedCalledFunction getFunction() {
			return fFunc;
		}
	}
	

}
