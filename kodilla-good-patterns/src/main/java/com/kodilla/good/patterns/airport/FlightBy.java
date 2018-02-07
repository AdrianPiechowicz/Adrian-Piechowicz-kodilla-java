package com.kodilla.good.patterns.airport;

public class FlightBy {
    boolean doFlyBy;
    String where;

    public FlightBy(boolean doFlyBy, String where) {
        this.doFlyBy = doFlyBy;
        this.where = where;
    }

    public boolean isDoFlyBy() {
        return doFlyBy;
    }

    public String getWhere() {
        return where;
    }
}
