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
public class PaginaEnlacesPaginasReorientCommand extends EditElementCommand {

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
	public PaginaEnlacesPaginasReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWeb.Pagina) {
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
		if (!(oldEnd instanceof DataWeb.Pagina && newEnd instanceof DataWeb.Pagina)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaEnlacesPaginas_4009(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWeb.Pagina && newEnd instanceof DataWeb.Pagina)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaEnlacesPaginas_4009(getOldSource(), getNewTarget());
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
		getOldSource().getEnlacesPaginas().remove(getOldTarget());
		getNewSource().getEnlacesPaginas().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getEnlacesPaginas().remove(getOldTarget());
		getOldSource().getEnlacesPaginas().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWeb.Pagina getOldSource() {
		return (DataWeb.Pagina) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWeb.Pagina getNewSource() {
		return (DataWeb.Pagina) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.Pagina getOldTarget() {
		return (DataWeb.Pagina) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.Pagina getNewTarget() {
		return (DataWeb.Pagina) newEnd;
	}
}
