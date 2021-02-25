package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Map;

public class FindFlights {
    private String nameOfAirport;
    private Map<Airport, List<Airport>> flightMap;

    public FindFlights(String nameOfAirport) {
        this.nameOfAirport = nameOfAirport;

    }

    public void findFlightsFrom(FlightsRepository flightsRepository) {
        flightMap.entrySet().stream()
                .map(e -> "Flights from " + nameOfAirport + ": " + e.getValue().toArray().toString())
                .forEach(System.out::println);
    }

}




