---
title: "Solving programming task with methods: Top-Down"
nav_order: 5
parent: 6 - Methods + Scope
---

# Solving programming task with methods: Top-Down approach

Methods are also helpful when trying to implement towards a solution for a given programming task.

Here we will see a *top-down* approach that can help to solve a given programming task.

Like in the *bottom-up* approach, the goal is to divide our complex programming task into smaller and smaller problems that we can then solve easily.

Feel free to follow the steps in our example by writing also each step in repl.it

## Programming Task

We will revisit a familiar problem that we already solved as part of the loop exercises.

The procedure we use here can be applied to any programming task (especially ones that are more complex than our example here).

Here is the task:

Write a program that, given two numbers as input, prints the border of a rectangle.

```text
input: 4
input: 5
output:
* * * *
*     *
*     *
*     *
* * * *
```

## General idea
Here is the idea of how we solve our programming task with the top-down approach:
* we start in the _main_ of our program and proceed in steps
* in each step, we try to implement the method nearest to the top that is lacking an implementation following these rules:
  * we keep the implementation minimal, i.e. forget as many details as possible
  * for any details we do not want to implement yet, we introduce a new method that we call from our current method (we just assume that the new method will magically implement the rest)
  * we make sure, that our program compiles, i.e. by adding new parameters to the method we are working on to have the information it needs to do its work and adapting accordingly all the place _up_ in our program that call that method
  * our method implementation should do some additional work ... i.e. it should not just call one other method.
* after a step, we proceed by implementing the next unimplemented method in our program

This might sound complicated - so let's try to apply this to our programming task!

## Implementation

We will proceed iteratively in multiple steps - feel free to write code of each step in repl.it and try to understand what we did.

### Step 1

We start at the "top layer" of our problem.  
First thing is quite easy, we need to get from user the number of rows and columns (note: we could have pushed that detail of how these values are fetched also into their own methods - however, as this is quite simple and not really interesting, we implement that directly in our _main_ method)-

Our code looks now like this:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
    }
}
```
Let's try to look at our problem by ignoring as much details as possible.  
We see that what we need to do is to print a certain number (given by the user and saved in variable _rows_) of rows.  
For now, we actually want to ignore **how** a row is actually printed - thus we hide that inside a new method _printRow_ that we introduce.  
We'll implement that later and for the moment assume, that it will then just work.

Thus, as our first steo, we come up with the following code:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow();
        }
    }

    public static void printRow() {
        // TODO
    }
}
```

### Step 2

As the next step, we need to think about how our _printRow_ method should work.  
Looking back to our task, we can see that each row consists of a number of columns (which may be a _*_ or just be empty).  
Thus we conclude, that to print a row, we need to print each column.  
And after printing each column, we use _System.out.println()_ to force a new line.   
Again, we do not care about **how** we actually print a column ... we define a new method _printColumn_ that will be able to do this (in the future).  
We come up with the following implementation:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow();
        }
    }

    public static void printRow(int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn();
        }
        System.out.println();
    }

    public static void printColumn() {
        // TODO
    }
}
```
We saw also that in order to print each column in a row, we need to have the information about the total number of columns inside a row in _printRow_.  
Therefore we added the _nrOfColumns_ parameter to it.  
But now our program does not compile anymore if we try to run it.  
Let's fix that before we continue by adapting how we call _printRow_ by passing a parameter:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(columns);
        }
    }

    public static void printRow(int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn();
        }
        System.out.println();
    }

    public static void printColumn() {
        // TODO
    }
}
```

### Step 3

Our program is now able to print each "column" of each row ... but of course, so far nothing really hapens if we run our program.  
Let's proceed with the next step of printing a single column.  
We look again at our task - if we want to print a column, we either print a _*_ or print an empty column.  
So when do we need to print a _*_? 
* if we are in the first row, than each column is a _*_
* if we are in the last row, than each column is a _*_
* if we are in the first column, we print a _*_ 
* if we are in the last column, we print a _*_

In any other case, we print an empty String.

