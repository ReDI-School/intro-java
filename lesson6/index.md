---
title: 6 - Methods + Scope
nav_order: 6
has_children: true
---

# Methods
Congratulations! If you made it until this point you learned nearly everything you need to write simple programs with the Java programming language. With the things we discussed so far - variables, if statements and loops - you can solve the majority of problems and programming tasks.

But as you hopefully learned from us, programming is not just giving instructions to a computer to tell it what it shall do! Otherwise we could type zeros and ones into the keyboard and the computer would still understand what it shall do (if we did it correctly)! A higher programming language like java has as main purpuse that we - the programmers - can express what the computer shall do in a way which is easily understandable for other people (collegues, friends, teachers, whoeverwants to read our code and even our future self). We should keep this in mind and write our programs in a way that it is easily understandable for other people or ourself.

That is also the reason why we should try to use speaking names for our variables.

But if our code gets more and more complicated, because the complexity of the problem we want to solve increses, we need to apply other techniques to keep our code as simple to read as possible.

Java and other higher programming languages give us some tools to support us in writing code which is easy too understand.

One of these tools are **methods**.

# Methods or functions

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


# Scope
A scope is always defined by an opening and a closing curley bracket pair: **{** and **}**.

You can nest a scope inside of another scopte.

Examples for scopes are:
- the execution body after an **if, else if or else**
- the body after the definition of a loop. E.g.: **for** or **while**
- the execution body of a **function** or **method**

Scopes are important, when you need to think about the visibility of a variable. Scopes have a hirarchially struture. A scope can have exactly one direct parent. And a parent can have several direct children scopes.

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
        }
        else {
            String visibleInElseStatement = "I am visible in the scope of the else statement";
            
            System.out.println(visibleInWholeMain);
            System.out.println(visibleInElseStatement);
        }
        System.out.println(visibleInWholeMain);
    }
}
```

Material:
- [Slides](https://drive.google.com/open?id=1Uhl80yqE57XGV-HlMUBvj_ti9O_c2_so7j7Fb70DVho)
