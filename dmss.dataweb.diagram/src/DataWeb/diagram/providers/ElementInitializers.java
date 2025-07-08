/*
 * 
 */
package DataWeb.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
