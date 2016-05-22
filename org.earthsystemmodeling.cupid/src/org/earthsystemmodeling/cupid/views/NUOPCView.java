package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager.INUOPCDatabaseListener;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider.CodeConceptProxy;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
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
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

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
	
	private NUOPCViewAsyncWorkspaceContentProvider contentProvider;
	private NUOPCViewLabelProvider labelProvider;
	
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
	
	public NUOPCView() {
		
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
				
		Tree tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		/*
		tree.addListener(SWT.MeasureItem, new Listener() {
		   public void handleEvent(Event event) {
			   TreeItem item = (TreeItem) event.item;
			   String text = item.getText(event.index);
		       Point size = event.gc.textExtent(text);
		       event.width = size.x;
		       event.height = size.y;
		   }
		});
		*/
		
		
		/*
		tree.addListener(SWT.PaintItem, new Listener() {
		   public void handleEvent(Event event) {
			  TreeItem item = (TreeItem) event.item;
			  String text = item.getText(event.index);
	          Point size = event.gc.textExtent(text);
	          int offset2 = event.index == 0 ? Math.max(0, (event.height - size.y) / 2) : 0;
	          event.gc.drawText(text, event.x, event.y + offset2, true);
		   }
		});
		*/
		
		drillDownAdapter = new DrillDownAdapter(viewer);		
		//contentProvider = new NUOPCViewAsyncContentProvider(Display.getCurrent(), viewer);
		contentProvider = new NUOPCViewAsyncWorkspaceContentProvider(Display.getCurrent(), viewer);
		//contentProvider = new NUOPCViewContentProvider();
		viewer.setContentProvider(contentProvider);
		
		labelProvider = new NUOPCViewLabelProvider();
		viewer.setLabelProvider(labelProvider);
		viewer.setSorter(null);
		
		FancyToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
		
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		viewer.setInput(workspace);
		
		NUOPCFrameworkManager.getInstance().addDBListener(new INUOPCDatabaseListener() {
			@Override
			public void updated() {
				 UIJob refreshJob = new UIJob("Refresh NUOPC view") {
         			@Override
         			public IStatus runInUIThread(IProgressMonitor monitor) {
         				contentProvider.recompute();
         		        return Status.OK_STATUS;
         			}    	
                 };
                 refreshJob.schedule();
			}
		});
		
		
		
		
		/*
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		viewer.setInput(workspace);
		resourceChangeListener = new IResourceChangeListener() {
		      public void resourceChanged(IResourceChangeEvent event) {
		    	  if (event.getDelta() == null) {
		    		  return;
		    	  }
		    	  IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
		              public boolean visit(final IResourceDelta delta) {
		                 //only interested in content changes
		                 if ((delta.getFlags() & IResourceDelta.CONTENT) == 0) {
		                    return true;
		                 }
		                 else if (delta.getResource() instanceof IFile){
		                	 contentProvider.clear();
		                	 UIJob refreshJob = new UIJob("Refresh NUOPC view") {
		             			@Override
		             			public IStatus runInUIThread(IProgressMonitor monitor) {
		             				
		             				Object[] expandedElements = viewer.getExpandedElements();
		             				TreePath[] expandedTreePaths = viewer.getExpandedTreePaths();
		             				viewer.setInput(workspace);
		             				viewer.setExpandedElements(expandedElements);
		             				viewer.setExpandedTreePaths(expandedTreePaths);		             				
		             				
		             				//viewer.refresh();
		             		        return Status.OK_STATUS;
		             			}    	
		                     };
		                     refreshJob.schedule();
		                     return false;
		                 }
		                 return true;
		              }
		           };
		           try {
		              event.getDelta().accept(visitor);
		           } catch (CoreException e) {
		              CupidActivator.debug("", e);
		           }
		      }
		   };
		workspace.addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
		*/
		
		
		
		doubleClickAction = new Action() {
			
			public void run() {
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				IMarker marker = null;
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			
				if (obj instanceof IFile) {
					try {
						IDE.openEditor(page, (IFile) obj);
					} catch (PartInitException e) {
						CupidActivator.log("Error opening editor on NUOPC code", e);
					}
				}
				else if (obj instanceof CodeConceptProxy) {
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
					else {
						marker = createMarker(astNode.findFirstToken());
					}
				}
					
				if (marker != null) {
					//IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
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
		
		/*
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				NUOPCDocView ndv = (NUOPCDocView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(NUOPCDocView.ID);
				if (ndv != null) {
					ISelection selection = viewer.getSelection();
					Object obj = ((IStructuredSelection)selection).getFirstElement();
					if (obj != null && obj instanceof CodeConceptProxy) {
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
		*/
		
		
		IActionBars bars = getViewSite().getActionBars();
		ToolBarManager toolbarManager = (ToolBarManager) bars.getToolBarManager();
		toolbarManager.removeAll();			

		toolbarManager.add(new Action() {

			@Override
			public void run() {
				//starts a job
				NUOPCFrameworkManager.getInstance().ensureDBIsUpToDate();
			}
			
			@Override
			public String getId() {
				return "org.earthsystemmodeling.cupid.refreshnuopcview";
			}
			
			@Override
			public String getText() {
				return "Refresh";
			}
			
			@Override
			public ImageDescriptor getImageDescriptor() {
				return CupidActivator.getImageDescriptor("icons/arrow_rev.png");
			}
			
		});
		
		toolbarManager.update(true);
		bars.updateActionBars();
							
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
            			final Label labelAnn = NUOPCViewContentProvider.getLabelFromField(field);
            			final Class<?> fieldClass = NUOPCViewContentProvider.getTypeFromField(field);
            			
            			boolean childPresent = true;
            			try {
							childPresent = (field.get(ccp.codeConcept) != null);
						} catch (IllegalArgumentException | IllegalAccessException e1) {
							//ignore
						}
            			
            			if (childAnn != null /*&& childAnn.forward()*/ && !(childAnn.max()==1 && childPresent)) {
            				
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
            								if (con.getParameterTypes().length == 1) {
            									newcc = (CodeConcept<?, ?>) con.newInstance(ccp.codeConcept); 
            									break;
            								}
            							}
            							if (newcc == null) {
            								throw new CodeGenerationException("Could not find constructor for code concept");
            							}
            						} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | CodeGenerationException e) {
            							CupidActivator.log("Exception executing constructor", e);
            							return;
            						}
            						
            						
            						try {
										newcc = newcc.forward();
									} catch (CodeGenerationException cge) {
										MessageDialog.openError(
            									viewer.getControl().getShell(),
            									"Code generation failed",
            									cge.getMessage());
            							return;
									}
            						
            						final CodeConcept<?,?> cc = newcc;
            						
            						IRunnableWithProgress applyRunnable = new IRunnableWithProgress() {

										@Override
										public void run(IProgressMonitor monitor)
												throws InvocationTargetException, InterruptedException {
											cc.applyChanges(monitor);
										}
            							
            						};
   
            						//ApplyCodeConceptChanges applyRunnable = new ApplyCodeConceptChanges(newcc);
    								
            						//final IWorkspace workspace = ResourcesPlugin.getWorkspace();
            						//workspace.removeResourceChangeListener(resourceChangeListener);
    								try {
										PlatformUI.getWorkbench().getProgressService().run(false, false, applyRunnable);
									} catch (InvocationTargetException | InterruptedException e) {
										CupidActivator.log("Exception executing code generation", e);
									}
  
    								//contentProvider.clear();
    								//viewer.refresh(ccp);
        							//viewer.expandToLevel(ccp, 1);
        							//workspace.addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
             						
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
						contentProvider.clear();
						if (viewer.getControl() != null && !viewer.getControl().isDisposed()) {
							viewer.setInput(source);
						}
					}
				}	
			};
        	
			@Override
			public void partActivated(IWorkbenchPartReference partRef) {
				//CupidActivator.debug("partActivated");
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
				}
			}

			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
				//CupidActivator.debug("partClosed");
				if (partRef instanceof IEditorReference) {
					IEditorReference eref = (IEditorReference) partRef;
					IEditorPart editor = eref.getEditor(true);
					if (editor != null && editor instanceof FortranEditor) {
						editor.removePropertyListener(saveListener);
						viewer.setInput(null);
						
						//see if another editor is now visible
						try {
				        	IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				        	if (editorPart != null && editorPart instanceof FortranEditor) {
				        		if (viewer.getInput() != editorPart) {							
									viewer.setInput(editorPart);
								}
				        	}
				        } catch (NullPointerException npe) {
				        	CupidActivator.debug("Null editor", npe);
				        }
					}
				}
			}

			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {
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
        
        /*
        service.addPartListener(partListener);
                
        UIJob initJob = new UIJob("Initialize NUOPC view") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
			    //since we just opened, find active editor and populate
		        try {
		        	IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		        	if (editorPart != null && editorPart instanceof FortranEditor) {
		        		FortranEditor editor = (FortranEditor) editorPart;
						viewer.setInput(editor);
		        	}
		        } catch (NullPointerException npe) {
		        	CupidActivator.debug("Null editor", npe);
		        }
		        return Status.OK_STATUS;
			}    	
        };
        initJob.schedule(500);
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
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.removeResourceChangeListener(resourceChangeListener);
		}
	}
	
}