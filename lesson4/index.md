---
title: 4 - Input + Decision
nav_order: 4
has_children: true
---

# Input and Decision Statements


Most real-world Java programs do not simply execute a series of fixed instructions but need to dynamically react to user input. So far, we have mainly focused on the output (printing some text to the screen).

Example:

```java
    System.out.println("Hello world!");
```

## Input

In this chapter we focus on the input and processing parts of a program. To make our programs more interactive we will first learn how to read keyboard input from the user, presented in section [Scanner](scanner.md).

## Decision Statements

Depending on the users' input the program can behave differently. This is a major concept in programming.
This input dependent behaviour is called control flow.

In the section [Decision Statements](decision.md) we learn how to write code that dynamically reacts to user input. This session focuses on decision statements, which are closely linked to boolean expressions
(see 3 - Operators -> Exercise 2: Operators on boolean types). For example, we can tell our program that parts of the code shall only be executed if a boolean expression is true.

Example: if the shopping cart is empty, print "There are no items in your shopping cart!"

```java
boolean shoppingCartIsEmpty = true;

if (shoppingCartIsEmpty) {
    System.out.println("There are no items in your shopping cart!");
}
```

Material:
- [Slides](https://drive.google.com/open?id=1lrUGGIwYULLqz-VFGDIhW06NajFyYJdFdp0_gfXCI64)
