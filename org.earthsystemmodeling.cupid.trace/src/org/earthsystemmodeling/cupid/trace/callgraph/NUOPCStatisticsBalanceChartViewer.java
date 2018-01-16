package org.earthsystemmodeling.cupid.trace.callgraph;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.ToDoubleFunction;

import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunctionStatistics;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.IAnalysisProgressListener;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.viewers.TmfViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.swt.ChartComposite;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.swtchart.Chart;
import org.swtchart.IAxis;
import org.swtchart.ISeries;
import org.swtchart.ISeries.SeriesType;

import com.google.common.collect.Ordering;


public class NUOPCStatisticsBalanceChartViewer extends TmfViewer {

    //private static final Format DENSITY_TIME_FORMATTER = new SubSecondTimeWithUnitFormat();
    //private static final RGB BAR_COLOR = new RGB(0x42, 0x85, 0xf4);
    
	private final Chart fChart;
//    private final MouseDragZoomProvider fDragZoomProvider;
//    private final MouseSelectionProvider fDragProvider;
//    private final SimpleTooltipProvider fTooltipProvider;

    private @Nullable ITmfTrace fTrace;
    private @Nullable IAnalysisProgressListener fListener;
    //private @Nullable ISegmentStoreProvider fSegmentStoreProvider;
//    private TmfTimeRange fCurrentTimeRange = TmfTimeRange.NULL_RANGE;
    //private List<ISegmentStoreDensityViewerDataListener> fListeners;
//    private IGlobalStatisticsProvider fStatisticsProvider;
    
    private final ChartComposite fChartComposite;
    private ToDoubleFunction<AggregatedCalledFunctionStatistics> fStatisticFunction;
    private String fStatisticName;
    private AggregatedCalledFunction fInput;
    
    /**
     * Constructs a new density viewer.
     *
     * @param parent
     *            the parent of the viewer
     */
    /*
    public NUOPCStatisticsBalanceChartViewer(Composite parent) {
        super(parent);
    	//fListeners = new ArrayList<>();
        fChart = new Chart(parent, SWT.NONE);
        fChart.getLegend().setVisible(false);
        fChart.getTitle().setVisible(false);
        fChart.getAxisSet().getXAxis(0).getTitle().setText("PETs");
        fChart.getAxisSet().getYAxis(0).getTitle().setText("Time");
        fChart.getAxisSet().getXAxis(0).getGrid().setStyle(LineStyle.DOT);
        fChart.getAxisSet().getYAxis(0).getGrid().setStyle(LineStyle.DOT);

//        fDragZoomProvider = new MouseDragZoomProvider(this);
//        fDragZoomProvider.register();
//        fDragProvider = new MouseSelectionProvider(this);
//        fDragProvider.register();
//        fTooltipProvider = new SimpleTooltipProvider(this);
//        fTooltipProvider.register();

        fChart.addDisposeListener((e) -> {
            internalDispose();
        });
    }
    */
    
    public NUOPCStatisticsBalanceChartViewer(Composite parent) {
        super(parent);

        fChart = null;
        fChartComposite = new ChartComposite(parent, SWT.NONE);
        
        fStatisticFunction = new ToDoubleFunction<AggregatedCalledFunctionStatistics>() {
			@Override
			public double applyAsDouble(AggregatedCalledFunctionStatistics value) {
				return value.getDurationStatistics().getTotal();
			}
        };
        fStatisticName = "Total";
                
    }

    public void setStatistic(ToDoubleFunction<AggregatedCalledFunctionStatistics> func) {
    	fStatisticFunction = func;
    }
    
    public void setStatisticName(String name) {
    	fStatisticName = name;
    }
       
