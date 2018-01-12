package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.symbols.ISymbolProvider;
import org.eclipse.tracecompass.tmf.core.symbols.ISymbolProviderFactory;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

public class NUOPCSymbolProviderFactory implements ISymbolProviderFactory {

	@Override
	public @Nullable ISymbolProvider createProvider(ITmfTrace trace) {
		/*
		if (trace instanceof NUOPCCtfTrace) {
			return new NUOPCSymbolProvider((NUOPCCtfTrace) trace);
		}
		else {
			return null;
		}*/
		return null;
	}

}
