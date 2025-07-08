/*
* 
*/
package DataWeb.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PaginaDetalleItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaDetalleItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(incomingLink) == DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(incomingLink) == DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(incomingLink) == DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(outgoingLink) == DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(outgoingLink) == DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DataWeb.diagram.part.DataWebVisualIDRegistry
					.getVisualID(outgoingLink) == DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001 == req.getElementType()) {
			return null;
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacerrssCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacesPaginasCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004 == req.getElementType()) {
			return null;
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaDeEntidadEntidadCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.EntidadPaginasCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003 == req.getElementType()) {
			return null;
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacesPaginasCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004 == req.getElementType()) {
			return getGEFWrapper(new DataWeb.diagram.edit.commands.RolPaginasAccesiblesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.EntidadPaginasReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacerrssReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacesPaginasReorientCommand(req));
		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.RolPaginasAccesiblesReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaDeEntidadEntidadReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
