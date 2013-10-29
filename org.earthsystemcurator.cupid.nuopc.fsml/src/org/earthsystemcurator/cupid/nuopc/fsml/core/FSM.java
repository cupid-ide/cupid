package org.earthsystemcurator.cupid.nuopc.fsml.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;

public class FSM<P extends EPackage> {

	private EObject root;
	
	/**
	 * Mapping from a model element to one of:
	 *  - a Set<IFortranAST> (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */	
	private Map<Object, Object> mappings;	
	
	public EObject getRoot() {
		return root;
	}
	
	public Map<Object, Object> getMappings() {
		return mappings;
	}
	
	public Object getReference(Object modelElem) {
		return mappings.get(modelElem);
	}
	
	protected FSM(EObject root) {
		this.root = root;
		this.mappings = new IdentityHashMap<Object, Object>();
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
	
	
	
}
