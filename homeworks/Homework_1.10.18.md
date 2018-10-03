# Homework


#### Dec2Bin
Write a method that prints a given decimal numer in binary form.
```
input:  42
output: 101010
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
3. (DIFFICULT / EXTRA) Give the user the possibility to use the last result as one of the values in the next calculation.
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



### Fibonacci (DIFFICULT / EXTRA)
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

