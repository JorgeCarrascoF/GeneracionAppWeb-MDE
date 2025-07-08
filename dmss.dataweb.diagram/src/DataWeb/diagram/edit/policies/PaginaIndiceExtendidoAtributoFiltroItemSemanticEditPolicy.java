/*
* 
*/
package DataWeb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PaginaIndiceExtendidoAtributoFiltroItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaIndiceExtendidoAtributoFiltroItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
