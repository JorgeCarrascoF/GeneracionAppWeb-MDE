/*
 * 
 */
package DataWeb.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EntidadPaginasReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public EntidadPaginasReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof DataWeb.Entidad) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof DataWeb.PaginaDeEntidad && newEnd instanceof DataWeb.Entidad)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadPaginas_4001(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWeb.PaginaDeEntidad && newEnd instanceof DataWeb.PaginaDeEntidad)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadPaginas_4001(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getPaginas().remove(getOldTarget());
		getNewSource().getPaginas().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getPaginas().remove(getOldTarget());
		getOldSource().getPaginas().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWeb.Entidad getOldSource() {
		return (DataWeb.Entidad) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWeb.Entidad getNewSource() {
		return (DataWeb.Entidad) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaDeEntidad getOldTarget() {
		return (DataWeb.PaginaDeEntidad) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaDeEntidad getNewTarget() {
		return (DataWeb.PaginaDeEntidad) newEnd;
	}
}
