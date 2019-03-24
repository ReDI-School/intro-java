# Solution to exercises: arrays

## Write a method that calculates the sum of the items

```java
public static int sumScores(ArrayList<Integer> scoreBoard) {
    int sum = 0;
    for (int x: scoreBoard) {
        sum += x;
    }
    return sum;
}
```

## Write a method that finds the highest integer in the list

This works only if `scoreBoard` is not empty. Otherwise an error is generated.

```java
public static int getHighScore(ArrayList<Integer> scoreBoard) {
    int max = scoreBoard.get(0);
    for (int x: scoreBoard) {
        if (x > max) {
            max = x;
        }
    }
    return max;
}
```

## Write a method that returns a new array that contains the elements of the input array in the reverse order

```java
public static ArrayList<Integer> reverseScores(ArrayList<Integer> scoreBoard) {
    ArrayList<Integer> newScoreBoard = new ArrayList<>();
    for (int i = scoreBoard.size() - 1; i >= 0; i++) {
        newScoreBoard.add(scoreBoard.get(i));
    }
    return newScoreBoard;
}
```

## Remove words too short

We introduce a method `removeShortWords` that does the actual work,
while `main` asks the user and prints the result of the program.

```java
import java.util.ArrayList;
import java.util.Scanner;

class RemoveShortWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to input?");
        int n = scanner.nextInt();

        System.out.println("Input " + n + " words:");
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }

        System.out.println("What's the minimum length you want to have?");
        int minLength = scanner.nextInt();

        System.out.println("Words with minimum length " + minLength + ":");
        ArrayList<String> longWords = removeShortWords(words, minLength);
        for (String word: longWords) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
        ArrayList<String> longWords = new ArrayList<>();
        for (String word: words) {
            if (word.length() >= minLength) {
                longWords.add(word);
            }
        }
        return longWords;
    }
}
```

## Truncate

```java
import java.util.ArrayList;
import java.util.Scanner;


class Scratch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to input?");
        int n = scanner.nextInt();

        System.out.println("Input " + n + " words:");
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }

        System.out.println("From which word do you want to truncate the previous list?");
        String stopWord = scanner.next();

        System.out.println("Words up to " + stopWord + ":");
        ArrayList<String> truncatedWords = truncateAfter(words, stopWord);
        for (String word: truncatedWords) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> truncateAfter(ArrayList<String> values, String x) {
        ArrayList<String> truncated = new ArrayList<>();
        for (String word: values) {
            if (word.equals(x)) {
                return truncated;
            }
            truncated.add(word);
        }
        return truncated;
    }
}
```

## Finding elements

```java
public static int findValue(ArrayList<String> values, String x) {
    for (int i = 0; i < values.size(); i++) {
        if (values.get(i).equals(x)) {
            return i;
        }
    }
    return -1;
}
```

## Remove duplicates

```java
public static ArrayList<String> removeDuplicates(ArrayList<String> values) {
    ArrayList<String> noDuplicates = new ArrayList<>();
    for (String s: values) {
        if (! noDuplicates.contains(s)) { // alternatively: if (findValue(noDuplicates, s) >= 0) { ... }            
            noDuplicates.add(s);
        }
    }
    return noDuplicates;
}
```

## Common values (intersection)

This checks for duplicate while also checking if each value of `values1` is present also in `values2`:

```java
public static ArrayList<String> commonValues(ArrayList<String> values1, ArrayList<String> values2) {
    ArrayList<String> common = new ArrayList<>();
    for (String s: values1) {
        if (values2.contains(s) && !common.contains(s)) {
            common.add(s);
        }
    }
    return common;
}
```

Alternatively, we can reuse `removeDuplicates`:

```java
public static ArrayList<String> commonValues(ArrayList<String> values1, ArrayList<String> values2) {
    ArrayList<String> common = new ArrayList<>();
    for (String s: values1) {
        if (values2.contains(s)) {
            common.add(s);
        }
    }
    return removeDuplicates(common);
}
```

## Union

```java
public static ArrayList<String> union(ArrayList<String> values1, ArrayList<String> values2) {
    ArrayList<String> values = new ArrayList<>();
    values.addAll(values1);
    values.addAll(values2);
    return removeDuplicates(values);
}
```

## Word count

```java
import java.util.ArrayList;
import java.util.Scanner;

class WordCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to input?");
        int n = scanner.nextInt();

        System.out.println("Input " + n + " words:");
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            words.add(scanner.next());
        }

        System.out.println("Word count:");

        ArrayList<String> wordsNoDuplicates = removeDuplicates(words);
        for (String word: wordsNoDuplicates) {
            int c = count(words, word);
            System.out.println(word + ": " + c);
        }
    }

    public static int count(ArrayList<String> values, String x) {
        int counter = 0;
        for (String s: values) {
            if (s.equals(x)) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> values) {
        ArrayList<String> noDuplicates = new ArrayList<>();
        for(String s: values) {
            if (! noDuplicates.contains(s)) {
                noDuplicates.add(s);
            }
        }
        return noDuplicates;
    }
}
```
