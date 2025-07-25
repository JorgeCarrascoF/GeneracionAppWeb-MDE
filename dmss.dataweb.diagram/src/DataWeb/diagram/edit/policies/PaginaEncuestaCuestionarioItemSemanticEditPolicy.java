/*
* 
*/
package DataWeb.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PaginaEncuestaCuestionarioItemSemanticEditPolicy
		extends DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaEncuestaCuestionarioItemSemanticEditPolicy() {
		super(DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010);
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
			if (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(
					incomingLink) == DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID) {
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
			if (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(
					outgoingLink) == DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(node)) {
			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(cnode)) {
					case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010 == req
				.getElementType()) {
			return getGEFWrapper(
					new DataWeb.diagram.edit.commands.PaginaEncuestaCuestionarioPaginaresultadosCreateCommand(req,
							req.getSource(), req.getTarget()));
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
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
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010 == req
				.getElementType()) {
			return null;
		}
		if (DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006 == req
				.getElementType()) {
			return getGEFWrapper(
					new DataWeb.diagram.edit.commands.PaginaResultadosPaginaencuestacuestionarioCreateCommand(req,
							req.getSource(), req.getTarget()));
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
		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacerrssReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.PaginaEnlacesPaginasReorientCommand(req));
		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWeb.diagram.edit.commands.RolPaginasAccesiblesReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID:
			return getGEFWrapper(
					new DataWeb.diagram.edit.commands.PaginaEncuestaCuestionarioPaginaresultadosReorientCommand(req));
		case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID:
			return getGEFWrapper(
					new DataWeb.diagram.edit.commands.PaginaResultadosPaginaencuestacuestionarioReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
