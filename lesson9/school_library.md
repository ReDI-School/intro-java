---
title: "Exercises: School Library"
nav_order: 3
parent: 9 - Using Classes
---

# Exercises: the School Library

The school library contains 4 classes that model persons, among which there are students and teachers,
and homework that teachers can assign to students and students can do.

Download and copy the classes in your workspace as described in the [README](../libraries/school/README.md)
file of the library.

## People greeting each other

Ask the user how many people to create, then ask for the name of these people.
For each person, create an instance of the class `Person`, giving it the name
the user decided.

Note that `Person` constructor requires a a `name` and a `surname`. Take the user
input, split it at the first space encountered (search online how) to separate
the name from the surname. Otherwise, use the first letter of the name followed
by a dot as surname. *HINT*: save this code to a method for later reuse.

For every new person created, this person should present him/herself using the `sayHi()` method.

In addition, the last person previously created should greet the new person using the
`greet(...)` method and the new person should greet all the persons created so far.
The first person should just present him/herself.

Example:

```text
How many people?
4
Marie Curie
Albert Einstein
Enrico Fermi
Stephen Hawking

Marie Curie: Hi, my name is Marie Curie
Albert Einstein: Hi, my name is Albert Einstein
Marie Curie: Good morning Albert
Albert Einstein: Good morning Marie
Enrico Fermi: Hi, my name is Enrico Fermi
Albert Einstein: Good morning Enrico
Enrico Fermi: Good morning Marie
Enrico Fermi: Good morning Albert
Stephen Hawking: Hi, my name is Stephen Hawking
Enrico Fermi: Good morning Stephen
Stephen Hawking: Good morning Marie
Stephen Hawking: Good morning Albert
Stephen Hawking: Good morning Enrico
```

## Teacher giving homework to students

Ask the user the name for a teacher, and use it to instantiate a `Teacher`.
The newly created teacher `sayHi()`.

Ask the user how many students to create, then ask for their names and use them to instantiate
objects of the class `Student`. After creating all the students, they all `sayHi()`,
in the order they're created.

For each student, ask the user for the text of an exercise. Create a `Homework` with this text
and tell the teacher to assign it the student. Repeat until every student has an exercise assigned.

When all the students have assigned homework, they do their homework, via the method `doHomework()`.

Example:

```text
Name of the teacher:
Max Mustermann

Max Mustermann: Hi, my name is Max Mustermann

How many students?
3
Lara L.
Jörg J.
Ines I.

Lara L.: Hi, my name is Lara L.
Jörg J.: Hi, my name is Jörg J.
Ines I.: Hi, my name is Ines I.

Homework for Lara?
Sort an array

Max Mustermann: Lara, please do the homework 'Sort an array'

Homework for Jörg?
Compare two strings

Max Mustermann: Jörg, please do the homework 'Compare two strings'

Homework for Ines?
Study object and classes

Max Mustermann: Ines, please do the homework 'Study object and classes'

Lara L.: doing my homework 'Sort an array' ...
Lara L.: ... done!
Jörg J.: doing my homework 'Compare two strings' ...
Jörg J.: ... done!
Ines I.: doing my homework 'Study object and classes' ...
Ines I.: ... done!
```
