# Solution to exercises: using the Java standard library

## Using random number generators

### Print random numbers

```java
import java.util.Random;
import java.util.Scanner;

class PrintRandomNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("How many random numbers?");
        int n = scanner.nextInt();

        System.out.println("What's the maximum number?");
        int max = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int randonNumber = generator.nextInt(max) + 1;
            System.out.println(randonNumber);
        }
    }
}
```

### Guess a number

```java
import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        int toGuess = generator.nextInt(1000) + 1;
        int tentatives = 1;

        System.out.println("Guess a number:");
        int n = scanner.nextInt();

        while (n != toGuess) {

            if (n < toGuess) {
                System.out.println("Wrong, it's too small");
            }
            else { // checking if n > toGuess is not strictly needed
                System.out.println("Wrong, it's too big");
            }

            System.out.println("Try again, guess a number:");
            n = scanner.nextInt();
            tentatives++;
        }

        System.out.println("Yeah, you've found it in " + tentatives + " tentatives!");
    }
}
```

### Pick a random number

```java
import java.util.Random;
import java.util.Scanner;

class PickRandomNumber {

    public static int random(int a, int b) {
        Random generator = new Random();
        if (generator.nextBoolean()) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int n1 = scanner.nextInt();
        System.out.println("Give me another number:");
        int n2 = scanner.nextInt();

        int randomNumber = random(n1, n2);

        System.out.println("A random one of the two: " + randomNumber);
    }
}
```

### Pick a random element from array

```java
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PickRandomElement {

    public static String random(ArrayList<String> values) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(values.size());
        return values.get(randomIndex);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many strings do you want to give me?");
        int n = scanner.nextInt();

        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Type " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            strings.add(s);
        }

        String randomString = random(strings);

        System.out.println("A random string of the ones you gave me: " + randomString);
    }
}
```

## Using dates

### Which day of the week is today?

```java
import java.time.LocalDate;

class DayOfWeek {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today.getDayOfWeek());
    }
}
```

### Which day of the week is a date

```java
import java.time.LocalDate;
import java.util.Scanner;

class DayOfWeek {

    public static LocalDate askDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        LocalDate date = askDate();
        System.out.println(date + " is " + date.getDayOfWeek());
    }
}
```

### Time passed between two dates

```java
import java.time.LocalDate;
import java.time.Period;

class TimePassed {

    public static void main(String[] args) {
        
        LocalDate myBirthday = LocalDate.of(1985, 4, 25);
        LocalDate today = LocalDate.now();
        Period myAge = myBirthday.until(today);

        System.out.println("Today I am "
                + myAge.getYears() + " years, "
                + myAge.getMonths() + " months and "
                + myAge.getDays() + " days old");
    }
}
```

### Random day of year

```java
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

class RandomDayOfYear {

    public static LocalDate randomDay(int year) {

        Random generator = new Random();

        // This is the 1st of January of the year given by the user
        LocalDate firstDayOfYear = LocalDate.of(year, 1, 1);

        // Length of the year given by the user, in days
        int lengthOfYear = firstDayOfYear.lengthOfYear();

        // A random number from 0 to 364 or 365
        int randomN = generator.nextInt(lengthOfYear);

        // The random date is obtained by adding a random number of days to the 1st of January
        return firstDayOfYear.plusDays(randomN);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Of which year do you want a random date?");
        int year = scanner.nextInt();

        LocalDate randomDate = randomDay(year);

        System.out.println("A random date of that year is " + randomDate);
    }
}
```