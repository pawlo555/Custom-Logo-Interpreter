grammar Lynx; // Define a grammar called Hello

// PARSER

program
    : line+ endFileArg
    ;
line
    : brakeArg? (spaceArg? cmd spaceArg?)+   brakeArg?
    ;
cmd:
    //operation commands
    repeat
    //number commands
    | forward
    | back
    | left
    | right
    | setheading
    | setx
    | sety
    // bracket commands
    | setpos
    // word commands
    | distance
    | towards
    // duble number commands
    | gilde
    // just commands
    | heading
    | home
    | pos
    | xcor
    | ycor
    ;


//if                : IF WHITESPACE (NATURALNUMBER | )

//operation commands
repeat:
    REPEAT brakeArg naturalNumberArg brakeArg '[' line']' ;

//number commands
back:
    BACK brakeArg totalnumberArg
    ;
forward:
    FORWARD brakeArg totalnumberArg
    ;
left:
    LEFT brakeArg totalnumberArg
    ;
right:
    RIGHT brakeArg totalnumberArg
    ;
setheading:
    SETHEADING brakeArg totalnumberArg
    ;
setx:
    SETX brakeArg totalnumberArg
    ;
sety:
    SETY brakeArg totalnumberArg
    ;

//bracket commands
setpos:
    SETPOS brakeArg  '[' brakeArg totalnumberArg brakeArg ',' brakeArg totalnumberArg  brakeArg']'
    ;

//word commands
distance:
    DISTANCE brakeArg stringArg
    ;
towards:
    TOWARDS brakeArg stringArg
    ;

gilde:
    GLIDE brakeArg totalnumberArg brakeArg totalnumberArg
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

//COMMANDS MOVING xx1xx
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

//COMMANDS DRAVING xx2xx
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

//commands turtle state xx3xx
HT:
    'HT'
    | 'ht'
    ;
INBACK:
    'INBACK'
    | 'INBACK'
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

//commands turtle (other) xx4xx
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

//commands text xx5xx
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

//commands words and lists xx5xx
BUTFIRST:
    'BUTFIRST'
    | 'butfirst'
    | 'BT'
    | 'bt'
    ;
BUTLAST:
    'BUTLAST'
    | 'butlast'
    | 'BT'
    | 'bt'
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
//commands number and maths xx6xx
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

//commands Objects xx7xx
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

//commands Timer xx8xx
RESETT:
    'RESETT'
    | 'restt'
    ;
TIMER:
    'TIMER'
    | 'timer'
    ;

//commands Variables xx9xx
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
//commands logic xxx11xx
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
STOPALL:
    'STOPALL'
    | 'stopall'
    ;
STOPME:
    'STOPME'
    | 'stopme'
    ;
WAIT:
    'WAIT'
    | 'wait'
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

