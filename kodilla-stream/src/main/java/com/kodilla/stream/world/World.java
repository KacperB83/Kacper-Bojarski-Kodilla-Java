package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private final Set<String> continents = new HashSet<>();

    public void addContinent(Country country, Continent continent) {
        List<Country> countries = continent.getCountiesList();
        for (Country c: countries) {
            continents.add(c.getContinentOfCountry());
        }
    }
    public Set<String> showContinents() {
        System.out.println("This is only example of 3 continents:\n"+continents+"\n");
        return continents;
    }
    public BigDecimal getPeopleQuantity() {
        //List<Country> people = continent.getCountiesList().stream()
        /*        .flatMap())
        BigDecimal quantity = ;
        for(Country p: people)
            quantity = quantity.add(BigDecimal.valueOf(p.getNumberOfPeople()));*/
        return null;
    }
}
