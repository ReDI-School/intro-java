# Exercises: simple methods

## addNumbers

```java
public static int addNumbers(int max) {
    int sum = 0;
    for (int i = 1; i <= max; i++) {
        sum += i;
    }
    return sum;
}
```

## multiplyNumbers

```java
public static int multiplyNumbers(int max) {
    int product = 1;
    for (int i = 1; i <= max; i++) {
        product *= i;
    }
    return product;
}
```

## findClosestDivisbleNumber

This works only because integers are rounded when divided.

```java
public static int findClosestDivisibleNumber(int number, int divisor) {
    return number / divisor * divisor;
}
```

## areEqual

For integers:

```java
public static boolean areEqual(int a, int b, int c, int d) {
    return a == b && a == c && a == d;
}
```

For strings:

```java
public static boolean areEqual(String a, String b, String c, String d) {
    return a.equals(b) && a.equals(c) && a.equals(d);
}
```

## greatest

Greatest of 3:

```java
public static int greatest(int a, int b, int c) {
    int greater = a;
    if (b > greater) {
        greater = b;
    }
    if (c > greater) {
        greater = c;
    }
    return greater;
}
```

Greatest of 4:

```java
public static int greatest(int a, int b, int c, int d) {
    int greater = a;
    if (b > greater) {
        greater = b;
    }
    if (c > greater) {
        greater = c;
    }
    if (d > greater) {
        greater = d;
    }
    return greater;
}
```

Greatest of 5:

```java
public static int greatest(int a, int b, int c, int d, int e) {
    int greater = a;
    if (b > greater) {
        greater = b;
    }
    if (c > greater) {
        greater = c;
    }
    if (d > greater) {
        greater = d;
    }
    if (e > greater) {
        greater = e;
    }
    return greater;
}
```

We can continue forever, but the structure of the method is always the same.

## powerOf

Similar to `multiplyNumbers`, but not identical.

```java
public static double powerOf(double base, int exponent) {
    double result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;
    }
    return result;
}
```

## areaOfCircle

```java
public static double areaOfCircle(double radius) {
    return radius * radius * Math.PI;
}
```

## hypotenuse (Pythagoras' theorem)

```java
public static double hypotenuse(double x, double y) {
    return Math.sqrt(x * x + y * y);
}
```

## Number Pyramid

```java
public static void printPyramid(int height) {
    for (int i = 1; i <= height; i++) {
        printPyramidRow(i, height);
    }
}

public static void printPyramidRow(int row, int maxHeight) {
    for (int i = 0; i < maxHeight - row; i++) {
        System.out.print(" ");
    }
    for (int i = 1; i <= row; i++) {
        System.out.print(i);
    }
    for (int i = row - 1; i >= 1; i--) {
        System.out.print(i);
    }
    System.out.println();
}
```