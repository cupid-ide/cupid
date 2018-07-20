package org.earthsystemmodeling.cupid.trace.timing.unused;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.statistics.AbstractSegmentsStatisticsView;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.statistics.AbstractSegmentsStatisticsViewer;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.statistics.SegmentStoreStatisticsViewer;
import org.eclipse.tracecompass.common.core.NonNullUtils;
import org.eclipse.tracecompass.tmf.core.analysis.TmfAbstractAnalysisModule;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.IViewDescriptor;

public class ComponentTimingStatisticsView extends AbstractSegmentsStatisticsView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.ComponentTimingStatisticsView";

    @Override
    public void createPartControl(@Nullable Composite parent) {
        super.createPartControl(parent);
        // Set the title of the view from the actual view ID
        IViewDescriptor desc = PlatformUI.getWorkbench().getViewRegistry().find(getViewId());
        if (desc != null) {
            setPartName(desc.getLabel());
        }
    }

    @Override
    protected @NonNull AbstractSegmentsStatisticsViewer createSegmentStoreStatisticsViewer(@NonNull Composite parent) {
        // The analysis ID is the secondary ID of the view
        String analysisId = NonNullUtils.nullToEmptyString(getViewSite().getSecondaryId());
        return new SegmentStoreStatisticsViewer(parent, analysisId);
    }

}
