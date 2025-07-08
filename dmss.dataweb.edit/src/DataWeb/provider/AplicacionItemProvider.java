/**
 */
package DataWeb.provider;


import DataWeb.Aplicacion;
import DataWeb.DataWebFactory;
import DataWeb.DataWebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link DataWeb.Aplicacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AplicacionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AplicacionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdAppPropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
			addPaginasMediasAccesiblesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id App feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdAppPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_idApp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_idApp_feature", "_UI_Aplicacion_type"),
				 DataWebPackage.Literals.APLICACION__ID_APP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_nombre_feature", "_UI_Aplicacion_type"),
				 DataWebPackage.Literals.APLICACION__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paginas Medias Accesibles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginasMediasAccesiblesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_paginasMediasAccesibles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_paginasMediasAccesibles_feature", "_UI_Aplicacion_type"),
				 DataWebPackage.Literals.APLICACION__PAGINAS_MEDIAS_ACCESIBLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataWebPackage.Literals.APLICACION__PAGINAS);
			childrenFeatures.add(DataWebPackage.Literals.APLICACION__ENTIDADES);
			childrenFeatures.add(DataWebPackage.Literals.APLICACION__ROLES);
			childrenFeatures.add(DataWebPackage.Literals.APLICACION__ENLACES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Aplicacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aplicacion"));
	}

	/**
	 * This returns <code>getImage(object)</code> for the column index <code>0</code> or <code>super.getImage(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(Object)
	 * @see #getColumnText(Object, int)
	 * @generated
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getImage(object) : super.getImage(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Aplicacion)object).getIdApp();
		return label == null || label.length() == 0 ?
			getString("_UI_Aplicacion_type") :
			getString("_UI_Aplicacion_type") + " " + label;
	}

	/**
	 * This returns <code>getText(object)</code> for the column index <code>0</code> or <code>super.getText(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage(Object)
	 * @see #getColumnImage(Object, int)
	 * @generated
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getText(object) : super.getText(object);
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Aplicacion.class)) {
			case DataWebPackage.APLICACION__ID_APP:
			case DataWebPackage.APLICACION__NOMBRE:
			case DataWebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataWebPackage.APLICACION__PAGINAS:
			case DataWebPackage.APLICACION__ENTIDADES:
			case DataWebPackage.APLICACION__ROLES:
			case DataWebPackage.APLICACION__ENLACES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaInicio()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaCreacion()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaDetalle()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaActualizacion()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaBorrado()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaIndice()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaIndiceDetalle()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaEncuestaCuestionario()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaResultados()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaIndiceExtendido()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__PAGINAS,
				 DataWebFactory.eINSTANCE.createPaginaCRUDUnica()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__ENTIDADES,
				 DataWebFactory.eINSTANCE.createEntidad()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__ROLES,
				 DataWebFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebPackage.Literals.APLICACION__ENLACES,
				 DataWebFactory.eINSTANCE.createEnlaceRRSS()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataWebEditPlugin.INSTANCE;
	}

}
