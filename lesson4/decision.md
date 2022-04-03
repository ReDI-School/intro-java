---
title: "Decision Statements"
nav_order: 2
parent: 4 - Input + Decision
---

# Decision Statements

## Simple if

Sometimes there is the need to only execute a block of code if one or multiple conditions are met. Such conditions are expressed via boolean values that can be `true` or `false`. 

Imagine you wanted to find the height of the tallest person in our group.

For this example we have to do different things:

1. Getting the height (from a variable) of the person, who is the tallest person until now.
2. Get the height of the next person and compare this height with the height of the person, who is the tallest right now.
3. If the new value is bigger than the old value, the old value has to be replaced by the height of the new person.

In Java this sequence looks like this:

```java
public class TallestPerson {

    public static void main(String[] args) {
        int currentHeightInCm = 185;
        int newHeightInCm = 187;        

        if (newHeightInCm > currentHeightInCm) {
            currentHeightInCm = newHeightInCm;
        }

        System.out.println("Right now the tallest person in the group is " + currentHeightInCm + "cm tall!");
    }
}
```

Let's look into this code fragment in more detail:

### The if keyword

If a block of code should only be executed if a condition is `true`, we have to use the `if` statement.

```java
if (<CONDITION>) {
    <CODE TO EXECUTE>
}
```

`if` is a keyword of the java language we just have to learn.

### The Condition

The condition of an `if` statement has to be inside parentheses, e.g. `if (1 < 2)`. The CONDITION part has to be a boolean expression,
which we already told you about in chapter "3 - Operators" -> "Exercise 2: Operators on Boolean Types".

A boolean condition can have different forms:
- it can be a simple value: `true` or `false`
- a boolean variable
- a boolean expression

These three code snippets are valid:

```java
if (true) {
    System.out.println("The condition is true");
}
```

```java
boolean simpleBooleanVariable = false;

if (simpleBooleanVariable) {
    System.out.println("The condition is true");
}
```

```java
int variable = 10;

if (variable > 5 && variable < 10 || variable == 1) {
    System.out.println("The condition is true");
}
```

It is also possible to store the boolean expression in a variable first:
 
```java
int variable = 10;

boolean expression = variable > 5 && variable < 10 || variable == 1;

if (expression) {
    System.out.println("The condition is true");
}
```

### The Codeblock

The codeblock, which is encapsulated by curly brackets `{` and `}`, is only executed if the condition evaluates to true. It can itself contain further `if` statements for which the same rules apply.

Attention
{: .label .label-red }
If you add a semicolon directly after the `if` condition, nothing is executed even if the condition is true.
But all code directly after the semicolon is always executed.

E.g.:

```java
public class Attention {

    public static void main(String[] args) {
        
        boolean condition = false;

        if(condition); // This is mistake, but compiler won't tell you

        System.out.println("It does not matter if the condition evaluates to true or false: This text is always printed!");
    }
}
```

## else

If the condition does not evaluate to true, we can specify an alternative codeblock to execute. This is done with the `else` keyword.

Let's imagine we want to build a streaming platform. Depending on the age of the user we want to recommend different movies:

```java
public class StreamingPlatform {

    public static void main(String[] args) {
        
        int age = 16;

        if (age >= 18) {
            System.out.println("Recommended to watch: Mr. Robot, Fight Club, Sin City");        
        }
        else {
            System.out.println("Recommended to watch: How I met your mother, Community");
        }
    }
}
```

The optional `else` block is only executed when the `if` condition evaluates to false. In other words, either the `if` or the `else` block will be executed as they are mutually exclusive.

## else if

`if` and `else` statements can be chained to represent cascading conditions. For example, we may want to
modify the streaming platform application to recommend movies or series for teenagers.

This is possible with `else if`: we can specify another condition, which will be evaluated when the previous condition is false.
There is only one `if` and it must be the first. There can only be one `else`, which is optional. There can be one, multiple, or no `else if` in between the two. 

Note that only one codeblock will be executed: the first condition that evaluates to `true`, or the `else` codeblock if no condition evaluates to `true`.
 
```java
public class StreamingPlatform {

    public static void main(String[] args) {
        
        int age = 16;

        if (age >= 18) {
            System.out.println("Recommended to watch: Mr. Robot, Fight Club, Sin City");        
        }
        else if (age >= 16) {
            System.out.println("Recommended to watch: Joker, The Dark Knight, Zombieland: Double Tap");
        }
        else {
            System.out.println("Recommended to watch: How I met your mother, Community");
        }
    }
}
```

## Nested if statments

You can also nest if statements to check multiple things at once. Here's an example of a nested if statement to decide what clothes to wear based on the weather:

```java
public class Main {

    public static void main(String[] args) {

        boolean isRaining = true;
        boolean isCold = false;

        if (isRaining) {

            if (isCold) {
                System.out.println("Wear a jumper and jacket");
            } else {
                System.out.println("Wear a jacket");
            }

        } else {

            if (isCold) {
                System.out.println("Wear a jumper");
            } else {
                System.out.println("Wear a t-shirt");
            }

        }
    }
}
```

