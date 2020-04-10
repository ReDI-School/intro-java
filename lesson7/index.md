---
title: 7 - Strings
nav_order: 7
has_children: true
---

# A closer look at types in Java

# Strings

As you already learned Strings are different than primitive datatpypes (byte,short, int, long, float, double, char, boolean).

A string is a reference type or an object of the class **String**.

This means you can call built-in methods on a String using the dot syntax:
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

Common used methods of the String class are (note these are all instance methods aka non-static methods):

```java
/** returns the length of a string*/
public int length()

/** returns true if the string contains no character or whitescpae i.e. its length is 0 */
public boolean isEmpty()

/** returns a copy of the string to just upper case letters */
public String toUpperCase()

/** returns a copy of the string to just lower case letters */
public String toLowerCase()

/** compares two strings. Returns true if both strings are equal. */
public boolean equals(String otherString)

/** compares to strings but is not case-sensitive */
public boolean equalsIgnoreCase(String otherString)

/** returns true if the string contains the given substring */
public boolean contains(String substring)

/** returns true if the string starts with the given other string*/
public boolean startsWith(String otherString)

/** returns true if the string ends with the given other string*/
public boolean endsWith(String otherString)

/** returns the character at the given position of the string */
public char charAt(int index)

/** returns the index of (the start of) the first occurrence of the substring in the string. 
 *  it returns -1 of the substring is not contained in the string
 */
public int indexOf(String substring)

/** returns the index of (the start of) the first occurrence of the substring in the string after position
 *  it returns -1 of the substring is not contained in the string after position
 */
public int indexOf(String substring, int position)

/** returns a substring of the string which starts at the startIndex and ends at the endIndex */
public String substring(int startIndex, int endIndex)

/** returns a new string where each occurence of target is replaced by replacement*/
public String replace(String target, String replacement)

/** return an integer which is < 0 if the string is smaller than otherString, 0 if the strings are equal and > 0 if the 
string is bigger than otherString */
public int compareTo(String otherString)
```

For furher details or other methods please have a look at the [String-Reference](https://docs.oracle.com/javase/10/docs/api/java/lang/String.html).

Or check out the official Java tutorial about Strings at [String-Tutorial](https://docs.oracle.com/javase/tutorial/java/data/strings.html)

# 

Material:
- [Slides](https://drive.google.com/open?id=1V9Sqz18Fgq7cxAGw18B6Q0dSzI06ClctXZQHC5kqDnw)
