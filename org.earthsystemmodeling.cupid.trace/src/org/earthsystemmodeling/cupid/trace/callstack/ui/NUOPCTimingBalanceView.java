package org.earthsystemmodeling.cupid.trace.callstack.ui;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.ToDoubleFunction;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callstack.timing.TimingAnalysis;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunctionStatistics;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

import com.google.common.base.Joiner;

public class NUOPCTimingBalanceView extends TmfView {

    public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCTimingBalanceView";
    
	private static final int[] DEFAULT_WEIGHTS = new int[] { 4, 6 };

	private ITmfTrace fTrace;
    private @Nullable NUOPCStatisticsBalanceChartViewer fBalanceViewer;
    private @Nullable NUOPCGlobalStatisticsTreeViewer fTreeViewer;
    
    //private final Semaphore fLock = new Semaphore(1);
    //private Job fJob;

    
    public NUOPCTimingBalanceView() {
        super(ID);
    }

    /**
     * Used to keep the table in sync with the density viewer.
     */
    /*
    private final class DataChangedListener implements ISegmentStoreDensityViewerDataListener {

        private void updateTableModel(@Nullable Iterable<? extends ISegment> data) {
            final AbstractSegmentStoreTableViewer viewer = fTableViewer;
            if (viewer != null && data != null) {
                viewer.updateModel(data);
            }
        }

        @Override
        public void viewDataChanged(@NonNull Iterable<? extends @NonNull ISegment> newData) {
            updateTableModel(newData);
        }

        @Override
        public void selectedDataChanged(@Nullable Iterable<? extends @NonNull ISegment> newSelectionData) {
            updateTableModel(newSelectionData);
        }

    }
	*/
    
    
    private abstract class SetStatisticAction extends Action {

		private String fStatName;
						
		public SetStatisticAction(String stat) {
			this(stat, false);
		}

		public SetStatisticAction(String stat, boolean checked) {
			fStatName = stat;
			setChecked(checked);
		}
		
		public abstract ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction();

		@Override
		public String getText() {
			return fStatName;
		}

		@Override
		public int getStyle() {
			return Action.AS_RADIO_BUTTON;
		}

