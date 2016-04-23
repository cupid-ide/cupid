package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCFrameworkManager;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.ui.editor.FortranEditor;

import alice.tuprolog.event.OutputListener;
import alice.tuprolog.event.WarningListener;

@SuppressWarnings("restriction")
class NUOPCViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	private IFile file;
	private FortranEditor editor;
	
	//private CodeDBIndex codeDB = CodeDBIndex.getInstance();
	private WarningListener warningListener;
	private OutputListener outputListener;
	
	static Map<Class<?>, Field[]> fieldCache = new HashMap<Class<?>, Field[]>();
	
	/*
	public NUOPCViewContentProvider() {
		
		try {
			codeDB.openConnection();
		}
		catch (SQLException s) {
			MessageDialog.openError(
					null,
					"Error connecting to code database",
					"An error occured connecting to the code database.  Please delete the directory ~/.cupid and restart Eclipse.");
			return;
		}
		
		codeDB.rebuildDatabase();
		
		if (CupidActivator.getDefault().isDebugging()) {
			warningListener = new WarningListener() {
				@Override
				public void onWarning(WarningEvent e) {
					CupidActivator.log(Status.WARNING, "Prolog warning: " + e.getMsg());
				}
			};
			
			outputListener = new OutputListener() {
				@Override
				public void onOutput(OutputEvent e) {
					System.out.println("Prolog output: " + e.getMsg());
				}
			};
			
			
			codeDB.getProlog().addWarningListener(warningListener);
			codeDB.getProlog().addOutputListener(outputListener);
		}
		
	}
	*/
	
	public boolean editorIsDirty() {
		if (editor != null) {
			return editor.isDirty();
		}
		return false;
	}
	
		
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		if (newInput == null) {
			return;
		}
		else if (newInput instanceof FortranEditor) {
			editor = (FortranEditor) newInput;
			file = editor.getIFile();
		}
	}
	
	
	public void dispose() {
		
	}
	
	
	//private isFortranAnalysisEnabled
	
	public Object[] getElements(Object parent) {	
		
		NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
		
		long startIndex = System.currentTimeMillis();
		CodeConcept<?,?> codeConcept = manager.acquireConcept(file);
		long endIndex = System.currentTimeMillis();
		
		CupidActivator.debug("Time to reverse engineer: " + (endIndex-startIndex));
		
		if (codeConcept != null) {
			return new Object[] {
				new CodeConceptProxy(codeConcept.getClass(), 
						codeConcept, 
						codeConcept.getClass().getAnnotation(Label.class), 
						null,
						codeConcept.getClass().getAnnotation(MappingType.class))
			};
		}
		else if (!PhotranVPG.getInstance().doesProjectHaveRefactoringEnabled(file)) {
			return new Object[] {
					"Project must have Fortran analysis enabled\n" +
					"to use NUOPC tools. To enable, right click\n" +
					"on project folder, and select Properties.\n" +
					"In the Fortran General->Analysis/Refactoring\n" +
					"page enable analyis/refactoring."
					};
		}
		else {
			return new Object[0];
		}
		
		
		/*
		class ReverseEngineerJob extends Job {

			public CodeConcept<?,?> codeConcept;
			public ReverseEngineerException exception;
			
			public ReverseEngineerJob(String name) {
				super(name);
			}

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					codeConcept = new NUOPCDriver(file).reverse();
					if (codeConcept == null) {
						codeConcept = new NUOPCModel(file).reverse();
					}
					if (codeConcept == null) {
						codeConcept = new NUOPCMediator(file).reverse();
					}
				}
				catch (ReverseEngineerException ree) {
					exception = ree;
					CupidActivator.log("Reverse engineering exception for file: " + file.getName(), ree);
					codeConcept = null;
				}
				if (codeConcept != null) {
					return Status.OK_STATUS;
				}
				else {
					return Status.CANCEL_STATUS;
				}
			}
			
		}
		
		ReverseEngineerJob rej = new ReverseEngineerJob("Reverse engineer: " + file.getName());
		rej.schedule();
		try {
			rej.join();
		} catch (InterruptedException e) {
			return new Object[0];
		}
		
		if (rej.exception != null) {
			return new Object[] {rej.exception};
		}
		
		codeConcept = rej.codeConcept;
		*/
		
		/*
		try {
			codeConcept = new NUOPCDriver(file).reverse();
			if (codeConcept == null) {
				codeConcept = new NUOPCModel(file).reverse();
			}
			if (codeConcept == null) {
				codeConcept = new NUOPCMediator(file).reverse();
			}
		}
		catch (ReverseEngineerException ree) {
			CupidActivator.log("Reverse engineering exception for file: " + file.getName() + " RETRYING");
		
				
		}
		*/
		
		
			
	}
	
	public Object getParent(Object child) {
		return null;
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
	
	
	
	public Object [] getChildren(Object p) {
		
		if (!(p instanceof CodeConceptProxy)) {
			return new Object[0];
		}
		
		ArrayList<Object> children = new ArrayList<Object>();
				
		CodeConceptProxy parent = (CodeConceptProxy) p;
		Class<?> parentClass = parent.clazz;
		
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
		
	public boolean hasChildren(Object p) {
		return getChildren(p).length > 0;
	}
	
	
	public static class CodeConceptProxy {

		public String label = null;
		public String value = null;  //needed?
		public String type = null;
		public CodeConcept<?,?> codeConcept = null;
		public Class<?> clazz = null;
		public int min=1;
		public int max=1;
		public CodeConceptProxy() {}

		public CodeConceptProxy(Class<?> clazz, CodeConcept<?,?> codeConcept, Label lbl, Child child, MappingType mt) {
			this.codeConcept = codeConcept;
			this.clazz = clazz;
			if (lbl != null) {
				label = lbl.label();
				//type = lbl.type();
			}
			else {
				label = clazz.getSimpleName();
			}
			if (child != null) {
				min = child.min();
				max = child.max();
			}
			if (mt != null) {
				type = mt.value();
			}
			else {
				//deprecated, but leaving here for now
				type = lbl.type();
			}
			
		}
		
	}
	
	
	
}