package negocio.diagram.navigator;

import negocio.Negocio;
import negocio.diagram.edit.parts.AtributoCompuesto2EditPart;
import negocio.diagram.edit.parts.AtributoCompuesto3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoEditPart;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidad2EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidad3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidadEditPart;
import negocio.diagram.edit.parts.AtributoSimple2EditPart;
import negocio.diagram.edit.parts.AtributoSimple3EditPart;
import negocio.diagram.edit.parts.AtributoSimpleEditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidad2EditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidad3EditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidadEditPart;
import negocio.diagram.edit.parts.DocumentoComercialEditPart;
import negocio.diagram.edit.parts.DocumentoComercialNombreEditPart;
import negocio.diagram.edit.parts.DocumentoComercialPersonasEditPart;
import negocio.diagram.edit.parts.DocumentoComercialProductoEditPart;
import negocio.diagram.edit.parts.NegocioEditPart;
import negocio.diagram.edit.parts.PagoEditPart;
import negocio.diagram.edit.parts.PersonaEditPart;
import negocio.diagram.edit.parts.PersonaNombreEditPart;
import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.edit.parts.ProductoNombreEditPart;
import negocio.diagram.edit.parts.ServicioEditPart;
import negocio.diagram.edit.parts.ServicioNombreEditPart;
import negocio.diagram.edit.parts.ValorDirectoEditPart;
import negocio.diagram.edit.parts.ValorDirectoNombreEditPart;
import negocio.diagram.edit.parts.ValorIndirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoJustificanteEditPart;
import negocio.diagram.edit.parts.ValorIndirectoNombreEditPart;
import negocio.diagram.edit.parts.WrappingLabelEditPart;
import negocio.diagram.part.NegocioDiagramEditorPlugin;
import negocio.diagram.part.NegocioVisualIDRegistry;
import negocio.diagram.providers.NegocioElementTypes;
import negocio.diagram.providers.NegocioParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class NegocioNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		NegocioDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		NegocioDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof NegocioNavigatorItem
				&& !isOwnView(((NegocioNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof NegocioNavigatorGroup) {
			NegocioNavigatorGroup group = (NegocioNavigatorGroup) element;
			return NegocioDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof NegocioNavigatorItem) {
			NegocioNavigatorItem navigatorItem = (NegocioNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case NegocioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://negocio/1.0?Negocio", NegocioElementTypes.Negocio_1000); //$NON-NLS-1$
		case AtributoSimpleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?AtributoSimple", NegocioElementTypes.AtributoSimple_2001); //$NON-NLS-1$
		case PersonaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?Persona", NegocioElementTypes.Persona_2002); //$NON-NLS-1$
		case AtributoCompuestoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?AtributoCompuesto", NegocioElementTypes.AtributoCompuesto_2003); //$NON-NLS-1$
		case ValorDirectoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?ValorDirecto", NegocioElementTypes.ValorDirecto_2004); //$NON-NLS-1$
		case ServicioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?Servicio", NegocioElementTypes.Servicio_2005); //$NON-NLS-1$
		case ProductoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?Producto", NegocioElementTypes.Producto_2006); //$NON-NLS-1$
		case DocumentoComercialEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?DocumentoComercial", NegocioElementTypes.DocumentoComercial_2007); //$NON-NLS-1$
		case ValorIndirectoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://negocio/1.0?ValorIndirecto", NegocioElementTypes.ValorIndirecto_2008); //$NON-NLS-1$
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://negocio/1.0?AtributoCompuesto", NegocioElementTypes.AtributoCompuesto_3001); //$NON-NLS-1$
		case AtributoSimple2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://negocio/1.0?AtributoSimple", NegocioElementTypes.AtributoSimple_3002); //$NON-NLS-1$
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://negocio/1.0?AtributoCompuesto", NegocioElementTypes.AtributoCompuesto_3003); //$NON-NLS-1$
		case AtributoSimple3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://negocio/1.0?AtributoSimple", NegocioElementTypes.AtributoSimple_3004); //$NON-NLS-1$
		case DocumentoComercialProductoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://negocio/1.0?DocumentoComercial?producto", NegocioElementTypes.DocumentoComercialProducto_4001); //$NON-NLS-1$
		case ValorIndirectoJustificanteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://negocio/1.0?ValorIndirecto?justificante", NegocioElementTypes.ValorIndirectoJustificante_4002); //$NON-NLS-1$
		case DocumentoComercialPersonasEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://negocio/1.0?DocumentoComercial?personas", NegocioElementTypes.DocumentoComercialPersonas_4003); //$NON-NLS-1$
		case PagoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://negocio/1.0?Pago", NegocioElementTypes.Pago_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = NegocioDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& NegocioElementTypes.isKnownElementType(elementType)) {
			image = NegocioElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof NegocioNavigatorGroup) {
			NegocioNavigatorGroup group = (NegocioNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof NegocioNavigatorItem) {
			NegocioNavigatorItem navigatorItem = (NegocioNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case NegocioEditPart.VISUAL_ID:
			return getNegocio_1000Text(view);
		case AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2001Text(view);
		case PersonaEditPart.VISUAL_ID:
			return getPersona_2002Text(view);
		case AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2003Text(view);
		case ValorDirectoEditPart.VISUAL_ID:
			return getValorDirecto_2004Text(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_2005Text(view);
		case ProductoEditPart.VISUAL_ID:
			return getProducto_2006Text(view);
		case DocumentoComercialEditPart.VISUAL_ID:
			return getDocumentoComercial_2007Text(view);
		case ValorIndirectoEditPart.VISUAL_ID:
			return getValorIndirecto_2008Text(view);
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return getAtributoCompuesto_3001Text(view);
		case AtributoSimple2EditPart.VISUAL_ID:
			return getAtributoSimple_3002Text(view);
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return getAtributoCompuesto_3003Text(view);
		case AtributoSimple3EditPart.VISUAL_ID:
			return getAtributoSimple_3004Text(view);
		case DocumentoComercialProductoEditPart.VISUAL_ID:
			return getDocumentoComercialProducto_4001Text(view);
		case ValorIndirectoJustificanteEditPart.VISUAL_ID:
			return getValorIndirectoJustificante_4002Text(view);
		case DocumentoComercialPersonasEditPart.VISUAL_ID:
			return getDocumentoComercialPersonas_4003Text(view);
		case PagoEditPart.VISUAL_ID:
			return getPago_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getNegocio_1000Text(View view) {
		Negocio domainModelElement = (Negocio) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoSimple_2001Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoSimple_2001,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoSimpleNombreTipoCardinalidadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPersona_2002Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.Persona_2002,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(PersonaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoCompuesto_2003Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoCompuesto_2003,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoCompuestoNombreCardinalidadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValorDirecto_2004Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.ValorDirecto_2004,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(ValorDirectoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServicio_2005Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.Servicio_2005,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(ServicioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProducto_2006Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.Producto_2006,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(ProductoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDocumentoComercial_2007Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.DocumentoComercial_2007,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(DocumentoComercialNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValorIndirecto_2008Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.ValorIndirecto_2008,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(ValorIndirectoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoCompuesto_3001Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoCompuesto_3001,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoCompuestoNombreCardinalidad2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoSimple_3002Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoSimple_3002,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoSimpleNombreTipoCardinalidad2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoCompuesto_3003Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoCompuesto_3003,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoCompuestoNombreCardinalidad3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoSimple_3004Text(View view) {
		IParser parser = NegocioParserProvider
				.getParser(
						NegocioElementTypes.AtributoSimple_3004,
						view.getElement() != null ? view.getElement() : view,
						NegocioVisualIDRegistry
								.getType(AtributoSimpleNombreTipoCardinalidad3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDocumentoComercialProducto_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getValorIndirectoJustificante_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDocumentoComercialPersonas_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPago_4004Text(View view) {
		IParser parser = NegocioParserProvider.getParser(
				NegocioElementTypes.Pago_4004,
				view.getElement() != null ? view.getElement() : view,
				NegocioVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NegocioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return NegocioEditPart.MODEL_ID.equals(NegocioVisualIDRegistry
				.getModelID(view));
	}

}
