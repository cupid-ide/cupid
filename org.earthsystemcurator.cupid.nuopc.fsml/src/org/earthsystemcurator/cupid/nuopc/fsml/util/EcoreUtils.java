package org.earthsystemcurator.cupid.nuopc.fsml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EcoreUtils {

	@SuppressWarnings("unchecked")
	public static <T> T eGetSFValue(String pathExpr, EObject modelElem, T defaultVal) {
		
		if (pathExpr.startsWith("#")) pathExpr = pathExpr.substring(1);
		
		EObject elemToCheck = modelElem;
		//int parents = 0;
		while (pathExpr.startsWith("../")) {
			//parents++;
			pathExpr = pathExpr.substring(3);
			elemToCheck = elemToCheck.eContainer();
		}
		
		EStructuralFeature attribSF = elemToCheck.eClass().getEStructuralFeature(pathExpr);
		if (attribSF != null) {			
			return (T) elemToCheck.eGet(attribSF);
		}
		else {
			//throw new RuntimeException("Structural feature not found: " + attribName);
			return defaultVal;
		}
	}
		

}
