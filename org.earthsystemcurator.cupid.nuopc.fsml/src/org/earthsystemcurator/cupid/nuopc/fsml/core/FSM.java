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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	 * Finds the appropriate forward engineering method (AST code generation).
	 *
	 * @param methodName the name of the method
	 * @param firstParam the first parameter (used to match type)
	 * @return the method if found, or null if not
	 */
	private Method getFEMethod(String methodName, Object firstParam) {
			
		if (methodName != null) {
			for (Method m : ForwardEngineer.class.getMethods()) {
				if (m.getName().equalsIgnoreCase(methodName)) {
					Class<?> c = m.getParameterTypes()[0];
					if (c.isInstance(firstParam)) {
						return m;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Adds a new structural feature to the FSM and updates the associated AST.
	 * A new EObject is created and the new Fortran constructs are added to the AST
	 * according to the mapping of the EReference
	 * 
	 * This method does not write out the modified AST, so no change will 
	 * be visible in the editor after this method completes.
	 * 
	 * @param context
	 * @param eref
	 * @param recursive
	 * @return the EObject created
	 */
	public EObject forwardAdd(EObject context, EReference eref, boolean recursive) {
	
		Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(eref);
		
		//contextFortranElem will be one of: IASTNode, IFortranAST, or Set<IFortranAST>
		Object contextFortranElem = getMappings().get(context);
		if (contextFortranElem == null) {
			System.out.println("contextFortranElem is null: " + context);
			return null;
		}
			
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
			
		
		String methodName = Regex.getMappingTypeFromAnnotation(eref);
		if (methodName != null) {

			Method method = getFEMethod(methodName, contextFortranElem);
			
			if (method == null) {
				System.out.println("Method not found: " + methodName + " with first param type: " + contextFortranElem.getClass());
				return null;
			}
			
			//add project to keyword map
			//TODO: is there a cleaner way to do this?
			keywordMap.put("_project", this.project);
			
			//update the AST
			Object newFortranElem = null;
			try {
				newFortranElem = method.invoke(null, contextFortranElem, newElem, keywordMap);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				//most likely a syntax error - TODO: deal with this gracefully
				e.printStackTrace();
			}				
			
			if (newFortranElem == null) {
				System.out.println("Warning: returned Fortran elements is null");
			}
			
			//add to mappings
			getMappings().put(newElem, newFortranElem);
		
		}	
		else {
			//method may be null if there is no Fortran mapping for the element
			//in this case the new model element maps to the context fortran element
			getMappings().put(newElem, contextFortranElem);
		}
		
				
		//recursively add child elements
		if (recursive) {
			
			//handle EAttributes
			for (EAttribute childAtt : type.getEAttributes()) {
				//if (Regex.getIsEssentialFromAnnotation(childAtt) || 
				//				Regex.getMappingTypeFromAnnotation(childRef) == null) {
					forwardAdd(newElem, childAtt);				
				//}
			}
			
			//handle EReferences
			for (EReference childRef : type.getEReferences()) {
				if (childRef.isContainment() && 
						(Regex.getIsEssentialFromAnnotation(childRef) || 
								Regex.getMappingTypeFromAnnotation(childRef) == null)) {
					forwardAdd(newElem, childRef, recursive);				
				}
			}
		}
		
		return newElem;
		
	}
	
	/**
	 * Updates the associated AST based on the value of the EAttribute.
	 * 
	 * This method does not write out the modified AST, so no change will 
	 * be visible in the editor after this method completes.
	 * 
	 * @param context the EObject containing the attribute
	 * @param eatt the EAttribute used to update the AST
	 * @return the value of the EAttribute
	 * 
	 */
		
	public Object forwardAdd(EObject context, EAttribute eatt) {

		Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(eatt);
		
		//contextFortranElem will be one of: IASTNode, IFortranAST, or Set<IFortranAST>
		Object contextFortranElem = getMappings().get(context);
		if (contextFortranElem == null) {
			System.out.println("contextFortranElem is null: " + context);
			return null;
		}
			
		Object newElem = context.eGet(eatt);
				
		String methodName = Regex.getMappingTypeFromAnnotation(eatt);
		if (methodName != null) {

			Method method = getFEMethod(methodName, contextFortranElem);
			
			if (method == null) {
				System.out.println("Method not found: " + methodName + " with first param type: " + contextFortranElem.getClass());
				return null;
			}
						
			//update the AST
			Object newFortranElem = null;
			try {
				newFortranElem = method.invoke(null, contextFortranElem, newElem, keywordMap);
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
			//method may be null if there is no Fortran mapping for the element
			//in this case the new model element maps to the context fortran element
			getMappings().put(newElem, contextFortranElem);
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
	/*
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
	*/
	
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
