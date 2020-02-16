---
title: School
parent: Libraries
nav_order: 1
---

# The "School" class library

This library models a simple school of:

- [teachers](Teacher.java)
- [students](Student.java)
- [persons](Person.java) (both teachers and students are persons, not necessarily a person is a teacher or student)
- [homework](Homework.java)

Create a package named `org.redischool.introjava` via the `File->New` menu of IntelliJ IDEA
and save the 4 classes of this library in this package. This corresponds to the directory
`org/redischool/introjava` on your computer. To download the files, click on their names, then right-click on
the "Raw" button in GitHub and select "Save Link As..." or similar.

In your main class, that should be located outside of the package just created, import the classes:

```java
import org.redischool.introjava.Teacher;
import org.redischool.introjava.Student;
import org.redischool.introjava.Homework;
import org.redischool.introjava.Person;
```

Create teachers and students giving them a name and surname:

```java
Teacher teacher = new Teacher("Mark", "M.");
Student s1 = new Student("Jenny", "J.");
Student s2 = new Student("Robert", "R.");
```

Teachers and students are polite and great each other:

```java
s1.greet(teacher);
s2.greet(teacher);
teacher.greet(s1);
teacher.greet(s2);
```

Create homework, or ask a teacher to invent one:

```java
Homework h1 = teacher.inventNewHomework();
Homework h2 = new Homework("Exercise with methods and properties");
```

Teachers assign homework to students:

```java
teacher.assignHomework(h1, s1);
teacher.assignHomework(h1, s2);
teacher.assignHomework(h2, s2);
```

And students do their homework:

```java
s1.doHomework();
s2.doHomework();
```

Objects prints messages when you operate with them, producing a dialog that resembles one in the real life.

```text
Jenny J.: Good morning Mark
Robert R.: Good morning Mark
Mark M.: Good morning Jenny
Mark M.: Good morning Robert
Mark M.: What about 'Sort an array of integers'?
Mark M.: Jenny, please do the homework 'Sort an array of integers'
Mark M.: Robert, please do the homework 'Sort an array of integers'
Mark M.: Robert, please forget your previous homework, do 'Exercise with methods and properties' instead
Jenny J.: doing my homework 'Sort an array of integers' ...
Jenny J.: ... done!
Robert R.: doing my homework 'Exercise with methods and properties' ...
Robert R.: ... done!
```
