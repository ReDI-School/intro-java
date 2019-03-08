# Solution to exercises: reusing methods

## Prime numbers

These are user input and prime numbers shared methods:

```java
import java.util.Scanner;

class PrimeNumbers {

    public static int askNumber(int min, int max) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between " + min + " and " + max);
        int n = scanner.nextInt();

        while (n < min || n > max) {
            System.out.println("Invalid number, it must be between " + min + " and " + max);
            System.out.println("Try again");
            n = scanner.nextInt();
        }

        return n;
    }

    public static boolean isPrimeNumber(int n) {

        // This method can be further improved, without major changes
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

The following are possible `main` methods that can be added to the class above. 

### Finding a prime number manually

```java
public static void main(String[] args) {

    int max = 1000000000;
    int n = askNumber(1, max);

    while (! isPrimeNumber(n)) {
        System.out.println(n + " is not a prime number, try again");
        n = askNumber(1, max);
    }

    System.out.println("Found! " + n + " is a prime number!");
}
```

### Printing prime numbers

```java
public static void main(String[] args) {

    System.out.println("Please type number A");
    int a = askNumber(1, 1000000);
    System.out.println("Please type number B");
    int b = askNumber(a, 1000000);

    System.out.println("The prime numbers between " + a + " and " + b + " are:");
    for (int i = a; i <= b; i++) {
        if (isPrimeNumber(i)) {
            System.out.println(i);
        }
    }
}
```

### Collecting prime numbers

```java
public static void main(String[] args) {

    System.out.println("How many prime numbers do you want to collect?");
    int n = askNumber(1, 50000);

    int i = 2; // This is the number we test
    int found = 0; // This counts how many numbers have been found

    while (found < n) {
        if (isPrimeNumber(i)) {
            found++;
            System.out.println("Prime number " + found + " is " + i);
        }
        i++;
    }
}
```

## Password check

```java
import java.util.Scanner;

class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a password");
        String password = scanner.next();

        if (! isStringLongerThan(password, 10)) {
            System.out.println("Invalid password, it must be longer than 10 characters");
        }
        else if (! containsOnlyLettersAndDigits(password)) {
            System.out.println("Invalid password, it must contain only digits and numbers");
        }
        else if (! containsEnoughDigits(password, 2)) {
            System.out.println("Invalid password, it must contain at least 2 digits");
        }
        else {
            System.out.println("The password is valid");
        }
    }

    public static boolean isStringLongerThan(String word, int lowerBound) {
        return word.length() >= lowerBound;
    }

    public static boolean containsOnlyLettersAndDigits(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (! Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsEnoughDigits(String word, int lowerBound) {
        int found = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                found++;
            }
        }
        return found >= lowerBound;
    }
}
```
