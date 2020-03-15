---
title: "Exercises: Math"
nav_order: 3
parent: 5 - Loops
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

## Fibonacci *DIFFICULT / EXTRA*

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
A nice tutorial about recursion is available [here](https://www.geeksforgeeks.org/recursion).
