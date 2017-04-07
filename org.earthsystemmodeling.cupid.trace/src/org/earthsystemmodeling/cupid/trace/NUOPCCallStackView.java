package org.earthsystemmodeling.cupid.trace;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.internal.tmf.ui.Activator;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.ui.symbols.SymbolProviderManager;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEntry;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEvent;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackPresentationProvider;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackView;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.model.ITimeEvent;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.widgets.Utils;

public class NUOPCCallStackView extends CallStackView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCallStackView";
	
	
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		NUOPCCallStackPresentationProvider pp = new NUOPCCallStackPresentationProvider();
		pp.setCallStackView(this);
		getTimeGraphViewer().setTimeGraphProvider(pp);
		
	}
	
	static class NUOPCCallStackPresentationProvider extends CallStackPresentationProvider {
		
		
		
		//private Integer fAverageCharWidth;
		
		/*
		@Override
		public Map<String, String> getEventHoverToolTipInfo(ITimeEvent event) {
			Map<String,String> retMap = super.getEventHoverToolTipInfo(event);
			if (retMap == null) retMap = new HashMap<>();
			retMap.put("TestVal", "First");
			retMap.put("Another", "Second");
			return retMap;
			
		}
		*/
		
		/*
		@Override
		public String getEventName(ITimeEvent event) {
			return "MY_EVENT";
		}
		*/
		
		/*
		@Override
	    public void postDrawEvent(ITimeEvent event, Rectangle bounds, GC gc) {
	        if (fAverageCharWidth == null) {
	            fAverageCharWidth = gc.getFontMetrics().getAverageCharWidth();
	        }
	        if (bounds.width <= fAverageCharWidth) {
	            return;
	        }
	        if (!(event instanceof CallStackEvent)) {
	            return;
	        }
	        CallStackEntry entry = (CallStackEntry) event.getEntry();
	        ITmfStateSystem ss = entry.getStateSystem();
	        try {
	            ITmfStateValue value = ss.querySingleState(event.getTime(), entry.getQuark()).getStateValue();
	            if (!value.isNull()) {
	                String name = fView.getFunctionName(entry.getTrace(), entry.getProcessId(), event.getTime(), value);
	            	//String name = "MY_NAME_HERE";
	                gc.setForeground(gc.getDevice().getSystemColor(SWT.COLOR_WHITE));
	                Utils.drawText(gc, name, bounds.x, bounds.y, bounds.width, bounds.height, true, true);
	            }
	        } catch (TimeRangeException e) {
	            Activator.getDefault().logError("Error querying state system", e); //$NON-NLS-1$
	        } catch (StateSystemDisposedException e) {
	            //ignored
	        }
	    }
		*/
		
	}
	
}
