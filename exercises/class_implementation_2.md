# Class Implementation II

## Event

To store events in a calendar you should write a class `Event`.

A Event is defined by:

A description text:

- `String text`

The month of the year that the event occurs. For the sake of simplicity we define that every month has 28 days (4 weeks):
- `int month`

The week of the month that the event occur:
- `int week`

The day of the week that the event occurs:
- `int day`

A Event is constructed with the text, month, week and day.

- `CalenderEntry(String text, int month, int week, int day)`

A Event can be checked if it is valid. It is valid if:
- a month has to be in range 1-12
- a week has to be in the range 1-4
- a day has to be in range 1-7

- `boolean isValid()`

It can be checked if two CalenderEntries are in the same month:

-`boolean inSameMonth(CalenderEntry entry)`

CalendarEntries can be compared to find out if the calendar entry is before another one. (Is the Event before the one in the parameter)

- `boolean isBefore(CalenderEntry entry)`

It can be calculated how many days are left until the Event from a given date (month, week, day).

- `int daysLeft(int month, int week, int day)`

