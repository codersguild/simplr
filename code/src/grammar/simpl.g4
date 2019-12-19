grammar simpl;

statement 
   : assignmentStatement END_STATEMENT
   | declarationStatement END_STATEMENT
   | conditionStatement END_STATEMENT
   | assertStatement END_STATEMENT
   | printStatement END_STATEMENT
// | loopStatement
   ;

declarationStatement
   : TYPE identifier
   | TYPE assignmentStatement
   ;

assertStatement
   : 'assert' LPAREN relopExpression RPAREN
   ;

printStatement
   : 'print' LPAREN expression RPAREN
   ;

conditionStatement
   :   'if' '(' expression ')' statement ('else' statement)?
   ;

assignmentStatement
   :   identifier assignmentOperator assignmentExpression
   ;

assignmentExpression
   :   identifier
   |   expression
   ;

assignmentOperator
   :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
   ;

identifier
   : VARIABLE
   ;

initializer
   : expression
   ;

relopExpression
   : identifier relop expression
   ;

expression
   :  expression POW expression
   |  expression (MULT | DIV)  expression
   |  expression (PLUS | MINUS) expression
   |  LPAREN expression RPAREN
   |  (PLUS | MINUS) pureliteral
   ;

pureliteral
   : numberOnly
   | variable
   ;

numberOnly
   : PURE_NUMBER
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

PURE_NUMBER
   : NUMBER (SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;

fragment SIGN
   : ('+' | '-')
   ;

TYPE 
   : 'int'
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

MULT
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

GTEQ 
   : '>='
   ;

LTEQ 
   : '<='
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

END_STATEMENT
   : ';'
   ;

// loopStatement
//    :   'for' '(' forCondition ')' statement
//    ;

// forCondition
// 	:   forDeclaration ';' forExpression? ';' forExpression?
// 	|   expression? ';' forExpression? ';' forExpression?
// 	;

// forDeclaration
//    :  declarationSpecifiers initDeclaratorList
// 	| 	declarationSpecifiers
//    ;

// forExpression
//    :   assignmentStatement
//    |   forExpression ',' assignmentStatement
//    ;

// // specify declaration like statement.
// declarationSpecifiers
//    : declarationSpecifier+ 
//    ;

// declarationSpecifier
//    : initDeclarator+
//    ;

// initDeclaratorList
//    :   initDeclarator
//    |   initDeclaratorList ',' initDeclarator
//    ;

// initDeclarator
//    :   declarator
//    |   declarator '=' initializer
//    ;
