---
title: "Exercise 3: More on Assignments"
nav_order: 3
parent: 2 - Data Types
---

# Exercise 3: More on Assignments
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
Goal of this exercise is to get a basic understanding of
* how assignments to variables work
* other notations fo assignments

## Questions
Try to find the answers within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Given the following code:

```java
class Main {
  public static void main(String[] args) {
      int i = 4;
      int j = 2;

      i = j + 1;
      i = i * 2;
      j = (j * j) + i;

      System.out.println(i);
      System.out.println(j);
  }
}
``` 

can you guess what it will print?

Run the program and check the results.

Is it what you expected?

### Question 2
Given the following code:

```java
class Main {
  public static void main(String[] args) {
      int i = 4;

      i += 5;

      System.out.println(i);
  }
}
``` 

what does the program print?

What can you write instead of `i += 5` that will get the same result?

Can you guess how you can do something similar for all mathematical operations (subtraction, multiplication, division)

### Question 3
Given the following code:

```java
class Main {
  public static void main(String[] args) {
      int i = 4;

      i++;

      System.out.println(i);
  }
}
``` 

what does the program print?

What can you write instead of `i++` that will get the same result?

Can you do something similar for all mathematical operations (subtraction, multiplication, division)