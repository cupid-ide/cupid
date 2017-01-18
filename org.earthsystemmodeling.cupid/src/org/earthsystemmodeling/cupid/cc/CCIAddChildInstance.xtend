package org.earthsystemmodeling.cupid.cc

class CCIAddChildInstance extends CCIEdit {
	
	CodeConceptInstance child
		
	new(CodeConceptInstance applyTo, CodeConceptInstance child) {
		super(applyTo)
		this.child = child
	}
	
	
	override apply() {
		applyTo.addChild(child)
		//child.forwardAdd();
	}
	
}