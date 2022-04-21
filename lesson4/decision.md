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

## Indentation and Formatting

Now that we've started writing our own code blocks (code within `{}` brackets) code formatting is important.


As you already know the java compiler does not care how much or how little white space you use in your code.
Like we discussed earlier you could write your code all on one line like this:

```java
public class Main {public static void main(String[] args) {System.out.println("Hello");}}
```

But writing code like that makes it hard for other people to read it. As humans we need things to be laid out in a way that is easy to understand visually. 

How you organise your code visually is known as <b>code formatting</b>. Most organisations have agreed on standards for how code should be formatted so that everyone formats their code in the same way. 

The two main aspects to code formatting are when to use whitespace (tab or space characters) and when to use new lines.

Indentation refers to how far your code is indented from the left margin (how much whitespace there is to the left of your code)

Here is some example code without proper formatting. Can you tell what value `i` has at the end of this code snippet?

```java
int i = 1;
if (true) {
i = 2;
if (false) {
i = 3;
i = 4;}
i = 5;}
```

Here is the same code formatted:

```java
int i = 1;
if (true) {
    i = 2;
    if (false) {
        i = 3;
        i = 4;
    }
    i = 5;
}
```

Notice how with the formatted code we can easily tell what lines of code are within each code block. This makes it easier to understand what the code does.

Some people are very passionate about code formatting, people argue about whether you should use tabs or spaces, whether you should indent your code with 2, 4, or 8 spaces, etc. Mostly these debates aren't very important as long as you are consistent in how you format your code.

For this course we recommend the following simple rules. These are also the default rules that Codeboard uses.

### Formatting Rules

When doing your homeworks try to keep to the following rules:

* When you open a `{` all code should be indented by 1 tab or 4 spaces until the closing `}`.
e.g.

```java
if (true) {
    System.out.println("The line I am on is indented by 4 spaces");    
}
```

* When you have nested brackets (i.e. when you have another set of `{}` brackets within the first `{}` brackets), the code inside this second set of brackets should be indented by <i>another</i> 4 spaces (total 8 spaces).

```java
if (true) {
    System.out.println("The line I am on is indented by 4 spaces");
    if (true) {
        System.out.println("The line I am on is indented by 8 spaces");
    }
    System.out.println("I am outside the second if block so the line I am on is only indented by 4 spaces");
}
```

* You should follow the same pattern for each subsequent set of `{}`
e.g.

```java

if (true) {
    System.out.println("The line I am on is indented by 4 spaces");
    if (true) {
        System.out.println("The line I am on is indented by 8 spaces");
        if (true) {
            System.out.println("The line I am on is indented by 12 spaces");
        }
    }
}
```

* Whenever you have a closing `}` bracket it should go on a new line by itself. This makes it easier to see where a code block ends.
e.g.

```java

if (true) {
    System.out.println("This is wrong!");} // Don't do this!

if (true) {
    System.out.println("This is correct!");
} // Do this
```


* Note that the code we write in the main method is already inside two sets of `{}` brackets, so our starting indentation is 8 spaces:

```java

public class Main { // This line is fully on the left 
    public static void main(String[] args) { // This line is indented 4 spaces 
        System.out.println("hello"); // Our code starts off indented 8 spaces 
    }
}

```

 


