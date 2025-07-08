/*
* 
*/
package DataWeb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataWeb.diagram.providers.DataWebElementTypes.Pregunta_3001 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PreguntaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
