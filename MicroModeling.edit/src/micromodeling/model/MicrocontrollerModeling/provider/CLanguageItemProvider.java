/**
 */
package micromodeling.model.MicrocontrollerModeling.provider;


import java.util.Collection;
import java.util.List;

import micromodeling.model.MicrocontrollerModeling.CLanguage;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage;

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
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link micromodeling.model.MicrocontrollerModeling.CLanguage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CLanguageItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLanguageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addHasMainPropertyDescriptor(object);
			addFilesExtensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLanguage_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLanguage_name_feature", "_UI_CLanguage_type"),
				 MicrocontrollerModelingPackage.Literals.CLANGUAGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Main feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLanguage_hasMain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLanguage_hasMain_feature", "_UI_CLanguage_type"),
				 MicrocontrollerModelingPackage.Literals.CLANGUAGE__HAS_MAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Files Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilesExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLanguage_filesExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLanguage_filesExtension_feature", "_UI_CLanguage_type"),
				 MicrocontrollerModelingPackage.Literals.CLANGUAGE__FILES_EXTENSION,
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
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.CLANGUAGE__LIBRARIES);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.CLANGUAGE__TIMERCONFIG);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.CLANGUAGE__PINMODE);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.CLANGUAGE__PINOPERATION);
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
	 * This returns CLanguage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CLanguage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CLanguage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CLanguage_type") :
			getString("_UI_CLanguage_type") + " " + label;
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

		switch (notification.getFeatureID(CLanguage.class)) {
			case MicrocontrollerModelingPackage.CLANGUAGE__NAME:
			case MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN:
			case MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
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
				(MicrocontrollerModelingPackage.Literals.CLANGUAGE__LIBRARIES,
				 MicrocontrollerModelingFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.CLANGUAGE__TIMERCONFIG,
				 MicrocontrollerModelingFactory.eINSTANCE.createTimerConfig()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.CLANGUAGE__PINMODE,
				 MicrocontrollerModelingFactory.eINSTANCE.createPinMode()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.CLANGUAGE__PINOPERATION,
				 MicrocontrollerModelingFactory.eINSTANCE.createPinOperation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MicroModelingEditPlugin.INSTANCE;
	}

}
