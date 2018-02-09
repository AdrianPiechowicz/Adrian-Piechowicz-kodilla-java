package com.kodilla.good.patterns.airport;

import java.util.LinkedList;
import java.util.List;

public class FlightSearcher {

    List<Flight> database = new LinkedList<>();

    public FlightSearcher(List<Flight> database) {
        this.database = database;
    }

    public void searchFlightsFrom (String from) {
        System.out.println("Searching for flights by departure airport: "+from+".");
        database.stream()
                .filter(flight->flight.from.equals(from))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }

    public void searchFlightsTo (String to) {
        System.out.println("Searching for flights by arrival airport: "+to+".");
        database.stream()
                .filter(flight->flight.to.equals(to))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }
    public void searchFlightsBy (String from, String to, String by) {
        System.out.println("Searching for flights that travels from "+from+" by "+by+" to "+to+" airport.");
        database.stream()
                .filter(flight->flight.flightBy.doFlyBy==true)
                .filter(flight->flight.getFlightBy().getWhere().equals(by) && flight.to.equals(to) && flight.from.equals(from))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }

}
