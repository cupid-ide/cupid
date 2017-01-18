package org.earthsystemmodeling.cupid.cc

abstract class CCIEdit {
	
	protected CodeConceptInstance applyTo
	
	new(CodeConceptInstance applyTo) {
		this.applyTo = applyTo
	}
	
	abstract def void apply()
	
}