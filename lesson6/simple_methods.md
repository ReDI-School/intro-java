---
title: "Exercises: Simple Methods"
nav_order: 1
parent: 6 - Methods + Scope
---

# Exercises: Simple Methods

Please define, for each exercise:
- parameters types and names, if any
- return value type, if any
- the implementation, the body of the method

Methods should do only one thing.

The `main` method is where you should ask users for values,
call the single methods of this exercise, and print results.

The methods should not have any hardcoded number or string.

## addNumbers

Write a method `public static int addNumbers(int max)` to add together all numbers from 1 to `max`.
Please use a for loop to sum up all numbers.

E.g.:

`For max = 5 the method shall return 15, because 1 + 2 + 3 + 4 + 5 are equal to 15`

## multiplyNumbers

Write a method `public static int multiplyNumbers(int max)` which multiplies all numbers from 1 to `max`.
Please use a for loop to multiply all numbers.

E.g.:

`For max = 5 the method shall return 120, because 1 * 2 * 3 * 4 * 5 gives 120.`

## findClosestDivisbleNumber

Write a method `public static int findClosestDivisibleNumber(int number, int divisor)` which finds the number
which is divisible by another number and which is closest to another given number.

E.g.:

`Number given is 13. Given divisor is 5. Result shall be 10.`

## areEqual

Write a method that, given four `int`, returns if they're all equal, so if they all have the same value.

Do the exercise again with `String`.

## greatest

Write a method that, given three `int`, returns the greater of the three.
The method must work also in corner cases, like when all the numbers are
the same and when two numbers are the same.

*EXTRA*: extend the exercise to 4 or 5 numbers.

## powerOf

Write a method that calculates the power of a number.
The base should be of type `double`, the exponent should be of type `int`.

Examples:

- powerOf(4, 2) = 4 × 4 (two times)
- powerOf(3, 4) = 3 × 3 × 3 × 3 (four times)
- powerOf(7.123, 3) = 7.123 × 7.123 × 7.123 (three times)
- powerOf(-3.5, 2) = -3.5 × -3.5 (two times)
- powerOf(10, 1) = 10 (one time)
- powerOf(99, 0) = 1 (zero times)

*NOTE*: you may find that a method like this already exist.
It is called `Math.pow()`. Since this is exercise, please don't use it
and try to implement the exercise manually with a for loop.

## areaOfCircle

Write a method that calculates the area of a circle, given its radius.
Search on Google, if you need the formula.

Use the `double` type, not `int`, for both parameter and return value.

You'll need the constant π, the Greek Pi, that is approximately 3.14.
It's better to use the Java constant `Math.PI` instead of typing directly `3.14` in the code.

## circleCircumference

Having done the `areaOfCircle` method it should be fairly simple to write a method that calculates the circumference of a circle, given its radius.

## hypotenuse (Pythagoras' theorem)

Write a method that calculates the hypotenuse of a right triangle, given the length of its sides.
The hypotenuse is the side opposite the right angle.
For more information, see https://en.wikipedia.org/wiki/Pythagorean_theorem.
Search on Google, if you need the formula.

Use the `double` type, not `int`, for both parameters and return value.

You'll need to calculate the square root of a number, use the method `Math.sqrt()` for that.

## Number Pyramid

Write a method like `public static void printPyramid(int height)` that prints such pyramid pattern (s. below)
for `height` rows. Every row grows up from 1 to the row number and back to one. It will help to write a method
like `public static void printPyramidRow(int row, int maxHeight)`, which prints one row of the pyramid.

Example for `height` = 5:

```text
    1
   121
  12321
 1234321
123454321
```

*HINT*: print some spaces, then increasing numbers, then decreasing numbers.
