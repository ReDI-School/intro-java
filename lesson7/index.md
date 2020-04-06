---
title: 7 - Strings
nav_order: 7
has_children: true
---

# Strings

As you already learned Strings are different than primitive datatpypes (byte,short, int, long, float, double, char, boolean).

A string is a reference type or an object of the class **String**.

This means you can call methods on a string.

Common used methods of the string class are:

```java
/** returns the length of a string*/
public int length()

/** converts a string to just upper case letters */
public String toUpperCase()

/** compares two strings. Returns true if both strings are equal. */
public boolean equals(String otherString)

/** compares to strings but is not case-sensitive */
public boolean equalsIgnoreCase(String otherString)

/** returns true if the string contais the given substring */
public boolean contains(String substring)

/** returns the character at the given position of the string */
public char charAt(int index)

/** returns a substring of the string which starts at the startIndex and has a length which is specified by length */
public String substring(int startIndex, int length)

/** return an integer which is < 0 if the string is smaller than otherString, 0 if the strings are equal and > 0 if the 
string is bigger than otherString */
public int compareTo(String otherString)
```

For furher details or other methods please have a look at the [String-Reference](https://docs.oracle.com/javase/10/docs/api/java/lang/String.html).

```java
public class StringExamples {

    public static void main(String[] args) {

        String exampleString = "Hello world!";
        // A method of a String can be called by connecting the variable with a dot and the name of the method. E.g.:

        int stringLength = exampleString.length();

        // Prints: The length of the string 'Hello world!' is 12 characters!
        System.out.println("The length of the string '" + exampleString + "' is " + stringLength + " characters!");

        // The string can also be accessed directly
        char firstCharacter = "Lorem ipsum".charAt(0);

        System.out.println("The first character of the string 'Lorem ipsum is: '" + firstCharacter + "'!");
    }
}
```


Material:
- [Slides](https://drive.google.com/open?id=1V9Sqz18Fgq7cxAGw18B6Q0dSzI06ClctXZQHC5kqDnw)
