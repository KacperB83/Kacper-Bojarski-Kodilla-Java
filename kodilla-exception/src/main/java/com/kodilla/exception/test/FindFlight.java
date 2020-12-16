package com.kodilla.exception.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindFlight {

    private final Map<Airport, List<Airport>> flightMap;

    public FindFlight(Map<Airport, List<Airport>> flightMap) {
        this.flightMap = flightMap;
    }

    public boolean findFlight(Flight flight) {
        final Airport departureAirport = flight.getDepartureAirport();
        final Airport arrivalAirport = flight.getArrivalAirport();

        if (flightMap.get(departureAirport) == null) {
            return false;
        }
        if (flightMap.get(departureAirport).contains(arrivalAirport)) {
            System.out.println("Flight from " + departureAirport + " to " + arrivalAirport);
            return true;
        }
        else if (flightMap.keySet().contains(arrivalAirport) || flightMap.containsValue(arrivalAirport)) {
            Iterator<Map.Entry<Airport, List<Airport>>> i = flightMap.entrySet().iterator();
            while (i.hasNext()) {
                Airport key = i.next().getKey();
                for (Map.Entry<Airport, List<Airport>> e : flightMap.entrySet()) {

                    if (e.getValue().contains(key) && !e.getValue().contains(arrivalAirport)) {
                        System.out.println("Flight from " + e.getKey() + " to " + e.getValue());

                    } else if (e.getValue().contains(arrivalAirport)) {
                        System.out.println("Flight from " + e.getKey() + " to " + e.getValue());
                    }
                }
            }
        }
        return true;
    }
}

