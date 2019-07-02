/**
 */
package micromodeling.model.MicrocontrollerModeling.impl;

import micromodeling.model.MicrocontrollerModeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrocontrollerModelingFactoryImpl extends EFactoryImpl implements MicrocontrollerModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicrocontrollerModelingFactory init() {
		try {
			MicrocontrollerModelingFactory theMicrocontrollerModelingFactory = (MicrocontrollerModelingFactory)EPackage.Registry.INSTANCE.getEFactory(MicrocontrollerModelingPackage.eNS_URI);
			if (theMicrocontrollerModelingFactory != null) {
				return theMicrocontrollerModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicrocontrollerModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MicrocontrollerModelingPackage.MICROCONTROLLER: return createMicrocontroller();
			case MicrocontrollerModelingPackage.PIN: return createPin();
			case MicrocontrollerModelingPackage.CLANGUAGE: return createCLanguage();
			case MicrocontrollerModelingPackage.LIBRARY: return createLibrary();
			case MicrocontrollerModelingPackage.FUNCTION: return createFunction();
			case MicrocontrollerModelingPackage.TIMER_CONFIG: return createTimerConfig();
			case MicrocontrollerModelingPackage.PROCESSOR: return createProcessor();
			case MicrocontrollerModelingPackage.ROM: return createROM();
			case MicrocontrollerModelingPackage.EEPROM: return createEEPROM();
			case MicrocontrollerModelingPackage.FLASH: return createFlash();
			case MicrocontrollerModelingPackage.RAM: return createRAM();
			case MicrocontrollerModelingPackage.PIN_MODE: return createPinMode();
			case MicrocontrollerModelingPackage.PARAMETER: return createParameter();
			case MicrocontrollerModelingPackage.INSTRUCTION: return createInstruction();
			case MicrocontrollerModelingPackage.REGISTER: return createRegister();
			case MicrocontrollerModelingPackage.PIN_OPERATION: return createPinOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MicrocontrollerModelingPackage.PIN_NATURE:
				return createPinNatureFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.SPEED_UNIT:
				return createSpeedUnitFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.MEMORY_UNIT:
				return createMemoryUnitFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.WORD_SIZE:
				return createWordSizeFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.OPERATION_NAME:
				return createOperationNameFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.TIMER_OP:
				return createTimerOpFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.REG_TYPE:
				return createRegTypeFromString(eDataType, initialValue);
			case MicrocontrollerModelingPackage.PIN_MODES:
				return createPinModesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MicrocontrollerModelingPackage.PIN_NATURE:
				return convertPinNatureToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.SPEED_UNIT:
				return convertSpeedUnitToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.MEMORY_UNIT:
				return convertMemoryUnitToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.WORD_SIZE:
				return convertWordSizeToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.OPERATION_NAME:
				return convertOperationNameToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.TIMER_OP:
				return convertTimerOpToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.REG_TYPE:
				return convertRegTypeToString(eDataType, instanceValue);
			case MicrocontrollerModelingPackage.PIN_MODES:
				return convertPinModesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microcontroller createMicrocontroller() {
		MicrocontrollerImpl microcontroller = new MicrocontrollerImpl();
		return microcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLanguage createCLanguage() {
		CLanguageImpl cLanguage = new CLanguageImpl();
		return cLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerConfig createTimerConfig() {
		TimerConfigImpl timerConfig = new TimerConfigImpl();
		return timerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROM createROM() {
		ROMImpl rom = new ROMImpl();
		return rom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEPROM createEEPROM() {
		EEPROMImpl eeprom = new EEPROMImpl();
		return eeprom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flash createFlash() {
		FlashImpl flash = new FlashImpl();
		return flash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAM createRAM() {
		RAMImpl ram = new RAMImpl();
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinMode createPinMode() {
		PinModeImpl pinMode = new PinModeImpl();
		return pinMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinOperation createPinOperation() {
		PinOperationImpl pinOperation = new PinOperationImpl();
		return pinOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinNature createPinNatureFromString(EDataType eDataType, String initialValue) {
		PinNature result = PinNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedUnit createSpeedUnitFromString(EDataType eDataType, String initialValue) {
		SpeedUnit result = SpeedUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryUnit createMemoryUnitFromString(EDataType eDataType, String initialValue) {
		MemoryUnit result = MemoryUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordSize createWordSizeFromString(EDataType eDataType, String initialValue) {
		WordSize result = WordSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWordSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationName createOperationNameFromString(EDataType eDataType, String initialValue) {
		OperationName result = OperationName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerOp createTimerOpFromString(EDataType eDataType, String initialValue) {
		TimerOp result = TimerOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimerOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegType createRegTypeFromString(EDataType eDataType, String initialValue) {
		RegType result = RegType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinModes createPinModesFromString(EDataType eDataType, String initialValue) {
		PinModes result = PinModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerModelingPackage getMicrocontrollerModelingPackage() {
		return (MicrocontrollerModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicrocontrollerModelingPackage getPackage() {
		return MicrocontrollerModelingPackage.eINSTANCE;
	}

} //MicrocontrollerModelingFactoryImpl
