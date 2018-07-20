package org.earthsystemmodeling.cupid.trace.timing.unused;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.ESMFId;
import org.earthsystemmodeling.cupid.trace.ESMFPhaseId;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.AbstractSegmentStoreAnalysisEventBasedModule;
import org.eclipse.tracecompass.segmentstore.core.ISegment;
import org.eclipse.tracecompass.segmentstore.core.ISegmentStore;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.segment.ISegmentAspect;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.CtfEnumPair;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;

import com.google.common.collect.ImmutableList;

public class NUOPCCtfComponentTimingAnalysis extends AbstractSegmentStoreAnalysisEventBasedModule {

    public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfComponentTimingAnalysisModule";
    
    private static final Collection<ISegmentAspect> BASE_ASPECTS =
            ImmutableList.of(ComponentNameAspect.INSTANCE, PhaseLabelAspect.INSTANCE);
    
    public NUOPCCtfComponentTimingAnalysis() {
		//registerOutput(new TmfAnalysisViewOutput(ComponentSegStoreTableView.ID, ID));
    }
    
    
    
    @Override
    protected Iterable<IAnalysisModule> getDependentAnalyses() {   	
    	List<IAnalysisModule> deps = new LinkedList<>();
    	super.getDependentAnalyses().forEach(m->{deps.add(m);});
    	IAnalysisModule toAdd = 
    			TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
    	if (toAdd == null) {
    		Activator.logWarning("NUOPCCtfComponentTimingAnalysis: Cannot find NUOPC analysis module.");
    	}
    	deps.add(toAdd);
    	return deps;
    }
    
    @Override
    public String getId() {
        return ID;
    }
    
    @Override
    public Iterable<ISegmentAspect> getSegmentAspects() {
        return BASE_ASPECTS;
    }

    /*
    @Override
    protected @NonNull SegmentStoreType getSegmentStoreType() {
        return SegmentStoreType.OnDisk;
    }
    */
        
	
	@Override
	protected AbstractSegmentStoreAnalysisRequest createAnalysisRequest(ISegmentStore<ISegment> segmentStore,
			IProgressMonitor monitor) {
		return new TimingAnalysisRequest(segmentStore);
	}

			
	private class TimingAnalysisRequest extends AbstractSegmentStoreAnalysisRequest {

		private final Map<ESMFPhaseId, ComponentPhaseSegment> segMap = new HashMap<>();
		
		private NUOPCCtfStateSystemAnalysisModule stateAnalysis;
		
		public TimingAnalysisRequest(ISegmentStore<ISegment> segmentStore) {
			super(segmentStore);
			stateAnalysis = TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), 
	    			NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);	
		}
		
		@Override
		public void handleData(ITmfEvent event) {
			super.handleData(event);
			
			if (event.getType().getName().equals("phase_enter")) {
				
				long vmid = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");
				CtfTmfEvent e = (CtfTmfEvent) event;
				long pet = (Long) e.getPacketAttributes().get("pet");
				
				ESMFId id = new ESMFId(pet, vmid, baseid);
				ESMFPhaseId phaseId = new ESMFPhaseId(id, mp.getLongValue(), phase);
				String name = stateAnalysis.queryComponentName(id);
				String label = stateAnalysis.queryComponentPhaseLabel(phaseId);
								
				ComponentPhaseSegment seg = new ComponentPhaseSegment(vmid, baseid, mp.getLongValue(), phase);
				seg.setComponentName(name);
				seg.setPhaseLabel(label);
				seg.setStart(event.getTimestamp().toNanos());
				segMap.put(phaseId, seg);
								
			}
			else if (event.getType().getName().equals("phase_exit")) {
				
				long vmid = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");
				CtfTmfEvent e = (CtfTmfEvent) event;
				long pet = (Long) e.getPacketAttributes().get("pet");
				
				ESMFId id = new ESMFId(pet, vmid, baseid);
				ESMFPhaseId phaseId = new ESMFPhaseId(id, mp.getLongValue(), phase);
				
				ComponentPhaseSegment seg = segMap.remove(phaseId);
				if (seg != null) {
					seg.setEnd(event.getTimestamp().toNanos());
					getSegmentStore().add(seg);
				}
				
			}
			
		}
		
		@Override
        public void handleCompleted() {
            segMap.clear();
            super.handleCompleted();
        }
		
	}
	
	private static final class ComponentNameAspect implements ISegmentAspect {

		public static final ISegmentAspect INSTANCE = new ComponentNameAspect();
		
		@Override
		public String getName() {
			return "Component";
		}

		@Override
		public String getHelpText() {
			return null;
		}

		@Override
		public @Nullable Comparator<?> getComparator() {
			return null;
		}

		@Override
		public @Nullable Object resolve(ISegment segment) {
			if (segment instanceof ComponentPhaseSegment) {
				return ((ComponentPhaseSegment) segment).getName();
			}
			return null;
		}

	}
	
	private static final class PhaseLabelAspect implements ISegmentAspect {

		public static final ISegmentAspect INSTANCE = new PhaseLabelAspect();
		
		@Override
		public String getName() {
			return "Phase";
		}

		@Override
		public String getHelpText() {
			return null;
		}

		@Override
		public @Nullable Comparator<?> getComparator() {
			return null;
		}

		@Override
		public @Nullable Object resolve(ISegment segment) {
			if (segment instanceof ComponentPhaseSegment) {
				return ((ComponentPhaseSegment) segment).getPhaseLabel();
			}
			return null;
		}

	}

	
	
}
