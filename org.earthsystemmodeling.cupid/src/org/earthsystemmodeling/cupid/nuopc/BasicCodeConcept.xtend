package org.earthsystemmodeling.cupid.nuopc 
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.IASTNode

public class BasicCodeConcept <A extends IASTNode> extends CodeConcept<CodeConcept<?,?>, A> {
	
	new(CodeConcept<?,?> parent, long id) {
		super(parent)
		_id = id
	}
	
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
	
	override forward() {
		null
	}
	
	override toString() {
		'''BasicCodeConcept: (id=«_id»)'''
	}
	
	def static BasicCodeConcept newBasicCodeConcept(CodeConcept<?,?> parent, long id) {
		if (id > 0)
			new BasicCodeConcept(parent, id)
		else
			null
	}
	
	//def static BasicCodeConcept newBasicCodeConcept(CodeConcept<?,?> parent, IASTNode astRef) {
	//	new BasicCodeConcept(parent, astRef)
	//}
}