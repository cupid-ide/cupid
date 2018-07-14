package org.earthsystemmodeling.cupid.trace.callgraph;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunctionStatistics;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceClosedSignal;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceOpenedSignal;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

import com.google.common.base.Joiner;



//TODO:  look into extending org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractSelectTreeViewer
public abstract class AbstractStatisticsTreeView extends TmfView {

	//private ITmfTrace fTrace;
	private AbstractStatisticsTreeViewer fViewer;
   
    //private IAnalysisModule fAnalysisModule;
    private final Class<? extends IAnalysisModule> fModuleClass;
    private	final String fModuleId;
       
    public <T extends IAnalysisModule> AbstractStatisticsTreeView(String viewId, Class<T> moduleClass, String moduleId) {
		super(viewId);
		fModuleClass = moduleClass;
		fModuleId = moduleId;
	}
    
	private final Action fExportAction = new ExportToTsvAction() {
        @Override
        protected void exportToTsv(@Nullable OutputStream stream) {
         
        	try (PrintWriter pw = new PrintWriter(stream)) {
                AbstractTmfTreeViewer statsViewer = fViewer;
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
	
	 
	@Override
	public void createPartControl(Composite parent) {
		//fViewer = new NUOPCFlameGraphTreeViewer(parent);
		fViewer = createTreeViewer(parent);
        ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
        if (trace != null) {
           traceSelected(new TmfTraceSelectedSignal(this, trace));
        }
        
        getViewSite().getActionBars().getToolBarManager().add(fExportAction);
	}
	
	public abstract AbstractStatisticsTreeViewer createTreeViewer(Composite parent);
	
	public AbstractStatisticsTreeViewer getViewer() {
		return fViewer;
	}
	
	@Override
	public void setFocus() {
		
		//System.out.println("Setting focus");
		
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
		ITmfTrace fTrace = signal.getTrace();
        if (fTrace != null) {
            IAnalysisModule fAnalysisModule = TmfTraceUtils.getAnalysisModuleOfClass(fTrace, fModuleClass, fModuleId);
            fAnalysisModule.schedule();
        }
		fViewer.loadTrace(fTrace);
	}
	
	//public abstract void initializeViewer(IAnalysisModule analysisModule);
	
	
	@TmfSignalHandler
	public void traceOpened(final TmfTraceOpenedSignal signal) {
		fViewer.loadTrace(signal.getTrace());
	}
	
	@TmfSignalHandler
    public void traceClosed(final TmfTraceClosedSignal signal) {
       fViewer.setInput(null);
    }
	
	
	protected final String[] COL_LABELS = new String[] {
			"Level", 
			"Total time",
			"Self time",
			"Count",
			"Mean",
			"Min",
			"Max",
			"Std Dev"				
	};

	public static class RootEntry extends TmfTreeViewerEntry {

		public RootEntry(List<ThreadNode> nodes) {
			super("");
			if (nodes != null) {
				nodes.forEach(n -> addChild(new ThreadEntry(n)));
			}
		}
		
		public RootEntry(GlobalNode node) {
			super("");
			if (node != null) {
				addChild(new GlobalEntry(node));
			}
		}
		
	}
	
	//represents aggregate over all threads
	public static class GlobalEntry extends TmfTreeViewerEntry {
		public GlobalEntry(GlobalNode node) {
			super("Global (includes all traced PETs)");
			for (AggregatedCalledFunction f : node.getChildren()) {
				addChild(new AggregatedCalledFunctionEntry(f));
			}
		}
	}
	
	public static class ThreadEntry extends TmfTreeViewerEntry {
		
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

	public static class AggregatedCalledFunctionEntry extends TmfTreeViewerEntry {
		
		private AggregatedCalledFunction fFunc;
		
		public AggregatedCalledFunctionEntry(AggregatedCalledFunction func) {
			super(func.getSymbol().toString());	
			fFunc = func;
			if (!func.getFunctionStatisticsMap().isEmpty()) {
				addChild(new AggregatedFunctionStatisticsRoot(func));
			}
			for (AggregatedCalledFunction child : fFunc.getChildren()) {
				addChild(new AggregatedCalledFunctionEntry(child));
			}
		}

		public AggregatedCalledFunction getFunction() {
			return fFunc;
		}
	}
	
	public static class AggregatedFunctionStatisticsRoot extends TmfTreeViewerEntry {
		
		public AggregatedFunctionStatisticsRoot(AggregatedCalledFunction func) {
			super("Per-PET Statistics");
			func.getFunctionStatisticsMap().forEach((t,f) -> {
				addChild(new AggregatedFunctionStatisticsEntry(t, f));
			});
		}
	}
	
	public static class AggregatedFunctionStatisticsEntry extends TmfTreeViewerEntry {

		private long fThreadId;
		private AggregatedCalledFunctionStatistics fStats;
		
		public AggregatedFunctionStatisticsEntry(long threadId, AggregatedCalledFunctionStatistics stats) {
			super("PET " + threadId);
			fThreadId = threadId;
			fStats = stats;
		}

		public AggregatedCalledFunctionStatistics getStats() {
			return fStats;
		}
		
	}

}
