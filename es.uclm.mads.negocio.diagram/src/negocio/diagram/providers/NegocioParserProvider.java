package negocio.diagram.providers;

import negocio.NegocioPackage;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidad2EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidad3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoNombreCardinalidadEditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidad2EditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidad3EditPart;
import negocio.diagram.edit.parts.AtributoSimpleNombreTipoCardinalidadEditPart;
import negocio.diagram.edit.parts.DocumentoComercialNombreEditPart;
import negocio.diagram.edit.parts.PersonaNombreEditPart;
import negocio.diagram.edit.parts.ProductoNombreEditPart;
import negocio.diagram.edit.parts.ServicioNombreEditPart;
import negocio.diagram.edit.parts.ValorDirectoNombreEditPart;
import negocio.diagram.edit.parts.ValorIndirectoNombreEditPart;
import negocio.diagram.edit.parts.WrappingLabelEditPart;
import negocio.diagram.parsers.MessageFormatParser;
import negocio.diagram.parsers.PagoLabelExpressionLabelParser;
import negocio.diagram.part.NegocioVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class NegocioParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser atributoSimpleNombreTipoCardinalidad_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoSimpleNombreTipoCardinalidad_5001Parser() {
		if (atributoSimpleNombreTipoCardinalidad_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributoSimple_Tipo(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			atributoSimpleNombreTipoCardinalidad_5001Parser = parser;
		}
		return atributoSimpleNombreTipoCardinalidad_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser personaNombreTipo_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPersonaNombreTipo_5006Parser() {
		if (personaNombreTipo_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getElementoNombrado_Nombre(),
					NegocioPackage.eINSTANCE.getPersona_Tipo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} [{1}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0} [{1}]"); //$NON-NLS-1$
			parser.setEditPattern("{0} [{1}]"); //$NON-NLS-1$
			personaNombreTipo_5006Parser = parser;
		}
		return personaNombreTipo_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoCompuestoNombreCardinalidad_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoCompuestoNombreCardinalidad_5007Parser() {
		if (atributoCompuestoNombreCardinalidad_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0} [ {1} ]"); //$NON-NLS-1$
			atributoCompuestoNombreCardinalidad_5007Parser = parser;
		}
		return atributoCompuestoNombreCardinalidad_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser valorDirectoNombre_5008Parser;

	/**
	 * @generated
	 */
	private IParser getValorDirectoNombre_5008Parser() {
		if (valorDirectoNombre_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { NegocioPackage.eINSTANCE
					.getElementoNombrado_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valorDirectoNombre_5008Parser = parser;
		}
		return valorDirectoNombre_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser servicioNombre_5009Parser;

	/**
	 * @generated
	 */
	private IParser getServicioNombre_5009Parser() {
		if (servicioNombre_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { NegocioPackage.eINSTANCE
					.getElementoNombrado_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			servicioNombre_5009Parser = parser;
		}
		return servicioNombre_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser productoNombre_5010Parser;

	/**
	 * @generated
	 */
	private IParser getProductoNombre_5010Parser() {
		if (productoNombre_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { NegocioPackage.eINSTANCE
					.getElementoNombrado_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productoNombre_5010Parser = parser;
		}
		return productoNombre_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser documentoComercialNombre_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDocumentoComercialNombre_5011Parser() {
		if (documentoComercialNombre_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { NegocioPackage.eINSTANCE
					.getElementoNombrado_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			documentoComercialNombre_5011Parser = parser;
		}
		return documentoComercialNombre_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser valorIndirectoNombre_5012Parser;

	/**
	 * @generated
	 */
	private IParser getValorIndirectoNombre_5012Parser() {
		if (valorIndirectoNombre_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { NegocioPackage.eINSTANCE
					.getElementoNombrado_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valorIndirectoNombre_5012Parser = parser;
		}
		return valorIndirectoNombre_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoCompuestoNombreCardinalidad_5004Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoCompuestoNombreCardinalidad_5004Parser() {
		if (atributoCompuestoNombreCardinalidad_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0} [ {1} ]"); //$NON-NLS-1$
			atributoCompuestoNombreCardinalidad_5004Parser = parser;
		}
		return atributoCompuestoNombreCardinalidad_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoSimpleNombreTipoCardinalidad_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoSimpleNombreTipoCardinalidad_5002Parser() {
		if (atributoSimpleNombreTipoCardinalidad_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributoSimple_Tipo(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			atributoSimpleNombreTipoCardinalidad_5002Parser = parser;
		}
		return atributoSimpleNombreTipoCardinalidad_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoCompuestoNombreCardinalidad_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoCompuestoNombreCardinalidad_5003Parser() {
		if (atributoCompuestoNombreCardinalidad_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0} [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0} [ {1} ]"); //$NON-NLS-1$
			atributoCompuestoNombreCardinalidad_5003Parser = parser;
		}
		return atributoCompuestoNombreCardinalidad_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoSimpleNombreTipoCardinalidad_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoSimpleNombreTipoCardinalidad_5005Parser() {
		if (atributoSimpleNombreTipoCardinalidad_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					NegocioPackage.eINSTANCE.getAtributo_Nombre(),
					NegocioPackage.eINSTANCE.getAtributoSimple_Tipo(),
					NegocioPackage.eINSTANCE.getAtributo_Cardinalidad() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}[{2}]"); //$NON-NLS-1$
			atributoSimpleNombreTipoCardinalidad_5005Parser = parser;
		}
		return atributoSimpleNombreTipoCardinalidad_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getPagoLabel_6001Parser() {
		return new PagoLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AtributoSimpleNombreTipoCardinalidadEditPart.VISUAL_ID:
			return getAtributoSimpleNombreTipoCardinalidad_5001Parser();
		case PersonaNombreEditPart.VISUAL_ID:
			return getPersonaNombreTipo_5006Parser();
		case AtributoCompuestoNombreCardinalidadEditPart.VISUAL_ID:
			return getAtributoCompuestoNombreCardinalidad_5007Parser();
		case ValorDirectoNombreEditPart.VISUAL_ID:
			return getValorDirectoNombre_5008Parser();
		case ServicioNombreEditPart.VISUAL_ID:
			return getServicioNombre_5009Parser();
		case ProductoNombreEditPart.VISUAL_ID:
			return getProductoNombre_5010Parser();
		case DocumentoComercialNombreEditPart.VISUAL_ID:
			return getDocumentoComercialNombre_5011Parser();
		case ValorIndirectoNombreEditPart.VISUAL_ID:
			return getValorIndirectoNombre_5012Parser();
		case AtributoCompuestoNombreCardinalidad2EditPart.VISUAL_ID:
			return getAtributoCompuestoNombreCardinalidad_5004Parser();
		case AtributoSimpleNombreTipoCardinalidad2EditPart.VISUAL_ID:
			return getAtributoSimpleNombreTipoCardinalidad_5002Parser();
		case AtributoCompuestoNombreCardinalidad3EditPart.VISUAL_ID:
			return getAtributoCompuestoNombreCardinalidad_5003Parser();
		case AtributoSimpleNombreTipoCardinalidad3EditPart.VISUAL_ID:
			return getAtributoSimpleNombreTipoCardinalidad_5005Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getPagoLabel_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(NegocioVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(NegocioVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (NegocioElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
