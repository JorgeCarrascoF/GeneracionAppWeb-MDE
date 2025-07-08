/*
* 
*/
package DataWeb.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class AplicacionItemSemanticEditPolicy extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AplicacionItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.Aplicacion_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaIndiceDetalleCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaIndiceExtendidoCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaCreacionCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaDetalleCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaActualizacionCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaBorradoCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaIndiceCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaCRUDUnicaCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaInicioCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEncuestaCuestionarioCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaResultadosCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.EntidadCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.Rol_2013 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.RolCreateCommand(req));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.EnlaceRRSSCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
