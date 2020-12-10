package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {


    public Map findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);

        flightMap.put("London", true);
        flightMap.put("Moscow", false);
        flightMap.put("Berlin", true);
        System.out.println(flightMap.size());

        for(Map.Entry<String, Boolean> entry: flightMap.entrySet()) {
            String destAirport = flight.getArrivalAirport();
            if(destAirport.equals(entry.getKey())&& entry.getValue().equals(true)){
                System.out.println("Your flight from " + flight.getDepartureAirport()+" to "+flight.getArrivalAirport()+ " is possible.");
            }
            if(destAirport.equals(entry.getKey())&& entry.getValue().equals(false)){
                System.out.println("We are very sorry. Your flight from "
                        + flight.getDepartureAirport()+" to "+flight.getArrivalAirport()+ " is not possible.");
            }
            if ((!destAirport.equals(entry.getKey())) || destAirport.equals(null)) {
                throw new RouteNotFoundException();
            }
        }
        return flightMap;
    }
}
