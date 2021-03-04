package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightsRepository {
    private Map<Airport, List<Airport>> flightMap;

    public FlightsRepository(Map<Airport, List<Airport>> flightMap) {
        this.flightMap = flightMap;
    }

    public Map<Airport, List<Airport>> getFlightMap() {
        return flightMap;
    }

}
