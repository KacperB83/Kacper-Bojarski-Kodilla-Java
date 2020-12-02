package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public final class World {
    private Continent continent;
    private Country country;
    private final Set<String> continents = new HashSet<>();

    public void addContinent(Country country, Continent continent) {

        continents.add(country.getContinentOfCountry());
        /*List<Country> countries = continent.getCountiesList();
        for (Country c: countries) {
            continents.add(c.getContinentOfCountry());*/
            System.out.println(country.getContinentOfCountry());
    }

    /*public Set<String> getContinentsSet() {
        return continent.getCountiesList().stream()
                .map(Country::getContinentOfCountry)
                .collect(Collectors.toSet());
    }*/
    public Set<String> showContinents() {
        System.out.println("This is only example of 3 continents:\n"+continents+"\n");
        return new HashSet<>(continents);
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = new BigDecimal("0");
        List<Country> people = continent.getCountiesList();
            /*.stream()
                .flatMap(Country::getNumberOfPeople)
                .reduce(getPeopleQuantity(), quantity.add(Country::getNumberOfPeople))
                .collect(toList());*/
        for(Country p: people)
            quantity = quantity.add(BigDecimal.valueOf(p.getNumberOfPeople()));
        return quantity;
    }
}
