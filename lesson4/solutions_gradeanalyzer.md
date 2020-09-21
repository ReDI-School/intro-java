---
title: "Solution: Grade Analyzer"
nav_order: 8
parent: 4 - Input + Decision
---

# Solution: Grade Analyzer

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  

    System.out.println("Enter number of grades:");
    int nrOfGrades = scanner.nextInt();

    double gradeSum = 0.0;
    int nrOfDistinctions = 0;
    int nrOfPass = 0;
    int nrOfFails = 0;

    for(int i = 1; i < (nrOfGrades + 1); i++) {
      System.out.println("Enter grade " + i + ":");
      int nextGrade = scanner.nextInt();
      if(nextGrade >= 75) {
        nrOfDistinctions++;
      } else if(nextGrade >= 40) {
        nrOfPass++;
      } else {
        nrOfFails++;
      }

      gradeSum = gradeSum + nextGrade;
    }

    System.out.println();
    System.out.println("Summary:");
    System.out.println(nrOfDistinctions + " in Distinction");
    System.out.println(nrOfPass + " in Pass");
    System.out.println(nrOfFails + " in Fail");
    System.out.println();
    System.out.println("Average grade: " + (gradeSum / nrOfGrades));
  }

}
```