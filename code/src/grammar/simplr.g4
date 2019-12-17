// Adapted from C11 & Arithmetic .g4 files.


/*
   TODO : 
   Expression grammars
   Variable grammars
   Unary Ops
   Loop grammar
 */

grammar simplr;

statement 
   : assignmentStatement
   | conditionStatement
   | expressionStatement
   | loopStatement
   ;

conditionStatement
   :   'if' '(' expression ')' statement ('else' statement)?
   |   'switch' '(' expression ')' statement
   ;

loopStatement
   :   'for' '(' forCondition ')' statement
   ;

forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
   :  declarationSpecifiers initDeclaratorList
	| 	declarationSpecifiers
   ;

forExpression
   :   assignmentStatement
   |   forExpression ',' assignmentStatement
   ;

// specify declaration like statement.
declarationSpecifiers
   : declarationSpecifier+ 
   ;

assignmentStatement
   :   conditionStatement
   |   declarator assignmentOperator assignmentExpression
   ;

assignmentOperator
   :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
   ;

declarationSpecifier
   : initDeclarator+
   ;

assignmentExpression
   :   declarator
   |   declarator '=' initializer
   ;

initDeclaratorList
   :   initDeclarator
   |   initDeclaratorList ',' initDeclarator
   ;

initDeclarator
   :   declarator
   |   declarator '=' initializer
   ;

declarator
   : VARIABLE
   ;

initializer
   : expressionStatement
   ;

expressionStatement : equation* EOF;

equation
   : expression relop expression
   ;

expression
   :  expression  POW expression
   |  expression  (TIMES | DIV)  expression
   |  expression  (PLUS | MINUS) expression
   |  LPAREN expression RPAREN
   |  (PLUS | MINUS)* atom
   ;

atom
   : scientific
   | variable
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

variable
   : VARIABLE
   ;

relop
   : EQ
   | GT
   | LT
   ;


VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

SCIENTIFIC_NUMBER
   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;

fragment E
   : 'E' | 'e'
   ;

fragment SIGN
   : ('+' | '-')
   ;

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;


WS
   : [ \r\n\t] + -> skip
   ;