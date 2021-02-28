package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private Airport from;
    private Airport to;

    public Flight(Airport from, Airport to) {
        this.from = from;
        this.to = to;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }
}
