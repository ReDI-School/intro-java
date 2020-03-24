---
title: "Exercises: Calculator"
nav_order: 5
parent: 4 - Input + Decision
---

# Exercises: Calculator

Write a program that emulates a calculator. It's a more complete exercise to what was presented [previously](exercises_decision.md).

It should support:
- ```+``` (addition)
- ```-``` (subtraction)
- ```*``` (multiplication)
- ```/``` (division)

It accepts the operands and the operation on multiple lines.

```text
Input:
3
*
2
Output: 3 * 2 = 6
```

Hint:

```java
// String comparison works like this:
Scanner scanner = new Scanner(System.in);
String a = scanner.next();

if (a.equals("hello")) {
    System.out.println("Are equal");
}

if ("hello".equals(a)) {
    System.out.println("Are equal");
}
```

More features:
1. Add looping to the calculator. Instead of exiting after the calculation it should ask the user if they want
   to continue or quit. If the user enters `quit` the program stops.
2. Handle division by zero. As you might have noticed an input of `2/0` crashes the program. Handle that case.
3. *DIFFICULT / EXTRA* Give the user the possibility to use the last result as one of the values in the next calculation.

```text
Input:
3
*
2
Output: 3 * 2 = 6
Input:
last
*
2
Output: 12
```

Hint:

```java
// How to convert a string to an integer
String a = "42";
int b = Integer.parseInt(a);
```