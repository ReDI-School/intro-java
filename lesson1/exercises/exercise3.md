---
title: "Exercise 3: Starting point of a Java Program" 
parent: First Steps with Java
nav_order: 3
---
# Exercise 3: Starting point of a Java Program
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

## Objective
We are able to run a Java program and have a first understanding how a program is executed.

We are also able to do little code changes in a Java program to print to the console.

Let's look at some remaining questions:
* how does Java find the starting point of a program?
* so how do I, as a developer, write my Java program to define the right starting point (and without breaking my code)?
* where in an existing Java program can I find the starting point?

To be clear: starting point means where our program starts its execution

## Questions
Try to do the exercises together within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Open a *Java* repl in [repl.it](https://repl.it/).

Given your experiences from previous exercises, can you find some criteria that define the starting point of a Java program?

### Question 2
Let's experiment by changing our code.

Given this part of our code:
```java
public static void main(String[] args) {
    System.out.println("Hello world!");
}
```

Do each of the following changes and run your program (revert also back to the initial state after each step), observe what happens and think about what this means regarding what criteria a starting point of a Java program must fulfill:
* change the word _main_ to something else
* remove in same line each term before _main_ and also after
* copy the whole code given above, but change the *Hello world!* to something else and paste it in a second time (directly beneath the original, i.e. before the last *}*). Run your program. Now change the word _main_ (in the original) to something else again

### Question 3
Now we experiment with the whole code.

Given:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```
Do each of the following changes and run your program (revert also back to the initial state after each step), observe what happens and think about what this means regarding what criteria a starting point of a Java program must fulfill:
* change the word _Main_ to something else
* copy the whole code given above, but change the *Hello world!* to something else and paste it in a second time (directly beneath the original, i.e. in a new line after the last *}*) => you should have something like this:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world2!");
  }
}
``` 
  * Run your program. 
  * Now change the word _Main_ (in the original) to something else again and run it. 
  * Now change the word _main_ in the copy to something else again and run it.

## Observations
... will be filled later

## Insights
... will be filled later

