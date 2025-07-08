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
public class PaginaResultadosPaginaencuestacuestionarioReorientCommand extends EditElementCommand {

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
	public PaginaResultadosPaginaencuestacuestionarioReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWeb.PaginaResultados) {
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
		if (!(oldEnd instanceof DataWeb.PaginaEncuestaCuestionario && newEnd instanceof DataWeb.PaginaResultados)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaResultadosPaginaencuestacuestionario_4006(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWeb.PaginaEncuestaCuestionario
				&& newEnd instanceof DataWeb.PaginaEncuestaCuestionario)) {
			return false;
		}
		return DataWeb.diagram.edit.policies.DataWebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaResultadosPaginaencuestacuestionario_4006(getOldSource(), getNewTarget());
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
		getOldSource().setPaginaencuestacuestionario(null);
		getNewSource().setPaginaencuestacuestionario(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setPaginaencuestacuestionario(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaResultados getOldSource() {
		return (DataWeb.PaginaResultados) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaResultados getNewSource() {
		return (DataWeb.PaginaResultados) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaEncuestaCuestionario getOldTarget() {
		return (DataWeb.PaginaEncuestaCuestionario) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWeb.PaginaEncuestaCuestionario getNewTarget() {
		return (DataWeb.PaginaEncuestaCuestionario) newEnd;
	}
}
