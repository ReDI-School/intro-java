---
title: "Exercise 2: Operators on Boolean Types"
nav_order: 2
parent: 3 - Operators
---

# Exercise 2: Operators on Boolean Types
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
Goal of this exercise is to get a basic understanding of
* how to work with booleans in Java

## Questions
Try to find the answers within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Let's meet the first operator we can use with one boolean:

this is the **`!`** operator (exclamation mark)

```java
class Main {
    public static void main(String[] args) {
        boolean b = ?;
        System.out.println(!b);
    }
}
``` 

Try to find out what the **!** operator does by assigning different values to `b`.

### Question 2
Let's meet another operator we can use with two booleans:

this is the **`||`** operator (two vertical bars)

```java
class Main {
    public static void main(String[] args) {
        boolean a = ?;
        boolean b = ?;
        System.out.println(a || b);
    }
}
``` 

Try to find out what the **`||`** operator does by assigning different values to `a` and `b`.

### Question 3
Let's meet another operator we can use with two booleans:

this is the **&&** operator (two ampersands)

```java
class Main {
    public static void main(String[] args) {
        boolean a = ?;
        boolean b = ?;
        System.out.println(a && b);
    }
}
``` 

Try to find out what the **`&&`** operator does by assigning different values to `a` and `b`.

### Question 4
Given the following program defining two variables

```java
class Main {
    public static void main(String[] args) {
        int a = 16;
        int b = 8;
        
    }
}
``` 

How would you
* implement a check (using boolean operators and number operators) that tells you if both _a_ and _b_ are greater than 10 (hint: implement and then rerun program with different values assigned to _a_ and _b_ to check that it is correct)
* implement a check (using boolean operators and number operators) that tells you if either _a_ or _b_ are smaller than 10 (hint: implement and then rerun program with different values assigned to _a_ and _b_ to check that it is correct)
* implement a check (using boolean operators and number operators) that tells you if _a_ is at least two times bigger than _b_ (hint: implement and then rerun program with different values assigned to _a_ and _b_ to check that it is correct), i.e. for _a = 16_ and _b = 8_ your check should return _true_ (as _a_ is two times _b_)