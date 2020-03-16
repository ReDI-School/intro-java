---
title: 5 - Loops
nav_order: 5
has_children: true
---

# Loops

Another concept in the area of control flow are loops. Loops are used if your program shall run the same block of code several times:

In Java there are several kinds of different loops:

1. for
2. while
3. for each
4. do while

In this lesson, we will focus on the **for** and the **while** loop. Most of these loop types are interchangeable. This means it does not really matter if you use a for or a while loop to solve your problem. If you want you it is even possible to convert a for loop into a while loop and the other way around. But in some cases and specially for better readability it is more applicable to use a for over a while loop and the other way around.

Let's have a look at for loops first:

## while loops

The structure of a while loop is very similar to the structure as we know it of an if statement:

```java
while(<CONDITION>)
{
    <CODE TO EXECUTE>
}

```

Let's rip this block of code apart:

1. Like the **if** statement the **while** keyword is a part of the java language you just have to learn by heart
2. Like you learned from the if statement the <CONDITION> is a boolean expression, which evaluates to true or false.
3. The block between **{** and **}**  <CODE TO EXECUTE> will be executed as long as the <CONDITION> evaluates to true.

An example for the use of a while loop could be a simple number guessing game:
The game works like this:
1. A (random) number (int) will be stored in a variable
2. The player guesses the number 
3. The guess will be compared to the given number from step one
4. Every loop turn a secondary variable will be increased to count the tries the player needed to guess the number
4. If the player correctly guessed the given number, the loop stops
5. Print the tries the player needed to guess the number

```java
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 19;
        boolean numberGuessed = false;
        int neededTries = 0;

        while(!numberGuessed) {
            neededTries++;
            System.out.println("Please guess a number between 0 and 20");

            int guessedNumber = input.nextInt();

            if(guessedNumber == numberToGuess) {
                numberGuessed = true;
            }
        }

        System.out.println("Gratulations! You needed " + neededTries + " ties to guess the given number!");
    }
}
```

## for loops

The structure of a for loop is a little more complicated:

```java
for(<INITIALIZATION>; <CONDITION>; <INCREMENTATION>) {
    <CODE TO EXECUTE>
}

```

Where a **while** loop is mostly used to run statements until the condition changes to false **for** loops are often used to run the codeblock <CODE TO EXECUTE> between the **{** **}** for a given amount of times.
For this kind of loop it needs to be specified where to start which is done in the <INITIALIZATION> part.
When to stop is defined in the <CONDITION> part. This condition is equal to the while loop a boolean expression. Often this condition is a comparison between two numbers (for example the **counting variable** defined in the <INITIALIZATION> part and a limit).
The value of the **counting variable** is increased in the <INCREMENTATION> part.

A very simple example for a for loop would be increasing an integer by 1 in every loop and printing the value of the **counting variable**:

```java
public class SimpleForLoopExample {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }
    }
}
```

This example does not make a lot of sense, because it is just printing the value of i from 0 to 9.

But we could convert the example for the while loop - The number guessing game - by using a for loop. What will be changed in this version is, that the player gets a limited amount of tries to guess the number:

```java
import java.util.Scanner;

public class NumberGuessingGameForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 19;
        boolean numberGuessed = false;
        int neededTries = 0;
        int maximumTries = 5;

        for(int i = 0; i < maximumTries; i++) {

            if(!numberGuessed) {
                neededTries++;
                System.out.println("Please guess a number between 0 and 20");

                int guessedNumber = input.nextInt();

                if(guessedNumber == numberToGuess) {
                    numberGuessed = true;
                }
            }
        }

        if(numberGuessed) {
            System.out.println("Gratulations! You needed " + neededTries + " ties to guess the given number!");
        }
        else {
            System.out.println("Sorry but you lost the game!");
        }
    }
}

```

Another example is the first programming example game we did in our first lesson, where we tried to find the tallest person in our group. If you remember we learned how to compare the height (or just two numbers) of two people in our previous class about decision statements:


Recap:
{: .label .label-red }

```java

public class HeighestPerson {

    public static void main(String[] args) {
        int currentHeightInCm = 185;
        int newHeightInCm = 187;        

        if(newHeightInCm > currentHeightInCm) {
            currentHeightInCm = newHeightInCm;
        }

        System.out.println("Right now the tallest person in the group is " + currentHeightInCm + "cm tall!");
    }
}
```

This program will run once and compare the both numbers stored in **currentHeightInCm** and **newHeightInCm** and saves the biggest of both numbers in the variable **currentHeightInCm**. When the program is finished the variable **currentHeightInCm** will contain the biggest of these both numbers.
So far so good. This is a good base for out program but now we need to execute this statements for every person in our class.

What we need to do:
1. Ask the user how many people are members of our class
2. Store this number 
3. Create a new variable to store the height of the current tallest person (right now it is 0 because the tallest person is not evaluated yet)
4. Ask the next person for his height
5. Store this height in a second variable
6. Compare the new variable with the variable which contains the height of the person who is the tallest person right now
7. If the new person is taller than the current tallest person store the new height in the variable for the current tallest peson
8. Repeat steps 4 -7 for all students in the class.

```java
import java.util.Scanner;

public class TallestPersonEvaluator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me: How many people are in you class");

        int numberOfPeople = input.nextInt();

        int tallestPersonInCm = 0;

        for(int i = 0; i < numberOfPeople; i++) {
            System.out.println("How tall is the next person?");

            int currentHeight = input.nextInt();

            if(currentHeight > tallestPersonInCm) {
                tallestPersonInCm = currentHeight;
            }
        }

        System.out.println("The tallest person in your class is " + tallestPersonInCm + " cm tall!");
    }
}
```

Mostly for loops are used in combination with collections like an ArrayList. What an ArrayList is and how two iterate over it using a for loop will be discussed in a later chapter.

- `do/while`
- shortened `for` (foreach)

Material:
- [Slides](https://drive.google.com/open?id=1rXD7s4BHbhagSCYkUmzy8VBnzEBWFUSoOUEWA01ZLlU)
