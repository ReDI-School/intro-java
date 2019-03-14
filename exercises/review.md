# Questions
 
1. If I want to store a whole number of 4 billion, which data type would I use?
2. If I want to make a quiz program and I need a variable for the answer, which is a single letter. What data type would I use?
3. Is this allowed?
`int negativeNumber = -125000;`
4. If I am writing a program to sing the song “99 bottles of beer on the wall”, which counts down from 99 to 0 as the bottles fall off the wall and break. What data type can I use for the variable bottles ?
5. A variable name can contain a dot (full stop). True or False?
6. A variable name can be any word I choose. True or False?
7. A variable name cannot have a number as the first character e.g. 1number. True or False?

8. What will be printed here?

```java
public class Question {

	public static void main(String args[]){
    		System.out.println(10 > 9);
    }
}
```

9. There is one mistake in this code. Can suggest the correction?

```java
public class Question {

	public static void main(String args[]){
    	int number = 1;

    	if(Number == 300){
        		System.out.println("Correct number");
    	}
    	else{
        		System.out.println("Incorrect number");
    	}
    }
}
```

10. There are 2 mistakes in this code. Which of the following variable declaration have an issue?

```java
class Question {

   public static void main(String args[]){
       int number = 1;
       char letter = "a";
       double fractional_num = 1.2;
       String name = "robert o'leary";
       boolean return = true;
   }
}
```

11. What will this print?

```java
class Question {

   public static void main(String args[]) {
       System.out.println("A\\B\\C");
   }
}
```

12. What will this print?

```java
class Question {

   public static void main(String args[]) {
       System.out.println("A\n\"B\"");
   }
}
```

13. What will happen?

```
class Question {

   public static void main(String args[]){
       int age = 18;

       if(age <= 18){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
   }
}
```

14. What will happen?

```
class Question {

   public static void main(String args[]){
       int age = 18;

       if(age > 18 || age <= 60){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
   }
}
```

15.  What will happen?
 
```
class Question {

   public static void main(String args[]){

       char gender = 'f';
       int age = 30;

       if(gender == 'f' && age > 18 && age <= 30){
           System.out.println("We are match.");
       }
       else{
           System.out.println("We are not a match.");
       }
   }
}
```


16. What will happen?

```
class Question {

   public static void main(String args[]){
       System.out.println("1");
       speak();
       System.out.println("2");
   }

   public static void speak(){
      System.out.println("Hello!");
   }
}
```


## These Questions are more difficult…

17. What will happen?

```
class Question {

   public static void main(String args[]){
	String name = "Paul";
       String myName = "Angela";
       speak(myName);
   }

   public static void speak(String name){
      System.out.println("I am " + name);
   }
}
```

18. What will happen?

```
class Question {

   public static void main(String args[]){
       int myAge = 18;
       boolean oldEnough = checkAge(myAge);
       System.out.println(oldEnough);
   }
  
   public static boolean checkAge(int age){
       if(age >= 18){
           return true;
       }
       else{
           return false;
       }
   }
}
```

19. What will happen here?

```
class Question {

   public static void main(String args[]){
       int dividedNumber = 1 / 2;
       System.out.println(5 / dividedNumber);

   }
}
```
 
20.   What will happen here?

```
class Question {
   public static void main(String args[]){
       System.out.println(sayHello());
   }

   public static void sayHello(){
       return "Hello";
   }
}
```

21. What does this print out?

```
public class MyClass
{
  public static void myMethod(int x, int y)
  {
    int z = 4;
    int i = 3;
    i++;
    if ( x< y)
    {
      z += 4;
    }
    if (x * x > y)
    {
      z += 2;
    }
    else
    {
      z += 6;
    }
    z++;
    System.out.print(z);
  }
  public static void main(String[] args)
  {
    myMethod(3, 9);
  }
}
```

22. We want to check in Java whether the value of an integer variable x is between integers 5 and 10, including both.
Mark all the correct answers:

- [ ] 5 <= x <= 10
- [ ] 4 < x < 11
- [ ] 5 ≤ x ≤ 10
- [ ] 5 <= x && x <= 10 
- [ ] 5 =< x && x =< 10
- [ ] 5 <= x || x <= 10
- [ ] 4 < x && !(x > 10) 
- [ ] !(x < 5 || 10 < x) 
- [ ] 5 ≤ x && x ≤ 10

## Coding

23. Write a method which returns which of two numbers is the smaller one.
The method shall return `-1` it the first number is the smaller one, `0` if both number are equal and `1` if the second number is the smaller one.
The signature of this method shall look like this:
```
public static int compare(double number1, double number2)
```

24. Write two methods. 
- One method takes the age of a person as input and returns if this person is an adult or not. 
- Write a second method which prints “Please enter” or “You have to stay outside” dependent from the result of this method.

The two methods shall have the following signatures:
```
public static boolean isAdult(int age)
public static void canEnter(boolean isAdult)
```

25. Extend the method public bool `isAdult(int age)` to a method with this signature `boolean isAdult(int age, string country)`. Implement a second method `getMinAdultAge(String country)` which returns the age a person needs to have to be an adult in this country. Use this age to evaluate if a person is an adult in the given country. Implement the second method for at least 2 different countries.

25. Write a mthod to calculate the area of a circle: 
`A = π*r^2`

26. Write a method which calculates the volume of a cylinder. For this task, we want to reuse our method calculating the area of a circle. The volume is of a cylinder = area of circle * height 
The method shall have the following signature:
`public static double calculateCylinderVolume(double radius, double height)
