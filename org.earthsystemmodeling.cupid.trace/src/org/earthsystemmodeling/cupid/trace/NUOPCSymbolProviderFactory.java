package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.symbols.ISymbolProvider;
import org.eclipse.tracecompass.tmf.ui.symbols.ISymbolProviderFactory;

public class NUOPCSymbolProviderFactory implements ISymbolProviderFactory {

	@Override
	public @Nullable ISymbolProvider createProvider(@NonNull ITmfTrace trace) {
		if (trace instanceof NUOPCTrace) {
			return new NUOPCSymbolProvider();
		}
		return null;
	}

}
