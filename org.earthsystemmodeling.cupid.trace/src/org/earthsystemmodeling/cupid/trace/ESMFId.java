package org.earthsystemmodeling.cupid.trace;

public class ESMFId {
	
	public final long pet;
	public final long vmid;
	public final long baseid;
	
	public ESMFId(long pet, long vmid, long baseid) {
		this.pet = pet;
		this.vmid = vmid;
		this.baseid = baseid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ESMFId) {
			ESMFId other = (ESMFId) obj;
			return other.pet == pet && other.vmid == vmid && other.baseid == baseid; 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int) (pet * 100000 + vmid * 1000 + baseid);
	}
	
}
