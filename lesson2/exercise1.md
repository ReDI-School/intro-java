---
title: "Exercise 1: Strings & Numbers"
nav_order: 1
parent: 2 - Data Types
---

# Exercise 1: Strings & Numbers
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
Goal of this exercise is to get a basic understanding of
* how to work with Strings in Java to represent arbitrary text
* how to work with numbers in Java
* what is a variable

## Questions
Try to find the answers within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Given the following code:

```java
class Main {
    public static void main(String[] args) {
        String test = "Hello World!";
        System.out.println(test);
    }
}
```

what do you think the code does?
What does the first line in the `main` method mean?

### Question 2
Given the following code:

```java
class Main {
    public static void main(String[] args) {
        String test;
        test = "Hello World!";
        System.out.println(test);
    }
}
``` 

will it do the same as in question 2?

Can you assign a new String to `test` after the print statement?
if you print `test` than again, what would be the output?

### Question 3
Java cannot only deal with text but also work with numbers.

The following code snippet shows you the most common types for numbers in Java:
```java
class Main {
    public static void main(String[] args) {
        int i = ?
        long l = ?
        float f = ?
        double d = ?
    }
}
``` 
do you have an idea, with what you can/need to replace each question mark?
And can you print these numbers?

### Question 4
Which of these statements are invalid and why?

```java
class Main {
    public static void main(String[] args) {
        int i = "3";
        String f = 4;
        int j = 5;
        f = j;
        String g = j;
        j = "4";
    }
}
``` 