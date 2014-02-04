package org.earthsystemcurator.cupid.nuopc.fsml.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.photran.core.IFortranAST;

public class FSM<RootType extends EObject> {

	protected RootType root;
	protected EPackage pack;
	protected EFactory factory;
	protected IProject project;
	
	
	/**
	 * Mapping from a model element to one of:
	 *  - a Set<IFortranAST> (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */	
	private Map<Object, Object> mappings;	
	
	protected FSM(RootType root, IProject project) {
		this.root = root;
		this.pack = root.eClass().getEPackage();
		this.factory = this.pack.getEFactoryInstance();
		this.mappings = new IdentityHashMap<Object, Object>();
		this.project = project;
	}
	
	
	public RootType getRoot() {
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
	 * @param recursive
	 * 
	 */
	@SuppressWarnings("unchecked")
	public EObject forwardAdd(EObject context, EReference eref, boolean recursive) {
		
		Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(eref);
						
		//contextFortranElem will be one of: IASTNode, IFortranAST, or Set<IFortranAST>
		Object contextFortranElem = getMappings().get(context);
		if (contextFortranElem == null) {
			System.out.println("contextFortranElem is null: " + context);
			return null;
		}
		
		String methodName = Regex.getMappingTypeFromAnnotation(eref);
		Method method = null;
		if (methodName != null) {
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
				return null;
			}
		}
		
		
		
		//create the new element and add to model		
		//EObject newElem = factory.create((EClass) eref.getEType());
		//EObject newElem = createElementTree(context, eref);
		EClass type = (EClass) eref.getEType();
		EObject newElem = factory.create(type);
		
		//add the new element to the model
		if (eref.isMany()) {
			@SuppressWarnings("rawtypes")
			EList sf = (EList) context.eGet(eref);
			sf.add(newElem);
		}
		else {
			context.eSet(eref, newElem);
		}
		
		//method may be null if there is no Fortran mapping for the element
		//in this case the new model element maps to the context fortran element
		if (method != null) {
			
			//add project to keyword map
			//TODO: is there a cleaner way to do this?
			keywordMap.put("_project", this.project);
			
			//update the AST
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
			
			//add to mappings
			getMappings().put(newElem, newFortranElem);
		}
		else {
			getMappings().put(newElem, contextFortranElem);
		}
		
		
		//recursively add child elements
		if (recursive) {
			for (EReference childRef : type.getEReferences()) {
				if (childRef.isContainment() && 
						(Regex.getIsEssentialFromAnnotation(childRef) || 
								Regex.getMappingTypeFromAnnotation(childRef) == null)) {
					System.out.println("Adding child: " + childRef.getName());
					forwardAdd(newElem, childRef, recursive);				
				}
			}
		}
		
		return newElem;
		
	}
	
	/**
	 * Create an new model element including all of its children
	 * that are marked as essential.
	 * 
	 * @param parent the parent object or null
	 * @param type the reference we are creating
	 * @return the new element tree
	 */
	public EObject createElementTree(EObject parent, EReference eref) {
		
		EClass type = (EClass) eref.getEType();
		EObject newElem = factory.create(type);
		
		if (eref.isMany()) {
			@SuppressWarnings("rawtypes")
			EList sf = (EList) parent.eGet(eref);
			sf.add(newElem);
		}
		else {
			parent.eSet(eref, newElem);
		}
		
		for (EReference childRef : type.getEReferences()) {
			if (childRef.isContainment() && Regex.getIsEssentialFromAnnotation(childRef)) {
				EObject childElem = createElementTree(newElem, childRef);				
			}
		}
		
		return newElem;
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
