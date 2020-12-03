package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final Set<Country> europe = new HashSet<>();
    private final Set<Country> asia = new HashSet<>();
    private final Set<Country> africa = new HashSet<>();

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
        this.continentSplit(listOfCountries);
    }
    public void continentSplit (List<Country> listOfCountries) {
        for(Country c: listOfCountries) {
            if(c.getContinentOfCountry().equals("Europe")) europe.add(c);
            if(c.getContinentOfCountry().equals("Asia")) asia.add(c);
            if(c.getContinentOfCountry().equals("Africa")) africa.add(c);
        }
    }
    public List<Country> getCountiesList() {
        return new ArrayList<>(listOfCountries);
    }
    public Set<Country> getEurope() {
        return europe;
    }

    public Set<Country> getAsia() {
        return asia;
    }

    public Set<Country> getAfrica() {
        return africa;
    }
}
