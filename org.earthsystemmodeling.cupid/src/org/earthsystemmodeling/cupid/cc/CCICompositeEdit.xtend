package org.earthsystemmodeling.cupid.cc

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

class CCICompositeEdit extends CCIEdit {
	
	@Accessors
	List<CCIEdit> edits = newLinkedList
	
	new(CodeConceptInstance applyTo) {
		super(applyTo)
	}
	
	override apply() {
		for (e : edits) {
			e.apply
		}
	}
	
}