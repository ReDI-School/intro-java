# Answers

1. Long

width minimum maximum 

byte: 8 bit -128 +127 

short: 16 bit -32.768 +32.767 

int: 32 bit -2.147.483.648 +2.147.483.647 

long: 64 bit -9.223.372.036.854.775.808 +9.223.372.036.854.775.807


2. char is preferable. A String could be used too.
3. Yes. int can store negative and positive values within this range.
4. byte can hold values up to 127, so is the best choice when we know the value will never go above 99. Can use short and int and long also
5. False
6. False. There is a list of words we cannot use
7. False. We can use numbers after the first character
8. “True”
9. In the if statement the variable should be number with a small n
10. Should be:
  - `char letter = ‘a’`  (single quotes are used for char)
  - `boolean returned = true` (return is on the list of words we cannot use for a variable name)
11. It will print: `A\B\C`
12. It will print:
```
A
"B"
```

13.   It will print `True`
14.   It will print `True`
15.   It will print `We are a match.`
16.   It will print:
```
1
Hello!
2
```

17.  It will print “I am Angela”
18.  It will print “true”
19.  It will give an error when it is run. dividedNumber is equal to zero because the  calculation of 1 divided by 2 is 0.5; but an int cannot hold the fractional value. So in the next instruction, we will be dividing 5 by zero, which is infinity! A computer cannot calculate that! So it creates what is called a runtime exception, an error that happens when we run a program and the value makes an error.
20. It will print “hello”
21. This code writes "15" to the standard output.

The initial value of i is 3.
The initial value of z is 4;
The statement if(x < y) is true. z += 4 adds 4 to the initial value of z.
z = 4 + 4 = 8.
The statement if(x * x > y) is false, because 3 * 3 is not greater than 9.
The else body is executed.
The statement z += 6; adds 6 to the value of z.
z = 8 + 6 = 14.
z++; adds one to the value of z.
z = 14 + 1 = 15.

22.
5 <= x && x <= 10 
4 < x && !(x > 10)
!(x < 5 || 10 < x)

Explanation:
<, <=, >, and >= must go between 2 numbers (operands). You cannot reuse a number between 2 expressions like this: 5 <= x <= 10
 
≤ is not an operator in Java, it has two symbols <=.
 
To understand the other choices, bear in mind that && should read as and and || as or. It also helps to associate && with set intersection ∩, || with set union ∪, and ! with set complement.
 
 
If we want to know if a variable is in a specific range, for example (5,10] (meaning that it does not include 5 but it does include 10), we have to do the following:
if( (x>5) && (x<=10) )
{
// is in the range
}
The if can be defined in many different ways:
if( !(x<=5) && (x<=10) )
if( (x>5) && !(x>10) )
and so on.
 
! reverses the boolean value i.e changes from true to false.
 
23. 
 
public class Question23 {
 
   //The method shall return -1 it the first number is the smaller one,
   // 0 if both number are equal and 1 if the second number is the smaller one.
   public static int compare(double number1, double number2){
       if(number1 < number2){
           return -1;
       }
 
       if(number2 < number1){
           return 1;
       }
 
       return 0; //we must have at least 1 return statement outside of an if
   }
 
   public static void main(String args[]){
       System.out.println(compare(1,1)); //should print 0
       System.out.println(compare(1,2)); //should print -1
       System.out.println(compare(2,1)); //should print 1
   }
}
 
 
24.
 
public class Question24 {
   public static boolean isAdult(int age){
       boolean adult = false;
 
       if(age >=18){
           adult = true;
       }
 
       return adult;
   }
 
   public static void canEnter(boolean isAdult){
       if(isAdult == true){
           System.out.println("Please enter");
       }
       else{
           System.out.println("You have to stay outside");
       }
   }
 
   public static void main(String args[]){
       boolean permission = isAdult(17);
       canEnter(permission);
   }
}
 
 
25. 
 
public class Question25 {
 
   public static void main(String[] args)
   {
       // write your code here
       boolean ageAllowed = isAdult(17, "Germany");
       canEnter(ageAllowed);
   }
 
   public static boolean isAdult(int age, String country) {
       if (age > getMinAdultAge(country)) {
           return true;
       }
       return false;
   }
 
   public static int getMinAdultAge(String country)
   {
       if (country.equals("America"))
       {
           return 21;
       }
       else if (country.equals("Germany"))
       {
           return 16;
       }
       else{
           return 18;
       }
   }
 
   public static void canEnter(boolean isAdultAge)
   {
       if (isAdultAge == true)
       {
           System.out.println("You can enter");
       }
       else
       {
           System.out.println("You can not enter");
       }
   }
}
 
26.
 
public class Question26 {
   public static double calculateCircleArea(double radius){
       //we can use the Java Math library for the value of Pi
       return Math.PI * radius * radius;
   }
 
   public static double calculateCylinderVolume(double radius, double height){
       return calculateCircleArea(radius) * height;
   }
 
   public static void main(String[] args){
       System.out.println( calculateCylinderVolume(5, 3.1) );
   }
}
 
