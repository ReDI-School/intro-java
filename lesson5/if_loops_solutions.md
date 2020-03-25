---
title: "Solutions: if + loops"
nav_exclude: true
---

# Solutions: if and loops

## Exercise 1

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
```
## Exercise 2

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        for (int i = number2; i <= number1; i++) {
            if(i % number2 == 0) {
                System.out.println(i + " is dividable by " + number2);
            }
        }
    }
}
```

## Exercise 3

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double accountBalance = 100.0;

        System.out.println("Current money on account: " + accountBalance);

        while(accountBalance > 0) {
            System.out.println("Enter amount:");
            double amount = input.nextDouble();
            System.out.println("Enter 1 for deposit, 2 for withdrawal");
            int operation = input.nextInt();
            if(operation == 1) {
                accountBalance += amount;
                System.out.println("Current money on account: " + accountBalance);
            } else if(operation == 2) {
                accountBalance -= amount;
                System.out.println("Current money on account: " + accountBalance);
            } else {
                System.out.println("Invalid input, please try transaction again ...")
            }
        }

        System.out.println("You have no money left, program stopped ...");
    }
}
```

## Exercise 4

```java
class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) { // i % 5 can only be != 0 at this point, no need to check
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) { // i % 3 can only be != 0 at this point, no need to check
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
```

## Exercise 5: Stars

### Lines and rectangles

This prints one line:

```java
import java.util.Scanner;

class Line {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many stars?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
```

The version that asks two numbers and prints a rectangle:

```java
import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        System.out.println("How many rows?");
        int rows = scanner.nextInt();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Triangle

Straight triangle:

```java
import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = scanner.nextInt();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

Inverted triangle:

```java
import java.util.Scanner;

class InvertedTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = scanner.nextInt();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < (rows - r); c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Border

```java
import java.util.Scanner;

class Border {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        System.out.println("How many rows?");
        int rows = scanner.nextInt();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                if (r == 1 || c == 1 || r == rows || c == columns) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
```