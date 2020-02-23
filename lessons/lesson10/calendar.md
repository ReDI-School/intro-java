---
title: "Exercise: Calendar"
nav_order: 1
parent: 10 - Implementing Classes
grand_parent: Lessons
---

# Exercise: Calendar

## CalenderEntry

To store events in a calendar you should write a class `CalenderEntry`.

A CalenderEntry is defined by:

A description text:

- `String text`

The month of the year that the event occurs. For the sake of simplicity we define that every month has 28 days:

- `int month`

The day of the month that the event occurs:

- `int day`

A CalenderEntry is constructed with the text, month and day.

- `CalenderEntry(String text, int month, int day)`

A CalenderEntry can be checked if it is valid. It is valid if:
- a month has to be in range 1-12
- a day has to be in range 1-7

- `boolean isValid()`

It can be checked if two CalenderEntries are in the same month:

-`boolean inSameMonth(CalenderEntry entry)`

CalendarEntries can be compared to find out if the calendar entry is before another one.
(Is the CalenderEntry before the one in the parameter)

- `boolean isBefore(CalenderEntry entry)`

It can be calculated how many days are left until the CalenderEntry from a given date (month, day).

- `int daysLeft(int month, int day)`
