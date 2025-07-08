/*
 * 
 */
package DataWeb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebModelingAssistantProviderOfAplicacionEditPart
		extends DataWeb.diagram.providers.DataWebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(14);
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
		types.add(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.Rol_2013);
		types.add(DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014);
		return types;
	}

}
