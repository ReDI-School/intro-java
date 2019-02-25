# Exercises: reusing methods

## Single methods

Methods are reusable pieces of code.
The last set of exercise requires all the previous ones to be resolved and reused.

### User input

Write a method that asks the user for a number in a range (between two numbers), verifies
if the user answer is valid, so if it is between the two numbers defining the range,
and return its value. If the number is not valid, it should inform the user of the mistake
and ask again, until the user types a valid number.

*HINTS*

- Name the method `askNumberBetween`.
- It shall have two parameters, `min` and `max`, both of type `int` and return an `int`.
- You may need to use a `Scanner` inside to read from `System.in`.

### Prime numbers 

Define a method that checks if a number is a prime number.
Prime numbers are numbers divisible only by 1 and themselves.
For more information, please see https://en.wikipedia.org/wiki/Prime_number.

Testing if a number is prime is a very well known problem, with many solutions
proposed in history. Some solution are so advanced that require a Quantum Computer
to be implemented. This computer exists only in the most advanced research laboratories
in the world. But we don't need to this technology to solve the problem.
We'll implement a much simpler solution.

*HINTS*

- Name the method `isPrimeNumber`.
- It shall have one parameter, `n`, the number to be tested, and return a `boolean`.
- To check if `a` is divisible by `b`, you can check if the reminder of the division, `a % b`, is zero.
- We implement a simple test, following the definition of prime number:
  - Try to find a number between `2` and `n - 1` that is a divisor of `n`.
  - If this number is found, return `false`, meaning than `n` is not a prime number.
  - If this number is not found, return `true`, meaning that `n` is prime.

*EXTRA*

The test can be improved, without changing it dramatically. Try to find out how.

## Searching for prime numbers

Reusing the methods defined above, implement the following 3 programs:

### Finding a prime number manually

Ask the user for a number between 1 and 1.000.000.000. Check if the number
is prime or not. If it is, inform the user and terminate the program.
If it is not, ask the user to try again, until they find a prime number.

Do you need some large prime number to test this program?
Implement the next programs to find them!

### Printing prime numbers

Ask the user for two numbers, `a` and `b`.
`a` must be between 1 and 1.000.000.
`b` must be between `a` and 1.000.000.
Print all the prime numbers you find between `a` and `b`, inclusive.

### Collecting prime numbers

Ask the user for a number `n` between 1 and 250.000.
Print the first `n` prime numbers you can find, starting from `2`.