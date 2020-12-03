package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private final Set<String> continents = new HashSet<>();

    public World(Continent continent) {

        for (Country c : continent.getCountiesList()) {
            String continentOfCountry = c.getContinentOfCountry();
            continents.add(continentOfCountry);
        }
    }

   public Set<String> showContinents() {
        return getContinents();
    }

    public BigDecimal getPeopleQuantity(Continent continent) {
        BigDecimal quantity = new BigDecimal("0");
        /*List<Country> people = continent.getCountiesList().stream()
                .flatMap(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, curent) -> sum = sum.add(curent));*/
        List<Country> people = continent.getCountiesList();
        for(Country p: people)
            quantity = quantity.add(p.getPeopleQuantity());

        return quantity;
    }

    public Set<String> getContinents() {
        return continents;
    }
}

