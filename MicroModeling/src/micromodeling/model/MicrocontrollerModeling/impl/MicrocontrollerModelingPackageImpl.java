/**
 */
package micromodeling.model.MicrocontrollerModeling.impl;

import micromodeling.model.MicrocontrollerModeling.CLanguage;
import micromodeling.model.MicrocontrollerModeling.Flash;
import micromodeling.model.MicrocontrollerModeling.Function;
import micromodeling.model.MicrocontrollerModeling.Instruction;
import micromodeling.model.MicrocontrollerModeling.Library;
import micromodeling.model.MicrocontrollerModeling.Memory;
import micromodeling.model.MicrocontrollerModeling.MemoryUnit;
import micromodeling.model.MicrocontrollerModeling.Microcontroller;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory;
import micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage;
import micromodeling.model.MicrocontrollerModeling.OperationName;
import micromodeling.model.MicrocontrollerModeling.Parameter;
import micromodeling.model.MicrocontrollerModeling.Pin;
import micromodeling.model.MicrocontrollerModeling.PinMode;
import micromodeling.model.MicrocontrollerModeling.PinModes;
import micromodeling.model.MicrocontrollerModeling.PinNature;
import micromodeling.model.MicrocontrollerModeling.PinOperation;
import micromodeling.model.MicrocontrollerModeling.Processor;
import micromodeling.model.MicrocontrollerModeling.RegType;
import micromodeling.model.MicrocontrollerModeling.Register;
import micromodeling.model.MicrocontrollerModeling.SpeedUnit;
import micromodeling.model.MicrocontrollerModeling.TimerConfig;
import micromodeling.model.MicrocontrollerModeling.TimerOp;
import micromodeling.model.MicrocontrollerModeling.WordSize;

