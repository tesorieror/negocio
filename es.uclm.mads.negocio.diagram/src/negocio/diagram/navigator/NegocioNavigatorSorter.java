package negocio.diagram.navigator;

import negocio.diagram.part.NegocioVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class NegocioNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof NegocioNavigatorItem) {
			NegocioNavigatorItem item = (NegocioNavigatorItem) element;
			return NegocioVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
