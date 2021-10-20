---
title: "Exercise: Basic Programming concepts"
nav_order: 2
parent: 1 - First Steps with Java
---

# Exercise: Basic Programming Concepts

Given a problem, let's try to solve it using an **algorithm**.

## Problem

_Fadi_ and _Carys_ need the following information from each class at ReDI:

* the total number of students in class
* the number of students who already has some courses at ReDI
* the number of students who do their first course at ReDI
* the name of the student who comes farthest away to Berlin

## Our Algorithm

_Input_ : All students in class

_Output_ : number of students, number of students with previous ReDI class, number of students who are new to ReDI

_Algorithm_ :

Well, there are still _unprocessed_ students:
* get the next student
* increase count of total number of students
* if student is new to ReDI, increase count of new students else increase count of students with previous ReDI class
* calculate how far to Berlin the student came from by using a distance calculator ([https://www.distancecalculator.net/])
* if first student
  * save name and distance as coming from farthest away
* else
  * compare distance of student with distance saved so far
  * if greater, save name and distance

Let's enact it!

## Questions

* What in our algorithm would you consider as programming concept ?
* How would you change this algorithm if
  * instead of the number of new/existing students, you want the percentage?
  * you do not want the name of the student from farthest away but his/her city?
  * you want the name of the student from nearest away?
* Is this the only way to solve our problem? Could you imagine why you might want to change it? 

## Insights

### Programming concepts
Following concepts can be found:

**Sequential execution** , i.e. our program runs one step after the other from top to bottom.

**Variables**, i.e. something that can store a value. We can retrieve this value and update it. Variables can be part of our output (and input) but we might also have some helper variables we only use inside our program (e.g. here the farthest distance)

**Conditional execution**, i.e. our program should run only one of two (or more) possible program sequences depending on if a condition is met or not (here e.g. we increase either the new student count or the existing student count depending on if they are new to ReDI)

**Loops**, i.e. we repeat the same program sequence again and again - until we reach some stop condition (here: we asked all students)

### How to change algorithm

#### How would you change this algorithm if instead of the number of new/existing students you want the percentage?

We change our program to only count total number of students and the number of new students.

When the loop ends, we then return the new student percentage as _100 * number of new students / total number of students_

As existing student percentage, we can just return _100 - new student percentage_

#### How would you change this algorithm if you do not want the name of the student from farthest away but his/her city?

Easy: instead of the name we just store student's home city and return that as output

#### How would you change this algorithm if you want the name of the student from nearest away?

We just need to change the condition we defined in last step: we check if it is less, not greater

### Other solutions?

Most programming tasks have more than one solution.

Which solution you want to use depends also on the context.

Examples:

We used the website to calculate the distance to Berlin for each student. Now imagine that we do not have a computer in the classroom but we would need to go somewhere else to use a computer. In that case, you would not like to go for each student - instead you would collect all cities the students came from and then just go at once to the computer to ask the distances for all cities. (!!sorry, I do not quite catch it here!!)

We might want to split the work: let one just count all students, one determine the number of new and existing students and one find the student from farthest away. All three can work at the same time (we report then the results when everybody is done)

