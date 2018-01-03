package org.earthsystemmodeling.cupid.trace;

public class ESMFRegionId {
	public final long pet;
	public final long regionid;
	
	public ESMFRegionId(long pet, long regionid) {
		this.pet = pet;
		this.regionid = regionid;
	}
	
	@Override
	public int hashCode() {
		return (int) (pet * 10000 + regionid);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ESMFRegionId) {
			ESMFRegionId other = (ESMFRegionId) obj;
			return other.pet == pet && other.regionid == regionid; 					
		}
		return false;
	}
}