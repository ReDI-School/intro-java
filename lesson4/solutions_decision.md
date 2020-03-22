---
title: "Solutions: Decision Statements"
nav_exclude: true
---
Note: there are multiple ways how to solve the exercises, these solutions are just one way.

## Exercise 1

```java
public class Exercise {

    public static void main(String[] args) {

        System.out.println("This is printed before the if statement");

        int age = 17;
        int lastHomeworkGrade = 3;
         
        if (age > 18 && lastHomeworkGrade >= 4) {
            System.out.println("The condition is true.");
        }

        System.out.println("This is printed after the if statement");
    }
}
```

## Exercise 2

```java
import java.util.Scanner;

public class TallestPerson {

    public static void main(String[] args) {
        int currentHeightInCm = 185;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of next student:");
        int newHeightInCm = scanner.nextInt();        

        if (newHeightInCm > currentHeightInCm) {
            currentHeightInCm = newHeightInCm;
        }

        System.out.println("Right now the tallest person in the group is " + currentHeightInCm + "cm tall!");
    }
}
```

## Exercise 3

```java
import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter family name");
        String name = scanner.nextLine();
        System.out.println("Choose gender");
        System.out.println("1 -> male");
        System.out.println("2 -> female");
        int gender = scanner.nextInt();

        if(gender == 1) {
          System.out.println("Hello Mr. " + name);
        } else if(gender == 2) {
          System.out.println("Hello Lady " + name);
        } else {
          System.out.println("Hello");
        }
    }
}
```

## Exercise 4

```java
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        double number1 = scanner.nextDouble();
        System.out.println("Second number:");
        double number2 = scanner.nextDouble();
        System.out.println("Please specify an operation:");
        System.out.println("1 -> +");
        System.out.println("2 -> -");
        System.out.println("3 -> *");
        System.out.println("4 -> /");
        int operation = scanner.nextInt();

        if(operation == 1) {
          double result = number1 + number2;
          System.out.println("Result of " + number1 + " + " + number2 + " is " + result);
        } else if(operation == 2) {
          double result = number1 - number2;
          System.out.println("Result of " + number1 + " - " + number2 + " is " + result);
        } else if(operation == 3) {
          double result = number1 * number2;
          System.out.println("Result of " + number1 + " * " + number2 + " is " + result);
        } else if(operation == 4) {
          double result = number1 / number2;
          System.out.println("Result of " + number1 + " / " + number2 + " is " + result);
        } else {
          System.out.println("Invalid operation");
        }
    }
}
```

## Exercise 5

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        System.out.println("Enter a month:");
        int month = scanner.nextInt();
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
          System.out.println("31 days");
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
          System.out.println("30 days");
        } else if(month == 2) {
          if(year % 4 == 0) {
            System.out.println("29 days");
          } else {
            System.out.println("28 days");
          }
        } else {
          System.out.println("Not a valid month, number should be bewteen 1 and 12");
        }
    }
}
```

## Exercise 6

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        if(number1 <= number2) {
          if(number2 <= 21) {
            System.out.println(number2);
          } else if(number1 <= 21) {
            System.out.println(number1);
          } else {
            System.out.println(0);
          }
        } else {
          if(number1 <= 21) {
            System.out.println(number1);
          } else if(number2 <= 21) {
            System.out.println(number2);
          } else {
            System.out.println(0);
          }
        }
    }
}
```