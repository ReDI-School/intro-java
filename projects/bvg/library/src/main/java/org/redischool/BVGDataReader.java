package org.redischool;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BVGDataReader {

    private static ArrayList<UbahnLineStop> ubahnLineStops;

    public ArrayList<UbahnLineStop> getUbahnLineStops() {
        if(ubahnLineStops == null) {
            ubahnLineStops = readFile();
        }

        return ubahnLineStops;
    }

    private ArrayList<UbahnLineStop> readFile() {

        try {
           Gson gson = new Gson();
            Type empMapType = new TypeToken<List<RouteStopData>>() {}.getType();
            List<RouteStopData> data = gson.fromJson(new FileReader("ubahn.json"), empMapType);

            ArrayList<UbahnLineStop> stops = data.stream().map(UbahnLineStop::new).collect(Collectors.toCollection(ArrayList::new));
            stops.sort((us1, us2) -> {
                int line = us1.getLineName().compareTo(us2.getLineName());
                if(line == 0) {
                    return us1.getStopSequence() - us2.getStopSequence();
                } else {
                    return line;
                }
            });

            for(int i = 0; i < stops.size(); i++) {
                UbahnLineStop current = stops.get(i);
                UbahnLineStop prev = i > 0? stops.get(i - 1) : null;
                UbahnLineStop next = i < (stops.size() - 1)? stops.get(i + 1) : null;
                current.update(prev, next);
            }

            return stops;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
