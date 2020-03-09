---
title: "Exercises: Decision Statements"
nav_order: 3
parent: 4 - Input + Decision
---

# Exercises: Decision Statements

The following exercises shall be used to practice the knowledge about decision statements to improve the understanding of this concept.

Please do the following exercises. Feel free to discuss your solutions with your neighbours.

Write the things you found out down to share them later with the class.

## Exercise 1

```java
public class Exercise {

    public static void main(String[] args) {

        System.out.println("This is printed before the if statement");
         
        if (true) {
            System.out.println("The condition is true.");
        }

        System.out.println("This is printed after the if statement");
    }
}
```

What do you need to change so that the sentence **"The condition is true."** is not printed.

## Exercise 2

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

Look at the program above, which is a part of the program we used to introduce programming in the first lesson
to find the height of the tallest person in our group. Change the codeblock above so that the user
is asked for the height of the next person.

Hint: use the `Scanner` to get user input.

## Exercise 3

Write a small program, which asks the user for their family name and their gender.

Print the options to the screen.
1 -> male
2 -> female

Depending on the user input, print to the screen:

**"Hello Lady FAMILY NAME"** or **"Hello Mister FAMILY NAME"**

**FAMILY NAME** should be replaced by the given name of the user.

The output should look similar to this:

```text
Dear lovely user: Please tell me your family name
Müller
Are you male or female?
1 -> male
2 -> female
2
Hello Lady Müller
```

Bonus: If you want you can add an option if the user does not want to tell their gender!

## Exercise 4

Write a small calculator!

- Ask the user for 2 numbers
- Ask the user for an operation. (Similar to Exercise 3: 1 -> +, 2 -> -, 3 -> *, 4 -> /)
- Execute the operation with the two numbers and print the result to the screen!

The output could look similar to this:

```text
4.2
6.7
Please specify an operation: 
1 -> +
2 -> -
3 -> *
4 -> /
3
Result of 4.2 * 6.7 is 28.14
```

It is enough if you just print the result without the infotext. The infotext is an additional challenge!
