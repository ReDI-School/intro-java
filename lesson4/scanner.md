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

A customer enters a shop to buy some goods. Let's say milk boxes.
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
## Scanner Quirks

The way the **Scanner** class behaves in some cases can be confusing (especially when you first start programming).

Consider the following program:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first:");
    String b = sc.next();
    System.out.println("Enter second:");
    String c = sc.next();
    System.out.println("Enter third:");
    String d = sc.nextLine();

    System.out.println("------------");
    System.out.println(b);
    System.out.println("------------");
    System.out.println(c);
    System.out.println("------------");
    System.out.println(d);
  }
}
```

Now try to run it and
* enter an _a_ as first
* enter an _b_ as second

The result, many will be surprised, is that the program will not ask the user for a third value to enter but instead print the following

```bash
Enter first:
a
Enter second:
b
Enter third:
------------
a
------------
b
------------
```

Now try another time to run the program and enter _hello world_ on first input.  
This time the program will ask for no further input and just print

```bash
Enter first:
hello world
Enter second:
Enter third:
------------
hello
------------
world
------------
```

Let's try to find out why this happens using the last example.  
In order to do this, we need to understand how **Scanner** actually works internally.

When we create a new Scanner with _Scanner sc = new Scanner(System.in)_ our _sc_ looks internally roughly like this:

```bash
Scanner {
    keyboard -> System.in
    state -> []
}
```

So it has a reference to read the input from your keyboard (by using System.in) and an empty state (we will see later what happens).

Now our program executes the first _sc.next()_.  
As the state of _sc_ is empty, the keyboard is asked for input (i.e. we use the passed _System.in_).  
This is the point where our Java program stops and waits for the user to enter values.  
We enter now _hello world_ and press the _Enter_ key (this is needed to actually finish our input and signal our program to continue!)

Now our _sc_ looks internally like this (note: our first _sc.next()_ call has not yet finished!):

```bash
Scanner {
    keyboard -> System.in
    state -> [hello world\n]
}
```

Note the _\n_ => this is our pressing the _Enter_ key which is also recorded and saved in the scanner state (this is also sometimes called _newline_ or _carriage return_).  
So, our first _sc.next()_ has read in from our keyboard some input into its internal state, but there is something it still needs to do: it has to return in our program a _String_ (i.e. we are still in line 4 of our main method and waiting for the assignment of a _String_ to our variable _b_).

So the _Scanner_ will look at it internal state. As we have called _next()_, it knows it should return one word as _String_. So it looks at the beginning at its state and returns the first word it encounters - the word _hello_. Afterwards, the internal state has changed to look like this:

```bash
Scanner {
    keyboard -> System.in
    state -> [ world\n]
}
```

We can see that _next()_ took all from the beginning of its internal state until it encountered the first whitespace!

Now our program encounters the second call _String c = sc.next()_.  
This time the internal state is not empty => thus it does not need to ask the keyboard for user input!  
Instead it tries to read the next word from the internal state.  
As the first character in the internal state is a whitespace, it skips it (basically, it goes to the next word beginning). Then it takes the next full word, i.e. it returns _world_. Afterwards, the internal state has changed to look like this:

```bash
Scanner {
    keyboard -> System.in
    state -> [\n]
}
```

Now our program encounters the third call _String d = sc.nextLine()_.  
Again the internal state is not empty => so it does not need to ask the keyboard for user input.  
But _nextLine()_ behaves differently than _next()_: it takes everything from the beginning of the internal state until the first _\n_ !  
As there is in our internal state nothing before that, it returns an empty string and leaves the state now like this:

```bash
Scanner {
    keyboard -> System.in
    state -> []
}
```

Given that, the following things are important to remember when working with **Scanner**:
* it will only ask for input from the user if its internal state is empty
* the _next_ method just returns the next word from the internal state (i.e. it searches from the beginning of the state for the first character starting a word, i.e. a non-whitespace until the end of a word i.e. the next whitespace). 
* all the other _next_ methods that do return another type (like _nextInt()_ , _nextDouble()_) operate in the same way as _next()_ => they just additionally try to convert the found word to the needed type
* the _nextLine()_ method behaves differently: it returns all from the start of the internal state until it encounters the first _\n_
