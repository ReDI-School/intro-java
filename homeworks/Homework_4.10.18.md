# Homework

## 1. Write a program that counts how many `e`s and how many `u`s are in the following text:
```
Als Gregor Samsa eines Morgens aus unruhigen Träumen erwachte, 
fand er sich in seinem Bett zu einem ungeheueren Ungeziefer verwandelt.
```
<details>
<summary>Spoiler</summary><p>
 There are 8 * u and 23 * e.
</p></details>

<hr/>

## 2. Pick one of the exrcises that you have not done yet and solve it:

- Read the explanation of the method here: https://docs.oracle.com/javase/9/docs/api/java/lang/String.html
- Solve the exercise with that method


### 1. charAt(int index)
Write a method that prints the index and the character for a given word.
```
Input: Hello
Output:
Index: 0, Character: H
Index: 1, Character: e
Index: 2, Character: l
Index: 3, Character: l
Index: 4, Character: o
```

### 2. compareTo(String anotherString)
Write a method that reads two strings from the user and outputs them in lexicographical order.
```
Input:
Banane
Ananas
Output: Ananas, Banane
Input:
Vanillepudding
Wirsing
Output: Vanillepudding, Wirsing
```
### 3. endsWith(String suffix)
Write a method that reads two strings from the user and outputs if one word is the suffix(last part) of the other.
```
Input: 
Vanillepudding
pudding
Output: pudding is a suffix of Vanillepudding
```
### 4. indexOf(String str)
Write a method that reads two strings from the user and outputs if one is a part of the other.
```
Input: 
Vanillepuddingeis
pudding
Output: pudding is a part of Vanillepuddingeis
```
### 5. replace(char oldChar, char newChar)
Use the replace method to decipher this string `lala#lwve#-rwgra22lalang!#<3`
The code is:


Code|Letter
----|------
`w` | `o`
`#` | ` ` (space)
`2` | `m`
`lala` | `i`
`-` | `p`


### 6. startsWith(String prefix)
Write a method that reads two strings from the user and outputs if one word is the prefix(first part) of the other.
```
Input: 
Vanillepudding
Vanille
Output: Vanille is a prefix of Vanillepudding
```
### 7. substring(int beginIndex, int endIndex)
Write a method that reads a string and a number from the input and splits the given string at the index of the number.
```
Input: 
Vanillepuddingeis
7
Output:
Vanille - puddingeis
```
### 8. String.valueOf(int i) and Integer.parseInt()
Write a method that reads a string from the input, converts it to an integer, adds 10, converts it back to a String and prints it.
```
Input: 2
Output: 12
```



### 9.  equals(String anotherString) and equalsIgnoreCase(String anotherString)
Write a method that reads two strings from the input and checks if they are equal or only equal with case ignored.
```
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




