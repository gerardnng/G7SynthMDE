/**
 */
package micromodeling.model.MicrocontrollerModeling.impl;

import java.util.Collection;

import micromodeling.model.MicrocontrollerModeling.CLanguage;
import micromodeling.model.MicrocontrollerModeling.Library;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage;
import micromodeling.model.MicrocontrollerModeling.PinMode;
import micromodeling.model.MicrocontrollerModeling.PinOperation;
import micromodeling.model.MicrocontrollerModeling.TimerConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLanguage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getTimerconfig <em>Timerconfig</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getPinmode <em>Pinmode</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#isHasMain <em>Has Main</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getFilesExtension <em>Files Extension</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl#getPinoperation <em>Pinoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLanguageImpl extends MinimalEObjectImpl.Container implements CLanguage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getTimerconfig() <em>Timerconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<TimerConfig> timerconfig;

	/**
	 * The cached value of the '{@link #getPinmode() <em>Pinmode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinmode()
	 * @generated
	 * @ordered
	 */
	protected EList<PinMode> pinmode;

	/**
	 * The default value of the '{@link #isHasMain() <em>Has Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMain() <em>Has Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMain()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMain = HAS_MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilesExtension() <em>Files Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILES_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilesExtension() <em>Files Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesExtension()
	 * @generated
	 * @ordered
	 */
	protected String filesExtension = FILES_EXTENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPinoperation() <em>Pinoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<PinOperation> pinoperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrocontrollerModelingPackage.Literals.CLANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.CLANGUAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this, MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimerConfig> getTimerconfig() {
		if (timerconfig == null) {
			timerconfig = new EObjectContainmentEList<TimerConfig>(TimerConfig.class, this, MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG);
		}
		return timerconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinMode> getPinmode() {
		if (pinmode == null) {
			pinmode = new EObjectContainmentEList<PinMode>(PinMode.class, this, MicrocontrollerModelingPackage.CLANGUAGE__PINMODE);
		}
		return pinmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMain() {
		return hasMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMain(boolean newHasMain) {
		boolean oldHasMain = hasMain;
		hasMain = newHasMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN, oldHasMain, hasMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilesExtension() {
		return filesExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesExtension(String newFilesExtension) {
		String oldFilesExtension = filesExtension;
		filesExtension = newFilesExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION, oldFilesExtension, filesExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinOperation> getPinoperation() {
		if (pinoperation == null) {
			pinoperation = new EObjectContainmentEList<PinOperation>(PinOperation.class, this, MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION);
		}
		return pinoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
				return ((InternalEList<?>)getTimerconfig()).basicRemove(otherEnd, msgs);
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
				return ((InternalEList<?>)getPinmode()).basicRemove(otherEnd, msgs);
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
				return ((InternalEList<?>)getPinoperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.CLANGUAGE__NAME:
				return getName();
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
				return getLibraries();
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
				return getTimerconfig();
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
				return getPinmode();
			case MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN:
				return isHasMain();
			case MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION:
				return getFilesExtension();
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
				return getPinoperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.CLANGUAGE__NAME:
				setName((String)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
				getTimerconfig().clear();
				getTimerconfig().addAll((Collection<? extends TimerConfig>)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
				getPinmode().clear();
				getPinmode().addAll((Collection<? extends PinMode>)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN:
				setHasMain((Boolean)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION:
				setFilesExtension((String)newValue);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
				getPinoperation().clear();
				getPinoperation().addAll((Collection<? extends PinOperation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.CLANGUAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
				getLibraries().clear();
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
				getTimerconfig().clear();
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
				getPinmode().clear();
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN:
				setHasMain(HAS_MAIN_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION:
				setFilesExtension(FILES_EXTENSION_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
				getPinoperation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.CLANGUAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MicrocontrollerModelingPackage.CLANGUAGE__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case MicrocontrollerModelingPackage.CLANGUAGE__TIMERCONFIG:
				return timerconfig != null && !timerconfig.isEmpty();
			case MicrocontrollerModelingPackage.CLANGUAGE__PINMODE:
				return pinmode != null && !pinmode.isEmpty();
			case MicrocontrollerModelingPackage.CLANGUAGE__HAS_MAIN:
				return hasMain != HAS_MAIN_EDEFAULT;
			case MicrocontrollerModelingPackage.CLANGUAGE__FILES_EXTENSION:
				return FILES_EXTENSION_EDEFAULT == null ? filesExtension != null : !FILES_EXTENSION_EDEFAULT.equals(filesExtension);
			case MicrocontrollerModelingPackage.CLANGUAGE__PINOPERATION:
				return pinoperation != null && !pinoperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hasMain: ");
		result.append(hasMain);
		result.append(", filesExtension: ");
		result.append(filesExtension);
		result.append(')');
		return result.toString();
	}

} //CLanguageImpl
