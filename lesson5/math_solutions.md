---
title: "Solutions: Math"
nav_order: 4
parent: 5 - Loops
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

## Fibonacci

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
