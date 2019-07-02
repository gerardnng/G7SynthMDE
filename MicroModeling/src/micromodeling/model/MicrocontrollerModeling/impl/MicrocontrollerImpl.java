/**
 */
package micromodeling.model.MicrocontrollerModeling.impl;

import java.util.Collection;

import micromodeling.model.MicrocontrollerModeling.CLanguage;
import micromodeling.model.MicrocontrollerModeling.Flash;
import micromodeling.model.MicrocontrollerModeling.Microcontroller;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage;
import micromodeling.model.MicrocontrollerModeling.Pin;
import micromodeling.model.MicrocontrollerModeling.Processor;
import micromodeling.model.MicrocontrollerModeling.RAM;
import micromodeling.model.MicrocontrollerModeling.ROM;
import micromodeling.model.MicrocontrollerModeling.Register;
import micromodeling.model.MicrocontrollerModeling.WordSize;

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
 * An implementation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getName <em>Name</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getClanguage <em>Clanguage</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getRom <em>Rom</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getFlash <em>Flash</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getWordMemory <em>Word Memory</em>}</li>
 *   <li>{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl#getRegisters <em>Registers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicrocontrollerImpl extends MinimalEObjectImpl.Container implements Microcontroller {
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
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

	/**
	 * The cached value of the '{@link #getClanguage() <em>Clanguage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClanguage()
	 * @generated
	 * @ordered
	 */
	protected CLanguage clanguage;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processor;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRom() <em>Rom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRom()
	 * @generated
	 * @ordered
	 */
	protected ROM rom;

	/**
	 * The cached value of the '{@link #getFlash() <em>Flash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlash()
	 * @generated
	 * @ordered
	 */
	protected Flash flash;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected RAM ram;

	/**
	 * The default value of the '{@link #getWordMemory() <em>Word Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordMemory()
	 * @generated
	 * @ordered
	 */
	protected static final WordSize WORD_MEMORY_EDEFAULT = WordSize.WD_8BITS;

	/**
	 * The cached value of the '{@link #getWordMemory() <em>Word Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordMemory()
	 * @generated
	 * @ordered
	 */
	protected WordSize wordMemory = WORD_MEMORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<Register> registers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrocontrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrocontrollerModelingPackage.Literals.MICROCONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, MicrocontrollerModelingPackage.MICROCONTROLLER__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLanguage getClanguage() {
		return clanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClanguage(CLanguage newClanguage, NotificationChain msgs) {
		CLanguage oldClanguage = clanguage;
		clanguage = newClanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE, oldClanguage, newClanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClanguage(CLanguage newClanguage) {
		if (newClanguage != clanguage) {
			NotificationChain msgs = null;
			if (clanguage != null)
				msgs = ((InternalEObject)clanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE, null, msgs);
			if (newClanguage != null)
				msgs = ((InternalEObject)newClanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE, null, msgs);
			msgs = basicSetClanguage(newClanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE, newClanguage, newClanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<Processor>(Processor.class, this, MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROM getRom() {
		return rom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRom(ROM newRom, NotificationChain msgs) {
		ROM oldRom = rom;
		rom = newRom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__ROM, oldRom, newRom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRom(ROM newRom) {
		if (newRom != rom) {
			NotificationChain msgs = null;
			if (rom != null)
				msgs = ((InternalEObject)rom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__ROM, null, msgs);
			if (newRom != null)
				msgs = ((InternalEObject)newRom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__ROM, null, msgs);
			msgs = basicSetRom(newRom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__ROM, newRom, newRom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flash getFlash() {
		return flash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlash(Flash newFlash, NotificationChain msgs) {
		Flash oldFlash = flash;
		flash = newFlash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH, oldFlash, newFlash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlash(Flash newFlash) {
		if (newFlash != flash) {
			NotificationChain msgs = null;
			if (flash != null)
				msgs = ((InternalEObject)flash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH, null, msgs);
			if (newFlash != null)
				msgs = ((InternalEObject)newFlash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH, null, msgs);
			msgs = basicSetFlash(newFlash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH, newFlash, newFlash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAM getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRam(RAM newRam, NotificationChain msgs) {
		RAM oldRam = ram;
		ram = newRam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__RAM, oldRam, newRam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(RAM newRam) {
		if (newRam != ram) {
			NotificationChain msgs = null;
			if (ram != null)
				msgs = ((InternalEObject)ram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__RAM, null, msgs);
			if (newRam != null)
				msgs = ((InternalEObject)newRam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrocontrollerModelingPackage.MICROCONTROLLER__RAM, null, msgs);
			msgs = basicSetRam(newRam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__RAM, newRam, newRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordSize getWordMemory() {
		return wordMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordMemory(WordSize newWordMemory) {
		WordSize oldWordMemory = wordMemory;
		wordMemory = newWordMemory == null ? WORD_MEMORY_EDEFAULT : newWordMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY, oldWordMemory, wordMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Register> getRegisters() {
		if (registers == null) {
			registers = new EObjectContainmentEList<Register>(Register.class, this, MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS);
		}
		return registers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
				return basicSetClanguage(null, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
				return ((InternalEList<?>)getProcessor()).basicRemove(otherEnd, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
				return basicSetRom(null, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
				return basicSetFlash(null, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
				return basicSetRam(null, msgs);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
				return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
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
			case MicrocontrollerModelingPackage.MICROCONTROLLER__NAME:
				return getName();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
				return getPins();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
				return getClanguage();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
				return getProcessor();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY:
				return getFamily();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER:
				return getManufacturer();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
				return getRom();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
				return getFlash();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
				return getRam();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY:
				return getWordMemory();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
				return getRegisters();
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
			case MicrocontrollerModelingPackage.MICROCONTROLLER__NAME:
				setName((String)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
				setClanguage((CLanguage)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends Processor>)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY:
				setFamily((String)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
				setRom((ROM)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
				setFlash((Flash)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
				setRam((RAM)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY:
				setWordMemory((WordSize)newValue);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection<? extends Register>)newValue);
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
			case MicrocontrollerModelingPackage.MICROCONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
				getPins().clear();
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
				setClanguage((CLanguage)null);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
				getProcessor().clear();
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
				setRom((ROM)null);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
				setFlash((Flash)null);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
				setRam((RAM)null);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY:
				setWordMemory(WORD_MEMORY_EDEFAULT);
				return;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
				getRegisters().clear();
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
			case MicrocontrollerModelingPackage.MICROCONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PINS:
				return pins != null && !pins.isEmpty();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__CLANGUAGE:
				return clanguage != null;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case MicrocontrollerModelingPackage.MICROCONTROLLER__ROM:
				return rom != null;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__FLASH:
				return flash != null;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__RAM:
				return ram != null;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__WORD_MEMORY:
				return wordMemory != WORD_MEMORY_EDEFAULT;
			case MicrocontrollerModelingPackage.MICROCONTROLLER__REGISTERS:
				return registers != null && !registers.isEmpty();
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
		result.append(", family: ");
		result.append(family);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", wordMemory: ");
		result.append(wordMemory);
		result.append(')');
		return result.toString();
	}

} //MicrocontrollerImpl
