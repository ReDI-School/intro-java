---
title: "Exercise 3: Starting point of a Java Program"
nav_order: 5
parent: 1 - First Steps with Java
---

# Exercise 3: Starting point of a Java Program
Please do this exercise in a group with other students.

Go through the questions and discuss the answers within your group.
Write them down/remember them to share later with the class.

1. TOC
{:toc}

## Objective
We are able to run a Java program and have a first understanding how a program is executed.

We are also able to do little code changes in a Java program to print to the console.

Let's look at some remaining questions:
* how does Java find the starting point of a program?
* so how do I, as a developer, write my Java program to define the right starting point (and without breaking my code)?
* where in an existing Java program can I find the starting point?

To be clear: starting point means where our program starts its execution

## Questions
Try to do the exercises together within your group (in case of questions/problems => ask one of your teachers!)

### Question 1
Open a *Java* project in [codeboard.io](https://codeboard.io/).

Given your experiences from previous exercises, can you find some criteria that define the starting point of a Java program?

### Question 2
Let's experiment by changing our code.

Given this part of our code:
```java
public static void main(String[] args) {
    System.out.println("Hello world!");
}
```

Do each of the following changes and run your program (revert also back to the initial state after each step), observe what happens and think about what this means regarding what criteria a starting point of a Java program must fulfill:
* change the word _main_ to something else
* remove in same line each term before _main_ and also after
* copy the whole code given above, but change the *Hello world!* to something else and paste it in a second time (directly beneath the original, i.e. before the last *}*). Run your program. Now change the word _main_ (in the original) to something else again

### Question 3
Now we experiment with the whole code.

Given:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```
Do each of the following changes and run your program (revert also back to the initial state after each step), observe what happens and think about what this means regarding what criteria a starting point of a Java program must fulfill:
* change the word _Main_ to something else
* copy the whole code given above, but change the *Hello world!* to something else and paste it in a second time (directly beneath the original, i.e. in a new line after the last *}*) => you should have something like this:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world2!");
  }
}
```
  * Run your program.
  * Now change the word _Main_ (in the original) to something else again and run it.
  * Now change the word _main_ in the copy to something else again and run it.


## Observations
Depending on what we change, we can observe three different outcomes:

1. Our program does not compile, i.e. it prints an error message to the console after running the *javac* command (e,g, when removing the _void_ before _main_ or having two classes with the name _Main_)
2. Our program does compile but an error is printed when we try to run it:
```bash
> javac -classpath .:/run_dir/junit-4.12.jar -d . Main.java
> java -classpath .:/run_dir/junit-4.12.jar Main
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
```
3. Our program runs (note: in these cases it executes the statements in the _main_ method of the _Main_ class)

## Insights

### A Java source code file cannot contain two classes of the same name

While trying out question 3, we encountered this issue. Note that the stated rule is generally true (and not specific to _Main_ class or _main_ method).

See this example:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Test {}
class Test {}
```

This code would not compile and the compiler complains about the duplicate _Test_ class:
```bash
> javac -classpath .:/run_dir/junit-4.12.jar -d . Main.java
Main.java:8: error: duplicate class: Test
class Test {}
^
1 error
compiler exit status 1
```

### How Java finds the starting point of a Java program

Let's start again with an example:

We have a file _Main.java_ that contains the following code:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world from Main.main!");
  }

   public static void main2(String[] args) {
    System.out.println("Hello world from Main.main2!");
  }
}

class Test {
  public static void main(String[] args) {
    System.out.println("Hello world from Test.main!");
  }

   public static void main2(String[] args) {
    System.out.println("Hello world from Test.main2!");
  }
}
```

As you can see we have two classes which each contain two methods.

If we run our program, it will print out _Hello World from Main.main!_.

Let's try to understand why.

But this time, we will not use codeboard.io but try to compile and run our code on our local computer (using the console).

Let's place our _Main.java_ file there (note: the file is placed in a folder _java-test_ and _ls_ is a command to show all files in the folder)
```bash
nloo@Kubuntu1804:~/java-test$ ls
Main.java
```

Now let us compile the Java file (like codeboard.io does) and after that see what is contained in our _java-test_ folder:
```bash
nloo@Kubuntu1804:~/java-test$ javac Main.java
nloo@Kubuntu1804:~/java-test$ ls
Main.class  Main.java  Test.class
```

Now we see two new files as a result of the compiling.

So far we said, that the compiler takes our source code file and creates from it a new computer-readable file.

However, as you can see, that was not fully true: the Java compiler creates a new computer-readable file for each class that we defined in our source code file!

So _Main.class_ is the computer-readable version of the class _Main_ while _Test.class_ is the computer-readable version of the class _Test_.

Let's run our program, first like codeboard.io does, but then a second time with a little change:
```bash
nloo@Kubuntu1804:~/java-test$ java Main
Hello world from Main.main!
nloo@Kubuntu1804:~/java-test$ java Test
Hello world from Test.main!
```

In both cases we executed a _main_ method but in the second case the one of the class Test!

So, let's try to summarize how a Java program starts:
1. When we run the _java_ command, we pass it a *class name* as parameter (e.g. in our example first _Main_ and then _Test_)
2. This tells Java in which class it should search for the start method of our program
3. In this class it searches for a method that exactly matches **public static void main(String[] args)**
4. If it finds that, it will start the program by running that method
5. If it does not find that method, it fails with the above mentioned _"Error: Main method not found"_ error

