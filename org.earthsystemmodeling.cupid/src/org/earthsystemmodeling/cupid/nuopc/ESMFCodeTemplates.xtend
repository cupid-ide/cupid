package org.earthsystemmodeling.cupid.nuopc

class ESMFCodeTemplates {
	
	def static ESMFErrorCheck(String rcToCheck) {
'''	
	if (ESMF_LogFoundError(rcToCheck=«rcToCheck», msg=ESMF_LOGERR_PASSTHRU, &
		line=__LINE__, &
		file=__FILE__)) &
		return  ! bail out
'''
	}	
	
	
}