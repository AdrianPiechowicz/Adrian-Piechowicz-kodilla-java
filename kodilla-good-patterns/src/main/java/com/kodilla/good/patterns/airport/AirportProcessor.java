package com.kodilla.good.patterns.airport;

public class AirportProcessor {
    public static void main(String[] args) {

        FlightsDataBase flightsDataBase = new FlightsDataBase();
        flightsDataBase.flightsDataBase.add(new Flight("WAW","KRK", new FlightBy(false,"")));
        flightsDataBase.flightsDataBase.add(new Flight("WRC","KRK", new FlightBy(true,"GDN")));
        flightsDataBase.flightsDataBase.add(new Flight("WRC","WAW", new FlightBy(true,"KRK")));
        flightsDataBase.flightsDataBase.add(new Flight("RDM","GDN", new FlightBy(false,"")));
        flightsDataBase.flightsDataBase.add(new Flight("RDM","POZ", new FlightBy(false,"")));
        flightsDataBase.flightsDataBase.add(new Flight("GDN","KRK", new FlightBy(true,"WAW")));

        FlightSearcher flightSearcher = new FlightSearcher(flightsDataBase.flightsDataBase);
        flightSearcher.searchFlightsFrom("WAW");
        flightSearcher.searchFlightsTo("KRK");
        flightSearcher.searchFlightsBy("RDM","GDN","");
        flightSearcher.searchFlightsBy("GDN","KRK","WAW");
    }
}
