package org.earthsystemcurator.cupid.nuopc.fsml.views;

import org.earthsystemcurator.cupid.nuopc.fsml.core.CupidActivator;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CupidPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		CupidActivator.log("CupidPerspectiveFactory.createInitialLayout()");
		
		//layout.getDescriptor().
		String editorArea = layout.getEditorArea();
		
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.20f, editorArea); 
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		//left.addPlaceholder(IPageLayout.ID_BOOKMARKS); 

		IFolderLayout bottomLeft = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, editorArea); 
		bottomLeft.addView("org.eclipse.ui.console.ConsoleView"); 
		//bottomLeft.addView(IPageLayout.ID_PROP_SHEET); 

		// Bottom right: Task List view 
		//layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.TOP | IPageLayout.LEFT, 0.33f, editorArea); 

		// Right
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.75f, editorArea);
		right.addView("org.eclipse.cdt.make.ui.views.MakeView");
		//right.addPlaceholder("org.eclipse.ui.cheatsheets.views.CheatSheetView");
		
		//CupidActivator.log("CupidPerspectiveFactory addView org.eclipse.ui.cheatsheets.views.CheatSheetView");
		//right.addView("org.eclipse.ui.cheatsheets.views.CheatSheetView");
		
		//left.addView("org.eclipse.ui.cheatsheets.views.CheatSheetView");
		//bottomLeft.addView("org.eclipse.ui.cheatsheets.views.CheatSheetView");
	}

}
