package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlights {

    private final Airport flightRequest;
    private final Map<Airport, List<Airport>> flightMap;

    public FindFlights(Airport flightRequest, Map<Airport, List<Airport>> flightMap) {
        this.flightRequest = flightRequest;
        this.flightMap = flightMap;
    }

    public void findFlightsFrom() {
        System.out.println("\nAll flights from "+ flightRequest+ ": \n");

        flightMap.get(flightRequest).stream()
                .map(e -> "Flight from " + flightRequest + " to " + e )
                .forEach(System.out::println);
    }

    public void findFlightsTo() {
        System.out.println("\nAll flights to "+ flightRequest+ ": \n");

        flightMap.entrySet().stream()
                .filter(e -> e.getValue().contains(flightRequest))
                .map(e -> "Flight to " + flightRequest + " from " + e.getKey())
                .forEach(System.out::println);
    }

    public void findFlightToBy() {
        System.out.println("\nFlights to "+ flightRequest+ " with transfer: \n");

       // Map<Airport, List<Airport>> resultMap =

                flightMap.entrySet().stream()
                    .filter(e -> e.getKey() != flightRequest)
                    .map(e -> "Flight to " + flightRequest + " by " + e.getKey() )
                    .forEach(System.out::println);

        // .collect(Collectors.toMap(airport -> airport, ));

        /*resultMap.entrySet().stream()
                .filter(e -> )
                .map(e -> "Flight to " + flightRequest + " by ")*/

    }
}




