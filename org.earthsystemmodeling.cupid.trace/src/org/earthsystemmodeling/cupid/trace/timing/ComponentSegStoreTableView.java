package org.earthsystemmodeling.cupid.trace.timing;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.table.AbstractSegmentStoreTableView;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.table.AbstractSegmentStoreTableViewer;
import org.eclipse.tracecompass.analysis.timing.ui.views.segmentstore.table.SegmentStoreTableViewer;
import org.eclipse.tracecompass.common.core.NonNullUtils;

public class ComponentSegStoreTableView extends AbstractSegmentStoreTableView {

    public static final String ID = "org.earthsystemmodeling.cupid.componentsegstoretableview";

    @Override
    public void createPartControl(@Nullable Composite parent) {
        super.createPartControl(parent);
        //String viewId = getViewId();
        //IViewDescriptor vd = PlatformUI.getWorkbench().getViewRegistry().find(viewId);
        //setPartName(vd.getLabel());
        setPartName("Component Seg Store Table");
    }

    @Override
	protected AbstractSegmentStoreTableViewer createSegmentStoreViewer(TableViewer tableViewer) {
        String analysisId = NonNullUtils.nullToEmptyString(getViewSite().getSecondaryId());
        return new SegmentStoreTableViewer(tableViewer, analysisId);
	}
  

}