    private void updateDisplayJFree(AggregatedCalledFunction func) {
    	
    	Comparator<Entry<Long, AggregatedCalledFunctionStatistics>> c = 
    			Comparator.comparingDouble(new ToDoubleFunction<Entry<Long, AggregatedCalledFunctionStatistics>>() {
			@Override
			public double applyAsDouble(Entry<Long, AggregatedCalledFunctionStatistics> value) {
				return value.getKey();
			}
        });
        
        List<Entry<Long, AggregatedCalledFunctionStatistics>> entries = 
        		Ordering.from(c).immutableSortedCopy(func.getFunctionStatisticsMap().entrySet());
      
        //final int petCount = entries.size();
        
        final XYSeries series = new XYSeries("PET Timings");
        for (int i=0; i < entries.size(); i++) {
        	series.add((double) entries.get(i).getKey(), fStatisticFunction.applyAsDouble(entries.get(i).getValue()));
        }
    	final XYSeriesCollection dataset = new XYSeriesCollection(series);
    	
    	
    	final JFreeChart chart = ChartFactory.createXYBarChart(
    			"PET Timings for " + func.getSymbol() + " (" + fStatisticName + ")", 
                "PETs", 
                false,
                "Time", 
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
            );
    	
    	chart.removeLegend();
    	
    	
    	XYPlot plot = chart.getXYPlot();
    	    	
    	NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
    	rangeAxis.setNumberFormatOverride(new TimeFormatter(new DecimalFormat()));
    	
        plot.setBackgroundPaint(Color.WHITE);
        //plot.getDomainAxis().setRange(0, petCount-1);
        plot.getDomainAxis().setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        plot.setDomainPannable(true);
        plot.setRangePannable(true);
        
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setBarPainter(new StandardXYBarPainter());
        renderer.setDrawBarOutline(false);
        renderer.setShadowVisible(false);
        renderer.setMargin(0.1);
                  	    
        //final ChartPanel panel = new ChartPanel(chart);
        
    	fChartComposite.setChart(chart);
    	fChartComposite.redraw();
    	
    }

    private void updateDisplay(AggregatedCalledFunction func) {
        //IBarSeries
    	
    	ISeries series = fChart.getSeriesSet().createSeries(SeriesType.BAR, "PET Timings");
        series.setVisible(true);
        
        fChart.getTitle().setText("PET Timings for " + func.getSymbol() + " (Total)");
        fChart.getTitle().setVisible(true);
        
        //series.setBarPadding(0);

        //series.setBarColor(new Color(Display.getDefault(), BAR_COLOR));
        
        //int barWidth = 4;
        //final int width = fChart.getPlotArea().getBounds().width / barWidth;
        //double[] xOrigSeries = new double[width];
        //double[] yOrigSeries = new double[width];
        //Arrays.fill(yOrigSeries, 1.0);
        
        int petCount = func.getFunctionStatisticsMap().size();
        //String[] petCategories = new String[petCount];
        //for (int i = 0; i < petCount; i++) {
        //	petCategories[i] = String.valueOf(i);
        //}
        
        //fChart.getAxisSet().getXAxis(0).enableCategory(true);
        //fChart.getAxisSet().getXAxis(0).setCategorySeries(petCategories);
                
        double[] xSeries = new double[petCount];
        double[] ySeries = new double[petCount];
        //double[] ySeriesPlus = new double[petCount];
        //double[] ySeriesMinus = new double[petCount];
                
         
        Comparator<Entry<Long, AggregatedCalledFunctionStatistics>> c = Comparator.comparingDouble(new ToDoubleFunction<Entry<Long, AggregatedCalledFunctionStatistics>>() {
			@Override
			public double applyAsDouble(Entry<Long, AggregatedCalledFunctionStatistics> value) {
				//return value.getValue().getDurationStatistics().getTotal();
				return value.getKey();
			}
        });
        
        List<Entry<Long, AggregatedCalledFunctionStatistics>> entries = 
        		Ordering.from(c).immutableSortedCopy(func.getFunctionStatisticsMap().entrySet());
        
        //List<Entry<Long, AggregatedCalledFunctionStatistics>> entries = 
        //		Lists.newArrayList(func.getFunctionStatisticsMap().entrySet());
        
        
        for (int i=0; i < entries.size(); i++) {
        	xSeries[i] = entries.get(i).getKey();
        	ySeries[i] = entries.get(i).getValue().getDurationStatistics().getTotal();
        	//ySeriesPlus[i] = entries.get(i).getValue().getDurationStatistics().getMax();
        	//ySeriesMinus[i] = entries.get(i).getValue().getDurationStatistics().getMin();
        }
        
        series.setXSeries(xSeries);
        series.setYSeries(ySeries);
        //series.getYErrorBar().setPlusErrors(ySeriesPlus);
        //series.getYErrorBar().setMinusErrors(ySeriesMinus);
        //series.getYErrorBar().setType(ErrorBarType.BOTH);
        //series.getYErrorBar().setVisible(true);
        
        fChart.getAxisSet().adjustRange();
        
        final IAxis yAxis = fChart.getAxisSet().getYAxis(0);
        yAxis.getTick().setFormat(new TimeFormatter());
        
        /*
        data.setComparator(SegmentComparators.INTERVAL_LENGTH_COMPARATOR);
        ISegment maxSegment = data.getElement(SegmentStoreWithRange.LAST);
        long maxLength = Long.MAX_VALUE;
        if (maxSegment != null) {
            maxLength = maxSegment.getLength();
        }
        double maxFactor = 1.0 / (maxLength + 1.0);
        long minX = Long.MAX_VALUE;
        for (ISegment segment : data) {
            double xBox = segment.getLength() * maxFactor * width;
            yOrigSeries[(int) xBox]++;
            minX = Math.min(minX, segment.getLength());
        }
        double timeWidth = (double) maxLength / (double) width;
        for (int i = 0; i < width; i++) {
            xOrigSeries[i] = i * timeWidth;
        }
        double maxY = Double.MIN_VALUE;
        for (int i = 0; i < width; i++) {
            maxY = Math.max(maxY, yOrigSeries[i]);
        }
        if (minX == maxLength) {
            maxLength++;
            minX--;
        }
        */
        
        //series.setYSeries(yOrigSeries);
        //series.setXSeries(xOrigSeries);
        
        //final IAxis xAxis = fChart.getAxisSet().getXAxis(0);
        /*
         * adjustrange appears to bring origin back since we pad the series with
         * 0s, not interesting.
         */
        //xAxis.adjustRange();
        //Range range = xAxis.getRange();
        
        // fix for overly aggressive lower after an adjust range
        //range.lower = minX - range.upper + maxLength;
        //xAxis.setRange(range);
        
        //xAxis.getTick().setFormat(DENSITY_TIME_FORMATTER);
        
        /*
         * Set the range to slightly under 1 but above 0 so that log scales
         * display properly.
         */
        //fChart.getAxisSet().getYAxis(0).setRange(new Range(0.9, maxY));
        //fChart.getAxisSet().getYAxis(0).enableLogScale(true);
        
        fChart.redraw();
    }

    
    @Override
    public Control getControl() {
        return fChartComposite;
    }
    
    
    
    
    public void setInput(AggregatedCalledFunction function) {
    	fInput = function;
    	if (function != null) {
    		updateDisplayJFree(function);
    	}
    	else {
    		clearContent();
    	}
    }
    
