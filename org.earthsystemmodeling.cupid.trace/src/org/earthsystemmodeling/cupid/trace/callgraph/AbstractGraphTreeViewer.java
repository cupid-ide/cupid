package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.callgraph.AbstractGraphTreeView.AggregatedCalledFunctionEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractGraphTreeView.ThreadEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractGraphTreeView.RootEntry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;
import org.eclipse.ui.IActionBars;

import com.google.common.collect.Lists;

public class AbstractGraphTreeViewer extends AbstractTmfTreeViewer {

	private final TimeFormatter FORMATTER = new TimeFormatter();
	
	private List<ThreadNode> fThreadNodes;
	
	public AbstractGraphTreeViewer(Composite parent, TmfView view) {
		super(parent, true);
		
		setLabelProvider(new GraphTreeLabelProvider());
        getTreeViewer().setAutoExpandLevel(2);        
        
        IActionBars bars = view.getViewSite().getActionBars();
        //IToolBarManager toolbarManager = bars.getToolBarManager();
        IMenuManager menuManager = bars.getMenuManager();
        
        IMenuManager timeUnitMenu = new MenuManager("&Time units", null);
        timeUnitMenu.add(new TimeFormatAction(TimeFormatter.DYNAMIC, true));
        timeUnitMenu.add(new TimeFormatAction(TimeFormatter.SECONDS));
        timeUnitMenu.add(new TimeFormatAction(TimeFormatter.MILLISECONDS));
        timeUnitMenu.add(new TimeFormatAction(TimeFormatter.MICROSECONDS));
        timeUnitMenu.add(new TimeFormatAction(TimeFormatter.NANOSECONDS));
        
        menuManager.add(timeUnitMenu);
       
	}
	
	
	public void setInput(List<ThreadNode> nodes) {
		fThreadNodes = nodes;
		updateContent(getWindowStartTime(), getWindowEndTime(), false);
	}
		
	

	
	private class TimeFormatAction extends Action {
		
		private String fTimeUnit;
		
		public TimeFormatAction(String timeUnit) {
			this(timeUnit, false);
		}
		
		public TimeFormatAction(String timeUnit, boolean checked) {
			fTimeUnit = timeUnit;
			setChecked(checked);
		}
		
		@Override
		public String getText() {
			return fTimeUnit;
		}
		
		@Override
		public int getStyle() {
			return Action.AS_RADIO_BUTTON;
		}
		
		@Override
		public void run() {				
			if (isChecked()) {
				
				FORMATTER.setFixedUnit(fTimeUnit);
				FORMATTER.setIncludeUnits(fTimeUnit.equals(TimeFormatter.DYNAMIC));
				getTreeViewer().refresh();
				
				String postfix = fTimeUnit.equals(TimeFormatter.DYNAMIC) ? "" 
						: " (" + fTimeUnit + ")"; 
				
				Tree tree = getTreeViewer().getTree();
				ITmfTreeColumnDataProvider columnDataProvider = getColumnDataProvider();
				List<TmfTreeColumnData> columnData = columnDataProvider.getColumnData();
				for (int i : Lists.newArrayList(1, 2, 4, 5, 6, 7)) {
					tree.getColumn(i).setText(columnData.get(i).getText() + postfix);
				}
			}
		}
		
	}
				
	private ITmfTreeColumnDataProvider fColumnDataProvider;
	
	@Override
	protected ITmfTreeColumnDataProvider getColumnDataProvider() {
		 
		if (fColumnDataProvider == null) {
			fColumnDataProvider = new ITmfTreeColumnDataProvider() {

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
		return fColumnDataProvider;	        
	}
	

	@Override
	protected ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection) {
		if (isSelection) {
			return null;
		}
		
		ITmfTreeViewerEntry root = new RootEntry(fThreadNodes);
		return root;
	}
	
	
	protected class GraphTreeLabelProvider extends TreeLabelProvider {

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