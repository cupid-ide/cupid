package org.earthsystemmodeling.cupid.views;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.util.Regex;
import org.earthsystemmodeling.psyche.ConceptDef;
import org.earthsystemmodeling.psyche.SubconceptOrAttribute;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ocl.examples.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.Term;

class NUOPCViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	
	static {
		//necessary for custom validation messages
		EValidator.Registry.INSTANCE.put(null, new OCLinEcoreEObjectValidator());
		//EValidator.Registry.INSTANCE.put(NUOPCPackage.eINSTANCE, NUOPCValidator.INSTANCE);
	}
	
	
	private FSM<?> fsm;
	private IFile input;
	private CodeDBIndex codeDB = CodeDBIndex.getInstance();
	
	public NUOPCViewContentProvider() {
		
		codeDB.openConnection();
		codeDB.rebuildDatabase();
		codeDB.clearTheory();
		try {
			codeDB.addTheory("nuopc_model(_mid, _name, _uid) :- module(_mid, _name), uses(_uid, _mid, 'NUOPC_Model').");
		} catch (InvalidTheoryException e) {
			CupidActivator.log("Invalid theory", e);
		}
	}
	
	public FSM<?> getCurrentFSM() {
		return fsm;
	}
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		fsm = null;		
		if (newInput != null) {
			input = (IFile) newInput;
			
			//test CodeDB approach
			long startRebuild = System.currentTimeMillis();
			codeDB.truncateDatabase();
			long endRebuild = System.currentTimeMillis();
			
			String filename = PhotranVPG.getFilenameForIFile(input);
			long startParse = System.currentTimeMillis();
			IFortranAST ast = PhotranVPG.getInstance().parse(filename);
			long endParse = System.currentTimeMillis();
			
			long startIndex = System.currentTimeMillis();
			codeDB.indexAST(ast);
			long endIndex = System.currentTimeMillis();
			
			CupidActivator.log(IStatus.INFO, "Rebuild DB time: " + (endRebuild-startRebuild));
			CupidActivator.log(IStatus.INFO, "Parse time: " + (endParse-startParse));
			CupidActivator.log(IStatus.INFO, "Index DB time: " + (endIndex-startIndex));
			
			//attempt a query
			try {
				List<Term> results = codeDB.query("nuopc_model(_id, _name, _uid).");
				for (Term t : results) {
					System.out.println("Result: " + t);
				}
			} catch (MalformedGoalException e) {
				e.printStackTrace();
			}
		}
	}
		
	public void dispose() {
	
	}
	
	public Object[] getElements(Object parent) {
		
		//TODO: do this in another thread???
		//fsm = ReverseEngineer.reverseEngineer(input);
		if (fsm == null) {
			CupidActivator.log("No reverse engineered model to display");
			return new Object[0];
		}
		
		//Top top = NUOPCFactory.eINSTANCE.createTop();
		EObject root = fsm.getRoot();
		//top.setApps(app);
		
		//EReference er = NUOPCPackage.eINSTANCE.getTop_Apps();
		//String typeLabel = Regex.getFromAnnotation(root.eClass(), "label");	
		String typeLabel = fsm.getAnnotationValue(root, "label");
		if (typeLabel==null) {
			typeLabel = fsm.getConceptDef(root).getName();
		}
		// mapping = fsm.getConceptDefForElement(root.eClass()).getMapping();
		
		//return new Object[] {new NUOPCModelElem(new NUOPCModelElem(null, null, null, null, top),
		//										er, app.getName(), labelType, app)};  
		return new Object[] {new NUOPCModelElem(null, null, typeLabel, root, null)};
			
	}
	
	public Object getParent(Object child) {
		//System.out.println("getParent: " + child);
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
				ConceptDef conceptDef = fsm.getConceptDef(eo);
				//EClass ec = eo.eClass();
				
									
				for (SubconceptOrAttribute soa : conceptDef.getChild()) {
					
					//first pass just deal with attributes
					if (soa.isAttrib()) {
					
						if (fsm.hasAnnotation(soa, "hide")) {
							continue;
						}
																		
						String typeLabel;
						typeLabel = fsm.getAnnotationValue(soa, "label");
						if (typeLabel == null) {
							typeLabel = soa.getName();
						}
						
						String nameLabel = "(none)";
						
						Object val = eo.eGet(eo.eClass().getEStructuralFeature(soa.getName()));
						if (val instanceof EList) {
							Object first = ((EList) val).get(0);
							nameLabel = first.toString();
						}
						else if (val != null) {
							nameLabel = val.toString();
						}
						//else if (eattrib.getEType().getName().equals("EString")) {
						//	nameLabel = (String) val;
						//}
						//else if (eattrib.getEType().getName().equals("EBoolean")) {
						//	nameLabel = Boolean.toString((Boolean) val);
						//}
					
						//Mapping mapping = fsm.getSubconceptForElement(modelElemClass)
						
						children.add(new NUOPCModelElem(parent, nameLabel, typeLabel, null, soa));
					}
				}
				
				
				for (SubconceptOrAttribute soa : conceptDef.getChild()) {
					
					if (!soa.isAttrib()) {
						
						if (fsm.hasAnnotation(fsm.getDefinition(soa), "hide")) {
							continue;
						}
						
						ConceptDef subConceptDef;
						if (soa.isReference()) {
							subConceptDef = soa.getRef();
						}
						else {
							subConceptDef = soa.getDef();
						}
					
					
						String typeLabel;
						typeLabel = fsm.getAnnotationValue(subConceptDef, "label");
						//taskLabel = Regex.getFromAnnotation(eref.getEType(), "task");
						if (typeLabel == null) {
							typeLabel = soa.getName();
						}
						
						//Subconcept sc = fsm.getSubconceptForElement((EClass) eref.getEType());
						
						if (soa.getCardinality()!= null && (soa.getCardinality().isOneOrMore() || soa.getCardinality().isZeroOrMore())) {							
							@SuppressWarnings("unchecked")
							EList<EObject> instances = (EList<EObject>) eo.eGet(eo.eClass().getEStructuralFeature(soa.getName()));
							if (instances.size() > 0) {
								for (EObject o : instances) {
									EStructuralFeature sf = fsm.getNameEAttribute(subConceptDef);
									String nameLabel = null;
									if (sf != null) {
										nameLabel = (String) o.eGet(sf);
									}
									NUOPCModelElem newElem = new NUOPCModelElem(parent, nameLabel, typeLabel, o, soa);
									children.add(newElem);
								}
							}
							/*
							else {
								children.add(new NUOPCModelElem(parent, eref, null, typeLabel, null));
							}
							*/
							
						}
						else {
							EObject o = (EObject) eo.eGet(eo.eClass().getEStructuralFeature(soa.getName()));
							if (o != null) {
								String nameLabel = null;
								EStructuralFeature sfName = fsm.getNameEAttribute(subConceptDef);
								if (sfName != null) {
									nameLabel = (String) o.eGet(sfName);
								}
								children.add(new NUOPCModelElem(parent, nameLabel, typeLabel, o, soa));
							}
							else {
								children.add(new NUOPCModelElem(parent, null, typeLabel, null, soa));
							}
						}
												
					}
				}
			}
			else { //if (parent.structuralFeature instanceof EReference){
				
				//no elem eobject
				//EClass ec = (EClass) parent.structuralFeature.getEType();
				ConceptDef conceptDef;
				if (parent.subconcept.isReference()) {
					conceptDef = parent.subconcept.getRef();
				}
				else {
					conceptDef = parent.subconcept.getDef();
				}
				
				
				for (SubconceptOrAttribute soa : conceptDef.getChild()) {
					
					String typeLabel;
					typeLabel = fsm.getAnnotationValue(soa, "label");
					if (typeLabel == null) {
						typeLabel = soa.getName();
					}
					
					children.add(new NUOPCModelElem(parent, null, typeLabel, null, soa));
				}
				
			}
						
			return children.toArray();
		}
		return new Object[0];
	}
		
	
	
	
	public boolean hasChildren(Object p) {
		//System.out.println("hasChildren: " + p);
		if (p instanceof NUOPCModelElem) {
			NUOPCModelElem parent = (NUOPCModelElem) p;
			if (parent.elem != null) {
				if (parent.elem.eClass().getName().equals("NUOPCApplication__DriverAtmOcn")) {
					System.out.println("");
				}
				ConceptDef conceptDef = fsm.getConceptDef(parent.elem);
				
				return conceptDef.getChild() != null && conceptDef.getChild().size() > 0; //parent.elem.eClass().getEStructuralFeatures().size() > 0;
			}
			else if (!parent.subconcept.isAttrib()) { //(parent.structuralFeature instanceof EReference) {
				ConceptDef conceptDef;
				if (parent.subconcept.isReference()) {
					conceptDef = parent.subconcept.getRef();
				}
				else {
					conceptDef = parent.subconcept.getDef();
				}
				return conceptDef.getChild().size() > 0;
			}
		}
		return false;
	}
	
	public class NUOPCModelElem {
		public NUOPCModelElem parent;
		//public EReference eref;
		//public EAttribute eattrib;
		//public EStructuralFeature structuralFeature;
		public String nameLabel;
		public String typeLabel;
		public EObject elem;
		public String validationMessage;
		public SubconceptOrAttribute subconcept;
		//public int min;
		//public int max;
		
		
		
		public NUOPCModelElem(NUOPCModelElem parent, String nameLabel, String typeLabel, EObject elem, SubconceptOrAttribute subconcept) {
			this.parent = parent;
			//this.structuralFeature = esf;
			this.nameLabel = nameLabel;
			this.typeLabel = typeLabel;
			this.elem = elem;
			this.subconcept = subconcept;
			doValidationMessage();
			//this.min = min;
			//this.max = max;
		}
		
		private void doValidationMessage() {
			//TODO: probably don't want to re-validate the entire tree each time
			if (elem != null) {
				
				//EValidator.Registry r = EValidator.Registry.INSTANCE;
				
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(elem);
								
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					if (diagnostic.getChildren().size() > 0) {
						validationMessage = "";
						for (Diagnostic d : diagnostic.getChildren()) {
							if (validationMessage.length() > 0) {
								validationMessage += "\n<br/>";
							}
							validationMessage += getValidationMessage(d);
						}						
					}
					else {
						validationMessage = getValidationMessage(diagnostic);
					}
					
				}
			}			
		}
		
		private String getValidationMessage(Diagnostic d) {
			
			if (d.getSource().equals(EObjectValidator.DIAGNOSTIC_SOURCE) && d.getCode() == EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS) {
				if (d.getData().size() >= 2) {
					Object o = d.getData().get(1);
					String label = null;
					if (o instanceof EReference) {
						label = Regex.getFromAnnotation(((EReference) o).getEType(), "label", ((EReference) o).getEType().getName());
					}
					else if (o instanceof EAttribute) {
						label = Regex.getFromAnnotation((EAttribute) o, "label", ((EAttribute) o).getName());
					}
					
					if (label != null) {
						return "Error: " + label + " missing";
					}
					
				}
			}
			
			//return "Error: " + d.getMessage();
			return "";
		}
		
	}
	
}