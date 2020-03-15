---
title: "Decision Statements"
nav_order: 2
parent: 4 - Input + Decision
---

# Decision Statements

## Simple if

Sometimes there's the need to execute (or not) a block of code conditionally, depending if a condition is `true` or `false`. 

Let's go back to our first programming example where we wanted to find the height of the tallest person in our group.

For this example we had to do different things:

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

Let's break this code fragment apart:

### The if-keyword

If a block of code shall only be executed if a condition is `true` we have to use the `if`-statement.

```java
if (<CONDITION>) {
    <CODE TO EXECUTE>
}
```

`if` is a keyword of the java language we just have to learn.

### The Condition

The condition of an `if`-statement has to be inside round parentheses. The <CONDITION> part has to be a boolean expression,
which we already told you about in chapter "3 - Operators" -> "Exercise 2: Operators on Boolean Types".

A boolean condition can have different forms:
- it can be a simple value: `true` or `false`
- a boolean variable
- an boolean expression

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

The codeblock is only executed if the condition evaluates to true. The codeblock is encapsulated by the both curly
parentheses `{` and `}`. As the codeblock of the main-method, the codeblock of an `if` statement can include the same statements.
The codeblock itself can even include other `if`-statements. If the condition evaluates to true, all statements in the
codeblock are executed.

Attention
{: .label .label-red }

If you add a semicolon directly after the `if`-condition, nothing is executed even if the condition is true.
But all code directly after the semicolon is always be executed.

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

If the condition does not evaluate to true, we can specify alternative codeblock to execute. This is done with the `else`-keyword.

Let's imagine we want to build an application similar to a streaming platform.
Depending on the age of the user we want to recommend different movies:

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

Similar to the `if` statement, the `else`-block is be executed if the condition evaluates to false.
All statements in the block are executed.

## else if

`if` and `else` statements can be chained to represent cascading conditions. For example, we may want to
modify the previous streaming platform application to recommend movies or series for teenagers.

This is possible with `else if`: we can specify a codeblock alternative to the first block, but we can specify an additional condition:
There is only one `if` and it must be the first. There can be only one `else`, as it's optional, but if it's there
it must be the last one. And there can be one, or more, or none, `else if` in between the two.
 
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
