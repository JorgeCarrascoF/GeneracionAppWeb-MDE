/*
* 
*/
package DataWeb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EntidadEntidadAtributosCompartmentItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadEntidadAtributosCompartmentItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.AtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
