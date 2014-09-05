package org.earthsystemmodeling.cupid.views;


import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.NoMoreSolutionException;
import alice.tuprolog.NoSolutionException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Var;


public class CodeQueryView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemmodeling.cupid.views.CodeQueryView";

	private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	private Text textQuery;
	private Combo comboQuery;
	private ViewContentProvider viewContentProvider;
	//private List<String> queryCache = new ArrayList<String>();
	
	class ViewContentProvider implements IStructuredContentProvider {
		
		String query;
		Prolog prolog = null;
		List<List<String>> resultList = new ArrayList<List<String>>();
		List<String> queryCache = new ArrayList<String>();
		
		public void setProlog(Prolog prolog) {
			this.prolog = prolog;
		}
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			this.query = (String) newInput;
			
			if (prolog == null) {
				showMessage("Code database not loaded.");
				return;
			}
						
			//clear columns
			for (int i = 0; i < viewer.getTable().getColumnCount(); i++) {
				viewer.getTable().getColumn(i).setText("");
			}
			
			resultList = new ArrayList<List<String>>();
			
			try {
						
				SolveInfo sol = prolog.solve(query);
				
				if (!queryCache.contains(query)) {
					queryCache.add(query);
					if (comboQuery != null) {
						comboQuery.add(query);
					}
				}
				
				//reset column names
				int i = 0;
				for (Var var : sol.getBindingVars()) {
					if (i > viewer.getTable().getColumnCount()-1) {
						createTableViewerColumn(var.getName());
					}
					else {
						viewer.getTable().getColumn(i).setText(var.getName());
					}
					i++;
				}
				
				//add data
				while (true) {
					
					try {
						
						List<String> result = new ArrayList<String>();
						for (Var var : sol.getBindingVars()) {
							result.add(sol.getVarValue(var.getName()).toString());
						}
						resultList.add(result);
											
						sol = prolog.solveNext();
					} catch (NoMoreSolutionException e) {
						break;
					}
					
				}
				
				
				
			} catch (MalformedGoalException e1) {
				showMessage("Invalid query");
			} catch (NoSolutionException e1) {
				showMessage("The query returned no results");
			}
			
			viewer.setLabelProvider(new ViewLabelProvider());
			
		}
		
		public void dispose() {
		}
		
		public Object[] getElements(Object parent) {
			return resultList.toArray();	
		}
	}
	
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		
		public String getColumnText(Object obj, int index) {
			if (obj instanceof List) {
				return ((List) obj).get(index).toString();
			}
			else {
				return obj.toString();
			}
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	class NameSorter extends ViewerSorter {
	}
	
	
	/**
	 * The constructor.
	 */
	public CodeQueryView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		//this.parent = parent;
		
		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);
		
		GridData data;
		
		Label labelQueryHistory = new Label(parent, SWT.NONE);
	    labelQueryHistory.setText("Query history");
	    data = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
	    labelQueryHistory.setLayoutData(data);
	    
		comboQuery = new Combo (parent, SWT.READ_ONLY);
	    data = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
	    comboQuery.setLayoutData(data);
	    //comboQuery.setItems (new String [] {"Alpha", "Bravo", "Charlie"});
	    comboQuery.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		textQuery.setText(textQuery.getText() + "\n" + comboQuery.getText());
	    	}	    	
	    });
	    
		Label labelQuery = new Label(parent, SWT.NONE);
	    labelQuery.setText("Query");
	    data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
	    labelQuery.setLayoutData(data);
		
	    textQuery = new Text(parent, SWT.BORDER | SWT.MULTI);
	    //textQuery.setSize(100, 400);
	    data = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
	    textQuery.setLayoutData(data);
	    
	    Button buttonClear = new Button(parent, SWT.PUSH);
	    data = new GridData(SWT.END, SWT.FILL, false, false, 1, 1);
	    buttonClear.setLayoutData(data);
	    buttonClear.setText("Clear");
	    buttonClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (viewer != null) {
					viewer.getTable().clearAll();
				}
			}
		});
	    	    
	    Button buttonExec = new Button(parent, SWT.PUSH);
	    data = new GridData(SWT.END, SWT.FILL, false, false, 1, 1);
	    buttonExec.setLayoutData(data);
	    buttonExec.setText("Execute");
	    buttonExec.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//executeQuery(textQuery.getText());
				if (textQuery.getText().length() > 0) {
					viewer.setInput(textQuery.getText());
				}
			}
		});
	    
	    
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		data = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		viewer.getControl().setLayoutData(data);
		
		//createTableViewerColumn("A");
		//createTableViewerColumn("B");
		
		final Table table = viewer.getTable();
	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);
	   		
	    viewContentProvider = new ViewContentProvider();   
		viewer.setContentProvider(viewContentProvider);
		viewer.setLabelProvider(new ViewLabelProvider());
		
		
	    
		makeActions();
		//hookContextMenu();
		//hookDoubleClickAction();
		contributeToActionBars();
	}
	
	 private TableViewerColumn createTableViewerColumn(String title) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
	    final TableColumn column = viewerColumn.getColumn();
	    column.setText(title);
	    column.setWidth(80);
	    column.setResizable(true);
	    column.setMoveable(true);
	    //viewerColumn.setLabelProvider(new ViewLabelProvider());
	    return viewerColumn; 
	 }

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				CodeQueryView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		//fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				//TODO: for now
				viewContentProvider.setProlog(CodeDBIndex.getInstance().getProlog());
			}
		};
		action1.setText("Reload DB");
		action1.setToolTipText("Reload DB");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Code Query View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	
	
}