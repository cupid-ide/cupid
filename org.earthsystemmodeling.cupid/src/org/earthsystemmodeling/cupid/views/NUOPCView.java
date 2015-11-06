package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;

import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.handlers.RewriteASTRunnable;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider2.CodeConceptProxy;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

@SuppressWarnings("restriction")
public class NUOPCView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemmodeling.cupid.views.NUOPCView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action doubleClickAction;
	
	private TreeColumn tc2;
	
	private NUOPCViewContentProvider2 contentProvider;
	private NUOPCViewLabelProvider2 labelProvider;
	
	//private boolean projectIsDirty = false;

	private IPartListener2 partListener;
	private IResourceChangeListener resourceChangeListener;
	
	private static String stylePath;
	
	static {
		//TODO:  this is duplicated in NUOPCDocView.java
		URL styleURL = CupidActivator.getFileURL("nuopcdocs/styles.css");
		if (styleURL != null) {
			stylePath = styleURL.getPath();
		}
		else {
			stylePath = "";
		}
	}
	
	/**
	 * The constructor.
	 */
	public NUOPCView() {
		
	}
	
	
	/*
	public void updateView(IProject project) {
		viewer.setInput(project);
		viewer.expandToLevel(2);
		//setProjectIsDirty(false);
		labelProvider.setFSM(contentProvider.getCurrentFSM());
	}
	*/
	
	/*
	protected void setProjectIsDirty(boolean dirty) {
		projectIsDirty = dirty;
		if (projectIsDirty) {
			this.setPartName("*NUOPC View");
		}
		else {
			this.setPartName("NUOPC View");
		}
	}
	*/
	
	
	
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
	
	/*
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
				PlatformUI.getWorkbench().getProgressService().run(false, false, new RewriteASTRunnable(ast));
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			                   					
			viewer.refresh(me);
			viewer.expandToLevel(me, 1);
				
		}      
	}
	*/
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		/*
		GridLayout gridLayout = new GridLayout(1,true);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.verticalSpacing = 4;
		parent.setLayout(gridLayout);
		
		//SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		Composite composite = new Composite(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		//GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		//gd.heightHint = (int) (parent.getBounds().height * .50);
		//gd.heightHint = 100;
		composite.setLayoutData(gd);
		*/
		
		viewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		
		TreeColumn tc1 = new TreeColumn(viewer.getTree(), SWT.LEFT);
		tc1.setAlignment(SWT.LEFT);
		tc1.setText("NUOPC Definition");
		//tc1.setWidth(100);
		tc1.setResizable(true);
		
		tc2 = new TreeColumn(viewer.getTree(), SWT.MULTI | SWT.RIGHT);
		tc2.setAlignment(SWT.LEFT);
		tc2.setText("Value");
		//tc2.setWidth(100);
		tc2.setResizable(true);
		
		TreeColumnLayout tcl = new TreeColumnLayout();
		tcl.setColumnData(tc1, new ColumnWeightData(2));
		tcl.setColumnData(tc2, new ColumnWeightData(1));
		parent.setLayout(tcl);
				
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);
		
		drillDownAdapter = new DrillDownAdapter(viewer);		
		contentProvider = new NUOPCViewContentProvider2();
		viewer.setContentProvider(contentProvider);
		
		labelProvider = new NUOPCViewLabelProvider2(contentProvider);
		viewer.setLabelProvider(labelProvider);
		viewer.setSorter(null);
		viewer.setAutoExpandLevel(4);
	
		FancyToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		
		
		/* documentation viewer */
		/*
		try {
			Browser browser = new Browser(parent, SWT.V_SCROLL);
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.heightHint = 200;
			//gd = new GridData(SWT.FILL, SWT.FILL, true, false);
			browser.setLayoutData(gd);
			String docText = "<html><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + "Here is some documentaiton" + "</body></html>";
			browser.setText(docText);
		}
		catch (SWTError se) {
			CupidActivator.log("Error rendering documentation in NUOPC view", se);
		}
		*/
		
		doubleClickAction = new Action() {
			
			public void run() {
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				IMarker marker = null;
				
				if (obj instanceof CodeConceptProxy) {
					CodeConceptProxy ccp = (CodeConceptProxy) obj;
					@SuppressWarnings("unchecked")
					CodeConcept<?,IASTNode> cc = (CodeConcept<?,IASTNode>) ccp.codeConcept;
					
					if (cc==null) {
						return;
					}
					
					IASTNode astNode = cc.getASTRef();
					
					if (astNode == null) {
						return;
					}
					if (astNode instanceof ASTSubroutineSubprogramNode) {
						ASTSubroutineSubprogramNode ssn = (ASTSubroutineSubprogramNode) astNode;
						Token t = null;
						try {
							t = ssn.getSubroutineStmt().getSubroutineName().getSubroutineName();
							marker = createMarker(t);
						}
						catch (NullPointerException npe) {
							//handled below
						}					
					}
					else if (astNode instanceof ASTUseStmtNode) {
						marker = createMarker(((ASTUseStmtNode) astNode).getName());
					}
					else if (astNode instanceof ScopingNode) {
						marker = createMarker( ((ScopingNode) astNode).getRepresentativeToken().findTokenOrReturnNull());							
					}
					//else if (astNode instanceof IFortranAST) {
					//	//try to find module statement
					//	IProgramUnit ipu = ((IFortranAST)val).getRoot().getProgramUnitList().get(0);
					//	if (ipu != null && ipu instanceof ASTModuleNode) {
					//		ASTModuleNode ams = (ASTModuleNode) ipu;
					//		marker = createMarker(ams.getNameToken());
					//	}							
					//}
					else {
						marker = createMarker(astNode.findFirstToken());
					}
				}
					
				if (marker != null) {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					try {
						IDE.openEditor(page, marker, false);
					} catch (PartInitException e) {
						CupidActivator.log("Error opening editor on NUOPC code", e);
					}
					
					try {
						marker.delete();
					}
					catch (CoreException e) {
						CupidActivator.log("Error deleting temporary marker", e);
					}
				}
				
			}
		};
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				NUOPCDocView ndv = (NUOPCDocView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(NUOPCDocView.ID);
				if (ndv != null) {
					ISelection selection = viewer.getSelection();
					Object obj = ((IStructuredSelection)selection).getFirstElement();
					if (obj != null) {
						CodeConceptProxy ccp = (CodeConceptProxy) obj;
						String doc = labelProvider.getNUOPCDoc(ccp);
						if (doc != null) {
							if (doc.startsWith("http") || doc.startsWith("file:"	)) {
								ndv.setURL(doc);
							}
							else {
								ndv.setDoc(doc);
							}
						}
						//else {
			   		   	//	ndv.setURL("www.google.com");
						//}
					}
				}
			}
			
		});
		
		
		/*
		IActionBars bars = getViewSite().getActionBars();
		
		//Since the Luna update, the populated contributions (from plugin.xml) are not showing
		//so I am adding an explicit action below
		
		//IServiceLocator workbench = PlatformUI.getWorkbench();
		//IMenuService menuService = (IMenuService) getViewSite().getService(IMenuService.class); //(IMenuService) workbench.getService(IMenuService.class);
		ToolBarManager toolbarManager = (ToolBarManager) bars.getToolBarManager();
		toolbarManager.removeAll();
		
		//menuService.populateContributionManager((ContributionManager) bars.getToolBarManager(), "toolbar:org.earthsystemmodeling.cupid.views.NUOPCView.toolbar");
		//menuService.populateContributionManager(toolbarManager, "toolbar:org.earthsystemmodeling.cupid.views.NUOPCView.toolbar");
				
		toolbarManager.add(new Action() {
			
			
			@Override
			public void run() {
				ReverseHandler rh = new ReverseHandler();
				try {
					rh.execute(null);
				} catch (ExecutionException e) {
					CupidActivator.log(Status.ERROR, "Error executing reverse engineer command", e);
				}
			}
			
			@Override
			public String getId() {
				return "org.earthsystemmodeling.cupid.reverseEngineer.toolbar";
			}
			@Override
			public String getText() {
				return "Reverse engineer";
			}
			
			@Override
			public ImageDescriptor getImageDescriptor() {
				return CupidActivator.getImageDescriptor("icons/arrow_rev.png");
			}
			
		});
		
		//for (IContributionItem i : toolbarManager.getItems()) {
		//	System.out.println("item: " + i.getId() + " - " + i.isVisible() + " - " + i.isEnabled());
		//}
		
		toolbarManager.update(true);
		bars.updateActionBars();
		*/	
						
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
                    final CodeConceptProxy ccp = (CodeConceptProxy) selection.getFirstElement();
                   
                    if (ccp.codeConcept==null) {
                    	return;  //assume we must first have parent to generate code
                    }
                    
                	final Class<?> parentClass = ccp.clazz;
    				
            		for (final Field field : parentClass.getFields()) {
            			
            			final Child childAnn = field.getAnnotation(Child.class);
            			final Label labelAnn = NUOPCViewContentProvider2.getLabelFromField(field);
            			final Class<?> fieldClass = NUOPCViewContentProvider2.getTypeFromField(field);
            			
            			boolean childPresent = true;
            			try {
							childPresent = (field.get(ccp.codeConcept) != null);
						} catch (IllegalArgumentException | IllegalAccessException e1) {
							//ignore
						}
            			
            			if (childAnn != null && childAnn.forward() && !(childAnn.max()==1 && childPresent)) {
            				
            				IAction actionToAdd = new Action() {
            					
            					@Override
            					public String getText() {
            						if (labelAnn != null) {
            							return "Generate " + labelAnn.label();
            						}
            						else {
            							return "Generate " + field.getName();
            						}
            					}
            					
            					public void run() {
            						
            						//dissallow if editor is dirty
            						if (contentProvider.editorIsDirty()) {
            							MessageDialog.openError(
            									viewer.getControl().getShell(),
            									"Cannot generate",
            									"Please save file before generating code");
            							return;
            						}
            						
            						CodeConcept<?,?> newcc = null;
            						
            						try {        							
            							Constructor<?>[] cons = fieldClass.getConstructors();
            							for (Constructor<?> con : cons) {
            								if (con.getParameterCount() == 1) {
            									newcc = (CodeConcept<?, ?>) con.newInstance(ccp.codeConcept); 
            									break;
            								}
            							}
            							if (newcc == null) {
            								throw new InstantiationException("Could not find constructor for code concept");
            							}
            						} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            							CupidActivator.log("Exception executing constructor", e);
            							return;
            						}
            						
            						//TextFileChange tfc = newcc.forward();
            						IFortranAST ast = null;
									try {
										ast = newcc.forward();
									} catch (CodeGenerationException cge) {
										MessageDialog.openError(
            									viewer.getControl().getShell(),
            									"Code generation failed",
            									cge.getMessage());
            							return;
									}
            						
            						if (ast != null) {
            							
            							Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);      								
            							
            							try {
            								     
            								RewriteASTRunnable rewriter = new RewriteASTRunnable(ast);
            								PlatformUI.getWorkbench().getProgressService().run(true, false, rewriter);
            								
            								IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            								//open editor on last marker generated
            						        
            								if (rewriter.getMarkers().size() > 0 &&
            										window != null) {
            								
            									IWorkbenchPage page = window.getActivePage();
	            								try {
	            									IDE.openEditor(page, rewriter.getMarkers().get(0), true);
	            									//marker.delete();
	            								} catch (PartInitException e) {
	            									e.printStackTrace();						
	            								}
	            								
            								}
	            						        
            							} catch (InvocationTargetException | InterruptedException e) {
            								CupidActivator.log("Exception executing code generation", e);
            							}
            							                   					
            							viewer.refresh(ccp);
            							viewer.expandToLevel(ccp, 1);
        							
            							
            						}
            						
            						
            					};
            					
            				};
            				
            				manager.add(actionToAdd);
            				
            			}
            		}
                    
                }
        	}
        });
        	
        	
        menuMgr.setRemoveAllWhenShown(true);
        viewer.getControl().setMenu(menu);
		
	    //listen for editor activation
        IPartService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService();
        partListener = new IPartListener2() {

        	private IEditorPart previousEditor = null;
        	
        	private IPropertyListener saveListener = new IPropertyListener() {
				@Override
				public void propertyChanged(Object source, int propId) {
					if (propId == IWorkbenchPartConstants.PROP_DIRTY &&
							!((FortranEditor)source).isDirty()) {
						viewer.setInput(source);
					}
				}	
			};
        	
			@Override
			public void partActivated(IWorkbenchPartReference partRef) {
				if (partRef instanceof IEditorReference) {
					IEditorReference eref = (IEditorReference) partRef;
					IEditorPart editor = eref.getEditor(true);
					if (editor != null && editor instanceof FortranEditor) {
						//FortranEditor feditor = (FortranEditor) editor;
						
						if (previousEditor != null && previousEditor != editor) {
							previousEditor.removePropertyListener(saveListener);
							previousEditor = editor;
						}
						
						editor.addPropertyListener(saveListener);
						
						if (viewer.getInput() != editor) {							
							viewer.setInput(editor);
						}
					}
					
					/*
					IEditorInput ein;
					try {
						ein = eref.getEditorInput();
						
					} catch (PartInitException e) {
						CupidActivator.log("Error listening to activated editor.", e);
						return;
					}
					if (ein instanceof FileEditorInput) {
						FileEditorInput fein = (FileEditorInput) ein;
						IFile file = fein.getFile();
						//if (viewer.getInput() != file) {
							viewer.setInput(file);
						//}
						viewer.expandToLevel(3);
					}
					*/
				}
			}

			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {
				/*
				if (partRef instanceof IEditorReference) {
					IEditorReference eref = (IEditorReference) partRef;
					IEditorPart editor = eref.getEditor(true);
					if (editor != null && editor instanceof FortranEditor) {
						editor.removePropertyListener(saveListener);
					}
				}
				*/
			}

			@Override
			public void partOpened(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partHidden(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partInputChanged(IWorkbenchPartReference partRef) {
			}
        	
        };
        
        service.addPartListener(partListener);
        
        
        //listen for resource changes to synchronize
        /*
        resourceChangeListener = new IResourceChangeListener() {
        	public void resourceChanged(final IResourceChangeEvent event) {
        		
         		if (viewer.getInput() != null && event.getDelta() != null) {
        			Display.getDefault().syncExec(new Runnable() {
        				public void run() {
        					try {
        						event.getDelta().accept(new IResourceDeltaVisitor() {
        							@Override
        							public boolean visit(IResourceDelta delta) throws CoreException {
        								//System.out.println("delta resource = " + delta.getResource());
        								if ((delta.getFlags() & IResourceDelta.CONTENT) == IResourceDelta.CONTENT) {
	        								if (viewer.getInput().equals(delta.getResource())) {
	    										//System.out.println("Refreshing viewer");
	    										viewer.setInput(delta.getResource());
	        									//viewer.refresh();
	    										viewer.expandToLevel(3);
	    										return false;
	        								}
        								}
        								return true;
        							}
        						});
        					} catch (CoreException e) {        		
        						CupidActivator.log("Error visting resource change delta", e);
        					}

        				}
        			});
					
        		} 
        	}
        };

        ResourcesPlugin.getWorkspace().addResourceChangeListener(
        		resourceChangeListener, 
        		IResourceChangeEvent.POST_CHANGE);     
        */   
        
	}
	
	protected IMarker createMarker(Token token) {
		if (token == null) return null;
		try {
            int startOffset = token.getFileOffset();
            int endOffset = token.getFileOffset()+token.getLength();
            
            IMarker marker = token.getLogicalFile().createMarker(IMarker.BOOKMARK);
			marker.setAttribute(IMarker.CHAR_START, startOffset);
			marker.setAttribute(IMarker.CHAR_END, endOffset);
						
            return marker;
        }
        catch (CoreException e) {
            CupidActivator.log("Error creating marker", e);
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
	
	
	@Override
	public void dispose() {
		super.dispose();
		if (partListener != null) {
			IPartService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService();
			service.removePartListener(partListener);
		}
		if (resourceChangeListener != null) {
			 ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		}
	}
	
}