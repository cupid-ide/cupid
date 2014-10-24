package org.earthsystemmodeling.cupid.preferences;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = CupidActivator.getDefault().getPreferenceStore();
		store.setDefault(CupidPreferencePage.CUPID_AWS_ACCESS_KEY, "");
		store.setDefault(CupidPreferencePage.CUPID_AWS_SECRET_KEY, "");
		store.setDefault(CupidPreferencePage.CUPID_LANGUAGE_URI, "platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/nuopc7.psyche");
		store.setDefault(CupidPreferencePage.CUPID_LANGUAGE_RELOAD, false);
	}

}
