package org.earthsystemmodeling.cupid.nuopc 
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.IASTNode

public class BasicCodeConcept <A extends IASTNode> extends CodeConcept<CodeConcept<?,?>, A> {
	
	new(CodeConcept<?,?> parent, A astRef) {
		super(parent)
		_astRef = astRef
	}
	
	new(CodeConcept<?,?> parent) {
		super(parent)
	}
	
	override reverse() {
		this
	}

}