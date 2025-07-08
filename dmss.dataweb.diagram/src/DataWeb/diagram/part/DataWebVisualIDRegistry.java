/*
* 
*/
package DataWeb.diagram.part;

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
public class DataWebVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dmss.dataweb.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID.equals(view.getType())) {
				return DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (DataWeb.DataWebPackage.eINSTANCE.getAplicacion().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DataWeb.Aplicacion) domainElement)) {
			return DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID;
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
		String containerModelID = DataWeb.diagram.part.DataWebVisualIDRegistry.getModelID(containerView);
		if (!DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataWeb".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaIndiceDetalle().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaIndiceExtendido().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaCreacion().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaDetalle().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaActualizacion().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaBorrado().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaIndice().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaCRUDUnica().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaInicio().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaEncuestaCuestionario()
					.isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getPaginaResultados().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getEntidad().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID;
			}
			if (DataWeb.DataWebPackage.eINSTANCE.getEnlaceRRSS().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
			if (DataWeb.DataWebPackage.eINSTANCE.getPregunta().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID;
			}
			break;
		case DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			if (DataWeb.DataWebPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = DataWeb.diagram.part.DataWebVisualIDRegistry.getModelID(containerView);
		if (!DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataWeb".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceDetalleIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceExtendidoIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaCreacionIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaDetalleIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaActualizacionIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaBorradoIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaCRUDUnicaIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaInicioIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaResultadosIdPaginaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.RolNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.EnlaceRRSSNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PreguntaEnunciadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.EntidadPaginasExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.EntidadReferenciasExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaEnlacerrssExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaEnlacesPaginasExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.RolPaginasAccesiblesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID:
			if (DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DataWeb.Aplicacion element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
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
		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID:
			return false;
		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
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
			return DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return DataWeb.diagram.part.DataWebVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return DataWeb.diagram.part.DataWebVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return DataWeb.diagram.part.DataWebVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return DataWeb.diagram.part.DataWebVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return DataWeb.diagram.part.DataWebVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
