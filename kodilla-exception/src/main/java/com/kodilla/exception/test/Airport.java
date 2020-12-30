package com.kodilla.exception.test;

import java.util.Objects;

public class Airport {

    private final String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport {" +
                "name='" + name + '\'' +
                '}';
    }
}
