/*
 * generated by Xtext
 */
package org.earthsystemcurator.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCupidLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.earthsystemcurator.cupidLanguage.CupidLanguagePackage.eINSTANCE);
		return result;
	}
}
