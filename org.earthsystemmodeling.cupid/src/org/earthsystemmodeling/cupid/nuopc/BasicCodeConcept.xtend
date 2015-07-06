package org.earthsystemmodeling.cupid.nuopc 
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.IASTNode

public class BasicCodeConcept extends CodeConcept<CodeConcept<?,?>, IASTNode> {
	
	new(CodeConcept<?,?> parent, long id) {
		super(parent)
		_id = id
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
}