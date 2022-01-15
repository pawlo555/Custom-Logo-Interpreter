# Custom Logo language
Logo interpreter presented here is just another implementation of popular logo languages.

## Language list of commands:
|Name|Description|Syntax|
|----|-----------|------|
|<b>forward</b>|Move current turtle forward|`forward 100` <br> `fd 50+40`|
|<b>back</b>| Move current turtle back | `backward -10` <br> `bc 50-40`|
|<b>left</b>| Turn current turtle left | `left 90` <br> `lt 45`
|<b>right</b> | Turn current turtle right |
|<b>repeat</b> | Perform block of instruction set number of times |
|<b>while</b> | While loop |
|<b>assign</b> | Assign value to the variable |
|<b>let</b> | Creates a variable with specific value or overwrite it |
|<b>changeTurtle</b> | Change turtle from one to another |
|<b>clean</b> | Clean the canvas |
|<b>home</b> | Set current turtle to start location (0,0)|
|<b>if</b> | If instruction - with no else |
|<b>ifElse</b> | IfElse instruction - else is compulsory to specify |
|<b>newTurtle</b> | creates a new turtle with specified name |
|<b>penDown</b> | Put the pen down - turtle is drawing line when walking |
|<b>penUp</b> | Put the pen up - turtle is not drawing while walking|
|<b>call</b> | Call a specified procedure|
|<b>procedure</b> | Creates a procedure|
|<b>removeTurtle</b> | Removes the selected turtle|
|<b>rename</b> | Change current turtle name|
|<b>setPenColor</b> | Set current turtle pen color|
|<b>setPenSize</b> |Set current turtle pen size|
|<b></b> 

## Math expression:

Language enables writing mathematical expression for example:<br>
`(2+2)*2` will evaluate to 8 and `2+2*2` will evaluate to 6.<br>
When writing operator that takes two arguments put it between them:<br>
`2 pow 7` is correct, while:<br> `pow 2 7` will give an error.<br>

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
