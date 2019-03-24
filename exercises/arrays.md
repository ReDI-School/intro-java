# Exercises: arrays

## Write a method that calculates the sum of the items

```java
public static int sumScores(ArrayList<Integer> scoreBoard) {
   //... your code goes here!
}
```

Example:

```text
Input: [1,4,7,3,6]
Output: 21
```

## Write a method that finds the highest integer in the list

```java
public static int getHighScore(ArrayList<Integer> scoreBoard) {
   //....
}
```

Example:

```text
Input: [1,4,7,3,6]
Output: 7
```

## Write a method that returns a new array that contains the elements of the input array in the reverse order

```java
public static ArrayList<Integer> reverseScores(ArrayList<Integer> scoreBoard) {
   //...
}
```

Example:

```text
Input: [1,4,7,3,6]
Output: [6,3,7,4,1]
```

## Remove words too short

- Let the user choose how many words they want to input
- Read that many words
- Let the user choose a number bigger than 0
- Remove all words from the ArrayList that are shorter than the given number

Example:

```text
Input:
4 // four words
Ananas
Zimtzitroneneis
Apple
Zartbitterschokolade
6 // remove all shorter than six

Output:
Zimtzitroneneis
Zartbitterschokolade
```

To implement the exercise, introduce a method with the following signature and implement it and use it inside `main`:

```java 
public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
	// Return a new ArrayList that the words of 'words' that have a length equal or more than `minLength`
}
```

*IMPORTANT*: make sure to return a new ArrayList instead of modifying the one passed as parameter.

## Truncate

- Let the user choose how many words they want to input
- Read that many words into an `ArrayList`
- Let the user choose another word
- Print the `ArrayList` truncated at the word the user provided

To implement the exercise, introduce a method with the following signature and implement it and use it inside `main`:

```java
public static ArrayList<String> truncateAfter(ArrayList<String> values, String x) {
	// Return a new ArrayList that contains what 'values'
	// contains up to a certain String, passed as 2nd parameter
	// Values after 'x', including 'x', should be discarded and not returned	
}
```

*IMPORTANT*: make sure to return a new ArrayList instead of modifying the one passed as parameter.

## Finding elements

Implement a method that finds the position of a `String` inside an `ArrayList<String>`. It shall return
the position of the element (where 0 means the 1st element, 1 the 2nd, and so on). In case the
element searched is not present in the `ArrayList`, the method shall return -1.

```java
public static int findValue(ArrayList<String> values, String x) {
    // Return the position of `x` inside `values`,
    // return -1 if `x` is not found
}
```

NOTE: this method actually exists and it's called `indexOf()`. A simpler method that
checks if an object is present in an `ArrayList` without returning its position,
but just returning a `boolean` also already exists and it's called `contains()`.

## Remove duplicates

Implement the following method and use it inside a `main` to show that it behaves as described:

```java
public static ArrayList<String> removeDuplicates(ArrayList<String> values) {
	// Return a new ArrayList that contains what 'values'
	// contains, with duplicate elements removed
}
```

*HINT*: reuse `findValue` implemented previously or use `indexOf()` or, better, `contains()`.

## Common values (intersection)

Implement the following method and use it inside a `main` to show that behaves as described:

```java
public static ArrayList<String> commonValues(
		ArrayList<String> values1,
		ArrayList<String> values2) {

	// Return a new ArrayList containing the elements that
	// are present both in 'values1' and 'values2', without duplicates
}
```

*HINT*: reuse methods defined so far.

## Union

Let's implement the `union` of two `ArrayList`s. The exercise is also about reusing existing methods.
Reuse as much as you can of what we've written so far, and what is also available from Java
[ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html).
The shorter the solution the better.

```java
public static ArrayList<String> union(
		ArrayList<String> values1,
		ArrayList<String> values2) {

	// Return the union of 'values1' and 'values2'
	// that is basically every element contained in
	// any of the two, without duplicates
}
```

## Word count

A common exercise is counting how many times a word occur in a set. For every unique word
in the set, you should print the number of occurrences:

```text
Input:
6 // number of words
hello
world
hello
germany
hello
berlin

Output:
hello, 3
world, 1
germany, 1
berlin, 1
```

*DIFFICULT*: implementing this exercise in just one method is difficult.
Try to split the problem in smaller ones and reuse existing methods instead.

*HINT*: define and implement first a `count` method and use it in the `wordCount` exercise above:

```java
public static int count(ArrayList<String> values, String x) {
    // Return how many times the string 'x' is present in 'values'
}
```

## Hangman

Let's implement a simple hangman game:

### 1. getLetterIndexes

Write a method `public static ArrayList<Integer> getLetterIndexes(String word, char letter)` which returns an ArrayList with all indexes where the `letter` appears in the word.

E.g.:
`For word "hello" and letter 'l' the method shall return an arraylist which contains [2, 3]`

### 2. uncoverLetters

Write a method `public static void changeLettersInArrayList(ArrayList<Character> currentWordList, ArrayList<Integer> indexPositions, Character newLetter)` which changes the current letter in the ArrayList `currentWordList` at the position `indexPositions` to the `newLetter`

## Implement the hangman

1. Give read a `word` from a user
2. Create an `ArrayList<Character> of length word.length with the Character '_'`
3. As long as the ArrayList created in 2. still contains dashes ('_') ask the user for an character
4. If the `word` contains the given character replace the dashes in the `ArrayList` by this character
5. Print the new `ArrayList`
6. If the `ArrayList` does not contain any dashes, write "You won the game" to the screen!

*Hint*
Use the methods from 1. and 2. for implementing the game
