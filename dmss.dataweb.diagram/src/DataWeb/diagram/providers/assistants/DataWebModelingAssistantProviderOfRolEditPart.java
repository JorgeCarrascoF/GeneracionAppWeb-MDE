/*
 * 
 */
package DataWeb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebModelingAssistantProviderOfRolEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataWeb.diagram.edit.parts.RolEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataWeb.diagram.edit.parts.RolEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataWeb.diagram.edit.parts.RolEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataWeb.diagram.edit.parts.RolEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCreacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaActualizacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaBorradoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaInicioEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaResultadosEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataWeb.diagram.edit.parts.RolEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataWeb.diagram.edit.parts.RolEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004) {
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
