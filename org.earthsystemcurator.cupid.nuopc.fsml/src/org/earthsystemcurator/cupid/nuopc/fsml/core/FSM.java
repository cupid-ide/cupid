package org.earthsystemcurator.cupid.nuopc.fsml.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.photran.core.IFortranAST;

public class FSM {

	protected EObject root;
	protected EPackage pack;
	protected EFactory factory;
	
	/**
	 * Mapping from a model element to one of:
	 *  - a Set<IFortranAST> (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */	
	private Map<Object, Object> mappings;	
	
	protected FSM(EObject root) {
		this.root = root;
		this.pack = root.eClass().getEPackage();
		this.factory = this.pack.getEFactoryInstance();
		this.mappings = new IdentityHashMap<Object, Object>();
	}
	
	
	public EObject getRoot() {
		return root;
	}
	
	public Map<Object, Object> getMappings() {
		return mappings;
	}
	
	public Object getReference(Object modelElem) {
		return mappings.get(modelElem);
	}
		
	public List<Diagnostic> getDiagnostics() {
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);		
		
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			if (diagnostic.getChildren().size() > 0) {
				return diagnostic.getChildren();
			}
			else {
				ArrayList<Diagnostic> al = new ArrayList<Diagnostic>();
				al.add(diagnostic);
				return al;
			}			
		}
	
		return new ArrayList<Diagnostic>();
	}
	
	/**
	 * Adds a new element to the FSM at the given eref and updates the associated AST.
	 * 
	 * This method does not write out the modified AST, so no change will 
	 * be visible in the editor after this method completes.
	 * 
	 * @param context
	 * @param eref
	 * 
	 */
	public void forwardAdd(EObject context, EReference eref) {
		
		Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(eref);
		
		String methodName = null;
		if (keywordMap.size() > 0) {
			//by convention, first parameter keyword determines method name
			methodName = (String) keywordMap.keySet().toArray()[0];
			//skip metavariables for now
		}
		
		//contextFortranElem will be one of: IASTNode, IFortranAST, or Set<IFortranAST>
		Object contextFortranElem = getMappings().get(context);
		if (contextFortranElem == null) {
			System.out.println("contextFortranElem is null: " + context);
			return;
		}
		
		Method method = null;
		for (Method m : ForwardEngineer.class.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName)) {
				Class<?> c = m.getParameterTypes()[0];
				if (c.isInstance(contextFortranElem)) {
					method = m;
					break;
				}
			}
		}
		
		if (method == null) {
			System.out.println("Method not found: " + methodName + " with first param type: " + contextFortranElem.getClass());
			return;
		}
		
		//create the new element		
		EObject newElem = factory.create((EClass) eref.getEType());		
		
		Object newFortranElem = null;
		try {
			newFortranElem = method.invoke(null, contextFortranElem, newElem, keywordMap);
			//System.out.println(methodName + " generated new code: " + newFortranElem);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}				
		
		if (newFortranElem == null) {
			System.out.println("Warning: returned Fortran elements is null");
		}
		
		//add the new element to the model
		if (eref.isMany()) {
			@SuppressWarnings("rawtypes")
			EList sf = (EList) context.eGet(eref);
			sf.add(newElem);
		}
		else {
			context.eSet(eref, newElem);
		}
		
		//add to mappings
		getMappings().put(newElem, newFortranElem);
		
	}
	
	@SuppressWarnings("restriction")
	public IFortranAST getASTForElement(EObject eobj) {
		
		while (eobj != null) {
			if (getMappings().get(eobj) instanceof IFortranAST) {
				return (IFortranAST) getMappings().get(eobj);
			}
			eobj = eobj.eContainer();
		}
		return null;
		
	}
	
}
