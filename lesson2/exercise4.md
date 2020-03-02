---
title: "Exercise 4: Numbers & Compatibility"
nav_order: 4
parent: 2 - Data Types
---

# Exercise 4: Numbers & Compatibility
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
In Java, we have several number types that allow to express different kind of numbers (numbers of different sizes and precisions).
In this exercise, we'll see how these types are compatible with each other.

## Questions
Try to find the answers within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Given the following program:

```java
class Main {
  public static void main(String[] args) {
      int i = 2000000000;
      System.out.println(i);

      //int i2 = 4000000000;
      //int i2 = i * 2;

      System.out.println(i2);
  }
}
``` 

we have two possible definitions of the variable `i2`.

Try to run the program twice, each time with one definition used.

Can you explain what happens?

### Question 2
Given the following program:

```java
class Main {
  public static void main(String[] args) {
      int i = 2000000000;
      System.out.println(i);

      long l1 = 4000000000;
      long l2 = i * 2;

      System.out.println(l1);
      System.out.println(l2);
  }
}
```

What do you think the program will print?

Run the program and validate your assumptions.

Now run the following program

```java
class Main {
  public static void main(String[] args) {
      int i = 2000000000;
      System.out.println(i);

      long l1 = i;
      long l2 = l1 * 2;

      System.out.println(l2);
  }
}
```

and compare what with result of the first one.

What can you conclude (hint: think about how assignments work)?

### Question 3
Given the following program

```java
class Main {
  public static void main(String[] args) {
      int j = 1;
      long l4 = j;
      System.out.println(j);
      System.out.println(l4);

      int i4 = l4;
      System.out.println(i4);
  }
}
```

What happens if you run the program?

Can you explain the outcome?

### Question 4
Given the same program from Question 3 but with a small change

```java
class Main {
  public static void main(String[] args) {
      int j = 1;
      long l4 = j;
      System.out.println(j);
      System.out.println(l4);

      int i4 = (int)l4;
      System.out.println(i4);
  }
}
```

What happens if you run the program?

Can you guess what the small change compared to the previous program does?




