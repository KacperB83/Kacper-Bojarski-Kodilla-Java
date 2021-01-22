package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FlightsRepository {
    private HashMap<Airport, List<Airport>> flightMap = new HashMap<>();

    public FlightsRepository() {
        final Airport frankfurt = new Airport("Frankfurt");
        final Airport berlin = new Airport("Berlin");
        final Airport warsaw = new Airport("Warsaw");
        final Airport lisbon = new Airport("Lisbon");
        final Airport newYork = new Airport("New York");

        flightMap.put(warsaw, Arrays.asList(berlin, lisbon, frankfurt));
        flightMap.put(berlin, Arrays.asList(frankfurt, warsaw));
        flightMap.put(frankfurt, Arrays.asList(lisbon, warsaw));
        flightMap.put(lisbon, Arrays.asList(newYork));
    }

    public HashMap<Airport, List<Airport>> getFlightMap() {
        return flightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightsRepository that = (FlightsRepository) o;
        return Objects.equals(flightMap, that.flightMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightMap);
    }
}
