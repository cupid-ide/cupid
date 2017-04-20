package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.signal.TmfSignal;

public class PETSelectedSignal extends TmfSignal {

	long pet;
	
	protected PETSelectedSignal(Object source) {
		super(source);		
	}
	
	public PETSelectedSignal(long pet) {
		this(null);
		this.pet = pet;
	}
	
	public long getPet() {
		return pet;
	}

}
