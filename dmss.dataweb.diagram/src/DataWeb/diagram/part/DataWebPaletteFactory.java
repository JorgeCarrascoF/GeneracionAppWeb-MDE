
/*
 * 
 */
package DataWeb.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DataWebPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(DataWeb.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createEnlaceRRSS2CreationTool());
		paletteContainer.add(createEntidad3CreationTool());
		paletteContainer.add(createPaginaActualizacion4CreationTool());
		paletteContainer.add(createPaginaBorrado5CreationTool());
		paletteContainer.add(createPaginaCRUDUnica6CreationTool());
		paletteContainer.add(createPaginaCreacion7CreationTool());
		paletteContainer.add(createPaginaDetalle8CreationTool());
		paletteContainer.add(createPaginaEncuestaCuestionario9CreationTool());
		paletteContainer.add(createPaginaIndice10CreationTool());
		paletteContainer.add(createPaginaIndiceDetalle11CreationTool());
		paletteContainer.add(createPaginaIndiceExtendido12CreationTool());
		paletteContainer.add(createPaginaInicio13CreationTool());
		paletteContainer.add(createPaginaResultados14CreationTool());
		paletteContainer.add(createPregunta15CreationTool());
		paletteContainer.add(createRol16CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(DataWeb.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributoFiltro1CreationTool());
		paletteContainer.add(createAtributosAMostrar2CreationTool());
		paletteContainer.add(createEnlacerrss3CreationTool());
		paletteContainer.add(createEnlacesPaginas4CreationTool());
		paletteContainer.add(createEntidad5CreationTool());
		paletteContainer.add(createPaginaencuestacuestionario6CreationTool());
		paletteContainer.add(createPaginaresultados7CreationTool());
		paletteContainer.add(createPaginas8CreationTool());
		paletteContainer.add(createPaginasAccesibles9CreationTool());
		paletteContainer.add(createReferencias10CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataWeb.diagram.part.Messages.Atributo1CreationTool_title,
				DataWeb.diagram.part.Messages.Atributo1CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.Atributo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnlaceRRSS2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.EnlaceRRSS2CreationTool_title,
				DataWeb.diagram.part.Messages.EnlaceRRSS2CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014));
		entry.setId("createEnlaceRRSS2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.EnlaceRRSS_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataWeb.diagram.part.Messages.Entidad3CreationTool_title,
				DataWeb.diagram.part.Messages.Entidad3CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012));
		entry.setId("createEntidad3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.Entidad_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaActualizacion4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaActualizacion4CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaActualizacion4CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005));
		entry.setId("createPaginaActualizacion4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaActualizacion_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaBorrado5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaBorrado5CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaBorrado5CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006));
		entry.setId("createPaginaBorrado5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaBorrado_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaCRUDUnica6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaCRUDUnica6CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaCRUDUnica6CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008));
		entry.setId("createPaginaCRUDUnica6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaCRUDUnica_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaCreacion7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaCreacion7CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaCreacion7CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003));
		entry.setId("createPaginaCreacion7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaCreacion_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaDetalle8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaDetalle8CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaDetalle8CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004));
		entry.setId("createPaginaDetalle8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaDetalle_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaEncuestaCuestionario9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaEncuestaCuestionario9CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaEncuestaCuestionario9CreationTool_desc, Collections
						.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010));
		entry.setId("createPaginaEncuestaCuestionario9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionario_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaIndice10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaIndice10CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaIndice10CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007));
		entry.setId("createPaginaIndice10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndice_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaIndiceDetalle11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaIndiceDetalle11CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaIndiceDetalle11CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001));
		entry.setId("createPaginaIndiceDetalle11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceDetalle_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaIndiceExtendido12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaIndiceExtendido12CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaIndiceExtendido12CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002));
		entry.setId("createPaginaIndiceExtendido12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendido_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaInicio13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaInicio13CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaInicio13CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009));
		entry.setId("createPaginaInicio13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaInicio_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaResultados14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.PaginaResultados14CreationTool_title,
				DataWeb.diagram.part.Messages.PaginaResultados14CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011));
		entry.setId("createPaginaResultados14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaResultados_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPregunta15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWeb.diagram.part.Messages.Pregunta15CreationTool_title,
				DataWeb.diagram.part.Messages.Pregunta15CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.Pregunta_3001));
		entry.setId("createPregunta15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.Pregunta_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataWeb.diagram.part.Messages.Rol16CreationTool_title,
				DataWeb.diagram.part.Messages.Rol16CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.Rol_2013));
		entry.setId("createRol16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.Rol_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributoFiltro1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.AtributoFiltro1CreationTool_title,
				DataWeb.diagram.part.Messages.AtributoFiltro1CreationTool_desc, Collections.singletonList(
						DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008));
		entry.setId("createAtributoFiltro1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes.getImageDescriptor(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceExtendidoAtributoFiltro_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributosAMostrar2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.AtributosAMostrar2CreationTool_title,
				DataWeb.diagram.part.Messages.AtributosAMostrar2CreationTool_desc, Collections.singletonList(
						DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005));
		entry.setId("createAtributosAMostrar2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaIndiceAtributosAMostrar_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnlacerrss3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.Enlacerrss3CreationTool_title,
				DataWeb.diagram.part.Messages.Enlacerrss3CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003));
		entry.setId("createEnlacerrss3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacerrss_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnlacesPaginas4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.EnlacesPaginas4CreationTool_title,
				DataWeb.diagram.part.Messages.EnlacesPaginas4CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009));
		entry.setId("createEnlacesPaginas4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaEnlacesPaginas_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(DataWeb.diagram.part.Messages.Entidad5CreationTool_title,
				DataWeb.diagram.part.Messages.Entidad5CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007));
		entry.setId("createEntidad5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.PaginaDeEntidadEntidad_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaencuestacuestionario6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.Paginaencuestacuestionario6CreationTool_title,
				DataWeb.diagram.part.Messages.Paginaencuestacuestionario6CreationTool_desc, Collections.singletonList(
						DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006));
		entry.setId("createPaginaencuestacuestionario6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes.getImageDescriptor(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaResultadosPaginaencuestacuestionario_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaresultados7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.Paginaresultados7CreationTool_title,
				DataWeb.diagram.part.Messages.Paginaresultados7CreationTool_desc, Collections.singletonList(
						DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010));
		entry.setId("createPaginaresultados7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes.getImageDescriptor(
				DataWeb.diagram.providers.DataWebElementTypes.PaginaEncuestaCuestionarioPaginaresultados_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginas8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(DataWeb.diagram.part.Messages.Paginas8CreationTool_title,
				DataWeb.diagram.part.Messages.Paginas8CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001));
		entry.setId("createPaginas8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.EntidadPaginas_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginasAccesibles9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.PaginasAccesibles9CreationTool_title,
				DataWeb.diagram.part.Messages.PaginasAccesibles9CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004));
		entry.setId("createPaginasAccesibles9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.RolPaginasAccesibles_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReferencias10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWeb.diagram.part.Messages.Referencias10CreationTool_title,
				DataWeb.diagram.part.Messages.Referencias10CreationTool_desc,
				Collections.singletonList(DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002));
		entry.setId("createReferencias10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWeb.diagram.providers.DataWebElementTypes
				.getImageDescriptor(DataWeb.diagram.providers.DataWebElementTypes.EntidadReferencias_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
