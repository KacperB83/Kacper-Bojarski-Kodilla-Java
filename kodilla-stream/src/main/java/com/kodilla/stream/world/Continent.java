package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent () {
        listOfCountries.add(new Country("Poland", "Europe", 38000000L));
        listOfCountries.add(new Country("France", "Europe", 66990000L));
        listOfCountries.add(new Country("Austria", "Europe", 8859000L));
        listOfCountries.add(new Country("Croatia", "Europe", 4058000L));
        listOfCountries.add(new Country("China", "Asia", 1393000000L));
        listOfCountries.add(new Country("Russia", "Asia", 144500000L));
        listOfCountries.add(new Country("India", "Asia", 1353800000L));
        listOfCountries.add(new Country("Sri Lanka", "Asia", 21670000L));
        listOfCountries.add(new Country("RPA", "Africa", 57780000L));
        listOfCountries.add(new Country("Egypt", "Africa", 98420000L));
        listOfCountries.add(new Country("Nigeria", "Africa", 131850000L));
        listOfCountries.add(new Country("Ethiopia", "Africa", 75000000L));
    }
    public List<Country> getCountiesList() {
        return new ArrayList<>(listOfCountries);
    }

}
