package negocio.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import negocio.NegocioPackage;
import negocio.diagram.edit.parts.AtributoCompuesto2EditPart;
import negocio.diagram.edit.parts.AtributoCompuesto3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoEditPart;
import negocio.diagram.edit.parts.AtributoSimple2EditPart;
import negocio.diagram.edit.parts.AtributoSimple3EditPart;
import negocio.diagram.edit.parts.AtributoSimpleEditPart;
import negocio.diagram.edit.parts.DocumentoComercialEditPart;
import negocio.diagram.edit.parts.DocumentoComercialPersonasEditPart;
import negocio.diagram.edit.parts.DocumentoComercialProductoEditPart;
import negocio.diagram.edit.parts.NegocioEditPart;
import negocio.diagram.edit.parts.PagoEditPart;
import negocio.diagram.edit.parts.PersonaEditPart;
import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.edit.parts.ServicioEditPart;
import negocio.diagram.edit.parts.ValorDirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoJustificanteEditPart;
import negocio.diagram.part.NegocioDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class NegocioElementTypes {

	/**
	 * @generated
	 */
	private NegocioElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			NegocioDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Negocio_1000 = getElementType("es.uclm.mads.negocio.diagram.Negocio_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoSimple_2001 = getElementType("es.uclm.mads.negocio.diagram.AtributoSimple_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Persona_2002 = getElementType("es.uclm.mads.negocio.diagram.Persona_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoCompuesto_2003 = getElementType("es.uclm.mads.negocio.diagram.AtributoCompuesto_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValorDirecto_2004 = getElementType("es.uclm.mads.negocio.diagram.ValorDirecto_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Servicio_2005 = getElementType("es.uclm.mads.negocio.diagram.Servicio_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Producto_2006 = getElementType("es.uclm.mads.negocio.diagram.Producto_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DocumentoComercial_2007 = getElementType("es.uclm.mads.negocio.diagram.DocumentoComercial_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValorIndirecto_2008 = getElementType("es.uclm.mads.negocio.diagram.ValorIndirecto_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoCompuesto_3001 = getElementType("es.uclm.mads.negocio.diagram.AtributoCompuesto_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoSimple_3002 = getElementType("es.uclm.mads.negocio.diagram.AtributoSimple_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoCompuesto_3003 = getElementType("es.uclm.mads.negocio.diagram.AtributoCompuesto_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoSimple_3004 = getElementType("es.uclm.mads.negocio.diagram.AtributoSimple_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DocumentoComercialProducto_4001 = getElementType("es.uclm.mads.negocio.diagram.DocumentoComercialProducto_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValorIndirectoJustificante_4002 = getElementType("es.uclm.mads.negocio.diagram.ValorIndirectoJustificante_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DocumentoComercialPersonas_4003 = getElementType("es.uclm.mads.negocio.diagram.DocumentoComercialPersonas_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pago_4004 = getElementType("es.uclm.mads.negocio.diagram.Pago_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Negocio_1000, NegocioPackage.eINSTANCE.getNegocio());

			elements.put(AtributoSimple_2001,
					NegocioPackage.eINSTANCE.getAtributoSimple());

			elements.put(Persona_2002, NegocioPackage.eINSTANCE.getPersona());

			elements.put(AtributoCompuesto_2003,
					NegocioPackage.eINSTANCE.getAtributoCompuesto());

			elements.put(ValorDirecto_2004,
					NegocioPackage.eINSTANCE.getValorDirecto());

			elements.put(Servicio_2005, NegocioPackage.eINSTANCE.getServicio());

			elements.put(Producto_2006, NegocioPackage.eINSTANCE.getProducto());

			elements.put(DocumentoComercial_2007,
					NegocioPackage.eINSTANCE.getDocumentoComercial());

			elements.put(ValorIndirecto_2008,
					NegocioPackage.eINSTANCE.getValorIndirecto());

			elements.put(AtributoCompuesto_3001,
					NegocioPackage.eINSTANCE.getAtributoCompuesto());

			elements.put(AtributoSimple_3002,
					NegocioPackage.eINSTANCE.getAtributoSimple());

			elements.put(AtributoCompuesto_3003,
					NegocioPackage.eINSTANCE.getAtributoCompuesto());

			elements.put(AtributoSimple_3004,
					NegocioPackage.eINSTANCE.getAtributoSimple());

			elements.put(DocumentoComercialProducto_4001,
					NegocioPackage.eINSTANCE.getDocumentoComercial_Producto());

			elements.put(ValorIndirectoJustificante_4002,
					NegocioPackage.eINSTANCE.getValorIndirecto_Justificante());

			elements.put(DocumentoComercialPersonas_4003,
					NegocioPackage.eINSTANCE.getDocumentoComercial_Personas());

			elements.put(Pago_4004, NegocioPackage.eINSTANCE.getPago());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Negocio_1000);
			KNOWN_ELEMENT_TYPES.add(AtributoSimple_2001);
			KNOWN_ELEMENT_TYPES.add(Persona_2002);
			KNOWN_ELEMENT_TYPES.add(AtributoCompuesto_2003);
			KNOWN_ELEMENT_TYPES.add(ValorDirecto_2004);
			KNOWN_ELEMENT_TYPES.add(Servicio_2005);
			KNOWN_ELEMENT_TYPES.add(Producto_2006);
			KNOWN_ELEMENT_TYPES.add(DocumentoComercial_2007);
			KNOWN_ELEMENT_TYPES.add(ValorIndirecto_2008);
			KNOWN_ELEMENT_TYPES.add(AtributoCompuesto_3001);
			KNOWN_ELEMENT_TYPES.add(AtributoSimple_3002);
			KNOWN_ELEMENT_TYPES.add(AtributoCompuesto_3003);
			KNOWN_ELEMENT_TYPES.add(AtributoSimple_3004);
			KNOWN_ELEMENT_TYPES.add(DocumentoComercialProducto_4001);
			KNOWN_ELEMENT_TYPES.add(ValorIndirectoJustificante_4002);
			KNOWN_ELEMENT_TYPES.add(DocumentoComercialPersonas_4003);
			KNOWN_ELEMENT_TYPES.add(Pago_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case NegocioEditPart.VISUAL_ID:
			return Negocio_1000;
		case AtributoSimpleEditPart.VISUAL_ID:
			return AtributoSimple_2001;
		case PersonaEditPart.VISUAL_ID:
			return Persona_2002;
		case AtributoCompuestoEditPart.VISUAL_ID:
			return AtributoCompuesto_2003;
		case ValorDirectoEditPart.VISUAL_ID:
			return ValorDirecto_2004;
		case ServicioEditPart.VISUAL_ID:
			return Servicio_2005;
		case ProductoEditPart.VISUAL_ID:
			return Producto_2006;
		case DocumentoComercialEditPart.VISUAL_ID:
			return DocumentoComercial_2007;
		case ValorIndirectoEditPart.VISUAL_ID:
			return ValorIndirecto_2008;
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return AtributoCompuesto_3001;
		case AtributoSimple2EditPart.VISUAL_ID:
			return AtributoSimple_3002;
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return AtributoCompuesto_3003;
		case AtributoSimple3EditPart.VISUAL_ID:
			return AtributoSimple_3004;
		case DocumentoComercialProductoEditPart.VISUAL_ID:
			return DocumentoComercialProducto_4001;
		case ValorIndirectoJustificanteEditPart.VISUAL_ID:
			return ValorIndirectoJustificante_4002;
		case DocumentoComercialPersonasEditPart.VISUAL_ID:
			return DocumentoComercialPersonas_4003;
		case PagoEditPart.VISUAL_ID:
			return Pago_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return negocio.diagram.providers.NegocioElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return negocio.diagram.providers.NegocioElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return negocio.diagram.providers.NegocioElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
