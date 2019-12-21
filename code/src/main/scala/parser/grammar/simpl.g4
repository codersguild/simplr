grammar simpl;

program
   : statement* EOF
   ;

statement 
   : asgn=assignmentStatement END_STATEMENT 
   | decl=declarationStatement END_STATEMENT
   | cond=conditionStatement 
   | asrt=assertStatement END_STATEMENT 
   | prnt=printStatement END_STATEMENT 
   | NEWLINE
   ;

declarationStatement
   :  typ=type id=identifier
   ;

assertStatement
   :  stattype=ASSERT LPAREN relexp=relopExpression RPAREN
   ;

printStatement
   :  stattype=PRINT LPAREN printexp=expression RPAREN
   ;

conditionStatement
   :  stattype=IF LPAREN relexp=relopExpression RPAREN truestat=statement (ELSE falsestat=statement) ?
   ;

assignmentStatement
   :  typ=type left=identifier assign=ASSIGNMENT right=expression
   |  left=identifier assign=ASSIGNMENT right=expression
   ;

ASSIGNMENT
   :  '=' 
   ;

identifier
   : variable
   ;

relopExpression
   : id=identifier rel=relop exp=expression
   ;

expression
   :  left=expression op=POW right=expression
   |  left=expression op=(MULT | DIV) right=expression
   |  left=expression op=(PLUS | MINUS) right=expression
   |  num=pure_number
   |  varl=variable
   |  MINUS varl=variable
   |  LPAREN main_expr=expression RPAREN
   ;

TYPE 
   : 'int'
   | 'bool'
   ;

type
   : TYPE
   ;

relop
   : EQ
   | GT
   | LT
   ;

pure_number
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

variable
   : VALID_ID_START VALID_ID_CHAR*
   ;

VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;

VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;
