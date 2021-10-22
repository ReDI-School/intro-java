---
title: "Exercise 2: Your first code changes in a Java Program"
nav_order: 4
parent: 1 - First Steps with Java
---

# Exercise 2: Your first code changes in a Java Program
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
We have run this program:

```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```

We have seen that it prints
```bash
Hello world!
```
as a result to the console.

Let's try to change our program to print other things.

## Questions
Try to do the code changes together within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
How would you change the program to print out a _Hello_ message to all your group members?

So in the end, it should print
```bash
Hello A, B, C!
```
where _A_,_B_,_C_ would be the names of the group members!

Note: if you change the program you might break it (so that it won't run).

If that happens,
can you find out what change broke your program (please share that later in class)?

### Question 2
How would you change the program to print out for each of your group members a _Hello_ message?

So in the end, it should print
```bash
Hello A!
Hello B!
Hello C!
```
where _A_,_B_,_C_ would be the names of the group members!

Note: if you change the program you might break it (so that it won't run).

If that happens,
can you find out what change broke your program (please share that later in class)?

### Question 3
Having achieved this, can you tell what the line
```java
System.out.println(...);
```
does?

Can you make a guess what each part of this expression means?

### Question 4
What can you observe if you
* remove the double quotes (*"*) either one or both
* remove the semicolon (*;*)
in the program and run it?

Can you explain what happened?

### Question 5
What can you observe if you take the line
```java
System.out.println("Hello World!");
```
and place it somewhere else in the Java file and try to run it?

What can you conclude from this?

### Question 6
What can you observe if you just type some random text inside
```java
public static void main(String[] args) {
    ...
}
```
?

Can you think about a reason why you would like to be able to write some "random" text inside of your Java program?

## Observations
Given our program

```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```

Firstly, if we delete the *double quotes* around _Hello world!_ or delete the semicolon at the end of line 3, our program will not compile anymore.
Instead we see in the console the following message (here for the removed semicolon):
```bash
> javac -classpath .:/run_dir/junit-4.12.jar -d . Main.java
Main.java:3: error: ';' expected
    System.out.println("Hello world!")
                                     ^
1 error
compiler exit status 1
```

Secondly, we change our program by copying the print statement and place it outside the block of the _main_ method:

```java 
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }

  System.out.println("Hello world");
}
System.out.println("Hello world");
```

our code fails again to compile but this time our error message becomes a little bit more cryptic:
```bash
> javac -classpath .:/run_dir/junit-4.12.jar -d . Main.java
Main.java:6: error: <identifier> expected
  System.out.println("Hello world");
                    ^
Main.java:6: error: illegal start of type
  System.out.println("Hello world");
                     ^
Main.java:8: error: class, interface, or enum expected
System.out.println("Hello world");
^
3 errors
compiler exit status 1
```

Thirdly, if we try and add some random text into our Java code like this:

```java
class Main {

  some random text

  public static void main(String[] args) {

    another random text
    System.out.println("Hello world");
  } 
}
```

our code fails again to compile (and the error message is again a kind of cryptic)

## Insights
In this exercise, we have seen
* how to print text to the console
* different ways how our program can break due to a compile error
* some rules we need to follow in writing a correct Java program
* how to write comments in Java

### How to print text in Java to the console
As we have done in the exercises, we must use the print statement:

```java
System.out.println("Hello A! Hello B!");
```

If we want our text to be printed in multiple lines, we can use multiple print statements:

```java
System.out.println("Hello A!");
System.out.println("Hello B!");
```

### What is a compile error?
A compile error means that the Java compiler checked our program and found syntax errors, e.g.
* a typo in a keyword
* a missing character like a _double quote_, _bracket_ or a _semicolon_
* a statement or a method wrongly placed 

The compiler will print a message to the console which may help us to resolve the error.

Coming back to our example

```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!")
  }
}
```

```bash
> javac -classpath .:/run_dir/junit-4.12.jar -d . Main.java
Main.java:3: error: ';' expected
    System.out.println("Hello world!")
                                     ^
1 error
compiler exit status 1
```

we see that it tells us that it found an error in our file _Main.java_ at line 3.
It actually tells us the correct error: we missed a semicolon.

The other error messages we observed were a little bit harder to understand. 
However this is often the case if the *structure* of our program is wrong which often is caused by
* a missing _curly bracket_ (i.e. one of our blocks is not correctly opened or closed)
* a statement or a method is wrongly placed

### A handful of rules to write a correct Java program

**1. Place all your program statements inside of a method !**

(so far we only have seen the print statement but soon we will learn more)

(for now, just use the _main_ method => but later in the course we will make use of additional methods)

This means that the following example is **wrong**:

```java
class Main {
  public static void main(String[] args) {
    
  }
  System.out.println("Hello world!")
}
```

and this is also **wrong**:
```java
class Main {
  public static void main(String[] args) {
    
  }
}
System.out.println("Hello world!")
```

**2. Place all your methods directly inside of a class!**

(this will become important again later in course when we dive deeper into methods)

This means that the following example is **wrong**:
```java
class Main {
  
}
public static void main(String[] args) {
    System.out.println("Hello world!"); 
}
```

this is also **wrong** (as we placed our _main2_ inside the method _main_ instead of directly inside the class):
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); 

    public static void main2(String[] args) {
      System.out.println("Hello world2"); 
    } 
  } 
}
```

**3. Make sure that every statement ends with a semicolon**

**4. Make sure that for each opening bracket you have a corresponding closing bracket**

### Writing comments in Java

As we have seen, we cannot just write random text in a Java program (as we are required to write correct Java code which is enforced by the Java compiler).

However, there is a case where we actually need to do so: 

if we want to document our code (i.e. write an explanation about, of what it does or how it should be used) directly in our source code file.

Java allows us to use **comments** for this (which is just a way to mark one or multiple lines in your source code file to be ignored)

See the following example which shows how to use comments:

```java
class Main {

  // this is a one line comment, everything in this line will be ignored

  public static void main(String[] args) {
    /* this is a comment,
       that spans multiple lines, everything between the two * is ignored

       Note: this means that even if we write valid Java code 
       inside a comment, that will also be ignored:

       System.out.println("This will not be printed!")
    */
    System.out.println("Hello world!"); 
  } 
}
```
