---
title: "Solutions: Basics of String methods"
nav_order: 4
parent: 7 - Strings
---

# Solutions: Basics of String methods

### length(), isEmpty(), toUpperCase(), toLowerCase()

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s = scanner.next();
        System.out.println("Output:");
        System.out.println("Length: " + s.length());
        System.out.println("Empty? " + s.isEmpty());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
```

### equals(String otherString) and equalsIgnoreCase(String anotherString)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.print("Output: ");
        if (s1.equals(s2)) {
            System.out.println("Equal");
        }
        else if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Not equal but equal with case ignored");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
```

### contains(String str)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.print("Output: ");
        if (s1.contains(s2)) {
            System.out.println(s2 + " is part of " + s1);
        }
        else {
            System.out.println(s2 + " is NOT part of " + s1);
        }
    }
}
```

### startsWith(String prefix)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.print("Output: ");
        if (s1.startsWith(s2)) {
            System.out.println(s2 + " is a prefix of " + s1);
        }
        else {
            System.out.println(s2 + " is NOT a prefix of " + s1);
        }
    }
}
```

### endsWith(String suffix)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.print("Output: ");
        if (s1.endsWith(s2)) {
            System.out.println(s2 + " is a suffix of " + s1);
        }
        else {
            System.out.println(s2 + " is NOT a suffix of " + s1);
        }
    }
}
```

### charAt(int index)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String text = scanner.nextLine();

        System.out.println("Output:");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println("Index " + i + " Character " + c);
        }
    }
}
```

### indexOf(String substring)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1: ");
        String s1 = scanner.nextLine();
        System.out.println("Input 2: ");
        String s2 = scanner.nextLine();

        System.out.print("Output: " + s2 + " can be found at index " + s1.indexOf(s2));
    }
}
```

### indexOf(String substring, int index)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1: ");
        String s1 = scanner.nextLine();
        System.out.println("Input 2: ");
        String s2 = scanner.nextLine();
        System.out.println("Start Position: ");
        int start = scanner.nextInt();

        System.out.print("Output: " + s2 + " can be found at index " + s1.indexOf(s2, start));
    }
}
```

### substring(int beginIndex, int endIndex)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s = scanner.next();
        int splitPos = scanner.nextInt();

        String part1 = s.substring(0, splitPos);
        String part2 = s.substring(splitPos);

        System.out.print("Output: " + part1 + " - " + part2);
    }
}
```

### replace(String target, String replacement)

```java
class Main {
    public static void main(String[] args) {

        String encrypted = "lala#lwve#-rwgra22lalang!#<3";

        String x1 = encrypted.replace("w", "o");
        String x2 = x1.replace("#", " ");
        String x3 = x2.replace("2", "m");
        String x4 = x3.replace("lala", "i");
        String decrypted = x4.replace("-", "p");

        System.out.println(decrypted);
    }
}
```

A more elegant alternative is:

```java
class Main {
    public static void main(String[] args) {

        String encrypted = "lala#lwve#-rwgra22lalang!#<3";

        String decrypted = encrypted
                .replace("w", "o")
                .replace("#", " ")
                .replace("2", "m")
                .replace("lala", "i")
                .replace("-", "p");

        System.out.println(decrypted);
    }
}
```

Both print: `i love programming! <3`.

### compareTo(String anotherString)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.print("Output: ");
        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + ", " + s2);
        }
        else {
            System.out.println(s2 + ", " + s1);
        }
    }
}
```
