---
title: "Programming Patterns with ArrayLists"
nav_order: 5
parent: 8 - ArrayLists
---

1. TOC
{:toc}

## Programming Patterns with ArrayLists

A programming pattern is a general, reusable solution to an often occuring problem.  
Thus given any programming exercise it is helpful to find out if such a pattern can be applied to solve the exercise (or some parts of it).

While working on the exercises with _ArrayList_ you may have already noticed some repeating patterns.

We will take a look at patterns you can use in combination with _ArrayList_ in this section.

Note that you do not need to only use each pattern for itself - it is of course possible (and often desirable) to combine these.

### Take a list, change all elements in it to a new value

A common scenario in programming:
* you are given a list of values 
* you should apply a specific operation to change each value
* and return a list with all these changed values

Examples would be
* you have a list of _String_ values and should return a list with all that _String_ values in lowercase (or in uppercase)
* you have a list of _int_ values and should return a list which each value multiplied by 2
* you have a list of _String_ values and should return a list of the length of each of those _String_ values
* the exercise for array lists _Truncate_ 

Here are two ways to implement this pattern in Java:

In this case, a new list is created for the changed values:
```java
public static ArrayList<String> mapValues(ArrayList<String> oldValues) {
    ArrayList<String> newValues = new ArrayList<String>();
    for(String value : oldValues) {
        String newValue = // here you would do your operation based on the oldValue, e.g. value.toUpperCase()
        newValues.add(newValue):
    }

    return newValues;
}
```

In this case, the values are changed directly in the same list:
```java
public static void mapValues(ArrayList<String> values) {
    for(int i = 0; i < values.size(); i++) {
        String newValue = // here you would do your operation based on the oldValue, e.g. value.toUpperCase()
        newValues.set(i, newValue);
    }
}
```

Note:
* both will work also with other types than _String_
* use the first approach if you need to change the type of your list elements (e.g. get a list of _String_ and return one of _Integer_), this cannot be done with the second approach
* use the first approach if you still need the original list in your program!
* we can of course pass more parameters to the method if we need them for computing the new values!

This pattern is also referred to as a **map** as you map every value to a new one (coming from the mathematical term of a mapping).

### Take a list, remove all elements that do not fulfill a certain criteria

A common scenario in programming:
* you are given a list of values
* you have a criteria for these values
* and return a list with only that values from the original list that fulfill that criteria

Examples would be
* you have a list of _String_ values and should return a list with all the _String_ values of a certain length
* you have a list of _int_ values and should return a list which only contains the odd numbers
* you have a list of _String_ values and should return a list of these values without any duplicates
* the exercise for array lists _Remove words too short_ 

Here is how to implement this pattern in Java:

```java
public static ArrayList<String> filterValues(ArrayList<String> oldValues) {
    ArrayList<String> newValues = new ArrayList<String>();
    for(String value : oldValues) {
        // here we define our condition based on value, e.g. value.length() > 10
        if( ... ) {
            newValues.add(value):
        }
    }

    return newValues;
}
```

If the condition depends also on the position of the element in the list, we should use the standard for loop
```java
public static ArrayList<String> filterValues(ArrayList<String> oldValues) {
    ArrayList<String> newValues = new ArrayList<String>();
    for(int i = 0; i < oldValues.size(); i++) {
        // here we define our condition based on value and/or index i, e.g. value.length() > 10 or i % 2 == 0 to keep only each second element
        if( ... ) {
            newValues.add(oldValues.get(i)):
        }
    }
    return newValues;
}
```

Note:
* both will work also with other types than _String_
* we can of course pass more parameters to the method if we need them for filtering
* we can combine this with the **map** pattern inside the same loop: we would then compute additionally a new value from the old value inside the _if_ statement and add that to the list
* we need to create a new list. You might think that you could use the _remove_ method but this is unsafe to use while you are looping over the list (as you basically jump over elements: you are at position 1 and remove that element - now all elements in the list shift one position to the left, so the element previously at position 2 is now at position 1 - and the next iteration of the loop will now continue at position 2, skipping that shifted element). There are some ways in Java to achieve a filtering without using a new list - but these need some additionaly Java features we have not yet discussed.