		@Override
		public void run() {				
			if (isChecked()) {
				fBalanceViewer.setStatistic(getStatisticFunction());
				fBalanceViewer.setStatisticName(fStatName);
				fBalanceViewer.reload();
			}
		}

	}
    
    
    @Override
    public void createPartControl(@Nullable Composite parent) {
        super.createPartControl(parent);

        final SashForm sashForm = new SashForm(parent, SWT.NONE);

        fTreeViewer = createStatisticsTreeViewer(sashForm);
        fBalanceViewer = createStatisticsBalanceChartViewer(sashForm);
        fTreeViewer.setBalanceChartViewer(fBalanceViewer);
        
        sashForm.setWeights(DEFAULT_WEIGHTS);
        
        //Action zoomOut = new ZoomOutAction(this);
        //IToolBarManager toolBar = getViewSite().getActionBars().getToolBarManager();
        //toolBar.add(zoomOut);
        
        ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
        if (trace != null) {
            TmfTraceSelectedSignal signal = new TmfTraceSelectedSignal(this, trace);
            traceSelected(signal);
            //if (fBalanceViewer != null) {
            //    fBalanceViewer.traceSelected(signal);
            //}
            //if (fTreeViewer != null) {
            //    fTreeViewer.traceSelected(signal);
            //}
        }
        
        //getViewSite().getActionBars().getMenuManager().add(fExportAction);
        
        getViewSite().getActionBars().getToolBarManager().add(fExportAction);
        
        /////////// statistics options
        
        final MenuManager statisticMenu = new MenuManager("Statistic", null) {
			@Override
			public String getMenuText() {
				return "Statistic";
			}
		};
		
		
        
		statisticMenu.add(new SetStatisticAction("Total", true) {
			@Override
			public ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction() {
				return new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
					@Override
					public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
						return value.getDurationStatistics().getTotal();
					}
				};
			}
		});
		
		statisticMenu.add(new SetStatisticAction("Mean") {
			@Override
			public ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction() {
				return new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
					@Override
					public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
						return value.getDurationStatistics().getMean();
					}
				};
			}
		});
		
		
		statisticMenu.add(new SetStatisticAction("Max") {
			@Override
			public ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction() {
				return new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
					@Override
					public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
						return value.getDurationStatistics().getMax();
					}
				};
			}
		});
		
		statisticMenu.add(new SetStatisticAction("Min") {
			@Override
			public ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction() {
				return new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
					@Override
					public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
						return value.getDurationStatistics().getMin();
					}
				};
			}
		});
		
			
		statisticMenu.add(new SetStatisticAction("Std Dev") {
			@Override
			public ToDoubleFunction<AggregatedCalledFunctionStatistics> getStatisticFunction() {
				return new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
					@Override
					public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
						return value.getDurationStatistics().getStdDev();
					}
				};
			}
		});
		
		//TODO:  create statistic class with stat function, name, y-axis title, etc.
		
		
		
		Action setStatistic = new Action("Set statistic", SWT.DROP_DOWN) {

			@Override
			public ImageDescriptor getImageDescriptor() {
				return Activator.getImageDescriptor("icons/setstatistic.png");
			}

			@Override
			public IMenuCreator getMenuCreator() {
				return new IMenuCreator() {
					@Override
					public void dispose() {
					}
					@Override
					public Menu getMenu(Control parent) {
						return statisticMenu.createContextMenu(parent);
					}
					@Override
					public Menu getMenu(Menu parent) {
						return null;
					}
				};
			}
		};
		
		getViewSite().getActionBars().getToolBarManager().add(setStatistic);
		 
		//////////// end statistics option
        
        
        
    }
    
    @TmfSignalHandler
    public void traceSelected(final TmfTraceSelectedSignal signal) {
        fTrace = signal.getTrace();
        if (fTrace != null) {
            //NUOPCCtfCallStackAnalysis analysisModule = TmfTraceUtils.getAnalysisModuleOfClass(fTrace, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
        	TimingAnalysis analysisModule = TmfTraceUtils.getAnalysisModuleOfClass(fTrace, TimingAnalysis.class, TimingAnalysis.ID);
            analysisModule.schedule();
        }
        getTreeViewer().loadTrace(fTrace);
    }
    
        
    
    /*
    protected void initializeTreeViewer(NUOPCCtfCallStackAnalysis analysisModule){
        
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
        if (analysisModule == null) {
            getTreeViewer().setInput(null);
            fLock.release();
            return;
        }
        
        getTreeViewer().setInput(null);
        analysisModule.schedule();
        job = new Job("NUOPC Call Stack Analysis") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }
                    analysisModule.waitForCompletion(monitor);
                    Display.getDefault().asyncExec(() -> {
                        getTreeViewer().setInput(analysisModule.getTrace());
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
    */

    protected NUOPCGlobalStatisticsTreeViewer createStatisticsTreeViewer(Composite parent) {
    	return new NUOPCGlobalStatisticsTreeViewer(parent, this);
    }

    protected NUOPCStatisticsBalanceChartViewer createStatisticsBalanceChartViewer(Composite parent) {
    	return new NUOPCStatisticsBalanceChartViewer(parent);
    }

    @Override
    public void setFocus() {
        final NUOPCStatisticsBalanceChartViewer viewer = fBalanceViewer;
        if (viewer != null) {
            viewer.getControl().setFocus();
        }
    }

    @Override
    public void dispose() {
        final NUOPCStatisticsBalanceChartViewer balanceViewer = fBalanceViewer;
        if (balanceViewer != null) {
            balanceViewer.dispose();
        }

        final AbstractStatisticsTreeViewer treeViewer = fTreeViewer;
        if (treeViewer != null) {
            treeViewer.dispose();
        }

        super.dispose();
    }

  
    protected NUOPCStatisticsBalanceChartViewer getBalanceChartViewer() {
        return fBalanceViewer;
    }

   
    protected AbstractStatisticsTreeViewer getTreeViewer() {
        return fTreeViewer;
    }
    
    
    private final Action fExportAction = new ExportToTsvAction() {
        
    		
    		@Override
        protected void exportToTsv(@Nullable OutputStream stream) {
         
        	try (PrintWriter pw = new PrintWriter(stream)) {
                AbstractTmfTreeViewer statsViewer = fTreeViewer;
                if (statsViewer == null) {
                    return;
                }
                Tree tree = statsViewer.getTreeViewer().getTree();
                int size = tree.getItemCount();
                List<String> columns = new ArrayList<>();
                for (int i = 0; i < tree.getColumnCount(); i++) {
                    String valueOf = String.valueOf(tree.getColumn(i).getText());
                    if (valueOf.isEmpty() && i == tree.getColumnCount() - 1) {
                        // Linux "feature", an invisible column is added at the end
                        // with gtk2
                        break;
                    }
                    columns.add(valueOf);
                }
                String join = Joiner.on('\t').skipNulls().join(columns);
                pw.println(join);
                for (int i = 0; i < size; i++) {
                    TreeItem item = tree.getItem(i);
                    printItem(pw, columns, item, 0);
                }
            }
        	        
        }
        
        private void printItem(PrintWriter pw, List<String> columns, @Nullable TreeItem item, int depth) {
            if (item == null) {
                return;
            }
            List<String> data = new ArrayList<>();
            for (int col = 0; col < columns.size(); col++) {
            	String prefix = "";
            	//indent first column
            	if (col == 0) {
            		prefix = String.join("", Collections.nCopies(depth, " "));
            	}            	 
            	data.add(prefix + String.valueOf(item.getText(col)));
            }
            String line = Joiner.on('\t').join(data);
            if (line.trim().length() > 0) {
            	pw.println(Joiner.on('\t').join(data));
            }
            for (TreeItem child : item.getItems()) {
                printItem(pw, columns, child, depth+1);
            }
        }
        	
        @Override
        protected @Nullable Shell getShell() {
            return getViewSite().getShell();
        }

    };
    
}