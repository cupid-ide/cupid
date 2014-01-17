package org.earthsystemcurator.cupid.nuopc.fsml.views;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CupidPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		System.out.println("CupidPerspectiveFactory.createInitialLayout");
		
		//layout.getDescriptor().
		String editorArea = layout.getEditorArea(); 

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.20f, editorArea); 
		left.addView(IPageLayout.ID_PROJECT_EXPLORER); 
		//topLeft.addPlaceholder(IPageLayout.ID_BOOKMARKS); 

		IFolderLayout bottomLeft = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, editorArea); 
		bottomLeft.addView("org.eclipse.ui.console.ConsoleView"); 
		//bottomLeft.addView(IPageLayout.ID_PROP_SHEET); 

		// Bottom right: Task List view 
		//layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.TOP | IPageLayout.LEFT, 0.33f, editorArea); 

		// Right
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.75f, editorArea);
		right.addView("org.eclipse.cdt.make.ui.views.MakeView");
	
	}

}
