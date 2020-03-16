---
title: "Decision Statements"
nav_order: 2
parent: 4 - Decision Statements
---

# Decision Statements

## Simple if

As you hopefully already heard, we as programmers sometimes just want to execute a block of code, if a condition is true or false. 

E.g.: Let's go back to our first programming example where we wanted to find the height of the tallest person in our group.

For this example we had to do different things:

1. Getting the height (from a variable) of the person, who is the tallest person until now.
2. Get the height of the next person and compare this height with the height of the person, who is the tallest right now.
3. If the new value is bigger than the old value, the old value has to be replaced by the height of the new person.

In Java this sequence will look like this:

```java

public class HeighestPerson {

    public static void main(String[] args) {
        int currentHeightInCm = 185;
        int newHeightInCm = 187;        

        if(newHeightInCm > currentHeightInCm) {
            currentHeightInCm = newHeightInCm;
        }

        System.out.println("Right now the tallest person in the group is " + currentHeightInCm + "cm tall!");
    }
}
```

Let's break this code fragment apart:

### The three parts of an if-statement

#### The if-keyword

If a block of code shall only be executed if a condition is true we have to use the if-statement.

```java

if(<CONDITION IS TRUE>) {
    <CODE TO EXECUTE>
}
```

Here the if is a keyword of the java language we just have to learn.

#### The condition

The condition of an if-statement has to be inside round parentheses. The <CONDITION IS TRUE> part has to be a boolean expression, which we already told you about in chapter "3 - Operators" -> "Exercise 2: Operators on Boolean Types".
A boolean condition can have different forms:
- it can be a simple true
- a boolean variable
- an boolean expression

These three code snippets are valid:

```java
if(true) {
    System.out.println("The condition is true");
}
```

```java
boolean simpleBooleanVariable = false;

if(simpleBooleanVariable) {
    System.out.println("The condition is true");
}
```

```java
int variable = 10;

if(variable > 5 && variable < 10 || variable == 1) 
{
    System.out.println("The condition is true");
}
```

It is also possible to store the boolean expression in a variable first:
 
```java
int variable = 10;

boolean expression = variable > 5 && variable < 10 || variable == 1;

if(expression) 
{
    System.out.println("The condition is true");
}
```

#### The codeblock

The codeblock is only executed if the condition evaluates to true. The codeblock is encapsulated by the both curly parentheses "{" and "}". As the codeblock of the main-method the codeblock of an if statement can include the same statements. The codeblock itself can even include other if-statements. If the condition evaluates to true all statements in the codeblock will be executed!

Attention
{: .label .label-red }

If you add a semicolon directly after the if-condition nothing will be executed even if the condition is true. But all code directly after the semicolon will always be executed.
E.g.:

```java
public class Attention {

    public static void main(String[] args) {
        
        boolean condition = false;

        if(condition);

        System.out.println("It does not matter if the condition evaluates to true or false: This text will be printed always!");
    }
}
```

## else
If the condition does not evaluate to true, we can specify alternative codeblock to execute. This is done with the else-keyword.
Let's imagine we want to build an application similar to a streaming platform. Depending on the age of the user we want to recommend different movies:

```java
public class ContentServer {

    public static void main(String[] args) {
        
        int age = 16;

        if(age >= 18) {
            System.out.println("Recommended to watch: Mr. Robot, Fight Club, Sin City");        
        }
        else {
            System.out.println("Recommended to watch: How I met your mother, Community");
        }
    }
}
```

Similar to the if statement the else-block will be executed if the if condition evaluates to false. All statements in the block will be executed!

## else if

That is not bad alreay, but maybe we have to be more specific once in a while. E.g.: We also want to be able to recomment movies/series for teenagers.
Here the **else if** jumps in. With the else if we can specify an alternative code-block to the block beneath the if, but we can specify an additional condition:

```java
public class ContentServer {

    public static void main(String[] args) {
        
        int age = 16;

        if(age >= 18) {
            System.out.println("Recommended to watch: Mr. Robot, Fight Club, Sin City");        
        }
        else if(age >= 16) {
            System.out.println("Recommended to watch: Joker, The Dark Knight, Zombieland: Double Tap");
        }
        else {
            System.out.println("Recommended to watch: How I met your mother, Community");
        }
    }
}
```



