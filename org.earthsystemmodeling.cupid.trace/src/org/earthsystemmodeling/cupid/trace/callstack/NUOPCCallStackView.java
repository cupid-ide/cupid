package org.earthsystemmodeling.cupid.trace.callstack;

import java.text.DecimalFormat;
import java.util.Optional;

import org.earthsystemmodeling.cupid.trace.callgraph.TimeFormatter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.analysis.profiling.ui.views.flamechart.CallStackPresentationProvider;
import org.eclipse.tracecompass.analysis.profiling.ui.views.flamechart.FlameChartView;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.widgets.timegraph.model.ITimeEvent;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;


public class NUOPCCallStackView extends FlameChartView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCallStackView";
		
	//private ITmfStateSystem stateSystem;
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		//@Nullable NUOPCCtfCallStackAnalysis module = TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
		//if (module != null) {
		//	stateSystem = module.getStateSystem();
		//}
						
		NUOPCCallStackPresentationProvider pp = new NUOPCCallStackPresentationProvider(getTrace());
		//pp.setCallStackView(this);
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
		
		//TODO fix after Photon update
		/*
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
		*/
		
	}
	
	

	class NUOPCCallStackPresentationProvider extends CallStackPresentationProvider {
					
		
		private final LoadingCache<ITimeEvent, Optional<String>> fTimeEventComponentKinds = CacheBuilder.newBuilder()
				.maximumSize(10000)
				//.recordStats()
				.build(new CacheLoader<ITimeEvent, Optional<String>>() {
					@Override
					public Optional<String> load(ITimeEvent event) {
						
						//ITimeGraphEntryModel model = ((TimeGraphEntry) entry).getModel();
			            //if (model instanceof CallStackEntryModel) 
						
						//TODO fix after Photon upgrade
						/*
						ITimeGraphEntry entry = event.getEntry();
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
						*/
						
						return Optional.empty();
					}
				});
		
		public NUOPCCallStackPresentationProvider(ITmfTrace trace) {
		}

		public String getEventComponentKind(ITimeEvent event) {
			return fTimeEventComponentKinds.getUnchecked(event).orElse(null);
		}		

		
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

		
		final TimeFormatter fTimeFormatter = new TimeFormatter();
		final DecimalFormat fPctFormatter = new DecimalFormat("##.##%");
		
		//TODO fix after Photon update
		
		/*
		@Override
		public Map<String, String> getEventHoverToolTipInfo(ITimeEvent event) {
			
			
			Map<String,String> retMap = new HashMap<>();

			if (stateSystem == null) return retMap;
			
			TimeGraphEntry entry = (TimeGraphEntry) event.getEntry();
			long stackQuark = ((TimeGraphEntry) entry).getModel().getId();
			
			//todo: this needs to be translated into a quark from an id
			
			try {
				
				ITmfStateValue value;
				
				//int quarkMe = cse.getQuark();
				int quarkRef = stateSystem.getParentAttributeQuark((int) stackQuark);
				value = stateSystem.querySingleState(event.getTime(), quarkRef).getStateValue();				
				
				quarkRef = stateSystem.getParentAttributeQuark(quarkRef);
				value = stateSystem.querySingleState(event.getTime(), quarkRef).getStateValue();
				
				int quarkClock = stateSystem.getQuarkRelative(quarkRef, "clock");
				//String[] quarkPath = ss.getFullAttributePathArray(quarkRef);

				value = stateSystem.querySingleState(event.getTime(), quarkClock).getStateValue();
				if (!value.isNull()) {
					retMap.put("Model Clock", value.unboxStr());
				}
				
				
				String stackDepth = ss.getAttributeName(quarkMe);
				
				int quarkIO = ss.getQuarkRelative(quarkRef, "ioread", "totalTime", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkIO).getStateValue();
				long time = value.unboxLong();
				double pct = (double) time / event.getDuration();
				if (time > 0) {
					retMap.put("Read (time)", fTimeFormatter.format(time) + " (" + fPctFormatter.format(pct) + ")");
				}
		
				quarkIO = ss.getQuarkRelative(quarkRef, "ioread", "totalBytes", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkIO).getStateValue();
				if (value.unboxLong() > 0) {
					retMap.put("Read (bytes)", String.valueOf(value.unboxLong()));
				}
				
				quarkIO = ss.getQuarkRelative(quarkRef, "iowrite", "totalTime", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkIO).getStateValue();
				time = value.unboxLong();
				pct = (double) time / event.getDuration();
				if (time > 0) {
					retMap.put("Write (time)", fTimeFormatter.format(time) + " (" + fPctFormatter.format(pct) + ")");
				}
				
				quarkIO = ss.getQuarkRelative(quarkRef, "iowrite", "totalBytes", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkIO).getStateValue();
				if (value.unboxLong() > 0) {
					retMap.put("Write (bytes)", String.valueOf(value.unboxLong()));
				}
				
				int quarkMPI = ss.getQuarkRelative(quarkRef, "mpibarrier", "count", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkMPI).getStateValue();
				if (value.unboxLong() > 0) {
					retMap.put("MPI_Barrier (count)", String.valueOf(value.unboxLong()));
				}
				
				quarkMPI = ss.getQuarkRelative(quarkRef, "mpibarrier", "time", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkMPI).getStateValue();
				time = value.unboxLong();
				pct = (double) time / event.getDuration();
				if (time > 0) {
					retMap.put("MPI_Barrier (time)", fTimeFormatter.format(time) + " (" + fPctFormatter.format(pct) + ")");
				}
				
				quarkMPI = ss.getQuarkRelative(quarkRef, "mpiwait", "count", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkMPI).getStateValue();
				if (value.unboxLong() > 0) {
					retMap.put("MPI_Wait (count)", String.valueOf(value.unboxLong()));
				}
				
				quarkMPI = ss.getQuarkRelative(quarkRef, "mpiwait", "time", stackDepth);
				value = ss.querySingleState(event.getTime(), quarkMPI).getStateValue();
				time = value.unboxLong();
				pct = (double) time / event.getDuration();
				if (time > 0) {
					retMap.put("MPI_Wait (time)", fTimeFormatter.format(time) + " (" + fPctFormatter.format(pct) + ")");
				}
				
				
			}
			catch (AttributeNotFoundException e) {
				//ignore
			} catch (StateSystemDisposedException e) {
				//ignore
			}
			return retMap;
		
		}
		*/
		
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
