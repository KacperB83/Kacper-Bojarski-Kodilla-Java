package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlights {

    private final Airport flightFrom;
    private final Airport flightTo;

    private final Map<Airport, List<Airport>> flightMap;

    public FindFlights(Airport flightFrom, Airport flightTo, Map<Airport, List<Airport>> flightMap) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
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

    public Map<Airport, List<Airport>> findFlightToBy(Airport flightBy) {

            /*List<List<Airport>> resultList = flightMap.entrySet().stream()
                    .filter(e -> e.getValue().contains(flightTo))
                    .map(e -> e.getValue())
                    .filter(e -> e.equals(flightBy))
                    .collect(Collectors.toList());*/
            Map<Airport, List<Airport>> finalMap = new HashMap<>();

        Map<Airport, List<Airport>> resultMap2 = flightMap.entrySet().stream()
                .filter(e -> e.getKey().equals(flightTo) && e.getValue().contains(flightBy))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            finalMap.putAll(resultMap2);

            Map<Airport, List<Airport>> resultMap = flightMap.entrySet().stream()
                    .filter(e -> e.getKey().equals(flightFrom) && e.getValue().contains(flightBy))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            finalMap.putAll(resultMap);

            return finalMap;
        }
}




