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
public class DataWebModelingAssistantProviderOfAtributoEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataWeb.diagram.edit.parts.AtributoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataWeb.diagram.edit.parts.AtributoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWeb.diagram.edit.parts.AtributoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataWeb.diagram.edit.parts.AtributoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007);
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
		}
		return types;
	}

}
