package com.kodilla.good.patterns.challenges.flights;

public class FlightRequest {
    public FindFlights askForFlight() {
        String airport = "Warsaw";

        return new FindFlights(airport);

    }

}
