package negocio.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import negocio.diagram.edit.parts.DocumentoComercialEditPart;
import negocio.diagram.edit.parts.PersonaEditPart;
import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.edit.parts.ServicioEditPart;
import negocio.diagram.edit.parts.ValorDirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoEditPart;
import negocio.diagram.providers.NegocioElementTypes;
import negocio.diagram.providers.NegocioModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NegocioModelingAssistantProviderOfDocumentoComercialEditPart
		extends NegocioModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(NegocioElementTypes.AtributoCompuesto_3001);
		types.add(NegocioElementTypes.AtributoSimple_3004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DocumentoComercialEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			DocumentoComercialEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(NegocioElementTypes.DocumentoComercialProducto_4001);
		types.add(NegocioElementTypes.DocumentoComercialPersonas_4003);
		types.add(NegocioElementTypes.Pago_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(DocumentoComercialEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			DocumentoComercialEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServicioEditPart) {
			types.add(NegocioElementTypes.DocumentoComercialProducto_4001);
		}
		if (targetEditPart instanceof ProductoEditPart) {
			types.add(NegocioElementTypes.DocumentoComercialProducto_4001);
		}
		if (targetEditPart instanceof PersonaEditPart) {
			types.add(NegocioElementTypes.DocumentoComercialPersonas_4003);
		}
		if (targetEditPart instanceof ValorDirectoEditPart) {
			types.add(NegocioElementTypes.Pago_4004);
		}
		if (targetEditPart instanceof ValorIndirectoEditPart) {
			types.add(NegocioElementTypes.Pago_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DocumentoComercialEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			DocumentoComercialEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == NegocioElementTypes.DocumentoComercialProducto_4001) {
			types.add(NegocioElementTypes.Servicio_2005);
			types.add(NegocioElementTypes.Producto_2006);
		} else if (relationshipType == NegocioElementTypes.DocumentoComercialPersonas_4003) {
			types.add(NegocioElementTypes.Persona_2002);
		} else if (relationshipType == NegocioElementTypes.Pago_4004) {
			types.add(NegocioElementTypes.ValorDirecto_2004);
			types.add(NegocioElementTypes.ValorIndirecto_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DocumentoComercialEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			DocumentoComercialEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(NegocioElementTypes.ValorIndirectoJustificante_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DocumentoComercialEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			DocumentoComercialEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == NegocioElementTypes.ValorIndirectoJustificante_4002) {
			types.add(NegocioElementTypes.ValorIndirecto_2008);
		}
		return types;
	}

}
