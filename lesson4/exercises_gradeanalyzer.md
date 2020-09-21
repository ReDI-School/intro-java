---
title: "Exercises: Grade Analyzer"
nav_order: 7
parent: 4 - Input + Decision
---

# Exercises: Grade Analyzer

Write a program which will prompt the user 
* for the number of grades to be analysed 
* and then to prompt for each grade one at a time (a number from 0 to 100).

The grades are scored as 
* Distinction for 75 or greater 
* Pass for 40 or greater but less than 75 
* Fail otherwise.

You should determine 
* the number of grades in each score band (i.e. number of grades in Distinction, Pass or Fail) 
* the overall average grade 

Display these details as a summary for the user.

Example output:
```text
Enter number of grades:
4

Enter grade 1:
60
Enter grade 2:
88
Enter grade 3:
22
Enter grade 4:
72

Summary:
1 in Distinction
2 in Pass
1 in Fail

Average grade: 60.5
```