    public void reload() {
    	setInput(fInput);
    }

    /*
    public void select(Range durationRange) {
        computeDataAsync(fCurrentTimeRange, durationRange).thenAccept((data) -> {
            for (ISegmentStoreDensityViewerDataListener listener : fListeners) {
                listener.selectedDataChanged(data);
            }
        });
    }

    public void zoom(Range durationRange) {
        computeDataAsync(fCurrentTimeRange, durationRange).thenAccept((data) -> applyData(data));
    }

    private CompletableFuture<@Nullable SegmentStoreWithRange<ISegment>> computeDataAsync(final TmfTimeRange timeRange, final Range durationRange) {
        return CompletableFuture.supplyAsync(() -> computeData(timeRange, durationRange));
    }

    private @Nullable SegmentStoreWithRange<ISegment> computeData(final TmfTimeRange timeRange, final Range durationRange) {
        final ISegmentStoreProvider segmentProvider = fSegmentStoreProvider;
        if (segmentProvider == null) {
            return null;
        }
        final ISegmentStore<ISegment> segStore = segmentProvider.getSegmentStore();
        if (segStore == null) {
            return null;
        }

        // Filter on the segment duration if necessary
        if (durationRange.lower > Double.MIN_VALUE || durationRange.upper < Double.MAX_VALUE) {
            Predicate<ISegment> predicate = new Predicate<ISegment>() {
                @Override
                public boolean test(@NonNull ISegment segment) {
                    return segment.getLength() >= durationRange.lower && segment.getLength() <= durationRange.upper;
                }
            };
            return new SegmentStoreWithRange<>(segStore, timeRange, predicate);
        }

        return new SegmentStoreWithRange<>(segStore, timeRange);

    }
	
    
    private void applyData(final @Nullable SegmentStoreWithRange<ISegment> data) {
        if (data != null) {
            data.setComparator(SegmentComparators.INTERVAL_LENGTH_COMPARATOR);
            Display.getDefault().asyncExec(() -> updateDisplay(data));
            for (ISegmentStoreDensityViewerDataListener l : fListeners) {
                l.viewDataChanged(data);
            }
        }
    }
*/
    
