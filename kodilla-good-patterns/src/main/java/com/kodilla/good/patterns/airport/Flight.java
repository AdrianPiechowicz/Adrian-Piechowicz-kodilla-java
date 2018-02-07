package com.kodilla.good.patterns.airport;

import java.util.Objects;

public class Flight {

    String from;
    String to;
    FlightBy flightBy;

    public Flight(String from, String to, FlightBy flightBy) {
        this.from = from;
        this.to = to;
        this.flightBy = flightBy;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public FlightBy getFlightBy() {
        return flightBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(flightBy, flight.flightBy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to, flightBy);
    }

    public String toString() {
        if (flightBy.doFlyBy) {
            return "Flight from "+from+" by "+flightBy.where+" to "+to+".";
        } else {
            return "Flight from "+from+" to "+to+".";
        }

    }
}
