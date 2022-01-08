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
    | setheading
    | setx
    | sety
    | setpos
    | distance
    | towards
    | heading
    | home
    | pos
    //variables cmd
    | clearname
    | namex
    | thing
    | clearnames
    | names
    | let
    | assign
    //logic cmd
    | ifc
    | ifElse
    //draw cmd
    | bg
    | cg
    | clean
    | color
    | colorrunder
    | fill
    | freezebg
    | namefromcolor
    | pd
    | pe
    | pensize
    | pu
    | setbg
    | setcolor
    | setpensize
    | stamp
    | unfreezebg
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
setheading:
    SETHEADING brakeArg mathStatement
    ;
setx:
    SETX brakeArg mathStatement
    ;
sety:
    SETY brakeArg mathStatement
    ;
namefromcolor:
    NAMEFROMCOLOUR brakeArg mathStatement
    ;
setcolor:
    SETCOLOR brakeArg mathStatement
    ;
setpensize:
    SETPENSIZE brakeArg mathStatement
    ;
setbg:
    SETBG brakeArg mathStatement
    ;

//bracket commands
setpos:
    SETPOS brakeArg  '[' brakeArg mathStatement brakeArg ',' brakeArg mathStatement  brakeArg']'
    ;

//word commands
distance:
    DISTANCE brakeArg '\''stringArg'\''
    ;
towards:
    TOWARDS brakeArg '\''stringArg'\''
    ;
clearname:
    CLEARNAME brakeArg '\''stringArg'\''
    ;
namex:
    NAMEX brakeArg '\''stringArg'\''
    ;
thing:
    THING brakeArg '\''stringArg'\''
    ;

ifc:
    IF brakeArg mathStatement brakeArg commandsList
    ;
ifElse:
    IFELSE brakeArg mathStatement brakeArg commandsList brakeArg commandsList
    ;

//just commands
heading:
    HEADING
    ;
home:
    HOME
    ;
pos:
    POS
    ;
clearnames:
    CLEARNAMES
    ;
names:
    NAMES
    ;
bg:
    BG
    ;
cg:
    CG
    ;
clean:
    CLEAN
    ;
color:
    COLOR
    ;
colorrunder:
    COLORUNDER
    ;
fill:
    FILL
    ;
freezebg:
    FREEZEBG
    ;
pd:
    PD
    ;
pe:
    PE
    ;
pensize:
    PENSIZE
    ;
pu:
    PU
    ;
stamp:
    STAMP
    ;
unfreezebg:
    UNFREEZEBG
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
DISTANCE:
    'DISTANCE'
    | 'distance'
    ;
FORWARD:
    'FORWARD'
    | 'FD'
    | 'forward'
    | 'fd'
    ;
HEADING:
    'HEADING'
    |'heading'
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
POS:
    'POS'
    | 'pos'
    ;
RIGHT:
    'RIGHT'
    | 'RT'
    | 'right'
    | 'rt'
    ;
SETHEADING:
    'SETHEADING'
    | 'setheading'
    | 'SETH'
    | 'seth'
    ;
SETPOS:
    'SETPOS'
    | 'setpos'
    ;
SETX:
    'SETX'
    | 'setx'
    ;
SETY:
    'SETY'
    | 'sety'
    ;
TOWARDS:
    'TOWARDS'
    | 'towards'
    ;

BG:
    'BG'
    | 'bg'
    ;
CG:
    'CG'
    | 'cg'
    ;
CLEAN:
    'CLEAN'
    | 'clean'
    ;
COLOR:
    'COLOR'
    | 'color'
    ;
COLORUNDER:
    'COLORUNDER'
    | 'colorunder'
    ;
FILL:
    'FILL'
    | 'fill'
    ;
FREEZEBG:
    'FREEZEBG'
    | 'freezebg'
    ;
NAMEFROMCOLOUR:
    'NAMEFROMCOLOR'
    | 'namefromcolor'
    ;
PD:
    'PD'
    | 'pd'
    ;
PE:
    'PE'
    | 'pe'
    ;
PENSIZE:
    'PENSIZE'
    | 'pensize'
    ;
PU:
    'PU'
    | 'pu'
    ;
SETBG:
    'SETBG'
    | 'setbg'
    ;
SETCOLOR:
    'SETCOLOR'
    | 'setcolor'
    | 'SETC'
    | 'setc'
    ;
SETPENSIZE:
    'SETPENSIZE'
    | 'setpensize'
    ;
