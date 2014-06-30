package org.earthsystemmodeling.cupid.views;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;

import org.earthsystemcurator.FSM;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute;
import org.earthsystemmodeling.cupid.handlers.RewriteASTRunnable;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider.NUOPCModelElem;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IServiceLocator;

@SuppressWarnings("restriction")
public class NUOPCView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemmodeling.cupid.views.NUOPCView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	//private Action action1;
	//private Action action2;
	private Action doubleClickAction;
	
	private TreeColumn tc2;
	
	private NUOPCViewContentProvider contentProvider;
	private NUOPCViewLabelProvider labelProvider;
	
	private boolean projectIsDirty = false;

	
	/**
	 * The constructor.
	 */
	public NUOPCView() {
	
	}


	public void updateView(IProject project) {
		viewer.setInput(project);
		viewer.expandToLevel(2);
		setProjectIsDirty(false);
		labelProvider.setFSM(contentProvider.getCurrentFSM());
	}
	
	protected void setProjectIsDirty(boolean dirty) {
		projectIsDirty = dirty;
		if (projectIsDirty) {
			this.setPartName("*NUOPC View");
		}
		else {
			this.setPartName("NUOPC View");
		}
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
				
				text = "<html><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + text + "</body></html>";
				
				browser.setText(text);
				
				int height = 75;
				if (text.length() > 650) {
					height = 300;
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
					height = 300;
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
	
	
	private class AddElementAction extends Action {
		
		private FSM<?> fsm;
		private NUOPCModelElem me;
		private SubconceptOrAttribute soa;
		private boolean addAll;
		
		public AddElementAction(FSM<?> fsm, NUOPCModelElem me, SubconceptOrAttribute soa, boolean addAll) {
			this.fsm = fsm;
			this.me = me;
			this.soa = soa;
			this.addAll = addAll;
		}
		
		public void run() {
	
			EObject newElem = fsm.forwardAdd(me.elem, soa, true, addAll);
			IFortranAST ast = fsm.getASTForElement(newElem);
			
			//TODO: in the case of NUOPCApplication, there is no AST above
			Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);      								
			
			try {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				//running in UI thread for now so we can set focus to generated code
				PlatformUI.getWorkbench().getProgressService().run(false, false, new RewriteASTRunnable(ast, window));
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			                   					
			viewer.refresh(me);
			viewer.expandToLevel(me, 1);
				
		}      
	}
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		
		TreeColumn tc1 = new TreeColumn(viewer.getTree(), SWT.LEFT);
		tc1.setAlignment(SWT.LEFT);
		tc1.setText("NUOPC Definition");
		tc1.setWidth(100);
		tc1.setResizable(true);
		
		tc2 = new TreeColumn(viewer.getTree(), SWT.MULTI | SWT.RIGHT);
		tc2.setAlignment(SWT.LEFT);
		tc2.setText("Value");
		tc2.setWidth(100);
		tc2.setResizable(true);
		
		TreeColumnLayout tcl = new TreeColumnLayout();
		tcl.setColumnData(tc1, new ColumnWeightData(2));
		tcl.setColumnData(tc2, new ColumnWeightData(1));
		parent.setLayout(tcl);
		
		
		//TreeViewerColumn tvc1 = new TreeViewerColumn(viewer, SWT.LEFT);
		//TreeViewerColumn tvc2 = new TreeViewerColumn(viewer, SWT.RIGHT);
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);
		
		//tvc1.getColumn().setText("Name");
		//tvc2.getColumn().setText("Column2");
		
		
		drillDownAdapter = new DrillDownAdapter(viewer);
		
		contentProvider = new NUOPCViewContentProvider();
		viewer.setContentProvider(contentProvider);
		
		labelProvider = new NUOPCViewLabelProvider();
		viewer.setLabelProvider(labelProvider);
		viewer.setSorter(null);
		
		//ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		FancyToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		
		//viewer.setInput(getViewSite());
		
		/*
		ISelectionListener listener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart part, ISelection sel) {
				System.out.println("selectionChanged: " + part + " - " + sel);
				if (!(sel instanceof IStructuredSelection))
					return;
				IStructuredSelection ss = (IStructuredSelection) sel;
				Object o = ss.getFirstElement();
				if (o instanceof IProject)
					viewer.setInput(ss.size()==1 ? o : null);
			}
		};
		
		this.getSite().getPage().addSelectionListener(listener);
		*/
		
		doubleClickAction = new Action() {
			
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				//System.out.println("Double-click detected on " + obj.toString());
				
				NUOPCModelElem me = (NUOPCModelElem) obj;
				
				IMarker marker = null;
				
				if (me.elem != null) {
					//Object val = contentProvider.getReverseMappings().get(me.elem);
					Object val = contentProvider.getCurrentFSM().getMapsTo(me.elem);
					
					if (val != null) {
												
						if (val instanceof ScopingNode) {
							//PhotranTokenRef tokenRef = ((ScopingNode) val).getRepresentativeToken();
							marker = createMarker( ((ScopingNode) val).getRepresentativeToken().findTokenOrReturnNull());							
						}
						else if (val instanceof IFortranAST) {
							//try to find module statement
							IProgramUnit ipu = ((IFortranAST)val).getRoot().getProgramUnitList().get(0);
							if (ipu != null && ipu instanceof ASTModuleNode) {
								ASTModuleNode ams = (ASTModuleNode) ipu;
								marker = createMarker(ams.getNameToken());
							}							
						}
						else if (val instanceof ASTNode) {
							marker = createMarker(((ASTNode) val).findFirstToken());
						}
					}
					else {
						System.out.println("No mapping found for element: " + me.elem);
					}
				}
				//try to match on nameLabel using object identity 
				else if (me.nameLabel != null) {
					//Object val = contentProvider.getReverseMappings().get(me.nameLabel);
					Object val = null; //contentProvider.getCurrentFSM().getMappings().get(me.nameLabel);
					if (val != null && val instanceof Token) {
						marker = createMarker((Token) val);
					}
				}
					
				if (marker != null) {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					try {
						IDE.openEditor(page, marker, false);
						marker.delete();
					} catch (PartInitException e) {
						e.printStackTrace();
					} catch (CoreException e) {								
						e.printStackTrace();
					}
				}
					
					
				
			}
		};
				
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		
		//toolbar
		//Action reverseEngineerAction = new Action();
		
		//makeActions();
		
		IActionBars bars = getViewSite().getActionBars();
		//bars.getToolBarManager().add(action1);
		
		
		IServiceLocator workbench = PlatformUI.getWorkbench();
		IMenuService menuService = (IMenuService) workbench.getService(IMenuService.class);
		menuService.populateContributionManager((ContributionManager) bars.getToolBarManager(), "toolbar:org.earthsystemmodeling.cupid.views.NUOPCView.toolbar");
		bars.updateActionBars();
		
		MenuManager menuMgr = new MenuManager();

        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        menuMgr.addMenuListener(new IMenuListener() {
            
        	@Override
            public void menuAboutToShow(IMenuManager manager) {
                // IWorkbench wb = PlatformUI.getWorkbench();
                // IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
                if (viewer.getSelection().isEmpty()) {
                    return;
                }

                if (viewer.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
                    final NUOPCModelElem me = (NUOPCModelElem) selection.getFirstElement();

                    final FSM<?> fsm = contentProvider.getCurrentFSM();
                    ConceptDef conceptDef = null;
                    if (me.subconcept != null && !me.subconcept.isAttrib()) {
                    	conceptDef = fsm.getDefinition(me.subconcept);
                    }
                    else if (me.subconcept == null && me.elem != null) {
                    	conceptDef = fsm.getConceptDef(me.elem);
                    }
                    
                    if (conceptDef != null) {
                    	
                    	for (final SubconceptOrAttribute soa : conceptDef.getChild()) {
                    		
                    		if (!soa.isAttrib() && (fsm.isMany(soa) || (me.elem != null && fsm.getValue(me.elem, soa) == null)) ) {
                    			
                    			/*
                    			Action addElementAction = new Action() {
                    				
                    				public void run() {

                    					EObject newElem = fsm.forwardAdd(me.elem, soa, true);
                    					//showMessage("Added element: " + newElem);	
        								IFortranAST ast = fsm.getASTForElement(newElem);
        								
        								//TODO: in the case of NUOPCApplication, there is no AST above
        								Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);      								
                    					
        								try {
        									IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        									//running in UI thread for now so we can set focus to generated code
        									PlatformUI.getWorkbench().getProgressService().run(false, false, new RewriteASTRunnable(ast, window));
        								} catch (InvocationTargetException e) {
        									e.printStackTrace();
        								} catch (InterruptedException e) {
        									e.printStackTrace();
        								}
                    					                   					
                        				viewer.refresh(me);
                        				viewer.expandToLevel(me, 1);
                         				
                            		}      
                    				
                    			};
                    			*/
                    			
                    			String label = fsm.getAnnotationValue(fsm.getDefinition(soa), "label");
                    			if (label==null) {
                    				label = soa.getName();
                    			}
                    			
                    			AddElementAction addElementAction = new AddElementAction(fsm, me, soa, false);
                    			addElementAction.setText("Add " + label + " (basic)");
                    			addElementAction.setImageDescriptor(NUOPCViewLabelProvider.getFortranImageDescriptor(soa, null, null));
                    			//addElementAction.setToolTipText(fsm.getAnnotationValue(soa, "doc"));
                    			manager.add(addElementAction);
                    			
                    			AddElementAction addElementAction2 = new AddElementAction(fsm, me, soa, true);
                    			addElementAction2.setText("Add " + label + " (complete)");
                    			addElementAction2.setImageDescriptor(NUOPCViewLabelProvider.getFortranImageDescriptor(soa, null, null));
                    			//addElementAction2.setToolTipText(fsm.getAnnotationValue(fsm.getDefinition(soa), "doc"));
                    			manager.add(addElementAction2);
                    			
                    		}
                    	}
                    	
                    }
                    
                   
                }
            }
        });
        menuMgr.setRemoveAllWhenShown(true);
        viewer.getControl().setMenu(menu);
		
		
		
        //resource listener to know when current project is dirty
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IResourceChangeListener rcl = new IResourceChangeListener() {
        	public void resourceChanged(final IResourceChangeEvent event) {
        		if (viewer.getInput() != null && event.getDelta() != null) {
        			Display.getDefault().syncExec(new Runnable() {
        				public void run() {
        					try {
        						event.getDelta().accept(new IResourceDeltaVisitor() {
        							@Override
        							public boolean visit(IResourceDelta delta) throws CoreException {
        								if (delta.getResource() instanceof IProject) {
        									if (viewer.getInput().equals(delta.getResource())) {
        										//System.out.println("Dirty project: " + delta.getResource());
        										setProjectIsDirty(true);
        										return false;
        									}
        								}
        								return true;
        							}
        						});
        					} catch (CoreException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					}

        				}
        			});

        		}
        	}
        };

		workspace.addResourceChangeListener(rcl);
        
        
        
        
        
		// Create the help context id for the viewer's control
	//	PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.earthsystemmodeling.cupid.viewer");
		
	//	hookContextMenu();
	//	hookDoubleClickAction();
	//	contributeToActionBars();
	}
	
	protected IMarker createMarker(Token token) {
        try
        {
        	if (token == null) return null;
        	//Token token = photranTokenRef.findToken();
        	//Token firstToken = findFirstTokenIn(this);
        	//Token lastToken = findLastTokenIn(this);

        	//if (firstToken == null
        	//    || lastToken == null
             //   || firstToken.getPhysicalFile() == null
              //  || firstToken.getPhysicalFile().getIFile() == null)
        	  //  return null;

            int startOffset = token.getFileOffset();
            //startOffset -= token.getWhiteBefore().length();

            int endOffset = token.getFileOffset()+token.getLength();
            //endOffset += lastToken.getWhiteAfter().length();

            //IMarker marker = token.getPhysicalFile().getIFile().createMarker(IMarker.BOOKMARK);
            IMarker marker = token.getLogicalFile().createMarker(IMarker.BOOKMARK);
			
            marker.setAttribute(IMarker.CHAR_START, startOffset);
			marker.setAttribute(IMarker.CHAR_END, endOffset);
						
            return marker;
        }
        catch (CoreException e)
        {
            return null;
        }
    }
	

	/*
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				NUOPCView.this.fillContextMenu(manager);				
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}
	*/
	
	/*
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
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
		//manager.add(new Separator());
		//drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}
	*/
	
	/*
	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
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
	*/

	/*
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	*/
	
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"NUOPC View",
			message);
	}
	

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}