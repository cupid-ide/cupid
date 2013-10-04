package org.earthsystemcurator.cupid.nuopc.fsml.nav;
import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class NUOPCNavContentProvider implements ITreeContentProvider {

	public NUOPCNavContentProvider() {
		System.out.println("Created NUOPCNavContentProvider");
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		System.out.println("inputChanged: " + oldInput + "\n===>" + newInput);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		System.out.println("NUOPCNavContentProvider: getElements: " + inputElement);
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		System.out.println("NUOPCNavContentProvider: getChildren: " + parentElement);
		
		if (parentElement instanceof IFile) {
			NUOPCApplication app = getModel(((IFile) parentElement).getProject());
			if (app != null) {
				return app.getNuopcModel().toArray();
			}
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		System.out.println("NUOPCNavContentProvider: getParent: " + element);
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		System.out.println("NUOPCNavContentProvider: hasChildren: " + element);
		return element instanceof IFile;
	}
	
	//private Map<IProject, NUOPCApplication> revMap = new HashMap<IProject, NUOPCApplication>();
	
	private NUOPCApplication getModel(IProject p) {
		//if (revMap.containsKey(p)) {
		//	return revMap.get(p);
		//}
		//else {
		try {
			NUOPCNature nature = (NUOPCNature) p.getNature(NUOPCNature.NATURE_ID);
			//if (nature.getReverseEngineeredModel() != null) {
			//	revMap.put(p, nature.getReverseEngineeredModel());
			//return nature.getReverseEngineeredModel();
			return null;
			//}
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
		//}
		//return null;
	}

}
