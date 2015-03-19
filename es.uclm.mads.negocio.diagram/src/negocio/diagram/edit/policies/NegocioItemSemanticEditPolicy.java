package negocio.diagram.edit.policies;

import negocio.diagram.edit.commands.AtributoCompuestoCreateCommand;
import negocio.diagram.edit.commands.AtributoSimpleCreateCommand;
import negocio.diagram.edit.commands.DocumentoComercialCreateCommand;
import negocio.diagram.edit.commands.PersonaCreateCommand;
import negocio.diagram.edit.commands.ProductoCreateCommand;
import negocio.diagram.edit.commands.ServicioCreateCommand;
import negocio.diagram.edit.commands.ValorDirectoCreateCommand;
import negocio.diagram.edit.commands.ValorIndirectoCreateCommand;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class NegocioItemSemanticEditPolicy extends
		NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NegocioItemSemanticEditPolicy() {
		super(NegocioElementTypes.Negocio_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NegocioElementTypes.AtributoSimple_2001 == req.getElementType()) {
			return getGEFWrapper(new AtributoSimpleCreateCommand(req));
		}
		if (NegocioElementTypes.Persona_2002 == req.getElementType()) {
			return getGEFWrapper(new PersonaCreateCommand(req));
		}
		if (NegocioElementTypes.AtributoCompuesto_2003 == req.getElementType()) {
			return getGEFWrapper(new AtributoCompuestoCreateCommand(req));
		}
		if (NegocioElementTypes.ValorDirecto_2004 == req.getElementType()) {
			return getGEFWrapper(new ValorDirectoCreateCommand(req));
		}
		if (NegocioElementTypes.Servicio_2005 == req.getElementType()) {
			return getGEFWrapper(new ServicioCreateCommand(req));
		}
		if (NegocioElementTypes.Producto_2006 == req.getElementType()) {
			return getGEFWrapper(new ProductoCreateCommand(req));
		}
		if (NegocioElementTypes.DocumentoComercial_2007 == req.getElementType()) {
			return getGEFWrapper(new DocumentoComercialCreateCommand(req));
		}
		if (NegocioElementTypes.ValorIndirecto_2008 == req.getElementType()) {
			return getGEFWrapper(new ValorIndirectoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
