package org.earthsystemmodeling.cupid.nuopc_v7 
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.IASTNode

public class BasicCodeConcept extends CodeConcept<BasicCodeConcept, CodeConcept, IASTNode> {
	
	new(CodeConcept parent, long id) {
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
	
	def static BasicCodeConcept newBasicCodeConcept(CodeConcept parent, long id) {
		if (id > 0)
			new BasicCodeConcept(parent, id)
		else
			null
	}
}