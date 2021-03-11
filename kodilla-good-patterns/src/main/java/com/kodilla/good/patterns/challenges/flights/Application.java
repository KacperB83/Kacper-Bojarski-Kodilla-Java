package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Airport, List<Airport>> flightMap = new HashMap<>();
        final Airport frankfurt = new Airport("Frankfurt");
        final Airport berlin = new Airport("Berlin");
        final Airport warsaw = new Airport("Warsaw");
        final Airport lisbon = new Airport("Lisbon");
        final Airport newYork = new Airport("New York");

        flightMap.put(warsaw, Arrays.asList(berlin, lisbon, frankfurt));
        flightMap.put(berlin, Arrays.asList(frankfurt, warsaw));
        flightMap.put(frankfurt, Arrays.asList(lisbon, warsaw));
        flightMap.put(lisbon, Arrays.asList(newYork, frankfurt));
        flightMap.put(newYork, Arrays.asList(lisbon));

        Airport flightFrom = new Airport("Warsaw");
        Airport flightTo = new Airport("New York");
        Airport flightBy = new Airport("Lisbon");

        FindFlights findFlights = new FindFlights(flightFrom, flightTo, flightMap);

        List<Airport> listOfFlightsFrom = findFlights.findFlightsFrom();
        List<Airport> listOfFlightsTo = findFlights.findFlightsTo();
        Map<Airport, List<Airport>> listOfFlightsBy = findFlights.findFlightToBy(flightBy);
        System.out.println();
        System.out.println("Possible flights from " + flightFrom + " to: " +listOfFlightsFrom);
        System.out.println();
        System.out.println("Possible flights to " + flightTo + " from: " +listOfFlightsTo);
        System.out.println();
        System.out.println("Flights from " + flightFrom+ " to "+ flightTo+" by " + flightBy + ": \n" + listOfFlightsBy);




    }
}
