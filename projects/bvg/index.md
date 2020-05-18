---
title: BVG Ubahn Schedule
parent: Projects
nav_order: 4
---

## Task
We want to write a route planner for taking the U-Bahn with the BVG.

User can enter a start and an end station:
```bash
Start station?

Schlesisches Tor

End station?

Stadtmitte
```

Program will output the route to take:
* which line to take
* which direction
* where to change if needed (the station name and which stop from start)
* how long the whole trip takes


Output could be like:
```bash
Schlesisches Tor to Stadtmitte

Take U1 in direction Uhlandstrasse

Get off at Hallesches Tor (Stop 4)

Take U6 in direction Alt-Tegel

Get off at Stadtmitte (Stop 2)

Travel time: 13 minutes
```

Implement the project step by step (try to reach a subgoal before going to the next):
* Have only one line => user chooses stations from this line, print out travel information
* Have two lines that do not intersect (i.e. this time your program must find out on which line the stations are)
* Have two lines that intersect (i.e. now you program must take into account that a line can be changed)

Once you reached that, here are some additional things you can implement on top (your choice):
* add more lines with multiple intersections (until you have the whole U-Bahn network)
* currently, the user has to enter exactly the station names => now help him => if the station is unknown, suggest e.g. stations that starts with the first character of what user has entered.
* add that a station may be closed due to maintenance so your program must take that into account (we can decide if a station is closed randomly, ask teacher if you do not know how to do randomness in Java)

## Using BVG Ubahn Data

In order for you to implement this project, you need to have the data for the BVG Ubahn Nets (i.e. what lines, what stops, how long it takes between two stops).

One way would be to visit https://www.bvg.de/de/Fahrinfo and copy all the data from the PDF into your program.

However, this is tedious work and would stop you from actually doing some interesting programming work.

Thus, the repl.it project is already setup so that you can use the BVG data from some prebuilt classes (you just need to import these and use them in your program).

This is how it works:

```java
import java.util.ArrayList;
import org.redischool.BVGDataReader;
import org.redischool.UbahnLineStop;

class Main {
  public static void main(String[] args) throws Exception {
    BVGDataReader reader = new BVGDataReader();

    ArrayList<UbahnLineStop> stops = reader.getUbahnLineStops();
  }
}
```

The usage of the _BVGDataReader_ class is super simple => you crate an instance of it and then call its _getUbahnLineStops()_ method.

This returns a list of _UbahnLineStop_ objects. Each _UbahnLineStop_ represents a stop on a Ubahn line.

Let's look at the data you can get from a _UbahnLineStop_:
* _getLineName()_ returns a String being the name of the Ubahn line, e.g. "U1", "U2"
* _getStopName()_ returns a String being the name of the stop, e.g. "U Kottbusser Tor", "U Alexanderplatz"
* _getStopSequence()_ returns an int being the position of the stop in the line. The first stop has a stopSequence of 0, the second of 1 etc. Note: this defines the order in one direction (i.e. from stop 0 to 1 to 2 to ...) but you can of course drive always in the other direction (e.g. you enter at stop 5 and then go to stop 4 then to stop 3 ...)
* _getSecondsTillPrev()_ returns an int being the seconds it took to travel from the previous stop to this one. Note: previous means here the value from the stop with a lower stopSequence number, i.e. if you are at stop 2, it tells you the travel time from stop 1! If this is the first stop (stopSequence 0) this method returns a -1
* _getSecondsTillNext()_ returns an int being the seconds it takes to travel from this stop to the next one. Note: next means here the value from the stop with a higher stopSequence number, i.e. if you are at stop 2, it tells you the travel time to stop 3! If this is the last stop (highest stopSequence number of line) this method returns a -1

Before implementing the task, play around with this class to deeply understand how you access the data and what the data means. 