import micromodeling.model.MicrocontrollerModeling.util.MicrocontrollerModelingValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrocontrollerModelingPackageImpl extends EPackageImpl implements MicrocontrollerModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass romEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eepromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speedUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wordSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timerOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinModesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicrocontrollerModelingPackageImpl() {
		super(eNS_URI, MicrocontrollerModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MicrocontrollerModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicrocontrollerModelingPackage init() {
		if (isInited) return (MicrocontrollerModelingPackage)EPackage.Registry.INSTANCE.getEPackage(MicrocontrollerModelingPackage.eNS_URI);

		// Obtain or create and register package
		MicrocontrollerModelingPackageImpl theMicrocontrollerModelingPackage = (MicrocontrollerModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MicrocontrollerModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MicrocontrollerModelingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMicrocontrollerModelingPackage.createPackageContents();

		// Initialize created meta-data
		theMicrocontrollerModelingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMicrocontrollerModelingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MicrocontrollerModelingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMicrocontrollerModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicrocontrollerModelingPackage.eNS_URI, theMicrocontrollerModelingPackage);
		return theMicrocontrollerModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrocontroller() {
		return microcontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicrocontroller_Name() {
		return (EAttribute)microcontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Pins() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Clanguage() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Processor() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicrocontroller_Family() {
		return (EAttribute)microcontrollerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicrocontroller_Manufacturer() {
		return (EAttribute)microcontrollerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Rom() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Flash() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Ram() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicrocontroller_WordMemory() {
		return (EAttribute)microcontrollerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Registers() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Name() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Number() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Nature() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLanguage() {
		return cLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLanguage_Name() {
		return (EAttribute)cLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLanguage_Libraries() {
		return (EReference)cLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLanguage_Timerconfig() {
		return (EReference)cLanguageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLanguage_Pinmode() {
		return (EReference)cLanguageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLanguage_HasMain() {
		return (EAttribute)cLanguageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLanguage_FilesExtension() {
		return (EAttribute)cLanguageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLanguage_Pinoperation() {
		return (EReference)cLanguageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Type() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Instructions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerConfig() {
		return timerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerConfig_Name() {
		return (EAttribute)timerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerConfig_Period() {
		return (EAttribute)timerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Size() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Unit() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Speed() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Unit() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROM() {
		return romEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEPROM() {
		return eepromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlash() {
		return flashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAM() {
		return ramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinMode() {
		return pinModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinMode_Name() {
		return (EAttribute)pinModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinMode_Value() {
		return (EAttribute)pinModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Value() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Name() {
		return (EAttribute)registerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Type() {
		return (EAttribute)registerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinOperation() {
		return pinOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinOperation_Name() {
		return (EAttribute)pinOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinNature() {
		return pinNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpeedUnit() {
		return speedUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryUnit() {
		return memoryUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWordSize() {
		return wordSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationName() {
		return operationNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimerOp() {
		return timerOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegType() {
		return regTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinModes() {
		return pinModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerModelingFactory getMicrocontrollerModelingFactory() {
		return (MicrocontrollerModelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		microcontrollerEClass = createEClass(MICROCONTROLLER);
		createEAttribute(microcontrollerEClass, MICROCONTROLLER__NAME);
		createEReference(microcontrollerEClass, MICROCONTROLLER__PINS);
		createEReference(microcontrollerEClass, MICROCONTROLLER__CLANGUAGE);
		createEReference(microcontrollerEClass, MICROCONTROLLER__PROCESSOR);
		createEAttribute(microcontrollerEClass, MICROCONTROLLER__FAMILY);
		createEAttribute(microcontrollerEClass, MICROCONTROLLER__MANUFACTURER);
		createEReference(microcontrollerEClass, MICROCONTROLLER__ROM);
		createEReference(microcontrollerEClass, MICROCONTROLLER__FLASH);
		createEReference(microcontrollerEClass, MICROCONTROLLER__RAM);
		createEAttribute(microcontrollerEClass, MICROCONTROLLER__WORD_MEMORY);
		createEReference(microcontrollerEClass, MICROCONTROLLER__REGISTERS);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__NAME);
		createEAttribute(pinEClass, PIN__NATURE);
		createEAttribute(pinEClass, PIN__NUMBER);

		cLanguageEClass = createEClass(CLANGUAGE);
		createEAttribute(cLanguageEClass, CLANGUAGE__NAME);
		createEReference(cLanguageEClass, CLANGUAGE__LIBRARIES);
		createEReference(cLanguageEClass, CLANGUAGE__TIMERCONFIG);
		createEReference(cLanguageEClass, CLANGUAGE__PINMODE);
		createEAttribute(cLanguageEClass, CLANGUAGE__HAS_MAIN);
		createEAttribute(cLanguageEClass, CLANGUAGE__FILES_EXTENSION);
		createEReference(cLanguageEClass, CLANGUAGE__PINOPERATION);

		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__NAME);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__TYPE);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__INSTRUCTIONS);

		timerConfigEClass = createEClass(TIMER_CONFIG);
		createEAttribute(timerConfigEClass, TIMER_CONFIG__NAME);
		createEAttribute(timerConfigEClass, TIMER_CONFIG__PERIOD);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__UNIT);
		createEAttribute(memoryEClass, MEMORY__SIZE);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__UNIT);
		createEAttribute(processorEClass, PROCESSOR__SPEED);

		romEClass = createEClass(ROM);

		eepromEClass = createEClass(EEPROM);

		flashEClass = createEClass(FLASH);

		ramEClass = createEClass(RAM);

		pinModeEClass = createEClass(PIN_MODE);
		createEAttribute(pinModeEClass, PIN_MODE__NAME);
		createEAttribute(pinModeEClass, PIN_MODE__VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__VALUE);

		registerEClass = createEClass(REGISTER);
		createEAttribute(registerEClass, REGISTER__NAME);
		createEAttribute(registerEClass, REGISTER__TYPE);

		pinOperationEClass = createEClass(PIN_OPERATION);
		createEAttribute(pinOperationEClass, PIN_OPERATION__NAME);

		// Create enums
		pinNatureEEnum = createEEnum(PIN_NATURE);
		speedUnitEEnum = createEEnum(SPEED_UNIT);
		memoryUnitEEnum = createEEnum(MEMORY_UNIT);
		wordSizeEEnum = createEEnum(WORD_SIZE);
		operationNameEEnum = createEEnum(OPERATION_NAME);
		timerOpEEnum = createEEnum(TIMER_OP);
		regTypeEEnum = createEEnum(REG_TYPE);
		pinModesEEnum = createEEnum(PIN_MODES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timerConfigEClass.getESuperTypes().add(this.getFunction());
		romEClass.getESuperTypes().add(this.getMemory());
		eepromEClass.getESuperTypes().add(this.getROM());
		flashEClass.getESuperTypes().add(this.getEEPROM());
		ramEClass.getESuperTypes().add(this.getMemory());
		pinOperationEClass.getESuperTypes().add(this.getFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(microcontrollerEClass, Microcontroller.class, "Microcontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicrocontroller_Name(), ecorePackage.getEString(), "name", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Pins(), this.getPin(), null, "pins", null, 1, -1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Clanguage(), this.getCLanguage(), null, "clanguage", null, 1, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Processor(), this.getProcessor(), null, "processor", null, 1, -1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontroller_Family(), ecorePackage.getEString(), "family", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontroller_Manufacturer(), ecorePackage.getEString(), "manufacturer", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Rom(), this.getROM(), null, "rom", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Flash(), this.getFlash(), null, "flash", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Ram(), this.getRAM(), null, "ram", null, 1, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontroller_WordMemory(), this.getWordSize(), "wordMemory", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Registers(), this.getRegister(), null, "registers", null, 0, -1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Nature(), this.getPinNature(), "nature", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cLanguageEClass, CLanguage.class, "CLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLanguage_Libraries(), this.getLibrary(), null, "libraries", null, 0, -1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLanguage_Timerconfig(), this.getTimerConfig(), null, "timerconfig", null, 0, -1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLanguage_Pinmode(), this.getPinMode(), null, "pinmode", null, 1, -1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCLanguage_HasMain(), ecorePackage.getEBoolean(), "hasMain", null, 1, 1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCLanguage_FilesExtension(), ecorePackage.getEString(), "filesExtension", null, 0, 1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLanguage_Pinoperation(), this.getPinOperation(), null, "pinoperation", null, 1, -1, CLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Type(), ecorePackage.getEString(), "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 1, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Instructions(), this.getInstruction(), null, "instructions", null, 1, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerConfigEClass, TimerConfig.class, "TimerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimerConfig_Name(), this.getTimerOp(), "name", null, 0, 1, TimerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimerConfig_Period(), ecorePackage.getEInt(), "period", null, 0, 1, TimerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemory_Unit(), this.getMemoryUnit(), "unit", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Unit(), this.getSpeedUnit(), "unit", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Speed(), ecorePackage.getEInt(), "speed", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(romEClass, micromodeling.model.MicrocontrollerModeling.ROM.class, "ROM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eepromEClass, micromodeling.model.MicrocontrollerModeling.EEPROM.class, "EEPROM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flashEClass, Flash.class, "Flash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ramEClass, micromodeling.model.MicrocontrollerModeling.RAM.class, "RAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinModeEClass, PinMode.class, "PinMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinMode_Name(), this.getPinModes(), "name", null, 0, 1, PinMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPinMode_Value(), ecorePackage.getEString(), "value", null, 0, 1, PinMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_Value(), ecorePackage.getEString(), "value", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registerEClass, Register.class, "Register", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegister_Name(), ecorePackage.getEString(), "name", null, 0, 1, Register.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegister_Type(), this.getRegType(), "type", null, 0, 1, Register.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinOperationEClass, PinOperation.class, "PinOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinOperation_Name(), this.getOperationName(), "name", null, 0, 1, PinOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pinNatureEEnum, PinNature.class, "PinNature");
		addEEnumLiteral(pinNatureEEnum, PinNature.DIGITAL);
		addEEnumLiteral(pinNatureEEnum, PinNature.ANALOG);
		addEEnumLiteral(pinNatureEEnum, PinNature.MIXED);

		initEEnum(speedUnitEEnum, SpeedUnit.class, "SpeedUnit");
		addEEnumLiteral(speedUnitEEnum, SpeedUnit.HZ);
		addEEnumLiteral(speedUnitEEnum, SpeedUnit.MHZ);
		addEEnumLiteral(speedUnitEEnum, SpeedUnit.GHZ);
		addEEnumLiteral(speedUnitEEnum, SpeedUnit.MIPS);

		initEEnum(memoryUnitEEnum, MemoryUnit.class, "MemoryUnit");
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.MO);
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.GO);
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.KO);

		initEEnum(wordSizeEEnum, WordSize.class, "WordSize");
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_8BITS);
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_16BITS);
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_24BITS);
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_32BITS);
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_48BITS);
		addEEnumLiteral(wordSizeEEnum, WordSize.WD_64BITS);

		initEEnum(operationNameEEnum, OperationName.class, "OperationName");
		addEEnumLiteral(operationNameEEnum, OperationName.DIGITAL_PIN_READ);
		addEEnumLiteral(operationNameEEnum, OperationName.DIGITAL_PIN_WRITE);
		addEEnumLiteral(operationNameEEnum, OperationName.ANALOG_PIN_READ);
		addEEnumLiteral(operationNameEEnum, OperationName.ANALOG_PIN_WRITE);
		addEEnumLiteral(operationNameEEnum, OperationName.PIN_CONFIG_MODE);

		initEEnum(timerOpEEnum, TimerOp.class, "TimerOp");
		addEEnumLiteral(timerOpEEnum, TimerOp.INITIALIZE_TIMER);

		initEEnum(regTypeEEnum, RegType.class, "RegType");
		addEEnumLiteral(regTypeEEnum, RegType.ACCUMULATOR);
		addEEnumLiteral(regTypeEEnum, RegType.GENERAL);
		addEEnumLiteral(regTypeEEnum, RegType.PCOUNTER);
		addEEnumLiteral(regTypeEEnum, RegType.STACK);
		addEEnumLiteral(regTypeEEnum, RegType.CCR);
		addEEnumLiteral(regTypeEEnum, RegType.ICR);
		addEEnumLiteral(regTypeEEnum, RegType.IR);

		initEEnum(pinModesEEnum, PinModes.class, "PinModes");
		addEEnumLiteral(pinModesEEnum, PinModes.INPUT);
		addEEnumLiteral(pinModesEEnum, PinModes.OUTPUT);
		addEEnumLiteral(pinModesEEnum, PinModes.IN_OUT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (microcontrollerEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueName_PerPin uniquePinNumber_PerPin asLeast_OneRomOrFlashMemory"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (microcontrollerEClass, 
		   source, 
		   new String[] {
			 "uniqueName_PerPin", "\n\t\tself.pins->forAll(p1, p2|p1<>p1 implies p1.name<>p2.name)",
			 "uniquePinNumber_PerPin", "\n\t\tself.pins->forAll(p1, p2|p1<>p1 implies p1.number<>p2.number)",
			 "asLeast_OneRomOrFlashMemory", "\n\t\tnot(self.flash = null and self.roms->isEmpty())"
		   });
	}

} //MicrocontrollerModelingPackageImpl
