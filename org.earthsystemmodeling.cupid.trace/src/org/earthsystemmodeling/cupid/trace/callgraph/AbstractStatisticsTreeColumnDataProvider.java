package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedCalledFunctionEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedFunctionStatisticsRoot;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.GlobalEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.ThreadEntry;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;

import com.google.common.collect.ImmutableList;

public class AbstractStatisticsTreeColumnDataProvider implements ITmfTreeColumnDataProvider {
			
	public final TmfTreeColumnData2 COLUMN_LEVEL;
	public final TmfTreeColumnData2 COLUMN_TOTAL_TIME;
	public final TmfTreeColumnData2 COLUMN_SELF_TIME;
	public final TmfTreeColumnData2 COLUMN_COUNT;
	public final TmfTreeColumnData2 COLUMN_MEAN;
	public final TmfTreeColumnData2 COLUMN_MIN;
	public final TmfTreeColumnData2 COLUMN_MAX;
	public final TmfTreeColumnData2 COLUMN_STD;
	public final TmfTreeColumnData2 COLUMN_MPI;  /* total mpi time */
	
	public final TmfTreeColumnData2 COLUMNS[];
		
	private List<TmfTreeColumnData2> fActiveColumns = new ArrayList<>();
	private final TimeFormatter fTimeFormatter;
	
	public AbstractStatisticsTreeColumnDataProvider(TimeFormatter timeFormatter) {
	
		fTimeFormatter = timeFormatter;
		
		COLUMN_LEVEL = new TmfTreeColumnData2("Level") {
			@Override
			public String getColumnText(Object elem) {
				if (elem instanceof GlobalEntry) {
					GlobalEntry global = (GlobalEntry) elem;
					return global.getName();
				}
				else if (elem instanceof ThreadEntry) {
					ThreadEntry thread = (ThreadEntry) elem;
					return thread.getName();
				}
				else if (elem instanceof AggregatedCalledFunctionEntry) {
					AggregatedCalledFunctionEntry func = (AggregatedCalledFunctionEntry) elem;
					return func.getName();
				}
				else if (elem instanceof AggregatedFunctionStatisticsRoot) {
					return ((AggregatedFunctionStatisticsRoot) elem).getName();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return ((AggregatedFunctionStatisticsEntry) elem).getName();
				}
				return super.getColumnText(elem);
			}
		};
		COLUMN_LEVEL.setMovable(false);
		COLUMN_LEVEL.setComparator(new ViewerComparator() {
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
		
		COLUMN_TOTAL_TIME = new TmfTreeColumnDataLong("Total time", "Total time spent, including time spent in sub-regions") {
			@Override
			public long getColumnLong(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getDuration();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getTotal();
				}
				return super.getColumnLong(elem);
			}
		};
			
		
		COLUMN_SELF_TIME = new TmfTreeColumnDataLong("Self time", "Total time spent, exclusive of time spent in sub-regions") {
			@Override
			public long getColumnLong(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getSelfTime();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getSelfTimeStatistics().getTotal();
				}
				return super.getColumnLong(elem);
			}
		};
		
		COLUMN_COUNT = new TmfTreeColumnDataLong("Count", "Number of times called") {
			@Override
			public long getColumnLong(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getNbCalls();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getNbElements();
				}
				return super.getColumnLong(elem);
			}
			@Override
			public String getColumnText(Object elem) {
				if (getColumnLong(elem) >= 0) {
					return String.valueOf(getColumnLong(elem));
				}
				return null;
			}
		};
		
		COLUMN_MEAN = new TmfTreeColumnDataDouble("Mean", "The average time per execution, inclusive of all sub-regions") {
			@Override
			public double getColumnDouble(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getFunctionStatistics().getDurationStatistics().getMean();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getMean();
				}
				return super.getColumnDouble(elem);
			}
		};
		
		COLUMN_MIN = new TmfTreeColumnDataLong("Min", "The minimum execution time among all calls, inclusive of all sub-regions") {
			@Override
			public long getColumnLong(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getFunctionStatistics().getDurationStatistics().getMin();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getMin();
				}
				return super.getColumnLong(elem);
			}
		};
		
		COLUMN_MAX = new TmfTreeColumnDataLong("Max", "The maximum execution time among all calls, inclusive of all sub-regions") {
			@Override
			public long getColumnLong(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getFunctionStatistics().getDurationStatistics().getMax();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getMax();
				}
				return super.getColumnLong(elem);
			}
		};
		
		COLUMN_STD = new TmfTreeColumnDataDouble("Std Dev", "The standard deviation of all calls, inclusive of all sub-regions") {
			@Override
			public double getColumnDouble(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getFunctionStatistics().getDurationStatistics().getStdDev();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return (long) ((AggregatedFunctionStatisticsEntry) elem).getStats().getDurationStatistics().getStdDev();
				}
				return super.getColumnDouble(elem);
			}
		};
		
		COLUMN_MPI = new TmfTreeColumnDataDouble("MPI Time (Self)", "Total amount of time in MPI_Wait and MPI_Barrier calls, exclusive of sub-regions") {
			@Override
			public double getColumnDouble(Object elem) {
				if (elem instanceof AggregatedCalledFunctionEntry) {
					return ((AggregatedCalledFunctionEntry) elem).getFunction().getFunctionStatistics().getSubregionStatistics("mpi").getTotal();
				}
				else if (elem instanceof AggregatedFunctionStatisticsEntry) {
					return ((AggregatedFunctionStatisticsEntry) elem).getStats().getSubregionStatistics("mpi").getTotal();
				}
				return super.getColumnDouble(elem);
			}
		};
		
		COLUMNS = new TmfTreeColumnData2[] {
				COLUMN_LEVEL,
				COLUMN_TOTAL_TIME,
				COLUMN_SELF_TIME,
				COLUMN_COUNT,
				COLUMN_MEAN,
				COLUMN_MIN,
				COLUMN_MAX,
				COLUMN_STD,
				COLUMN_MPI
		};
				
	}

	public String getColumnText(Object elem, int columnIndex) {
		return fActiveColumns.get(columnIndex).getColumnText(elem);
	}
	
	
	@Override
	public @NonNull List<TmfTreeColumnData> getColumnData() {

		fActiveColumns.clear();
		fActiveColumns.add(COLUMN_LEVEL);
		for (int i=1; i < COLUMNS.length; i++) {
			if (COLUMNS[i].isVisible()) {
				fActiveColumns.add(COLUMNS[i]);
			}
		}
		return ImmutableList.copyOf(fActiveColumns);		
		
		
		/*
			

		///////////

		column = new TmfTreeColumnData("Total MPI");
		column.setMovable(true);
		column.setComparator(new ViewerComparator() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if (e1 instanceof AggregatedCalledFunctionEntry && e2 instanceof AggregatedCalledFunctionEntry) {
					AggregatedCalledFunctionStatistics stats1 = ((AggregatedCalledFunctionEntry) e1).getFunction().getFunctionStatistics();
					AggregatedCalledFunctionStatistics stats2 = ((AggregatedCalledFunctionEntry) e2).getFunction().getFunctionStatistics();
					if (stats1.getSubregionStatistics("mpi").getTotal() < stats2.getSubregionStatistics("mpi").getTotal()) {
						return -1;
					}
					else return 1;
				}
				return 0;
			}		                 
		});
		column.setTooltip("Total time spent in MPI communication");
		columns.add(column);

		///////////


		return columns;
		*/
	}
	
	public class TmfTreeColumnData2 extends TmfTreeColumnData {

		private boolean fVisible = true;
		
		public TmfTreeColumnData2(String text) {
			this(text, null);
		}
		
		public TmfTreeColumnData2(String text, String tooltip) {
			super(text);
			setMovable(true);
			setTooltip(tooltip);
		}
		
		public void setVisible(boolean visible) {
			fVisible = visible;
		}
		
		public boolean isVisible() {
			return fVisible;
		}
		
		public String getColumnText(Object elem) {
			return null;
		}
		
	}
	
	public class TmfTreeColumnDataLong extends TmfTreeColumnData2 {

		public TmfTreeColumnDataLong(String text, String tooltip) {
			super(text, tooltip);
			setComparator(new ViewerComparator() {
				@Override
				public int compare(Viewer viewer, Object e1, Object e2) {
					if (getColumnLong(e1) < getColumnLong(e2)) return -1;
					else if (getColumnLong(e1) > getColumnLong(e2)) return 1; 
					else return 0;
				}
			});
		}
		
		public long getColumnLong(Object elem) {
			return -1;
		}
		
		@Override
		public String getColumnText(Object elem) {
			if (getColumnLong(elem) != -1) {
				return fTimeFormatter.format(getColumnLong(elem));
			}
			return null;
		}
		
	}
	
	public class TmfTreeColumnDataDouble extends TmfTreeColumnData2 {

		public TmfTreeColumnDataDouble(String text, String tooltip) {
			super(text, tooltip);
			setComparator(new ViewerComparator() {
				@Override
				public int compare(Viewer viewer, Object e1, Object e2) {
					if (getColumnDouble(e1) < getColumnDouble(e2)) return -1;
					else if (getColumnDouble(e1) > getColumnDouble(e2)) return 1; 
					else return 0;
				}
			});
		}
		
		public double getColumnDouble(Object elem) {
			return -1;
		}
		
		@Override
		public String getColumnText(Object elem) {
			if (getColumnDouble(elem) != -1) {
				return fTimeFormatter.format(getColumnDouble(elem));
			}
			return null;
		}
		
	}


}
