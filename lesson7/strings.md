---
title: "Exercises: Strings"
nav_order: 1
parent: 7 - Strings
---

# Exercises: Strings

## Looking at the Java reference documentation

A reference is a technical documentation that explain all the capabilities available in a class or in a library.
This exists also for every Java class.

- Google for `java string reference` to find the reference documentation of the `String` class
  or visit [](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html).
- Try to find a method that does what you need, if it exists.
- Do not use the `Search` box on the website but the search of the browser.
- Read the explanation and how it is used.
- Use this information to solve the following exercises.

### charAt(int index)

Write a program that prints the index and the character for a given word.

```text
Input: Hello
Output:
Index: 0, Character: H
Index: 1, Character: e
Index: 2, Character: l
Index: 3, Character: l
Index: 4, Character: o
```

### compareTo(String anotherString)

Write a program that reads two strings from the user and outputs them in lexicographical order.

```text
Input:
Banane
Ananas
Output: Ananas, Banane

Input:
Vanillepudding
Wirsing
Output: Vanillepudding, Wirsing
```

### endsWith(String suffix)

Write a program that reads two strings from the user and outputs if one word is the suffix (last part) of the other.

```text
Input:
Vanillepudding
pudding
Output: pudding is a suffix of Vanillepudding
```

### contains(String str)

Write a program that reads two strings from the user and outputs if one is a part of the other.

```text
Input:
Vanillepuddingeis
pudding
Output: pudding is a part of Vanillepuddingeis
```

### replace(char oldChar, char newChar) and replace(String target, String replacement)

Use the replace method to decipher this string `lala#lwve#-rwgra22lalang!#<3`

The code is:

 Code  | Letter
-------|------
`w`    | `o`
`#`    | ` ` (space)
`2`    | `m`
`lala` | `i`
`-`    | `p`

### startsWith(String prefix)

Write a program that reads two strings from the user and outputs if one word is the prefix (first part) of the other.

```text
Input:
Vanillepudding
Vanille
Output: Vanille is a prefix of Vanillepudding
```

### substring(int beginIndex, int endIndex)

Write a program that reads a string and a number from the input and splits the given string at the index of the number.

```text
Input:
Vanillepuddingeis
7
Output:
Vanille - puddingeis
```

### String.valueOf(int i) and Integer.parseInt()

Write a program that reads a string from the input, converts it to an integer, adds 10, converts it back to a String and prints it.

```text
Input: 2
Output: 12
```

### equals(Object anObject) and equalsIgnoreCase(String anotherString)

Write a program that reads two strings from the input and checks if they are equal or only equal with case ignored.

```text
Input:
Wirsing
Wirsing
Output: Equal

Input:
Wirsing
wirsing
Output: Not equal but equal with case ignored

Input:
Wirsing
Vanillepudding
Output: Not equal
```

## Counting characters

Write a program that counts how many 'e's and how many 'u's are in the following text:

```text
Als Gregor Samsa eines Morgens aus unruhigen Träumen erwachte,
fand er sich in seinem Bett zu einem ungeheueren Ungeziefer verwandelt.
```

To check you solution:

```text
There are 23 'e's and 7 'u's.
```

*NOTE*: uppercase and lowercase characters are different characters.

As a bonus modify the program to print how many times each letter appears in the text.

For example given:
```text
mississippi
```

The output would be:

```text
m occurring 1 times
i occurring 4 times
s occurring 4 times
p occurring 2 times
```

*Think*: How to show the occurance of each letter only once?

## Reverse

Write a method that reverses a string.

Examples:

- `java` -> `avaj`
- `Hello world` --> `dlrow olleH`
- `ReDI is a great school!` -> `!loohcs taerg a si IDeR`

*HINT*: create an empty string, fill it and return it.

## Palindrome

Write a method which checks if a word is a palindrome.

A palindrome is a word which you can read from both sides (from left to right or from right to left)
and you will get the same word.

Examples are: `Ebbe`, `Anna`, `Kajak` or `Gag`.

*NOTE*: the uppercase and lowercase characters should be considered the same character,
        otherwise the method doesn't work with words starting uppercase.

## Secret messages

We need a program to decode secret messages. Our messages are kept secret by a simple [substitution cipher](https://en.wikipedia.org/wiki/Substitution_cipher). A substitution cipher is when we change certain letters with other letters. The know recorded use of a substitution cipher was as early as the Roman empire.

For example if out substitution cipher replaces each letter of the alphabet with the letter that follows that letter in the alphabet a message like:

```
HELLOWORLD
```

Would be encoded in our secret code as:

```
IFMMPXPSME
```

Because `I` follows `H`, `F` follows `E` and so on. In a special case `Z` is followed by `A`.

Our program with deal with messages written in capital letters of English alphabet (A through Z) and words without spaces and punctuation marks. So if the user provided `SFEJKBWB` as input the output should be `REDIJAVA`.

*HINT*:
 * Remember for loops
 * Remember methods on String like length and charAt
 * Remember that we can concatenate Strings with Strings and how Strings win when we try to concatenate Strings with non-Strings

As a bonus:
 * Research ASCII table
 * Try to figure out why `'I'- 1` gives us `'H'`

