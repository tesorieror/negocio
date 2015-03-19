package negocio.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.providers.NegocioElementTypes;
import negocio.diagram.providers.NegocioModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NegocioModelingAssistantProviderOfProductoEditPart extends
		NegocioModelingAssistantProvider {

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
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ProductoEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ProductoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(NegocioElementTypes.DocumentoComercialProducto_4001);
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
		return doGetTypesForSource((ProductoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ProductoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == NegocioElementTypes.DocumentoComercialProducto_4001) {
			types.add(NegocioElementTypes.DocumentoComercial_2007);
		}
		return types;
	}

}
