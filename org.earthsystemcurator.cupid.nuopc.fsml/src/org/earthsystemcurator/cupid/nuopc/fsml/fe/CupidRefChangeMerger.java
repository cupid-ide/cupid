package org.earthsystemcurator.cupid.nuopc.fsml.fe;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.merge.ReferenceChangeMerger;

public class CupidRefChangeMerger extends ReferenceChangeMerger {

	public CupidRefChangeMerger() {
		System.out.println("Creating CupidRefChangeMerger");
		setRanking(100);
	}
	
	@Override
	public void copyRightToLeft(Diff target, Monitor monitor) {
		final ReferenceChange diff = (ReferenceChange) target;
		System.out.println("Copying right to left: " + diff.getValue());
		super.copyRightToLeft(target, monitor);		
	}
	
}
