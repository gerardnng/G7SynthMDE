/**
 */
package grafcetmodeling.model.grafcetModeling;

import org.eclipse.emf.ecore.EObject;

import expressionsBuilder.UnExistingGrafcetVariableException;
import grafcetmodeling.model.grafcetModeling.Grafcet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr1 <em>Sub Expr1</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr2 <em>Sub Expr2</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getOperator <em>Operator</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getType <em>Type</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getName <em>Name</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#isBoolValue <em>Bool Value</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getArithmValue <em>Arithm Value</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#getVariable <em>Variable</em>}</li>
 *   <li>{@link grafcetmodeling.model.grafcetModeling.Expression#isIsConstant <em>Is Constant</em>}</li>
 * </ul>
 *
 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VariableExistsInGrafcet AValidConstantExpression SimpleExpressionHasNoSubExpressions ValidUnaryOperationExpression ValidExpressionWithOperator ValidExprWithTimeOp SimpleNonConstExprIsOfVariableType ValidExpressionWithBinaryOperation ValidComparisonOperator_GT ValidComparisonOperator_LT ValidComparisonOperator_GE ValidComparisonOperator_LE ValidLogicOperator_AND ValidLogicOperator_OR ValidArithmeticOperator_ADD ValidArithmeticOperator_SUB ValidArithmeticOperator_MULT ValidArithmeticOperator_DIV'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot VariableExistsInGrafcet='\n\t\t(self.isSimple and not self.isConstant) implies self.variable&lt;&gt;null' AValidConstantExpression='\n\t\tself.isConstant implies (self.isSimple and self.variable = null)' SimpleExpressionHasNoSubExpressions='\n\t\tself.isSimple implies (self.subExpr1 = null and self.subExpr2 = null)' ValidUnaryOperationExpression='\n\t\t(self.operator&lt;&gt;null \n\t\t\tand \n\t\t\t(self.operator.oclIsTypeOf(TimingOperator)\n\t\t\t\tor (\n\t\t\t\t\tself.operator.oclIsTypeOf(LogicalOperator) \n\t\t\t\t\tand (\n\t\t\t\t\t\t((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::NOT)\n\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::RE)\n\t\t\t\t\t\tor ((self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::FE)\n\t\t\t\t\t\t)\n\t\t\t\t)\n\t\t\t\tor (self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::U_MINUS)\n\t\t\t)\n\t\t) \n\t\timplies (self.subExpr1=null  and self.subExpr2&lt;&gt;null)' ValidExpressionWithOperator='\n\t\t(self.operator&lt;&gt;null) implies (self.variable = null)' ValidExprWithTimeOp='\n\t\tself.operator.oclIsTypeOf(TimingOperator) implies self.type = ExprType::Logical' SimpleNonConstExprIsOfVariableType='\n\t\t(self.isSimple and not self.isConstant and self.variable&lt;&gt;null) implies \n\t\t(\n\t\t\t(self.variable.oclIsTypeOf(BooleanVariable) implies self.type = ExprType::Logical)\n\t\t\tor\n\t\t\t(self.variable.oclIsTypeOf(NumericVariable) implies self.type = ExprType::Arithmetic)\n\t\t)' ValidExpressionWithBinaryOperation='\n\t\t(self.operator&lt;&gt;null and self.subExpr1&lt;&gt;null and self.subExpr2&lt;&gt;null) implies (self.subExpr1.type = self.subExpr2.type)' ValidComparisonOperator_GT='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidComparisonOperator_LT='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidComparisonOperator_GE='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::GE) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidComparisonOperator_LE='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::LE) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidLogicOperator_AND='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::AND) \n\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)' ValidLogicOperator_OR='\n\t\t(self.operator.oclIsTypeOf(LogicalOperator) and (self.operator.oclAsType(LogicalOperator)).name = LogicOpValues::OR) \n\t\timplies (self.subExpr1.type = ExprType::Logical and self.subExpr2.type = ExprType::Logical)' ValidArithmeticOperator_ADD='\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::ADD) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidArithmeticOperator_SUB='\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::SUB) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidArithmeticOperator_MULT='\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::MULT) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)' ValidArithmeticOperator_DIV='\n\t\t(self.operator.oclIsTypeOf(AritmeticOperator) and (self.operator.oclAsType(AritmeticOperator)).name = ArithmOpValues::DIV) \n\t\timplies (self.subExpr1.type = ExprType::Arithmetic and self.subExpr2.type = ExprType::Arithmetic)'"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Expr1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expr1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expr1</em>' containment reference.
	 * @see #setSubExpr1(Expression)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_SubExpr1()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Expression getSubExpr1();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr1 <em>Sub Expr1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Expr1</em>' containment reference.
	 * @see #getSubExpr1()
	 * @generated
	 */
	void setSubExpr1(Expression value);

	/**
	 * Returns the value of the '<em><b>Sub Expr2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expr2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expr2</em>' containment reference.
	 * @see #setSubExpr2(Expression)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_SubExpr2()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Expression getSubExpr2();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getSubExpr2 <em>Sub Expr2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Expr2</em>' containment reference.
	 * @see #getSubExpr2()
	 * @generated
	 */
	void setSubExpr2(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_Operator()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link grafcetmodeling.model.grafcetModeling.ExprType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @see #setType(ExprType)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_Type()
	 * @model
	 * @generated
	 */
	ExprType getType();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see grafcetmodeling.model.grafcetModeling.ExprType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExprType value);

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see #setIsSimple(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_IsSimple()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see #setIsSimple(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_IsSimple()
	 * @model required="true"
	 * @generated NOT
	 */
	boolean getIsSimple();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#isIsSimple <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple</em>' attribute.
	 * @see #isIsSimple()
	 * @generated
	 */
	void setIsSimple(boolean value);


	/**
	 * Returns the value of the '<em><b>Bool Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Value</em>' attribute.
	 * @see #setBoolValue(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_BoolValue()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBoolValue();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#isBoolValue <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Value</em>' attribute.
	 * @see #isBoolValue()
	 * @generated
	 */
	void setBoolValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Arithm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithm Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithm Value</em>' attribute.
	 * @see #setArithmValue(int)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_ArithmValue()
	 * @model required="true"
	 * @generated
	 */
	int getArithmValue();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getArithmValue <em>Arithm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithm Value</em>' attribute.
	 * @see #getArithmValue()
	 * @generated
	 */
	void setArithmValue(int value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_Variable()
	 * @model derived="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constant</em>' attribute.
	 * @see #setIsConstant(boolean)
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_IsConstant()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsConstant();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#isIsConstant <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constant</em>' attribute.
	 * @see #isIsConstant()
	 * @generated
	 */
	void setIsConstant(boolean value);

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
	 * @see grafcetmodeling.model.grafcetModeling.GrafcetModelingPackage#getExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grafcetmodeling.model.grafcetModeling.Expression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evalOld();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getOldCExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName2();

	boolean getBoolValue();

	boolean getIsConstant();

	boolean hasTimeCondition();

	String getInfixTreeString();

	void fillTreeNamesSimply();

	void evalName2();

	void inferExpLeavesType() throws Exception;
	
	void detectUnexistingVariables(Grafcet g7) throws UnExistingGrafcetVariableException;

} // Expression
