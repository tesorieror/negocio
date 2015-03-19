package negocio.diagram.edit.policies;

import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class PagoItemSemanticEditPolicy extends
		NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PagoItemSemanticEditPolicy() {
		super(NegocioElementTypes.Pago_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
