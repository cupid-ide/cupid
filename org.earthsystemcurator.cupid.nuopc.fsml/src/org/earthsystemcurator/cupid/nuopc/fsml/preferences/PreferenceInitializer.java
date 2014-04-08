package org.earthsystemcurator.cupid.nuopc.fsml.preferences;

import org.earthsystemcurator.cupid.nuopc.fsml.core.CupidActivator;
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
		store.setDefault(CupidPreferencePage.CUPID_LANGUAGE_URI, "platform:/plugin/org.earthsystemcurator.cupid.nuopc.fsml/cupidmodel/nuopc.cupid");
	}

}
