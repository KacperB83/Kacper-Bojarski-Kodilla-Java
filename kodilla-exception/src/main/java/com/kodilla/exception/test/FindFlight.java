package com.kodilla.exception.test;

import java.util.List;
import java.util.Map;

public class FindFlight {

    private final Map<Airport, List<Airport>> flightMap;

    public FindFlight(Map<Airport, List<Airport>> flightMap) {
        this.flightMap = flightMap;
    }

    public boolean isFlightPossible (Airport from, Airport to) {
        final List<Airport> flights = this.flightMap.get(from);
        if (flights == null) {
            return false;
        }

        if (flights.contains(to)) {
            System.out.println(" <- " + to);
            System.out.println(" <- " + from);
            return true;
        }

        for (Airport flight : flights) {
            if (isFlightPossible(flight, to)) {
                System.out.println(" <- "+ from);
                return true;
            }
        }
        return false;
    }
}


