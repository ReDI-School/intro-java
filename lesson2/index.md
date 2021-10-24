---
title: 2 - Data Types
nav_order: 2
has_children: true
---

# Data Types

- Variables
- Variable names
- Data types
  - `int`
  - `double`
  - `boolean`
  - `String`
- Declaration and initialization
- Print with different data types

Material:
- [Slides](https://drive.google.com/open?id=113jN-mJ4Ev80sNsjk8NspoAvUegXHBH9EvHAaV8DwXY)

## Variables

Look at this statement:

`int salary = 2200;`

This statement does two things:

1. It declares a variable of type `int` and name `salary`.
2. It assigns the value `2200` to `salary`.

In Java, each variable, and not only, **must** have a type.

Statement like `a = 10` is not accepted. `int a = 10;` is the correct form to declare `a`.

Variables are called so because we can change their values. In our example,
we can change the value of `salary`, like this:

`salary = 2500;`

In Java the `=` symbol is used for assignment, unlike in maths where it means equality.
In programming both sides of the equal sign do not need to have the same value.
The value _right_ of the `=` sign is assigned (copied) to what it is on the _left_, our variable.

If `salary` had a different value before (`2200` in our example), that previous value got lost
after a new value is assigned to it.

Statements like `salary = salary + 100;` are correct, in Java. Not in math.

### Variable names

You're free to name a variable as you prefer. Please try to give it a name that carries a clear meaning.

Rules:

- Variable names should start with a letter, an underscore, or the `$` character.
- Variable names cannot have spaces. 
- longer names should have the format `dateOfBirth`: each word has a capital letter except the first. 
- No special characters.
- No Java reserved words: `class`, `public`, `static`, `if`, `while`, `for`, `return`, ...

## Data types

Each variable must have a data type.

Data types determine, what type of values we can put in a variable and what actions can be done with them.
A variable declaration is always starting with stating the type of the variable.

```java
int numerOfLegs = 2;
double pi = 3.1415; 
boolean isAlive = true;
String firstName = "Peter";
char c = 'K';
```

### Non-fractional Numbers

You can use the following types to represent integer values:

- `int` for non-fractional numbers from -2000000000 to +2000000000. (approx)
- `long` for non-fractional numbers much higher than what `int` can represent.
- `short` for non-fractional numbers from -65000 to +65000. (approx)
- `byte` for non-fractional numbers from -128 to 127.

HINT: **always use `int` for integer numbers**, unless there's a valid reason not to.

### Decimal Numbers

You can use the following types to represent decimal values:

- `float` for fractional numbers (smaller precision).
- `double` for fractional numbers (higher, _double_ precision).

HINT: **always use `double` for fractional numbers**, and always use dot `.`
to separate the decimal part from the fractional part:

Example: `3.1415`, not `3,1415`.

HINT: **use (??? intended twice use ???) always use `int` for numbers**, unless you know the concept
you're trying to represent with a variable is fractional, then use `double`.

Examples:

- `int people = 21;`, not 21.76 people? no ...
- `int month = 3;`, 3 means March, what would 3.80 mean?
- `int uBahnLine = 6;`, like U6, that's no U6.25.
- `double cost = 4.99;`, in euro.
- `double temperature = 21.6;`, in °C.
- `double height = 1.79;`, in meters.

### Boolean

This is a very important type. It can have only two values, `true` or `false`. It's used
to store the result of logical calculation. It's very important when programming a computer.

The name of the type is `boolean`.

Examples:

- `boolean isRaining = true;`
- `boolean needUmbrella = true;`
- `boolean isWeekend = false;`
- `boolean isStudent = true;`
- `boolean speaksEnglish = true;`
- `boolean speaksGerman = true;` or `false`, but not `ein bisschen`.

### Text

For text, use `String`.

Examples:

- `String firstName = "Martha";`
- `String midName = "";` yes, this is valid, just some empty text.
- `String surname = "Smith";`
- `String fullName = "Martha Smith";`

These are all variables, so we can of course change their value as we did with `salary` above:

`fullName = "Claire Smith";`

The type `char` is used to represent single characters:

- `char initial = 'M';`

NOTE: `String` is written uppercase and text is enclosed in double quotes `"`.
`char` is written lowercase, and characters are enclosed in single quotes `'`.

## Printing experiments

Instead of just printing strings directly, we can also print the values of a variable.

What will the following code print?

```java
class Main {
    public static void main(String[] args) {
        String name = "Jeff" + " Jonson";
        System.out.println(name);
        name = "Jennifer";
        System.out.println(name);
        name = name + " Lopez";
        System.out.println(name);
    }
}
```

You can print more than strings. You can print any value of any data type.

What will the following code print?

```java
class Main {
    public static void main(String[] args) {
        int age = 31;
        System.out.println(age);
        int salary = 2000;
        System.out.println(salary);
        salary = salary + 200;
        System.out.println(salary);
        salary = salary * 2;
        System.out.println(salary);
    }
}
```

You could even combine strings and other data types.

What will be printed on the screen by the following code?

```java
class Main {
    public static void main(String[] args) {
        int age = 31;
        System.out.println("Age: " + age);
        int salary = 2000;
        System.out.println("Salary: " + salary);
        salary = salary + 200;
        System.out.println("New salary: " + salary);
    }
}
```
