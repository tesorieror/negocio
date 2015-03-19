package negocio.diagram.edit.policies;

import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class DocumentoComercialPersonasItemSemanticEditPolicy extends
		NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DocumentoComercialPersonasItemSemanticEditPolicy() {
		super(NegocioElementTypes.DocumentoComercialPersonas_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
