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
public class EntidadPaginasItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadPaginasItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
