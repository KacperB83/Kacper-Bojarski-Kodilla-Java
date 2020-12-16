package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NoDestinationAirportRunner {
    public static void main(String[] args) throws RouteNotFoundException {

        final HashMap<Airport, List<Airport>> flightMap = new HashMap<>();
        final Airport frankfurt = new Airport("Frankfurt");
        final Airport berlin = new Airport("Berlin");
        final Airport warsaw = new Airport("Warsaw");
        final Airport lisbon = new Airport("Lisbon");
        final Airport newYork = new Airport("New York");

        flightMap.put(warsaw, Arrays.asList(berlin));
        flightMap.put(berlin, Arrays.asList(frankfurt));
        flightMap.put(frankfurt, Arrays.asList(lisbon));
        flightMap.put(lisbon, Arrays.asList(newYork));

        FindFlight fl = new FindFlight(flightMap);

        boolean result = fl.findFlight(new Flight(warsaw , newYork));
        System.out.println(result);

       if (result==false) {
            System.out.println("We have no flight to this destination.");
            throw new RouteNotFoundException();

        }
        System.out.println(result + "\n There is a flight to destination You've chosen.");
    }
}

