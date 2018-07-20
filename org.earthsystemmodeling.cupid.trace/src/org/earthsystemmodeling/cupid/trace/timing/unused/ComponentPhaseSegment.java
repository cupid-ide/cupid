package org.earthsystemmodeling.cupid.trace.timing.unused;

import org.eclipse.tracecompass.segmentstore.core.segment.interfaces.INamedSegment;

public class ComponentPhaseSegment implements INamedSegment {

	private static final long serialVersionUID = 7835659504520120844L;
	
	long fStart = -1;
	long fEnd = -1;
	long fVmId = -1;
	long fBaseId = -1;
	long fMethod = -1;
	long fPhase = -1;
	
	String fComponentName = null;
	String fPhaseLabel = null;
	
	public ComponentPhaseSegment(long vmid, long baseid, long method, long phase) {
		fVmId = vmid;
		fBaseId = baseid;
		fMethod = method;
		fPhase = phase;
	}
	
	public void setStart(long start) {
		fStart = start;
	}
	
	@Override
	public long getStart() {
		return fStart;
	}
	
	public void setEnd(long end) {
		fEnd = end;
	}

	@Override
	public long getEnd() {
		return fEnd;
	}

	public void setComponentName(String name) {
		fComponentName = name;
	}
	
	@Override
	public String getName() {
		return "[" + fComponentName + "] " + fPhaseLabel; 
	}
	
	public String getComponentName() {
		return fComponentName;
	}

	public void setPhaseLabel(String label) {
		fPhaseLabel = label;
	}
	
	public String getPhaseLabel() {
		return fPhaseLabel;
	}
	

}
