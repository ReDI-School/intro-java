---
title: "Solving programming task with methods: Bottom-Up"
nav_order: 6
parent: 6 - Methods + Scope
---
# Solving programming task with methods: Bottom-Up approach

Methods are also helpful when trying to implement towards a solution for a given programming task.

Here we will see a *bottom-up* approach that can help to solve a given programming task.

Like in the *top-down* approach, the goal is to divide our complex programming task into smaller and smaller problems that we can then solve easily.

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
Here is the idea of how we solve our programming task with the bottom-up approach:
* we look at our task and try to split this into smaller task that we need to solve in order to get the whole thing down
* we keep splitting these tasks into smaller subtasks until such a subtask is small enough that we can solve it with a simple implementation
* we implement each of these "small-enough" subtasks in a method
* we test each of our methods separately if they work as expected (e.g. by calling them from _main_ with different parameters)
* once we have implemented these small subtasks, we look at which "bigger" task we can now solve by combining the methods we have written so far (and thus write a method for this "bigger" task)
* we repeat this procedure until we finally solved our original full task

This might sound complicated - so let's try to apply this to our programming task!

## Implementation

We will proceed iteratively in multiple steps - feel free to write code of each step in repl.it and try to understand what we did.

### Step 1

Let's start with this - we keep our _main_ for the moment empty:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
    }
}
```

Now we want to start with the smallest problem possible that is part of our programming task.  
A small part is obviously just printing a column (a _*_ or an empty String).  
But can we break the task of printing a column even further down in even smaller problems?  
Yes - a smaller problem is not to actually print the column but to decide *what* to print.

So when do we need to print a _*_? 
* if we are in the first row, then print a _*_
* if we are in the last row, then print a _*_
* if we are in the first column, then print a _*_ 
* if we are in the last column, then print a _*_

In any other case, we print an empty String.

Thus we have found 4 smallest problems to decide if we need to print a _*_.  
We will proceed by defining for each of these 4 problems its own method and implement those.  

We start with deciding if we are in the first row - this is easy we just need to pass to our method the current row as parameter and check if it is 1:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }
}
```

Before we continue with the other methods, we can actually test that our method works as expected.  
Let's call it in our _main_, run the program and check that the output s as we expect it!
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(isFirstRow(1));
        System.out.println(isFirstRow(2));
        System.out.println(isFirstRow(3));
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }
}
```
Great, that worked.  
Now we define and implement a method for our second small problem, if a row is the last row.  
This time we need additionally to the current row also the total number of rows (as the number of rows is not fixed but is entered by user):
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }
}
```

And again, we can test our new method by calling it in _main_ and running our program:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(isLastRow(1, 3));
        System.out.println(isLastRow(2, 3));
        System.out.println(isLastRow(3, 3));
    }

    public static boolean isLastRow(int row, int nrOfRows) {
        return row == nrOfRows;
    }

    public static boolean isFirstRow(int row) {
        return row == 1;
    }
}
```

Finally, we can do the same for our other 2 problems of checking if we are in first or last column.  
These methods are basically the same as the row methods (except that we check the columns instead of the rows).  
Here is how the final implementation of our 4 methods look like:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
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

### Step 2

Given our 4 methods, we look now at the next problem that we can now solve with our new methods.  
Remember that we defined these when we though about how to print a column.  
So let this be our next problem: we want to print a column (i.e. print a _*_ or empty String) using our 4 methods.

Let's define a new method to do that and implement it:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
    }

    public static void printColumn(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(i, nrOfColumns) || isFirstColumn(i)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
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
Of course, we need to make sure that we have all necessary information - we should define these as method parameters.

And again it is testing time: we call our _printColumn_ from _main_ with different parameter values, run it and check if it works correctly!
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        printColumn(0, 0, 3, 4);
        printColumn(1, 0, 3, 4);
        printColumn(1, 1, 3, 4);
        printColumn(3, 1, 3, 4);
        printColumn(2, 4, 3, 4);
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(column, nrOfColumns) || isFirstColumn(column)) {
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

### Step 3

We already have accomplished a lot - we can print single columns.  
So what can we do with that => we can use it to now print a complete row!

Let's define a new method to print a row and use our _printColumn_ in it:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TODO
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(column, nrOfColumns) || isFirstColumn(column)) {
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
Of course, we needed again to make sure that we have all necessary information - what we did not get directly from our method implementation (like the current column as result of our loop iteration) we defined as method parameters.

And we test of course our new method:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        printRow(1, 3, 4);
        printRow(2, 3, 4);
        printRow(3, 3, 4);
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(column, nrOfColumns) || isFirstColumn(column)) {
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

### Step 4

Now we are already able to print single rows - so we just need as next step make sure that we print all rows.

Let's implement that directly in _main_ (as there is not really much more work leff):
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        for(int i = 1; i <= rows; i++) {
            printRow(i, rows, columns);
        }
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(column, nrOfColumns) || isFirstColumn(column)) {
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
We set _rows_ and _columns_ here to a fixed value for now - we can just test it with that.


### Step 5

And finally the last (boring) task: instead of having _rows_ and _columns_ be a fixed value, we allow the user to enter them.  

Sound like a task for _Scanner_:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            printRow(i, rows, columns);
        }
    }

    public static void printRow(int row, int nrOfRows, int nrOfColumns) {
        for(int i = 1; i <= nrOfColumns; i++) {
            printColumn(row, i, nrOfRows, nrOfColumns);
        }
        System.out.println();
    }

    public static void printColumn(int row, int column, int nrOfRows, int nrOfColumns) {
        if(isLastRow(row, nrOfRows) || isFirstRow(row) || isLastColumn(column, nrOfColumns) || isFirstColumn(column)) {
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