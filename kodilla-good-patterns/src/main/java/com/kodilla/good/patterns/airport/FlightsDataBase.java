package com.kodilla.good.patterns.airport;

import java.util.LinkedList;
import java.util.List;

public class FlightsDataBase {

    List<Flight> flightsDataBase = new LinkedList<>();

    public List<Flight> getFlightsDataBase() {
        return flightsDataBase;
    }

}
