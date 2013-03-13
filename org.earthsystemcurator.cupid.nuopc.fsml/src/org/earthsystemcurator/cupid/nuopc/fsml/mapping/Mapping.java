package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.internal.core.parser.ASTNode;

@SuppressWarnings("restriction")
public abstract class Mapping<ModelType extends EObject, ASTNodeType extends ASTNode> {

	protected ModelType modelElem;
	protected ASTNodeType astElem;
	
	protected Mapping(ModelType m, ASTNodeType a) {
		modelElem = m;
		astElem = a;
	}

	public abstract ModelType reverse();
	public abstract ASTNodeType forward();
	
}
