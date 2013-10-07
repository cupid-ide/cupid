package org.earthsystemcurator.cupid.nuopc.fsml.views;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.util.EcoreUtils;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

class NUOPCViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	private IProject project;
	private NUOPCApplication app;
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		System.out.println("inputChanged: " + v + " " + newInput);
		
		project = null;
		app = null;
		
		if (newInput != null) {
			project = (IProject) newInput;			
			try {
				NUOPCNature nature = (NUOPCNature) project.getNature(NUOPCNature.NATURE_ID);
				if (nature != null) {
					//make a deep copy
					app = EcoreUtil.copy(nature.reversedModel);
					nature.forwardModel = app;
				}
			} catch (CoreException e) {			
				e.printStackTrace();
				project = null;
				app = null;
			}
		}
	}
	
	public void dispose() {
	
	}
	
	/*
	public Object[] getElements(Object parent) {
		
		System.out.println("getElements: " + parent);
		
		if (app == null) {
			System.out.println("No reverse engineered model");
			return new Object[0];
		}
				
		EReference er = NUOPCPackage.eINSTANCE.getTop_Apps();
		String labelType = Regex.getFromAnnotation(er.getEType(), "label");		
		return new Object[] {
				new NUOPCModelElem(
						new NUOPCModelElem(null, er, label, null), //parent
						null, //eref
						app.getName(),  
						app )};  //eobject
			
	}
	*/
	
	public Object[] getElements(Object parent) {
		
		//System.out.println("getElements: " + parent);
		
		if (app == null) {
			System.out.println("No reverse engineered model");
			return new Object[0];
		}
				
				
		EReference er = NUOPCPackage.eINSTANCE.getTop_Apps();
		String labelType = Regex.getFromAnnotation(app.eClass(), "label");		
		return new Object[] {new NUOPCModelElem(null, er, app.getName(), labelType, app)};  
			
	}
	
	public Object getParent(Object child) {
		System.out.println("getParent: " + child);
		return null;
	}
	
	public Object [] getChildren(Object p) {
		//System.out.println("getChildren: " + p);
		if (p instanceof NUOPCModelElem) {
			NUOPCModelElem parent = (NUOPCModelElem) p;
			//EReference er = parent.eref;
						
			List<NUOPCModelElem> children = new ArrayList<NUOPCModelElem>();
			
			if (parent.elem != null) {
				EObject eo = parent.elem;
				EClass ec = eo.eClass();
				
									
				for (EAttribute eattrib : ec.getEAttributes()) {
					
					System.out.println("EAttrib: " + ec.getName() + "." + eattrib.getName());
					
					String typeLabel;
					typeLabel = Regex.getFromAnnotation(eattrib, "label");
					if (typeLabel == null) {
						typeLabel = eattrib.getName();
					}
					
					String nameLabel = "(none)";
					
					Object val = eo.eGet(eattrib);
					if (val instanceof EList) {
						Object first = ((EList) val).get(0);
						nameLabel = first.toString();
					}
					else if (eattrib.getEType().getName().equals("EString")) {
						nameLabel = (String) val;
					}
					else if (eattrib.getEType().getName().equals("EBoolean")) {
						nameLabel = Boolean.toString((Boolean) val);
					}
					
					
					
					children.add(new NUOPCModelElem(parent, eattrib, nameLabel, typeLabel));
				}
				
				
				for (EReference eref : ec.getEReferences()) {
					if (eref.isContainment()) {
						
						String typeLabel, taskLabel;
						typeLabel = Regex.getFromAnnotation(eref.getEType(), "label");
						taskLabel = Regex.getFromAnnotation(eref.getEType(), "task");
						if (typeLabel == null) {
							typeLabel = eref.getEType().getName();
						}
						
						if (eref.isMany()) {							
							EList<EObject> instances = (EList<EObject>) eo.eGet(eref);
							if (instances.size() > 0) {
								for (EObject o : instances) {
									String nameLabel = EcoreUtils.eGetSFValue("name", o, "UKNOWN");
									children.add(new NUOPCModelElem(parent, eref, nameLabel, typeLabel, o));
								}
							}
							/*
							else {
								children.add(new NUOPCModelElem(parent, eref, null, typeLabel, null));
							}
							*/
							
						}
						else {
							EObject o = (EObject) eo.eGet(eref);
							if (o != null) {
								String nameLabel = EcoreUtils.eGetSFValue("name", o, "UKNOWN");
								children.add(new NUOPCModelElem(parent, eref, nameLabel, typeLabel, o));
							}
							else {
								children.add(new NUOPCModelElem(parent, eref, null, taskLabel, null));
							}
						}
												
					}
				}
			}
			else {
				//no elem eobject
				EClass ec = (EClass) parent.eref.getEType();
				for (EReference eref : ec.getEReferences()) {
					
					String typeLabel;
					typeLabel = Regex.getFromAnnotation(eref.getEType(), "task");
					if (typeLabel == null) {
						typeLabel = eref.getEType().getName();
					}
					
					if (eref.isContainment()) {
						children.add(new NUOPCModelElem(parent, eref, null, typeLabel, null));
					}
					
				}
				
				
			}
			
						
			return children.toArray();
		}
		return new Object[0];
	}
	
	/*
	public Object [] getChildren2(Object p) {
		System.out.println("getChildren: " + p);
		if (p instanceof NUOPCModelElem) {
			NUOPCModelElem parent = (NUOPCModelElem) p;
			EReference er = parent.eref;
			EObject eo = parent.elem;
			
			List<NUOPCModelElem> children = new ArrayList<NUOPCModelElem>();
			
			if (er != null) {				
				//instances are children
				if (er.isMany()) {
					EList<EObject> instances = (EList<EObject>) parent.parent.elem.eGet(er);
					for (EObject o : instances) {
						String label = EcoreUtils.eGetSFValue("name", o, "UKNOWN");
						children.add(new NUOPCModelElem(parent, null, label, o));
					}
				}
				else {
					EObject o = (EObject) parent.parent.elem.eGet(er);
					String label = EcoreUtils.eGetSFValue("name", o, "UKNOWN");
					children.add(new NUOPCModelElem(parent, null, label, o));
				}
			}
			else if (eo != null) {
				//metamodel refs are children
				EClass eclass = eo.eClass();
				for (EReference eref : eclass.getEReferences()) {
					if (eref.isContainment()) {
						String label;
						if (eref.isMany()) {
							label = Regex.getFromAnnotation(eref.getEType(), "labelPlural");
						}
						else {
							label = Regex.getFromAnnotation(eref.getEType(), "label");
						}
						if (label == null) {
							label = eref.getEType().getName();
						}
						children.add(new NUOPCModelElem(parent, eref, label, null));
					}
				}
				//return refs.toArray();
			}			
			return children.toArray();
		}
		return new Object[0];
	}
	*/
	
	/*
	public boolean hasChildren(Object p) {
		System.out.println("hasChildren: " + p);
		if (p instanceof NUOPCModelElem) {
			NUOPCModelElem parent = (NUOPCModelElem) p;
			if (parent.eref != null) {
				if (parent.eref.isMany()) {
					EList<EObject> instances = (EList<EObject>) parent.parent.elem.eGet(parent.eref);
					return instances.size() > 0;
				}
				else {
					EObject o = (EObject) parent.parent.elem.eGet(parent.eref);
					//String label = EcoreUtils.eGetSFValue("name", o, "UKNOWN");
					return o != null;
				}
			}
			else if (parent.elem != null) {
				return parent.elem.eClass().getEReferences().size() > 0;
			}
		}
		return false;
	}
	*/
	
	public boolean hasChildren(Object p) {
		//System.out.println("hasChildren: " + p);
		if (p instanceof NUOPCModelElem) {
			NUOPCModelElem parent = (NUOPCModelElem) p;
			if (parent.elem != null) {
				return parent.elem.eClass().getEReferences().size() > 0;
			}
			else if (parent.eref != null) {
				//TODO: check for isMany
				return ((EClass) parent.eref.getEType()).getEReferences().size() > 0;
			}
		}
		return false;
	}
	
	public class NUOPCModelElem {
		public NUOPCModelElem parent;
		public EReference eref;
		public EAttribute eattrib;
		public String nameLabel;
		public String typeLabel;
		public EObject elem;
		//public int min;
		//public int max;
		
		public NUOPCModelElem(NUOPCModelElem parent, EAttribute eattrib, String nameLabel, String typeLabel) {
			this.parent = parent;
			this.eattrib = eattrib;
			this.nameLabel = nameLabel;
			this.typeLabel = typeLabel;			
		}
		
		public NUOPCModelElem(NUOPCModelElem parent, EReference eref, String nameLabel, String typeLabel, EObject elem) {
			this.parent = parent;
			this.eref = eref;
			this.nameLabel = nameLabel;
			this.typeLabel = typeLabel;
			this.elem = elem;
			//this.min = min;
			//this.max = max;
		}
	}
	
}