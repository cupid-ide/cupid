package org.earthsystemmodeling.cupid.cc

class CCIAddChildOfType extends CCIEdit {
	
	CodeConcept typeToAdd
	
	new(CodeConceptInstance applyTo, CodeConcept typeToAdd) {
		super(applyTo)
		this.typeToAdd = typeToAdd
	}
	
	override apply() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}