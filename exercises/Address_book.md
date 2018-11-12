# Address book

We want to write an address book for the following characters: 

Name | Number
-----|-------
Tommy Shelby|+44 017462763
Charlotte Ritter|+49 0375274032
Perry Rhodan | +1 334873822

You are going to implement it in differnt ways:

## Address book with if statements

* Use Scanner to take in a name
* Use if statements to print out
   * 0845 50 50 50 if the name is "Aaron"
   * 00 49 12345 if the name is "Fred"
   * 00 49 11111 if the name is "Jonas"
* Add another name and number to our program
* And then add another
* And then another

<details>
  <summary>Solution</summary>
	
```java
package com.redi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if(name.equalsIgnoreCase("Aaron")) {
            System.out.println("0845 50 50 50");
        } else if(name.equalsIgnoreCase("Fred")) {
            System.out.println("00 49 5000");
        } else if(name.equalsIgnoreCase("Jonas")) {
            System.out.println("666");
        }
	// ADD MORE!

    }
}
```
</details>

## Address book with normal arrays and normal loops

* Create a normal array that stores three names as `String`s
* Create a normal array that stores three numbers as `String`s
* Use Scanner to take in a name
* Use a `for` loop to loop over the names array
  * If the name in the array equals what you found from `Scanner` then print that out

## Address book with ArrayList

* Do as above, but with `ArrayList` instead of normal arrays

## Address book with ArrayList and forEach

* Do as above, but with a for each loop instead of a normal for loop.

## Address book with Entry object

* Replace the two arrays with one array
* Instead of using Strings use an `TelephoneEntry` class. 
  * This class should have a constructor that takes in a name and number.
* Ensure the program works as above.

## Address book with Maps instead of loops
To get a feeling of the speed of a method it is often a good idea to count how many statements are executed for a given input (this is called big-o-notation).

How many statements are executed in this code we have written:

```java
String getNumber(String name){
    for(TelephoneEntry entry : entries){
    	if(entry.name.equalsIgnoreCase(name)){
    		return entry.number;
    	}
    }
}
```

<details>
  <summary>Solution</summary>
	If the name we are seaching for is at the end of the list we are have to search the complete list. Right now this is not so bad because we only have a few entries but if we want to do a phone book for all germans it might get slow.
</details>

An Array or ArrayList maps from an integer to an value. It would be nicer if we could directly map from a string to a value. This mapping between two objects is called key-value-pair.  
In Java we can use a **Map** to express exactly that:

To create a new map that maps from String Keys to String Values:

```java
Map<String,String> hm = new HashMap<>(); 
```

How would a map creation look like that maps from Intgers to Booleans?
<details>
  <summary>Solution</summary>
  
```java
Map<Integer,Boolean> hm = new HashMap<>(); 
```
</details>

To add an entry:

```java
map.put("Jonas","666");  
```
 
To get an value by key:

```java
String number = map.get("Jonas");  
```

Rewrite the AddessBook class with a map instead of an array.







