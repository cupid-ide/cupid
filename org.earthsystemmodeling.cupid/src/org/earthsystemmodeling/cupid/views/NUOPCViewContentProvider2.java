package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCDriver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.event.OutputEvent;
import alice.tuprolog.event.OutputListener;
import alice.tuprolog.event.WarningEvent;
import alice.tuprolog.event.WarningListener;

@SuppressWarnings("restriction")
class NUOPCViewContentProvider2 implements IStructuredContentProvider, ITreeContentProvider {
	
	private IFile input;
	private CodeDBIndex codeDB = CodeDBIndex.getInstance();
	private WarningListener warningListener;
	private OutputListener outputListener;
	
	public NUOPCViewContentProvider2() {
		
		codeDB.openConnection();
		codeDB.rebuildDatabase();
				
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
	
	
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		
		if (newInput != null) {
			input = (IFile) newInput;
			
			//test CodeDB approach
			long startRebuild = System.currentTimeMillis();
			codeDB.truncateDatabase();
			long endRebuild = System.currentTimeMillis();
			
			String filename = PhotranVPG.getFilenameForIFile(input);
			long startParse = System.currentTimeMillis();
			//IFortranAST ast = PhotranVPG.getInstance().parse(filename);
			PhotranVPG.getInstance().releaseAST(filename);
			IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(filename);
			long endParse = System.currentTimeMillis();
			
			long startIndex = System.currentTimeMillis();
			if (ast != null) {
				codeDB.indexAST(ast);
			}
			long endIndex = System.currentTimeMillis();
			
			CupidActivator.log(IStatus.INFO, "Rebuild DB time: " + (endRebuild-startRebuild));
			CupidActivator.log(IStatus.INFO, "Parse time: " + (endParse-startParse));
			CupidActivator.log(IStatus.INFO, "Index DB time: " + (endIndex-startIndex));

		}
	}
		
	public void dispose() {
		if (warningListener != null && codeDB != null) {
			codeDB.getProlog().removeWarningListener(warningListener);
		}
		if (outputListener != null && codeDB != null) {
			codeDB.getProlog().removeOutputListener(outputListener);
		}
	}
	
	public Object[] getElements(Object parent) {	
		NUOPCDriver driver = new NUOPCDriver(codeDB).reverse();
		if (driver != null) {
			return new Object[] {
				new CodeConceptProxy(NUOPCDriver.class, driver, driver.getClass().getAnnotation(Label.class), null)
			};
		}
		else {
			return new Object[0];
		}
			
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
	
	public Object [] getChildren(Object p) {
		
		ArrayList<Object> children = new ArrayList<Object>();
		
		CodeConceptProxy parent = (CodeConceptProxy) p;
		Class<?> parentClass = parent.clazz;
				
		for (Field field : parentClass.getFields()) {
			Child childAnn = field.getAnnotation(Child.class);
			if (childAnn != null) {
				try {					

					//int min = childAnn.min();
					//int max = childAnn.max();
					
					Class<?> codeConceptClass = getTypeFromField(field);
					Label lbl = getLabelFromField(field);
					
					CodeConcept<?,?,?> cc = null;
					if (parent.codeConcept != null) {
						Object fieldObj = field.get(parent.codeConcept);
						if (fieldObj instanceof List) {
							
							List<CodeConcept<?,?,?>> ccList = (List<CodeConcept<?,?,?>>) fieldObj;
							for (CodeConcept<?,?,?> item : ccList) {
								children.add(new CodeConceptProxy(codeConceptClass, item, lbl, childAnn));
							}
							
						}
						else {
							cc = (CodeConcept<?,?,?>) fieldObj;
							CodeConceptProxy ccp = new CodeConceptProxy(codeConceptClass, cc, lbl, childAnn);
							children.add(ccp);
						}
					}
					else {
						CodeConceptProxy ccp = new CodeConceptProxy(codeConceptClass, null, lbl, childAnn);
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
		public CodeConcept<?,?,?> codeConcept = null;
		public Class<?> clazz = null;
		public int min=1;
		public int max=1;
		public CodeConceptProxy() {}

		/*
		public CodeConceptProxy(String label, String value, String type, CodeConcept<?,?,?> codeConcept) {
			this.label = label;
			this.value = value;
			this.type = type;
			this.codeConcept = codeConcept;
		}
		*/
		
		public CodeConceptProxy(Class<?> clazz, CodeConcept<?,?,?> codeConcept, Label lbl, Child child) {
			this.codeConcept = codeConcept;
			this.clazz = clazz;
			if (lbl != null) {
				label = lbl.label();
				type = lbl.type();
			}
			else {
				label = clazz.getSimpleName();
			}
			if (child != null) {
				min = child.min();
				max = child.max();
			}
			
		}
		
	}
	
	
}