/** Grammar for the Grafcet Actions expressions*/
grammar G7ActionsExpr ;

@lexer::header {
package g7ActionsExpressions;
}

@parser::header {
package g7ActionsExpressions;
} 


SAT : '(ACT)'|'(DEC)';//Stored Actions Type
fragment Digit : [0-9];		//fragment is very important to recognize Id as b, or z
							//If not you would need to have Id's we at least 2 letters
fragment Letter : ([a-z]|[A-Z]|'_');

ASG : ':=';
IF : 'if'|'IF'; 
//ID : (Letter)(Letter|Digit)*; 
ID : [a-zA-Z_] [a-zA-Z0-9_]*;
WS : ' ';
//WS : [ \t\r]+ -> skip ;	//for spaces? Just skip
//Expr : .+?; //Any expression 
Expr : (' '|[a-zA-Z0-9]|'('|')'|'['|']'|'/'|'+'|'-'|'*'|'>'|'<'|'='|'_')+;

actExpr : ID						#IdExpr
		| SAT ID WS ASG WS+ expr2 #AssignmentExpr
		| ID WS IF WS+ expr2	#IfExpr 
; 
expr2: Expr;

//|SAT (WS?) ID (WS?) op = ASG WS? expr2 #AssignmentExpr
 /*
  * Explanation
Therefore you can make your WORD rule generic by using this grammar:

AND : 'AND' ;
OR  : 'OR'|',' ;
NOT : 'NOT' ;
LPAREN : '(' ;
RPAREN : ')' ;
DQUOTE : '"' ;
WS : [ \t\r\n]+ -> skip ;
WORD: .+? ;
Make sure to use the non-greedy operator ? in this case becaue otherwise 
* once invoked the WORD rule will consume all following input.

As WORD is specified last, input will only be tried to be consumed by it 
* if all previous lexer rules (all that have been defined above in the source code) 
* have failed.

EDIT: If you don't want your WORD rule to match any input then you just have to 
* modify the rule I provided. But the essence of my answer is that in the 
* lexer you don't have to worry about two rules potentially matching the same 
* input as long as you got the order in the source code right.
  */