grammar Logo; // Define a grammar called Hello

// PARSER

program
    : line+ endFileArg
    ;
line
    : brakeArg? (spaceArg? cmd spaceArg?)+   brakeArg?
    ;
cmd:
    repeat
    | while1
    | procedure
    | procedureCall
    | forward
    | back
    | left
    | right
    | home
    //variables cmd
    | let
    | assign
    //logic cmd
    | ifc
    | ifElse
    //draw cmd
    | pd
    | pu
    | setcolor
    | setpensize
    //turtle
    | newTurtle
    | rename
    | changeTurtle
    | removeTurtle
    | comment
    | clean
    ;

// math statements

mathStatement:
    mathSentence;

mathSentence:
    ('(' brakeArg? mathSentence brakeArg?')') # brakets
    | mathSentence brakeArg? doubleArgMathOperator brakeArg? mathSentence # doubleArgs
    | singleArgMathOperator brakeArg? mathSentence # singleArgs
    | mathValue # value;

mathValue:
    FLOATNUMBER
    | NATURALNUMBER
    | BOOLEAN
    | variableName;

singleArgMathOperator:
    ABS # abs
    | ARCTAN # arctan
    | COS # cos
    | INT # int1
    | LN # ln
    | MINUS # minusSingle
    | RANDOM # random
    | ROUND # round
    | SIN # sin
    | SQRT # sqrt
    | TAN # tan
    | NOT # not
    ;

doubleArgMathOperator:
    DIFFERENCE # difference
    | POWER # power
    | QUOTIENT # quotient
    | REMAINDER # remainder
    | SUM # sum
    | MINUS # minus
    | PRODUCT #product
    | DIVISION # division
    | COMPARISONEQUALS # comparisonEquals
    | COMPARISONBIGGER # comparisonBigger
    | COMPARISONSMALLER # comparisonSmaller
    | COMPARISONBIGGEREQUALS # comparisonBiggerEquals
    | COMPARISONSMALLEREQUALS # comparisonSmallerEquals
    | EXP # exp
    | LOG # log
    | OR # or
    | AND # and
    ;

comment:
    COMMENTBRACKET
    (acction)+
    COMMENTBRACKET
    ;
acction:
    brakeArg
    | program
    | cmd
    | mathStatement
    | OTHERWORD
    ;


stringArg:
    OTHERWORD
    ;

//arguments
variableName:
    ':'+ OTHERWORD
    | SPECIAL_WORD;

procedure:
    PROCEDURE brakeArg stringArg brakeArg (variableName brakeArg)* commandsList
    ;

procedureCall:
    CALL brakeArg stringArg (brakeArg mathStatement)* brakeArg?;
//operation commands
repeat:
    REPEAT brakeArg mathStatement brakeArg commandsList ;

while1:
    WHILE brakeArg mathStatement brakeArg commandsList ;

//number commands
back:
    BACK brakeArg mathStatement
    ;
forward:
    FORWARD brakeArg mathStatement
    ;
left:
    LEFT brakeArg mathStatement
    ;
right:
    RIGHT brakeArg mathStatement
    ;
setcolor:
    SETCOLOR brakeArg mathStatement
    ;
setpensize:
    SETPENSIZE brakeArg mathStatement
    ;

//word commands
newTurtle:
    NEWTURTLE brakeArg stringArg
    ;
rename:
    RENAME brakeArg stringArg
    ;
changeTurtle:
    CHANGETURTLE brakeArg stringArg
    ;
removeTurtle:
    REMOVE brakeArg stringArg
    ;

ifc:
    IF brakeArg mathStatement brakeArg commandsList
    ;
ifElse:
    IFELSE brakeArg mathStatement brakeArg commandsList brakeArg commandsList
    ;

//just commands
home:
    HOME
    ;
clean:
    CLEAN
    ;

pd:
    PD
    ;
pu:
    PU
    ;

//list commands
let:
    LET brakeArg variableName brakeArg mathStatement brakeArg?
    ;

assign:
    ASSIGN brakeArg variableName brakeArg mathStatement brakeArg?
    ;

//word list commands
spaceArg:
    (WHITESPACE)+
    ;
newLineArg:
    NEWLINE+
    ;
brakeArg:
    (spaceArg | newLineArg)+
    ;

endFileArg:
    EOF
    ;

commandsList:
    cmd
    | '['brakeArg? line+ brakeArg?']'
    | '{'brakeArg? line+ brakeArg?'}'
    ;

//LEXER
//ALL LETERS
fragment LOWERCASE:
    [a-z]
    ;
