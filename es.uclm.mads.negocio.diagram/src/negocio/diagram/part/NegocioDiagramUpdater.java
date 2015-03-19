package negocio.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import negocio.Atributo;
import negocio.AtributoCompuesto;
import negocio.DocumentoComercial;
import negocio.Negocio;
import negocio.NegocioPackage;
import negocio.Pago;
import negocio.Persona;
import negocio.Producto;
import negocio.Servicio;
import negocio.Valor;
import negocio.ValorDirecto;
import negocio.ValorIndirecto;
import negocio.diagram.edit.parts.AtributoCompuesto2EditPart;
import negocio.diagram.edit.parts.AtributoCompuesto3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartment2EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartment3EditPart;
import negocio.diagram.edit.parts.AtributoCompuestoAtributoCompuestoCompartmentEditPart;
import negocio.diagram.edit.parts.AtributoCompuestoEditPart;
import negocio.diagram.edit.parts.AtributoSimple2EditPart;
import negocio.diagram.edit.parts.AtributoSimple3EditPart;
import negocio.diagram.edit.parts.AtributoSimpleEditPart;
import negocio.diagram.edit.parts.DocumentoComercialDocumentoComercialAtributoCompartmentEditPart;
import negocio.diagram.edit.parts.DocumentoComercialEditPart;
import negocio.diagram.edit.parts.DocumentoComercialPersonasEditPart;
import negocio.diagram.edit.parts.DocumentoComercialProductoEditPart;
import negocio.diagram.edit.parts.NegocioEditPart;
import negocio.diagram.edit.parts.PagoEditPart;
import negocio.diagram.edit.parts.PersonaEditPart;
import negocio.diagram.edit.parts.PersonaPersonaAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ProductoEditPart;
import negocio.diagram.edit.parts.ProductoProductoAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ServicioEditPart;
import negocio.diagram.edit.parts.ServicioServicioAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ValorDirectoEditPart;
import negocio.diagram.edit.parts.ValorDirectoValorDirectoAtributosCompartmentEditPart;
import negocio.diagram.edit.parts.ValorIndirectoEditPart;
import negocio.diagram.edit.parts.ValorIndirectoJustificanteEditPart;
import negocio.diagram.edit.parts.ValorIndirectoValorIndirectoAtributosCompartmentEditPart;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class NegocioDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getSemanticChildren(View view) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case NegocioEditPart.VISUAL_ID:
			return getNegocio_1000SemanticChildren(view);
		case PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID:
			return getPersonaPersonaAtributosCompartment_7001SemanticChildren(view);
		case AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID:
			return getAtributoCompuestoAtributoCompuestoCompartment_7002SemanticChildren(view);
		case AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID:
			return getAtributoCompuestoAtributoCompuestoCompartment_7003SemanticChildren(view);
		case AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID:
			return getAtributoCompuestoAtributoCompuestoCompartment_7004SemanticChildren(view);
		case ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID:
			return getValorDirectoValorDirectoAtributosCompartment_7005SemanticChildren(view);
		case ServicioServicioAtributosCompartmentEditPart.VISUAL_ID:
			return getServicioServicioAtributosCompartment_7006SemanticChildren(view);
		case ProductoProductoAtributosCompartmentEditPart.VISUAL_ID:
			return getProductoProductoAtributosCompartment_7007SemanticChildren(view);
		case DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID:
			return getDocumentoComercialDocumentoComercialAtributoCompartment_7008SemanticChildren(view);
		case ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID:
			return getValorIndirectoValorIndirectoAtributosCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getNegocio_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Negocio modelElement = (Negocio) view.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimpleEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuestoEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPersonas().iterator(); it
				.hasNext();) {
			Persona childElement = (Persona) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PersonaEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValores().iterator(); it
				.hasNext();) {
			Valor childElement = (Valor) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValorDirectoEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValorIndirectoEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProductos().iterator(); it
				.hasNext();) {
			Producto childElement = (Producto) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServicioEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProductoEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDocumentos().iterator(); it
				.hasNext();) {
			DocumentoComercial childElement = (DocumentoComercial) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DocumentoComercialEditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getPersonaPersonaAtributosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Persona modelElement = (Persona) containerView.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getAtributoCompuestoAtributoCompuestoCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AtributoCompuesto modelElement = (AtributoCompuesto) containerView
				.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getAtributoCompuestoAtributoCompuestoCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AtributoCompuesto modelElement = (AtributoCompuesto) containerView
				.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getAtributoCompuestoAtributoCompuestoCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AtributoCompuesto modelElement = (AtributoCompuesto) containerView
				.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getValorDirectoValorDirectoAtributosCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValorDirecto modelElement = (ValorDirecto) containerView.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getServicioServicioAtributosCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Servicio modelElement = (Servicio) containerView.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getProductoProductoAtributosCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Producto modelElement = (Producto) containerView.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getDocumentoComercialDocumentoComercialAtributoCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DocumentoComercial modelElement = (DocumentoComercial) containerView
				.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioNodeDescriptor> getValorIndirectoValorIndirectoAtributosCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValorIndirecto modelElement = (ValorIndirecto) containerView
				.getElement();
		LinkedList<NegocioNodeDescriptor> result = new LinkedList<NegocioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = NegocioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtributoSimple3EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoCompuesto2EditPart.VISUAL_ID) {
				result.add(new NegocioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getContainedLinks(View view) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case NegocioEditPart.VISUAL_ID:
			return getNegocio_1000ContainedLinks(view);
		case AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2001ContainedLinks(view);
		case PersonaEditPart.VISUAL_ID:
			return getPersona_2002ContainedLinks(view);
		case AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2003ContainedLinks(view);
		case ValorDirectoEditPart.VISUAL_ID:
			return getValorDirecto_2004ContainedLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_2005ContainedLinks(view);
		case ProductoEditPart.VISUAL_ID:
			return getProducto_2006ContainedLinks(view);
		case DocumentoComercialEditPart.VISUAL_ID:
			return getDocumentoComercial_2007ContainedLinks(view);
		case ValorIndirectoEditPart.VISUAL_ID:
			return getValorIndirecto_2008ContainedLinks(view);
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return getAtributoCompuesto_3001ContainedLinks(view);
		case AtributoSimple2EditPart.VISUAL_ID:
			return getAtributoSimple_3002ContainedLinks(view);
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return getAtributoCompuesto_3003ContainedLinks(view);
		case AtributoSimple3EditPart.VISUAL_ID:
			return getAtributoSimple_3004ContainedLinks(view);
		case PagoEditPart.VISUAL_ID:
			return getPago_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getIncomingLinks(View view) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2001IncomingLinks(view);
		case PersonaEditPart.VISUAL_ID:
			return getPersona_2002IncomingLinks(view);
		case AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2003IncomingLinks(view);
		case ValorDirectoEditPart.VISUAL_ID:
			return getValorDirecto_2004IncomingLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_2005IncomingLinks(view);
		case ProductoEditPart.VISUAL_ID:
			return getProducto_2006IncomingLinks(view);
		case DocumentoComercialEditPart.VISUAL_ID:
			return getDocumentoComercial_2007IncomingLinks(view);
		case ValorIndirectoEditPart.VISUAL_ID:
			return getValorIndirecto_2008IncomingLinks(view);
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return getAtributoCompuesto_3001IncomingLinks(view);
		case AtributoSimple2EditPart.VISUAL_ID:
			return getAtributoSimple_3002IncomingLinks(view);
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return getAtributoCompuesto_3003IncomingLinks(view);
		case AtributoSimple3EditPart.VISUAL_ID:
			return getAtributoSimple_3004IncomingLinks(view);
		case PagoEditPart.VISUAL_ID:
			return getPago_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getOutgoingLinks(View view) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {
		case AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2001OutgoingLinks(view);
		case PersonaEditPart.VISUAL_ID:
			return getPersona_2002OutgoingLinks(view);
		case AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2003OutgoingLinks(view);
		case ValorDirectoEditPart.VISUAL_ID:
			return getValorDirecto_2004OutgoingLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_2005OutgoingLinks(view);
		case ProductoEditPart.VISUAL_ID:
			return getProducto_2006OutgoingLinks(view);
		case DocumentoComercialEditPart.VISUAL_ID:
			return getDocumentoComercial_2007OutgoingLinks(view);
		case ValorIndirectoEditPart.VISUAL_ID:
			return getValorIndirecto_2008OutgoingLinks(view);
		case AtributoCompuesto2EditPart.VISUAL_ID:
			return getAtributoCompuesto_3001OutgoingLinks(view);
		case AtributoSimple2EditPart.VISUAL_ID:
			return getAtributoSimple_3002OutgoingLinks(view);
		case AtributoCompuesto3EditPart.VISUAL_ID:
			return getAtributoCompuesto_3003OutgoingLinks(view);
		case AtributoSimple3EditPart.VISUAL_ID:
			return getAtributoSimple_3004OutgoingLinks(view);
		case PagoEditPart.VISUAL_ID:
			return getPago_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getNegocio_1000ContainedLinks(
			View view) {
		Negocio modelElement = (Negocio) view.getElement();
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Pago_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPersona_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorDirecto_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getServicio_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getProducto_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getDocumentoComercial_2007ContainedLinks(
			View view) {
		DocumentoComercial modelElement = (DocumentoComercial) view
				.getElement();
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DocumentoComercial_Personas_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorIndirecto_2008ContainedLinks(
			View view) {
		ValorIndirecto modelElement = (ValorIndirecto) view.getElement();
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ValorIndirecto_Justificante_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPago_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPersona_2002IncomingLinks(
			View view) {
		Persona modelElement = (Persona) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DocumentoComercial_Personas_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorDirecto_2004IncomingLinks(
			View view) {
		ValorDirecto modelElement = (ValorDirecto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pago_4004(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getServicio_2005IncomingLinks(
			View view) {
		Servicio modelElement = (Servicio) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getProducto_2006IncomingLinks(
			View view) {
		Producto modelElement = (Producto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getDocumentoComercial_2007IncomingLinks(
			View view) {
		DocumentoComercial modelElement = (DocumentoComercial) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ValorIndirecto_Justificante_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorIndirecto_2008IncomingLinks(
			View view) {
		ValorIndirecto modelElement = (ValorIndirecto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pago_4004(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPago_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPersona_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorDirecto_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getServicio_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getProducto_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getDocumentoComercial_2007OutgoingLinks(
			View view) {
		DocumentoComercial modelElement = (DocumentoComercial) view
				.getElement();
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DocumentoComercial_Personas_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Pago_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getValorIndirecto_2008OutgoingLinks(
			View view) {
		ValorIndirecto modelElement = (ValorIndirecto) view.getElement();
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ValorIndirecto_Justificante_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoCompuesto_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getAtributoSimple_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NegocioLinkDescriptor> getPago_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getContainedTypeModelFacetLinks_Pago_4004(
			Negocio container) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		for (Iterator<?> links = container.getPagos().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Pago) {
				continue;
			}
			Pago link = (Pago) linkObject;
			if (PagoEditPart.VISUAL_ID != NegocioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Valor dst = link.getValor();
			DocumentoComercial src = link.getDocumento();
			result.add(new NegocioLinkDescriptor(src, dst, link,
					NegocioElementTypes.Pago_4004, PagoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getIncomingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(
			Producto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == NegocioPackage.eINSTANCE
					.getDocumentoComercial_Producto()) {
				result.add(new NegocioLinkDescriptor(setting.getEObject(),
						target,
						NegocioElementTypes.DocumentoComercialProducto_4001,
						DocumentoComercialProductoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getIncomingFeatureModelFacetLinks_ValorIndirecto_Justificante_4002(
			DocumentoComercial target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == NegocioPackage.eINSTANCE
					.getValorIndirecto_Justificante()) {
				result.add(new NegocioLinkDescriptor(setting.getEObject(),
						target,
						NegocioElementTypes.ValorIndirectoJustificante_4002,
						ValorIndirectoJustificanteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getIncomingFeatureModelFacetLinks_DocumentoComercial_Personas_4003(
			Persona target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == NegocioPackage.eINSTANCE
					.getDocumentoComercial_Personas()) {
				result.add(new NegocioLinkDescriptor(setting.getEObject(),
						target,
						NegocioElementTypes.DocumentoComercialPersonas_4003,
						DocumentoComercialPersonasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getIncomingTypeModelFacetLinks_Pago_4004(
			Valor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != NegocioPackage.eINSTANCE
					.getPago_Valor()
					|| false == setting.getEObject() instanceof Pago) {
				continue;
			}
			Pago link = (Pago) setting.getEObject();
			if (PagoEditPart.VISUAL_ID != NegocioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DocumentoComercial src = link.getDocumento();
			result.add(new NegocioLinkDescriptor(src, target, link,
					NegocioElementTypes.Pago_4004, PagoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getOutgoingFeatureModelFacetLinks_DocumentoComercial_Producto_4001(
			DocumentoComercial source) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		for (Iterator<?> destinations = source.getProducto().iterator(); destinations
				.hasNext();) {
			Producto destination = (Producto) destinations.next();
			result.add(new NegocioLinkDescriptor(source, destination,
					NegocioElementTypes.DocumentoComercialProducto_4001,
					DocumentoComercialProductoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getOutgoingFeatureModelFacetLinks_ValorIndirecto_Justificante_4002(
			ValorIndirecto source) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		DocumentoComercial destination = source.getJustificante();
		if (destination == null) {
			return result;
		}
		result.add(new NegocioLinkDescriptor(source, destination,
				NegocioElementTypes.ValorIndirectoJustificante_4002,
				ValorIndirectoJustificanteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getOutgoingFeatureModelFacetLinks_DocumentoComercial_Personas_4003(
			DocumentoComercial source) {
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		for (Iterator<?> destinations = source.getPersonas().iterator(); destinations
				.hasNext();) {
			Persona destination = (Persona) destinations.next();
			result.add(new NegocioLinkDescriptor(source, destination,
					NegocioElementTypes.DocumentoComercialPersonas_4003,
					DocumentoComercialPersonasEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NegocioLinkDescriptor> getOutgoingTypeModelFacetLinks_Pago_4004(
			DocumentoComercial source) {
		Negocio container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Negocio) {
				container = (Negocio) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<NegocioLinkDescriptor> result = new LinkedList<NegocioLinkDescriptor>();
		for (Iterator<?> links = container.getPagos().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Pago) {
				continue;
			}
			Pago link = (Pago) linkObject;
			if (PagoEditPart.VISUAL_ID != NegocioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Valor dst = link.getValor();
			DocumentoComercial src = link.getDocumento();
			if (src != source) {
				continue;
			}
			result.add(new NegocioLinkDescriptor(src, dst, link,
					NegocioElementTypes.Pago_4004, PagoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<NegocioNodeDescriptor> getSemanticChildren(View view) {
			return NegocioDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NegocioLinkDescriptor> getContainedLinks(View view) {
			return NegocioDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NegocioLinkDescriptor> getIncomingLinks(View view) {
			return NegocioDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NegocioLinkDescriptor> getOutgoingLinks(View view) {
			return NegocioDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
