# Mastermind

We want to implement this game:
https://en.wikipedia.org/wiki/Mastermind_(board_game)

## What the game should do

The game should simulate one round of Mastermind.

The secret is generated randomly by the game:
the user plays against the computer.

The secret and the guesses are made of 4 colors.

Valid colors are represented by letters and are:
- R: Red
- B: Blue
- G: Green
- Y: Yellow
- O: Orange
- P: Pink

Answers are:
- B: black, for each color that user guesses
     that is present at the right position in the secret.
- W: white, for each color that user guesses
     that is present in the secret but not at the position
     the user specified

Examples:

```
Secret RBYP
Guess  ROBG -> answer is B W
Guess  BYRO -> answer is W W W
Guess  GPOR -> answer is W W
Guess  PBYG -> answer is B B W
Guess  PBYR -> answer is B B W W
Guess  RBYP -> answer is B B B B
```

First all the B answers are printed, then the W answers.

Users try to guess the secret until they find it. 

### Possible improvements

- Allow duplicate colors in the secret.
- Users have 10 guesses, after which they lose.
- The length of the secret can be changed (not necessarily 4)

## Design

To be defined.