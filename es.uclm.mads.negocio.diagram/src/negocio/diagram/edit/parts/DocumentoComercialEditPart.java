package negocio.diagram.edit.parts;

import negocio.diagram.edit.policies.DocumentoComercialItemSemanticEditPolicy;
import negocio.diagram.edit.policies.NegocioTextSelectionEditPolicy;
import negocio.diagram.part.NegocioVisualIDRegistry;
import negocio.diagram.providers.NegocioElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class DocumentoComercialEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DocumentoComercialEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						NegocioVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DocumentoComercialItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new NegocioTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DocumentoComercialFigure();
	}

	/**
	 * @generated
	 */
	public DocumentoComercialFigure getPrimaryShape() {
		return (DocumentoComercialFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DocumentoComercialNombreEditPart) {
			((DocumentoComercialNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDocumentoComercialNombreFigure());
			return true;
		}
		if (childEditPart instanceof DocumentoComercialDocumentoComercialAtributoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDocumentoComercialAtributoCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DocumentoComercialDocumentoComercialAtributoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DocumentoComercialNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof DocumentoComercialDocumentoComercialAtributoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDocumentoComercialAtributoCompartmentFigure();
			pane.remove(((DocumentoComercialDocumentoComercialAtributoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof DocumentoComercialDocumentoComercialAtributoCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureDocumentoComercialAtributoCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(NegocioVisualIDRegistry
				.getType(DocumentoComercialNombreEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == NegocioElementTypes.AtributoCompuesto_3001) {
				return getChildBySemanticHint(NegocioVisualIDRegistry
						.getType(DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID));
			}
			if (type == NegocioElementTypes.AtributoSimple_3004) {
				return getChildBySemanticHint(NegocioVisualIDRegistry
						.getType(DocumentoComercialDocumentoComercialAtributoCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DocumentoComercialFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureDocumentoComercialAtributoCompartmentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDocumentoComercialNombreFigure;

		/**
		 * @generated
		 */
		public DocumentoComercialFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setForegroundColor(THIS_FORE);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDocumentoComercialNombreFigure = new WrappingLabel();

			fFigureDocumentoComercialNombreFigure.setText("<...>");

			fFigureDocumentoComercialNombreFigure
					.setFont(FFIGUREDOCUMENTOCOMERCIALNOMBREFIGURE_FONT);

			fFigureDocumentoComercialNombreFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			this.add(fFigureDocumentoComercialNombreFigure);

			fFigureDocumentoComercialAtributoCompartmentFigure = new RectangleFigure();

			fFigureDocumentoComercialAtributoCompartmentFigure.setFill(false);
			fFigureDocumentoComercialAtributoCompartmentFigure
					.setOutline(false);

			this.add(fFigureDocumentoComercialAtributoCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDocumentoComercialAtributoCompartmentFigure() {
			return fFigureDocumentoComercialAtributoCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDocumentoComercialNombreFigure() {
			return fFigureDocumentoComercialNombreFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 204, 102, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREDOCUMENTOCOMERCIALNOMBREFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
