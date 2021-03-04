package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class FlightRequest {
    private String airport;
    public FlightRequest (String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightRequest that = (FlightRequest) o;
        return Objects.equals(airport, that.airport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport);
    }

    @Override
    public String toString() {
        return "FlightRequest{" +
                "airport='" + airport + '\'' +
                '}';
    }
}
