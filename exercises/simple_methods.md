# Exercises: simple methods

Please define, for each exercise:
- parameters types and names, if any
- return value type, if any
- the implementation, the body of the method

Methods should do only one thing.

The `main` method is where you should ask users for values,
call the single methods of this exercise, and print results.

The methods should not have any hardcoded number or string.

## addNumbers

Write a method `public static int addNumbers(int max)` to add together all numbers from 1 to max.

E.g.:

`For max = 5 the method shall return 15, because 1 + 2 + 3 + 4 + 5 are equal to 15`

## areEqual

Write a method that, given four `int`, returns if they're all equal, so if they all have the same value.

Do the exercise again with `String`.

## greaterOfThree

Write a method that, given three `int`, returns the greater of the three.

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

## areaOfCircle

Write a method that calculates the area of a circle, given its radius.
Search on Google, if you need the formula.

Use the `double` type, not `int`, for both parameter and return value.

You'll need the constant π, the Greek Pi, that is approximately 3.14.
It's better to use the Java constant `Math.PI` instead of typing directly `3.14` in the code. 

## hypotenuse (Pythagoras' theorem)

Write a method that calculates the hypotenuse of a right triangle, given the length of its sides.
The hypotenuse is the side opposite the right angle.
For more information, see https://en.wikipedia.org/wiki/Pythagorean_theorem. 
Search on Google, if you need the formula.

Use the `double` type, not `int`, for both parameters and return value.

You'll need to calculate the square root of a number, use the method `Math.sqrt()` for that.
