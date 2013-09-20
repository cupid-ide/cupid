package org.earthsystemcurator.cupid.nuopc.fsml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EcoreUtils {

	@SuppressWarnings("unchecked")
	public static <T> T eGetSFValue(String attribName, EObject modelElem, T defaultVal) {
		//String attribName = metavar.substring(1);
		EStructuralFeature attribSF = modelElem.eClass().getEStructuralFeature(attribName);
		if (attribSF != null) {			
			return (T) modelElem.eGet(attribSF);
		}
		else {
			//throw new RuntimeException("Structural feature not found: " + attribName);
			return defaultVal;
		}
	}
		

}