fragment UPPERCASE:
    [A-Z]
    ;

//Digit fragment
fragment DIGIT:
    [0-9]
    ;

SPECIAL_WORD:
    'GETX' | 'getx'
    | 'GETY' | 'gety'
    ;

//COMMANDS MOVING xx1xx DONE
BACK:
    'BACK'
    |'back'
    |'BK'
    |'bk'
    ;
FORWARD:
    'FORWARD'
    | 'FD'
    | 'forward'
    | 'fd'
    ;
HOME:
    'HOME'
    | 'home'
    ;
LEFT:
    'LEFT'
    | 'left'
    | 'LT'
    | 'lt'
    ;
RIGHT:
    'RIGHT'
    | 'RT'
    | 'right'
    | 'rt'
    ;
CLEAN:
    'CLEAN'
    | 'clean'
    ;
PD:
    'PD'
    | 'pd'
    ;
PU:
    'PU'
    | 'pu'
    ;
SETPENSIZE:
    'SETPENSIZE'
    | 'setpensize'
    ;
SETCOLOR:
    'SETCOLOR'
    | 'setcolor'
    ;
//commands number and maths xx6xx DONE
ABS:
    'ABS'
    | 'abs'
    ;
ARCTAN:
    'ARCTAN'
    | 'arctan'
    ;
COS:
    'COS'
    | 'cos'
    ;
DIFFERENCE:
    '!='
    ;
EXP:
    'EXP'
    | 'exp'
    ;
INT:
    'INT'
    | 'int'
    ;
LN:
    'LN'
    | 'ln'
    ;
LOG:
    'LOG'
    | 'log'
    ;
MINUS:
    '-'
    ;
PI:
    'PI'
    | 'pi'
    ;
POWER:
    'POW'
    | 'pow'
    | '^'
    ;
PRODUCT:
    '*'
    ;
QUOTIENT:
    'QUOTIENT'
    | 'quotient'
    ;
RANDOM:
    'RANDOM'
    | 'random'
    ;
REMAINDER:
    'REMAINDER'
    | 'remainder'
    | '%'
    ;
ROUND:
    'ROUND'
    | 'round'
    ;
SIN:
    'SIN'
    | 'sin'
    ;
SQRT:
    'SQRT'
    | 'sqrt'
    ;
SUM:
    '+'
    ;
TAN:
    'TAN'
    | 'tan'
    ;
COMPARISONEQUALS:
    '=='
    ;
COMPARISONBIGGER:
    '>'
    ;
COMPARISONSMALLER:
    '<'
    ;
COMPARISONSMALLEREQUALS:
    '<='
    | '=<'
    ;
COMPARISONBIGGEREQUALS:
    '>='
    | '=>'
    ;


NEWTURTLE:
    'NEWTURTLE'
    | 'newturtle'
    ;
RENAME:
    'RENAME'
    | 'rename'
    ;
REMOVE:
    'REMOVETURTLE'
    | 'removeturtle'
    ;
CHANGETURTLE:
    'changeturtle'
    | 'CHANGETURTLE'
    ;
SET:
    'SET'
    | 'set'
    ;

//commands Variables xx9xx DONE
LET:
    'LET'
    | 'let'
    ;
ASSIGN:
    'ASSIGN'
    | 'assign'
    ;
//commands logic xxx11xx DONE
AND:
    'AND'
    | 'and'
    | '&&'
    ;
IF:
    'IF'
    | 'if'
    ;
IFELSE:
    'IFELSE'
    | 'ifelse'
    ;
NOT:
    'NOT'
    |'not'
    | '!'
    ;
OR:
    'OR'
    | 'or'
    | '||'
    ;

//commands interaction xxx12xx
//commands Control and events xxx13xx
REPEAT:
    'REPEAT'
    | 'repeat'
    ;

WHILE:
    'WHILE'
    | 'while'
    ;
PROCEDURE:
    'PROCEDURE'
    | 'procedure'
    | 'PRD'
    | 'prd'
    ;

CALL :
    'CALL'
    | 'call';


DIVISION:
    '/'
    ;
COMMENTBRACKET:
    '#'
    ;

NATURALNUMBER:
    DIGIT+;
FLOATNUMBER:
    DIGIT+ ([.,] DIGIT+)?;

BOOLEAN:
    'true'
    | 'True'
    | 'false'
    | 'False';

//ADDITIONS
OTHERWORD:
    (LOWERCASE | UPPERCASE |'_')+
    ;
WHITESPACE:
    ' '
    | '\t'
    ;
NEWLINE:
    '\r'? '\n'
    | '\r';

