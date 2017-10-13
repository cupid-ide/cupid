package org.earthsystemmodeling.cupid.trace;

public class ESMFPhaseId {
	public final long vmid;
	public final long baseid;
	public final long method;
	public final long phase;
	
	public ESMFPhaseId(long vmid, long baseid, long method, long phase) {
		this.vmid = vmid;
		this.baseid = baseid;
		this.method = method;
		this.phase = phase;
	}
	
	@Override
	public int hashCode() {
		return (int) (vmid * 10000 + baseid * 100 + method * 10 + phase);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ESMFPhaseId) {
			ESMFPhaseId other = (ESMFPhaseId) obj;
			return other.vmid == vmid && other.baseid == baseid 
					&& other.method == method && other.phase == phase;
		}
		return false;
	}
}