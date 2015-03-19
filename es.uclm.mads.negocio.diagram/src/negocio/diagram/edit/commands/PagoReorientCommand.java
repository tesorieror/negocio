package negocio.diagram.edit.commands;

import negocio.DocumentoComercial;
import negocio.Negocio;
import negocio.Pago;
import negocio.Valor;
import negocio.diagram.edit.policies.NegocioBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class PagoReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public PagoReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Pago) {
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
		if (!(oldEnd instanceof DocumentoComercial && newEnd instanceof DocumentoComercial)) {
			return false;
		}
		Valor target = getLink().getValor();
		if (!(getLink().eContainer() instanceof Negocio)) {
			return false;
		}
		Negocio container = (Negocio) getLink().eContainer();
		return NegocioBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistPago_4004(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Valor && newEnd instanceof Valor)) {
			return false;
		}
		DocumentoComercial source = getLink().getDocumento();
		if (!(getLink().eContainer() instanceof Negocio)) {
			return false;
		}
		Negocio container = (Negocio) getLink().eContainer();
		return NegocioBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistPago_4004(container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
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
		getLink().setDocumento(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setValor(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Pago getLink() {
		return (Pago) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DocumentoComercial getOldSource() {
		return (DocumentoComercial) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DocumentoComercial getNewSource() {
		return (DocumentoComercial) newEnd;
	}

	/**
	 * @generated
	 */
	protected Valor getOldTarget() {
		return (Valor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Valor getNewTarget() {
		return (Valor) newEnd;
	}
}
