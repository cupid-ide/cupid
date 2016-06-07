package org.earthsystemmodeling.cupid.views;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.viewers.TreePath;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TaskContextNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TasksNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.DFTopNode;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

public class NUOPCDesignFragmentView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action doubleClickAction;
	
	private TreeColumn tc2;
	
	private NUOPCDesignFragmentContentProvider contentProvider;
	private NUOPCDesignFragmentLabelProvider labelProvider;
	
	public NUOPCDesignFragmentView() {
		
	}
	
	private static class FancyToolTipSupport extends ColumnViewerToolTipSupport {

		protected FancyToolTipSupport(ColumnViewer viewer, int style,
				boolean manualActivation) {
			super(viewer, style, manualActivation);
		}

		@Override
		protected Composite createToolTipContentArea(Event event, Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			GridLayout l = new GridLayout(1,false);
			
			l.horizontalSpacing=0;
			l.marginWidth=1;
			l.marginHeight=1;
			l.verticalSpacing=0;

			comp.setLayout(l);	
			
			String text = getText(event);
			
			try {
				Browser browser = new Browser(comp, SWT.NONE);
				
				//text = "<html><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + text + "</body></html>";
				
				text = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"" + NUOPCDocView.getStylesheetPath() + "\" /></head><body>" + text + "</body></html>";

				
				browser.setText(text);
				
				int height = 75;
				if (text.length() > 650) {
					height = 400;
				}
				else if (text.length() > 300) {
					height = 200;
				}
				else if (text.length() > 200) {
					height = 150;
				}
				browser.setLayoutData(new GridData(400, height));
			}
			catch (SWTError e) {
				//e.printStackTrace();
				//Browser failed to render because it is not installed on platform
				//Ubuntu users should do:   sudo apt-get install libwebkitgtk-1.0-0
				
				//basic HTML stripping for how
				text = text.replaceAll("\\<.*?\\>", "");
				Text label = new Text(comp, SWT.WRAP  | SWT.V_SCROLL);
				label.setEditable(false);
				label.setText(text);
				
				int height = 75;
				if (text.length() > 650) {
					height = 400;
				}
				else if (text.length() > 300) {
					height = 200;
				}
				else if (text.length() > 200) {
					height = 150;
				}
				
				label.setLayoutData(new GridData(400, height));
				
			}
					

			return comp;
		}

		@Override
		public boolean isHideOnMouseDown() {
			return false;
		}
		
		

		public static final void enableFor(ColumnViewer viewer, int style) {
			new FancyToolTipSupport(viewer,style,false);
		}
	}
	
	
	public void createPartControl(Composite parent) {
		
		viewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
				
		TreeColumn tc1 = new TreeColumn(viewer.getTree(), SWT.LEFT);
		tc1.setAlignment(SWT.LEFT);
		tc1.setText("NUOPC Goal Catalog");
		//tc1.setWidth(100);
		tc1.setResizable(true);
		
		//tc2 = new TreeColumn(viewer.getTree(), SWT.MULTI | SWT.RIGHT);
		//tc2.setAlignment(SWT.LEFT);
		//tc2.setText("");
		//tc2.setWidth(100);
		//tc2.setResizable(true);
		
		TreeColumnLayout tcl = new TreeColumnLayout();
		tcl.setColumnData(tc1, new ColumnWeightData(4));
		//tcl.setColumnData(tc2, new ColumnWeightData(1));
		parent.setLayout(tcl);
				
		Tree tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		drillDownAdapter = new DrillDownAdapter(viewer);		
		contentProvider = new NUOPCDesignFragmentContentProvider();
		viewer.setContentProvider(contentProvider);
		
		labelProvider = new NUOPCDesignFragmentLabelProvider();
		viewer.setLabelProvider(labelProvider);
		viewer.setSorter(null);
		viewer.setInput("blank");
	
		//FancyToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@SuppressWarnings("restriction")
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				CodeConcept<?,?> codeConcept = null;
				
				if (obj instanceof BindingNode) {
					BindingNode bn = (BindingNode) obj;
					codeConcept = bn.df.getBinding(bn.name);
				}
				else if (obj instanceof TaskContextNode) {
					TaskContextNode tcn = (TaskContextNode) obj;
					codeConcept = tcn.task.boundTo();
				}
				
				if (codeConcept != null) {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IMarker marker = createMarker((ASTNode) codeConcept.getASTRef());
					try {
						if (marker == null) {
							IDE.openEditor(page, (IFile) codeConcept.getContext());
						}
						else {
							IDE.openEditor(page, marker);
							marker.delete();
						}
					} catch (CoreException e) {
						CupidActivator.log("Error opening editor on NUOPC code", e);
					}
				}
				
			}
		});
		
		
		class BindingAction extends Action {
			
			private CodeConcept<?,?> concept;
			private BindingNode bindingNode;
			
			public BindingAction(BindingNode bindingNode, CodeConcept<?,?> concept) {
				this.bindingNode = bindingNode;
				this.concept = concept;
			}
			
			@Override
			public String getText() {
				return "Bind to " + concept.name() + " (" + concept.getContext().getFullPath().toString() + ")";
			}
			
			@Override
			public void run() {
				bindingNode.df.setBinding(bindingNode.name, concept);
				viewer.update(bindingNode, null);
				TasksNode tn = ((DFTopNode) bindingNode.parent.parent).tasksNode;
				Object[] expandedElements = viewer.getExpandedElements();
				TreePath[] paths = viewer.getExpandedTreePaths();
				viewer.refresh(tn);
				viewer.setExpandedElements(expandedElements);
				viewer.setExpandedTreePaths(paths);
			}
			
		}
		
		MenuManager menuMgr = new MenuManager();

        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        menuMgr.addMenuListener(new IMenuListener() {
            
        	@Override
        	public void menuAboutToShow(IMenuManager manager) {
        		if (viewer.getSelection().isEmpty()) {
                    return;
                }

                if (viewer.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
                    if (selection.getFirstElement() instanceof BindingNode) {
                    	
                    	final BindingNode bn = (BindingNode) selection.getFirstElement();
                    	NUOPCFrameworkManager nm = NUOPCFrameworkManager.getInstance();
                    	List<CodeConcept> concepts = nm.listAllComponents(bn.df.getBindingType(bn.name));
                    	
                    	Collections.sort(concepts, new Comparator<CodeConcept>() {
							@Override
							public int compare(CodeConcept o1, CodeConcept o2) {
								return o1.name().compareTo(o2.name());
							}
                    	});
                    	
                    	if (bn.df.getBinding(bn.name) != null) {
                    		manager.add(new Action() {
                    			@Override
                        		public String getText() {
                        			return "Unbind";
                        		}
                        		@Override
                        		public void run() {
                        			bn.df.removeBinding(bn.name);
                        			viewer.update(bn, null);
                        			TasksNode tn = ((DFTopNode) bn.parent.parent).tasksNode;
                    				Object[] expandedElements = viewer.getExpandedElements();
                    				TreePath[] paths = viewer.getExpandedTreePaths();
                    				viewer.refresh(tn);
                    				viewer.setExpandedElements(expandedElements);
                    				viewer.setExpandedTreePaths(paths);
                        		};
                    		});
                    	}
                    	
                    	for (CodeConcept<?, ?> cc: concepts) {
                    		manager.add(new BindingAction(bn, cc));
                    	}
                    	
                    	manager.add(new Action() {
                    		@Override
                    		public String getText() {
                    			return "Generate new " + bn.df.getBindingType(bn.name).getSimpleName();
                    		}
                    		@Override
                    		public void run() {
                    			
                    		};
                    	});
                    }
                }
        	}
        });
        	
        	
        menuMgr.setRemoveAllWhenShown(true);
        viewer.getControl().setMenu(menu);
                
	}
	
		
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	
	@SuppressWarnings("restriction")
	protected IMarker createMarker(ASTNode astNode) {
		
		Token t;
		if (astNode == null) {
			return null;
		}
		if (astNode instanceof ASTSubroutineSubprogramNode) {
			ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) astNode;
			t = ssn.getSubroutineStmt().getSubroutineName().getSubroutineName();				
		}
		else if (astNode instanceof ASTUseStmtNode) {
			t = ((ASTUseStmtNode) astNode).getName();
		}
		else if (astNode instanceof ScopingNode) {
			t = ((ScopingNode) astNode).getRepresentativeToken().findTokenOrReturnNull();							
		}
		else {
			t = astNode.findFirstToken();
		}
		
		if (t == null) return null;
		
		try {
            int startOffset = t.getFileOffset();
            int endOffset = t.getFileOffset()+t.getLength();
            
            IMarker marker = t.getLogicalFile().createMarker(IMarker.BOOKMARK);
			marker.setAttribute(IMarker.CHAR_START, startOffset);
			marker.setAttribute(IMarker.CHAR_END, endOffset);
						
            return marker;
        }
        catch (CoreException e) {
            CupidActivator.log("Error creating marker", e);
        	return null;
        }
    }
	
	
	
}