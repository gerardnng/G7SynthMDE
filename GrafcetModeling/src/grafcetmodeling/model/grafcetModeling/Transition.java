/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getReceptivity <em>Receptivity</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getGrafcet <em>Grafcet</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getInConnections <em>In Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getOutConnections <em>Out Connections</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getInSteps <em>In Steps</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Transition#getOutSteps <em>Out Steps</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validTransition='\n\t\tself.inConnections-&gt;size()&gt;=1 and self.outConnections-&gt;size()&gt;=1'"
 * @generated
 */
public interface Transition extends G7Element {
	/**
	 * Returns the value of the '<em><b>Out Connections</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.TransitionToStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Connections</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_OutConnections()
	 * @model required="true"
	 * @generated
	 */
	EList<TransitionToStep> getOutConnections();

	/**
	 * Returns the value of the '<em><b>In Steps</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Steps</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_InSteps()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='(grafcet.steps-&gt;select(step|step.outConnections-&gt;exists(outCon|self.inConnections-&gt;includes(outCon))))-&gt;asSet()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Step> getInSteps();

	/**
	 * Returns the value of the '<em><b>Out Steps</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Steps</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_OutSteps()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='(grafcet.steps-&gt;select(step|step.inConnections-&gt;exists(inCon|self.outConnections-&gt;includes(inCon))))-&gt;asSet()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Step> getOutSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void parseReceptivity();

	/**
	 * Returns the value of the '<em><b>In Connections</b></em>' reference list.
	 * The list contents are of type {@link grafcetmodeling.model.grafcetModeling.StepToTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connections</em>' reference list.
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_InConnections()
	 * @model required="true"
	 * @generated
	 */
	EList<StepToTransition> getInConnections();

	/**
	 * Returns the value of the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Condition</em>' containment reference.
	 * @see #setTransitionCondition(Expression)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_TransitionCondition()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Expression getTransitionCondition();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Transition#getTransitionCondition <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition</em>' containment reference.
	 * @see #getTransitionCondition()
	 * @generated
	 */
	void setTransitionCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Receptivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptivity</em>' attribute.
	 * @see #setReceptivity(String)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_Receptivity()
	 * @model
	 * @generated
	 */
	String getReceptivity();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Transition#getReceptivity <em>Receptivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptivity</em>' attribute.
	 * @see #getReceptivity()
	 * @generated
	 */
	void setReceptivity(String value);

	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grafcetmodeling.model.grafcetModeling.Grafcet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafcet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(Grafcet)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getTransition_Grafcet()
	 * @see grafcetmodeling.model.grafcetModeling.Grafcet#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Grafcet getGrafcet();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Transition#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(Grafcet value);
	
} // Transition
