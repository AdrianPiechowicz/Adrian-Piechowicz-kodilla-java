package com.kodilla.good.patterns.airport;

import java.util.List;

public class FlightSearcher {

    public void searchFlightsFrom (String from, List<Flight> database) {
        System.out.println("Searching for flights by departure airport: "+from+".");
        database.stream()
                .filter(Flight->Flight.from.equals(from))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }

    public void searchFlightsTo (String to, List<Flight> database) {
        System.out.println("Searching for flights by arrival airport: "+to+".");
        database.stream()
                .filter(Flight->Flight.to.equals(to))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }
    public void searchFlightsBy (String by, List<Flight> database) {
        System.out.println("Searching for flights that travels by "+by+" airport.");
        database.stream()
                .filter(Flight->Flight.flightBy.doFlyBy==true)
                .filter(Flight->Flight.getFlightBy().getWhere()==by)
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }

}
