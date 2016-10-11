package org.earthsystemmodeling.cupid.trace;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.event.lookup.ITmfCallsite;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.symbols.ISymbolProvider;
import org.eclipse.tracecompass.tmf.ui.symbols.ISymbolProviderPreferencePage;

public class NUOPCSymbolProvider implements ISymbolProvider {

	@Override
	public @NonNull ITmfTrace getTrace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadConfiguration(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public @Nullable String getSymbolText(long address) {
		return "MY_SYMBOL";
	}

	@Override
	public @Nullable ITmfCallsite getSymbolInfo(long address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable ISymbolProviderPreferencePage createPreferencePage() {
		// TODO Auto-generated method stub
		return null;
	}

}