STAMP:
    'STAMP'
    | 'stamp'
    ;
UNFREEZEBG:
    'UNFREEZEBG'
    | 'unfreezebg'
    ;

HT:
    'HT'
    | 'ht'
    ;
INBACK:
    'INBACK'
    | 'inback'
    ;
INFRONT:
    'INFRONT'
    | 'infront'
    ;
OPACITY:
    'OPACITY'
    | 'opacity'
    ;
SETOPACITY:
    'SETOPACITY'
    | 'setopacity'
    ;
SETSHAPE:
    'SETSHAPE'
    | 'setshape'
    ;
SETSIZE:
    'SETSIZE'
    | 'setsize'
    ;
SHAPE:
    'SHAPE'
    | 'shape'
    ;
SIZE:
    'SIZE'
    | 'size'
    ;
ST:
    'ST'
    | 'st'
    ;

CLICKOFF:
    'CLICKOFF'
    | 'clickoff'
    ;
CLICKON:
    'CLICKON'
    | 'clickon'
    ;
CLONE:
    'CLONE'
    | 'clone'
    ;
TELL:
    'TELL'
    | 'tell'
    ;
TOUCHINGX:
    'TOUCHING?'
    | 'toughing?'
    ;
WHO:
    'WHO'
    | 'who'
    ;

ANNOUNCE:
    'ANNOUNCE'
    | 'announce'
    ;
ASCII:
    'ASCII'
    | 'ascii'
    ;
BOTTOM:
    'BOTTOM'
    | 'bottom'
    ;
CB:
    'CB'
    | 'cb'
    ;
CC:
    'CC'
    | 'cc'
    ;
CD:
    'CD'
    | 'cd'
    ;
CF:
    'CF'
    | 'cf'
    ;
CHAR:
    'CHAR'
    | 'char'
    ;
CLEARTEXT:
    'CLEARTEXT'
    | 'cleartext'
    | 'CT'
    | 'ct'
    ;
CU:
    'CU'
    | 'cu'
    ;
DELETE:
    'DELETE'
    | 'delate'
    ;
EOL:
    'EOL'
    | 'eol'
    ;
EOT:
    'EOT?'
    | 'eot?'
    ;
HIDETEXT:
    'HIDETEXT'
    | 'hidetext'
    ;
INSERT:
    'INSERT'
    | 'insert'
    ;
PRINT:
    'PRINT'
    | 'print'
    | 'PR'
    | 'pr'
    ;
SELECT:
    'SELECT'
    | 'select'
    ;
SELECTED:
    'SELECTED'
    | 'selected'
    ;
SHOW:
    'SHOW'
    | 'show'
    ;
SHOWTEXT:
    'SHOWTEXT'
    | 'showtext'
    ;
SOL:
    'SOL'
    | 'sol'
    ;
TEXTCOUNT:
    'TEXTCOUNT'
    | 'textcount'
    ;
TEXTITEM:
    'TEXTITEM'
    | 'textitem'
    ;
TEXTPICK:
    'TEXTPICK'
    | 'textpick'
    ;
TEXTWHO:
    'TEXTWHO'
    | 'textwho'
    ;
TOP:
    'TOP'
    | 'top'
    ;
TRANSPARENT:
    'TRANSPARENT'
    | 'transparent'
    ;
UNSELECT:
    'UNSELECT'
    | 'unselect'
    ;

BUTFIRST:
    'BUTFIRST'
    | 'butfirst'
    | 'BT'
    | 'bt'
    ;
BUTLAST:
    'BUTLAST'
    | 'butlast'
    | 'BL'
    | 'bl'
    ;
COUNT:
    'COUNT'
    | 'count'
    ;
EMPTY:
    'EMPTY?'
    | 'empty?'
    ;
EQUALX:
    'EQUAL?'
    | 'equal?'
    ;
FIRST:
    'FIRST'
    | 'first'
    ;
FPUT:
    'FPUT'
    | 'eput'
    ;
IDENTICALX:
    'IDENTICAL?'
    | 'identical?'
    ;
ITEM:
    'ITEM'
    | 'item'
    ;
LAST:
    'LAST'
    | 'last'
    ;
LIST:
    'LIST'
    | 'list'
    ;
LISTX:
    'LIST?'
    | 'list?'
    ;
LPUT:
    'LPUT'
    | 'lput'
    ;
MEMBERX:
    'MEMBER?'
    | 'member?'
    ;
NUMBER:
    'NUMBER?'
    | 'number?'
    ;
