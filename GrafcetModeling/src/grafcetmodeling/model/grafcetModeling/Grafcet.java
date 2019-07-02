/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import expressionsBuilder.UnExistingGrafcetVariableException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Grafcet#getName <em>Name</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Grafcet#getConnections <em>Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Grafcet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Grafcet#getSteps <em>Steps</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Grafcet#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNamesForG7Vars hasAtLeastOneInitialStep validStepToTransition_StepSide validStepToTransition_TransitionSide validTransitionToStep_TransitionSide validTransitionToStep_StepSide'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueNamesForG7Vars='\n\t\tself.variables-&gt;forAll(v1,v2| v1&lt;&gt;v2 implies v1.name&lt;&gt;v2.name)' hasAtLeastOneInitialStep='\n\t\tself.steps-&gt;select(s|s.isInitial)-&gt;size()&gt;=1' validStepToTransition_StepSide='\n\t\tself.connections-&gt;select(c|c.oclIsTypeOf(StepToTransition))-&gt;forAll(con|self.steps-&gt;select(s|s.outConnections-&gt;includes(con))-&gt;size()=1)' validStepToTransition_TransitionSide='\n\t\tself.connections-&gt;select(c|c.oclIsTypeOf(StepToTransition))-&gt;forAll(con|self.transitions-&gt;select(t|t.inConnections-&gt;includes(con))-&gt;size()=1)' validTransitionToStep_TransitionSide='\n\t\tself.connections-&gt;select(c|c.oclIsTypeOf(TransitionToStep))-&gt;forAll(con|self.transitions-&gt;select(t|t.outConnections-&gt;includes(con))-&gt;size()=1)' validTransitionToStep_StepSide='\n\t\tself.connections-&gt;select(c|c.oclIsTypeOf(TransitionToStep))-&gt;forAll(con|self.steps-&gt;select(s|s.inConnections-&gt;includes(con))-&gt;size()=1)'"
 * @generated
 */
public interface Grafcet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Connection}.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Connection#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Connections()
	 * @see grafcetmodeling.model.grafcetModeling.Connection#getGrafcet
	 * @model opposite="grafcet" containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Step}.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Step#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Steps()
	 * @see grafcetmodeling.model.grafcetModeling.Step#getGrafcet
	 * @model opposite="grafcet" containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Transition}.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Transition#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Transitions()
	 * @see grafcetmodeling.model.grafcetModeling.Transition#getGrafcet
	 * @model opposite="grafcet" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Variable}.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Variable#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Variables()
	 * @see grafcetmodeling.model.grafcetModeling.Variable#getGrafcet
	 * @model opposite="grafcet" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();


	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getGrafcet_Expressions()
	 * @model containment="true"
	 * @generated NOT
	 */
	EList<Expression> getExpressions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateG7Elements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasTimeConditions();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Expression> getTimeExprs();

	Variable getVariableByName(String varName) throws UnExistingGrafcetVariableException;
	
	Variable createAndGetVariable(String varName, boolean isBoolean, VarType type);
	
	//BooleanVariable createAndGetBooleanVariable(String varName);
	
	void parseTransitionsExpressions();

	void parseActionsExpressions();

	void generateStepsVariables();

} // Grafcet
