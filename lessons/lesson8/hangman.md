---
title: "Exercise: Hangman"
nav_order: 3
parent: 8 - ArrayLists
grand_parent: Lessons
---

# Exercise: Hangman

Let's implement a simple hangman game.

## 1. getLetterIndexes

Write a method `public static ArrayList<Integer> getLetterIndexes(String word, char letter)` which returns
an `ArrayList` that contains the indexes where the `letter` appears in the `word`.

Example: for word `hello` and letter `l`, the method shall return an `ArrayList` which contains `[2,3]`.

## 2. uncoverLetters

Write a method `public static void uncoverLetters(ArrayList<Character> guess, ArrayList<Integer> indexes, char letter)`
which updates the `guess`, uncovering `letter` at position `indexes`.

Example: for guess `[_, _, l, l, _]`, indexes `[1]`, letter `e`, it updates guess to contain `[_, e, l, l, _]`.

## Implementing the hangman

Implement the hangman game:

1. Read `word` from the user.
2. Create an `ArrayList<Character>` long as the length of the `word`, containing only underscores '_'.
   This represents the letters currently guessed by the user. When a user guesses a letter
   contained in `word`, the `guess` is updated, showing letters successfully guessed.
3. As long as the `guess` created in 2. contains at least one underscore:
  - ask the user for a character.
  - update the current guess showing the guessed letters in `word`.
  - print the new `guess`.
4. When the `guess` does not contain any underscore, write "You won the game" to the screen!

*HINT*
Use the methods from 1. and 2. for implementing the game, or any other method you find in
[ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html).