This pattern is also referred to as a **filter** as you get back a new list with not-matching elements being filtered out.

### Take a list, return one value

A common scenario in programming:
* you are given a list of values
* you take all these values and compute from them a single value
* and return that computed value

Examples would be
* you have a list of _String_ values and should return one _String_ which is all the values concatenated
* you have a list of _int_ values and should return their sum
* you have a list of _int_ values and should return their maximum or minimum
* you have a list of _String_ and should return the maximum length

Here is how to implement this pattern in Java:

```java
public static int reduceValues(ArrayList<Integer> values) {
    int result = 0;
    for(Integer value : values) {
        result = ... // here you add your logic to compute the new result using the current element, e.g. for a sum you would do result = result + value
    }

    return result;
}
```

If the result depends also on the position of the element in the list, we should use the standard for loop
```java
public static int reduceValues(ArrayList<Integer> values) {
    int result = 0;
    for(int i = 0; i < oldValues.size(); i++) {
        int value = oldValues.get(i);
        // here we sum, but before each value is multiplied with its index
        value = value * i;
        result = result + value;
    }
    return result;
}
```

Note:
* both will work also with other types than _Integer_
* you can also get a list of type A and compute a value of type B (e.g. get a list of _String_ and return one _Integer_) 
* we can of course pass more parameters to the method if we need them for the computation
* we can combine this with the **map** and/or the **filter** pattern inside the same loop
* it is of importance to choose a good initial value for our _result_ variable => this should be value you would expect to get if the list would be empty!

This pattern is also referred to as a **reduce** as you are reducing multiple values (the list elements) to one (the computed one).  
Another term for this is also **fold** 

### Read a specific number of input values from user

This is a special pattern for using _Scanner_ with _System.in_ to read inputs from user (so it is not so general as the others before but during your start tp programming you use ot quite often).

So you
* have an int variable containing the number of values you want to collect from the user
* want to collect exactly this amount of values from the user and use them later in your program

You can achieve that by combining _Scanner_ with a _for_ loop and an _ArrayList_:

```java
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = 5;
        ArrayList<String> words = new ArrayList<String>();

        for(int i = 0; i < numberOfInputs; i++) {
            words.add(scanner.next());
        }

        // continue your program: words contains the 5 words the user entered!
    }
}
```

### Read input values from user until a stop value

This is a special pattern for using _Scanner_ with _System.in_ to read inputs from user (so it is not so general as the others before but during your start tp programming you use ot quite often).

So you
* have a special input value signaling that user is done with providing values (e.g. by entering a -1 or stop)
* want to collect all values the user entered till the stop value and use them later in your program

You can achieve that by combining _Scanner_ with a _while_ loop and an _ArrayList_:

```java
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stopValue = -1;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int value = scanner.nextInt();
        while(value != stopValue) {
            numbers.add(value);
            value = scanner.nextInt();
        }

        // continue your program: numbers contains all entered values except the stop value
    }
}
```

## Comparison: _ArrayList_ methods vs _String_ methods

You may have noticed that there are are some similarities between what you can do with methods on _ArrayList_ and _String_.

This is not surprising as you can actually imagine a _String_ as a list of characters.

| **ArrayList** method | **String** method | Meaning |
| _add_       | _concat_ or _+_ operator | both add a new "element" to the end. However, for an _ArrayList_ the list itself is changed, while for _String_ a new one is created|
| _contains_ | _contains_ | we can check if a given value is contained in the list or a substring contained in the string |
| _get_ | _charAt_ | we get the element at the passed index of the list or the character at the given index of the string. In both cases, the indices start at 0 |
| _indexOf_ | _indexOf_ | we get the index of the first occurence of the element in the list or the first appearance of the given substring in the string. In both cases, -1 is returned if the value is not inside the list/string |
| _size_ | _length_ | we get the number of elements in the array or the length of the string (number of characters, whitespaces included) |