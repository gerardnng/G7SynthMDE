/**
 */
package micromodeling.model.MicrocontrollerModeling.util;

import micromodeling.model.MicrocontrollerModeling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see micromodeling.model.MicrocontrollerModeling.MicrocontrollerModelingPackage
 * @generated
 */
public class MicrocontrollerModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicrocontrollerModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicrocontrollerModelingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrocontrollerModelingSwitch<Adapter> modelSwitch =
		new MicrocontrollerModelingSwitch<Adapter>() {
			@Override
			public Adapter caseMicrocontroller(Microcontroller object) {
				return createMicrocontrollerAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseCLanguage(CLanguage object) {
				return createCLanguageAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseTimerConfig(TimerConfig object) {
				return createTimerConfigAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseROM(ROM object) {
				return createROMAdapter();
			}
			@Override
			public Adapter caseEEPROM(EEPROM object) {
				return createEEPROMAdapter();
			}
			@Override
			public Adapter caseFlash(Flash object) {
				return createFlashAdapter();
			}
			@Override
			public Adapter caseRAM(RAM object) {
				return createRAMAdapter();
			}
			@Override
			public Adapter casePinMode(PinMode object) {
				return createPinModeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter casePinOperation(PinOperation object) {
				return createPinOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Microcontroller
	 * @generated
	 */
	public Adapter createMicrocontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.CLanguage <em>CLanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.CLanguage
	 * @generated
	 */
	public Adapter createCLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.TimerConfig <em>Timer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.TimerConfig
	 * @generated
	 */
	public Adapter createTimerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.ROM <em>ROM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.ROM
	 * @generated
	 */
	public Adapter createROMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.EEPROM <em>EEPROM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.EEPROM
	 * @generated
	 */
	public Adapter createEEPROMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Flash <em>Flash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Flash
	 * @generated
	 */
	public Adapter createFlashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.RAM <em>RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.RAM
	 * @generated
	 */
	public Adapter createRAMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.PinMode <em>Pin Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.PinMode
	 * @generated
	 */
	public Adapter createPinModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link micromodeling.model.MicrocontrollerModeling.PinOperation <em>Pin Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see micromodeling.model.MicrocontrollerModeling.PinOperation
	 * @generated
	 */
	public Adapter createPinOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MicrocontrollerModelingAdapterFactory
