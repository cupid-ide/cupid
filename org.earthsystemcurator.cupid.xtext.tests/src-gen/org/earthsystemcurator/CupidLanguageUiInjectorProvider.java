/*
* generated by Xtext
*/
package org.earthsystemcurator;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CupidLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.earthsystemcurator.ui.internal.CupidLanguageActivator.getInstance().getInjector("org.earthsystemcurator.CupidLanguage");
	}
	
}