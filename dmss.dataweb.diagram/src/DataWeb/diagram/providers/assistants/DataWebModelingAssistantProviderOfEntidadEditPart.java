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
public class DataWebModelingAssistantProviderOfEntidadEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataWeb.diagram.edit.parts.EntidadEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataWeb.diagram.edit.parts.EntidadEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataWeb.diagram.edit.parts.EntidadEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataWeb.diagram.edit.parts.EntidadEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCreacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaActualizacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaBorradoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.EntidadEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataWeb.diagram.edit.parts.EntidadEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataWeb.diagram.edit.parts.EntidadEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008);
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataWeb.diagram.edit.parts.EntidadEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataWeb.diagram.edit.parts.EntidadEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWeb.diagram.edit.parts.EntidadEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataWeb.diagram.edit.parts.EntidadEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007);
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008);
		}
		return types;
	}

}
