---
title: "Exercise 1: Operators on Strings & Numbers"
nav_order: 1
parent: 3 - Operators
---

# Exercise 1: Operators on Strings & Numbers
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
Goal of this exercise is to get to know
* how to mathematical operations with numbers in Java
* how to concatenate Strings
* how to compare numbers

## Questions
Try to find the answers within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
If you have numbers, you should be able to also use them in mathematical operations.

Can you guess how to write a program that does
* addition
* subtraction
* multiplication
* division
* modulo (i.e. return the remainder value of a division, e.g. _7 % 2_ returns _1_)

of numbers?

How would you assign the result of these operations to a variable and print it?

### Question 2
Given the following snippet

```java
class Main {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
    }
}
``` 

how can you change the program to print out 
* AB
* BA
* ABBA

by only using these variables?

### Question 3
Given the following program

```java
class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        String k = "a";
        System.out.println(i + j + k);
        System.out.println(i + k + j);
        System.out.println(k + i + j);
    }
}
```

what will it print?

what can you conclude from this?

### Question 4
Let's try some more operations with numbers:

Given two numbers, try to compare them
* what kind of comparisons exist?
* can you find out how to do comparisons of two numbers in Java?
* can you assign the result of such a comparison to a variable?