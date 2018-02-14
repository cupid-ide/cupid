package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.List;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeColumnDataProvider.TmfTreeColumnData2;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedCalledFunctionEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsRoot;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.GlobalEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.ThreadEntry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

import com.google.common.collect.Lists;

public abstract class AbstractStatisticsTreeViewer extends AbstractTmfTreeViewer {

	private TimeFormatter fTimeFormatter;
	private AbstractStatisticsTreeColumnDataProvider fColumnDataProvider;

	public AbstractStatisticsTreeViewer(Composite parent, TmfView view) {
		super(parent, true);
		
		setLabelProvider(new GraphTreeLabelProviderWithTooltips());
		getTreeViewer().setAutoExpandLevel(2);
			
		ColumnViewerToolTipSupport.enableFor(getTreeViewer());			

		///////////////  Time Units Action //////////////////////
		final MenuManager timeUnitMenu = new MenuManager("&Time units", null) {
			@Override
			public ImageDescriptor getImageDescriptor() {
				return Activator.getImageDescriptor("icons/export_to_spreadsheet.gif");
			};
			@Override
			public String getMenuText() {
				return "Time units";
			}
		};
		timeUnitMenu.add(new TimeFormatAction(TimeFormatter.DYNAMIC, true));
		timeUnitMenu.add(new TimeFormatAction(TimeFormatter.SECONDS));
		timeUnitMenu.add(new TimeFormatAction(TimeFormatter.MILLISECONDS));
		timeUnitMenu.add(new TimeFormatAction(TimeFormatter.MICROSECONDS));
		timeUnitMenu.add(new TimeFormatAction(TimeFormatter.NANOSECONDS));

		Action setTimeUnit = new Action("Set time units in timing tree", SWT.DROP_DOWN) {
			
			@Override
			public ImageDescriptor getImageDescriptor() {
				return Activator.getImageDescriptor("icons/timeunits.png");
			}

			@Override
			public IMenuCreator getMenuCreator() {
				return new IMenuCreator() {
					@Override
					public void dispose() {
					}
					@Override
					public Menu getMenu(Control parent) {
						return timeUnitMenu.createContextMenu(parent);
					}
					@Override
					public Menu getMenu(Menu parent) {
						return null;
					}
				};
			}
		};

		//////////////////////////  Columns Actions ////////////////////
		
		final MenuManager visibleColumnsMenu = new MenuManager("&Columns", null) {
			@Override
			public ImageDescriptor getImageDescriptor() {
				return Activator.getImageDescriptor("icons/export_to_spreadsheet.gif");
			};
			@Override
			public String getMenuText() {
				return "Columns to show in timing tree";
			}
		};
		for (int i = 1; i < getColumnDataProvider().COLUMNS.length; i++) {
			visibleColumnsMenu.add(new ShowColumnAction(getColumnDataProvider().COLUMNS[i]));
		}
		
		Action setVisibleColumns = new Action("Set visible columns in timing tree", SWT.DROP_DOWN) {
			
			@Override
			public ImageDescriptor getImageDescriptor() {
				return Activator.getImageDescriptor("icons/select_columns.png");
			}

			@Override
			public IMenuCreator getMenuCreator() {
				return new IMenuCreator() {
					@Override
					public void dispose() {
					}
					@Override
					public Menu getMenu(Control parent) {
						return visibleColumnsMenu.createContextMenu(parent);
					}
					@Override
					public Menu getMenu(Menu parent) {
						return null;
					}
				};
			}
		};
		
				
		view.getViewSite().getActionBars().getToolBarManager().add(setVisibleColumns);
		view.getViewSite().getActionBars().getToolBarManager().add(setTimeUnit);
		view.getViewSite().getActionBars().getToolBarManager().add(new Separator());

	}


	public abstract void setInput(Object input);


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
				getTimeFormatter().setFixedUnit(fTimeUnit);
				getTimeFormatter().setIncludeUnits(fTimeUnit.equals(TimeFormatter.DYNAMIC));
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
	
	
	private class ShowColumnAction extends Action {

		private TmfTreeColumnData2 fColumn;

		public ShowColumnAction(TmfTreeColumnData2 column) {
			this(column, true);
		}

		public ShowColumnAction(TmfTreeColumnData2 column, boolean checked) {
			fColumn = column;
			setChecked(checked);
		}

		@Override
		public String getText() {
			return fColumn.getText();
		}

		@Override
		public int getStyle() {
			return Action.AS_CHECK_BOX;
		}

		@Override
		public void run() {				
			fColumn.setVisible(isChecked());
			
			Object[] elements = getTreeViewer().getExpandedElements(); 
			TreePath[] treePaths = getTreeViewer().getExpandedTreePaths(); 
			getTreeViewer().getTree().setRedraw(false);
			for (TreeColumn c : getTreeViewer().getTree().getColumns()) {
				c.dispose();
			}
			setTreeColumns(getColumnDataProvider().getColumnData());
			setLabelProvider(new GraphTreeLabelProviderWithTooltips());
			getTreeViewer().getTree().setRedraw(true);
			getTreeViewer().refresh();
			getTreeViewer().setExpandedElements(elements); 
			getTreeViewer().setExpandedTreePaths(treePaths); 
			for (TreeColumn c : getTreeViewer().getTree().getColumns()) {
				c.pack();
			}
		}

	}

