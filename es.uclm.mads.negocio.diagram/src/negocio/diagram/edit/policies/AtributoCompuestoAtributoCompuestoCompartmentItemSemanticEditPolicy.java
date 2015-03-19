package negocio.diagram.edit.policies;

import negocio.diagram.edit.commands.AtributoCompuesto3CreateCommand;
import negocio.diagram.edit.commands.AtributoSimple2CreateCommand;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtributoCompuestoAtributoCompuestoCompartmentItemSemanticEditPolicy
		extends NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtributoCompuestoAtributoCompuestoCompartmentItemSemanticEditPolicy() {
		super(NegocioElementTypes.AtributoCompuesto_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NegocioElementTypes.AtributoSimple_3002 == req.getElementType()) {
			return getGEFWrapper(new AtributoSimple2CreateCommand(req));
		}
		if (NegocioElementTypes.AtributoCompuesto_3003 == req.getElementType()) {
			return getGEFWrapper(new AtributoCompuesto3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
