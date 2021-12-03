grammar Lynx; // Define a grammar called Hello

// PARSER

program
    : line+ endFileArg
    ;
line
    : brakeArg? (spaceArg? cmd spaceArg?)+   brakeArg?
    ;
cmd:
    repeat
    | procedure
    | procedureCall
    //move cmd
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
    | glide
    | heading
    | home
    | pos
    | xcor
    | ycor
    //math cmd
    | arctan
    | abs
    | cos
    | exp
    | intC
    | ln
    | log
    | minus
    | random
    | round
    | sin
    | sqrt
    | tan
    | difference
    | greaterx
    | lessx
    | power
    | product
    | quotient
    | remainder
    | sum
    | pi
    //variables cmd
    | clearname
    | namex
    | thing
    | clearnames
    | names
    | let
    | make
    //logic cmd
    | ifC
    | ifelse
    | not
    | or
    | and
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


procedure:
    PROCEDURE brakeArg stringArg brakeArg '['brakeArg? line+ brakeArg?']'
    ;

procedureCall:
    CALL brakeArg stringArg;
//operation commands
repeat:
    REPEAT brakeArg naturalNumberArg brakeArg '[' line']' ;

//number commands
back:
    BACK brakeArg mathStatment
    ;
forward:
    FORWARD brakeArg mathStatment
    ;
left:
    LEFT brakeArg mathStatment
    ;
right:
    RIGHT brakeArg mathStatment
    ;
setheading:
    SETHEADING brakeArg mathStatment
    ;
setx:
    SETX brakeArg mathStatment
    ;
sety:
    SETY brakeArg mathStatment
    ;
abs:
    ABS brakeArg mathStatment
    ;
arctan:
    ARCTAN brakeArg mathStatment
    ;
cos:
    COS brakeArg mathStatment
    ;
exp:
    EXP brakeArg mathStatment
    ;
intC:
    INT brakeArg mathStatment
    ;
ln:
    LN brakeArg mathStatment
    ;
log:
    LOG brakeArg mathStatment
    ;
minus:
    MINUS brakeArg mathStatment
    ;
random:
    RANDOM brakeArg mathStatment
    ;
round:
    ROUND brakeArg mathStatment
    ;
sin:
    SIN brakeArg mathStatment
    ;
sqrt:
    SQRT brakeArg mathStatment
    ;
tan:
    TAN brakeArg mathStatment
    ;
namefromcolor:
    NAMEFROMCOLOUR brakeArg mathStatment
    ;
setcolor:
    SETCOLOR brakeArg mathStatment
    ;
setpensize:
    SETPENSIZE brakeArg mathStatment
    ;
setbg:
    SETBG brakeArg mathStatment
    ;




//bracket commands
setpos:
    SETPOS brakeArg  '[' brakeArg totalnumberArg brakeArg ',' brakeArg totalnumberArg  brakeArg']'
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

//double number commands
glide:
    GLIDE brakeArg totalnumberArg brakeArg totalnumberArg
    ;
difference:
    DIFFERENCE brakeArg mathStatment brakeArg mathStatment
    ;
greaterx:
    GREATERX brakeArg mathStatment brakeArg mathStatment
    ;
lessx:
    LESSX brakeArg mathStatment brakeArg mathStatment
    ;
power:
    POWER brakeArg mathStatment brakeArg mathStatment
    ;
product:
    PRODUCT brakeArg mathStatment brakeArg mathStatment
    ;
quotient:
    QUOTIENT brakeArg mathStatment brakeArg mathStatment
    ;
remainder:
    REMAINDER brakeArg mathStatment brakeArg mathStatment
    ;
sum:
    SUM brakeArg mathStatment brakeArg mathStatment
    ;

//double true false command
and:
    AND brakeArg logicStatement brakeArg logicStatement
    ;

// weird logic things
ifC:
    IF brakeArg logicStatement brakeArg '[' brakeArg? line brakeArg? ']'
    ;
ifelse:
    IFELSE brakeArg logicStatement brakeArg '[' brakeArg? line brakeArg? ']' brakeArg '[' brakeArg? line brakeArg? ']'
    ;
not:
    NOT brakeArg logicStatement
    ;
