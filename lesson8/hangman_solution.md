---
title: "Solution: Hangman"
nav_order: 4
parent: 8 - ArrayLists
---

# Solution: Hangman

```java
import java.util.ArrayList;
import java.util.Scanner;

class Hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What word do you want to guess?");
        String word = scanner.next();

        // Initial guess, only _
        ArrayList<Character> guess = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            guess.add('_');
        }

        while (guess.contains('_')) {
            System.out.println("Guess a letter:");

            String letters = scanner.next(); // scanner.nextChar does not exist :-(
            char letter = letters.charAt(0); // we read a string and take the first char

            // Positions to uncover
            ArrayList<Integer> indexes = getLetterIndexes(word, letter);

            // Update guess, uncovering guessed letters
            uncoverLetters(guess, indexes, letter);

            // Print what happened
            System.out.println(guess);
        }

        System.out.println("You won the game!");
    }

    public static ArrayList<Integer> getLetterIndexes(String word, char letter) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void uncoverLetters(ArrayList<Character> guess, ArrayList<Integer> indexes, char letter) {
        for (int i: indexes) {
            guess.set(i, letter);
        }
    }
}
```
