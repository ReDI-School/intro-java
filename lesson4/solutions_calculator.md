---
title: "Solutions: Calculator"
nav_order: 6
parent: 4 - Input + Decision
---

# Solutions: Calculator

Basic version:

```java
import java.util.Scanner;

class Main {
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

class Main {
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
