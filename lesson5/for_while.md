---
title: "Exercises: for vs while"
nav_order: 5
parent: 5 - Loops
---

# Exercises: `for` vs. `while`

When to use `for`? When to use `while`? These exercises help to clarify this topic.
Although a task can be accomplished by using any of the two statements, often there's a statement
that is better fit for the task than the other. It's important to recognize when to use one and when the other.

The general rule is:

* Use `for` when the number of iterations _is_ know
* Use `while` when the number of iterations _is not_ known

_Known_ should be intended with the meaning _the number is known when the program runs, before it reaches the loop_,
not with the meaning _known by the developer when the program is written_.
  
We hope the following exercises clarify this.

*Note:* these exercises don't cover _for each_, that is a different statement
we will see and use after we introduce collections, like [ArrayLists](/lesson8/index.md).

*Note:* each exercise can be solved by using both `for` and `while`, but only one should be preferred.
 
## Exercise 1: calculate the sum of 10 numbers

Ask the user for a fixed amount of numbers. The amount is fixed by the text of the exercise: it is 10.
When the user finishes typing the 10 numbers, calculate and print the sum.

```text
Please enter number 1: 48
Please enter number 2: 29
Please enter number 3: 3 
Please enter number 4: -13
Please enter number 5: 58
Please enter number 6: -84 
Please enter number 7: 31
Please enter number 8: 0
Please enter number 9: 14
Please enter number 10: -9
The sum of the numbers is: 77
```

Would you use `for` or `while` for this task? Why?

## Exercise 2: calculate the sum of N numbers

Ask the user for a fixed amount of numbers. The amount is fixed but decided by the user, before they
start typing the numbers. We ask the user for the amount of numbers they plan to type and call it _N_.
When the user finishes typing the N numbers, calculate and print sum.

```text
How many numbers? 6
Please enter number 1: 93
Please enter number 2: -3
Please enter number 3: 84
Please enter number 4: 0
Please enter number 5: 35
Please enter number 6: -12
The sum of the numbers is: 197
```

Would you use `for` or `while` for this task? Why?

## Exercise 3: calculate the sum of some numbers

Ask the user for some numbers. The amount is not known in advance: the user decides when to stop by entering zero.
When the user finishes typing the numbers, calculate and print sum.

```text
Please enter a number: 34
Please enter a number: 48
Please enter a number: 1
Please enter a number: 93
Please enter a number: -34
Please enter a number: -7
Please enter a number: 0
The sum of the numbers is: 135
```

Would you use `for` or `while` for this task? Why?