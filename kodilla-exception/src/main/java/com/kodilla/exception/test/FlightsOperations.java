package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsOperations {
    public String findFlight(Flight flight, Map map) throws RouteNotFoundException{
        if ((flight.getDepartureAirport() == null || flight.getArrivalAirport() == null)
            || (map.containsKey(flight.getDepartureAirport()))==false || map.containsKey(flight.getArrivalAirport())==false)
        {
            throw new RouteNotFoundException("No departure or arrival airport was found");
        }
        if ((map.get(flight.getArrivalAirport()).equals(false))||(map.get(flight.getDepartureAirport()).equals(false))){


                throw new RouteNotFoundException("Departure or arrival airport is not accesible");
            }

        return "The airport of arrival is "+flight.getArrivalAirport()+", departured from "+flight.getDepartureAirport();
    }

    public static void main(String[] args){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("WAW", true);
        airports.put("KTW", true);
        airports.put("RDM", false);
        airports.put("KLM", true);

        Flight flight001 = new Flight("WAW"," ");
        FlightsOperations flightsOperations = new FlightsOperations();
        try {
            System.out.println(flightsOperations.findFlight(flight001,airports));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        } finally {
            System.out.println("Flight was tested!");
        }

        Flight flight002 = new Flight ("WAW", "RDM");
        try {
            System.out.println(flightsOperations.findFlight(flight002,airports));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        } finally {
            System.out.println("Flight was tested!");
        }

        Flight flight003 = new Flight ("KTW", "KLM");
        try {
            System.out.println(flightsOperations.findFlight(flight003,airports));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        } finally {
            System.out.println("Flight was tested!");
        }

    }
}
