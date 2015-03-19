package negocio.diagram.edit.policies;

import negocio.diagram.edit.commands.AtributoCompuesto2CreateCommand;
import negocio.diagram.edit.commands.AtributoSimple3CreateCommand;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ProductoProductoAtributosCompartmentItemSemanticEditPolicy extends
		NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProductoProductoAtributosCompartmentItemSemanticEditPolicy() {
		super(NegocioElementTypes.Producto_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NegocioElementTypes.AtributoCompuesto_3001 == req.getElementType()) {
			return getGEFWrapper(new AtributoCompuesto2CreateCommand(req));
		}
		if (NegocioElementTypes.AtributoSimple_3004 == req.getElementType()) {
			return getGEFWrapper(new AtributoSimple3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
