/*
 * 
 */
package DataWeb.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DataWebEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {

			case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.AplicacionEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceDetalleIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceDetalleIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceExtendidoIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaCreacionEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaCreacionIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaCreacionIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaDetalleEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaDetalleIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaDetalleIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaActualizacionEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaActualizacionIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaActualizacionIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaBorradoEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaBorradoIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaBorradoIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaCRUDUnicaIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaCRUDUnicaIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaInicioEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaInicioIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaInicioIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaResultadosEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaResultadosIdPaginaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaResultadosIdPaginaEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadNombreEditPart(view);

			case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.RolEditPart(view);

			case DataWeb.diagram.edit.parts.RolNombreEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.RolNombreEditPart(view);

			case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EnlaceRRSSEditPart(view);

			case DataWeb.diagram.edit.parts.EnlaceRRSSNombreEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EnlaceRRSSNombreEditPart(view);

			case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PreguntaEditPart(view);

			case DataWeb.diagram.edit.parts.PreguntaEnunciadoEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PreguntaEnunciadoEditPart(view);

			case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.AtributoEditPart(view);

			case DataWeb.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.AtributoNombreEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart(
						view);

			case DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadPaginasEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadPaginasExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadPaginasExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadReferenciasEditPart(view);

			case DataWeb.diagram.edit.parts.EntidadReferenciasExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.EntidadReferenciasExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEnlacerrssExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEnlacerrssExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEnlacesPaginasExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart(view);

			case DataWeb.diagram.edit.parts.RolPaginasAccesiblesExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.RolPaginasAccesiblesExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosExternalLabelEditPart(
						view);

			case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioExternalLabelEditPart(
						view);

			case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadExternalLabelEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart(view);

			case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroExternalLabelEditPart.VISUAL_ID:
				return new DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroExternalLabelEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
