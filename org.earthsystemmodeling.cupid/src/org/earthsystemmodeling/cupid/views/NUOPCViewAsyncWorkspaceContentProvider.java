package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider.CodeConceptProxy;
import org.eclipse.cdt.internal.ui.viewsupport.AsyncTreeContentProvider;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.photran.internal.core.properties.SearchPathProperties;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;


@SuppressWarnings("restriction")
class NUOPCViewAsyncWorkspaceContentProvider extends AsyncTreeContentProvider { 
	
	//private IFile file;
	private FortranEditor editor;
	private TreeViewer viewer;
	
	static Map<Class<?>, Field[]> fieldCache = new HashMap<Class<?>, Field[]>();
		
	public boolean editorIsDirty() {
		if (editor != null) {
			return editor.isDirty();
		}
		return false;
	}
		
	@Override
	public void clear() {
		super.clear();
	}
	
	public NUOPCViewAsyncWorkspaceContentProvider(Display disp, TreeViewer viewer) {
		super(disp);
		this.viewer = viewer;
	}

	@Override
	protected Object[] asyncronouslyComputeChildren(Object parentElement, IProgressMonitor monitor) {
				
		NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
		
		if (parentElement instanceof IWorkspace) {
			
			List<IFile> fileList = new LinkedList<IFile>();
			
			Set<Entry<IFile, CodeConcept<?, ?>>> allComps = manager.listAllComponents();
			for (Entry<IFile, CodeConcept<?,?>> entry : allComps) {
				fileList.add(entry.getKey());
			}
			
			if (fileList.size() == 0) {
				boolean atLeastOne = false;
				SearchPathProperties spp = new SearchPathProperties();
				for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					if (spp.getProperty(p, SearchPathProperties.ENABLE_VPG_PROPERTY_NAME).equals("true")) {
						atLeastOne = true;
						break;
					}
				}
				if (!atLeastOne) {
					return new Object[] {
							"The NUOPC View is dependent on Fortran",
							"analysis being enabled and there are no",
							"projects with it turned on.  Please enable",
							"Fortran analysis in projects containing",
							"NUOPC code.  ",
							"To enable, right click on a project",
							"folder, and select Properties.",
							"On the Fortran General -> Analysis/Refactoring",
							"page check enable Fortran analysis/refactoring."
							};
				}
			}
			
			Collections.sort(fileList, new Comparator<IFile>() {
				@Override
				public int compare(IFile f1, IFile f2) {
					return f1.getLocation().toString().compareTo(f2.getLocation().toString());
				}
			});
						
			return fileList.toArray();
			
			
		}
		else if (parentElement instanceof IFile) {
			
			CodeConcept cc = null;
			try {
				cc = manager.acquireConcept((IFile) parentElement, false, true);
			} catch (ReverseEngineerException e) {
				CupidActivator.log("Error retrieving from NUOPC database: " + ((IFile) parentElement).getFullPath(), e);
				return null;
			}
			
			CodeConceptProxy ccp = new CodeConceptProxy(cc.getClass(), 
					cc, 
					cc.getClass().getAnnotation(Label.class), 
					null,
					cc.getClass().getAnnotation(MappingType.class));
				
			return new Object[] {ccp};
		}
		else {
			return null;
		}
	}
	
	@Override
	protected Object[] syncronouslyComputeChildren(Object parentElement) {
		
		if (parentElement instanceof CodeConceptProxy) {
		
			CodeConceptProxy parent = (CodeConceptProxy) parentElement;
			Class<?> parentClass = parent.clazz;

			ArrayList<Object> children = new ArrayList<Object>();
			
			Field[] fields;
			if (fieldCache.containsKey(parentClass) && !CupidActivator.getDefault().isDebugging()) {
				//don't use cache for debugging to allow for Java hot swaps
				fields = fieldCache.get(parentClass);
			}
			else {
				fields = parentClass.getFields();
				Arrays.sort(fields, new FieldSorter());
				fieldCache.put(parentClass, fields);
			}
			
			for (Field field : fields) {
				Child childAnn = field.getAnnotation(Child.class);
				if (childAnn != null) {
					try {					
	
						//int min = childAnn.min();
						//int max = childAnn.max();
						
						Class<?> codeConceptClass = getTypeFromField(field);
						Label lbl = getLabelFromField(field);
						MappingType mt = getMappingTypeFromField(field);
						
						CodeConcept<?,?> cc = null;
						if (parent.codeConcept != null) {
							Object fieldObj = field.get(parent.codeConcept);
							if (fieldObj instanceof List) {
								List<CodeConcept<?,?>> ccList = (List<CodeConcept<?,?>>) fieldObj;
								if (ccList.size() > 0) {
									for (CodeConcept<?,?> item : ccList) {
										children.add(new CodeConceptProxy(codeConceptClass, item, lbl, childAnn, mt));
									}
								}
								else {
									children.add(new CodeConceptProxy(codeConceptClass, null, lbl, childAnn, mt));
								}
							}
							else {
								cc = (CodeConcept<?,?>) fieldObj;
								CodeConceptProxy ccp = new CodeConceptProxy(codeConceptClass, cc, lbl, childAnn, mt);
								children.add(ccp);
							}
						}
						else {
							CodeConceptProxy ccp = new CodeConceptProxy(codeConceptClass, null, lbl, childAnn, mt);
							children.add(ccp);
						}
						
					} catch (IllegalArgumentException | IllegalAccessException e) {
						//ignore
					}
				}
			}
			
			return children.toArray();	
		}
		else if (parentElement instanceof String) {
			return NO_CHILDREN;
		}
		else {
			return null;
		}
		
	}
	
	private void updateNUOPCDocViewer(final CodeConceptProxy ccp) {
		UIJob updateDoc = new UIJob("Update NUOPC Doc View") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				NUOPCDocView ndv = (NUOPCDocView) PlatformUI.getWorkbench().
						getActiveWorkbenchWindow().getActivePage().findView(NUOPCDocView.ID);
				if (ndv != null) {
					String doc = NUOPCViewLabelProvider.getNUOPCDoc(ccp);
					if (doc != null) {
						if (doc.startsWith("http") || doc.startsWith("file:")) {
							ndv.setURL(doc);
						}
						else {
							ndv.setDoc(doc);
						}
					}
				}
				return Status.OK_STATUS;
			}
		};
		updateDoc.schedule();
	}
	
	private void expandTreeViewer(final TreeViewer viewer) {
		UIJob expandJob = new UIJob("Expand NUOPC outline") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				viewer.expandToLevel(4);
				return Status.OK_STATUS;
			}
		};
		expandJob.schedule(250);
	}
	
	
	public static Class<?> getTypeFromField(Field f) {
		Class<?> codeConceptClass = f.getType();
		if (codeConceptClass == List.class) {
			ParameterizedType pt = (ParameterizedType) f.getGenericType();
			codeConceptClass = (Class<?>) pt.getActualTypeArguments()[0];
		}
		return codeConceptClass;
	}
	
	public static Label getLabelFromField(Field f) {
		Label lbl = f.getAnnotation(Label.class);
		if (lbl != null) return lbl;
			
		Class<?> c = getTypeFromField(f);
		lbl = c.getAnnotation(Label.class);
		if (lbl != null) return lbl;
		
		return null;
	}
	
	public static MappingType getMappingTypeFromField(Field f) {
		MappingType mt = f.getAnnotation(MappingType.class);
		if (mt != null) return mt;
			
		Class<?> c = getTypeFromField(f);
		mt = c.getAnnotation(MappingType.class);
		if (mt != null) return mt;
		
		return null;
	}
	
	public static class FieldSorter implements Comparator<Field> {
		@Override
		public int compare(Field f1, Field f2) {
			Label labelAnn1 = f1.getAnnotation(Label.class);
			Label labelAnn2 = f2.getAnnotation(Label.class);
			
			int f1sort = 999999;
			int f2sort = 999999;
			
			if (labelAnn1 != null) {
				f1sort = labelAnn1.sort();
			}
			if (labelAnn2 != null) {
				f2sort = labelAnn2.sort();
			}
			
			if (f1sort < f2sort) return -1;
			else if (f1sort > f2sort) return 1;
			else return 0;
			
		}
	}
		
	
}