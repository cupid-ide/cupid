package org.earthsystemmodeling.cupid.trace;

public class ESMFPhaseId {
	
	public final ESMFId esmfId;
	public final long method;
	public final long phase;
	
	public ESMFPhaseId(ESMFId esmfId, long method, long phase) {
		this.esmfId = esmfId;
		this.method = method;
		this.phase = phase;
	}
	
	@Override
	public int hashCode() {
		return (int) (esmfId.hashCode()*23 + method*10 + phase);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ESMFPhaseId) {
			ESMFPhaseId other = (ESMFPhaseId) obj;
			return other.esmfId.equals(esmfId) && 
					other.method == method && other.phase == phase;
		}
		return false;
	}
}