or:
    OR brakeArg logicStatement brakeArg logicStatement
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
xcor:
    XCOR
    ;
ycor:
    YCOR
    ;
clearnames:
    CLEARNAMES
    ;
names:
    NAMES
    ;
pi:
    PI
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
    LET brakeArg list
    ;

//word list commands
make:
    MAKE brakeArg '\''stringArg'\'' brakeArg (WORD|list)
    ;

//mathstatments
mathStatment:
    ((brackets brakeArg? mathSign brakeArg?)+)? brackets
    ;

brackets:
    anynumberArg
    | '(' brakeArg? mathStatment brakeArg?')'
    | abs
    | arctan
    | cos
    | exp
    | intC
    | ln
    | log
    | minus
    | pi
    | power
    | product
    | quotient
    | random
    | remainder
    | round
    | sin
    | sqrt
    | sum
    | sum
    | tan
    | difference
    ;

logicStatement:
    ((logicbrackets brakeArg? logicSign brakeArg?)+)? logicbrackets
    | greaterx
    | lessx
    ;

logicbrackets:
    '(' brakeArg? logicStatement  brakeArg?')'
    | brackets
    | and
    | or
    | not
    ;


logicSign:
    LESSS | MORES | EQUALS | MOREEQUALS | LESSEQUALS
    ;

mathSign:
    PLUSS | MINUSS | DIVIDES | MULTIPLYS
    ;


//arguments
spaceArg:
    (WHITESPACE)+
    ;
newLineArg:
    NEWLINE+
    ;
brakeArg:
    (spaceArg | newLineArg)+
    ;
naturalNumberArg:
    NATURALNUMBER
    ;
totalnumberArg:
    NATURALNUMBER
    | NEGATINATURALNUMBER
    ;
anynumberArg:
    FLOATNUMBER
    | totalnumberArg
    ;
list:
    '[' (brakeArg? stringArg|mathStatment)+ brakeArg? ']'
    ;
stringArg:
    OTHERWORD
    ;
endFileArg:
    EOF
    ;


// LEXER

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
GLIDE:
    'GILDE'
    |'gilde'
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
XCOR:
    'XCOR'
    | 'xcor'
    ;
YCOR:
    'YCOR'
    | 'ycor'
    ;

//COMMANDS DRAVING xx2xx TODO
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

//commands turtle state xx3xx TODO
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

//commands turtle (other) xx4xx TODO
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

//commands text xx5xx TODO
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

//commands words and lists xx5xx TODO
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
    'DIFFERENCE'
    | 'difrence'
    ;
EXP:
    'EXP'
    | 'exp'
    ;
GREATERX:
    'GREATER?'
    | 'greater?'
    ;
INT:
    'INT'
    | 'int'
    ;
LESSX:
    'LESS?'
    | 'less?'
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
    'MINUS'
    | 'minus'
    ;
PI:
    'PI'
    | 'pi'
    ;
POWER:
    'POWER'
    | 'power'
    ;
PRODUCT:
    'PRODUCT'
    | 'product'
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
    'SUM'
    | 'sum'
    ;
TAN:
    'TAN'
    | 'tan'
    ;

//commands Objects xx7xx TODO
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

//commands Timer xx8xx TODO
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
//commands Pages and project  xx10xx
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





//MATH
PLUSS:
    '+'
    ;
MINUSS:
    '-'
    ;
DIVIDES:
    '/'
    ;
MULTIPLYS:
    '*'
    ;

//Logic

LESSS:
    '<'
    ;
MORES:
    '>'
    ;
EQUALS:
    '=='
    ;
LESSEQUALS:
    '<=' | '=<'
    ;
MOREEQUALS:
    '>=' | '=>'
    ;
// DIGITS
NATURALNUMBER:
    '+'? DIGIT+
    ;
NEGATINATURALNUMBER:
    '-' WHITESPACE? DIGIT+
    ;
FLOATNUMBER:
    ('-'|'+')? DIGIT+ ([.,] DIGIT+)?
    ;

//ADDITIONS
OTHERWORD:
    (LOWERCASE | UPPERCASE | DIGIT |'_')+
    ;
WHITESPACE:
    ' '
    | '\t'
    ;
NEWLINE:
    '\r'? '\n'
    | '\r';
