package org.earthsystemmodeling.cupid.views;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.part.ViewPart;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.NoMoreSolutionException;
import alice.tuprolog.NoSolutionException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Theory;
import alice.tuprolog.Var;
import alice.tuprolog.event.WarningEvent;
import alice.tuprolog.event.WarningListener;


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
	private Combo comboQT;
	private ViewContentProvider viewContentProvider;
	private Shell shell;
	private Label labelCount;
	//private List<String> queryCache = new ArrayList<String>();
	//private Prolog prolog = null;
	
	class ViewContentProvider implements IStructuredContentProvider {
		
		private WarningListener wl;
		
		public ViewContentProvider() {
			Prolog prolog = CodeDBIndex.getInstance().getProlog();
			wl = new WarningListener() {
				@Override
				public void onWarning(WarningEvent e) {
					showMessage(e.getMsg());					
				}
			};
			prolog.addWarningListener(wl);
		}
			
		
		
		String query;
		//Prolog prolog = null;
		List<List<String>> resultList = new ArrayList<List<String>>();
		List<String> queryCache = new ArrayList<String>();
		
		//public void setProlog(Prolog prolog) {
		//	this.prolog = prolog;
		//}
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			this.query = (String) newInput;
			
						
			//clear columns
			for (int i = 0; i < viewer.getTable().getColumnCount(); i++) {
				viewer.getTable().getColumn(i).setText("");
			}
			
			resultList = new ArrayList<List<String>>();
			
			try {
						
				//SolveInfo sol = prolog.solve(query);
				ResultSet rs = CodeDBIndex.getInstance().query2(query);
				
				if (!queryCache.contains(query)) {
					queryCache.add(query);
					if (comboQuery != null) {
						comboQuery.add(query);
					}
				}
				
				//reset column names
				ResultSetMetaData rsm = rs.getMetaData();
				for (int i = 1; i <= rsm.getColumnCount(); i++) {
					if (i > viewer.getTable().getColumnCount()) {
						createTableViewerColumn(rsm.getColumnName(i));
					}
					else {
						viewer.getTable().getColumn(i-1).setText(rsm.getColumnName(i));
					}
				}
				
				//add data
				int count = 0;
				while (rs.next()) {
						count++;
						List<String> result = new ArrayList<String>();
						//for (Object objVar : sol.getBindingVars()) {
						//	Var var = (Var) objVar;
						//	result.add(sol.getVarValue(var.getName()).toString());
						//}
						for (int i = 1; i <= rsm.getColumnCount(); i++) {
							result.add(rs.getString(i));
						}
						resultList.add(result);
				}
				
				labelCount.setText("Total results: " + count);
				
					
			} catch (MalformedGoalException e1) {
				showMessage("Invalid query");
			} catch (SQLException e1) {
				showMessage("SQL Exception: " + e1.getMessage());
			}
			
			viewer.setLabelProvider(new ViewLabelProvider());
			
		}
		
		public void dispose() {
			if (wl != null) {
				Prolog prolog = CodeDBIndex.getInstance().getProlog();
				if (prolog != null) {
					prolog.removeWarningListener(wl);
				}
			}
		}
		
		public Object[] getElements(Object parent) {
			return resultList.toArray();	
		}
	}
	
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		
		public String getColumnText(Object obj, int index) {
			if (obj instanceof List) {
				if (index > ((List)obj).size()-1) {
					return null;
				}
				else if (((List) obj).get(index) == null) {
					return "(null)";
				}
				else {
					return ((List) obj).get(index).toString();
				}
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
	
		this.shell = parent.getShell();
		
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
	    comboQuery.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		textQuery.setText(textQuery.getText() + "\n" + comboQuery.getText());
	    	}	    	
	    });
	    
	    Label labelQueryTemplates = new Label(parent, SWT.NONE);
	    labelQueryTemplates.setText("Query templates");
	    data = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
	    labelQueryTemplates.setLayoutData(data);
	    
	    comboQT = new Combo (parent, SWT.READ_ONLY);
	    data = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
	    comboQT.setLayoutData(data);
	    comboQT.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		textQuery.setText(textQuery.getText() + "\n" + comboQT.getText());
	    	}	    	
	    });
	    populateQueryTemplates();
	    
	    
	    
		Label labelQuery = new Label(parent, SWT.NONE);
	    labelQuery.setText("Query");
	    data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
	    labelQuery.setLayoutData(data);
		
	    textQuery = new Text(parent, SWT.BORDER | SWT.MULTI);
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
					for (TableColumn tc : viewer.getTable().getColumns()) {
						tc.setText("");
					}
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
				if (textQuery.getText().length() > 0) {
					viewer.setInput(textQuery.getText());
				}
			}
		});
	    
	    
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		data = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		viewer.getControl().setLayoutData(data);
				
		Table table = viewer.getTable();
	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);
	   		
	    viewContentProvider = new ViewContentProvider();   
		viewer.setContentProvider(viewContentProvider);
		viewer.setLabelProvider(new ViewLabelProvider());
		
		//result count label
		labelCount = new Label(parent, SWT.NONE);
	    labelCount.setText("");
	    data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
	    labelCount.setLayoutData(data);
	    
		makeActions();
		//hookContextMenu();
		//hookDoubleClickAction();
		contributeToActionBars();
	}
	
	 private void populateQueryTemplates() {
		comboQT.add("module(_mid, _mname)");
		comboQT.add("subroutine(_sid, _pid, _sname)");
		comboQT.add("call_(_id, _pid, _cname)");
		comboQT.add("callArg(_id, _pid, _idx, _keyword, _arg_expr_id)");
		comboQT.add("ident(_id, _pid, _name)");
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
		//manager.add(action1);
		//manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		//manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		
		/*
		action1 = new Action() {
			public void run() {
				//TODO: for now
				//viewContentProvider.setProlog(CodeDBIndex.getInstance().getProlog());
				prolog = CodeDBIndex.getInstance().getProlog();
			}
		};
		action1.setText("Reload DB");
		action1.setToolTipText("Reload DB");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		*/
		
		action2 = new Action() {
			public void run() {
				//showMessage("Action 2 executed");
				ResourceSelectionDialog dialog =
						new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "Load theory");
				
				if (dialog.open() == Window.OK) {
					Object[] obj = dialog.getResult();
					if (obj != null) {
						for (int i = 0; i < obj.length; i++) {
							
							if (obj[i] instanceof IFile) {
								IFile file = (IFile) obj[i];
								
								try {
									
									Theory theory = new Theory(file.getContents());
									System.out.println(theory.toString());
									Prolog prolog = CodeDBIndex.getInstance().getProlog();
									if (prolog != null) {
										theory.append(prolog.getTheory());
										prolog.setTheory(theory);
										showMessage("Theory added: " + file.getFullPath());
									}
									else {
										showMessage("Database not loaded.");
										break;
									}
									
								
								} catch (IOException | CoreException e) {
									showMessage("Error opening file: " + e.getMessage());
								} catch (InvalidTheoryException e) {
									showMessage("Invalid theory");
								}
								
							}
							
						}
					}
				}
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