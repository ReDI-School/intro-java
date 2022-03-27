---
title: "Exercises: if + loops"
nav_order: 1
parent: 5 - Loops
---

# Exercises: if and loops

## Exercise 1: Multiplication Table

1. Read in one number with the `Scanner` class.
2. Print the multiplication table of that number from 1 to 10, e.g.:

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

## Exercise 2: Divisible numbers

1. Read in two numbers with the `Scanner` class.
2. Calculate if each number in an inclusive range (including the last number) of 1..`<FIRST_NUMBER>` (the dividend) is divisible—without remainder—by the second number (the divisor).

If our first input were 6 and second 3, only two results would pass the acceptance criteria and be printed:

        - 1 / 3 = 0 R 1 FAIL
        - 2 / 3 = 0 R 2 FAIL
        - 3 / 3 = 1 R 0 PASS
        - 4 / 3 = 1 R 1 FAIL
        - 5 / 3 = 1 R 2 FAIL
        - 6 / 3 = 2 R 0 PASS

Example:
```text
First: 6
Second: 3

Output:

3 is divisible by 3
6 is divisible by 6

```

## Exercise 3: Bank Account

```text
AS a user I want to be able to deposit and withdraw from my bank account.

Example: New User
    GIVEN I am a new user, my balance should start at 100.0
    WHEN the program is initially run, "Current balance is: 100.0" is printed
    THEN "Enter 1 for withdraw or 2 for deposit" is printed

Example: Withdraw money (Happy day)
    GIVEN I am shown "Enter 1 for withdraw or 2 for deposit"
    WHEN I enter 1
    THEN I am asked "What is the amount you wish to withdraw?"
    WHEN I submit the amount
    THEN the amount is subtracted from my balance
    WHEN the result of this calculation is >= 0
    THEN "<AMOUNT> was withdrawn successfully, current balance is <CURRENT_BALANCE>" is printed

Example: Withdraw money (Sad day)
    GIVEN I am shown "Enter 1 for withdraw or 2 for deposit"
    WHEN I enter 1
    THEN I am asked "What is the amount you wish to withdraw?"
    WHEN I submit the amount
    THEN the amount is subtracted from my balance
    WHEN subtracting the amount from my balance is less than zero
    THEN "<AMOUNT> was withdrawn successfully, current balance is <CURRENT_BALANCE>" is printed
    THEN "You are now in your overdraft, program stopped!"

Example: Deposit money (Happy day)
    GIVEN I am shown "Enter 1 for withdraw and 2 for deposit"
    WHEN I enter 2
    THEN I am asked "What is the amount you wish to deposit?"
    WHEN I submit the amount
    THEN the amount is added to my balance
    THEN "<AMOUNT> was deposited successfully, current balance is <CURRENT_BALANCE>" is printed
```


Example:
```text

Current balance is: 100

Enter 1 for withdraw and 2 for deposit
1
What is the amount you wish to withdraw?:
60
60 was withdrawn successfully, current balance is 40

Enter 1 for withdraw and 2 for deposit
2
What is the amount you wish to deposit?
30
30 was deposited successfully, current balance is 70

Enter 1 for withdraw and 2 for deposit
1
What is the amount you wish to withdraw?:
80
Withdrawing 80 exceeds current balance of 70
```

## Exercise 4: FizzBuzz

Write a program that prints the numbers in the range 1..100. 

- For multiples of three print “Fizz”.
- For multiples of five print “Buzz”. 
- For mulitples of both three and five print “FizzBuzz”.

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