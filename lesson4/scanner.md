---
title: "Scanner"
nav_order: 1
parent: 4 - Decision Statements
---

# Scanner

The following exercises shall introduce you to the scanner which is used to get input from the user.

Please do the following exercises. Feel free to discuss your solutions with your neighbours.

Write the things you found out down to share them later with the class.

## Exercise 1

```java
import java.util.Scanner;

public class ScannerExperiments {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("It's me, " + name + "!");
    }
}

```

Please first read through this piece of code: What do you expect will happen if the user types "Mario" into the keyboard after he is asked for his name?
Note the output you expect to be printed to the console.

## Exercise 2
In the piece of code from "Exercise 1" you will find some lines where you will not completely understand what they do.

Note these lines. Can you imagine what these lines do? Maybe you already understand parts of it!
Note your ideas!

## Exercise 3
What do you think will be returned from the scanner if you use

```java
input.nextInt();
```

instead of

```java
input.nextLine(); 
```

## Exercise 4
Can you program a line of code to get an integer of the user and store it in a variable?

## Exercise 5
Can you imagine how to get a double value from a user?

## Exercise 6
Change the program from Exercise 1. To ask the user for his age. Print his age afterwards to the console!

