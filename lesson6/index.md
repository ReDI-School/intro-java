---
title: 6 - Methods + Scope
nav_order: 6
has_children: true
---

1. TOC
{:toc}

# Methods

Congratulations! If you made it until this point you learned nearly everything you need to write simple programs with the Java programming language. With the things we discussed so far - variables, if statements and loops - you can solve the majority of problems and programming tasks.

But as you hopefully learned from us, programming is not just giving instructions to a computer to tell it what it shall do! Otherwise we could type zeros and ones into the keyboard and the computer would still understand what it shall do (if we did it correctly)! A higher programming language like java has as main purpuse that we - the programmers - can express what the computer shall do in a way which is easily understandable for other people (collegues, friends, teachers, whoeverwants to read our code and even our future self). We should keep this in mind and write our programs in a way that it is easily understandable for other people or ourself.

That is also the reason why we should try to use speaking names for our variables.

But if our code gets more and more complicated, because the complexity of the problem we want to solve increses, we need to apply other techniques to keep our code as simple to read as possible.

Java and other higher programming languages give us some tools to support us in writing code which is easy too understand.

One of these tools are **methods**.

## Syntax of Methods or functions

Do you remember **functions** from school?

E.g.: f(x) = x² + b or  f(x, z) = x³ + z² +b ...

Functions in programming are similar. 

- In Java **function** have a **name**, which is **f** is this case. In java the name of a function or method shall be speaking like variable names. This means the name of a function shall give a hint what happens during the execution time of the funtion.

- A **function** can have **parameters**, like **x** and **z** in the given examples. This means we can give values for x and z if we call the function. In math if **f(x) = x² is called with the value 2** => **f(2)**, the result we get will be **4**. So the value we hand over to the function kind of replaces the occurences of the variables, where the variables are still variables which means they can still change during the execution time of the function.

- A **function** has a **body**, which is the definition, what the function will do when it will be executed. In our math example the body would be the function itself so the **x² + b** oder **x³ + z² + b**.

In Java a function is defined like this:

```java
    modifiers returnType nameOfMethod(parameterList) {

        // method body
    
        return returnValue;
    }

```

So in Java we have some additional things. 

- We have **modifiers**. So far we just used **public static**. In future classes we will get to know further modifiers.
- We have a **returnType**. The return type specifies the type of the data the method returns, when the execution is done. The return type can be primitive data types like **int or long** or reference types like **String** oder **other classes**. If the method shall not return anything, we can use the returnType **void**.
- For the **nameOfMethod** we have the same rules as for **variable names**. A variable name should be in camel case and it should be formulated as a verb, because a **function** always does something e.g. **printGreeting, calculateSum, compareValues...**.
- The **parameters** are specified as you now it from normal variable declarations: **dataType variableName**. You can specify as many parameters as you like. They are seperated via commas.
- The **modifiers, returnType, nameOfMethod and the parameters** define the **method signature**
- The **method body** is encapsulated in curly brackets, which also define the **scope**. In between this brackets we have to define what the function shall do.
- At the end of a function we always (**void functions excluded**) have to **return** a value. **return** is a keyword defined by the Java programming language. The value following by the **return** statement has to match the **returnType** which is specified in the **method signature**. So an function with **returnType** **int** can return a **0** but not a **"Hello world!"**

- a function or method can be called from any other method in the program

An example method: 

```java
public static int add (int a, int b) {
    int sum = a + b; 
    return sum;
}
```

here...
- ... **public static** are the **modifiers**
- ... **int** is the **returnType**
- ... **add** is the **nameOfMethod**
- ... **a** and **b** are the **parameters**
- ... the rest is the **method body**
- ... this method **returns** the **sum of a and b** which is from type **int**

## Using return in methods

As we have seen before, if we define a method with a return type that is not _void_, we need to return a value using a _return statement_.

An important thing to remember is that if our method contains decision statements (_if_, _else_, _else if_), we need to make sure that we return a value in each case.

Consider the following method which adds _m_ _k_- times to _n_

```java
public static int addKtimes(int n, int m, int k) {
    if(m == 0 || k == 0) {
        return n;
    } else if(n == 0) {
        return k * m;
    } else {
        return n + k*m
    }
}
```
As this program has three different possible ways how it could execute (depending on values for _n_, _m_ or _k_), our program must make sure to return a value in each of this cases.  
If we would forget a return statement, our program would fail and we would get an error about a _missing return statement_.

Note: many developer however consider it a bad practice to have a multiple return statements in a method. We can rewrite our program in the following way to have only one:

```java
public static int addKtimes(int n, int m, int k) {
    int result = 0;
    if(m == 0 || k == 0) {
        result = n;
    } else if(n == 0) {
        result = k * m;
    } else {
        result = n + k*m
    }
    return result;
}
```

Let's come back to a method that has a _void_ return type. As mentioned before, we do not need to use a return statement as our method does not return any value.  
But let's look at this example:
```java
public static void divide(int n, int k) {
    if(k == 0) {
        return;
    }
    System.out.println(n / k);
}
```
We can use a _return_ inside a _void_ method - it will result in stopping any execution in the method and return back to the caller (i.e. if _divide_ is called with _k_ being zero, the _println_ method will not be executed!).

# Variable Scope
A scope is always defined by an opening and a closing curley bracket pair: **{** and **}**.

You can nest a scope inside of another scopte.

Examples for scopes are:
- the execution body after an **if, else if or else**
- the body after the definition of a loop. E.g.: **for** or **while**
- the execution body of a **function** or **method**

Scopes are important, when you need to think about the visibility of a variable. Scopes have a hierarchially struture. A scope can have exactly one direct parent. And a parent can have several direct children scopes.

A variable defined in a scope is just visible in the scope itself or in the scope of the children. A variable defined in the scope of a child in not visible in the parent scope:

```java
public class ScopeExample {

    public static void main(String[] args) {
        String visibleInWholeMain = "I am visible in the whole main function";

        if (true) {
            String visibleInIf1AndChildren = "I am visible in the scope of the first if statement and the scope of my children";

                System.out.println(visibleInWholeMain);
                System.out.println(visibleInIf1AndChildren);

            if(false) {
                String visibleInSecondIfStatement = "I am visible in the scope of the second if statement";
                
                System.out.println(visibleInWholeMain);
                System.out.println(visibleInIf1AndChildren);
                System.out.println(visibleInSecondIfStatement);       
            } 

            String test = "also only visible in scope of first if statement";
        }
        else {
            String visibleInElseStatement = "I am visible in the scope of the else statement";
            
            System.out.println(visibleInWholeMain);
            System.out.println(visibleInElseStatement);

            String test = "can also be named test as test from first if statement is invisible here!"
        }
        System.out.println(visibleInWholeMain);
    }
}
```

Visibility of variables are important in two ways:
* in a part of your program you can only use the variable that are visible there
* if a variable is visible in a part of your program, you cannot define another variable with the same name. However, if there exists a variable that in your program that is not visible, you can actually reuse the name!

**Methods** also play an important role for scopes. Each method start a complete new independent scope - meaning a method block has no parent scope!
Note: the parameters of the method are also part of the scope of the method.     
Thus if we have two methods, _f_ and _g_ in our program
* no variable defined in _f_ is accessible for _g_ (and also no variable of _g_ in _f_)
* it is totally fine to use the same variable name in _f_ and _g_

Material:
- [Slides](https://drive.google.com/open?id=1Uhl80yqE57XGV-HlMUBvj_ti9O_c2_so7j7Fb70DVho)
