package org.earthsystemmodeling.cupid.views;

import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingNode;
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
		
		tc2 = new TreeColumn(viewer.getTree(), SWT.MULTI | SWT.RIGHT);
		tc2.setAlignment(SWT.LEFT);
		tc2.setText("");
		//tc2.setWidth(100);
		tc2.setResizable(true);
		
		TreeColumnLayout tcl = new TreeColumnLayout();
		tcl.setColumnData(tc1, new ColumnWeightData(4));
		tcl.setColumnData(tc2, new ColumnWeightData(1));
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
		
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
			}
		};
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		
			
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
                    	manager.add(new Action() {
                    		@Override
                    		public String getText() {
                    			return "Bind to ...";
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
	
	
	
	
}