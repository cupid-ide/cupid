package org.earthsystemcurator.cupid.nuopc.fsml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EcoreUtils {

	@SuppressWarnings("unchecked")
	public static <T> T eGetSFValue(String pathExpr, EObject modelElem, T defaultVal) {
		
		if (pathExpr.startsWith("#")) pathExpr = pathExpr.substring(1);
		
		EObject elemToCheck = modelElem;
		
		while (pathExpr.contains("/")) {
			
			String pathSegment = pathExpr.substring(0, pathExpr.indexOf("/"));
						
			if (pathSegment.equals("..")) {
				elemToCheck = elemToCheck.eContainer();
			}
			else {
				//the segment is a structural feature name
				EStructuralFeature segmentSF = elemToCheck.eClass().getEStructuralFeature(pathSegment);
				elemToCheck = (EObject) elemToCheck.eGet(segmentSF);				
			}
			pathExpr = pathExpr.substring(pathSegment.length()+1);
			
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
