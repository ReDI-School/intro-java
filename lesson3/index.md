---
title: 3 - Operators
nav_order: 3
has_children: true
---

# Operators

1. TOC
{:toc}


Material:
- [Slides](https://drive.google.com/open?id=1KCbPB5X8UH2ar7Sd-qez4SrfPUaPL-TBzco8-5rXsto)

## Arithmetic Operators (Math)
Java provides operators for the following arithmetic operations
* addition
* multiplication
* subtraction
* division
* modulo (calculating the remainder of a division)

These operators work with all numerical types of Java e.g. *int*, *long*, *double* or *float*.

Each operator is represented by a specific character:

```java
class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        int sum = a + b;
        System.out.println(sum);
        int difference = a - b;
        System.out.println(difference);
        int multiplied = a * b;
        System.out.println(multiplied);
        int divided = a / b;
        System.out.println(divided);
        int modulo = a % b;
        System.out.println(modulo)
    }
}
```

Note, that the result of the division depends on if you use a type for fractional numbers (like *double*) or not (like *int*):
* for fractional numbers, you will get an exact result, e.g. _3.0 / 2.0_ will give you back _1.5_
* for non-fractional result, for the same calculation _3 / 2_ you get just _1_

Note that the same rules like in normal math apply regarding which operations are computed first in a more complex formula:
* operations are executed from left to right
* a division or multiplication takes precedence over addition or substraction, i.e. _2 + 5 * 2_ is _12_
* you can use round brackets to explicitely define the order of operation, i.e. _(2 + 5) * 2_ is _14_

## String Concatenation
With String concatenation, you can take two String and produce a new one (you _sum_ them up):

```java
class Main {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";

        String ab = a + b;
        System.out.println(ab);
        String ba = b + a;
        System.out.println(ba);
        String abba = a + b + b + a;
        System.out.println(abba); 
    }
}
```

## Using Operator with two different types
So far we always used an operator with two values of the same type so that the result of our operation was also of the same type, e.g.:
* adding two *int* also returns an *int*
* dividing two *double* also returns a *double*
* concatenating two *String* also returns a *String*

But what happens if we mix the types, e.g.:
* add an *int* to a *double*?
* divide a *double* by an *int*?
* combine an *int* with a *String*?

what will be the resulting type?

Java follows this rule to determine that:
Given one value of type _A_ and one of type _B_ and applying an operator on both, the type of the result will be the **more expressive** one of _A_ and _B_

So when is a type _A_ more expressive then a type _B_?

If all possible values of _B_ are part of _A_ but not all possible values of _A_ are part of _B_!

Let us look at some example for clarity:
* *long* is more expressive than *int* as *int* only contains numbers from -2000000000 to +2000000000 while *long* contains both bigger and smaller numbers
* *double* is more expressive than *int* as *int* can only contain numbers like _1, 2, ..._ while *double* can contain also all the numbers between e.g. _1_ and _2_ like _1.1, 1.2, 1.25 ..._
* *String* is more expressive than *double* as every *double* can be represented as *String* (e.g. _1.5_ is just _"1.5"_) while e.g. the *String* _"A"_ cannot be represented as *double* 

Thus we can say what the following program will print:
```java
class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = 2.0;
        int t = 9;
        
        System.out.println(i + d + "42" + t); 
    }
}
```

The program will print **6.0429** as
* we go from left to right
* first we add to _int i_ the _double d_ and the result of this is a _double_ so _6.0_
* then we _add_ a _String_ to that _double_, the result is of type _String_ so we get as result the concatenation of _6.042_
* then we _add_ the _int t_ but as the other type is a _String_ this will be again just be treated as concatenation and we end up with the _String_ _6.0429_ 

We can observe a similar effect also for **assignments**:

Compare the following two programs:
```java
class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = i;
        System.out.println(d); 
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        double d = 4.0;
        int i = d;
        System.out.println(i); 
    }
}
```

The first program will run and print out _4.0_.  
The second program will not compile.  
This is again due to the expressiveness of the involved types:
* in the first program we put an _int_ into a _double_. As we know, each _int_ can be represented as _double_ so the assignment is allowed (and the _int 4_ is converted into the corresponding _double 4.0_)
* in the second program we try to put an _double_ value into an _int_ value. Java does not allow that as we might lose information (e.g. all doubles _4.0, 4.1, 4.2_ cannot be represented lossless as an _int_ => all values would be converted to just the same, a _4_)

However, there might be an occasion where we actually want to perform the second case, We can achieve this but must tell Java explicitely to execute the conversion from _double_ to _int_. This process is called **casting** (e.g. casting a double to an int) and can be expressed in code like this:
```java
class Main {
    public static void main(String[] args) {
        double d = 4.0;
        int i = (int)d;
        System.out.println(i); 
    }
}
```

## Relational Operators (Comparison)
Relational operators allow you to compare two values (e.g. you ask if value A is bigger/smaller than value B).

Such a comparison will always give you back a *boolean*.

The following code snippet shows you all possible comparison operators:

```java
class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        boolean isASmallerB = a < b;
        boolean isAGreaterB = a > b;
        boolean isAEqualToB = a == b;
        boolean isANotEqualToB = a != b;
        boolean isASmallerOrEqualToB = a <= b;
        boolean isAGreaterOrEqualToB = a >= b; 
    }
}
```

## Logical Operators (Boolean)
Logical operator allow you to combine two boolean expressions (either just a boolean value like _true_ or _false_ but also comparison like the ones from the previous section).

Logical operators will again return a new boolean value.

The following code snippet shows you all possible logical operators (try to run it to see the output):

```java
class Main {
    public static void main(String[] args) {

        // AND operator && returns true if both given booleans are true
        System.out.println("Using AND");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // OR operator || returns true if at least one of the given booleans are true
        System.out.println("Using OR");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // XOR operator ^ returns true if at only exactly one of the given booleans are true
        System.out.println("Using XOR");
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // NOT operator ! takes only one boolean and returns the opposite value
        System.out.println("Using NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
```