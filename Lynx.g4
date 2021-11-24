grammar Lynx; // Define a grammar called Hello

// PARSER

program
    : line+ endFileArg
    ;
line
    : newLineArg? (spaceArg? cmd spaceArg?)+   newLineArg?
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
    REPEAT spaceArg naturalNumberArg spaceArg insideLoop ;

insideLoop:
    '[' line']'
    ;


//number commands
back:
    BACK spaceArg totalnumberArg
    ;
forward:
    FORWARD spaceArg totalnumberArg
    ;
left:
    LEFT spaceArg totalnumberArg
    ;
right:
    RIGHT spaceArg totalnumberArg
    ;
setheading:
    SETHEADING spaceArg totalnumberArg
    ;
setx:
    SETX spaceArg totalnumberArg
    ;
sety:
    SETY spaceArg totalnumberArg
    ;

//bracket commands
setpos:
    SETPOS spaceArg  '[' spaceArg totalnumberArg spaceArg ',' spaceArg totalnumberArg  spaceArg']'
    ;

//word commands
distance:
    DISTANCE spaceArg stringArg
    ;
towards:
    TOWARDS spaceArg stringArg
    ;

gilde:
    GLIDE spaceArg totalnumberArg spaceArg totalnumberArg
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
naturalNumberArg:
    NATURALNUMBER
    ;
totalnumberArg:
    NATURALNUMBER
    | NEGATINATURALNUMBER
    ;
stringArg:
    WORD
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

//KEY COMMANDS
REPEAT:
    'repeat'
    ;
IF:
    'if'
    ;

//COMMANDS MOVING
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
//COMMANDS DRAVING



//LOGIC
NOT:
    'NOT'
    |'not'
    | '!'
    ;
AND:
    'AND'
    | 'and'
    | '&&'
    ;
OR:
    'OR'
    | 'or'
    | '||'
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
WORD:
    (LOWERCASE | UPPERCASE | DIGIT |'_')+
    ;
WHITESPACE:
    ' '
    | '\t'
    ;
NEWLINE:
    '\r'? '\n'
    | '\r';
//IFSTATMENT: ('<' | '>' | '==');


