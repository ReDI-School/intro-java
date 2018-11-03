# The "School" class library

This library models a simple school of [teachers](Teacher.java), [students](Student.java), and [homework](Homework.java).

Create teachers and students giving them a name:

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