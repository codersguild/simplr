grammar simpl;

program
   : statement* EOF
   ;

statement 
   : assignmentStatement END_STATEMENT 
   | declarationStatement END_STATEMENT 
   | conditionStatement 
   | assertStatement END_STATEMENT 
   | printStatement END_STATEMENT 
   | NEWLINE
   ;

declarationStatement
   : TYPE identifier
   ;

assertStatement
   : ASSERT LPAREN relopExpression RPAREN
   ;

printStatement
   : PRINT LPAREN expression RPAREN
   ;

conditionStatement
   :  IF LPAREN relopExpression RPAREN statement (ELSE statement) ?
   ;

assignmentStatement
   :  TYPE identifier ASSIGNMENT expression
   |  identifier ASSIGNMENT expression
   ;

ASSIGNMENT
   :  '=' 
   ;

identifier
   : VARIABLE
   ;

relopExpression
   : identifier relop expression
   | expression relop expression
   ;

expression
   :  expression POW expression
   |  expression (MULT | DIV) expression
   |  expression (PLUS | MINUS) expression
   |  terminal
   |  MINUS terminal
   |  LPAREN expression RPAREN
   ;

terminal
   : PURE_NUMBER
   | VARIABLE
   ;

TYPE 
   : 'int'
   | 'char'
   | 'bool'
   ;

relop
   : EQ
   | GT
   | LT
   ;

PURE_NUMBER
   : NUMBER
   ;

NUMBER
   : ('0' .. '9')+
   ;

NEWLINE
   :  '\r'? '\n' ;

IF 
   : 'if'
   ;

ELSE 
   : 'else'
   ;

LPAREN
   : '('
   ;

PRINT
   : 'print'
   ;

RPAREN
   : ')'
   ;

ASSERT 
   : 'assert'
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
   : '=='
   ;

GTEQ 
   : '>='
   ;

LTEQ 
   : '<='
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

VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;

VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;

VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;
