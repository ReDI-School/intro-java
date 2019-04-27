# Exercises: using the Java standard library

Java is provided with a standard library, that contains many classes that
perform the most diverse tasks. `String`, `Scanner` are few of the many classes
available, that developers can use to build their programs.

The Java standard library is documented at [here](https://docs.oracle.com/javase/8/docs/api/index.html).
Select the package you're interested to see all the classes it contains.

## Using random number generators

Using the class `java.util.Random`, implement the following exercises.

The class is documented [here](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html).

Note in particular the following methods:

- `nextInt()`
- `nextInt(int bound)`
- `nextBoolean()`
- `nextDouble()`

### Print random numbers

Print N numbers, where each number is a random number from 1 to X.
N and X are values you should ask users.

*HINTS*

- create a random number generator using `new Random()`.
- to obtain a random number from 0 to `x - 1`, use the method `nextInt(x)`.

*NOTE*: the exercise asks you to print random numbers from 1 to X,
        while the `nextInt()` method return numbers from 0 to X - 1.

### Guess a number

This is a simple game: generate a random integer from 1 to 1000, but don't tell anyone :-)

Ask the user to guess what number was generated:

- The user types a number.
- If it's the generated, print "Yeah, you've found it!" and terminate the game.
- If it's less than the generated, print "Wrong, it's too small" and ask again.
- If it's greater than the generated, print "Wrong, it's too big" and ask again.

Play the game yourself: you against your own software, let's see who's smarter!

*EXTRA*: When the user wins, print how many tentatives they needed.

*EXTRA*: Hard version of the game: change the game to guess a random integer without the 1-1000 limitation,
         using `nextInt()`. This returns random numbers from -2,147,483,648 to 2,147,483,647, that
         is a range that contains approximately 4 billion possible values (2^32 to be precise).
         Play the game but don't be scared, you'll still be able to guess it, it just requires
         more tentatives, but not many more. Be smart, you can for sure make it in less than 32 tentatives!

### Pick a random number

Write a method that returns a random integer between two possible numbers.

The signature is:

```java
public static int random(int a, int b) {
    // return a or b, randomly
}
```

Using the method, ask the user for two integers and print a random one of the two.

### Pick a random element from array

Write a method that returns a random element from an `ArrayList<String>`.

The signature is:

```java
public static String random(ArrayList<String> values) {
    // return a random string from the ones contained in values
}
```

Using the method, ask the user for some strings and then print a random one.

## Using dates

Using the class `java.time.LocalDate` and `Period` implement the following exercises.

The classes are documented [here](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html).
and [here](https://docs.oracle.com/javase/8/docs/api/java/time/Period.html).

Note in particular the following methods of `LocalDate`:

- `LocalDate.now()`
- `LocalDate.of(int year, int month, int dayOfMonth)`
- `getDayOfWeek()`
- `plusDays(long daysToAdd)`
- `plusMonths(long monthsToAdd)`
- `plusWeeks(long weeksToAdd)`
- `plusYears(long yearsToAdd)`

Any many more.

### Which day of the week is today?

Print which day of the week is today.

*HINT*: create `today` as new object using `LocalDate.now()` and ask `today` which day of the week it is.

### Which day of the week is a date

Write a method to ask the user for a date. The user types day, month and year.

Signature:

```java
public static LocalDate askDate() {
    // Ask the user and return a new LocalDate
}
```

Use the method to ask the user for a date and print which day of the week.

Which day of the week was your birthday?

### Time passed between two dates

Study the documentation and find if there's a way to obtain how many days, months and years separate two dates. 

How old are you, exactly, today?

### Random day of year

Given a year, pick a random day of that year.

Signature:

```java
public static LocalDate randomDay(int year) {
    // Generate and return a new LocalDate    
}
```

Ask the user for a year, pick a random day of that year, print it and print its day of the week.

Make sure you generate a valid date, 31st of April is invalid and 29th of February is also invalid, but not every year!

*HINT*: the Java `time` library knows which dates are valid and which not, you don't have to write this logic yourself.