/** Grammar for the Grafcet expressions (logical and arithmetical) */
grammar g7Expression ;

@lexer::header {
package g7Expression;
}

@parser::header {
package g7Expression;
} 

//Operators
AND	: 'and'| 'AND'|'&&';
OR	: 'or'| 'OR'|'||';
EQUAL: '==' |'=' ;
DIFF :  '!=' | '<>';
LE: '<=' ;
GE: '>=' ;
LT : '<' ;
GT :  '>'; 
MULT: '*';
DIV : '/'; 
ADD: '+';
SUB : '-';
NOT	: 'not' |'NOT' | '!';
RE	: 'RE' | 're';
FE	: 'FE' | 'fe';
BoolValue : 'true'|'false';
U	:	'ms' | 's'	|'m'|'h' ;	//Time unit

fragment Digit : [0-9];		//fragment is very important to recognize Id as b, or z
							//If not you would need to have Id's we at least 2 letters
fragment Letter : ([a-z] | [A-Z]|'_') ;
fragment IntPlus : Digit+ ;
//Number : ('+'|'-')? [0-9]+('.'[0-9]+)? ;	//a pointing number as 123.456
//Number : [0-9]+('.'[0-9]+)?;
Number : Digit+('.'Digit+)?;
//Id : ([a-z] | [A-Z]|'_')([a-z] | [A-Z]|'_'|[0-9])*;
Id : (Letter)(Letter|Digit)*;
WS : [ \t\r]+ -> skip ;	//for spaces? Just skip

//Grammar Productions 

myG7Expr: g7Expr ;	// myG7Expr is the Axiom of the grammar (here is the first production)

g7Expr	: op = (NOT|RE|FE) g7Expr			#UnaryLogicOp
		| left = g7Expr op = (LE|GE|LT|GT) right = g7Expr	#LEcmp_G7Expr
		| left = g7Expr op = (EQUAL|DIFF) right = g7Expr	#EqualDiff_G7Expr
		| left = g7Expr op = (AND|OR) right = g7Expr		#AndOr_G7Expr
		
		| op = SUB g7Expr					#InfixMinus
		| left = g7Expr op = (MULT|DIV) right = g7Expr		#MulDiv_G7Expr
		| left = g7Expr op = (ADD |SUB) right = g7Expr		#AddSub_G7Expr
		
		| atomic							#primaryAtom
		| timeLogicG7Expr					#primaryTiming
		|'(' g7Expr ')'						#primaryParenthesis
;

timeLogicG7Expr : 
	'[' nb1 = Number unit1 = U '/' g7Expr '/' nb2 = Number unit2 = U ']'	#timeLogicDelayed2
	| '[' nb = Number unit = U '/' g7Expr']'				#timeLogicDelayed1
	| '[' op = NOT nb = Number unit = U '/' g7Expr']'		#timeLogicG7ExprLimited

;

atomic : Number		#AtomNumber
		|Id			#AtomId
		|BoolValue	#AtomBool
;
