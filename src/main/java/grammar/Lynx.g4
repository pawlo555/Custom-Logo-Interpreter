grammar Lynx; // Define a grammar called Hello

// PARSER

program             : command+ EOF ;
command             : numberCommand | bracketCommand | wordCommand | numberNumberCommand | justCommand | repeat | NEWLINE;
numberCommand       : (BACK | FORWARD | LEFT | RIGHT | SETHEADING | SETX | SETY) WHITESPACE totalnumber ;
bracketCommand      : (SETPOS) WHITESPACE '[' totalnumber ',' totalnumber ']';
wordCommand         : (DISTANCE | TOWARDS) WHITESPACE WORD;
numberNumberCommand : (GLIDE) WHITESPACE totalnumber WHITESPACE totalnumber;
justCommand         : (HEADING | HOME | POS | XCOR | YCOR);
repeat              : REPEAT WHITESPACE NATURALNUMBER WHITESPACE insideLoop ;
//if                  : IF WHITESPACE (NATURALNUMBER | )
insideLoop          : '[' WHITESPACE? (multipleInside | oneInside) WHITESPACE?']';
multipleInside      : ((command WHITESPACE)+ oneInside | oneInside);
oneInside           : command;
totalnumber         : (NATURALNUMBER | NEGATINATURALNUMBER);


// LEXER
//BIG LETERS
fragment A          : ('A') ;
fragment B          : ('B') ;
fragment C          : ('C') ;
fragment D          : ('D') ;
fragment E          : ('E') ;
fragment F          : ('F') ;
fragment G          : ('G') ;
fragment H          : ('H') ;
fragment I          : ('I') ;
fragment J          : ('J') ;
fragment K          : ('K') ;
fragment L          : ('L') ;
fragment M          : ('M') ;
fragment N          : ('N') ;
fragment O          : ('O') ;
fragment P          : ('P') ;
fragment R          : ('R') ;
fragment S          : ('S') ;
fragment T          : ('T') ;
fragment U          : ('U') ;
fragment W          : ('W') ;
fragment X          : ('X') ;
fragment Y          : ('Y') ;
fragment Z          : ('Z') ;
fragment Q          : ('Q') ;
fragment V          : ('V') ;

//SMALL LETERS
fragment Aa         : ('a') ;
fragment Bb         : ('b') ;
fragment Cc         : ('c') ;
fragment Dd         : ('d') ;
fragment Ee         : ('e') ;
fragment Ff         : ('f') ;
fragment Gg         : ('g') ;
fragment Hh         : ('h') ;
fragment Ii         : ('i') ;
fragment Jj         : ('j') ;
fragment Kk         : ('k') ;
fragment Ll         : ('l') ;
fragment Mm         : ('m') ;
fragment Nn         : ('n') ;
fragment Oo         : ('o') ;
fragment Pp         : ('p') ;
fragment Rr         : ('r') ;
fragment Ss         : ('s') ;
fragment Tt         : ('t') ;
fragment Uu         : ('u') ;
fragment Ww         : ('w') ;
fragment Xx         : ('x') ;
fragment Yy         : ('y') ;
fragment Zz         : ('z') ;
fragment Qq         : ('q') ;
fragment Vv         : ('v') ;

//ALL LETERS
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

// DIGITS
fragment DIGIT      : [0-9] ;
NEGATINATURALNUMBER : ('-') WHITESPACE DIGIT+;
NATURALNUMBER       : DIGIT+ ;
FLOATNUMBER         : ('-')? DIGIT+ ([.,] DIGIT+)? ;

//LOGIC
NOT                 : ('!');
AND                 : ('&&' | Aa Nn Dd);
OR                  : ('||' | Oo Rr);

//COMMANDS
BACK                : (B A C K | B K);
DISTANCE            : D I S T A N C E;
FORWARD             : (F O R W A R D | F D);
GLIDE               : G I L D E;
HEADING             : H E A D I N G;
HOME                : H O M E;
LEFT                : (L E F T | L T);
POS                 : P O S;
RIGHT               : (R I G H T | R T);
SETHEADING          : (S E T H E A D I N G | S E T H);
SETPOS              : S E T P O S;
SETX                : S E T X;
SETY                : S E T Y;
TOWARDS             : T O W A R D S;
XCOR                : X C O R;
YCOR                : Y C O R;

//KEY COMMANDS
REPEAT              : Rr Ee Pp Ee Aa Tt;
IF                  : Ii Ff;

//ADDITIONS
WORD                : (LOWERCASE | UPPERCASE | DIGIT |'_')+ ;
WHITESPACE          : (' ' | '\t') ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;
IFSTATMENT          : ('<' | '>' | '==' );


