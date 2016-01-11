package org.earthsystemmodeling.cupid.template.ui;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI;
import org.earthsystemmodeling.cupid.template.core.ProtexStore;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class ProtexPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {


	private class ProtexLabelProvider extends LabelProvider implements ITableLabelProvider {

		/*
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		/*
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
		 */
		public String getColumnText(Object element, int columnIndex) {

			String apiid = (String) element;
			//ProtexStore store = ProtexStore.getInstance();
			//ProtexAPI api = store.load(apiid);

			switch (columnIndex) {
			case 0:
				return apiid;
			default:
				return "";
			}
		}
	}

	private class ProtexContentProvider implements IStructuredContentProvider {

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return ProtexStore.getInstance().listAPIs().toArray();
		}

	}

	private CheckboxTableViewer fTableViewer;

	private Button fAddButton;
	private Button fImportButton;
	private Button fExportButton;
	private Button fRemoveButton;

	private SourceViewer fPatternViewer;

	private ProtexStore protexStore;

	/**
	 * Creates a new template preference page.
	 */
	public ProtexPreferencePage() {
		super();
		setDescription("Protex preferences");
		protexStore = ProtexStore.getInstance();
	}


	/*
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	/*
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite ancestor) {
		Composite parent= new Composite(ancestor, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.numColumns= 2;
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		parent.setLayout(layout);

		Composite innerParent= new Composite(parent, SWT.NONE);
		GridLayout innerLayout= new GridLayout();
		innerLayout.numColumns= 2;
		innerLayout.marginHeight= 0;
		innerLayout.marginWidth= 0;
		innerParent.setLayout(innerLayout);
		GridData gd= new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan= 2;
		innerParent.setLayoutData(gd);

		Composite tableComposite= new Composite(innerParent, SWT.NONE);
		GridData data= new GridData(GridData.FILL_BOTH);
		data.widthHint= 360;
		data.heightHint= convertHeightInCharsToPixels(10);
		tableComposite.setLayoutData(data);

		TableColumnLayout columnLayout= new TableColumnLayout();
		tableComposite.setLayout(columnLayout);
		Table table= new Table(tableComposite, SWT.CHECK | SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		GC gc= new GC(getShell());
		gc.setFont(JFaceResources.getDialogFont());

		TemplateViewerComparator viewerComparator= new TemplateViewerComparator();

		TableColumn column1= new TableColumn(table, SWT.NONE);
		column1.setText("Name");
		//int minWidth= computeMinimumColumnWidth(gc, "Name");
		columnLayout.setColumnData(column1, new ColumnWeightData(1));
		column1.addSelectionListener(new TemplateColumnSelectionAdapter(column1, 0, viewerComparator));

		/*
		TableColumn column2= new TableColumn(table, SWT.NONE);
		column2.setText("col2");
		//minWidth= computeMinimumContextColumnWidth(gc);
		//columnLayout.addColumnData(new ColumnWeightData(1, minWidth, true));
		columnLayout.setColumnData(column2, new ColumnWeightData(1));
		column2.addSelectionListener(new TemplateColumnSelectionAdapter(column2, 1, viewerComparator));

		TableColumn column3= new TableColumn(table, SWT.NONE);
		column3.setText("col3");
		minWidth= computeMinimumColumnWidth(gc, "col3");
		//columnLayout.addColumnData(new ColumnWeightData(3, minWidth, true));
		columnLayout.setColumnData(column3, new ColumnWeightData(1));
		column3.addSelectionListener(new TemplateColumnSelectionAdapter(column3, 2, viewerComparator));

		TableColumn column4= new TableColumn(table, SWT.NONE);
		column4.setAlignment(SWT.CENTER);
		column4.setText("col4");
		minWidth= computeMinimumColumnWidth(gc, "col4");
		minWidth= Math.max(minWidth, computeMinimumColumnWidth(gc, "col4"));
		//columnLayout.addColumnData(new ColumnPixelData(minWidth, false, false));
		columnLayout.setColumnData(column4, new ColumnWeightData(1));
		column4.addSelectionListener(new TemplateColumnSelectionAdapter(column4, 3, viewerComparator));
		 */

		gc.dispose();

		fTableViewer= new CheckboxTableViewer(table);
		fTableViewer.setLabelProvider(new ProtexLabelProvider());
		fTableViewer.setContentProvider(new ProtexContentProvider());
		fTableViewer.setComparator(viewerComparator);

		// Specify default sorting
		table.setSortColumn(column1);
		table.setSortDirection(viewerComparator.getDirection());

		fTableViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent e) {
				//edit();
			}
		});

		fTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent e) {
				selectionChanged1();
			}
		});

		fTableViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				String apiid = (String) event.getElement();
				if (event.getChecked()) {
					protexStore.activateAPI(apiid);
				}
				else {
					protexStore.deactivateAPI(apiid);
				}				
			}
		});

		BidiUtils.applyTextDirection(fTableViewer.getControl(), BidiUtils.BTD_DEFAULT);

		Composite buttons= new Composite(innerParent, SWT.NONE);
		buttons.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		buttons.setLayout(layout);

		fAddButton= new Button(buttons, SWT.PUSH);
		fAddButton.setText("New");
		fAddButton.setToolTipText("Scan a set of files for Protex and create a new Protex API");
		fAddButton.setLayoutData(getButtonGridData(fAddButton));
		fAddButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				add();
			}
		});

		fRemoveButton= new Button(buttons, SWT.PUSH);
		fRemoveButton.setText("Remove");
		fRemoveButton.setLayoutData(getButtonGridData(fRemoveButton));
		fRemoveButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				remove();
			}
		});

		createSeparator(buttons);

		fImportButton= new Button(buttons, SWT.PUSH);
		fImportButton.setText("Import");
		fImportButton.setLayoutData(getButtonGridData(fImportButton));
		fImportButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				import_();
			}
		});

		fExportButton= new Button(buttons, SWT.PUSH);
		fExportButton.setText("Export");
		fExportButton.setLayoutData(getButtonGridData(fExportButton));
		fExportButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				export();
			}
		});

		fPatternViewer= doCreateViewer(parent);

		fTableViewer.setInput("");
		fTableViewer.setAllChecked(false);
		fTableViewer.setCheckedElements(activeProtexAPIs());

		updateButtons();
		Dialog.applyDialogFont(parent);
		innerParent.layout();

		return parent;
	}

	private Object[] activeProtexAPIs() {
		List<String> actives = new ArrayList<String>();
		for (String apiid : protexStore.listAPIs()) {
			if (protexStore.isActiveAPI(apiid)) {
				actives.add(apiid);
			}
		}
		return actives.toArray();
	}

	/**
	 * Creates a separator between buttons.
	 *
	 * @param parent the parent composite
	 * @return a separator
	 */
	private Label createSeparator(Composite parent) {
		Label separator= new Label(parent, SWT.NONE);
		separator.setVisible(false);
		GridData gd= new GridData();
		gd.horizontalAlignment= GridData.FILL;
		gd.verticalAlignment= GridData.BEGINNING;
		gd.heightHint= 4;
		separator.setLayoutData(gd);
		return separator;
	}


	/**
	 * Returns whether the formatter preference checkbox should be shown.
	 *
	 * @return <code>true</code> if the formatter preference checkbox should
	 *         be shown, <code>false</code> otherwise
	 */
	protected boolean isShowFormatterSetting() {
		return true;
	}


	private SourceViewer doCreateViewer(Composite parent) {
		Label label= new Label(parent, SWT.NONE);
		label.setText("Preview");
		GridData data= new GridData();
		data.horizontalSpan= 2;
		label.setLayoutData(data);

		SourceViewer viewer= createViewer(parent);

		viewer.setEditable(false);
		Cursor arrowCursor= viewer.getTextWidget().getDisplay().getSystemCursor(SWT.CURSOR_ARROW);
		viewer.getTextWidget().setCursor(arrowCursor);

		// Don't set caret to 'null' as this causes https://bugs.eclipse.org/293263
		//		viewer.getTextWidget().setCaret(null);

		Control control= viewer.getControl();
		data= new GridData(GridData.FILL_BOTH);
		data.horizontalSpan= 2;
		data.heightHint= convertHeightInCharsToPixels(5);
		control.setLayoutData(data);

		return viewer;
	}

	/**
	 * Creates, configures and returns a source viewer to present the template
	 * pattern on the preference page. Clients may override to provide a custom
	 * source viewer featuring e.g. syntax coloring.
	 *
	 * @param parent the parent control
	 * @return a configured source viewer
	 */
	protected SourceViewer createViewer(Composite parent) {
		SourceViewer viewer= new SourceViewer(parent, null, null, false, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		SourceViewerConfiguration configuration= new SourceViewerConfiguration();
		viewer.configure(configuration);
		IDocument document= new Document();
		viewer.setDocument(document);
		return viewer;
	}

	/**
	 * Return the grid data for the button.
	 *
	 * @param button the button
	 * @return the grid data
	 */
	private static GridData getButtonGridData(Button button) {
		GridData data= new GridData(GridData.FILL_HORIZONTAL);
		// TODO replace SWTUtil
		//		data.widthHint= SWTUtil.getButtonWidthHint(button);
		//		data.heightHint= SWTUtil.getButtonHeightHint(button);

		return data;
	}

	private void selectionChanged1() {
		updateViewerInput();
		updateButtons();
	}

	/**
	 * Updates the pattern viewer.
	 */
	protected void updateViewerInput() {
		IStructuredSelection selection= (IStructuredSelection) fTableViewer.getSelection();

		/*
		if (selection.size() == 1) {
			TemplatePersistenceData data= (TemplatePersistenceData) selection.getFirstElement();
			Template template= data.getTemplate();
			fPatternViewer.getDocument().set(template.getPattern());
		} else {
			fPatternViewer.getDocument().set(""); //$NON-NLS-1$
		}
		 */
	}

	/**
	 * Updates the buttons.
	 */
	protected void updateButtons() {
		IStructuredSelection selection= (IStructuredSelection) fTableViewer.getSelection();
		int selectionCount= selection.size();
		int itemCount= fTableViewer.getTable().getItemCount();

		fExportButton.setEnabled(selectionCount == 1);
		fRemoveButton.setEnabled(selectionCount > 0 && selectionCount <= itemCount);
	}

	private void add() {

		ResourceSelectionDialog dialog = 
				new ResourceSelectionDialog(getShell(),
						ResourcesPlugin.getWorkspace().getRoot(), "Select resources to scan for Protex");

		dialog.setTitle("Resource Selection");
		dialog.open();
		if (dialog.getReturnCode() == Window.CANCEL) {
			return;
		}

		Object[] resourceList = dialog.getResult();

		InputDialog inputDialog = getInputDialogForAPIID(getShell());
		inputDialog.open();
		if (inputDialog.getReturnCode() == Window.CANCEL) {
			return;
		}
		String newid = inputDialog.getValue();

		Job parseJob = new ParseProtexJob("Parse Protex", newid, Arrays.asList(resourceList));
		parseJob.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (fTableViewer != null && !fTableViewer.getTable().isDisposed()) {
							fTableViewer.refresh();
							fTableViewer.setCheckedElements(activeProtexAPIs());
						}
					}
				});
			}

		});
		parseJob.schedule();
	}

	public static InputDialog getInputDialogForAPIID(Shell shell) {
		InputDialog inputDialog = new InputDialog(shell, 
				"Protex API Name", 
				"Please choose an ID for the Protex API.  This is typically of the form \"api_name.version\".", 
				"myapi.v01",
				new IInputValidator() {							
			@Override
			public String isValid(String newText) {
				if (newText.length() == 0) {
					return "Please provide an ID for the Protex API.";
				}
				else {
					return null;
				}
			}
		});
		return inputDialog;
	}


	/*
	protected Template editTemplate(Template template, boolean edit, boolean isNameModifiable) {
		EditTemplateDialog dialog= new EditTemplateDialog(getShell(), template, edit, isNameModifiable, fContextTypeRegistry);
		if (dialog.open() == Window.OK) {
			return dialog.getTemplate();
		}
		return null;
	}

	private void edit() {
		IStructuredSelection selection= (IStructuredSelection) fTableViewer.getSelection();

		Object[] objects= selection.toArray();
		if ((objects == null) || (objects.length != 1))
			return;

		TemplatePersistenceData data= (TemplatePersistenceData) selection.getFirstElement();
		edit(data);
	}

	private void edit(TemplatePersistenceData data) {
		Template oldTemplate= data.getTemplate();
		Template newTemplate= editTemplate(new Template(oldTemplate), true, true);
		if (newTemplate != null) {

			if (!newTemplate.getName().equals(oldTemplate.getName()) &&
				MessageDialog.openQuestion(getShell(),
				TemplatesMessages.TemplatePreferencePage_question_create_new_title,
				TemplatesMessages.TemplatePreferencePage_question_create_new_message))
			{
				data= new TemplatePersistenceData(newTemplate, true);
				fTemplateStore.add(data);
				fTableViewer.refresh();
			} else {
				data.setTemplate(newTemplate);
				fTableViewer.refresh(data);
			}
			selectionChanged1();
			fTableViewer.setChecked(data, data.isEnabled());
			fTableViewer.setSelection(new StructuredSelection(data));
		}
	}
	 */

	private void import_() {
		FileDialog dialog= new FileDialog(getShell());
		dialog.setText("Import");
		//dialog.setFilterExtensions(new String[] {TemplatesMessages.TemplatePreferencePage_import_extension});
		String path= dialog.open();

		if (path == null)
			return;

		/*
		try {
			TemplateReaderWriter reader= new TemplateReaderWriter();
			File file= new File(path);
			if (file.exists()) {
				InputStream input= new BufferedInputStream(new FileInputStream(file));
				try {
					TemplatePersistenceData[] datas= reader.read(input, null);
					for (int i= 0; i < datas.length; i++) {
						TemplatePersistenceData data= datas[i];
						fTemplateStore.add(data);
					}
				} finally {
					try {
						input.close();
					} catch (IOException x) {
						// ignore
					}
				}
			}

			fTableViewer.refresh();
			fTableViewer.setAllChecked(false);
			fTableViewer.setCheckedElements(getEnabledTemplates());

		} catch (FileNotFoundException e) {
			openReadErrorDialog(e);
		} catch (IOException e) {
			openReadErrorDialog(e);
		}
		 */
	}

	private void export() {
		IStructuredSelection selection= (IStructuredSelection) fTableViewer.getSelection();
		Object[] templates= selection.toArray();

		/*
		TemplatePersistenceData[] datas= new TemplatePersistenceData[templates.length];
		for (int i= 0; i != templates.length; i++)
			datas[i]= (TemplatePersistenceData) templates[i];

		export(datas);
		 */
	}

	/*
	private void export(TemplatePersistenceData[] templates) {
		FileDialog dialog= new FileDialog(getShell(), SWT.SAVE);
		dialog.setText(TemplatesMessages.TemplatePreferencePage_export_title);
		dialog.setFilterExtensions(new String[] {TemplatesMessages.TemplatePreferencePage_export_extension});
		dialog.setFileName(TemplatesMessages.TemplatePreferencePage_export_filename);
		String path= dialog.open();

		if (path == null)
			return;

		File file= new File(path);

		if (file.isHidden()) {
			String title= TemplatesMessages.TemplatePreferencePage_export_error_title;
			String message= NLSUtility.format(TemplatesMessages.TemplatePreferencePage_export_error_hidden, file.getAbsolutePath());
			MessageDialog.openError(getShell(), title, message);
			return;
		}

		if (file.exists() && !file.canWrite()) {
			String title= TemplatesMessages.TemplatePreferencePage_export_error_title;
			String message= NLSUtility.format(TemplatesMessages.TemplatePreferencePage_export_error_canNotWrite, file.getAbsolutePath());
			MessageDialog.openError(getShell(), title, message);
			return;
		}

		if (!file.exists() || confirmOverwrite(file)) {
			OutputStream output= null;
			try {
				output= new BufferedOutputStream(new FileOutputStream(file));
				TemplateReaderWriter writer= new TemplateReaderWriter();
				writer.save(templates, output);
			} catch (IOException e) {
				openWriteErrorDialog(e);
			} finally {
				if (output != null) {
					try {
						output.close();
					} catch (IOException e) {
						// ignore
					}
				}
			}
		}
	}
	 */

	private boolean confirmOverwrite(File file) {
		return MessageDialog.openQuestion(getShell(),
				"Export file exists",
				"Export exists message: " + file.getAbsolutePath());
	}

	private void remove() {
		IStructuredSelection selection= (IStructuredSelection) fTableViewer.getSelection();

		boolean response = MessageDialog.openQuestion(getShell(),
				"Confirm Delete",
				"Are you sure you want to delete the selected Protex APIs?");

		if (response) {
			Iterator elements= selection.iterator();
			while (elements.hasNext()) {
				String apiid = (String) elements.next();
				protexStore.removeAPI(apiid);
			}
		}

		fTableViewer.refresh();
	}




	/*
	 * @see Control#setVisible(boolean)
	 */
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible)
			setTitle("Protex preferences");
	}

	/*
	 * @see PreferencePage#performDefaults()
	 */
	protected void performDefaults() {
		/*
		if (isShowFormatterSetting()) {
			IPreferenceStore prefs= getPreferenceStore();
			fFormatButton.setSelection(prefs.getDefaultBoolean(getFormatterPreferenceKey()));
		}

		fTemplateStore.restoreDefaults(false);

		// refresh
		fTableViewer.refresh();
		fTableViewer.setAllChecked(false);
		fTableViewer.setCheckedElements(getEnabledTemplates());
		 */
	}

	/*
	 * @see PreferencePage#performOk()
	 */
	public boolean performOk() {
		/*
		if (isShowFormatterSetting()) {
			IPreferenceStore prefs= getPreferenceStore();
			prefs.setValue(getFormatterPreferenceKey(), fFormatButton.getSelection());
		}

		try {
			fTemplateStore.save();
		} catch (IOException e) {
			openWriteErrorDialog(e);
		}
		 */
		return super.performOk();
	}


	/*
	 * @see PreferencePage#performCancel()
	 */
	public boolean performCancel() {
		/*
		try {
			fTemplateStore.load();
		} catch (IOException e) {
			openReadErrorDialog(e);
			return false;
		}
		 */
		return super.performCancel();
	}

	/*
	private void openReadErrorDialog(IOException ex) {

		IStatus status= new Status(IStatus.ERROR, TextEditorPlugin.PLUGIN_ID, IStatus.OK, "Failed to read templates.", ex); //$NON-NLS-1$
		TextEditorPlugin.getDefault().getLog().log(status);
		String title= TemplatesMessages.TemplatePreferencePage_error_read_title;
		String message= TemplatesMessages.TemplatePreferencePage_error_read_message;
		MessageDialog.openError(getShell(), title, message);
	}

	private void openWriteErrorDialog(IOException ex) {
		IStatus status= new Status(IStatus.ERROR, TextEditorPlugin.PLUGIN_ID, IStatus.OK, "Failed to write templates.", ex); //$NON-NLS-1$
		TextEditorPlugin.getDefault().getLog().log(status);
		String title= TemplatesMessages.TemplatePreferencePage_error_write_title;
		String message= TemplatesMessages.TemplatePreferencePage_error_write_message;
		MessageDialog.openError(getShell(), title, message);
	}
	 */

	protected SourceViewer getViewer() {
		return fPatternViewer;
	}

	protected TableViewer getTableViewer() {
		return fTableViewer;
	}

	private final class TemplateViewerComparator extends ViewerComparator {

		private int fSortColumn;

		private int fSortOrder; // 1 = asc, -1 = desc

		public TemplateViewerComparator() {
			fSortColumn= 0;
			fSortOrder= 1;
		}

		/**
		 * Returns the {@linkplain SWT} style constant for the sort direction.
		 * 
		 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
		 */
		public int getDirection() {
			return fSortOrder == 1 ? SWT.DOWN : SWT.UP;
		}

		/**
		 * Sets the sort column. If the newly set sort column equals the previous set sort column,
		 * the sort direction changes.
		 * 
		 * @param column New sort column
		 */
		public void setColumn(int column) {
			if (column == fSortColumn) {
				fSortOrder*= -1;
			} else {
				fSortColumn= column;
				fSortOrder= 1;
			}
		}

		public int compare(Viewer viewer, Object e1, Object e2) {

			if (viewer instanceof TableViewer) {
				IBaseLabelProvider baseLabel= ((TableViewer)viewer).getLabelProvider();

				String left= ((ProtexLabelProvider)baseLabel).getColumnText(e1, fSortColumn);
				String right= ((ProtexLabelProvider)baseLabel).getColumnText(e2, fSortColumn);
				int sortResult= getComparator().compare(left, right);
				return sortResult * fSortOrder;
			}

			return super.compare(viewer, e1, e2);
		}
	}

	private final class TemplateColumnSelectionAdapter extends SelectionAdapter {

		private final TableColumn fTableColumn;

		private final int fColumnIndex;

		private final TemplateViewerComparator fViewerComparator;

		public TemplateColumnSelectionAdapter(TableColumn column, int index, TemplateViewerComparator vc) {
			fTableColumn= column;
			fColumnIndex= index;
			fViewerComparator= vc;
		}

		public void widgetSelected(SelectionEvent e) {
			fViewerComparator.setColumn(fColumnIndex);
			int dir= fViewerComparator.getDirection();
			fTableViewer.getTable().setSortDirection(dir);
			fTableViewer.getTable().setSortColumn(fTableColumn);
			fTableViewer.refresh();
		}
	}
}
