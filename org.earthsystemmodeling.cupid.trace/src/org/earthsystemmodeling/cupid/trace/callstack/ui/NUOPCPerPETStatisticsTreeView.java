package org.earthsystemmodeling.cupid.trace.callstack.ui;

import java.util.List;

import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.earthsystemmodeling.cupid.trace.callstack.timing.TimingStatsDataModel;
import org.earthsystemmodeling.cupid.trace.callstack.timing.TimingStatsDataProvider;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.tmf.core.dataprovider.DataProviderManager;
import org.eclipse.tracecompass.tmf.core.model.filters.FilterTimeQueryFilter;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.response.TmfModelResponse;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;


public class NUOPCPerPETStatisticsTreeView extends AbstractStatisticsTreeView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCPerPETStatisticsTreeView";
		   
	public NUOPCPerPETStatisticsTreeView() {
		super(ID, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
	}
	
	@Override
	public AbstractStatisticsTreeViewer createTreeViewer(Composite parent) {
		return new NUOPCFlameGraphTreeViewer(parent);
	}
	
	public class NUOPCFlameGraphTreeViewer extends AbstractStatisticsTreeViewer {		
	
		public NUOPCFlameGraphTreeViewer(Composite parent) {
			super(parent, NUOPCPerPETStatisticsTreeView.this);
		}
		
		@Override
		protected ITmfTreeViewerEntry updateElements(@NonNull ITmfTrace trace, long start, long end, boolean isSelection) {

			if (isSelection) {
				return null;
			}

			ITmfTreeDataProvider<TimingStatsDataModel> provider = null;

			provider = DataProviderManager.getInstance().getDataProvider(trace,
					TimingStatsDataProvider.ID + ":" + TimingStatsDataProvider.PERPET, TimingStatsDataProvider.class);

			if (provider == null) {
				return null;
			}

			FilterTimeQueryFilter filter = new FilterTimeQueryFilter(start, end, 2, isSelection);
			TmfModelResponse<List<TimingStatsDataModel>> response = provider.fetchTree(filter, null);
			@Nullable List<TimingStatsDataModel> model = response.getModel();
			
			if (model == null) {
				return null;
			}
			if (model.size() == 0) {
				return null;
			}

			ITmfTreeViewerEntry root = new RootEntry(model.get(0).getThreadNodes());
			return root;

		}
	}

	@Override
	public void setFocus() {
		
	}


}
