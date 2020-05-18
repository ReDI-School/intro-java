package org.redischool;

public class UbahnLineStop {

    private String stopId;
    private String lineName;
    private String stopName;
    private int stopSequence;
    private int arrivalTimeInSecs;
    private int secondsTillPrev;
    private int secondsTillNext;

    UbahnLineStop(RouteStopData rsd) {
        stopId = rsd.getStopId().trim();
        lineName = rsd.getRouteName().trim();
        stopName = rsd.getStopName().trim();
        stopSequence = rsd.getStopSequence();
        String[] arrTimes = rsd.getArrival().split(":");
        arrivalTimeInSecs = Integer.parseInt(arrTimes[0]) * 360 + Integer.parseInt(arrTimes[1]) * 60 + Integer.parseInt(arrTimes[2]);
    }

    void update(UbahnLineStop _prev, UbahnLineStop _next) {
        if(_prev == null || !_prev.getLineName().equals(lineName)) {
            secondsTillPrev = -1;
        } else {
            secondsTillPrev = arrivalTimeInSecs - _prev.arrivalTimeInSecs;
        }

        if(_next == null || !_next.getLineName().equals(lineName)) {
            secondsTillNext = -1;
        } else {
            secondsTillNext = _next.arrivalTimeInSecs - arrivalTimeInSecs;
        }
    }

    public String getStopId() {
        return stopId;
    }

    public String getLineName() {
        return lineName;
    }

    public String getStopName() {
        return stopName;
    }

    public int getStopSequence() {
        return stopSequence;
    }

    public int getSecondsTillPrev() {
        return secondsTillPrev;
    }

    public int getSecondsTillNext() {
        return secondsTillNext;
    }
}
