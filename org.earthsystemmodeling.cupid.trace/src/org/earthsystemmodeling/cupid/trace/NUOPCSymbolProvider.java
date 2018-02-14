package org.earthsystemmodeling.cupid.trace;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.symbols.ISymbolProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

public class NUOPCSymbolProvider implements ISymbolProvider {

	private final NUOPCCtfTrace fTrace;
	
	public NUOPCSymbolProvider(NUOPCCtfTrace trace) {
		this.fTrace = trace;
	}
	
	@Override
	public ITmfTrace getTrace() {
		return fTrace;
	}

	@Override
	public void loadConfiguration(@Nullable IProgressMonitor monitor) {

	}

	@Override
	public @Nullable String getSymbolText(long address) {
		return "NUOPCSYMBOL";
	}
	
	@Override
	public @Nullable String getSymbolText(int pid, long timestamp, long address) {
		return ISymbolProvider.super.getSymbolText(pid, timestamp, address);
	}

}