---
title: Scanner
nav_order: 1
parent: 4 - Input + Decision
---

# Scanner

The following exercises shall introduce you to `Scanner` which is used to get input from the user.

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

Please first read through this piece of code: What do you expect to happen if the user types "Mario" on
the keyboard after they are asked for their name? Note the output you expect to be printed to the console.

## Exercise 2

What do you think is returned from the `Scanner` named `input` if you use it this way?

```java
input.nextInt();
```

instead of:

```java
input.nextLine(); 
```

Ask the user their name, surname, age and weight (in kilos, with a precision of 100g). Print the result.

```java
import java.util.Scanner;

public class ScannerExperiments {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        // Ask name, surname, age and weight. Print the result.
    }
}
```

## Exercise 3

A customer enters in a shop to buys some good. Let's say milk boxes.
We simulate a simple cash register. The user is the cashier and uses
our cash register to calculate the total price and the rest for the customer.

Our cash register asks the cashier:

- How many boxes the customer has bought.
- The price for each box.
- The amount of cash the customer gives to the cashier.

The cash register prints the total and the rest.

```java
import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        // Ask number of boxes
        // Ask price per box
        // Ask the amount the customer gives
        // Calculate total and rest.
        // Print total and rest.
    }
}
```
