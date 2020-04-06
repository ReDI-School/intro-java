---
title: "Hands-On: Fixing compile errors in our programs"
nav_order: 13
---

# Fixing compile errors in our programs

As a programmer it is quite common that it happens that your program does not compile or does not behave as wished.

That is not a problem - but you be able to resolve the errors by yourself of couse!

This lesson will give an overview of some common errors that may happen when you write your program and how you can recognize them.

## Compile Errors

In these cases, your program does not even compile.

The _java_ compiler will print an error message to the console.

Try to use the information given there to find the error in your program.

Let's look at some typical outputs.

### Case 1
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      calculate(number1, number2, operation);
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        calculate(number1, number2, i);
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static void calculate(double n1, double n2, int op) {
    if(op == 1) {
      print(n1, n2, "+", add(n1, n2))
    } else if(op == 2) {
      print(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      print(n1, n2, "*", mult(n1, n2));
    } else {
      print(n1, n2, "/", div(n1, n2));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static void print(double n1, double n2, String op, double result) {
    System.out.println("Result of " + n1 + " " + op + " " + n2 + " is " + result);
  }
}
```

instead the compiler prints the following message:
```bash
Main.java:28: error: ';' expected
      print(n1, n2, "+", add(n1, n2))
                                     ^
1 error
compiler exit status 1
```

What can the message tell us?
The expression _';' expected_ hints at that our code is missing a semicolon.  
The expression _Main.java:28:_ tells us to look at line 28 of our _Main.java_ file.

And indeed, if we look there, we see that our line does not end with a semicolon!

Conclusion: if you see an error with _';' expected_ , look for missing semicolons!

### Case 2
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = "hello";

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    int number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      calculate(number1, number2, operation);
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        calculate(number1, number2, i);
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static void calculate(double n1, double n2, int op) {
    if(op == 1) {
      print(n1, n2, "+", add(n1, n2));
    } else if(op == 2) {
      print(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      print(n1, n2, "*", mult(n1, n2));
    } else {
      print(n1, n2, "/", div(n1, n2));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static void print(double n1, double n2, String op, double result) {
    System.out.println("Result of " + n1 + " " + op + " " + n2 + " is " + result);
  }
}
```

instead the compiler prints the following message:
```bash
Main.java:5: error: incompatible types: String cannot be converted to Scanner
    Scanner scanner = "hello";
                      ^
Main.java:11: error: incompatible types: possible lossy conversion from double to int
    int number2 = scanner.nextDouble();
                                    ^
2 errors
compiler exit status 1
```

As you can see, this time our program has 2 errors.  
But both come from a similar problem.  
The expression _incompatible types_ tells us that we try to use a type A at a place where another type B (that is incompatible to A) is expected.  
The message after _incompatible types_ just gives us more details:
* in first case, we obviously use a _String_ where a _Scanner_ is expected
* in second case, we use an int where a double is expected.

Looking at the reported lines given by _Main.java:5_ and _Main.java:11_ we see that this is indeed the case!

Conclusion: if you see an error with _incompatible types_ => check that you use the right types for any kind of assignment

### Case 3
The following program will not compile:

```java
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      calculate(number, number2, operation);
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        calculat(number1, number2, i);
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static void calculate(double n1, double n2, int op) {
    if(op == 1) {
      print(n1, n2, "+", add(n1, n2));
    } else if(op == 2) {
      print(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      print(n1, n2, "*", mult(n1, n2));
    } else {
      print(n1, n2, "/", div(n1, n2));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static void print(double n1, double n2, String op, double result) {
    System.out.println("Result of " + n1 + " " + op + " " + n2 + " is " + result);
  }
}
```

instead the compiler prints the following message
```bash
Main.java:3: error: cannot find symbol
    Scanner scanner = new Scanner(System.in);
    ^
  symbol:   class Scanner
  location: class Main
Main.java:3: error: cannot find symbol
    Scanner scanner = new Scanner(System.in);
                          ^
  symbol:   class Scanner
  location: class Main
Main.java:14: error: cannot find symbol
      calculate(number, number2, operation);
                ^
  symbol:   variable number
  location: class Main
Main.java:17: error: cannot find symbol
        calculat(number1, number2, i);
        ^
  symbol:   method calculat(double,double,int)
  location: class Main
4 errors
compiler exit status 1
```

This time we got even 4 errors (but they again have similar reasons), let's go over them step by step.

The first two seems to originate both from line 3 (as it says _Main.java:3:_).
The expression _cannot find symbol_ tells us that the compiler encountered something that it cannot recognize.
But we get more information by looking at _symbol:   class Scanner_ => this tells us what symbol the compiler did not recognize!  
It sees that _Scanner_ is supposed to be a class but it does not know it.  
Two possible reasons if you see such a thing for a class:
* we made a typo writing the class name, here _Scanner_ => this is here obviously not the case
* we forgot the import statement at the beginning of our file => as you can see, this is here indeed the problem!

The next error seems to come from line 14 (as it says _Main.java:14_).
Again the expression _cannot find symbol_ tells us that the compiler encountered something that it cannot recognize.
Again we can look at the following _symbol:   variable number_ expression for more information.  
This time it talks about a variable instead of a class - this tells us that we tried to access a variable with the name _number_ which Java could not find in our program!  
And indeed we did a typo there: we should have of course used the existing variable _number1_

The last error comes from line 17 (it says _Main.java:17_).
And once again the expression _cannot find symbol_ tells us that the compiler encountered something that it cannot recognize.
Again we look at the following _symbol:   method calculat(double,double,int)_ expression for more information. 
This time it talks about that we tried to call a method with the name _calculat_ which Java could not find in our program!  
And indeed, the actual name of our method is _calculate_ so once again we made a typo!

Conclusion: if you see an error with the expression _cannot find symbol_ you should first look in the error message next to that what symbol is the actual problem (i.e. look for _symbol: ..._). Now you can take an action depending on what you see there:
* if it is a class, check if you typed its name correctly and that you have also imported it (_import_ statement at the beginning of the file)
* if it is a variable, check that you have a variable of that name actually in your program => you might just have made a typo
* if it is a method, check that you have a method of that name actually in your program => you might just have made a typo

### Case 4
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      calculate(number1, number2, operation);
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        calculate(number1, number2, i);
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static void calculate(double n1, double n2, int op) {
    if(op == 1) {
      print(n1, n2, "+");
    } else if(op == 2) {
      print(n1, n2, sub(n1, n2), "-");
    } else if(op == 3) {
      print(n1, n2, "*", mult(n1, n2));
    } else {
      print(n1, n2, "/", div(n1, n2));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static void print(double n1, double n2, String op, double result) {
    System.out.println("Result of " + n1 + " " + op + " " + n2 + " is " + result);
  }
}
```

instead the compiler prints the following message
```bash
Main.java:28: error: method print in class Main cannot be applied to given types;
      print(n1, n2, "+");
      ^
  required: double,double,String,double
  found: double,double,String
  reason: actual and formal argument lists differ in length
Main.java:30: error: method print in class Main cannot be applied to given types;
      print(n1, n2, "-", sub(n1, n2), "test");
      ^
  required: double,double,String,double
  found: double,double,String,double,String
  reason: actual and formal argument lists differ in length
2 errors
compiler exit status 1
```

In both cases, we see the expression _method print in class Main cannot be applied to given types_.  
This gives us a hint that we try to call the _print_ method in the wrong way.  
The next lines of the error message prove that:  
The expression _required: double,double,String,double_ tells us which types the _print_ method defines as parameters (if you check this with the method code in the class, these are exactly the types of the input parameters).
The expressions _found: double,double,String_ and _found: double,double,String,double,String_ tell us with what parameters we tried to call _print_ => as you can see this does not match the defined parameters!

Conclusion: if you see an error with _method ... in class ... cannot be applied to given types_, you should check the places in your code where you are calling this method. See if you calling it with the right number of parameters in the right order!

### Case 5
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      System.out.println(calculate(number1, number2, operation));
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        System.out.println(calculate(number1, number2, i));
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static String calculate(double n1, double n2, int op) {
    if(op == 1) {
      return message(n1, n2, "+", add(n1, n2));
    } else if(op == 2) {
      return message(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      return message(n1, n2, "*", mult(n1, n2));
    } else {
      System.out.println(message(n1, n2, "/", div(n1, n2)));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static String message(double n1, double n2, String op, double result) {
    return "Result of " + n1 + " " + op + " " + n2 + " is " + result;
  }
}
```

instead the compiler prints the following message
```bash
Main.java:36: error: missing return statement
  }
  ^
1 error
compiler exit status 1
```

The expression _missing return statement_ is of importance.  
This tells us that the problem is caused by our code having a method that
* defines a return type other than _void_
* but its code does not always actually return a value!

How do we find this broken method? Well, we use the information about the line number _Main.java:36_.  
This points to the end of our _calculate_ method. And if we look carefully at this method we see that
* it defines a return type of type _String_
* a value is returned in all _if_ cases but NOT in the _else_ cases => so in the _else_ case, our method will be executed until its end without ever encountering a _return_ => thus Java tells us that it expected one at the end of our method

Conclusion: if you see an error with the expression _missing return statement_, you need to check your methods (use the mentioned line number to find the broken method). You might
* either have missed a case where a _return_ was needed, either at the end of the method or if you used _if_ statements from that you _return_ you might have forgotten one case
* accidentally declared the method to have a return type though it needs none => in that case change the return type to _void_

### Case 6
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      System.out.println(calculate(number1, number2, operation));
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        System.out.println(calculate(number1, number2, i));
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static String calculate(double n1, double n2, int op) {
    if(op == 1) {
      return message(n1, n2, "+", add(n1, n2));
    } else if(op == 2) {
      return message(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      return message(n1, n2, "*", mult(n1, n2));
    } else {
      return message(n1, n2, "/", div(n1, n2)));
    }
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static String message(double n1, double n2, String op, double result) {
    return "Result of " + n1 + " " + op + " " + n2 + " is " + result;
  }
}
```

instead the compiler prints the following message
```bash
Main.java:34: error: ';' expected
      return message(n1, n2, "/", div(n1, n2)));
                                              ^
1 error
compiler exit status 1
```

This is a very interesting case.
You see the expression _error: ';' expected_ and would naturally thinking of a forgotten semicolon.  
But looking at the line, it actually ends with one!

The problem is here quite hidden: if you count the brackets, you see that there is actually one closing bracket too much!
You have 2 opening brackets and then three closing ones!

And here the compiler is not that smart anymore => it basically saw the second closing bracket followed by another closed bracket and tells us that it expected a semicolon after the second closign bracket!

Conclusion: if you see an error with the expression _error: ';' expected_ but the mentioned line actually ends with a semicolon, you should check that the number of opening and closing brackets are actually equal!

### Case 7
The following program will not compile:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter a second number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operation:\n 1 => Add \n 2 => Subtract \n 3 => Multiplication \n 4 => Division \n 5 => All operations");
    int operation = scanner.nextInt();
    if(operation >= 1 && operation <= 4) {
      System.out.println(calculate(number1, number2, operation));
    } else if(operation == 5) {
      for(int i = 1; i <= 4; i++) {
        System.out.println(calculate(number1, number2, i));
      }
    } else {
      System.out.println("Invalid Operation");
    }
  }

  public static String calculate(double n1, double n2, int op) {
    if(op == 1) {
      return message(n1, n2, "+", add(n1, n2));
    } else if(op == 2) {
      return message(n1, n2, "-", sub(n1, n2));
    } else if(op == 3) {
      return message(n1, n2, "*", mult(n1, n2));
    } else {
      return message(n1, n2, "/", div(n1, n2));
    
  }

  public static double add(double n1, double n2) {
    return n1 + n2;
  }
  public static double sub(double n1, double n2) {
    return n1 - n2;
  }
  public static double mult(double n1, double n2) {
    return n1 * n2;
  }
  public static double div(double n1, double n2) {
    return n1 / n2;
  }

  public static String message(double n1, double n2, String op, double result) {
    return "Result of " + n1 + " " + op + " " + n2 + " is " + result;
  }
}
```

instead the compiler prints the following message
```bash
Main.java:38: error: illegal start of expression
  public static double add(double n1, double n2) {
         ^
Main.java:38: error: ';' expected
  public static double add(double n1, double n2) {
               ^
Main.java:38: error: '.class' expected
  public static double add(double n1, double n2) {
                                  ^
Main.java:38: error: ';' expected
  public static double add(double n1, double n2) {
                                    ^
Main.java:38: error: ';' expected
  public static double add(double n1, double n2) {
                                               ^
Main.java:41: error: illegal start of expression
  public static double sub(double n1, double n2) {
  ^
  ...
```

This is one of the most problematic one.  
We see these messages but actually this does not really point to the root problem (and depending where our root problem happens in our program, we might get an error message).

The actual problem lies in lines 34 and 35 of our program: for the _else_ statement we are missing a closing curly bracket!

Conclusion: if you get an error that you are unfamiliar with or one from above but you are 100% sure that everything is alright, a good step is to check that for each opening curly bracket ypur code also has the corresponsing closing curly bracket (though this can become a tedious work if your program is bigger). 


