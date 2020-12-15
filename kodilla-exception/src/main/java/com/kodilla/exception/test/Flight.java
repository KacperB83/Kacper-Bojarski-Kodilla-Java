package com.kodilla.exception.test;

public class Flight {
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Flight(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }
}
