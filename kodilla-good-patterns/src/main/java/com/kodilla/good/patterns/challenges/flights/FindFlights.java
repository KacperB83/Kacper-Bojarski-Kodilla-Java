package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlights {

    private final Airport flightFrom;
    private final Airport flightTo;
    private final Airport flightBy;

    private final Map<Airport, List<Airport>> flightMap;

    public FindFlights(Airport flightFrom, Airport flightTo, Airport flightBy, Map<Airport, List<Airport>> flightMap) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightBy = flightBy;
        this.flightMap = flightMap;
    }

    public List<Airport> findFlightsFrom() {

        List<Airport> list = flightMap.get(flightFrom).stream()
                .collect(Collectors.toList());
        return list;
    }

    public List<Airport> findFlightsTo() {

        List<Airport> list = flightMap.entrySet().stream()
                .filter(e -> e.getValue().contains(flightTo))
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        return list;
    }

    public List<Airport> findFlightToBy() {

        List<Airport> resultList = flightMap.entrySet().stream()
                    .filter(e -> e.getValue().contains(flightBy) &&  !(e.getKey().equals(flightTo)))
                    .map(e -> e.getKey())
                    .collect(Collectors.toList());
        return resultList;
    }
}




