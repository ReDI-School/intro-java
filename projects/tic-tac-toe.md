1. Break down a program
Try to split your project into multiple blocks that belong together. 
- What are diffent parts of your application?
- What is the central feature / interaction?
- Implement the part that you identified as the msot important part of your program.


Answer the questions for the tic tac toe game below.

<details>
  <summary>Answer</summary>
  
Parts:
- Menu
- Choose game mode
- Draw the game board
- User input
  - Handle invalid input
- Swap user each turn
- Check if somebody won
- End screen
    
Central Feature:
- Draw the board
- Input and change the board
- Check win condition
</details>


```
> Welcome to tic tac toe
> Loading.... 
> Do you want to play against a human or a computer? 
< human 
> Player 1 enter your name: 
< Fred
> Player 2 enter dour name: 
< Erik

> [ ][ ][ ]
> [ ][ ][ ]
> [ ][ ][ ]
> Freds turn: 
> Enter x: 
< 4
> Enter x:
< 2
> Enter y: 
< 1 

> [ ][X][ ]
> [ ][ ][ ]
> [ ][ ][ ]
> Eriks
turn: 
> Enter x: 
< 1
> Enter y: 
< 1 

> [O][X][ ]
> [ ][ ][ ]
> [ ][ ][ ]

// repeat until someone wins
// how to check if won?

> Fred wins!!
> Play again?
< No
EXIT
```
