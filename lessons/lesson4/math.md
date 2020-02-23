---
title: "Exercises: Math"
nav_order: 1
parent: 4 - Decision Statements
grand_parent: Lessons
---

# Exercises: Math

## Decimal to binary

Write a method that prints a given decimal number in binary form.

```text
input: 42
output: 101010
```

Decimal to binary conversion:
- Calculate `decimal_number / 2` and save the remainder for later
    - The remainder is calculated with `%` (modulo)
- The result is your new decimal_number
- Redo until `decimal_number == 0`
- The reverse of all remainders is the binary number

Example:

```text
decimal_number = 42

42 % 2 = 0
21 % 2 = 1
10 % 2 = 0
 5 % 2 = 1
 2 % 2 = 0
 1 % 2 = 1
 0

binary_number = 101010
```

## Calculator

Write a program that emulates a calculator.

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

### Fibonacci *DIFFICULT / EXTRA*

Write a method that, given an input n, calculates the first n numbers of the fibonacci sequence.

The fibonacci sequence is defines as:

```text
fib(1) = 1
fib(2) = 1
fib(n) = f(n-1) + f(n-2)
```

Or in human language:
- The first and second fibonacci numbers are defined as `1`.
- The Nth fibonacci number is the sum of the previous and the number before the previous one.

Example:

```text
Fibonacci numbers: 1,1,2,3,5,8,13,21,34,...
To calculate the 5th fibonacci number we need the 3rd and 4th number.
To calculate the 4th fibonacci number we need the 3rd and 2nd number.
To calculate the 3rd fibonacci number we need the 2nd and 1st number.

The 1st number is 1 and 2nd number is 1. Therefore the 3rd number is 1+1=2
The 2nd number is 1 and 3rd number is 2. Therefore the 4th number is 1+2=3
The 3rd number is 2 and 4th number is 3. Therefore the 5th number is 2+3=5
```

You can solve this iterative (with a for loop) or recursive (without loops).
A nice tutorial about recursion: https://www.geeksforgeeks.org/recursion
