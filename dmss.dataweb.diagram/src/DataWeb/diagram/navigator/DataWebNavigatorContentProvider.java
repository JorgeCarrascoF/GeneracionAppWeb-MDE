/*
* 
*/
package DataWeb.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class DataWebNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DataWebNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DataWeb.diagram.navigator.DataWebNavigatorItem> result = new ArrayList<DataWeb.diagram.navigator.DataWebNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof DataWeb.diagram.navigator.DataWebNavigatorGroup) {
			DataWeb.diagram.navigator.DataWebNavigatorGroup group = (DataWeb.diagram.navigator.DataWebNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DataWeb.diagram.navigator.DataWebNavigatorItem) {
			DataWeb.diagram.navigator.DataWebNavigatorItem navigatorItem = (DataWeb.diagram.navigator.DataWebNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DataWeb.diagram.part.DataWebVisualIDRegistry.getVisualID(view)) {

		case DataWeb.diagram.edit.parts.AplicacionEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup links = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_Aplicacion_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceDetalle_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceDetalle_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceExtendido_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceExtendido_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaCreacion_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaCreacion_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaDetalle_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaDetalle_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaActualizacion_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaActualizacion_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaBorrado_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaBorrado_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndice_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndice_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaCRUDUnica_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaCRUDUnica_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaInicio_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaInicio_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEncuestaCuestionario_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEncuestaCuestionario_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaEncuestaCuestionarioPreguntasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.PreguntaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaResultados_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaResultados_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry.getType(
							DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_Entidad_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_Entidad_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataWeb.diagram.part.DataWebVisualIDRegistry
					.getType(DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup outgoinglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_Rol_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_EnlaceRRSS_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup incominglinks = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_Atributo_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.EntidadPaginasEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_EntidadPaginas_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_EntidadPaginas_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.EntidadReferenciasEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_EntidadReferencias_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_EntidadReferencias_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaEnlacerrssEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEnlacerrss_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEnlacerrss_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EnlaceRRSSEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.RolPaginasAccesiblesEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_RolPaginasAccesibles_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_RolPaginasAccesibles_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaIndiceAtributosAMostrarEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceAtributosAMostrar_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceAtributosAMostrar_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaResultadosPaginaencuestacuestionarioEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaResultadosPaginaencuestacuestionario_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaResultadosPaginaencuestacuestionario_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaDeEntidadEntidadEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaDeEntidadEntidad_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaDeEntidadEntidad_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaIndiceExtendidoAtributoFiltroEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceExtendidoAtributoFiltro_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaIndiceExtendidoAtributoFiltro_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.AtributoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaEnlacesPaginasEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEnlacesPaginas_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEnlacesPaginas_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCreacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaActualizacionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaBorradoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaIndiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaCRUDUnicaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaInicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioPaginaresultadosEditPart.VISUAL_ID: {
			LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem> result = new LinkedList<DataWeb.diagram.navigator.DataWebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWeb.diagram.navigator.DataWebNavigatorGroup target = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEncuestaCuestionarioPaginaresultados_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWeb.diagram.navigator.DataWebNavigatorGroup source = new DataWeb.diagram.navigator.DataWebNavigatorGroup(
					DataWeb.diagram.part.Messages.NavigatorGroupName_PaginaEncuestaCuestionarioPaginaresultados_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaResultadosEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWeb.diagram.part.DataWebVisualIDRegistry
							.getType(DataWeb.diagram.edit.parts.PaginaEncuestaCuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DataWeb.diagram.edit.parts.AplicacionEditPart.MODEL_ID
				.equals(DataWeb.diagram.part.DataWebVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DataWeb.diagram.navigator.DataWebNavigatorItem> createNavigatorItems(Collection<View> views,
			Object parent, boolean isLeafs) {
		ArrayList<DataWeb.diagram.navigator.DataWebNavigatorItem> result = new ArrayList<DataWeb.diagram.navigator.DataWebNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DataWeb.diagram.navigator.DataWebNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DataWeb.diagram.navigator.DataWebNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DataWeb.diagram.navigator.DataWebAbstractNavigatorItem) {
			DataWeb.diagram.navigator.DataWebAbstractNavigatorItem abstractNavigatorItem = (DataWeb.diagram.navigator.DataWebAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
