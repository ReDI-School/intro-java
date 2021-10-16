---
title: 8 - ArrayLists
nav_order: 8
has_children: true
---

# ArrayLists

## Why ArrayLists
Let us imagine we want to build a multiplayer game and we need to store the points of each player. 

How would we realize this task until now?

Probably we would create a variable for each player who wants to play the game:

```java
public class Game {
    public static void main(String[] args) {
        int playerOneScore = 100;
        int playerTwoScore = 250;
        int playerThreeScore = 50;  
        int playerFourScore = 200;
        int playerFiveScore = 150;

        ...    
    }
}

```

## Problems with this approach

What could be the problems with this approach?

- The number of players are static which means we would have to change the code if more or less players want to join the game.
- Adding, changing, reading points or just printing the highscore would make the implementation of this game quite complicated.
- Imagine the game shall be able to be played by 1000 or even more players. That would be a lot of typing!

For problems like this Java has a feature / data structure for us. It is called: (Array-)List.

## ArrayLists

ArrayLists are used quite a bit in the programmers world.
They are useful if we want to store a collection of variables of the same datatype.

Examples for the use of ArrayLists are:
- A timeline as they exist on different social media platforms like Facebook
- A list of comments
- the content of a shopping cart as they exist in various webshops
- ...

As you can see there are different use cases for ArrayLists.

### Using an ArrayList

As we already did with the Scanner, we also need to tell Java, where the ArrayList is located:

```java
import java.util.ArrayList;
```
### Creating an ArrayList

An ArrayList can be created like this:

```java
ArrayList<Integer> highSchores = new ArrayList<Integer>();
```

Additionally specifying that we want to store an ArrayList in the variable highScores we also need to specify the DataType of the elements the ArrayList shall store. This is done via these brackets: "<" and ">". In between these brackets we can specify the datatype. The DataType must be a ReferenceType and not a primitive DataType.

If we want to store elements in the ArrayList which are primitive DataTypes, we have to use their reference type representation:

| primitive datatype        | replacement          |
|:--------------------------|:---------------------|
| byte                      | Byte                 |
| short                     | Short                |
| int                       | Integer              |
| long                      | Long                 |
| float                     | Float                |
| double                    | Double               |
| char                      | Character            |
| boolean                   | Boolean              |

An ArrayList can also store elements of other ReferenceTypes like **String** or other classes.

### Adding elements to an Arraylist

During the runtime of the program elements can be added to the ArrayList. The elements which shall be added to the ArrayList need to be of the same datatype as specified when creating the ArrayList:

```java
public static void main(String[] args) {
    ArrayList<Integer> highSchores = new ArrayList<Integer>();

    highSchores.add(100);
    highSchores.add(250);
    highSchores.add(50);
    highSchores.add(200);
    highSchores.add(150);
}
```

This can also be done dynamically for example by getting input from the user.

### Getting values from the ArrayList at a given position

It is also possible to get a value stored in the ArrayList at a given position. This can be achieved by executing the method **get** on the ArrayList variable: 

```java
public static void main(String[] args) {
    ArrayList<Integer> highSchores = new ArrayList<Integer>();

    //...

    int firstScore = highSchores.get(0);
}
```
Attention:
{: .label .label-red }
For this we need to understand how ArrayLists work. The  elements of ArrayLists are accessed via an index. The index of the first element is 0. The index for the last element is n - 1 when n is the number of elements stored in the list.

Example: ArrayList with n = 10 elements

```java
                   |------- last element at index = n - 1 = 9
                   V
[0|1|2|3|4|5|6|7|8|9]
<----- n = 10 ----->
```

The indexes are like pointers to the values stored at the position which is specified by the index.

So if we look at the highScores example the value of the array at **index 0 is 100, at index 1 is 250, at index 2 is 50, at index 3 is 200 and at index 4 is 150**.

### Iterating over the elements of the ArrayList

