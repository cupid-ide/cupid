package org.earthsystemmodeling.cupid.trace.callstack.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.tracecompass.tmf.ui.dialog.TmfFileDialogFactory;

public abstract class ExportToTsvAction extends Action {

    private static final String[] EXTENSTIONS = { "*.tsv", "*.*" };//$NON-NLS-1$//$NON-NLS-2$

    /**
     * Gets the extension of TSV
     *
     * @return the extension of TSV
     */
    protected String[] getExtension() {
        return EXTENSTIONS;
    }

    @Override
    public String getText() {
        return String.valueOf("Export to TSV file");
    }

    @Override
    public String getToolTipText() {
        return String.valueOf("Export data to TSV file for import into another program, such as a spreadsheet");
    }
    
    public org.eclipse.jface.resource.ImageDescriptor getImageDescriptor() {
		return Activator.getImageDescriptor("icons/export_to_spreadsheet.gif");
	};


    @Override
    public void run() {
        Shell shell = getShell();
        if (shell == null) {
            return;
        }
        FileDialog fd = TmfFileDialogFactory.create(shell, SWT.SAVE);
        fd.setFilterExtensions(getExtension());
        String fileName = fd.open();
        if (fileName == null) {
            return;
        }
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            exportToTsv(fos);
        } catch (IOException e) {
            Activator.log(Status.ERROR, "IO Error " + fileName, e); //$NON-NLS-1$
        }
    }

    /**
     * Get the shell to open the file dialog
     *
     * @return the shell
     */
    protected abstract @Nullable Shell getShell();

    /**
     * Export a given items's TSV
     *
     * @param stream
     *            an output stream to write the TSV to
     */
    protected abstract void exportToTsv(OutputStream stream);
}
