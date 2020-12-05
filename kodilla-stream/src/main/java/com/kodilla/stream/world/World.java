package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    Continent continent;
    private final List<Continent> continents = new ArrayList<>();

    public Continent addContinent(Continent continent) {
        continents.add(continent);
        return continent;
    }

    public BigDecimal getPeopleQuantity() {
       /* BigDecimal people = BigDecimal.ZERO;
        for (Continent c : continents) {
            people = people.add(c.peopleOnContinent());
        }*/
        BigDecimal people = continents.stream()
                .flatMap(Continent::peopleOnContinent)
                .reduce(BigDecimal.ZERO, (sum, curent) -> sum = sum.add(curent));
        return people;
    }

    public List<Continent> getContinents() {
        return continents;
    }
}

