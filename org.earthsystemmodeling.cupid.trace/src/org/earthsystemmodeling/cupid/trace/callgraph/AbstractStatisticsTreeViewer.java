package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedCalledFunctionEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsRoot;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.GlobalEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.ThreadEntry;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunctionStatistics;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

import com.google.common.collect.Lists;

public abstract class AbstractStatisticsTreeViewer extends AbstractTmfTreeViewer {

	private final TimeFormatter FORMATTER = new TimeFormatter();

	public AbstractStatisticsTreeViewer(Composite parent, TmfView view) {
		super(parent, true);
		
		setLabelProvider(new GraphTreeLabelProviderWithTooltips());
		getTreeViewer().setAutoExpandLevel(2);
			
		ColumnViewerToolTipSupport.enableFor(getTreeViewer());
			

		final MenuManager timeUnitMenu = new MenuManager("&Time units", null) {
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

		Action setTimeUnit = new Action("Set time units", SWT.DROP_DOWN) {
			
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
					//if (func.getFunction().isForcedToComplete()) {
					//	return func.getName() + "***";
					//}
					//else {
						return func.getName();
					//}
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
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getTotal()));
				}
				else if (columnIndex == 2) {
					return String.valueOf(FORMATTER.format(stats.getStats().getSelfTimeStatistics().getTotal()));
				}
				else if (columnIndex == 3) {
					return String.valueOf(stats.getStats().getDurationStatistics().getNbElements());	            		
				}
				else if (columnIndex == 4) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMean()));
				}
				else if (columnIndex == 5) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMin()));
				}
				else if (columnIndex == 6) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMax()));
				}
				else if (columnIndex == 7) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getStdDev()));
				}

			}
			return null;
		}
		
	}
	
	protected class GraphTreeLabelProvider extends TreeLabelProvider {

		@Override
		public Color getForeground(Object element, int columnIndex) {
			if (element instanceof AggregatedCalledFunctionEntry) {
				AggregatedCalledFunctionEntry func = (AggregatedCalledFunctionEntry) element;
				if (func.getFunction().isForcedToComplete()) {
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
				}
			}
			return super.getForeground(element, columnIndex);
		}
				
		@Override
		public String getColumnText(Object element, int columnIndex) {
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
					if (func.getFunction().isForcedToComplete()) {
						return func.getName() + "***";
					}
					else {
						return func.getName();
					}
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
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getTotal()));
				}
				else if (columnIndex == 2) {
					return String.valueOf(FORMATTER.format(stats.getStats().getSelfTimeStatistics().getTotal()));
				}
				else if (columnIndex == 3) {
					return String.valueOf(stats.getStats().getDurationStatistics().getNbElements());	            		
				}
				else if (columnIndex == 4) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMean()));
				}
				else if (columnIndex == 5) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMin()));
				}
				else if (columnIndex == 6) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getMax()));
				}
				else if (columnIndex == 7) {
					return String.valueOf(FORMATTER.format(stats.getStats().getDurationStatistics().getStdDev()));
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

		private FontRegistry fFontRegistry = new FontRegistry();

		@Override
		public Font getFont(Object element, int columnIndex) {
			if (element instanceof AggregatedFunctionStatisticsRoot) {
				return fFontRegistry.getBold(Display.getCurrent().getSystemFont().getFontData()[0].getName());
			}
			else {
				return super.getFont(element, columnIndex);
			}
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			if (element instanceof AggregatedFunctionStatisticsRoot) {
				if (columnIndex == 0) {
					ImageDescriptor image = Activator.getImageDescriptor("icons/linegraph.png");
					return image.createImage();  //createResource?
				}
			}
			return super.getColumnImage(element, columnIndex);
		}

	}

}