# Custom Logo language
Logo interpreter presented here is just another implementation of popular logo languages.

## Language list of commands:
|Name|Description|Syntax|
|----|-----------|------|
|<b>forward</b>|Move current turtle forward|`forward 100` <br> `fd 50+40`|
|<b>back</b>| Move current turtle back | `backward -10` <br> `bc 50-40`|
|<b>left</b>| Turn current turtle left | `left 90` <br> `lt 45` |
|<b>right</b> | Turn current turtle right | `right 90` <br> `rt 45` |
|<b>repeat</b> | Perform block of instruction set number of times | `repeat 2 [ fd 20 lt 90]` |
|<b>while</b> | While loop | `while 1 [ fd 20 rt 90]` | 
|<b>assign</b> | Assign value to the variable |
|<b>let</b> | Creates a variable with specific value or overwrite it |
|<b>changeTurtle</b> | Change turtle from one to another |  `changeturtle tt` |
|<b>clean</b> | Clean the canvas | `clean` |
|<b>home</b> | Set current turtle to start location (0,0)| `home` |
|<b>if</b> | If instruction - with no else |
|<b>ifElse</b> | IfElse instruction - else is compulsory to specify |
|<b>newTurtle</b> | creates a new turtle with specified name | `newturtle tt` |
|<b>penDown</b> | Put the pen down - turtle is drawing line when walking | `pd` |
|<b>penUp</b> | Put the pen up - turtle is not drawing while walking| `pu` |
|<b>call</b> | Call a specified procedure|
|<b>procedure</b> | Creates a procedure|
|<b>removeTurtle</b> | Removes turtle | `removeturtle tt` |
|<b>rename</b> | Change current turtle name| `rename ttt` |
|<b>setColor</b> | Set current turtle pen color| `setcolor 7` |
|<b>setPenSize</b> |Set current turtle pen size| `setpensize 5` |
|<b></b> 

## Math expression:

Language enables writing mathematical expression for example:<br>
`(2+2)*2` will evaluate to 8 and `2+2*2` will evaluate to 6.<br>
When writing operator that takes two arguments put it between them:<br>
`2 pow 7` is correct, while:<br> `pow 2 7` will give an error.<br>
<br>
List of mathematical expressions:

|Name|Value|Alternative values|Description|
|----|-----|------------------|-----------|
|<b>abs</b>| abs|ABS| Absolute value|
|<b>arctan</b>|arctan|ARCTAN| Arcus tangent from value |
|<b>cos</b>| cos|COS| Cosine function |
|<b>int</b>| int | INT | Cast value to integer |
|<b>ln</b>| ln | LN | Natural logarithm |
|<b>minus</b>| - | | Minus sign |
|<b>random</b>| random | RANDOM | Random number between 0 (inclusive) and specified value (casted to int and exclusive)
|<b>round</b>| round | ROUND | Round value to integer
|<b>sin</b>| sin | SIN | Sinus function |
|<b>sqrt</b>| sqrt | SQRT | Square root of value | 
|<b>tan</b>| tan | TAN | Tangent function
|<b>not</b>| not | NOT, ! | Logical not |
|<b>power</b>| pow | POW | Power of two numbers 10 pow 2 is equal 100
|<b>sum</b>| + | | Sum of two values
|<b>product</b>| * | | Product of two values
|<b>division</b>| / | | Division of two values
|<b>different</b>| != | | Not equal |
|<b>equals</b>| == | | Equal
|<b>bigger</b>| \> | | Bigger relation
|<b>smaller</b>| < | | Smaller relation
|<b>bigger or equal</b>| \>= | => | Bigger or equal relation
|<b>smaller or equal</b>| <= | =< | Smaller or equal relation
|<b>exp</b>| exp | EXP | Exponential function equals to POW with e as exponent
|<b>log</b>| log | LOG | Logarithm with specified base: 2 log 16 = 4
|<b>or</b>| or | OR, &#124;&#124; | Logical or |
|<b>and</b>| and | AND, && | Logical and |



## Variables
Variable could bea an integer, boolean or double.<br>
Variable names as in Python are just references, they don't refer to specify type.<br>
All possible conversions will be done automatically for example:<br>
true will be cast to 1 or 1.0 if necessary and 0 to false or 0.0<br>

## Lists of commands
In many commands you are supposed to add at least one list of commands. These 3 ways of doing this are the same:
```
if 1>0 forward 100
if 1>0 { forward 100 }
if 1>0 [ forward 100 ]
```
You can omit brakets when writing only one command. You also can choice between `{}` and `[]` 


## Variables name
In order to refer to variable name `x` you have to add at least one `:` before variable name.
Numbers of `:` refers to scope. Basically each `:` refers to one scope starting from `:` referring to the current scope.<br>
Language supports variables shadowing and using expressions like: `::x` could be useful in some situation. <br>
Let examine this code:
```
let :x 100
repeat 1 {
    let :x 50
    forward ::x
    back :x
}
```
In this situation turtle will move 100 forward and then 50 back.<br>
It's work a bit different with `assign` command.
```
let :x 100
repeat 1 {
    let :x -10
    repeat 1 {
        assign :x 50 // this will affect x from first repeat
        assign ::x 50 // to change global x
        let ::x 25 // will change x from first repeat
        let :x 1
        assign :x 50 // now this will affect x from second repeat
        assign :::x 100 // now this will set global x to initial value
    }
}
```
The difference is that `let` counts all scopes but `assign` counts only those containing selected variable.<br>
So where changing value of variable from outer scope it is better to use `assign`. <br>
Scopes are counting like in `assign` also in others commands. 

## Procedures
There are two commands that are connected with procedures: `call` and `procedure`.
First is used to call procedure. Second to create it. Example:
```
procedure square :x {
    repeat 4 {
        forward :x
        left 90
    }
}
call square 100 
```

# Custom Logo Interpreter

- create executable jar/exe - Michał
- add commands that returning value (e.g. getX) - Michał/Paweł - mostly
- multiple turtles (add, remove, change turtle commands) - Michał - DONE (TO CHECK RENAME)
    commands
    - newturtle x - adds new turtle to playground x = new turtle name
    - rename x - renames current turtle to name x
    - remove x - removes turtle x
    - changeturtle x - changes current turtle to turtle x
- commands to change pen size and color (optionally turtle color) - Michał - PARTLY DONE
- implement easy commands as setting turtle visible - Michał
- documentation - Paweł
    - all commands list
    - all commands examples
    - how gui work
- add errors to math expressions and check order: e.g. write: 2 pow 16 or 16 pow 2