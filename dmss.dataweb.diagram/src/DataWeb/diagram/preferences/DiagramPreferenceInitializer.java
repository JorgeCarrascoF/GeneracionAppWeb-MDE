/*
 * 
 */
package DataWeb.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		DataWeb.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		DataWeb.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		DataWeb.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		DataWeb.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		DataWeb.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
