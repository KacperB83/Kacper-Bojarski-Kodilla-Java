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
            return true;
        }
        if (flightMap.get(arrivalAirport) != null) {
            Iterator<Map.Entry<Airport, List<Airport>>> it = flightMap.entrySet().iterator();
            for (Map.Entry<Airport, List<Airport>> entry : flightMap.entrySet()) {
                if(it.hasNext() && it.next().equals(entry.getValue())) {
                    System.out.println(entry.getKey() + " to " + entry.getValue());
                } else {
                    System.out.println(entry.getKey() + " to " + entry.getValue());
                }
            /*Map.Entry<Airport, List<Airport>> previous = null;
            for (Map.Entry<Airport, List<Airport>> entry : flightMap.entrySet()) {
                if (previous != null && !previous.equals(arrivalAirport)) {
                    String p = String.valueOf(previous.getValue());
                    Airport e = entry.getKey();
                    System.out.println(p + " to " + e);
                }
                previous = entry;*/

                /*Iterator<Map.Entry<Airport, List<Airport>>> it = flightMap.entrySet().iterator();
                while (it.hasNext()*//* && entry.getValue().equals(it.next())*//*) {
                    Airport key = entry.getKey();
                    Airport value = (Airport) entry.getValue();
                    System.out.println(key + " to " + value);*/
                }
        }
        return true;
        //return flightMap.get(departureAirport).contains(arrivalAirport);
    }

}
