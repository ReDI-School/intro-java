## If & Loops

### Stars

#### Line
Write a program that, given a number as input, prints a line with that many stars.
```
input: 4
output: * * * *
```
Change your program so that it accepts two numbers and prints a square of stars.
```
input: 4
input: 3
output: 
* * * *
* * * *
* * * *
```

#### Triangle
Write a program that, given a number as input, prints a triangle with that many stars.
```
input: 4
output: 
* * * *
* * *
* *
*
```

### Multiply
1. Read a number with Scanner, `multiplicand`
2. Create a method `printMuliply` which prints multiplication based on 2 input arguments, eg. `printMultiply(2,8);` would print  `2 x 8 = 16` on the console.
3. Call the above method from a loop and print the times table of the multiplicand, multiples of it from 1 to 10

```
Input: 2
Output:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

5. EXTRA create a new method `getMultiplyString` which returns the above line, like `2 x 8 = 16` without printing it, and change the main to use this method and have the same output as above

### Fizzbuzz
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

### Loops and Math

#### Dec2Bin
Write a method that prints a given decimal numer in binary form.
```
input: 42
output: 101010
```
Decimal to binary conversion:
- Calculate `decimal_number / 2` and save the remainder for later
    - The remainder is calculated with `%` (modulo) 
- The result is your new decimal_number
- Redo until `decimal_number == 0`
- The reverse of all remainders is the binary number
Example:
```
decimal_number = 42

42 % 2 = 0
21 % 2 = 1
10 % 2 = 0
 5 % 2 = 1
 2 % 2 = 0
 1 % 2 = 1
 0 
 
 binary_number = 101010
```
#### Intervallhalbierungsverfahren or Bisection method
Write a method that calculates the square root of a given numer by using the bisection method.
```
Input: 9
Output:
Iteration 1: mid=5 5*5=25 error=16
Iteration 2: mid=3 3*3=9 error=0
```

#### Calculator
Write a program that emulates a calculator. 
It should support:
- ```+``` (addition)
- ```-``` (subtraction)
- ```*``` (multiplication)
- ```/``` (division)

It accepts the operants and the operation on multiple lines.
```
Input:
3
*
2
Output: 3 * 2 = 6
```
Hint:
```Java
// String comparison works like this:
Scanner scanner = new Scanner(System.in);
String a = scanner.next();

if(a.equals("hello")){
    System.out.println("Are equal");
}

if("hello".equals(a)){
    System.out.println("Are equal");
}
```
More features: 
1. Add looping to the calculator. Instead of exiting after the calculation it should ask the user if they want to continue or quit. If the user enters `quit` the program stops. 
2. Handle division by zero. As you might have noticed an input of ```2/0``` crashes the program. Handle that case.
3. (EXTRA/HARDER) Give the user the possibility to use the last result as one of the values in the next calculation.
```
Input:
3
*
2
Output: 3 * 2 = 6
Input:
last
*
2
Output: 12
```
Hint: 
```Java
// How to convert a string to an integer
String a = "42";
int b = Integer.parseInt(a);
```



## Recursion

### Fibonacci
Write a method that, given an input n, calculates the first n numbers of the fibonacci sequence.
The fibonacci sequence is defines as: 
```
fib(1) = 1
fib(2) = 1
fib(n) = f(n-1) + f(n-2)
```
Or in human language:
The nth fibonacci numer is the sum of the previous and the number before the previous one.
The first and second fibonacci numers are defined as `1`.
Example:
```
Fibonacci numbers: 1,1,2,3,5,8,13,21,34,...
To calculate the 5th fibonacci number we need the 3rd and 4th number.
To calculate the 4th fibonacci number we need the 3rd and 2nd number.
To calculate the 3rd fibonacci number we need the 2nd and 1st number.

The 1st number is 1 and 2nd number is 1. Thefore the 3rd number is 1+1=2
The 2nd number is 1 and 3rd number is 2. Thefore the 4th number is 1+2=3
The 3rd number is 2 and 4th number is 3. Thefore the 5th number is 2+3=5
```

You can solve this iterative (with a for loop) or recursive (without loops).
A nice tutorial about recursion: https://www.geeksforgeeks.org/recursion/


### Towers of hanoi
Write a program that solves the towers of hanoi game.

## Projects

### Text adventure
Write a text adventure game. If you need inspiration ask ssomebody with a mac to run this line in the terminal:

```emacs -batch -l dunnet```


## Arrays

### Tower hopping
### longest reoccurring character
### Find 
### Sort



