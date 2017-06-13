package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.aspect.ITmfEventAspect;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;

public class PETAspect implements ITmfEventAspect<Integer> {

	@Override
	public String getName() {
		return "PET";
	}

	@Override
	public String getHelpText() {
		return "The PET on which the event occured";
			
	}

	@Override
	public @Nullable Integer resolve(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		return ((Long) e.getPacketAttributes().get("pet")).intValue();
	}

}
