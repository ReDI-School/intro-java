---
title: "Exercises: if + loops"
nav_order: 1
parent: 5 - Loops
---

# Exercises: if and loops

## Exercise 1: Multiplication Table

1. Read a one number with Scanner
2. Print the multiplication table of the number from 1 till 10, e.g:

```text
Input: 2
Output:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

## Exercise 2: Dividable numbers

1. Read two numbers with Scanner
2. Print each number from 1 to the first entered number that is dividable without remainder by the second number (e.g. 6 is dividable by 3 without remainder as 6 / 3 is 2 with remainder 0, but 6 is not dividable by 4 without remainder as 6 / 4 is 1 with remainder 2)

Example:
```text
First: 16
Second: 5
Output:
5 is dividable by 5
10 is dividable by 5
15 is dividable by 5
```

## Exercise 3: Bank Account

1. Your program should start with a variable holding current money on user's bank account (start with e.g. 100)
2. User should now enter an amount
3. and he should enter if he wants to deposit to his account or if he wants to withdraw (e.g. 1 for deposit, 2 for withdrawal)
4. Variable holding money on account should be updated accordingly and current money should be printed.
5. Program should run and let user interact until the money on his account is zero or less.

Example:
```text
Current money on account: 100
Enter amount:
30
Enter 1 for deposit, 2 for withdrawal
2
Current money on account: 70
Enter amount:
60
Enter 1 for deposit, 2 for withdrawal
2
Current money on account: 10
Enter amount:
20
Enter 1 for deposit, 2 for withdrawal
1
Current money on account: 30
Enter amount:
30
Enter 1 for deposit, 2 for withdrawal
2
You have no money left, program stopped ...
```

## Exercise 4: FizzBuzz

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

## Exercise 5: Stars

### Lines and rectangles

Write a program that, given a number as input, prints a line with that many stars.

```text
input: 4
output: * * * *
```

Change your program so that it accepts two numbers and prints a rectangle of stars.

```text
input: 4
input: 3
output:
* * * *
* * * *
* * * *
```

### Triangle

Write a program that, given a number as input, prints a triangle with that many stars.

```text
input: 4
output:
*
* *
* * *
* * * *
```

and after this, invert the triangle:

```text
input: 4
output:
* * * *
* * *
* *
*
```

### Border

Write a program that, given two numbers as input, prints the border of a rectangle.

```text
input: 4
input: 5
output:
* * * *
*     *
*     *
*     *
* * * *
```