	@Override
	protected AbstractStatisticsTreeColumnDataProvider getColumnDataProvider() {
		if (fColumnDataProvider == null) {
			fColumnDataProvider = new AbstractStatisticsTreeColumnDataProvider(getTimeFormatter());
		}
		return fColumnDataProvider;	        
	}
	
	protected TimeFormatter getTimeFormatter() {
		if (fTimeFormatter == null) {
			fTimeFormatter = new TimeFormatter();
		}
		return fTimeFormatter;
	}


	@Override
	protected abstract ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection);


	protected class GraphTreeLabelProviderWithTooltips extends CellLabelProvider {

		private FontRegistry fFontRegistry = new FontRegistry();
		
		@Override
		public void update(ViewerCell cell) {
			
			Object element = cell.getElement();
			
			String columnText = getColumnText(element, cell.getColumnIndex());
			if (columnText != null) {
				cell.setText(columnText);
			}
			
			if (element instanceof AggregatedFunctionStatisticsRoot) {
				cell.setFont(fFontRegistry.getBold(Display.getCurrent().getSystemFont().getFontData()[0].getName()));
			}
			
			if (element instanceof AggregatedCalledFunctionEntry) {
				AggregatedCalledFunctionEntry func = (AggregatedCalledFunctionEntry) element;
				if (func.getFunction().isForcedToComplete()) {
					cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
				}
			}
			
			if (element instanceof AggregatedFunctionStatisticsRoot) {
				if (cell.getColumnIndex() == 0) {
					ImageDescriptor image = Activator.getImageDescriptor("icons/linegraph.png");
					cell.setImage(image.createImage());
				}
			}
			
		}
		
		@Override
		public String getToolTipText(Object element) {
			if (element instanceof AggregatedCalledFunctionEntry) {
				AggregatedCalledFunctionEntry func = (AggregatedCalledFunctionEntry) element;
				if (func.getFunction().isForcedToComplete()) {
					return "Warning:  Timings for this region are not complete.\n" +
						   "This indicates that some regions were not property\n" +
						   "closed or the trace is incomplete.  This usually occurs\n"+
						   "if the application crashed before writing out all of the\n" +
						   "trace events. Regions are assumed to be closed at the\n" +
						   "timestamp of the final event.";
				}
			}
			return null;
		}
		
				
		public String getColumnText(Object element, int columnIndex) {
			return getColumnDataProvider().getColumnText(element, columnIndex);
		}
		
		/*
		public String getColumnTextOLD(Object element, int columnIndex) {
			if (element instanceof GlobalEntry) {
				GlobalEntry global = (GlobalEntry) element;
				if (columnIndex == 0) {
					return global.getName();
				}
				else {
					return null;
				}
			}
			else if (element instanceof ThreadEntry) {
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
					return String.valueOf(fTimeFormatter.format(func.getFunction().getDuration()));
				}
				else if (columnIndex == 2) {
					return String.valueOf(fTimeFormatter.format(func.getFunction().getSelfTime())); // + " (" + 
										 // FORMATTER.format(func.getFunction().getFunctionStatistics().getSelfTimeStatistics().getTotal()) + ")");
				
					//TODO:  self time statistics are not right!!!
				
				}
				else if (columnIndex == 3) {
					return String.valueOf(func.getFunction().getNbCalls());	            		
				}
				else if (columnIndex == 4) {
					//return String.valueOf(FORMATTER.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMean()));
					return fTimeFormatter.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMean()) + " (" + 
						   fTimeFormatter.format(func.getFunction().getFunctionStatistics().getSelfTimeStatistics().getMean()) + ")";

				}
				
				else if (columnIndex == 5) {
					return String.valueOf(fTimeFormatter.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMin()));
				}
				else if (columnIndex == 6) {
					return String.valueOf(fTimeFormatter.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getMax()));
				}
				else if (columnIndex == 7) {
					return String.valueOf(fTimeFormatter.format(func.getFunction().getFunctionStatistics().getDurationStatistics().getStdDev()));
				}
				else if (columnIndex == 8) {
					return String.valueOf(fTimeFormatter.format(func.getFunction().getFunctionStatistics().getSubregionStatistics("mpi").getTotal()));
				}
			}
			else if (element instanceof AggregatedFunctionStatisticsRoot) {
				if (columnIndex == 0) {
					return ((AggregatedFunctionStatisticsRoot) element).getName();
				}
				else {
					return null;
				}
			}
			else if (element instanceof AggregatedFunctionStatisticsEntry) {
				AggregatedFunctionStatisticsEntry stats = (AggregatedFunctionStatisticsEntry) element;
				if (columnIndex == 0) {
					return stats.getName();
				}
				else if (columnIndex == 1) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getDurationStatistics().getTotal()));
				}
				else if (columnIndex == 2) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getSelfTimeStatistics().getTotal()));
				}
				else if (columnIndex == 3) {
					return String.valueOf(stats.getStats().getDurationStatistics().getNbElements());	            		
				}
				else if (columnIndex == 4) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getDurationStatistics().getMean()));
				}
				else if (columnIndex == 5) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getDurationStatistics().getMin()));
				}
				else if (columnIndex == 6) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getDurationStatistics().getMax()));
				}
				else if (columnIndex == 7) {
					return String.valueOf(fTimeFormatter.format(stats.getStats().getDurationStatistics().getStdDev()));
				}

			}
			return null;
		}
		*/
	}
	
	
}