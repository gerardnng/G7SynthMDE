/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getGrafcet <em>Grafcet</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getInConnections <em>In Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getOutConnections <em>Out Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getActions <em>Actions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getVariable <em>Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getInTransitions <em>In Transitions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Step#getOutTransitions <em>Out Transitions</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stepVarIsInternalVar levelActionVarIsBoolVar uniqueNamesOfActions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot stepVarIsInternalVar='\n\t\tself.variable.type = VarType::Internal' levelActionVarIsBoolVar='\n\t\tself.actions-&gt;forAll(act|act.oclIsTypeOf(LevelAction) implies act.actionVariable.oclIsTypeOf(BooleanVariable))' uniqueNamesOfActions='\n\t\tself.actions-&gt;forAll(a1,a2| a1&lt;&gt;a2 implies a1.name&lt;&gt;a2.name)'"
 * @generated
 */
public interface Step extends G7Element {
	/**
	 * Returns the value of the '<em><b>In Connections</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.TransitionToStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connections</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_InConnections()
	 * @model
	 * @generated
	 */
	EList<TransitionToStep> getInConnections();

	/**
	 * Returns the value of the '<em><b>Out Connections</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.StepToTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Connections</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_OutConnections()
	 * @model
	 * @generated
	 */
	EList<StepToTransition> getOutConnections();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Action}.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_Actions()
	 * @see grafcetmodeling.model.grafcetModeling.Action#getStep
	 * @model opposite="step" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(BooleanVariable)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_Variable()
	 * @model required="true" derived="true"
	 * @generated
	 */
	BooleanVariable getVariable();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Step#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>In Transitions</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Transitions</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_InTransitions()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='(grafcet.transitions-&gt;select(trans|trans.outConnections-&gt;exists(outCon|self.inConnections-&gt;includes(outCon))))-&gt;asSet()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Transition> getInTransitions();

	/**
	 * Returns the value of the '<em><b>Out Transitions</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Transitions</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_OutTransitions()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='(grafcet.transitions-&gt;select(trans|trans.inConnections-&gt;exists(inCon|self.outConnections-&gt;includes(inCon))))-&gt;asSet()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Transition> getOutTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createStepActivityVar();

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_IsInitial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Step#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_IsActive()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Step#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafcet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(Grafcet)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getStep_Grafcet()
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getSteps
	 * @model opposite="steps" required="true" transient="false"
	 * @generated
	 */
	Grafcet getGrafcet();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Step#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(Grafcet value);

	//BooleanVariable generateStepBooleanVariable();

	String proposedStepVarName();

} // Step
