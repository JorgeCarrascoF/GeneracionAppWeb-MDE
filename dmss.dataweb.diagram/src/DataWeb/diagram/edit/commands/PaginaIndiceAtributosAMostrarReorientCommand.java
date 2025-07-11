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
public class PaginaIndiceAtributosAMostrarReorientCommand extends EditElementCommand {

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
	public PaginaIndiceAtributosAMostrarReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWeb.PaginaIndice) {
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
		if (!(oldEnd instanceof DataWeb.Atributo && newEnd instanceof DataWeb.PaginaIndice)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaIndiceAtributosAMostrar_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWeb.Atributo && newEnd instanceof DataWeb.Atributo)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaIndiceAtributosAMostrar_4005(getOldSource(), getNewTarget());
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
		getOldSource().getAtributosAMostrar().remove(getOldTarget());
		getNewSource().getAtributosAMostrar().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAtributosAMostrar().remove(getOldTarget());
		getOldSource().getAtributosAMostrar().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaIndice getOldSource() {
		return (DataWeb.PaginaIndice) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaIndice getNewSource() {
		return (DataWeb.PaginaIndice) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.Atributo getOldTarget() {
		return (DataWeb.Atributo) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.Atributo getNewTarget() {
		return (DataWeb.Atributo) newEnd;
	}
}
