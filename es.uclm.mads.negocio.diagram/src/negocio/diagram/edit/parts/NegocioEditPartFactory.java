package negocio.diagram.edit.parts;

import negocio.diagram.part.NegocioVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class NegocioEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (NegocioVisualIDRegistry.getVisualID(view)) {

			case NegocioEditPart.VISUAL_ID:
				return new NegocioEditPart(view);

			case AtributoSimpleEditPart.VISUAL_ID:
				return new AtributoSimpleEditPart(view);

			case AtributoSimpleNombreTipoCardinalidadEditPart.VISUAL_ID:
				return new AtributoSimpleNombreTipoCardinalidadEditPart(view);

			case PersonaEditPart.VISUAL_ID:
				return new PersonaEditPart(view);

			case PersonaNombreEditPart.VISUAL_ID:
				return new PersonaNombreEditPart(view);

			case AtributoCompuestoEditPart.VISUAL_ID:
				return new AtributoCompuestoEditPart(view);

			case AtributoCompuestoNombreCardinalidadEditPart.VISUAL_ID:
				return new AtributoCompuestoNombreCardinalidadEditPart(view);

			case ValorDirectoEditPart.VISUAL_ID:
				return new ValorDirectoEditPart(view);

			case ValorDirectoNombreEditPart.VISUAL_ID:
				return new ValorDirectoNombreEditPart(view);

			case ServicioEditPart.VISUAL_ID:
				return new ServicioEditPart(view);

			case ServicioNombreEditPart.VISUAL_ID:
				return new ServicioNombreEditPart(view);

			case ProductoEditPart.VISUAL_ID:
				return new ProductoEditPart(view);

			case ProductoNombreEditPart.VISUAL_ID:
				return new ProductoNombreEditPart(view);

			case DocumentoComercialEditPart.VISUAL_ID:
				return new DocumentoComercialEditPart(view);

			case DocumentoComercialNombreEditPart.VISUAL_ID:
				return new DocumentoComercialNombreEditPart(view);

			case ValorIndirectoEditPart.VISUAL_ID:
				return new ValorIndirectoEditPart(view);

			case ValorIndirectoNombreEditPart.VISUAL_ID:
				return new ValorIndirectoNombreEditPart(view);

			case AtributoCompuesto2EditPart.VISUAL_ID:
				return new AtributoCompuesto2EditPart(view);

			case AtributoCompuestoNombreCardinalidad2EditPart.VISUAL_ID:
				return new AtributoCompuestoNombreCardinalidad2EditPart(view);

			case AtributoSimple2EditPart.VISUAL_ID:
				return new AtributoSimple2EditPart(view);

			case AtributoSimpleNombreTipoCardinalidad2EditPart.VISUAL_ID:
				return new AtributoSimpleNombreTipoCardinalidad2EditPart(view);

			case AtributoCompuesto3EditPart.VISUAL_ID:
				return new AtributoCompuesto3EditPart(view);

			case AtributoCompuestoNombreCardinalidad3EditPart.VISUAL_ID:
				return new AtributoCompuestoNombreCardinalidad3EditPart(view);

			case AtributoSimple3EditPart.VISUAL_ID:
				return new AtributoSimple3EditPart(view);

			case AtributoSimpleNombreTipoCardinalidad3EditPart.VISUAL_ID:
				return new AtributoSimpleNombreTipoCardinalidad3EditPart(view);

			case PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID:
				return new PersonaPersonaAtributosCompartmentEditPart(view);

			case AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID:
				return new AtributoCompuestoAtributoCompuestoCompartmentEditPart(
						view);

			case AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID:
				return new AtributoCompuestoAtributoCompuestoCompartment2EditPart(
						view);

			case AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID:
				return new AtributoCompuestoAtributoCompuestoCompartment3EditPart(
						view);

			case ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID:
				return new ValorDirectoValorDirectoAtributosCompartmentEditPart(
						view);

			case ServicioServicioAtributosCompartmentEditPart.VISUAL_ID:
				return new ServicioServicioAtributosCompartmentEditPart(view);

			case ProductoProductoAtributosCompartmentEditPart.VISUAL_ID:
				return new ProductoProductoAtributosCompartmentEditPart(view);

			case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
				return new DocumentoComercialDocumentoComercialAtributoCompartmentEditPart(
						view);

			case ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID:
				return new ValorIndirectoValorIndirectoAtributosCompartmentEditPart(
						view);

			case DocumentoComercialProductoEditPart.VISUAL_ID:
				return new DocumentoComercialProductoEditPart(view);

			case ValorIndirectoJustificanteEditPart.VISUAL_ID:
				return new ValorIndirectoJustificanteEditPart(view);

			case DocumentoComercialPersonasEditPart.VISUAL_ID:
				return new DocumentoComercialPersonasEditPart(view);

			case PagoEditPart.VISUAL_ID:
				return new PagoEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
