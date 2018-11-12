# Address book

We want to write an address book for the following characters: 

Name | Number
-----|-------
Tommy Shelby|+44 017462763
Charlotte Ritter|+49 0375274032
Perry Rhodan | +1 334873822

You are going to implement it in differnt ways:

## Address book with if statements

Write a method getNumber that accepts a name `string` and returns the telephone number of that person. If the person does not exist we return the number of a german telephone information `+49 11 88 0`
Use: 
- if
- else
- string comparison


## Address book with normal arrays and normal loops
## Address book with ArrayList and foreach
## Moving to Object Oriented Programming (Address book as a class)
Right now we have written all our code in the main class and the main method. That is fine for very small projects but in real programs we want to have as little logic as possible in the main class and method. Thefore we should write a class that abstracts the written logic for us.

Let's identify what the program does so far and how it translates to methods:
<details>
  <summary>Solution</summary>
  
- add a contact => `void addContact(TelephoneEntry)`
- get a number via a name => `String getNumber(String name)`
</details>

What attributes do we need: 
<details>
  <summary>Solution</summary>
- `ArrayList<TelephoneEntry> entries`
</details>



Should the scanner be a attribute too?
<details>
  <summary>Solution</summary>
  No every class (and every method) should only deal with exactly one thing. Our class allready deals with storing data, therefore it should not care about where the data comes from.
</details>


Implement the class and write some code in the main method to check if your code is correct.


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







