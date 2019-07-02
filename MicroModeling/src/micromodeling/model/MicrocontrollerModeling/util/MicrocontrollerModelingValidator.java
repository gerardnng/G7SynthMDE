/**
 */
package micromodeling.model.MicrocontrollerModeling.util;

import java.util.Map;

import micromodeling.model.MicrocontrollerModeling.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage
 * @generated
 */
public class MicrocontrollerModelingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MicrocontrollerModelingValidator INSTANCE = new MicrocontrollerModelingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "micromodeling.model.MicrocontrollerModeling";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerModelingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MicrocontrollerModelingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MicrocontrollerModelingPackage.MICROCONTROLLER:
				return validateMicrocontroller((Microcontroller)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case MicrocontrollerModelingPackage.CLANGUAGE:
				return validateCLanguage((CLanguage)value, diagnostics, context);
			case MicrocontrollerModelingPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case MicrocontrollerModelingPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case MicrocontrollerModelingPackage.TIMER_CONFIG:
				return validateTimerConfig((TimerConfig)value, diagnostics, context);
			case MicrocontrollerModelingPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case MicrocontrollerModelingPackage.ROM:
				return validateROM((ROM)value, diagnostics, context);
			case MicrocontrollerModelingPackage.EEPROM:
				return validateEEPROM((EEPROM)value, diagnostics, context);
			case MicrocontrollerModelingPackage.FLASH:
				return validateFlash((Flash)value, diagnostics, context);
			case MicrocontrollerModelingPackage.RAM:
				return validateRAM((RAM)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PIN_MODE:
				return validatePinMode((PinMode)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case MicrocontrollerModelingPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case MicrocontrollerModelingPackage.REGISTER:
				return validateRegister((Register)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PIN_OPERATION:
				return validatePinOperation((PinOperation)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PIN_NATURE:
				return validatePinNature((PinNature)value, diagnostics, context);
			case MicrocontrollerModelingPackage.SPEED_UNIT:
				return validateSpeedUnit((SpeedUnit)value, diagnostics, context);
			case MicrocontrollerModelingPackage.MEMORY_UNIT:
				return validateMemoryUnit((MemoryUnit)value, diagnostics, context);
			case MicrocontrollerModelingPackage.WORD_SIZE:
				return validateWordSize((WordSize)value, diagnostics, context);
			case MicrocontrollerModelingPackage.OPERATION_NAME:
				return validateOperationName((OperationName)value, diagnostics, context);
			case MicrocontrollerModelingPackage.TIMER_OP:
				return validateTimerOp((TimerOp)value, diagnostics, context);
			case MicrocontrollerModelingPackage.REG_TYPE:
				return validateRegType((RegType)value, diagnostics, context);
			case MicrocontrollerModelingPackage.PIN_MODES:
				return validatePinModes((PinModes)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontroller(Microcontroller microcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microcontroller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicrocontroller_uniqueName_PerPin(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicrocontroller_uniquePinNumber_PerPin(microcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicrocontroller_asLeast_OneRomOrFlashMemory(microcontroller, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueName_PerPin constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROCONTROLLER__UNIQUE_NAME_PER_PIN__EEXPRESSION = "\n" +
		"\t\tself.pins->forAll(p1, p2|p1<>p1 implies p1.name<>p2.name)";

	/**
	 * Validates the uniqueName_PerPin constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontroller_uniqueName_PerPin(Microcontroller microcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER,
				 microcontroller,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueName_PerPin",
				 MICROCONTROLLER__UNIQUE_NAME_PER_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniquePinNumber_PerPin constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROCONTROLLER__UNIQUE_PIN_NUMBER_PER_PIN__EEXPRESSION = "\n" +
		"\t\tself.pins->forAll(p1, p2|p1<>p1 implies p1.number<>p2.number)";

	/**
	 * Validates the uniquePinNumber_PerPin constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontroller_uniquePinNumber_PerPin(Microcontroller microcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER,
				 microcontroller,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquePinNumber_PerPin",
				 MICROCONTROLLER__UNIQUE_PIN_NUMBER_PER_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the asLeast_OneRomOrFlashMemory constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROCONTROLLER__AS_LEAST_ONE_ROM_OR_FLASH_MEMORY__EEXPRESSION = "\n" +
		"\t\tnot(self.flash = null and self.roms->isEmpty())";

	/**
	 * Validates the asLeast_OneRomOrFlashMemory constraint of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontroller_asLeast_OneRomOrFlashMemory(Microcontroller microcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicrocontrollerModelingPackage.Literals.MICROCONTROLLER,
				 microcontroller,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "asLeast_OneRomOrFlashMemory",
				 MICROCONTROLLER__AS_LEAST_ONE_ROM_OR_FLASH_MEMORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLanguage(CLanguage cLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerConfig(TimerConfig timerConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROM(ROM rom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEPROM(EEPROM eeprom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eeprom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlash(Flash flash, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flash, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRAM(RAM ram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinMode(PinMode pinMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegister(Register register, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(register, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinOperation(PinOperation pinOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinNature(PinNature pinNature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedUnit(SpeedUnit speedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryUnit(MemoryUnit memoryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWordSize(WordSize wordSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationName(OperationName operationName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerOp(TimerOp timerOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegType(RegType regType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinModes(PinModes pinModes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MicrocontrollerModelingValidator
