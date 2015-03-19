package negocio.diagram.providers;

import negocio.diagram.edit.parts.NegocioEditPart;
import negocio.diagram.edit.parts.NegocioEditPartFactory;
import negocio.diagram.part.NegocioVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class NegocioEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public NegocioEditPartProvider() {
		super(new NegocioEditPartFactory(),
				NegocioVisualIDRegistry.TYPED_INSTANCE,
				NegocioEditPart.MODEL_ID);
	}

}
