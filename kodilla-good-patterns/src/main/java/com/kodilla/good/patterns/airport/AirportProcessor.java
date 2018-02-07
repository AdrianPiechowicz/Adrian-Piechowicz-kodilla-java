package com.kodilla.good.patterns.airport;

public class AirportProcessor {
    public static void main(String[] args) {

        FlightsDataBase flightsDataBase = new FlightsDataBase();
        flightsDataBase.flightsDataBase.add(new Flight("WAW","KRK", new FlightBy(false,"")));
        flightsDataBase.flightsDataBase.add(new Flight("WRC","KRK", new FlightBy(true,"GDN")));
        flightsDataBase.flightsDataBase.add(new Flight("WRC","WAW", new FlightBy(true,"KRK")));
        flightsDataBase.flightsDataBase.add(new Flight("RDM","GDN", new FlightBy(false,"")));
        flightsDataBase.flightsDataBase.add(new Flight("RDM","POZ", new FlightBy(false,"")));

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.searchFlightsFrom("WAW",flightsDataBase.flightsDataBase);
        flightSearcher.searchFlightsTo("KRK",flightsDataBase.flightsDataBase);
        flightSearcher.searchFlightsBy("RDM",flightsDataBase.flightsDataBase);
        flightSearcher.searchFlightsBy("GDN",flightsDataBase.flightsDataBase);
    }
}