PARSE:
    'PARSE'
    | 'parse'
    ;
PICK:
    'PICK'
    | 'pick'
    ;
SENTENCE:
    'SENTENCE'
    | 'sentence'
    | 'SE'
    | 'se'
    ;
WORD:
    'WORD'
    | 'word'
    ;
WORDX:
    'WORD?'
    | 'word?'
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


ASK:
    'ASK'
    | 'ask'
    ;
FREEZE:
    'FREEZE'
    | 'freeze'
    ;
GET:
    'GET'
    | 'get'
    ;
NEWPAGE:
    'NEWPAGE'
    | 'newpage'
    ;
NEWSLIDER:
    'NEWSLIDER'
    | 'newslider'
    ;
NEWTEXT:
    'NEWTEXT'
    | 'newtext'
    ;
NEWTURTLE:
    'NEWTURTLE'
    | 'newturtle'
    ;
REMOVE:
    'REMOVE'
    | 'remove'
    ;
RENAME:
    'RENAME'
    | 'rename'
    ;
SET:
    'SET'
    | 'set'
    ;
TALKTO:
    'TALKTO'
    | 'talkto'
    ;
UNFREEZE:
    'UNFREEZE'
    | 'unfreeze'
    ;

RESETT:
    'RESETT'
    | 'restt'
    ;
TIMER:
    'TIMER'
    | 'timer'
    ;

//commands Variables xx9xx DONE
CLEARNAME:
    'CLEARNAME'
    | 'clearname'
    ;
CLEARNAMES:
    'CLEARNAMES'
    | 'clearnames'
    ;
LET:
    'LET'
    | 'let'
    ;
ASSIGN:
    'ASSIGN'
    | 'assign'
    ;
MAKE:
    'MAKE'
    | 'make'
    ;
NAMEX:
    'NAME?'
    | 'name?'
    ;
NAMES:
    'NAMES'
    | 'names'
    ;
THING:
    'THING'
    | 'thing'
    ;

GETPAGE:
    'GETPAGE'
    | 'getpage'
    ;
NAMEPAGE:
    'NAMEPAGE'
    | 'namepage'
    ;
NEXTPAGE:
    'NEXTPAGE'
    | 'nextpage'
    ;
PAGELIST:
    'PAGELIST'
    | 'pagelist'
    ;
PREVPAGE:
    'PREVPAGE'
    | 'prevpage'
    ;
PROJECTSIZE:
    'PROJECTSIZE'
    | 'projectsize'
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
ANSWER:
    'ANSWER'
    | 'answer'
    ;
KEYX:
    'KEY?'
    | 'key?'
    ;
MOUSEPOS:
    'MOUSEPOS'
    | 'mousepos'
    ;
PEEKCHAR:
    'PEEKCHAR'
    | 'peekchar'
    ;
QUESTION:
    'QUESTION'
    | 'question'
    ;
READCHAR:
    'READCHAR'
    | 'readchar'
    ;
SAY:
    'SAY'
    | 'say'
    ;
SAYAS:
    'SAYAS'
    | 'says'
    ;
SKIPCHAR:
    'SKIPCHAR'
    | 'skipchar'
    ;
VOICES:
    'VOICES'
    | 'voices'
    ;
//commands Control and events xxx13xx
BROADCAST:
    'BROADCAST'
    | 'broadcast'
    ;
CANCEL:
    'CANCEL'
    | 'cancel'
    ;
CAREFULLY:
    'CAREFULLY'
    | 'carefully'
    ;
DOLIST:
    'DOLIST'
    | 'dolist'
    ;
DOTIMES:
    'DOTIMES'
    | 'dotimes'
    ;
ERRORMESSAGE:
    'ERRORMESSAGE'
    | 'errormessage'
    ;
EVERYONE:
    'EVERYONE'
    | 'everyone'
    ;
FOREVER:
    'FOREVER'
    | 'forever'
    ;
LAUNCH:
    'LAUNCH'
    | 'launch'
    ;
OUTPUT:
    'OUTPUT'
    | 'output'
    ;
REPEAT:
    'REPEAT'
    | 'repeat'
    ;

WHILE:
    'WHILE'
    | 'while'
    ;
RUN:
    'RUN'
    | 'run'
    ;
STOP:
    'STOP'
    | 'stop'
    ;
STOPALL:  'STOPALL' | 'stopall';
STOPME:
    'STOPME'
    | 'stopme'
    ;
WAIT:
    'WAIT'
    | 'wait'
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