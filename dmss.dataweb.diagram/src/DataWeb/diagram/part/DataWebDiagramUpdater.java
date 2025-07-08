/*
* 
*/
package DataWeb.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DataWebDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebNodeDescriptor> getSemanticChildren(View view) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000SemanticChildren(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartment_7001SemanticChildren(
					view);
		case DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			return getEntidadEntidadAtributosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebNodeDescriptor> getAplicacion_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DataWeb.Aplicacion modelElement = (DataWeb.Aplicacion) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPaginas().iterator(); it.hasNext();) {
			DataWeb.Pagina childElement = (DataWeb.Pagina) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntidades().iterator(); it.hasNext();) {
			DataWeb.Entidad childElement = (DataWeb.Entidad) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			DataWeb.Rol childElement = (DataWeb.Rol) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnlaces().iterator(); it.hasNext();) {
			DataWeb.EnlaceRRSS childElement = (DataWeb.EnlaceRRSS) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebNodeDescriptor> getPaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataWeb.PaginaEncuestaCuestionario modelElement = (DataWeb.PaginaEncuestaCuestionario) containerView
				.getElement();
		LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPreguntas().iterator(); it.hasNext();) {
			DataWeb.Pregunta childElement = (DataWeb.Pregunta) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebNodeDescriptor> getEntidadEntidadAtributosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataWeb.Entidad modelElement = (DataWeb.Entidad) containerView.getElement();
		LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			DataWeb.Atributo childElement = (DataWeb.Atributo) it.next();
			int visualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID) {
				result.add(new DataWeb.diagram.part.DataWebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getContainedLinks(View view) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			return getPaginaIndiceDetalle_2001ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			return getPaginaIndiceExtendido_2002ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			return getPaginaCreacion_2003ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			return getPaginaDetalle_2004ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			return getPaginaActualizacion_2005ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			return getPaginaBorrado_2006ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			return getPaginaIndice_2007ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			return getPaginaCRUDUnica_2008ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			return getPaginaInicio_2009ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionario_2010ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			return getPaginaResultados_2011ContainedLinks(view);
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2012ContainedLinks(view);
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2013ContainedLinks(view);
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			return getEnlaceRRSS_2014ContainedLinks(view);
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001ContainedLinks(view);
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingLinks(View view) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			return getPaginaIndiceDetalle_2001IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			return getPaginaIndiceExtendido_2002IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			return getPaginaCreacion_2003IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			return getPaginaDetalle_2004IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			return getPaginaActualizacion_2005IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			return getPaginaBorrado_2006IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			return getPaginaIndice_2007IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			return getPaginaCRUDUnica_2008IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			return getPaginaInicio_2009IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionario_2010IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			return getPaginaResultados_2011IncomingLinks(view);
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2012IncomingLinks(view);
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2013IncomingLinks(view);
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			return getEnlaceRRSS_2014IncomingLinks(view);
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001IncomingLinks(view);
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingLinks(View view) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			return getPaginaIndiceDetalle_2001OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			return getPaginaIndiceExtendido_2002OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			return getPaginaCreacion_2003OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			return getPaginaDetalle_2004OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			return getPaginaActualizacion_2005OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			return getPaginaBorrado_2006OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			return getPaginaIndice_2007OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			return getPaginaCRUDUnica_2008OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			return getPaginaInicio_2009OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			return getPaginaEncuestaCuestionario_2010OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			return getPaginaResultados_2011OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2012OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2013OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			return getEnlaceRRSS_2014OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001OutgoingLinks(view);
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getAplicacion_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceDetalle_2001ContainedLinks(
			View view) {
		DataWeb.PaginaIndiceDetalle modelElement = (DataWeb.PaginaIndiceDetalle) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceExtendido_2002ContainedLinks(
			View view) {
		DataWeb.PaginaIndiceExtendido modelElement = (DataWeb.PaginaIndiceExtendido) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndiceExtendido_AtributoFiltro_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCreacion_2003ContainedLinks(View view) {
		DataWeb.PaginaCreacion modelElement = (DataWeb.PaginaCreacion) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaDetalle_2004ContainedLinks(View view) {
		DataWeb.PaginaDetalle modelElement = (DataWeb.PaginaDetalle) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaActualizacion_2005ContainedLinks(
			View view) {
		DataWeb.PaginaActualizacion modelElement = (DataWeb.PaginaActualizacion) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaBorrado_2006ContainedLinks(View view) {
		DataWeb.PaginaBorrado modelElement = (DataWeb.PaginaBorrado) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndice_2007ContainedLinks(View view) {
		DataWeb.PaginaIndice modelElement = (DataWeb.PaginaIndice) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCRUDUnica_2008ContainedLinks(View view) {
		DataWeb.PaginaCRUDUnica modelElement = (DataWeb.PaginaCRUDUnica) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaInicio_2009ContainedLinks(View view) {
		DataWeb.PaginaInicio modelElement = (DataWeb.PaginaInicio) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaEncuestaCuestionario_2010ContainedLinks(
			View view) {
		DataWeb.PaginaEncuestaCuestionario modelElement = (DataWeb.PaginaEncuestaCuestionario) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaEncuestaCuestionario_Paginaresultados_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaResultados_2011ContainedLinks(View view) {
		DataWeb.PaginaResultados modelElement = (DataWeb.PaginaResultados) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaResultados_Paginaencuestacuestionario_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEntidad_2012ContainedLinks(View view) {
		DataWeb.Entidad modelElement = (DataWeb.Entidad) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Referencias_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getRol_2013ContainedLinks(View view) {
		DataWeb.Rol modelElement = (DataWeb.Rol) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEnlaceRRSS_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPregunta_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getAtributo_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceDetalle_2001IncomingLinks(View view) {
		DataWeb.PaginaIndiceDetalle modelElement = (DataWeb.PaginaIndiceDetalle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceExtendido_2002IncomingLinks(
			View view) {
		DataWeb.PaginaIndiceExtendido modelElement = (DataWeb.PaginaIndiceExtendido) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCreacion_2003IncomingLinks(View view) {
		DataWeb.PaginaCreacion modelElement = (DataWeb.PaginaCreacion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaDetalle_2004IncomingLinks(View view) {
		DataWeb.PaginaDetalle modelElement = (DataWeb.PaginaDetalle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaActualizacion_2005IncomingLinks(View view) {
		DataWeb.PaginaActualizacion modelElement = (DataWeb.PaginaActualizacion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaBorrado_2006IncomingLinks(View view) {
		DataWeb.PaginaBorrado modelElement = (DataWeb.PaginaBorrado) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndice_2007IncomingLinks(View view) {
		DataWeb.PaginaIndice modelElement = (DataWeb.PaginaIndice) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCRUDUnica_2008IncomingLinks(View view) {
		DataWeb.PaginaCRUDUnica modelElement = (DataWeb.PaginaCRUDUnica) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaInicio_2009IncomingLinks(View view) {
		DataWeb.PaginaInicio modelElement = (DataWeb.PaginaInicio) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaEncuestaCuestionario_2010IncomingLinks(
			View view) {
		DataWeb.PaginaEncuestaCuestionario modelElement = (DataWeb.PaginaEncuestaCuestionario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaResultados_Paginaencuestacuestionario_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaResultados_2011IncomingLinks(View view) {
		DataWeb.PaginaResultados modelElement = (DataWeb.PaginaResultados) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaEncuestaCuestionario_Paginaresultados_4010(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEntidad_2012IncomingLinks(View view) {
		DataWeb.Entidad modelElement = (DataWeb.Entidad) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Referencias_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getRol_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEnlaceRRSS_2014IncomingLinks(View view) {
		DataWeb.EnlaceRRSS modelElement = (DataWeb.EnlaceRRSS) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPregunta_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getAtributo_3002IncomingLinks(View view) {
		DataWeb.Atributo modelElement = (DataWeb.Atributo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaIndiceExtendido_AtributoFiltro_4008(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceDetalle_2001OutgoingLinks(View view) {
		DataWeb.PaginaIndiceDetalle modelElement = (DataWeb.PaginaIndiceDetalle) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndiceExtendido_2002OutgoingLinks(
			View view) {
		DataWeb.PaginaIndiceExtendido modelElement = (DataWeb.PaginaIndiceExtendido) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndiceExtendido_AtributoFiltro_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCreacion_2003OutgoingLinks(View view) {
		DataWeb.PaginaCreacion modelElement = (DataWeb.PaginaCreacion) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaDetalle_2004OutgoingLinks(View view) {
		DataWeb.PaginaDetalle modelElement = (DataWeb.PaginaDetalle) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaActualizacion_2005OutgoingLinks(View view) {
		DataWeb.PaginaActualizacion modelElement = (DataWeb.PaginaActualizacion) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaBorrado_2006OutgoingLinks(View view) {
		DataWeb.PaginaBorrado modelElement = (DataWeb.PaginaBorrado) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaIndice_2007OutgoingLinks(View view) {
		DataWeb.PaginaIndice modelElement = (DataWeb.PaginaIndice) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaCRUDUnica_2008OutgoingLinks(View view) {
		DataWeb.PaginaCRUDUnica modelElement = (DataWeb.PaginaCRUDUnica) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaInicio_2009OutgoingLinks(View view) {
		DataWeb.PaginaInicio modelElement = (DataWeb.PaginaInicio) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaEncuestaCuestionario_2010OutgoingLinks(
			View view) {
		DataWeb.PaginaEncuestaCuestionario modelElement = (DataWeb.PaginaEncuestaCuestionario) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaEncuestaCuestionario_Paginaresultados_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPaginaResultados_2011OutgoingLinks(View view) {
		DataWeb.PaginaResultados modelElement = (DataWeb.PaginaResultados) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaResultados_Paginaencuestacuestionario_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEntidad_2012OutgoingLinks(View view) {
		DataWeb.Entidad modelElement = (DataWeb.Entidad) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Paginas_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Referencias_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getRol_2013OutgoingLinks(View view) {
		DataWeb.Rol modelElement = (DataWeb.Rol) view.getElement();
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getEnlaceRRSS_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getPregunta_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWeb.diagram.part.DataWebLinkDescriptor> getAtributo_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Paginas_4001(
			DataWeb.PaginaDeEntidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getEntidad_Paginas()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001,
						DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Referencias_4002(
			DataWeb.Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getEntidad_Referencias()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002,
						DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(
			DataWeb.EnlaceRRSS target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getPagina_Enlacerrss()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003,
						DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(
			DataWeb.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getPagina_EnlacesPaginas()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009,
						DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(
			DataWeb.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getRol_PaginasAccesibles()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004,
						DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(
			DataWeb.Atributo target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE
					.getPaginaIndice_AtributosAMostrar()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005,
						DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaEncuestaCuestionario_Paginaresultados_4010(
			DataWeb.PaginaResultados target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE
					.getPaginaEncuestaCuestionario_Paginaresultados()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010,
						DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaResultados_Paginaencuestacuestionario_4006(
			DataWeb.PaginaEncuestaCuestionario target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE
					.getPaginaResultados_Paginaencuestacuestionario()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006,
						DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(
			DataWeb.Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE.getPaginaDeEntidad_Entidad()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007,
						DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaIndiceExtendido_AtributoFiltro_4008(
			DataWeb.Atributo target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWeb.DataWebPackage.eINSTANCE
					.getPaginaIndiceExtendido_AtributoFiltro()) {
				result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(setting.getEObject(), target,
						DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008,
						DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Paginas_4001(
			DataWeb.Entidad source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getPaginas().iterator(); destinations.hasNext();) {
			DataWeb.PaginaDeEntidad destination = (DataWeb.PaginaDeEntidad) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001,
					DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Referencias_4002(
			DataWeb.Entidad source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getReferencias().iterator(); destinations.hasNext();) {
			DataWeb.Entidad destination = (DataWeb.Entidad) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002,
					DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Pagina_Enlacerrss_4003(
			DataWeb.Pagina source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getEnlacerrss().iterator(); destinations.hasNext();) {
			DataWeb.EnlaceRRSS destination = (DataWeb.EnlaceRRSS) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003,
					DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Pagina_EnlacesPaginas_4009(
			DataWeb.Pagina source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getEnlacesPaginas().iterator(); destinations.hasNext();) {
			DataWeb.Pagina destination = (DataWeb.Pagina) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009,
					DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rol_PaginasAccesibles_4004(
			DataWeb.Rol source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getPaginasAccesibles().iterator(); destinations.hasNext();) {
			DataWeb.Pagina destination = (DataWeb.Pagina) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004,
					DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaIndice_AtributosAMostrar_4005(
			DataWeb.PaginaIndice source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getAtributosAMostrar().iterator(); destinations.hasNext();) {
			DataWeb.Atributo destination = (DataWeb.Atributo) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005,
					DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaEncuestaCuestionario_Paginaresultados_4010(
			DataWeb.PaginaEncuestaCuestionario source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		DataWeb.PaginaResultados destination = source.getPaginaresultados();
		if (destination == null) {
			return result;
		}
		result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010,
				DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaResultados_Paginaencuestacuestionario_4006(
			DataWeb.PaginaResultados source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		DataWeb.PaginaEncuestaCuestionario destination = source.getPaginaencuestacuestionario();
		if (destination == null) {
			return result;
		}
		result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
				DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006,
				DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaDeEntidad_Entidad_4007(
			DataWeb.PaginaDeEntidad source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		DataWeb.Entidad destination = source.getEntidad();
		if (destination == null) {
			return result;
		}
		result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
				DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007,
				DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaIndiceExtendido_AtributoFiltro_4008(
			DataWeb.PaginaIndiceExtendido source) {
		LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor> result = new LinkedList<DataWeb.diagram.part.DataWebLinkDescriptor>();
		for (Iterator<?> destinations = source.getAtributoFiltro().iterator(); destinations.hasNext();) {
			DataWeb.Atributo destination = (DataWeb.Atributo) destinations.next();
			result.add(new DataWeb.diagram.part.DataWebLinkDescriptor(source, destination,
					DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008,
					DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID));
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

		public List<DataWeb.diagram.part.DataWebNodeDescriptor> getSemanticChildren(View view) {
			return DataWebDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWeb.diagram.part.DataWebLinkDescriptor> getContainedLinks(View view) {
			return DataWebDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWeb.diagram.part.DataWebLinkDescriptor> getIncomingLinks(View view) {
			return DataWebDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWeb.diagram.part.DataWebLinkDescriptor> getOutgoingLinks(View view) {
			return DataWebDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
