package org.earthsystemmodeling.cupid.trace;

public class ESMFId {
	public final long vmid;
	public final long baseid;
	public ESMFId(long vmid, long baseid) {
		this.vmid = vmid;
		this.baseid = baseid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ESMFId) {
			ESMFId other = (ESMFId) obj;
			return other.vmid == vmid && other.baseid == baseid; 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int) (vmid * 10000 + baseid);
	}
	
}
