package org.earthsystemcurator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupidLanguage.Annotation;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Language;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.PathExprTerm;
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute;
import org.earthsystemcurator.generator.CupidLanguageGenerator;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
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
	protected Language language;
	protected Class<?> transformations;
	
	protected CupidLanguageGenerator generator;
	protected Map<SubconceptOrAttribute, EStructuralFeature> cache;
	
	/**
	 * Mapping from a model element to one of:
	 *  - a Set<IFortranAST> (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */	
	private Map<Object, Object> mappings;	
	
	public FSM(Language language, RootType root, IProject project, Class<?> transformations) {
		this.language = language;
		this.root = root;
		this.pack = root.eClass().getEPackage();
		this.factory = this.pack.getEFactoryInstance();
		this.mappings = new IdentityHashMap<Object, Object>();
		this.project = project;
		this.transformations = transformations;
		this.cache = new HashMap<SubconceptOrAttribute, EStructuralFeature>();
		this.generator = new CupidLanguageGenerator();  //just used for "toClassName" methods
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
	
	private Method findFEMethod(String methodName, Object context, EObject mapping) {
		for (Method m : transformations.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName) && m.getParameterTypes().length == 2) {
				Class<?> contextClass = m.getParameterTypes()[0];
				Class<?> mappingClass = m.getParameterTypes()[1];
				if (contextClass.isInstance(context) &&
					mappingClass.isInstance(mapping)) {
					return m;
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
	@SuppressWarnings("unchecked")
	public EObject forwardAdd(EObject context, EReference eref, boolean recursive) {
		
		//create new element and add to the model
		EClass type = (EClass) eref.getEType();
		EObject newElem = factory.create(type);
				
		if (eref.isMany()) {
			@SuppressWarnings("rawtypes")
			EList sf = (EList) context.eGet(eref);
			sf.add(newElem);
		}
		else {
			context.eSet(eref, newElem);
		}
		
		//NEW MAPPING
		
		EAnnotation ann = eref.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		if (ann != null && ann.getDetails().get("mappingNew") != null) {
			String mappingNew = ann.getDetails().get("mappingNew");
			
			Mapping mapping = null; //ReverseEngineer.parseMappingNew(mappingNew);
			Object fortranContextElem;
			
			if (mapping.getContext() != null) {
				//explicit context
				EObject contextElement = getValueFromModel(mapping.getContext(), context, null);
				fortranContextElem = getMappings().get(contextElement);
				if (fortranContextElem == null) {
					throw new RuntimeException("No Fortran context for element: " + contextElement);
				}
			}
			else {
				fortranContextElem = getMappings().get(context);  //implicit
			}
			
			ImplicitContextMapping icMapping = mapping.getMapping();
			icMapping = null; //ReverseEngineer.replacePathExprWithValues(icMapping, newElem, false);
			
			String methodName = icMapping.eClass().getName().toLowerCase();
			
			//find method that implements code query
			Method method = findFEMethod(methodName, fortranContextElem, icMapping);
			if (method == null) {
				System.out.println("Method not found: " + methodName);
				return null;
			}
			
			Object newFortranElem = null;
			try {
				newFortranElem = method.invoke(null, fortranContextElem, icMapping);
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
				if (childRef.isContainment()) {// && TODO: fixme
						//(Regex.getIsEssentialFromAnnotation(childRef) || 
							//	Regex.getMappingTypeFromAnnotation(childRef) == null)) {
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

		Map<String, Object> keywordMap = null;//Regex.getMappingFromAnnotation(eatt);
		
		//TODO: handle explicit context
		
		//contextFortranElem will be one of: IASTNode, IFortranAST, or Set<IFortranAST>
		Object contextFortranElem = getMappings().get(context);
		if (contextFortranElem == null) {
			System.out.println("contextFortranElem is null: " + context);
			return null;
		}
			
		Object newElem = context.eGet(eatt);
				
		String methodName = "";//Regex.getMappingTypeFromAnnotation(eatt);
		if (methodName != null) {

			Method method = null; //getFEMethod(methodName, contextFortranElem, keywordMap);
			
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
	
	public EAttribute getNameEAttribute(ConceptDef cd) {
		for (SubconceptOrAttribute soa: cd.getChild()) {
			if (soa.isAttrib() && hasAnnotation(soa, "name")) {
				return (EAttribute) getEStructuralFeature(soa);
			}
		}
		return null;
	}
	
	public EStructuralFeature getEStructuralFeature(SubconceptOrAttribute soa) {	
		if (cache.containsKey(soa)) {
			return cache.get(soa);
		}
		else {			
			//find the EClass of the parent conceptDef
			ConceptDef parentConceptDef = (ConceptDef) soa.eContainer();
			String parentEClassName = generator.toClassName(parentConceptDef);
			EClass parentEClass = (EClass) pack.getEClassifier(parentEClassName);
			
			//find the structural feature
			EStructuralFeature sf = parentEClass.getEStructuralFeature(soa.getName());
			cache.put(soa, sf);
			return sf;
		}	
	}
	
	public EClass getEClass(ConceptDef cd) {
		String eclassName = generator.toClassName(cd);
		return (EClass) pack.getEClassifier(eclassName);
	}
	
	public ConceptDef getConceptDef(EObject obj) {
		return getConceptDef(obj.eClass());
	}
	
	public ConceptDef getConceptDef(EClass eclass) {
		String eclassName = eclass.getName();
		if (!eclassName.contains("__")) {
			for (ConceptDef cd : language.getConceptDef()) {
				if (cd.getName().equalsIgnoreCase(eclassName)) {
					return cd;
				}
			}
			return null;
		}
		else {
			String[] segments = eclassName.split("__");
			ConceptDef cur = null;
			for (ConceptDef cd : language.getConceptDef()) {
				if (cd.getName().equalsIgnoreCase(segments[0])) {
					cur = cd;
					break;
				}
			}
			if (cur==null) return null;
			for (int i = 1; i<segments.length; i++) {
				boolean found = false;
				for (SubconceptOrAttribute soa : cur.getChild()) {
					if (!soa.isAttrib() && !soa.isReference()) {
						if (soa.getDef()==null) {
							System.out.println("Should not happen");
						}
						if (soa.getDef().isNamed() && soa.getDef().getName().equalsIgnoreCase(segments[i])) {
							cur = soa.getDef();
							found = true;
							break;
						}
						else if (!soa.getDef().isNamed() && soa.getName().equalsIgnoreCase(segments[i])) {
							cur = soa.getDef();
							found = true;
							break;
						}
					}
				}
				if (!found) return null;
			}
			return cur;
		}
	}
	
	public String getAnnotationValue(EObject obj, String key) {
		return getAnnotationValue(getConceptDef(obj), key);
	}
	
	public String getAnnotationValue(ConceptDef cd, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : cd.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return a.getValue();
			}
		}
		return null;
	}
	
	public String getAnnotationValue(SubconceptOrAttribute soa, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : soa.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return a.getValue();
			}
		}
		return null;
	}
	
	public boolean hasAnnotation(SubconceptOrAttribute soa, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : soa.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return true;
			}
		}
		return false;
	}

	
	
	@SuppressWarnings("unchecked")
	public <T> T getValueFromModel(PathExpr pathExpr, EObject modelElem, T defaultVal) {
		
		//for now, just get last segment as direct pointer 
		//(we have not implemented any tree walking directives)
		SubconceptOrAttribute lastSegment = getLastSegment(pathExpr);
		EStructuralFeature lastSegmentSF = getEStructuralFeature(lastSegment);
		EClass lastSegmentEClass = lastSegmentSF.getEContainingClass();
		
		//move up the tree and find the nearest object with matching EClass
		EObject cur = modelElem;
		while (cur != null && !cur.eClass().equals(lastSegmentEClass)) {
			cur = cur.eContainer();
		}
		if (cur == null) {
			//we failed
			System.out.println("getValueFromModel: Value of pathExpr not found: " + pathExpr);
			return defaultVal;
		}
		else {
			return (T) cur.eGet(lastSegmentSF);
		}
	}
	
	public void setValueInModel(PathExpr pathExpr, EObject modelElem, String value) {
		
		//TODO: MOST OF THIS COPIED FROM ABOVE, abstract it out
		
		//for now, just get last segment as direct pointer 
		//(we have not implemented any tree walking directives)
		SubconceptOrAttribute lastSegment = getLastSegment(pathExpr);
		EStructuralFeature lastSegmentSF = getEStructuralFeature(lastSegment);
		EClass lastSegmentEClass = lastSegmentSF.getEContainingClass();
		
		//move up the tree and find the nearest object with matching EClass
		EObject cur = modelElem;
		while (cur != null && !cur.eClass().equals(lastSegmentEClass)) {
			cur = cur.eContainer();
		}
		if (cur == null) {
			//we failed
			System.out.println("setValueInModel: Value of pathExpr not found: " + pathExpr);
		}
		else {
			cur.eSet(lastSegmentSF, value);
		}
	}

	
	public SubconceptOrAttribute getLastSegment(PathExpr pathExpr) {
		if (pathExpr.getTail() != null) {
			return pathExpr.getTail();
		}
		else if (pathExpr instanceof PathExprTerm) {
			return ((PathExprTerm) pathExpr).getRef();
		}
		else {
			System.out.println("null last segment");
			return null;
		}
		//if (pathExpr instanceof PathExprTerm) {
		//	return (PathExprTerm) pathExpr;
		//}
		//else {
		//	return getLastSegment(pathExpr.getHead());
		//}
	}
	
	
	/**
	 * Looks for instances of PathExpr in the mappingElement tree and, when possible,
	 * replaces them with values from the context
	 * 
	 * @param mappingElement
	 * @param context
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> T replacePathExprWithValues(T mappingElement, EObject context) {
		if (mappingElement == null) {
			return null;
		}
		else if (mappingElement instanceof PathExpr) {
			Object replaceVal = getValueFromModel((PathExpr) mappingElement, context, null);
			if (replaceVal != null) {
				if (!(replaceVal instanceof String)) {
					System.out.println("Should not happen");
				}
				IDOrWildcard replaceValObj = CupidLanguageFactory.eINSTANCE.createIDOrWildcard();
				replaceValObj.setId((String) replaceVal);
				return (T) replaceValObj;
			}			
		}
		else {
			for (EReference ref : mappingElement.eClass().getEReferences()) {
				if (!ref.isMany()) {
					mappingElement.eSet(ref, replacePathExprWithValues((EObject) mappingElement.eGet(ref), context));
				}
				else {
					@SuppressWarnings("rawtypes")
					EList refList = (EList) mappingElement.eGet(ref);
					for (int i = 0; i < refList.size(); i++) {
						refList.set(i, replacePathExprWithValues((EObject) refList.get(i), context));
					}
				}
			}
		}
		return mappingElement;		
	}
	
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
