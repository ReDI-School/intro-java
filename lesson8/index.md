---
title: 8 - ArrayLists
nav_order: 8
has_children: true
---

# ArrayLists

## Why ArrayLists
Let us imagine we want to build a multiplayer game and we need to store the points of each player. 

How would we realize this task until now?

Probably we would create a variable for each player who wants to play the game:

```java
public class Game {
    public static void main(String[] args) {
        int playerOneScore = 100;
        int playerTwoScore = 250;
        int playerThreeScore = 50;  
        int playerFourScore = 200;
        int playerFiveScore = 150;

        ...    
    }
}

```

## Problems with this approach

What could be the problems with this approach?

- The number of players are static which means we would have to change the code if more or less players want to join the game.
- Adding, changing, reading points or just printing the highscore would make the implementation of this game quite complicated.
- Imagegine the game shall be able to be played by 1000 or even more players. That would be a lot of typing!

For problems like this Java has a feature/datastructure for us. It is called: (Array-)List.

## ArrayList

ArrayLists are used quite a bit in the programmers world.
They are useful if we want to store a collection of variables of the same datatype.

Examples for the use of ArrayLists are:
- A timeline as they exist on different social media plattforms like Facebook
- A list of comments
- the content of a shopping cart as they exist in various webshops
- ...

As you can see there are different usecases for ArrayLists.


- Why using `ArrayList`
- Accessing / Updating of `ArrayList`
- `ArrayList` and loops
- Exercises

Material:
- [Slides](https://drive.google.com/open?id=1gf6QiQvlA1pWD6MYK2de8SMxeQDVXxv72w51gUrUdTQ)
