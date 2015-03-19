package negocio.diagram.preferences;

import negocio.diagram.part.NegocioDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(NegocioDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
