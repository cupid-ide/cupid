package org.earthsystemcurator.cupid.nuopc.fsml.util;

import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.eclipse.emf.common.util.EList;
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
		
		if (pathExpr.equals("..")) {
			return (T) elemToCheck.eContainer();
		}
		if (elemToCheck == null) {
			//throw new RuntimeException("Structural feature not found: " + pathExpr);
			return defaultVal;
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
	
	@SuppressWarnings("unchecked")
	public static <T> T eGetSFValue(PathExpr pathExpr, EObject modelElem, boolean isParent, T defaultVal) {
		
		EList<String> segments = pathExpr.getSegments();
		EObject elemToCheck = modelElem;
		int start = 0;
		if (isParent) {
			if (!segments.get(0).equals("..")) {
				//we are already at parent, so fail if first segment does not
				//navigate to the parent element
				return null;
			}
			else {
				start = 1; //skip first segment
			}
		}
		
		for (int i = start; i < segments.size()-1; i++) {									
			if (segments.get(i).equals("..")) {
				elemToCheck = elemToCheck.eContainer();
			}
			else {
				//the segment is a structural feature name
				EStructuralFeature segmentSF = elemToCheck.eClass().getEStructuralFeature(segments.get(i));
				elemToCheck = (EObject) elemToCheck.eGet(segmentSF);				
			}			
		}
		
		if (elemToCheck == null) {
			//throw new RuntimeException("Structural feature not found: " + pathExpr);
			return defaultVal;
		}
		
		EStructuralFeature attribSF = elemToCheck.eClass().getEStructuralFeature(segments.get(segments.size()-1));
		if (attribSF != null) {			
			return (T) elemToCheck.eGet(attribSF);
		}
		else {
			//throw new RuntimeException("Structural feature not found: " + attribName);
			return defaultVal;
		}
	} 
	
	public static boolean eSetSFValue(PathExpr pathExpr, EObject modelElem, String value) {
		
		EList<String> segments = pathExpr.getSegments();
		EObject elemToCheck = modelElem;
						
		for (int i = 0; i < segments.size() - 1; i++) {									
			if (segments.get(i).equals("..")) {
				elemToCheck = elemToCheck.eContainer();
			}
			else {
				//the segment is a structural feature name
				EStructuralFeature segmentSF = elemToCheck.eClass().getEStructuralFeature(segments.get(i));
				elemToCheck = (EObject) elemToCheck.eGet(segmentSF);				
			}			
		}
		
		if (elemToCheck == null) {
			return false;
		}
		
		EStructuralFeature attribSF = elemToCheck.eClass().getEStructuralFeature(segments.get(segments.size() - 1));
		if (attribSF != null) {
			//TODO: assumes the structural feature is single valued, not a list
			elemToCheck.eSet(attribSF, value);
		}
		else {
			return false;
		}
		
		return true;
	}
		

}
