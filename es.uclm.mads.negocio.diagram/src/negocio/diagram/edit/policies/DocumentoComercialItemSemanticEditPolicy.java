package negocio.diagram.edit.policies;

import java.util.Iterator;

import negocio.diagram.edit.commands.DocumentoComercialPersonasCreateCommand;
import negocio.diagram.edit.commands.DocumentoComercialPersonasReorientCommand;
import negocio.diagram.edit.commands.DocumentoComercialProductoCreateCommand;
import negocio.diagram.edit.commands.DocumentoComercialProductoReorientCommand;
import negocio.diagram.edit.commands.PagoCreateCommand;
import negocio.diagram.edit.commands.PagoReorientCommand;
import negocio.diagram.edit.commands.ValorIndirectoJustificanteCreateCommand;
import negocio.diagram.edit.commands.ValorIndirectoJustificanteReorientCommand;
import negocio.diagram.edit.parts.AtributoCompuesto2EditPart;
import negocio.diagram.edit.parts.AtributoSimple3EditPart;
import negocio.diagram.edit.parts.DocumentoComercialDocumentoComercialAtributoCompartmentEditPart;
import negocio.diagram.edit.parts.DocumentoComercialPersonasEditPart;
import negocio.diagram.edit.parts.DocumentoComercialProductoEditPart;
import negocio.diagram.edit.parts.PagoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoJustificanteEditPart;
import negocio.diagram.part.NegocioVisualIDRegistry;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DocumentoComercialItemSemanticEditPolicy extends
		NegocioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DocumentoComercialItemSemanticEditPolicy() {
		super(NegocioElementTypes.DocumentoComercial_2007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (NegocioVisualIDRegistry.getVisualID(incomingLink) == ValorIndirectoJustificanteEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (NegocioVisualIDRegistry.getVisualID(outgoingLink) == DocumentoComercialProductoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (NegocioVisualIDRegistry.getVisualID(outgoingLink) == DocumentoComercialPersonasEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (NegocioVisualIDRegistry.getVisualID(outgoingLink) == PagoEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (NegocioVisualIDRegistry.getVisualID(node)) {
			case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (NegocioVisualIDRegistry.getVisualID(cnode)) {
					case AtributoCompuesto2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case AtributoSimple3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (NegocioElementTypes.DocumentoComercialProducto_4001 == req
				.getElementType()) {
			return getGEFWrapper(new DocumentoComercialProductoCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (NegocioElementTypes.ValorIndirectoJustificante_4002 == req
				.getElementType()) {
			return null;
		}
		if (NegocioElementTypes.DocumentoComercialPersonas_4003 == req
				.getElementType()) {
			return getGEFWrapper(new DocumentoComercialPersonasCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (NegocioElementTypes.Pago_4004 == req.getElementType()) {
			return getGEFWrapper(new PagoCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (NegocioElementTypes.DocumentoComercialProducto_4001 == req
				.getElementType()) {
			return null;
		}
		if (NegocioElementTypes.ValorIndirectoJustificante_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ValorIndirectoJustificanteCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (NegocioElementTypes.DocumentoComercialPersonas_4003 == req
				.getElementType()) {
			return null;
		}
		if (NegocioElementTypes.Pago_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case PagoEditPart.VISUAL_ID:
			return getGEFWrapper(new PagoReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DocumentoComercialProductoEditPart.VISUAL_ID:
			return getGEFWrapper(new DocumentoComercialProductoReorientCommand(
					req));
		case ValorIndirectoJustificanteEditPart.VISUAL_ID:
			return getGEFWrapper(new ValorIndirectoJustificanteReorientCommand(
					req));
		case DocumentoComercialPersonasEditPart.VISUAL_ID:
			return getGEFWrapper(new DocumentoComercialPersonasReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
