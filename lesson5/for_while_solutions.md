---
title: "Solutions: for vs. while"
nav_order: 6
parent: 5 - Loops
---

# Solutions: for vs. while

## Exercise 1: calculate the sum of 10 numbers

Not only the amount of numbers is known before the program reaches the loop,
but it's known by the programmer when they write the code. We say it's known at _compile time_.

This is the perfect case for a `for`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
   
        // VERY GOOD: `i` stays inside the loop and is fully managed by the `for` statement
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please enter number " + i + ": ");
            int x = input.nextInt();
            sum += x;
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
``` 

It's also possible to solve it using `while`, but the result is not as elegant as using `for`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        // BAD: `i` is defined outside the loop and we must use it in 3 different places
        int i = 1; // 1st

        // BAD: we should use `for` in this case
        while (i <= 10) { // 2nd
            System.out.print("Please enter number " + i + ": ");
            int x = input.nextInt();
            sum += x;
            i++; // 3rd
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

## Exercise 2: calculate the sum of N numbers

The amount of numbers is known because we ask the user before the program reaches the loop.
It's not known by the programmer when they write the code, but it's known by the program.

This is still the perfect case for a `for`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("How many numbers? ");
        int n = input.nextInt();

        // VERY GOOD: `i` stays inside the loop and is fully managed by the `for` statement
        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter number " + i + ": ");
            int x = input.nextInt();
            sum += x;
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

As before, it's also possible to solve it using `while`, but it's not as elegant as using `for`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        // BAD: `i` is defined outside the loop and we must use it in 3 different places
        int i = 1; // 1st
        
        System.out.print("How many numbers? ");
        int n = input.nextInt();

        // BAD: we should use `for` in this case
        while (i <= n) { // 2nd
            System.out.print("Please enter number " + i + ": ");
            int x = input.nextInt();
            sum += x;
            i++; // 3rd
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

## Exercise 3: calculate the sum of some numbers

The amount of numbers is not known before the program reaches the loop,
because the user can decide at any time to stop by entering zero.
So we, and the program, cannot know how many numbers to process before entering the loop.

This is good case for a `while`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Please enter a number: ");
        int x = input.nextInt();
        
        // GOOD: we don't know how many iterations, we can't use `for`
        while (x != 0) {
            sum += x;  
            System.out.print("Please enter a number: ");
            x = input.nextInt();
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

As before, it's also possible to solve it using `for`, but it's not elegant as using `while` or `do` ... `while`:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Please enter a number: ");

        // UNUSUAL: we consider this use of `for` unusual and kind of for expert users:
        //          although it's 100% correct and works, we suggest using `while` instead
        for (int x = input.nextInt(); x != 0; x = input.nextInt()) {
            sum += x;  
            System.out.print("Please enter a number: ");
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

Look back at the implementation with `while`: do you see the sentence "Please enter a number" written twice?
The `while` code above is good, but we can still work on it. This is a rare case where the code
can be further improved using `do` ... `while`: 

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int x;

        // GOOD: we don't know how many iterations, we can't use `for`.
        //       we can use `do`/`while` because we know we ask the user at least once
        do {
            System.out.print("Please enter a number: ");
            x = input.nextInt();
            sum += x;
        } while (x != 0);

        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

However, the improvements `do` ... `while` brings over `while` are minimal and this statement introduces new issues
(see that `x` unassigned?). It's perfectly fine to solve this exercise using just `while`.