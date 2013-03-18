package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTNode;

@SuppressWarnings("restriction")
public abstract class Mapping<ModelType extends EObject, ASTNodeType extends ASTNode> {

	protected ModelType modelElem;
	protected ASTNodeType astElem;
	protected IFortranAST ast;
	
	protected Mapping(ModelType m, ASTNodeType a, IFortranAST ast) {
		modelElem = m;
		astElem = a;
		this.ast = ast;
	}

	public abstract ModelType reverse();
	public abstract ASTNodeType forward();
	
}
