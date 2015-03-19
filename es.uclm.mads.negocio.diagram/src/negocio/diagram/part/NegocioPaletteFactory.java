package negocio.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NegocioPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNegocio1Group());
	}

	/**
	 * Creates "negocio" palette tool group
	 * @generated
	 */
	private PaletteContainer createNegocio1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Negocio1Group_title);
		paletteContainer.setId("createNegocio1Group"); //$NON-NLS-1$
		paletteContainer.add(createPersona1CreationTool());
		paletteContainer.add(createProducto2CreationTool());
		paletteContainer.add(createServicio3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDocumentoComercial5CreationTool());
		paletteContainer.add(createDocumentoComercialProducto6CreationTool());
		paletteContainer.add(createDocumentoComercialPersonas7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAtributoSimple9CreationTool());
		paletteContainer.add(createAtributoCompuesto10CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createValorDirecto12CreationTool());
		paletteContainer.add(createValorIndirecto13CreationTool());
		paletteContainer.add(createValorIndirectoJustificante14CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createPago16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPersona1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Persona1CreationTool_title,
				Messages.Persona1CreationTool_desc,
				Collections.singletonList(NegocioElementTypes.Persona_2002));
		entry.setId("createPersona1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.Persona_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProducto2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Producto2CreationTool_title,
				Messages.Producto2CreationTool_desc,
				Collections.singletonList(NegocioElementTypes.Producto_2006));
		entry.setId("createProducto2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.Producto_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServicio3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Servicio3CreationTool_title,
				Messages.Servicio3CreationTool_desc,
				Collections.singletonList(NegocioElementTypes.Servicio_2005));
		entry.setId("createServicio3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.Servicio_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocumentoComercial5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DocumentoComercial5CreationTool_title,
				Messages.DocumentoComercial5CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.DocumentoComercial_2007));
		entry.setId("createDocumentoComercial5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.DocumentoComercial_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocumentoComercialProducto6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DocumentoComercialProducto6CreationTool_title,
				Messages.DocumentoComercialProducto6CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.DocumentoComercialProducto_4001));
		entry.setId("createDocumentoComercialProducto6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/DocumentoComercialProducto.gif")); //$NON-NLS-1$
		entry.setLargeIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/DocumentoComercialProducto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocumentoComercialPersonas7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DocumentoComercialPersonas7CreationTool_title,
				Messages.DocumentoComercialPersonas7CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.DocumentoComercialPersonas_4003));
		entry.setId("createDocumentoComercialPersonas7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/DocumentoComercialPersona.gif")); //$NON-NLS-1$
		entry.setLargeIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/DocumentoComercialProducto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributoSimple9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(NegocioElementTypes.AtributoSimple_2001);
		types.add(NegocioElementTypes.AtributoSimple_3002);
		types.add(NegocioElementTypes.AtributoSimple_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtributoSimple9CreationTool_title,
				Messages.AtributoSimple9CreationTool_desc, types);
		entry.setId("createAtributoSimple9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.AtributoSimple_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributoCompuesto10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(NegocioElementTypes.AtributoCompuesto_3001);
		types.add(NegocioElementTypes.AtributoCompuesto_3003);
		types.add(NegocioElementTypes.AtributoCompuesto_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtributoCompuesto10CreationTool_title,
				Messages.AtributoCompuesto10CreationTool_desc, types);
		entry.setId("createAtributoCompuesto10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.AtributoCompuesto_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValorDirecto12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValorDirecto12CreationTool_title,
				Messages.ValorDirecto12CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.ValorDirecto_2004));
		entry.setId("createValorDirecto12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.ValorDirecto_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValorIndirecto13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValorIndirecto13CreationTool_title,
				Messages.ValorIndirecto13CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.ValorIndirecto_2008));
		entry.setId("createValorIndirecto13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.ValorIndirecto_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValorIndirectoJustificante14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ValorIndirectoJustificante14CreationTool_title,
				Messages.ValorIndirectoJustificante14CreationTool_desc,
				Collections
						.singletonList(NegocioElementTypes.ValorIndirectoJustificante_4002));
		entry.setId("createValorIndirectoJustificante14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/Justificante.gif")); //$NON-NLS-1$
		entry.setLargeIcon(NegocioDiagramEditorPlugin
				.findImageDescriptor("/es.uclm.mads.negocio.edit/icons/full/obj16/Justificante.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPago16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Pago16CreationTool_title,
				Messages.Pago16CreationTool_desc,
				Collections.singletonList(NegocioElementTypes.Pago_4004));
		entry.setId("createPago16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NegocioElementTypes
				.getImageDescriptor(NegocioElementTypes.Pago_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