We come up with the following implementation for _printColumn_.  
Again, we ignore the details of how to find out if we are in a first/last row or first/last column by introducing methods that we'll implement later.  
Note, that these methods now return a boolean, so we just decide for now to just return a constant value: 
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(columns);
        }
    }

    public static void printRow(int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn();
        }
        System.out.println();
    }

    public static void printColumn() {
        if(isLastRow() || isFirstRow()) {
            System.out.print("* ");
        } else if(isFirstColumn() || isLastColumn()) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static boolean isLastRow() {
        return false;
    }

    public static boolean isFirstRow() {
        return false;
    }

    public static boolean isLastColumn() {
        return false;
    }

    public static boolean isFirstColumn() {
        return false;
    }
}
```

### Step 4

Now we zoom in on these 4 new methods.  
Can we ignore more details when we try to implement them?  
Actually not - we reached the bottom of our program and now we need to implement them fully - no more of defining methods that will solve our problems in the future.

How do we find out if we are in the first row?  
Well, we need to add a parameter to our _isFirstRow_ method containing the current row ... then we just need to check if it is 1:
```java
public static boolean isFirstRow(int row) {
    return row == 1;
}
```

For _isFirstColumn_ we basically do the same ... only that we pass here the current column:
```java
public static boolean isFirstColumn(int column) {
    return column == 1;
}
```

Implementing _isLastRow_ requires more information.  
We need again the current row but also how many rows actually exist (as this is not fixed):
```java
public static boolean isLastRow(int row, int nrOfRows) {
    return row == nrOfRows;
}
```

But for _isLastColumn_ we can again basically do the same ... only that we pass here the current column and how many columns exist:
```java
public static boolean isLastColumn(int column, int nrOfColumns) {
    return column == nrOfColumns;
}
```

### Step 5

Our full program with the four methods implemented now looks like this:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(columns);
        }
    }

    public static void printRow(int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn();
        }
        System.out.println();
    }

    public static void printColumn() {
        if(isLastRow() || isFirstRow()) {
            System.out.print("* ");
        } else if(isFirstColumn() || isLastColumn()) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }

    public static boolean isLastColumn(int column, int nrOfColumns) {
        return column == nrOfColumns;
    }

    public static boolean isFirstColumn(int column) {
        return column == 1;
    }
}
```
But if we try to run, we'll see that it does not compile as we call these methods not correctly in _printColumn_ - the parameters are missing.  
Let's fix this:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(columns);
        }
    }

    public static void printRow(int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn();
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row)) {
            System.out.print("* ");
        } else if(isFirstColumn(column) || isLastColumn(column, nrOfColumns)) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }

    public static boolean isLastColumn(int column, int nrOfColumns) {
        return column == nrOfColumns;
    }

    public static boolean isFirstColumn(int column) {
        return column == 1;
    }
}
```
As you can see, we needed to add new parameters to _printColumn_ as we did not yet have information about current row, current column, number of rows and number of columns.  
But again, our program is still not compiling ... this time our call to _printColumn_ in _printRow_ is incorrect (we are not passing the required parameters).  
So we'll fix this in the next step:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(columns);
        }
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row)) {
            System.out.print("* ");
        } else if(isFirstColumn(column) || isLastColumn(column, nrOfColumns)) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }

    public static boolean isLastColumn(int column, int nrOfColumns) {
        return column == nrOfColumns;
    }

    public static boolean isFirstColumn(int column) {
        return column == 1;
    }
}
```
As you can see, we already had in _printRow_ the information about the number of columns and the information about the current column (coming from the loop iteration). So here we need to adapt again the parameters to fill in the missing information about current row and number of rows.  
And again, our program does not compile as we call _printRow_ incorrectly from _main_ (again missing required parameter).  
Let's also fix that:
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(i,rows,columns);
        }
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row)) {
            System.out.print("* ");
        } else if(isFirstColumn(column) || isLastColumn(column, nrOfColumns)) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }

    public static boolean isLastColumn(int column, int nrOfColumns) {
        return column == nrOfColumns;
    }

    public static boolean isFirstColumn(int column) {
        return column == 1;
    }
}
```
And if we run now our program, we see that we finally reached the end - it compiles and prints the correct output!  
Problem solved!