/*
* 
*/
package DataWeb.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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
public class DataWebNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DataWeb.diagram.navigator.DataWebNavigatorItem
				&& !isOwnView(((DataWeb.diagram.navigator.DataWebNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DataWeb.diagram.navigator.DataWebNavigatorGroup) {
			DataWeb.diagram.navigator.DataWebNavigatorGroup group = (DataWeb.diagram.navigator.DataWebNavigatorGroup) element;
			return DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DataWeb.diagram.navigator.DataWebNavigatorItem) {
			DataWeb.diagram.navigator.DataWebNavigatorItem navigatorItem = (DataWeb.diagram.navigator.DataWebNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://example.org/DataWeb?Aplicacion", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.Aplicacion_1000);
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaIndiceDetalle", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaIndiceExtendido", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaCreacion", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003);
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaDetalle", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004);
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaActualizacion", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005);
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaBorrado", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006);
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaIndice", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007);
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaCRUDUnica", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008);
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaInicio", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaEncuestaCuestionario", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010);
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?PaginaResultados", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011);
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?Entidad", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?Rol", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.Rol_2013);
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://example.org/DataWeb?EnlaceRRSS", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014);
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://example.org/DataWeb?Pregunta", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.Pregunta_3001);
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://example.org/DataWeb?Atributo", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002);
		case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?Entidad?paginas", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		case DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?Entidad?referencias", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002);
		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?Pagina?enlacerrss", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003);
		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?Rol?paginasAccesibles", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?PaginaIndice?atributosAMostrar", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005);
		case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?PaginaResultados?paginaencuestacuestionario", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006);
		case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?PaginaDeEntidad?entidad", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?PaginaIndiceExtendido?atributoFiltro", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008);
		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?Pagina?enlacesPaginas", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://example.org/DataWeb?PaginaEncuestaCuestionario?paginaresultados", //$NON-NLS-1$
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DataWeb.diagram.providers.DataWebElementTypes.isKnownElementType(elementType)) {
			image = DataWeb.diagram.providers.DataWebElementTypes.getImage(elementType);
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
		if (element instanceof DataWeb.diagram.navigator.DataWebNavigatorGroup) {
			DataWeb.diagram.navigator.DataWebNavigatorGroup group = (DataWeb.diagram.navigator.DataWebNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DataWeb.diagram.navigator.DataWebNavigatorItem) {
			DataWeb.diagram.navigator.DataWebNavigatorItem navigatorItem = (DataWeb.diagram.navigator.DataWebNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000Text(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			return getPaginaIndiceDetalle_2001Text(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			return getPaginaIndiceExtendido_2002Text(view);
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			return getPaginaCreacion_2003Text(view);
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			return getPaginaDetalle_2004Text(view);
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			return getPaginaActualizacion_2005Text(view);
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			return getPaginaBorrado_2006Text(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			return getPaginaIndice_2007Text(view);
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			return getPaginaCRUDUnica_2008Text(view);
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			return getPaginaInicio_2009Text(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionario_2010Text(view);
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			return getPaginaResultados_2011Text(view);
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2012Text(view);
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2013Text(view);
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			return getEnlaceRRSS_2014Text(view);
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001Text(view);
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002Text(view);
		case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID:
			return getEntidadPaginas_4001Text(view);
		case DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID:
			return getEntidadReferencias_4002Text(view);
		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
			return getPaginaEnlacerrss_4003Text(view);
		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
			return getRolPaginasAccesibles_4004Text(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID:
			return getPaginaIndiceAtributosAMostrar_4005Text(view);
		case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID:
			return getPaginaResultadosPaginaencuestacuestionario_4006Text(view);
		case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID:
			return getPaginaDeEntidadEntidad_4007Text(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID:
			return getPaginaIndiceExtendidoAtributoFiltro_4008Text(view);
		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
			return getPaginaEnlacesPaginas_4009Text(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionarioPaginaresultados_4010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getAplicacion_1000Text(View view) {
		DataWeb.Aplicacion domainModelElement = (DataWeb.Aplicacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdApp();
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaIndiceDetalle_2001Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaIndiceExtendido_2002Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaCreacion_2003Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaCreacionIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaDetalle_2004Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaDetalleIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaActualizacion_2005Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaActualizacionIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaBorrado_2006Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaBorradoIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaIndice_2007Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaIndiceIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaCRUDUnica_2008Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaInicio_2009Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaInicioIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaEncuestaCuestionario_2010Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaResultados_2011Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PaginaResultadosIdPaginaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidad_2012Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_2013Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.Rol_2013,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.RolNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnlaceRRSS_2014Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.EnlaceRRSSNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPregunta_3001Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.Pregunta_3001,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.PreguntaEnunciadoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributo_3002Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002,
				view.getElement() != null ? view.getElement() : view, DataWeb.diagram.part.DataWebVisualIDRegistry
						.getType(DataWeb.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadPaginas_4001Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadReferencias_4002Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaEnlacerrss_4003Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolPaginasAccesibles_4004Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaIndiceAtributosAMostrar_4005Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaResultadosPaginaencuestacuestionario_4006Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaDeEntidadEntidad_4007Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaIndiceExtendidoAtributoFiltro_4008Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaEnlacesPaginas_4009Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaEncuestaCuestionarioPaginaresultados_4010Text(View view) {
		IParser parser = DataWeb.diagram.providers.DataWebParserProvider.getParser(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6010); //$NON-NLS-1$
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
		return DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID
				.equals(DataWeb.diagram.part.DataWebVisualIDRegistry.getModelID(view));
	}

}
