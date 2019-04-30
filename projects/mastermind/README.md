# Mastermind

We want to implement this game:
https://en.wikipedia.org/wiki/Mastermind_(board_game)

## What the game should do

The game should simulate one round of Mastermind.

The secret is generated randomly by the game:
the user plays against the computer.

The secret and the guesses are made of 4 colors.

Valid colors are represented by letters and are:
- **R**: Red
- **B**: Blue
- **G**: Green
- **Y**: Yellow
- **O**: Orange
- **P**: Pink

Answers are:
- **B**: black, for each color of the user's guess
         that is present at the right position in the secret.
- **W**: white, for each color of the user's guess
         that is present in the secret but not at the position
         guessed by the user.

Examples:

```
Secret RBYP
Guess  ROBG -> answer is B W
Guess  BYRO -> answer is WWW
Guess  GPOR -> answer is WW
Guess  PBYG -> answer is BB W
Guess  PBYR -> answer is BB WW
Guess  RBYP -> answer is BBBB -> win!
```

First all the B answers are printed, then the W answers.

Users try to guess the secret until they find it. 

### Possible improvements

- Allow duplicate colors in the secret.
- Users have 10 guesses, after which they lose.
- The length of the secret can be changed (not necessarily 4)
  by asking the user at the beginning of the game
  how difficult they want it to be

## Design

To be defined.