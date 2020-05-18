---
title: Covid-19 Statistics
parent: Projects
nav_order: 3
---

## Task

Write an application that uses the embedded dataset to show users some statistics about development of Covid19 Cases.

Some things you could implement (but feel free to implement also own ideas):
* show statistics for a country in a given time frame (e.g. the user could ask to see the statistics for Germany from 1st May till 15th May)
* show statistics aggregated over a different time interval => currently all data is daily, but allow user to e.g. ask for the weekly statistics of a country or its monthly statistics
* show the daily trends for one (or more countries) => currently, the data contains the total count at each day (i.e. added up since first day) => instead show the trend (i.e. how much did a datapoint changed compared to previous day)
* plot a comparison of the data of two countries and how they developed over time

## Using Covid-19 data

The dataset included in this project is from 22nd Jan 2020 until 15th May 2020.

You can access the data in your program in the repl.it project by using some prebuilt classes:

```java
import java.util.ArrayList;
import org.redischool.Covid19DataReader;
import org.redischool.CountryTimeseries;
import org.redischool.Covid19Cases;

class Main {
  public static void main(String[] args) throws Exception {
    Covid19DataReader reader = new Covid19DataReader();

    ArrayList<CountryTimeseries> countries = reader.getCovid19Data();

    CountryTimeseries randCountry = countries.get(42);

    System.out.println(randCountry.getCountry());
    Covid19Cases cases = randCountry.getDailyCases()
    .get(randCountry.getDailyCases().size() - 1);
    System.out.println(cases.getDate());
    System.out.println(cases.getConfirmed());
    System.out.println(cases.getDeaths());
    System.out.println(cases.getRecovered());
  }
}
```

Load the data by creating a _Covid19DataReader_ object and read data with method _getCovid19Data()_.

This will give you a list of _CountryTimeseries_ object. Each such _CountryTimeseries_ object contains daily statistics for a country.  
You can get the country by using the _getCountry()_ method.  
Calling _getDailyCases()_ will give you a list of _Covid19Cases_ objects.

Each _Covid19Cases_ object is data for a day:
* _getDate()_ => returns the date, e.g. 2020-01-22 for 22nd Jan
* _getConfirmed()_ => returns as int the total number of confirmed Covid19 cases till that date
* _getDeaths()_ => returns as int the total number of Covid19 deaths till that date
* _getRecovered()_ => returns as int the total number of recovered Covid19 cases till that date

(Original datasource: https://pomber.github.io/covid19/timeseries.json)
