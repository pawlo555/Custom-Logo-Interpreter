grammar LynxSimple;

start             : command+ EOF ;
command:        COMMMANDID SPACE NUMBER;

COMMMANDID: 'forward';
SPACE: (' ')+;
NUMBER: '90';