---
title: 4 - Decision Statements
nav_order: 4
has_children: true
---

# Input and control flow

The main purpose of a program is reading some input, processing this input and returning the results of the processed steps.

Until now we mainly focused on the output (printing some text to the screen). E.g.:

```java
    System.out.println("Hello world!");
```

## Input

In the next steps we will focus on the input and processing parts.

To make our programs more interactive we will now learn how to read some keyboard input from the user.

How to read input from the user is presented in chapter "Scanner".

## Decision Statements

Depending on the users' input the program can behave differently. This is a major point in programming. This input dependent behaviour is called control flow.

In the following sections we will mainly present the options which we can use to implement control flow / behaviour of our program.

This session focusses on decision statements! Decision statements are tightly connected to boolean expressions (see 3 - Operators -> Exercise 2: Operators on boolean types). This means that we can tell our program that some code shall or shall not be executed if a boolean expression is true.

E.g.:

if shoppingCart is Empty print "There are no items in your shopping cart!"
->

```java
boolean shoppingCartIsEmpty = true;

if(shoppingCartIsEmpty)
{
    System.out.println("There are no items in your shopping cart!");
}
```


Material:
- [Slides](https://drive.google.com/open?id=1lrUGGIwYULLqz-VFGDIhW06NajFyYJdFdp0_gfXCI64)
