# Exercises: strings

## Write a program that counts how many `e`s and how many `u`s are in the following text

```text
Als Gregor Samsa eines Morgens aus unruhigen Träumen erwachte, 
fand er sich in seinem Bett zu einem ungeheueren Ungeziefer verwandelt.
```

To check you solution:
 
```text
there are 8 `u`s and 23 `e`s.
```

## Palindrome

Write a Java method which checks if a word is a palindrome. 

A palindrome is a word which you can read from both sides (from left to right or from right to left)
and you will get the same word.

Examples are: Ebbe, Anna, Kajak or Gag.

## Pick one of the exercises that you have not done yet and solve it

- Search for you method [here](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html) 
- Do not use the `Search` box on the website but the search of the browser.
- Read the explanation and how it is used
- Solve the exercise with that method

How to search for a word on a website:
 
1. Open the website.
2. Press `⌘Command + F (Mac)` or `Control + F` (PC).
3. Type the word you’re looking for.
4. Press Enter or Return.

### charAt(int index)

Write a method that prints the index and the character for a given word.

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

Write a method that reads two strings from the user and outputs them in lexicographical order.

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

Write a method that reads two strings from the user and outputs if one word is the suffix(last part) of the other.

```text
Input: 
Vanillepudding
pudding
Output: pudding is a suffix of Vanillepudding
```

### indexOf(String str)

Write a method that reads two strings from the user and outputs if one is a part of the other.

```text
Input: 
Vanillepuddingeis
pudding
Output: pudding is a part of Vanillepuddingeis
```

### replace(char oldChar, char newChar)

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

Write a method that reads two strings from the user and outputs if one word is the prefix(first part) of the other.

```text
Input: 
Vanillepudding
Vanille
Output: Vanille is a prefix of Vanillepudding
```

### substring(int beginIndex, int endIndex)

Write a method that reads a string and a number from the input and splits the given string at the index of the number.

```text
Input: 
Vanillepuddingeis
7
Output:
Vanille - puddingeis
```

### String.valueOf(int i) and Integer.parseInt()

Write a method that reads a string from the input, converts it to an integer, adds 10, converts it back to a String and prints it.

```text
Input: 2
Output: 12
```

### equals(Object anObject) and equalsIgnoreCase(String anotherString)

Write a method that reads two strings from the input and checks if they are equal or only equal with case ignored.

```text
Input:
Wirsing
wirsing
Output: 
Not equal but equal with case ignored.

Input:
Wirsing
Wirsing
Output: Equal

Input:
Wirsing
Vanillepudding
Output: Not equal
```