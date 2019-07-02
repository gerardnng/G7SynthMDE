/**
 */
package micromodeling.model.MicrocontrollerModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MicrocontrollerModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MicrocontrollerModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/microcontrollermodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MicrocontrollerModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicrocontrollerModelingPackage eINSTANCE = micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PINS = 1;

	/**
	 * The feature id for the '<em><b>Clanguage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__CLANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__FAMILY = 4;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MANUFACTURER = 5;

	/**
	 * The feature id for the '<em><b>Rom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__ROM = 6;

	/**
	 * The feature id for the '<em><b>Flash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__FLASH = 7;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__RAM = 8;

	/**
	 * The feature id for the '<em><b>Word Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__WORD_MEMORY = 9;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__REGISTERS = 10;

	/**
	 * The number of structural features of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.PinImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NATURE = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl <em>CLanguage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getCLanguage()
	 * @generated
	 */
	int CLANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Timerconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__TIMERCONFIG = 2;

	/**
	 * The feature id for the '<em><b>Pinmode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__PINMODE = 3;

	/**
	 * The feature id for the '<em><b>Has Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__HAS_MAIN = 4;

	/**
	 * The feature id for the '<em><b>Files Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__FILES_EXTENSION = 5;

	/**
	 * The feature id for the '<em><b>Pinoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE__PINOPERATION = 6;

	/**
	 * The number of structural features of the '<em>CLanguage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>CLanguage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.LibraryImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.FunctionImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.TimerConfigImpl <em>Timer Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.TimerConfigImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getTimerConfig()
	 * @generated
	 */
	int TIMER_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG__INSTRUCTIONS = FUNCTION__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG__NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG__PERIOD = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timer Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timer Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_CONFIG_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MemoryImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 6;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.ProcessorImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 7;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SPEED = 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ROMImpl <em>ROM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.ROMImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getROM()
	 * @generated
	 */
	int ROM = 8;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROM__UNIT = MEMORY__UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROM__SIZE = MEMORY__SIZE;

	/**
	 * The number of structural features of the '<em>ROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROM_FEATURE_COUNT = MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROM_OPERATION_COUNT = MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.EEPROMImpl <em>EEPROM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.EEPROMImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getEEPROM()
	 * @generated
	 */
	int EEPROM = 9;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEPROM__UNIT = ROM__UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEPROM__SIZE = ROM__SIZE;

	/**
	 * The number of structural features of the '<em>EEPROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEPROM_FEATURE_COUNT = ROM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EEPROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEPROM_OPERATION_COUNT = ROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.FlashImpl <em>Flash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.FlashImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getFlash()
	 * @generated
	 */
	int FLASH = 10;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH__UNIT = EEPROM__UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH__SIZE = EEPROM__SIZE;

	/**
	 * The number of structural features of the '<em>Flash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_FEATURE_COUNT = EEPROM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_OPERATION_COUNT = EEPROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.RAMImpl <em>RAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.RAMImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRAM()
	 * @generated
	 */
	int RAM = 11;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__UNIT = MEMORY__UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__SIZE = MEMORY__SIZE;

	/**
	 * The number of structural features of the '<em>RAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_FEATURE_COUNT = MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_OPERATION_COUNT = MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinModeImpl <em>Pin Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.PinModeImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinMode()
	 * @generated
	 */
	int PIN_MODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_MODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_MODE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pin Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_MODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pin Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.ParameterImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.InstructionImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.RegisterImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinOperationImpl <em>Pin Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.impl.PinOperationImpl
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinOperation()
	 * @generated
	 */
	int PIN_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION__INSTRUCTIONS = FUNCTION__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION__NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pin Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.PinNature <em>Pin Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.PinNature
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinNature()
	 * @generated
	 */
	int PIN_NATURE = 17;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.SpeedUnit <em>Speed Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.SpeedUnit
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getSpeedUnit()
	 * @generated
	 */
	int SPEED_UNIT = 18;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.MemoryUnit <em>Memory Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.MemoryUnit
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMemoryUnit()
	 * @generated
	 */
	int MEMORY_UNIT = 19;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.WordSize <em>Word Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.WordSize
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getWordSize()
	 * @generated
	 */
	int WORD_SIZE = 20;


	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.OperationName <em>Operation Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.OperationName
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getOperationName()
	 * @generated
	 */
	int OPERATION_NAME = 21;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.TimerOp <em>Timer Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.TimerOp
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getTimerOp()
	 * @generated
	 */
	int TIMER_OP = 22;

	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.RegType <em>Reg Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.RegType
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRegType()
	 * @generated
	 */
	int REG_TYPE = 23;


	/**
	 * The meta object id for the '{@link micromodeling.model.MicrocontrollerModeling.PinModes <em>Pin Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micromodeling.model.MicrocontrollerModeling.PinModes
	 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinModes()
	 * @generated
	 */
	int PIN_MODES = 24;


	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller
	 * @generated
	 */
	EClass getMicrocontroller();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getName()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EAttribute getMicrocontroller_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getPins()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Pins();

	/**
	 * Returns the meta object for the containment reference '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getClanguage <em>Clanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clanguage</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getClanguage()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Clanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getProcessor()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Processor();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getFamily()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EAttribute getMicrocontroller_Family();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getManufacturer()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EAttribute getMicrocontroller_Manufacturer();

	/**
	 * Returns the meta object for the containment reference '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRom <em>Rom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rom</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getRom()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Rom();

	/**
	 * Returns the meta object for the containment reference '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getFlash <em>Flash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flash</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getFlash()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Flash();

	/**
	 * Returns the meta object for the containment reference '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ram</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getRam()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Ram();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getWordMemory <em>Word Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word Memory</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getWordMemory()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EAttribute getMicrocontroller_WordMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registers</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller#getRegisters()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Registers();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Pin#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Pin#getNumber()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Number();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Pin#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Pin#getNature()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Nature();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.CLanguage <em>CLanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLanguage</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage
	 * @generated
	 */
	EClass getCLanguage();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getName()
	 * @see #getCLanguage()
	 * @generated
	 */
	EAttribute getCLanguage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getLibraries()
	 * @see #getCLanguage()
	 * @generated
	 */
	EReference getCLanguage_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getTimerconfig <em>Timerconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timerconfig</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getTimerconfig()
	 * @see #getCLanguage()
	 * @generated
	 */
	EReference getCLanguage_Timerconfig();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getPinmode <em>Pinmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinmode</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getPinmode()
	 * @see #getCLanguage()
	 * @generated
	 */
	EReference getCLanguage_Pinmode();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#isHasMain <em>Has Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Main</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#isHasMain()
	 * @see #getCLanguage()
	 * @generated
	 */
	EAttribute getCLanguage_HasMain();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getFilesExtension <em>Files Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Files Extension</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getFilesExtension()
	 * @see #getCLanguage()
	 * @generated
	 */
	EAttribute getCLanguage_FilesExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.CLanguage#getPinoperation <em>Pinoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinoperation</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage#getPinoperation()
	 * @see #getCLanguage()
	 * @generated
	 */
	EReference getCLanguage_Pinoperation();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link micromodeling.model.MicrocontrollerModeling.Function#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Function#getInstructions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Instructions();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig <em>Timer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Config</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerConfig
	 * @generated
	 */
	EClass getTimerConfig();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerConfig#getName()
	 * @see #getTimerConfig()
	 * @generated
	 */
	EAttribute getTimerConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerConfig#getPeriod()
	 * @see #getTimerConfig()
	 * @generated
	 */
	EAttribute getTimerConfig_Period();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Memory#getSize()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Size();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Memory#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Memory#getUnit()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Unit();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Processor#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Processor#getSpeed()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Speed();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Processor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Processor#getUnit()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Unit();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.ROM <em>ROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROM</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.ROM
	 * @generated
	 */
	EClass getROM();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.EEPROM <em>EEPROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEPROM</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.EEPROM
	 * @generated
	 */
	EClass getEEPROM();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Flash <em>Flash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flash</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Flash
	 * @generated
	 */
	EClass getFlash();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.RAM <em>RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.RAM
	 * @generated
	 */
	EClass getRAM();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.PinMode <em>Pin Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Mode</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinMode
	 * @generated
	 */
	EClass getPinMode();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.PinMode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinMode#getName()
	 * @see #getPinMode()
	 * @generated
	 */
	EAttribute getPinMode_Name();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.PinMode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinMode#getValue()
	 * @see #getPinMode()
	 * @generated
	 */
	EAttribute getPinMode_Value();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Instruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Instruction#getValue()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Value();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Register#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Register#getName()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Name();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.Register#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.Register#getType()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Type();

	/**
	 * Returns the meta object for class '{@link micromodeling.model.MicrocontrollerModeling.PinOperation <em>Pin Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Operation</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinOperation
	 * @generated
	 */
	EClass getPinOperation();

	/**
	 * Returns the meta object for the attribute '{@link micromodeling.model.MicrocontrollerModeling.PinOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinOperation#getName()
	 * @see #getPinOperation()
	 * @generated
	 */
	EAttribute getPinOperation_Name();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.PinNature <em>Pin Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Nature</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinNature
	 * @generated
	 */
	EEnum getPinNature();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.SpeedUnit <em>Speed Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed Unit</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.SpeedUnit
	 * @generated
	 */
	EEnum getSpeedUnit();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.MemoryUnit <em>Memory Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Unit</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.MemoryUnit
	 * @generated
	 */
	EEnum getMemoryUnit();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.WordSize <em>Word Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Word Size</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.WordSize
	 * @generated
	 */
	EEnum getWordSize();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.OperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Name</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.OperationName
	 * @generated
	 */
	EEnum getOperationName();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.TimerOp <em>Timer Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timer Op</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerOp
	 * @generated
	 */
	EEnum getTimerOp();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.RegType <em>Reg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reg Type</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.RegType
	 * @generated
	 */
	EEnum getRegType();

	/**
	 * Returns the meta object for enum '{@link micromodeling.model.MicrocontrollerModeling.PinModes <em>Pin Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Modes</em>'.
	 * @see micromodeling.model.MicrocontrollerModeling.PinModes
	 * @generated
	 */
	EEnum getPinModes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicrocontrollerModelingFactory getMicrocontrollerModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMicrocontroller()
		 * @generated
		 */
		EClass MICROCONTROLLER = eINSTANCE.getMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER__NAME = eINSTANCE.getMicrocontroller_Name();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__PINS = eINSTANCE.getMicrocontroller_Pins();

		/**
		 * The meta object literal for the '<em><b>Clanguage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__CLANGUAGE = eINSTANCE.getMicrocontroller_Clanguage();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__PROCESSOR = eINSTANCE.getMicrocontroller_Processor();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER__FAMILY = eINSTANCE.getMicrocontroller_Family();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER__MANUFACTURER = eINSTANCE.getMicrocontroller_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Rom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__ROM = eINSTANCE.getMicrocontroller_Rom();

		/**
		 * The meta object literal for the '<em><b>Flash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__FLASH = eINSTANCE.getMicrocontroller_Flash();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__RAM = eINSTANCE.getMicrocontroller_Ram();

		/**
		 * The meta object literal for the '<em><b>Word Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER__WORD_MEMORY = eINSTANCE.getMicrocontroller_WordMemory();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__REGISTERS = eINSTANCE.getMicrocontroller_Registers();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.PinImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NUMBER = eINSTANCE.getPin_Number();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NATURE = eINSTANCE.getPin_Nature();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl <em>CLanguage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.CLanguageImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getCLanguage()
		 * @generated
		 */
		EClass CLANGUAGE = eINSTANCE.getCLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLANGUAGE__NAME = eINSTANCE.getCLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLANGUAGE__LIBRARIES = eINSTANCE.getCLanguage_Libraries();

		/**
		 * The meta object literal for the '<em><b>Timerconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLANGUAGE__TIMERCONFIG = eINSTANCE.getCLanguage_Timerconfig();

		/**
		 * The meta object literal for the '<em><b>Pinmode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLANGUAGE__PINMODE = eINSTANCE.getCLanguage_Pinmode();

		/**
		 * The meta object literal for the '<em><b>Has Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLANGUAGE__HAS_MAIN = eINSTANCE.getCLanguage_HasMain();

		/**
		 * The meta object literal for the '<em><b>Files Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLANGUAGE__FILES_EXTENSION = eINSTANCE.getCLanguage_FilesExtension();

		/**
		 * The meta object literal for the '<em><b>Pinoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLANGUAGE__PINOPERATION = eINSTANCE.getCLanguage_Pinoperation();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.LibraryImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.FunctionImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INSTRUCTIONS = eINSTANCE.getFunction_Instructions();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.TimerConfigImpl <em>Timer Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.TimerConfigImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getTimerConfig()
		 * @generated
		 */
		EClass TIMER_CONFIG = eINSTANCE.getTimerConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_CONFIG__NAME = eINSTANCE.getTimerConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_CONFIG__PERIOD = eINSTANCE.getTimerConfig_Period();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MemoryImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__SIZE = eINSTANCE.getMemory_Size();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__UNIT = eINSTANCE.getMemory_Unit();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.ProcessorImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SPEED = eINSTANCE.getProcessor_Speed();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__UNIT = eINSTANCE.getProcessor_Unit();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ROMImpl <em>ROM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.ROMImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getROM()
		 * @generated
		 */
		EClass ROM = eINSTANCE.getROM();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.EEPROMImpl <em>EEPROM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.EEPROMImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getEEPROM()
		 * @generated
		 */
		EClass EEPROM = eINSTANCE.getEEPROM();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.FlashImpl <em>Flash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.FlashImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getFlash()
		 * @generated
		 */
		EClass FLASH = eINSTANCE.getFlash();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.RAMImpl <em>RAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.RAMImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRAM()
		 * @generated
		 */
		EClass RAM = eINSTANCE.getRAM();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinModeImpl <em>Pin Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.PinModeImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinMode()
		 * @generated
		 */
		EClass PIN_MODE = eINSTANCE.getPinMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_MODE__NAME = eINSTANCE.getPinMode_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_MODE__VALUE = eINSTANCE.getPinMode_Value();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.ParameterImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.InstructionImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__VALUE = eINSTANCE.getInstruction_Value();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.RegisterImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__NAME = eINSTANCE.getRegister_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__TYPE = eINSTANCE.getRegister_Type();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.impl.PinOperationImpl <em>Pin Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.impl.PinOperationImpl
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinOperation()
		 * @generated
		 */
		EClass PIN_OPERATION = eINSTANCE.getPinOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_OPERATION__NAME = eINSTANCE.getPinOperation_Name();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.PinNature <em>Pin Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.PinNature
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinNature()
		 * @generated
		 */
		EEnum PIN_NATURE = eINSTANCE.getPinNature();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.SpeedUnit <em>Speed Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.SpeedUnit
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getSpeedUnit()
		 * @generated
		 */
		EEnum SPEED_UNIT = eINSTANCE.getSpeedUnit();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.MemoryUnit <em>Memory Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.MemoryUnit
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getMemoryUnit()
		 * @generated
		 */
		EEnum MEMORY_UNIT = eINSTANCE.getMemoryUnit();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.WordSize <em>Word Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.WordSize
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getWordSize()
		 * @generated
		 */
		EEnum WORD_SIZE = eINSTANCE.getWordSize();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.OperationName <em>Operation Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.OperationName
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getOperationName()
		 * @generated
		 */
		EEnum OPERATION_NAME = eINSTANCE.getOperationName();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.TimerOp <em>Timer Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.TimerOp
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getTimerOp()
		 * @generated
		 */
		EEnum TIMER_OP = eINSTANCE.getTimerOp();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.RegType <em>Reg Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.RegType
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getRegType()
		 * @generated
		 */
		EEnum REG_TYPE = eINSTANCE.getRegType();

		/**
		 * The meta object literal for the '{@link micromodeling.model.MicrocontrollerModeling.PinModes <em>Pin Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see micromodeling.model.MicrocontrollerModeling.PinModes
		 * @see micromodeling.model.MicrocontrollerModeling.impl.MicrocontrollerModelingPackageImpl#getPinModes()
		 * @generated
		 */
		EEnum PIN_MODES = eINSTANCE.getPinModes();

	}

} //MicrocontrollerModelingPackage