Now you may also understand why the i in a for loop is often initialized with 0. If we want to iterate over every element of an ArrayList we have to start at index 0 and end at the index of n - 1 where n is the number of elements existing in the ArrayList. Iterating means going over every element. So we could print the value of every item in the ArrayList.

We can get the number of elements in the ArrayList by calling the method size on the ArrayList variable.

Printing all elements of an ArrayList would look like this:

```java
for (int i = 0; i < highSchores.size(); i++) {
    System.out.println(highSchores.get(i));
}
``` 

Printing the highScores could be done like this:

```java
System.out.println("Highscore:");
System.out.println("-----------");
for (int i = 0; i < highSchores.size(); i++) {

    int currentScore = highSchores.get(i);
    System.out.println("Score of player " + i + ": " + currentScore);
}
```

However, as it is such a common thing to iterate over all elements of an ArrayList, there exists a special loop syntax for that:
```java
for (Integer score : highScores) {
    System.out.println(score);
}
``` 
This is also called a **for each** loop as we do one iteration for each element of the ArrayList.  
Here the element of the iteration is then assigned to the variable _score_ (note that as it is a variable you can name it like you want).  
Note: this loop syntax can only be used if you only need the array elements but not their indices.


### Changing a value of the ArrayList

A value of an element in an ArrayList can be changed by executing the set method on the ArrayList instance. This method expects the index as the first and the value as the second parameter. For changing the value of the ArrayList you have to keep in mind that you access the first element via index 0 and the last element via the index n -1 when n is the number of elements in the ArrayList.

```java
// Setting the value at the first position of the ArrayList to 150.
highSchores.set(0, 150);
``` 

### Adding a value to ArrayList at a specific position

We have seen that we can use _add_ to add an element to an ArrayList.  
However, the new element is always added to the end of the list.

There exists a second version of _add_ that allows you to add a new element to a specific position.

```java
public static void main(String[] args) {
    ArrayList<Integer> highSchores = new ArrayList<Integer>();

    highSchores.add(100);
    highSchores.add(250);
    highSchores.add(50);
    
    /* 
    * now our arraylist is: [100, 250, 50]
    */

    // we add a new element add the second position, i.e. at index 1
    highSchores.add(1, 42);

    /* 
    * now our arraylist is: [100, 42, 250, 50]
    */
}
```

As you can see, the first parameter is the index, the second the new element.

### Removing a value from an ArrayList

You can remove an element from an ArrayList by using the _remove_ method. You give it an int: to specify at which position to delete:

```java
public static void main(String[] args) {
    ArrayList<Integer> highSchores = new ArrayList<Integer>();

    highSchores.add(100);
    highSchores.add(250);
    highSchores.add(50);
    
    /* 
    * now our arraylist is: [100, 250, 50]
    */

    // we remove the element at the second position, i.e. at index 1
    highSchores.remove(1);

    /* 
    * now our arraylist is: [100, 50]
    */
}
```

### Finding an element in an ArrayList

What you often need to do is to find out if a given value exists in an ArrayList (or where it exists).

You can use the _contains_ method which returns a _boolean_ to tell you if a value exists in a given list.  
You can use the _indexOf_ method which returns the index of the **first** occurrence of the value in the list or _-1_ if the value is not in the list

```java
public static void main(String[] args) {
    ArrayList<Integer> highSchores = new ArrayList<Integer>();

    highSchores.add(100);
    highSchores.add(250);
    highSchores.add(50);
    
    /* 
    * now our arraylist is: [100, 250, 50]
    */

    // prints true
    System.out.println(highSchores.contains(50));
    // prints false
    System.out.println(highSchores.contains(51));

    // prints 2 (the index of 50 in the list)
    System.out.println(highSchores.indexOf(50));
    // prints -1 (as value is not in list)
    System.out.println(highSchores.indexOf(51));
}
```

Material:
- [Slides](https://drive.google.com/open?id=1gf6QiQvlA1pWD6MYK2de8SMxeQDVXxv72w51gUrUdTQ)
