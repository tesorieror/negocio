package negocio.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import negocio.diagram.providers.NegocioElementTypes;
import negocio.diagram.providers.NegocioModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NegocioModelingAssistantProviderOfNegocioEditPart extends
		NegocioModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(NegocioElementTypes.AtributoSimple_2001);
		types.add(NegocioElementTypes.Persona_2002);
		types.add(NegocioElementTypes.AtributoCompuesto_2003);
		types.add(NegocioElementTypes.ValorDirecto_2004);
		types.add(NegocioElementTypes.Servicio_2005);
		types.add(NegocioElementTypes.Producto_2006);
		types.add(NegocioElementTypes.DocumentoComercial_2007);
		types.add(NegocioElementTypes.ValorIndirecto_2008);
		return types;
	}

}
