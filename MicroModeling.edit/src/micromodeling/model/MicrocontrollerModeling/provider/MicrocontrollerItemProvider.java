/**
 */
package micromodeling.model.MicrocontrollerModeling.provider;


import java.util.Collection;
import java.util.List;

import micromodeling.model.MicrocontrollerModeling.Microcontroller;
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
 * This is the item provider adapter for a {@link micromodeling.model.MicrocontrollerModeling.Microcontroller} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrocontrollerItemProvider 
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
	public MicrocontrollerItemProvider(AdapterFactory adapterFactory) {
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
			addManufacturerPropertyDescriptor(object);
			addWordMemoryPropertyDescriptor(object);
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
				 getString("_UI_Microcontroller_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microcontroller_name_feature", "_UI_Microcontroller_type"),
				 MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microcontroller_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microcontroller_manufacturer_feature", "_UI_Microcontroller_type"),
				 MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__MANUFACTURER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Word Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWordMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microcontroller_wordMemory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microcontroller_wordMemory_feature", "_UI_Microcontroller_type"),
				 MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__WORD_MEMORY,
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
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__PINS);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__CLANGUAGE);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__PROCESSOR);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__FAMILY);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__ROM);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__FLASH);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__RAM);
			childrenFeatures.add(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__REGISTERS);
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
	 * This returns Microcontroller.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Microcontroller"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Microcontroller)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Microcontroller_type") :
			getString("_UI_Microcontroller_type") + " " + label;
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

		switch (notification.getFeatureID(Microcontroller.class)) {
			case MicrocontrollerModelingPackage.MICROCONTROLLER__NAME:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
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
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__PINS,
				 MicrocontrollerModelingFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__CLANGUAGE,
				 MicrocontrollerModelingFactory.eINSTANCE.createCLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__PROCESSOR,
				 MicrocontrollerModelingFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__FAMILY,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__ROM,
				 MicrocontrollerModelingFactory.eINSTANCE.createROM()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__ROM,
				 MicrocontrollerModelingFactory.eINSTANCE.createEEPROM()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__ROM,
				 MicrocontrollerModelingFactory.eINSTANCE.createFlash()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__FLASH,
				 MicrocontrollerModelingFactory.eINSTANCE.createFlash()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__RAM,
				 MicrocontrollerModelingFactory.eINSTANCE.createRAM()));

		newChildDescriptors.add
			(createChildParameter
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__REGISTERS,
				 MicrocontrollerModelingFactory.eINSTANCE.createRegister()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__ROM ||
			childFeature == MicrocontrollerModelingPackage.Literals.MICROCONTROLLER__FLASH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
