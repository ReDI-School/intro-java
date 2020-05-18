package org.redischool;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Covid19DataReader {

    private static ArrayList<CountryTimeseries> timeseries;

    public ArrayList<CountryTimeseries> getCovid19Data() {
        if(timeseries == null) {
            timeseries = readFile();
        }

        return timeseries;
    }

    private ArrayList<CountryTimeseries> readFile() {

        try {
           Gson gson = new Gson();
            Type empMapType = new TypeToken<Map<String, List<Covid19Cases>>>() {}.getType();
            Map<String, List<Covid19Cases>> casesPerCountry = gson.fromJson(new FileReader("covid19.json"), empMapType);

            ArrayList<CountryTimeseries> series = new ArrayList<>();
            for(String c : casesPerCountry.keySet()) {
                series.add(new CountryTimeseries(c, new ArrayList<>(casesPerCountry.get(c))));
            }

            return series;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
