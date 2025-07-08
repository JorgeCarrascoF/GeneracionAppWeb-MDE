/**
 */
package DataWeb.provider;


import DataWeb.DataWebFactory;
import DataWeb.DataWebPackage;
import DataWeb.PaginaEncuestaCuestionario;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link DataWeb.PaginaEncuestaCuestionario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaEncuestaCuestionarioItemProvider extends PaginaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaEncuestaCuestionarioItemProvider(AdapterFactory adapterFactory) {
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

			addEsCuestionarioPropertyDescriptor(object);
			addNumeroPregVFPropertyDescriptor(object);
			addNumeroPregSelectPropertyDescriptor(object);
			addPaginaresultadosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Es Cuestionario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsCuestionarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PaginaEncuestaCuestionario_esCuestionario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PaginaEncuestaCuestionario_esCuestionario_feature", "_UI_PaginaEncuestaCuestionario_type"),
				 DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__ES_CUESTIONARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numero Preg VF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumeroPregVFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PaginaEncuestaCuestionario_numeroPregVF_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PaginaEncuestaCuestionario_numeroPregVF_feature", "_UI_PaginaEncuestaCuestionario_type"),
				 DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__NUMERO_PREG_VF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numero Preg Select feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumeroPregSelectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PaginaEncuestaCuestionario_numeroPregSelect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PaginaEncuestaCuestionario_numeroPregSelect_feature", "_UI_PaginaEncuestaCuestionario_type"),
				 DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__NUMERO_PREG_SELECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paginaresultados feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginaresultadosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PaginaEncuestaCuestionario_paginaresultados_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PaginaEncuestaCuestionario_paginaresultados_feature", "_UI_PaginaEncuestaCuestionario_type"),
				 DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__PAGINARESULTADOS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__PREGUNTAS);
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
	 * This returns PaginaEncuestaCuestionario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PaginaEncuestaCuestionario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PaginaEncuestaCuestionario)object).getIdPagina();
		return label == null || label.length() == 0 ?
			getString("_UI_PaginaEncuestaCuestionario_type") :
			getString("_UI_PaginaEncuestaCuestionario_type") + " " + label;
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

		switch (notification.getFeatureID(PaginaEncuestaCuestionario.class)) {
			case DataWebPackage.PAGINA_ENCUESTA_CUESTIONARIO__ES_CUESTIONARIO:
			case DataWebPackage.PAGINA_ENCUESTA_CUESTIONARIO__NUMERO_PREG_VF:
			case DataWebPackage.PAGINA_ENCUESTA_CUESTIONARIO__NUMERO_PREG_SELECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataWebPackage.PAGINA_ENCUESTA_CUESTIONARIO__PREGUNTAS:
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
				(DataWebPackage.Literals.PAGINA_ENCUESTA_CUESTIONARIO__PREGUNTAS,
				 DataWebFactory.eINSTANCE.createPregunta()));
	}

}
