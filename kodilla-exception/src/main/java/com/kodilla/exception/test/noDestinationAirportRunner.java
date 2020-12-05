package com.kodilla.exception.test;

public class noDestinationAirportRunner {
    public static void main(String[] args) {
        Flight toWarsaw = new Flight("Lisbon", "Warsaw");
        Flight toBerlin = new Flight("Warsaw", "Berlin");
        Flight toLondon = new Flight("Warsaw", "London");
        Flight toNY = new Flight("Warsaw", "New York");
        FindFlight findFlight = new FindFlight();
        try {
            findFlight.findFlight(toWarsaw);
            findFlight.findFlight(toBerlin);
            //findFlight.findFlight(toLondon);
            //findFlight.findFlight(toNY);
        } catch (RouteNotFoundException e) {
            System.out.println("Message is not send," +
                    "but my program still running very well!");
        }
        System.out.println("Processing other logic!");
    }
}

