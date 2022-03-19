---
title: "Solution: Cakes"
nav_order: 7
parent: 3 - Operators
---

# Solution: Cakes

Here's the solution.

```java
public static void main(String[] args) {

   // There are 2 cakes (one chocolate and one with raspberries).
   // Each cake can be cut into 8 pieces.

   int chocolatePieces = 8;
   int raspberryPieces = 8;
   int totalPieces = chocolatePieces + raspberryPieces;
   System.out.println("Total pieces: " + totalPieces);

   // There are 3 people (Mary, Bob and Jo).
   // Mary wants 4 pieces of chocolate cake and 3 pieces of raspberry cake
   // Bob wants 2 pieces of chocolate and 3 pieces of raspberry cake
   // Jo wants 2 pieces of chocolate and 4 pieces of raspberry

   // Is there enough chocolate cake?

   int chocoMary = 4;
   int chocoBob = 2;
   int chocoJo = 2;

   int chocoLeftOver = chocolatePieces - (chocoMary + chocoBob + chocoJo);

   if (chocoLeftOver >= 0) {
       System.out.println("There is enough chocolate cake");
   }

   // is there enough raspberry cake?

   int raspMary = 3;
   int raspBob = 3;
   int raspJo = 4;

   int raspLeftOver = raspberryPieces - (raspMary + raspBob + raspJo);

   if (raspLeftOver < 0) {
       System.out.println("There is not enough raspberry cake");
   }

   // if each of the people would want 2 pieces of the chocolate cake, how much of it would be left over?

   chocoLeftOver = chocolatePieces % 3;

   System.out.println("There are " + chocoLeftOver + " pieces of chocolate cake left over");

   // we get an additional small orange cake (4 pieces) and another hungry Larry.
   // if everyone wants exactly 4 pieces, no matter what flavor, do we have enough?

   int orangePieces = 4;
   totalPieces += orangePieces;

   int cakeLeftOver = totalPieces % 4;

   if (cakeLeftOver >= 0) {
       System.out.println("There is enough cake");
   }

    // if Bob ends up having a stomach ache just thinking about all the pieces and leaves,
    // can we divide the pieces up amongst the other 3 people?

    int numberOfPiecesPerPerson = totalPieces / 3;

    System.out.println("Pieces per person: " + numberOfPiecesPerPerson);

    int piecesLeft = totalPieces % 3;

    System.out.println("Pieces left: " + piecesLeft);
}
```
