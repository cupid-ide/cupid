package org.earthsystemcurator.cupid.nuopc.fsml.views;

import java.lang.reflect.InvocationTargetException;

import org.earthsystemcurator.cupid.nuopc.fsml.handlers.RewriteASTRunnable;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCViewContentProvider.NUOPCModelElem;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TreeColumnLayout;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
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



/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

@SuppressWarnings("restriction")
public class NUOPCView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	
	private TreeColumn tc2;
	
	private NUOPCViewContentProvider contentProvider;
	
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
	}
	
	protected void setProjectIsDirty(boolean dirty) {
		projectIsDirty = dirty;
		if (dirty) {
			this.setPartName("*NUOPC View");
		}
		else {
			this.setPartName("NUOPC View");
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
		
		viewer.setLabelProvider(new NUOPCViewLabelProvider());
		viewer.setSorter(null);
		ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		
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
				//showMessage("Double-click detected on " + obj.toString());
				
				NUOPCModelElem me = (NUOPCModelElem) obj;
				
				IMarker marker = null;
				
				if (me.elem != null) {
					//Object val = contentProvider.getReverseMappings().get(me.elem);
					Object val = contentProvider.getCurrentFSM().getMappings().get(me.elem);
					
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
				}
				//try to match on nameLabel using object identity 
				else if (me.nameLabel != null) {
					//Object val = contentProvider.getReverseMappings().get(me.nameLabel);
					Object val = contentProvider.getCurrentFSM().getMappings().get(me.nameLabel);
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
		menuService.populateContributionManager((ContributionManager) bars.getToolBarManager(), "toolbar:org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCView.toolbar");
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

                    if (me.structuralFeature != null && me.structuralFeature instanceof EReference) {
                    	
                    	EClass parentClass = (EClass) me.structuralFeature.getEType();
                    	for (final EReference childRef : parentClass.getEReferences()) {
                    		if (childRef.isMany() || (me.elem != null && me.elem.eGet(childRef) == null) ) {
                    			
                    			Action addElementAction = new Action() {
                    				
                    				public void run() {
                        				
                    					/*
                        				EObject newElem = NUOPCFactory.eINSTANCE.create((EClass)childRef.getEType());                      					
                        				if (childRef.isMany()) {
                        					EList l = (EList) me.elem.eGet(childRef);
                        					l.add(newElem);
                        				}
                        				else {
                        					me.elem.eSet(childRef, newElem);                					
                        				}
                        				*/
                        				//showMessage("Added element: " + newElem);
                        				
                    					
                    					EObject newElem = contentProvider.getCurrentFSM().forwardAdd(me.elem, childRef, true);
        								IFortranAST ast = contentProvider.getCurrentFSM().getASTForElement(newElem);
        								
        								//TODO: in the case of NUOPCApplication, there is no AST above
        								Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
        								
        								try {
        									IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        									//running in UI thread for now so we can set focus to generated code
        									PlatformUI.getWorkbench().getProgressService().run(false, true, new RewriteASTRunnable(ast, window));
        								} catch (InvocationTargetException e) {
        									e.printStackTrace();
        								} catch (InterruptedException e) {
        									e.printStackTrace();
        								}
                    					
                        				viewer.refresh(me);
                        				viewer.expandToLevel(me, 1);
                        				
                        				
                            		}      
                    				
                    			};
                    			
                    			String label = Regex.getFromAnnotation(childRef.getEType(), "label", childRef.getEType().getName());
                    			addElementAction.setText("Generate " + label + "...");
                    			addElementAction.setImageDescriptor(NUOPCViewLabelProvider.getFortranImageDescriptor(childRef, null, null));
                    			//a.setToolTipText(Regex.getFromAnnotation(childRef.getEType(), "doc"));
                    			manager.add(addElementAction);
                    		}
                    	}
                    	
                    }
                    
                    /*
                    if (me.elem == null && me.structuralFeature instanceof EReference) {
                    	
                    	Action action = new Action() {
                    		public void run() {
                				
                				EObject newElem = NUOPCFactory.eINSTANCE.create((EClass)me.structuralFeature.getEType());
                					//need to create all essential subfeatures (at least)
                				if (me.structuralFeature.isMany()) {
                					EList l = (EList) me.parent.elem.eGet(me.structuralFeature);
                					l.add(newElem);
                				}
                				else {
                					me.parent.elem.eSet(me.structuralFeature, newElem);                					
                				}
                				
                				showMessage("Added element: " + newElem);
                				                				
                				viewer.refresh(me.parent);
                				
                    		}                    		
                		};
                		
                		action.setText("Instantiate framework concept...");
                		//action.setToolTipText("Generate code for: " + me.typeLabel);
                		
                    	manager.add(action);
                    } 
                    */
                }
            }
        });
        menuMgr.setRemoveAllWhenShown(true);
        viewer.getControl().setMenu(menu);
		
		
		
        //resource listener to know when current project is dirty
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceChangeListener rcl = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				if (viewer.getInput() != null) {
					try {
						event.getDelta().accept(new IResourceDeltaVisitor() {
	
							@Override
							public boolean visit(IResourceDelta delta)
									throws CoreException {
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
			}
		};

		workspace.addResourceChangeListener(rcl);
        
        
        
        
        
		// Create the help context id for the viewer's control
	//	PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.earthsystemcurator.cupid.nuopc.fsml.viewer");
		
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

            IMarker marker = token.getPhysicalFile().getIFile().createMarker(IMarker.BOOKMARK);
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
	
	/*
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"NUOPC View",
			message);
	}
	*/

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}