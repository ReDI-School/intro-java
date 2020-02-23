---
title: "Exercise: Yahtzee"
nav_order: 2
parent: 11 - Class Scope + this
grand_parent: Lessons
---

# Exercise: Yahtzee

In this exercise we want to implement the classes for a simple parlor game (in this case [Yatzee](https://en.wikipedia.org/wiki/Yahtzee)). We will not implement the whole game, but the first classes for storing the game state.

## First Steps

Following classes shall be created:

### Needed classes
#### Player
Properties:
- Name
- PointSheet

Methods:
- public int getPoints()
- public void print()
- public PointSheet getPointSheet()

#### PointSheet
Properties:
- ArrayList<PointSheetEntry> pointSheetEntries

Method:
- public void addEntry(PointSheetEntry entry)
- public int calculatePoints()
- public void print()

#### PointSheetEntry

Properties:
- String name
- int points

Method:
- public void print()
- public int getPoints()

#### Game
Properties:
- ArrayList<Player> players

Methods:
- public void createPlayer(String name)
- public void printPlayers()
