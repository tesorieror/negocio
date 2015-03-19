package negocio.diagram.part;

import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.diagram.edit.parts.AtributoCompuesto2EditPart;
import negocio.diagram.edit.parts.AtributoCompuesto3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartment2EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartment3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartmentEditPart;
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
import negocio.diagram.edit.parts.DocumentoComercialDocumentoComercialAtributoCompartmentEditPart;
import negocio.diagram.edit.parts.DocumentoComercialEditPart;
import negocio.diagram.edit.parts.DocumentoComercialNombreEditPart;
import negocio.diagram.edit.parts.NegocioEditPart;
import negocio.diagram.edit.parts.PagoEditPart;
import negocio.diagram.edit.parts.PersonaEditPart;
import negocio.diagram.edit.parts.PersonaNombreEditPart;
import negocio.diagram.edit.parts.PersonaPersonaAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.edit.parts.ProductoNombreEditPart;
import negocio.diagram.edit.parts.ProductoProductoAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ServicioEditPart;
import negocio.diagram.edit.parts.ServicioNombreEditPart;
import negocio.diagram.edit.parts.ServicioServicioAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ValorDirectoEditPart;
import negocio.diagram.edit.parts.ValorDirectoNombreEditPart;
import negocio.diagram.edit.parts.ValorDirectoValorDirectoAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ValorIndirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoNombreEditPart;
import negocio.diagram.edit.parts.ValorIndirectoValorIndirectoAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.WrappingLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class NegocioVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.uclm.mads.negocio.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (NegocioEditPart.MODEL_ID.equals(view.getType())) {
				return NegocioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return negocio.diagram.part.NegocioVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				NegocioDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (NegocioPackage.eINSTANCE.getNegocio().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Negocio) domainElement)) {
			return NegocioEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = negocio.diagram.part.NegocioVisualIDRegistry
				.getModelID(containerView);
		if (!NegocioEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (NegocioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = negocio.diagram.part.NegocioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NegocioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case NegocioEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimpleEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getPersona().isSuperTypeOf(
					domainElement.eClass())) {
				return PersonaEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuestoEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getValorDirecto().isSuperTypeOf(
					domainElement.eClass())) {
				return ValorDirectoEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getServicio().isSuperTypeOf(
					domainElement.eClass())) {
				return ServicioEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getProducto().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductoEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getDocumentoComercial().isSuperTypeOf(
					domainElement.eClass())) {
				return DocumentoComercialEditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getValorIndirecto().isSuperTypeOf(
					domainElement.eClass())) {
				return ValorIndirectoEditPart.VISUAL_ID;
			}
			break;
		case PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto3EditPart.VISUAL_ID;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto3EditPart.VISUAL_ID;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto3EditPart.VISUAL_ID;
			}
			break;
		case ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			break;
		case ServicioServicioAtributosCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			break;
		case ProductoProductoAtributosCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			break;
		case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			break;
		case ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID:
			if (NegocioPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoSimple3EditPart.VISUAL_ID;
			}
			if (NegocioPackage.eINSTANCE.getAtributoCompuesto().isSuperTypeOf(
					domainElement.eClass())) {
				return AtributoCompuesto2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = negocio.diagram.part.NegocioVisualIDRegistry
				.getModelID(containerView);
		if (!NegocioEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (NegocioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = negocio.diagram.part.NegocioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NegocioEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case NegocioEditPart.VISUAL_ID:
			if (AtributoSimpleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuestoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValorDirectoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DocumentoComercialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValorIndirectoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoSimpleEditPart.VISUAL_ID:
			if (AtributoSimpleNombreTipoCardinalidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PersonaEditPart.VISUAL_ID:
			if (PersonaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuestoEditPart.VISUAL_ID:
			if (AtributoCompuestoNombreCardinalidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValorDirectoEditPart.VISUAL_ID:
			if (ValorDirectoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicioEditPart.VISUAL_ID:
			if (ServicioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicioServicioAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductoEditPart.VISUAL_ID:
			if (ProductoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductoProductoAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DocumentoComercialEditPart.VISUAL_ID:
			if (DocumentoComercialNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValorIndirectoEditPart.VISUAL_ID:
			if (ValorIndirectoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuesto2EditPart.VISUAL_ID:
			if (AtributoCompuestoNombreCardinalidad2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoSimple2EditPart.VISUAL_ID:
			if (AtributoSimpleNombreTipoCardinalidad2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuesto3EditPart.VISUAL_ID:
			if (AtributoCompuestoNombreCardinalidad3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoSimple3EditPart.VISUAL_ID:
			if (AtributoSimpleNombreTipoCardinalidad3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID:
			if (AtributoSimple2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID:
			if (AtributoSimple2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID:
			if (AtributoSimple2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicioServicioAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductoProductoAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoSimple3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoCompuesto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PagoEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (NegocioPackage.eINSTANCE.getPago().isSuperTypeOf(
				domainElement.eClass())) {
			return PagoEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Negocio element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID:
		case AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID:
		case AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID:
		case AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID:
		case ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID:
		case ServicioServicioAtributosCompartmentEditPart.VISUAL_ID:
		case ProductoProductoAtributosCompartmentEditPart.VISUAL_ID:
		case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
		case ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case NegocioEditPart.VISUAL_ID:
			return false;
		case AtributoSimpleEditPart.VISUAL_ID:
		case AtributoSimple2EditPart.VISUAL_ID:
		case AtributoSimple3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return negocio.diagram.part.NegocioVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
