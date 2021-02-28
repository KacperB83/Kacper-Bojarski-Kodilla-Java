package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightRequest flightRequest = new FlightRequest();
        FindFlights findFlights = flightRequest.askForFlight();

        FlightsRepository flightsRepository = new FlightsRepository();
        findFlights.findFlightsFrom(flightsRepository);

    }
}
