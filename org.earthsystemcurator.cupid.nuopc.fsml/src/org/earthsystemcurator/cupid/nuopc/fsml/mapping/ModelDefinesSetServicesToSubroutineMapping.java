package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;

@SuppressWarnings("restriction")
public class ModelDefinesSetServicesToSubroutineMapping extends Mapping<ModelDefinesSetServices, ASTModuleNode> {

	protected ModelDefinesSetServicesToSubroutineMapping(
			ModelDefinesSetServices m, ASTModuleNode a) {
		super(m, a);
	}

	@Override
	public ModelDefinesSetServices reverse() {
		
		if (modelElem == null)
			modelElem = NUOPCFactory.eINSTANCE.createModelDefinesSetServices();
		
		return modelElem;
		
	}

	@Override
	public ASTModuleNode forward() {
		
		return null;
	}
	
	

}
