---
title: 5 - Loops
nav_order: 5
has_children: true
---

# Loops

Another concept in the area of control flow are loops. Loops are used in your program to run the same block of code several times.

In Java there are different kinds of loops:

1. `for`
2. `while`
3. `do` ... `while`
4. `for` each

In this lesson we will focus on `for` and `while` loops. However, please note, most of these loop types are interchangeable.
It does not really matter if you use a `for` or a `while` loop to solve your problem.
It is even possible to convert a `for` loop into a `while` loop and vice versa.
But in some cases—for better readability for example—it can be more applicable to use one type of loop instead of another.

Given the syntax is slightly simpler, let's have a look at `while` loops first:

## While loops

The structure of a `while` loop is very similar to the structure of an `if` statement:

```java
while (<CONDITION>) {
    <CODE TO EXECUTE>
}
```

Let's deconstruct this block of code:

1. Like the `if` keyword the `while` keyword is a part of the Java language, you just have to learn it by heart.
2. Like you learned studying the `if` statement, the `<CONDITION>` represents a boolean expression, which evaluates to `true` or `false`.
3. The block between the curly braces—`{}`—will be executed as long as the `<CONDITION>` evaluates to `true`.

An example for the use of a `while` loop is a simple number guessing game. The game works like this:

1. A random number of type `int` will be stored in a variable.
2. The player guesses the number. 
3. The guess will be compared to the random number variable declared in step one.
4. In every loop a secondary variable will be increased to count the tries the player needed to guess the number.
4. If the player correctly guessed the given number, the loop stops.
5. The program then prints the tries the player needed to guess the number.

```java
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 19;
        boolean numberGuessed = false;
        int neededTries = 0;

        while (!numberGuessed) {
            neededTries++;
            System.out.println("Please guess a number between 0 and 20");

            int guessedNumber = input.nextInt();

            if (guessedNumber == numberToGuess) {
                numberGuessed = true;
            }
        }

        System.out.println("Congratulations! You needed " + neededTries + " tries to guess the given number!");
    }
}
```

## For loops

The structure of a `for` loop is a little more complicated:

```java
for (<INITIAL_VALUE>; <CONDITION>; <INCREMENT>) {
    <CODE TO EXECUTE>
}
```

Where a `while` loop is mostly used to run statements until a condition evaluates to `false`, `for` loops are often used to run a code block—represented by `<CODE TO EXECUTE>` between the `{}`—a given amount of times.

For this kind of loop a few values must be defined.

1. `<INITIAL_VALUE>`: The starting value.
2. `<CONDITION>`: When to stop.
3. `<INCREMENT>`: How much to add to the `<INITIAL_VALUE>` on each loop.

A very simple example of a `for` loop is increasing an integer by 1 for every loop
and printing the value of the **counting variable**, in our case, the `int i = 0`:

```java
public class SimpleForLoopExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }
    }
}
```

This example does not do a lot, given it’s just printing the value of `i` from 0 to 9. 
To see the power of `for` loops, let's convert our earlier example of the number guessing game and substitute the `while` loop for a `for` loop.
The goal here is to limit the tries a player has to guess the number:

```java
import java.util.Scanner;

public class NumberGuessingGameForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 19;
        boolean numberGuessed = false;
        int neededTries = 0;
        int maximumTries = 5;

        for (int i = 0; i < maximumTries; i++) {

            if (!numberGuessed) {
                neededTries++;
                System.out.println("Please guess a number between 0 and 20");

                int guessedNumber = input.nextInt();

                if (guessedNumber == numberToGuess) {
                    numberGuessed = true;
                }
            }
        }

        if (numberGuessed) {
            System.out.println("Congratulations! You needed " + neededTries + " tries to guess the given number!");
        }
        else {
            System.out.println("Sorry but you lost the game!");
        }
    }
}
```

Another example is the programming game we developed in our first lesson, where we tried to find the tallest person in our group. 

If you remember, we learned how to compare the height (or just two numbers) of two people in our previous class about decision statements:

Recap:
{: .label .label-red }

```java
public class TallestPerson {

    public static void main(String[] args) {
        int currentHeightInCm = 185;
        int newHeightInCm = 187;        

        if (newHeightInCm > currentHeightInCm) {
            currentHeightInCm = newHeightInCm;
        }

        System.out.println("Right now the tallest person in the group is " + currentHeightInCm + "cm tall!");
    }
}
```

This program will run once and compare both numbers stored in `currentHeightInCm` and `newHeightInCm` and
save the largest of both numbers in the variable `currentHeightInCm`. When the program is finished the variable
`currentHeightInCm` will contain the largest of these two numbers. So far so good.
This is a good start, but imagine we now need to execute these statements for every person in our class. How would we do this?

What we need to do:

1. Ask the user how many people are members of our class.
2. Store this number. 
3. Create a new variable to store the height of the current tallest person (right now it’s 0 because the tallest person is not yet evaluated).
4. Ask the next person for his/her height.
5. Store this height in a second variable.
6. Compare the new variable with the variable which contains the height of the person who is the tallest person so far.
7. If the new person is taller than the current tallest person, store the new height in the variable for the current tallest person.
8. Repeat steps 4 -7 for all students in the class.

```java
import java.util.Scanner;

public class TallestPersonEvaluator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me: How many people are in your class?");

        int numberOfPeople = input.nextInt();

        int tallestPersonInCm = 0;

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("How tall is the next person?");

            int currentHeight = input.nextInt();

            if (currentHeight > tallestPersonInCm) {
                tallestPersonInCm = currentHeight;
            }
        }

        System.out.println("The tallest person in your class is " + tallestPersonInCm + " cm tall!");
    }
}
```

Mostly `for` loops are used in combination with collections like an `ArrayList`.
What an `ArrayList` is and how to iterate over it using a `for` loop will be discussed in a later chapter.

Material:
- [Slides](https://drive.google.com/open?id=1rXD7s4BHbhagSCYkUmzy8VBnzEBWFUSoOUEWA01ZLlU)