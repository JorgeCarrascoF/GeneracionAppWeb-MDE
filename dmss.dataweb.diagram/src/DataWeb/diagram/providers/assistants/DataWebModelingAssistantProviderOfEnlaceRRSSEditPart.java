/*
 * 
 */
package DataWeb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebModelingAssistantProviderOfEnlaceRRSSEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataWeb.diagram.edit.parts.EnlaceRRSSEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataWeb.diagram.edit.parts.EnlaceRRSSEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWeb.diagram.edit.parts.EnlaceRRSSEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataWeb.diagram.edit.parts.EnlaceRRSSEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011);
		}
		return types;
	}

}
