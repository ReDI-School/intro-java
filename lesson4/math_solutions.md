---
title: "Solutions: Math"
nav_order: 5
parent: 4 - Input + Decision
---

# Solutions: Math

## Decimal to binary

```java
import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input ");
        int decimal = scanner.nextInt();

        String binary = "";

        while (decimal > 0) {
            int r = decimal % 2;
            binary = r + binary;
            decimal = decimal / 2;
        }

        System.out.println("output " + binary);
    }
}
```

## Calculator

Basic version:

```java
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please type a number, an operator and another number");
        int n1 = scanner.nextInt();
        String op = scanner.next();
        int n2 = scanner.nextInt();

        if (op.equals("+")) {
            int result = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + result);
        }
        else if (op.equals("-")) {
            int result = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + result);
        }
        else if (op.equals("*")) {
            int result = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + result);
        }
        else if (op.equals("/")) {
            int result = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + result);
        }
        else {
            System.out.println("the operation " + op + " is not recognized");
        }
    }
}
```

More advanced version: with loop and check for division by zero

```java
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String quitAnswer = ""; // Initially we have no answer

        while (! quitAnswer.equals("quit")) {

            System.out.println("please type a number, an operator and another number");
            int n1 = scanner.nextInt();
            String op = scanner.next();
            int n2 = scanner.nextInt();

            if (op.equals("+")) {
                int result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
            } else if (op.equals("-")) {
                int result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
            } else if (op.equals("*")) {
                int result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
            } else if (op.equals("/")) {
                if (n2 != 0) {
                    int result = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + result);
                }
                else {
                    System.out.println("cannot divide by zero");
                }
            } else {
                System.out.println("the operation " + op + " is not recognized");
            }

            System.out.println("do you want to continue or quit?");

            quitAnswer = scanner.next();
        }
    }
}
```

Difficult version: added possibility to use `last` to reuse the last number calculated.

```java
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String quitAnswer = ""; // Initially we have no answer
        int last = 0; // No last number at the beginning

        while (! quitAnswer.equals("quit")) {

            System.out.println("please type a number (or 'last'), an operator and another number (or 'last')");

            String n1OrLast = scanner.next();
            String op = scanner.next();
            String n2OrLast = scanner.next();

            int n1; // We leave it uninitialized, it's not nice, but we initialize it immediately after
            if (n1OrLast.equals("last")) {
                n1 = last;
            }
            else {
                n1 = Integer.parseInt(n1OrLast);
            }

            int n2; // We leave it uninitialized, it's not nice, but we initialize it immediately after
            if (n2OrLast.equals("last")) {
                n2 = last;
            }
            else {
                n2 = Integer.parseInt(n2OrLast);
            }

            if (op.equals("+")) {
                last = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + last);
            } else if (op.equals("-")) {
                last = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + last);
            } else if (op.equals("*")) {
                last = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + last);
            } else if (op.equals("/")) {
                if (n2 != 0) {
                    last = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + last);
                }
                else {
                    System.out.println("cannot divide by zero");
                }
            } else {
                System.out.println("the operation " + op + " is not recognized");
            }


            System.out.println("do you want to continue or quit?");

            quitAnswer = scanner.next();
        }
    }
}
```

### Fibonacci

```java
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers do you want to print?");
        int n = scanner.nextInt();

        int prevF = 1;
        int prevPrevF = 1;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                System.out.println("Fibonacci number 1 is: 1");
            }
            else if (i == 2) {
                System.out.println("Fibonacci number 2 is: 1");
            }
            else {
                int f = prevF + prevPrevF;
                System.out.println("Fibonacci number " + i + " is: " + f);

                // Update for the next cycle
                prevPrevF = prevF;
                prevF = f;
            }
        }
    }
}
```
