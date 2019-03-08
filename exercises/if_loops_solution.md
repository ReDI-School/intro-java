# Solution to exercises: if & loops

## Stars

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

## Multiply

Simple version with the method that prints:

```java
import java.util.Scanner;

class Multiply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number");
        int multiplicand = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            printMultiply(multiplicand, i);
        }
    }

    public static void printMultiply(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b));
    }
}
```

More elegant version where the method prepares the string without printing it.
Printing is performed only in the `main` method. Each method does only one thing and this is good.

```java
import java.util.Scanner;

class Multiply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number");
        int multiplicand = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            String multiplyString = getMultiplyString(multiplicand, i);
            System.out.println(multiplyString);
        }
    }

    public static String getMultiplyString(int a, int b) {
        return a + " x " + b + " = " + (a * b);
    }
}
```

## FizzBuzz

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