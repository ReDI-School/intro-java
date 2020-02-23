---
title: "Exercises: if + loops"
nav_order: 1
parent: 5 - Loops
grand_parent: Lessons
---

# Exercises: if and loops

## Stars

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

## Multiply

1. Read a number with Scanner, `multiplicand`.
2. Create a method `printMuliply` which prints multiplication based on 2 input arguments, eg. `printMultiply(2,8)`
   would print  `2 x 8 = 16` on the console.
3. Call the above method from a loop and print the times table of the multiplicand, multiples of it from 1 to 10.

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

4. *EXTRA*: create a new method `getMultiplyString` which returns the above line, like `2 x 8 = 16` without printing it,
  and change the main to use this method and have the same output as above.

## FizzBuzz

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