    /*
    @TmfSignalHandler
    public void windowRangeUpdated(@Nullable TmfWindowRangeUpdatedSignal signal) {
        if (signal == null) {
            return;
        }
        ITmfTrace trace = getTrace();
        if (trace == null) {
            return;
        }
        fSegmentStoreProvider = getSegmentStoreProvider(trace);
        fCurrentTimeRange = NonNullUtils.checkNotNull(signal.getCurrentRange());
        updateWithRange(fCurrentTimeRange);
    }
	*/
   
    /*
    @VisibleForTesting
    public void updateWithRange(final TmfTimeRange range) {
        computeDataAsync(range, new Range(Double.MIN_VALUE, Double.MAX_VALUE)).thenAccept((data) -> applyData(data));
    }
	*/
    
    @Override
    public void refresh() {
        //fChart.redraw();
        fChartComposite.redraw();
    }

    @Override
    public void dispose() {
        //fChart.dispose();
    	fChartComposite.dispose();
    }

    private void internalDispose() {
//        if (fSegmentStoreProvider != null && fListener != null) {
//            fSegmentStoreProvider.removeListener(fListener);
//        }
//        fDragZoomProvider.deregister();
//        fTooltipProvider.deregister();
//        fDragProvider.deregister();
        super.dispose();
    }

//    @TmfSignalHandler
//    public void traceOpened(TmfTraceOpenedSignal signal) {
//        fTrace = signal.getTrace();
//        loadTrace(getTrace());
//    }

//    @TmfSignalHandler
//    public void traceSelected(TmfTraceSelectedSignal signal) {
//        if (fTrace != signal.getTrace()) {
//            fTrace = signal.getTrace();
//            loadTrace(getTrace());
//        }
//    }

//    public void traceClosed(TmfTraceClosedSignal signal) {
//
//       if (signal.getTrace() != fTrace) {
//            return;
//        }
//
//        fTrace = null;
//        clearContent();
//    }

 /*
    protected void loadTrace(@Nullable ITmfTrace trace) {
        clearContent();

        fTrace = trace;
        TmfTraceContext ctx = TmfTraceManager.getInstance().getCurrentTraceContext();
        TmfTimeRange windowRange = ctx.getWindowRange();
        fCurrentTimeRange = windowRange;

        if (trace != null) {
            fStatisticsProvider = getGlobalStatisticsProvider(trace);
            final IGlobalStatisticsProvider provider = fStatisticsProvider;
            if (provider != null) {
                
            	//fListener = (segmentProvider, data) -> updateWithRange(windowRange);
                //provider.addListener(fListener);
                
            	//TODO: see about where to schedule the analysis
            	//if (provider instanceof IAnalysisModule) {
                //    ((IAnalysisModule) provider).schedule();
                //}
            }
        }
        //zoom(new Range(0, Long.MAX_VALUE));
        
    }
    */

    /*
    private void clearContent() {
        final Chart chart = fChart;
        if (!chart.isDisposed()) {
            ISeriesSet set = chart.getSeriesSet();
            ISeries[] series = set.getSeries();
            for (int i = 0; i < series.length; i++) {
                set.deleteSeries(series[i].getId());
            }
            for (IAxis axis : chart.getAxisSet().getAxes()) {
                axis.setRange(new Range(0, 1));
            }
            chart.redraw();
        }
    }
	*/
    
    private void clearContent() {
    	final ChartComposite chart = fChartComposite;
    	if (!chart.isDisposed()) {
    		chart.setChart(null);
    		chart.redraw();
    	}
    }
    
    /*
    public void addDataListener(ISegmentStoreDensityViewerDataListener dataListener) {
        fListeners.add(dataListener);
    }
	*/
    
   
    /*
    public void removeDataListener(ISegmentStoreDensityViewerDataListener dataListener) {
        fListeners.remove(dataListener);
    }
    */
}