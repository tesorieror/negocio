package negocio.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import negocio.diagram.part.Messages;
import negocio.diagram.part.NegocioVisualIDRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class NegocioNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public NegocioNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<NegocioNavigatorItem> result = new ArrayList<NegocioNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, NegocioEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof NegocioNavigatorGroup) {
			NegocioNavigatorGroup group = (NegocioNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof NegocioNavigatorItem) {
			NegocioNavigatorItem navigatorItem = (NegocioNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (NegocioVisualIDRegistry.getVisualID(view)) {

		case NegocioEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			NegocioNavigatorGroup links = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Negocio_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoSimpleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PersonaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorDirectoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(ServicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(ProductoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialProductoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoJustificanteEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialPersonasEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PagoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PersonaEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Persona_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(PersonaPersonaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialPersonasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AtributoCompuestoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ValorDirectoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_ValorDirecto_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorDirectoValorDirectoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PagoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ServicioEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Servicio_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ServicioServicioAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ServicioServicioAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialProductoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProductoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Producto_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ProductoProductoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ProductoProductoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialProductoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DocumentoComercialEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup outgoinglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercial_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercial_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialProductoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoJustificanteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialPersonasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PagoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValorIndirectoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			NegocioNavigatorGroup outgoinglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_ValorIndirecto_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup incominglinks = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_ValorIndirecto_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoValorIndirectoAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoJustificanteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PagoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AtributoCompuesto2EditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtributoCompuesto3EditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoSimple2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(AtributoCompuestoAtributoCompuestoCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					NegocioVisualIDRegistry
							.getType(AtributoCompuesto3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DocumentoComercialProductoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			NegocioNavigatorGroup target = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercialProducto_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup source = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercialProducto_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(ServicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(ProductoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ValorIndirectoJustificanteEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			NegocioNavigatorGroup target = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_ValorIndirectoJustificante_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup source = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_ValorIndirectoJustificante_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DocumentoComercialPersonasEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			NegocioNavigatorGroup target = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercialPersonas_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup source = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_DocumentoComercialPersonas_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry.getType(PersonaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PagoEditPart.VISUAL_ID: {
			LinkedList<NegocioAbstractNavigatorItem> result = new LinkedList<NegocioAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			NegocioNavigatorGroup target = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Pago_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			NegocioNavigatorGroup source = new NegocioNavigatorGroup(
					Messages.NavigatorGroupName_Pago_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorDirectoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(ValorIndirectoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					NegocioVisualIDRegistry
							.getType(DocumentoComercialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return NegocioEditPart.MODEL_ID.equals(NegocioVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<NegocioNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<NegocioNavigatorItem> result = new ArrayList<NegocioNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new NegocioNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof NegocioAbstractNavigatorItem) {
			NegocioAbstractNavigatorItem abstractNavigatorItem = (NegocioAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
