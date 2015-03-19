package negocio.diagram.providers;

import negocio.NegocioPackage;
import negocio.Persona;
import negocio.diagram.expressions.NegocioAbstractExpression;
import negocio.diagram.expressions.NegocioOCLFactory;
import negocio.diagram.part.NegocioDiagramEditorPlugin;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Persona_2002(Persona instance) {
		try {
			Object value_0 = NegocioOCLFactory.getExpression(0,
					NegocioPackage.eINSTANCE.getPersona(), null).evaluate(
					instance);

			value_0 = NegocioAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
			Object value_1 = NegocioOCLFactory.getExpression(1,
					NegocioPackage.eINSTANCE.getPersona(), null).evaluate(
					instance);
			instance.setNombre((String) value_1);
		} catch (RuntimeException e) {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = NegocioDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			NegocioDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
