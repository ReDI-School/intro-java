package org.redischool;

import java.util.ArrayList;

public class CountryTimeseries {

    private String country;
    private ArrayList<Covid19Cases> dailyCases;

    public CountryTimeseries(String country, ArrayList<Covid19Cases> dailyCases) {
        this.country = country;
        this.dailyCases = dailyCases;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Covid19Cases> getDailyCases() {
        return dailyCases;
    }
}
