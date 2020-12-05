package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private Country country;
    private final String nameOfContinent;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }

    public BigDecimal peopleOnContinent() {

        BigDecimal sum = new BigDecimal(0);
        for (Country c : listOfCountries) {
            sum = sum.add(c.getNumberOfPeople());
        }
        return sum;
    }

    public String getNameOfContinent () {
        return nameOfContinent;
    }

    public List<Country> getListOfCountries () {
        return this.listOfCountries;
    }
}


