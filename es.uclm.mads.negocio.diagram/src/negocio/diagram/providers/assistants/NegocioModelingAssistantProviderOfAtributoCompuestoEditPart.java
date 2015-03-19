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
public class NegocioModelingAssistantProviderOfAtributoCompuestoEditPart extends
		NegocioModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(NegocioElementTypes.AtributoSimple_3002);
		types.add(NegocioElementTypes.AtributoCompuesto_3003);
		return types;
	}

}
