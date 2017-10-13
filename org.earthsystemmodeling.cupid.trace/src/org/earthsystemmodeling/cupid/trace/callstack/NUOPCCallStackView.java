package org.earthsystemmodeling.cupid.trace.callstack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.earthsystemmodeling.cupid.trace.PETSelectedSignal;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.internal.tmf.ui.Activator;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalManager;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.symbols.SymbolProviderManager;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEntry;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEvent;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackPresentationProvider;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackView;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.ITimeGraphTimeListener;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.StateItem;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.TimeGraphTimeEvent;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.TimeGraphViewer;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.model.ITimeEvent;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.model.ITimeGraphEntry;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.model.TimeGraphEntry;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.widgets.ITmfTimeGraphDrawingHelper;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.widgets.Utils;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;


public class NUOPCCallStackView extends CallStackView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCallStackView";

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		NUOPCCallStackPresentationProvider pp = new NUOPCCallStackPresentationProvider(getTrace());
		pp.setCallStackView(this);
		getTimeGraphViewer().setTimeGraphProvider(pp);
		
		/*
		getTimeGraphViewer().addTimeListener(new ITimeGraphTimeListener() {

			@Override
			public void timeSelected(TimeGraphTimeEvent event) {
				if (event.getSource() != null && event.getSource() instanceof TimeGraphViewer) {
					TimeGraphViewer v = (TimeGraphViewer) event.getSource();
					CallStackEntry cse = (CallStackEntry) v.getSelection();
					//System.out.println(cse.getProcessId());
					TmfSignalManager.dispatchSignal(new PETSelectedSignal(cse.getProcessId()));
				}
			}
			
		});
		*/
		
		getTimeGraphViewer().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				//System.out.println(event);
				
				if (!event.getSelection().isEmpty()) {
					if (event.getSelection() instanceof IStructuredSelection) {
						long pet = -1;
						IStructuredSelection ss = (IStructuredSelection) event.getSelection();
						if (ss.getFirstElement() instanceof CallStackEntry) {
							CallStackEntry cse = (CallStackEntry) ss.getFirstElement();
							pet = Integer.valueOf(cse.getName()); //cse.getProcessId();
							TmfSignalManager.dispatchSignal(new PETSelectedSignal(pet));
						}
						//TODO: process and thread entry are private
						//else if (ss.getFirstElement() instanceof ProcessEntry) {
						//	
						//}
					}
				}
				
			}
			
		});

	}

	static class NUOPCCallStackPresentationProvider extends CallStackPresentationProvider {
		
		private final LoadingCache<CallStackEvent, Optional<String>> fTimeEventComponentKinds = CacheBuilder.newBuilder()
				.maximumSize(10000)
				//.recordStats()
				.build(new CacheLoader<CallStackEvent, Optional<String>>() {
					@Override
					public Optional<String> load(CallStackEvent event) {
						CallStackEntry entry = event.getEntry();
						ITmfStateSystem ss = entry.getStateSystem();
						try {
							int quarkMe = entry.getQuark();
							int quarkRef = ss.getParentAttributeQuark(quarkMe);
							quarkRef = ss.getParentAttributeQuark(quarkRef);
							quarkRef = ss.getQuarkRelative(quarkRef, "compkind", String.valueOf(entry.getStackLevel()));
							//String[] quarkPath = ss.getFullAttributePathArray(quarkRef);

							ITmfStateValue value = ss.querySingleState(event.getTime(), quarkRef).getStateValue();
							if (!value.isNull()) {
								return Optional.of(value.unboxStr());
							}
						} catch (TimeRangeException e) {
							//Activator.getDefault().logError("Error querying state system", e); //$NON-NLS-1$
						} catch (StateSystemDisposedException e) {
							//Activator.getDefault().logError("Error querying state system", e); //$NON-NLS-1$
						} catch (AttributeNotFoundException e) {
							//Activator.getDefault().logError("Error querying state system", e); //$NON-NLS-1$
						}
						return Optional.empty();
					}
				});

				
		public NUOPCCallStackPresentationProvider(ITmfTrace trace) {

		}

		public String getEventComponentKind(ITimeEvent event) {
			if (event instanceof CallStackEvent) {
				return fTimeEventComponentKinds.getUnchecked((CallStackEvent) event).orElse(null);
			}	
			return null;
		}		

		/*
		 public String getEventComponentKind(ITimeEvent event) {

			 CallStackEntry entry = (CallStackEntry) event.getEntry();
			 ITmfStateSystem ss = entry.getStateSystem();

			 int quarkMe = entry.getQuark();
			 int quarkRef = ss.getParentAttributeQuark(quarkMe);
			 quarkRef = ss.getParentAttributeQuark(quarkRef);
			 try {
				quarkRef = ss.getQuarkRelative(quarkRef, "compkind", String.valueOf(entry.getStackLevel()));
			} catch (AttributeNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			 String[] quarkPath = ss.getFullAttributePathArray(quarkRef);

			 //int quark = ss.getQuarkAbsolute(CallStackStateProvider.PROCESSES, 
			 //		String.valueOf(pet), "0", "compkind", String.valueOf(e.getStackLevel()));

			 ITmfStateValue value;
			try {
				value = ss.querySingleState(event.getTime(), quarkRef).getStateValue();
				if (!value.isNull()) {
					 return value.unboxStr();
				}
			} catch (StateSystemDisposedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //return Optional.of("Model");

			return null;

		 }
		 */
	
		@Override
		public void postDrawEvent(ITimeEvent event, Rectangle bounds, GC gc) {
			
			String kind = getEventComponentKind(event);
			
			//CacheStats cacheStats = fTimeEventComponentKinds.stats();
			//long hitCount = cacheStats.hitCount();
			//long loadCount = cacheStats.loadCount();
			
			if (kind != null && kind.equals("Connector")) {
				//gc.setAlpha(24);
				//gc.drawText("CONNECTOR", 2, 2);
				//gc.setForeground(gc.getDevice().getSystemColor(SWT.COLOR_GRAY));
				gc.setBackground(gc.getDevice().getSystemColor(SWT.COLOR_GRAY));
				gc.fillRectangle(bounds);
		        //gc.drawRectangle(bounds.x - 1, bounds.y, bounds.width + 1, bounds.height - 1);				
			}
			
			super.postDrawEvent(event, bounds, gc);
			
		}

		/*
		@Override
		public int getStateTableIndex(ITimeEvent event) {

			CallStackEntry e = (CallStackEntry) event.getEntry();
			int pet = e.getProcessId();
			if (pet > 0) {
				System.out.println("here");
			}
			System.out.println(e.getFunctionEntryTime());

			ITmfStateSystem ss = e.getStateSystem();

			try {
				int quark = ss.getQuarkAbsolute(CallStackStateProvider.PROCESSES, 
						String.valueOf(pet), "0", "compkind", String.valueOf(e.getStackLevel()));
				ITmfStateInterval val = ss.querySingleState(event.getTime()+1, quark);
				if (!val.getStateValue().isNull()) {
					String kind = val.getStateValue().unboxStr();
					if (kind.equals("Connector")) {
						return CallStackPresentationProvider.TRANSPARENT;
					}
				}				
			} catch (AttributeNotFoundException e1) {
				return super.getStateTableIndex(event);
			} catch (StateSystemDisposedException e1) {
				return super.getStateTableIndex(event);
			}		

			return super.getStateTableIndex(event);
		}
		 */

		
		@Override
		public Map<String, String> getEventHoverToolTipInfo(ITimeEvent event) {
			
			Map<String,String> retMap = new HashMap<>();

			CallStackEntry cse = (CallStackEntry) event.getEntry();
			ITmfStateSystem ss = cse.getStateSystem();
			try {
				int quarkMe = cse.getQuark();
				int quarkRef = ss.getParentAttributeQuark(quarkMe);
				quarkRef = ss.getParentAttributeQuark(quarkRef);
				quarkRef = ss.getQuarkRelative(quarkRef, "clock");
				//String[] quarkPath = ss.getFullAttributePathArray(quarkRef);

				ITmfStateValue value = ss.querySingleState(event.getTime(), quarkRef).getStateValue();
				if (!value.isNull()) {
					retMap.put("Model Clock", value.unboxStr());
				}
			}
			catch (AttributeNotFoundException e) {
				//ignore
			} catch (StateSystemDisposedException e) {
				//ignore
			}
			return retMap;
		
		}

		
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
