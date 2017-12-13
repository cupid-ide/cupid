package org.earthsystemmodeling.cupid.trace.callgraph;

import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.AggregatedCalledFunctionEntry;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractStatisticsTreeView.RootEntry;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

public class NUOPCGlobalStatisticsTreeViewer extends AbstractStatisticsTreeViewer {
	
	private GlobalNode fGlobalNode;
	private @Nullable NUOPCStatisticsBalanceChartViewer fBalanceViewer;

	public NUOPCGlobalStatisticsTreeViewer(Composite parent, TmfView view) {
		super(parent, view);
		getTreeViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = event.getStructuredSelection();
				if (sel.isEmpty()) {
					
				}
				else {
					Object elem = sel.getFirstElement();
					if (elem instanceof AggregatedCalledFunctionEntry) {
						AggregatedCalledFunction func = ((AggregatedCalledFunctionEntry) elem).getFunction();
						if (fBalanceViewer != null) {
							fBalanceViewer.setInput(func);
						}
					}
				}
			}
		});
	}
		
	public void setBalanceChartViewer(NUOPCStatisticsBalanceChartViewer viewer) {
		fBalanceViewer = viewer;
	}
	
	@Override
	public void setInput(Object input) {
		if (input == null) {
			fGlobalNode = null;
		}
		else if (input instanceof GlobalNode) {
			fGlobalNode = (GlobalNode) input;
			updateContent(getWindowStartTime(), getWindowEndTime(), false);
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	protected ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection) {
		if (isSelection) {
			return null;
		}			
		ITmfTreeViewerEntry root = new RootEntry(fGlobalNode);
		return root;
	}
}