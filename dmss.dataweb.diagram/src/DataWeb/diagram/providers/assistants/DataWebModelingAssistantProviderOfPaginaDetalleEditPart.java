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
public class DataWebModelingAssistantProviderOfPaginaDetalleEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataWeb.diagram.edit.parts.PaginaDetalleEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataWeb.diagram.edit.parts.PaginaDetalleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataWeb.diagram.edit.parts.PaginaDetalleEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataWeb.diagram.edit.parts.PaginaDetalleEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.EnlaceRRSSEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCreacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaDetalleEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaActualizacionEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaBorradoEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaIndiceEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaInicioEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.PaginaResultadosEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		}
		if (targetEditPart instanceof DataWeb.diagram.edit.parts.EntidadEditPart) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataWeb.diagram.edit.parts.PaginaDetalleEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataWeb.diagram.edit.parts.PaginaDetalleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014);
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009) {
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
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007) {
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
		return doGetRelTypesOnTarget((DataWeb.diagram.edit.parts.PaginaDetalleEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataWeb.diagram.edit.parts.PaginaDetalleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWeb.diagram.edit.parts.PaginaDetalleEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataWeb.diagram.edit.parts.PaginaDetalleEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009) {
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
		} else if (relationshipType == DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004) {
			types.add(DataWeb.diagram.providers.DataWebElementTypes.Rol_2013);
		}
		return types;
	}

}
